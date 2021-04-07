package defpackage;

import defpackage.bi2;
import defpackage.ea2;
import defpackage.ei2;
import defpackage.zh2;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* renamed from: ri2  reason: default package */
public final class ri2 {
    private final Map<Method, si2<?>> a = new ConcurrentHashMap();
    final ea2.a b;
    final ta2 c;
    final List<ei2.a> d;
    final List<bi2.a> e;
    final boolean f;

    /* renamed from: ri2$a */
    class a implements InvocationHandler {
        private final ni2 a = ni2.f();
        private final Object[] b = new Object[0];
        final /* synthetic */ Class c;

        a(Class cls) {
            this.c = cls;
        }

        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.a.h(method)) {
                return this.a.g(method, this.c, obj, objArr);
            }
            si2<?> d2 = ri2.this.d(method);
            if (objArr == null) {
                objArr = this.b;
            }
            return d2.a(objArr);
        }
    }

    /* renamed from: ri2$b */
    public static final class b {
        private final ni2 a;
        @Nullable
        private ea2.a b;
        @Nullable
        private ta2 c;
        private final List<ei2.a> d;
        private final List<bi2.a> e;
        @Nullable
        private Executor f;
        private boolean g;

        public b() {
            this(ni2.f());
        }

        b(ni2 ni2) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = ni2;
        }

        public b a(ei2.a aVar) {
            List<ei2.a> list = this.d;
            vi2.b(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(String str) {
            vi2.b(str, "baseUrl == null");
            c(ta2.l(str));
            return this;
        }

        public b c(ta2 ta2) {
            vi2.b(ta2, "baseUrl == null");
            List<String> s = ta2.s();
            if ("".equals(s.get(s.size() - 1))) {
                this.c = ta2;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + ta2);
        }

        public ri2 d() {
            if (this.c != null) {
                ea2.a aVar = this.b;
                if (aVar == null) {
                    aVar = new xa2();
                }
                ea2.a aVar2 = aVar;
                Executor executor = this.f;
                if (executor == null) {
                    executor = this.a.b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.e);
                arrayList.addAll(this.a.a(executor2));
                ArrayList arrayList2 = new ArrayList(this.d.size() + 1 + this.a.d());
                arrayList2.add(new zh2());
                arrayList2.addAll(this.d);
                arrayList2.addAll(this.a.c());
                return new ri2(aVar2, this.c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public b e(ea2.a aVar) {
            vi2.b(aVar, "factory == null");
            this.b = aVar;
            return this;
        }

        public b f(xa2 xa2) {
            vi2.b(xa2, "client == null");
            e(xa2);
            return this;
        }
    }

    ri2(ea2.a aVar, ta2 ta2, List<ei2.a> list, List<bi2.a> list2, @Nullable Executor executor, boolean z) {
        this.b = aVar;
        this.c = ta2;
        this.d = list;
        this.e = list2;
        this.f = z;
    }

    private void c(Class<?> cls) {
        ni2 f2 = ni2.f();
        for (Method method : cls.getDeclaredMethods()) {
            if (!f2.h(method) && !Modifier.isStatic(method.getModifiers())) {
                d(method);
            }
        }
    }

    public bi2<?, ?> a(Type type, Annotation[] annotationArr) {
        return e((bi2.a) null, type, annotationArr);
    }

    public <T> T b(Class<T> cls) {
        vi2.v(cls);
        if (this.f) {
            c(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* access modifiers changed from: package-private */
    public si2<?> d(Method method) {
        si2<?> si2;
        si2<?> si22 = this.a.get(method);
        if (si22 != null) {
            return si22;
        }
        synchronized (this.a) {
            si2 = this.a.get(method);
            if (si2 == null) {
                si2 = si2.b(this, method);
                this.a.put(method, si2);
            }
        }
        return si2;
    }

    public bi2<?, ?> e(@Nullable bi2.a aVar, Type type, Annotation[] annotationArr) {
        vi2.b(type, "returnType == null");
        vi2.b(annotationArr, "annotations == null");
        int indexOf = this.e.indexOf(aVar) + 1;
        int size = this.e.size();
        for (int i = indexOf; i < size; i++) {
            bi2<?, ?> a2 = this.e.get(i).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.e.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> ei2<T, bb2> f(@Nullable ei2.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        vi2.b(type, "type == null");
        vi2.b(annotationArr, "parameterAnnotations == null");
        vi2.b(annotationArr2, "methodAnnotations == null");
        int indexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            ei2<?, bb2> c2 = this.d.get(i).c(type, annotationArr, annotationArr2, this);
            if (c2 != null) {
                return c2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> ei2<db2, T> g(@Nullable ei2.a aVar, Type type, Annotation[] annotationArr) {
        vi2.b(type, "type == null");
        vi2.b(annotationArr, "annotations == null");
        int indexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            ei2<db2, ?> d2 = this.d.get(i).d(type, annotationArr, this);
            if (d2 != null) {
                return d2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> ei2<T, bb2> h(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return f((ei2.a) null, type, annotationArr, annotationArr2);
    }

    public <T> ei2<db2, T> i(Type type, Annotation[] annotationArr) {
        return g((ei2.a) null, type, annotationArr);
    }

    public <T> ei2<T, String> j(Type type, Annotation[] annotationArr) {
        vi2.b(type, "type == null");
        vi2.b(annotationArr, "annotations == null");
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            ei2<?, String> e2 = this.d.get(i).e(type, annotationArr, this);
            if (e2 != null) {
                return e2;
            }
        }
        return zh2.d.a;
    }
}
