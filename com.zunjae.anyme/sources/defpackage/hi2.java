package defpackage;

import defpackage.ea2;
import defpackage.vi2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: hi2  reason: default package */
abstract class hi2<ResponseT, ReturnT> extends si2<ReturnT> {
    private final pi2 a;
    private final ea2.a b;
    private final ei2<db2, ResponseT> c;

    /* renamed from: hi2$a */
    static final class a<ResponseT, ReturnT> extends hi2<ResponseT, ReturnT> {
        private final bi2<ResponseT, ReturnT> d;

        a(pi2 pi2, ea2.a aVar, ei2<db2, ResponseT> ei2, bi2<ResponseT, ReturnT> bi2) {
            super(pi2, aVar, ei2);
            this.d = bi2;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [ai2, ai2<ResponseT>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT c(defpackage.ai2<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                bi2<ResponseT, ReturnT> r2 = r0.d
                java.lang.Object r1 = r2.b(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hi2.a.c(ai2, java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: hi2$b */
    static final class b<ResponseT> extends hi2<ResponseT, Object> {
        private final bi2<ResponseT, ai2<ResponseT>> d;
        private final boolean e;

        b(pi2 pi2, ea2.a aVar, ei2<db2, ResponseT> ei2, bi2<ResponseT, ai2<ResponseT>> bi2, boolean z) {
            super(pi2, aVar, ei2);
            this.d = bi2;
            this.e = z;
        }

        /* access modifiers changed from: protected */
        public Object c(ai2<ResponseT> ai2, Object[] objArr) {
            ai2 ai22 = (ai2) this.d.b(ai2);
            k42 k42 = objArr[objArr.length - 1];
            try {
                return this.e ? ji2.b(ai22, k42) : ji2.a(ai22, k42);
            } catch (Exception e2) {
                return ji2.d(e2, k42);
            }
        }
    }

    /* renamed from: hi2$c */
    static final class c<ResponseT> extends hi2<ResponseT, Object> {
        private final bi2<ResponseT, ai2<ResponseT>> d;

        c(pi2 pi2, ea2.a aVar, ei2<db2, ResponseT> ei2, bi2<ResponseT, ai2<ResponseT>> bi2) {
            super(pi2, aVar, ei2);
            this.d = bi2;
        }

        /* access modifiers changed from: protected */
        public Object c(ai2<ResponseT> ai2, Object[] objArr) {
            return ji2.c((ai2) this.d.b(ai2), objArr[objArr.length - 1]);
        }
    }

    hi2(pi2 pi2, ea2.a aVar, ei2<db2, ResponseT> ei2) {
        this.a = pi2;
        this.b = aVar;
        this.c = ei2;
    }

    private static <ResponseT, ReturnT> bi2<ResponseT, ReturnT> d(ri2 ri2, Method method, Type type, Annotation[] annotationArr) {
        try {
            return ri2.a(type, annotationArr);
        } catch (RuntimeException e) {
            throw vi2.o(method, e, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> ei2<db2, ResponseT> e(ri2 ri2, Method method, Type type) {
        try {
            return ri2.i(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw vi2.o(method, e, "Unable to create converter for %s", type);
        }
    }

    static <ResponseT, ReturnT> hi2<ResponseT, ReturnT> f(ri2 ri2, Method method, pi2 pi2) {
        Type type;
        boolean z;
        Class<qi2> cls = qi2.class;
        boolean z2 = pi2.k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type g = vi2.g(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (vi2.i(g) != cls || !(g instanceof ParameterizedType)) {
                z = false;
            } else {
                g = vi2.h(0, (ParameterizedType) g);
                z = true;
            }
            type = new vi2.b((Type) null, ai2.class, g);
            annotations = ui2.a(annotations);
        } else {
            type = method.getGenericReturnType();
            z = false;
        }
        bi2 d = d(ri2, method, type, annotations);
        Type a2 = d.a();
        if (a2 == cb2.class) {
            throw vi2.n(method, "'" + vi2.i(a2).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (a2 == cls) {
            throw vi2.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!pi2.c.equals("HEAD") || Void.class.equals(a2)) {
            ei2 e = e(ri2, method, a2);
            ea2.a aVar = ri2.b;
            return !z2 ? new a(pi2, aVar, e, d) : z ? new c(pi2, aVar, e, d) : new b(pi2, aVar, e, d, false);
        } else {
            throw vi2.n(method, "HEAD method must use Void as response type.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final ReturnT a(Object[] objArr) {
        return c(new ki2(this.a, objArr, this.b, this.c), objArr);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public abstract ReturnT c(ai2<ResponseT> ai2, Object[] objArr);
}
