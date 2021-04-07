package defpackage;

import defpackage.aj1;
import defpackage.ok1;
import defpackage.rj1;
import defpackage.rl1;
import defpackage.vj1;
import defpackage.vj1.a;
import defpackage.wi1;
import defpackage.xj1;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: vj1  reason: default package */
public abstract class vj1<MessageType extends vj1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends wi1<MessageType, BuilderType> {
    private static Map<Object, vj1<?, ?>> h = new ConcurrentHashMap();
    protected ml1 f = ml1.e();
    protected int g = -1;

    /* renamed from: vj1$a */
    public static abstract class a<MessageType extends vj1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends wi1.a<MessageType, BuilderType> {
        private final MessageType e;
        protected MessageType f;
        protected boolean g = false;

        protected a(MessageType messagetype) {
            this.e = messagetype;
            this.f = (vj1) messagetype.q(f.NEW_MUTABLE_INSTANCE);
        }

        private void A(MessageType messagetype, MessageType messagetype2) {
            al1.a().e(messagetype).a(messagetype, messagetype2);
        }

        public final boolean b() {
            return vj1.x(this.f, false);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ wi1.a o(wi1 wi1) {
            x((vj1) wi1);
            return this;
        }

        /* renamed from: r */
        public final MessageType a() {
            MessageType s = j0();
            if (s.b()) {
                return s;
            }
            throw wi1.a.q(s);
        }

        /* renamed from: s */
        public MessageType j0() {
            if (this.g) {
                return this.f;
            }
            this.f.y();
            this.g = true;
            return this.f;
        }

        /* renamed from: t */
        public BuilderType clone() {
            BuilderType z = c().j();
            z.y(j0());
            return z;
        }

        /* access modifiers changed from: protected */
        public final void u() {
            if (this.g) {
                v();
                this.g = false;
            }
        }

        /* access modifiers changed from: protected */
        public void v() {
            MessageType messagetype = (vj1) this.f.q(f.NEW_MUTABLE_INSTANCE);
            A(messagetype, this.f);
            this.f = messagetype;
        }

        /* renamed from: w */
        public MessageType c() {
            return this.e;
        }

        /* access modifiers changed from: protected */
        public BuilderType x(MessageType messagetype) {
            y(messagetype);
            return this;
        }

        public BuilderType y(MessageType messagetype) {
            u();
            A(this.f, messagetype);
            return this;
        }
    }

    /* renamed from: vj1$b */
    protected static class b<T extends vj1<T, ?>> extends xi1<T> {
        private final T a;

        public b(T t) {
            this.a = t;
        }

        /* renamed from: g */
        public T b(fj1 fj1, mj1 mj1) {
            return vj1.D(this.a, fj1, mj1);
        }
    }

    /* renamed from: vj1$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends vj1<MessageType, BuilderType> implements Object<MessageType, BuilderType> {
        protected rj1<d> i = rj1.h();

        /* access modifiers changed from: package-private */
        public rj1<d> H() {
            if (this.i.o()) {
                this.i = this.i.clone();
            }
            return this.i;
        }

        public /* bridge */ /* synthetic */ ok1 c() {
            return vj1.super.c();
        }

        public /* bridge */ /* synthetic */ ok1.a d() {
            return vj1.super.d();
        }

        public /* bridge */ /* synthetic */ ok1.a j() {
            return vj1.super.j();
        }
    }

    /* renamed from: vj1$d */
    static final class d implements rj1.b<d> {
        final xj1.d<?> e;
        final int f;
        final rl1.b g;
        final boolean h;
        final boolean i;

        public ok1.a D(ok1.a aVar, ok1 ok1) {
            return ((a) aVar).y((vj1) ok1);
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.f - dVar.f;
        }

        public xj1.d<?> e() {
            return this.e;
        }

        public boolean isPacked() {
            return this.i;
        }

        public int j() {
            return this.f;
        }

        public rl1.c o0() {
            return this.g.getJavaType();
        }

        public boolean p() {
            return this.h;
        }

        public rl1.b u() {
            return this.g;
        }
    }

    /* renamed from: vj1$e */
    public static class e<ContainingType extends ok1, Type> extends kj1<ContainingType, Type> {
        final ok1 a;
        final d b;

        public rl1.b a() {
            return this.b.u();
        }

        public ok1 b() {
            return this.a;
        }

        public int c() {
            return this.b.j();
        }

        public boolean d() {
            return this.b.h;
        }
    }

    /* renamed from: vj1$f */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static Object A(ok1 ok1, String str, Object[] objArr) {
        return new cl1(ok1, str, objArr);
    }

    protected static <T extends vj1<T, ?>> T B(T t, InputStream inputStream) {
        T D = D(t, fj1.f(inputStream), mj1.b());
        p(D);
        return D;
    }

    protected static <T extends vj1<T, ?>> T C(T t, byte[] bArr) {
        T E = E(t, bArr, 0, bArr.length, mj1.b());
        p(E);
        return E;
    }

    static <T extends vj1<T, ?>> T D(T t, fj1 fj1, mj1 mj1) {
        T t2 = (vj1) t.q(f.NEW_MUTABLE_INSTANCE);
        try {
            el1 e2 = al1.a().e(t2);
            e2.g(t2, gj1.Q(fj1), mj1);
            e2.e(t2);
            return t2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof yj1) {
                throw ((yj1) e3.getCause());
            }
            yj1 yj1 = new yj1(e3.getMessage());
            yj1.i(t2);
            throw yj1;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof yj1) {
                throw ((yj1) e4.getCause());
            }
            throw e4;
        }
    }

    static <T extends vj1<T, ?>> T E(T t, byte[] bArr, int i, int i2, mj1 mj1) {
        T t2 = (vj1) t.q(f.NEW_MUTABLE_INSTANCE);
        try {
            el1 e2 = al1.a().e(t2);
            e2.h(t2, bArr, i, i + i2, new aj1.b(mj1));
            e2.e(t2);
            if (t2.e == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e3) {
            if (e3.getCause() instanceof yj1) {
                throw ((yj1) e3.getCause());
            }
            yj1 yj1 = new yj1(e3.getMessage());
            yj1.i(t2);
            throw yj1;
        } catch (IndexOutOfBoundsException unused) {
            yj1 k = yj1.k();
            k.i(t2);
            throw k;
        }
    }

    protected static <T extends vj1<?, ?>> void F(Class<T> cls, T t) {
        h.put(cls, t);
    }

    private static <T extends vj1<T, ?>> T p(T t) {
        if (t == null || t.b()) {
            return t;
        }
        yj1 a2 = t.l().a();
        a2.i(t);
        throw a2;
    }

    protected static <E> xj1.i<E> t() {
        return bl1.d();
    }

    static <T extends vj1<?, ?>> T u(Class<T> cls) {
        T t = (vj1) h.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (vj1) h.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = ((vj1) pl1.i(cls)).c();
            if (t != null) {
                h.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    static Object w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends vj1<T, ?>> boolean x(T t, boolean z) {
        byte byteValue = ((Byte) t.q(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f2 = al1.a().e(t).f(t);
        if (z) {
            t.r(f.SET_MEMOIZED_IS_INITIALIZED, f2 ? t : null);
        }
        return f2;
    }

    /* renamed from: G */
    public final BuilderType d() {
        BuilderType buildertype = (a) q(f.NEW_BUILDER);
        buildertype.y(this);
        return buildertype;
    }

    public final boolean b() {
        return x(this, true);
    }

    public void e(hj1 hj1) {
        al1.a().e(this).d(this, ij1.P(hj1));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c().getClass().isInstance(obj)) {
            return false;
        }
        return al1.a().e(this).b(this, (vj1) obj);
    }

    public int g() {
        if (this.g == -1) {
            this.g = al1.a().e(this).i(this);
        }
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.g;
    }

    public int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int c2 = al1.a().e(this).c(this);
        this.e = c2;
        return c2;
    }

    /* access modifiers changed from: package-private */
    public void m(int i) {
        this.g = i;
    }

    public final xk1<MessageType> n() {
        return (xk1) q(f.GET_PARSER);
    }

    /* access modifiers changed from: package-private */
    public Object o() {
        return q(f.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: protected */
    public Object q(f fVar) {
        return s(fVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Object r(f fVar, Object obj) {
        return s(fVar, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object s(f fVar, Object obj, Object obj2);

    public String toString() {
        return qk1.e(this, super.toString());
    }

    /* renamed from: v */
    public final MessageType c() {
        return (vj1) q(f.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: protected */
    public void y() {
        al1.a().e(this).e(this);
    }

    /* renamed from: z */
    public final BuilderType j() {
        return (a) q(f.NEW_BUILDER);
    }
}
