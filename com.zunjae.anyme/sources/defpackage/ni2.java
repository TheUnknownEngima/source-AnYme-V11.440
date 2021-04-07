package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import defpackage.bi2;
import defpackage.ei2;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: ni2  reason: default package */
class ni2 {
    private static final ni2 a = e();

    /* renamed from: ni2$a */
    static class a extends ni2 {

        /* renamed from: ni2$a$a  reason: collision with other inner class name */
        static class C0253a implements Executor {
            private final Handler e = new Handler(Looper.getMainLooper());

            C0253a() {
            }

            public void execute(Runnable runnable) {
                this.e.post(runnable);
            }
        }

        a() {
        }

        /* access modifiers changed from: package-private */
        public List<? extends bi2.a> a(@Nullable Executor executor) {
            if (executor != null) {
                fi2 fi2 = new fi2(executor);
                if (Build.VERSION.SDK_INT < 24) {
                    return Collections.singletonList(fi2);
                }
                return Arrays.asList(new bi2.a[]{di2.a, fi2});
            }
            throw new AssertionError();
        }

        public Executor b() {
            return new C0253a();
        }

        /* access modifiers changed from: package-private */
        public List<? extends ei2.a> c() {
            return Build.VERSION.SDK_INT >= 24 ? Collections.singletonList(li2.a) : Collections.emptyList();
        }

        /* access modifiers changed from: package-private */
        public int d() {
            return Build.VERSION.SDK_INT >= 24 ? 1 : 0;
        }

        /* access modifiers changed from: package-private */
        @IgnoreJRERequirement
        public boolean h(Method method) {
            if (Build.VERSION.SDK_INT < 24) {
                return false;
            }
            return method.isDefault();
        }
    }

    @IgnoreJRERequirement
    /* renamed from: ni2$b */
    static class b extends ni2 {
        b() {
        }

        /* access modifiers changed from: package-private */
        public List<? extends bi2.a> a(@Nullable Executor executor) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(di2.a);
            arrayList.add(new fi2(executor));
            return Collections.unmodifiableList(arrayList);
        }

        /* access modifiers changed from: package-private */
        public List<? extends ei2.a> c() {
            return Collections.singletonList(li2.a);
        }

        /* access modifiers changed from: package-private */
        public int d() {
            return 1;
        }

        /* access modifiers changed from: package-private */
        public Object g(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
            Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[]{cls, -1}).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        /* access modifiers changed from: package-private */
        public boolean h(Method method) {
            return method.isDefault();
        }
    }

    ni2() {
    }

    private static ni2 e() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new b();
        } catch (ClassNotFoundException unused2) {
            return new ni2();
        }
    }

    static ni2 f() {
        return a;
    }

    /* access modifiers changed from: package-private */
    public List<? extends bi2.a> a(@Nullable Executor executor) {
        return Collections.singletonList(new fi2(executor));
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public Executor b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public List<? extends ei2.a> c() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public Object g(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public boolean h(Method method) {
        return false;
    }
}
