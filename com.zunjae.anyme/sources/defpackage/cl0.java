package defpackage;

import defpackage.cl0;
import defpackage.cl0.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: cl0  reason: default package */
public abstract class cl0<MessageType extends cl0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends sj0<MessageType, BuilderType> {
    private static Map<Object, cl0<?, ?>> zzbqz = new ConcurrentHashMap();
    protected yn0 zzbqx = yn0.h();
    private int zzbqy = -1;

    /* renamed from: cl0$a */
    public static class a<T extends cl0<T, ?>> extends wj0<T> {
        public a(T t) {
        }
    }

    /* renamed from: cl0$b */
    public static abstract class b<MessageType extends cl0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends uj0<MessageType, BuilderType> {
        private final MessageType e;
        protected MessageType f;
        protected boolean g = false;

        protected b(MessageType messagetype) {
            this.e = messagetype;
            this.f = (cl0) messagetype.l(e.d, (Object) null, (Object) null);
        }

        private static void n(MessageType messagetype, MessageType messagetype2) {
            cn0.b().c(messagetype).e(messagetype, messagetype2);
        }

        public final boolean b() {
            return cl0.p(this.f, false);
        }

        public /* synthetic */ Object clone() {
            b bVar = (b) this.e.l(e.e, (Object) null, (Object) null);
            bVar.o((cl0) F());
            return bVar;
        }

        public final /* synthetic */ pm0 f() {
            return this.e;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ uj0 j(sj0 sj0) {
            o((cl0) sj0);
            return this;
        }

        public final BuilderType o(MessageType messagetype) {
            if (this.g) {
                p();
                this.g = false;
            }
            n(this.f, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        public void p() {
            MessageType messagetype = (cl0) this.f.l(e.d, (Object) null, (Object) null);
            n(messagetype, this.f);
            this.f = messagetype;
        }

        /* renamed from: q */
        public MessageType F() {
            if (this.g) {
                return this.f;
            }
            MessageType messagetype = this.f;
            cn0.b().c(messagetype).g(messagetype);
            this.g = true;
            return this.f;
        }

        /* renamed from: r */
        public final MessageType N() {
            MessageType messagetype = (cl0) F();
            if (messagetype.b()) {
                return messagetype;
            }
            throw new wn0(messagetype);
        }
    }

    /* renamed from: cl0$c */
    static final class c implements yk0<c> {
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final boolean i0() {
            throw new NoSuchMethodError();
        }

        public final ko0 n() {
            throw new NoSuchMethodError();
        }

        public final vm0 o(vm0 vm0, vm0 vm02) {
            throw new NoSuchMethodError();
        }

        public final boolean q0() {
            throw new NoSuchMethodError();
        }

        public final om0 r0(om0 om0, pm0 pm0) {
            throw new NoSuchMethodError();
        }

        public final ro0 y() {
            throw new NoSuchMethodError();
        }

        public final int zzgj() {
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: cl0$d */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends cl0<MessageType, BuilderType> implements rm0 {
        protected wk0<c> zzbre = wk0.r();
    }

    /* 'enum' modifier removed */
    /* renamed from: cl0$e */
    public static final class e {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        private static final /* synthetic */ int[] h = {1, 2, 3, 4, 5, 6, 7};
        public static final int i = 1;
        public static final int j = 2;
        public static final int k = 1;
        public static final int l = 2;

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    static <T extends cl0<?, ?>> T k(Class<T> cls) {
        T t = (cl0) zzbqz.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (cl0) zzbqz.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (cl0) ((cl0) bo0.r(cls)).l(e.f, (Object) null, (Object) null);
            if (t != null) {
                zzbqz.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static Object m(pm0 pm0, String str, Object[] objArr) {
        return new en0(pm0, str, objArr);
    }

    static Object n(Method method, Object obj, Object... objArr) {
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

    protected static <T extends cl0<?, ?>> void o(Class<T> cls, T t) {
        zzbqz.put(cls, t);
    }

    protected static final <T extends cl0<T, ?>> boolean p(T t, boolean z) {
        byte byteValue = ((Byte) t.l(e.a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d2 = cn0.b().c(t).d(t);
        if (z) {
            t.l(e.b, d2 ? t : null, (Object) null);
        }
        return d2;
    }

    protected static kl0 r() {
        return el0.h();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ml0, dm0] */
    protected static ml0 s() {
        return dm0.h();
    }

    protected static <E> ll0<E> t() {
        return an0.g();
    }

    public final boolean b() {
        return p(this, true);
    }

    public final /* synthetic */ om0 c() {
        b bVar = (b) l(e.e, (Object) null, (Object) null);
        bVar.o(this);
        return bVar;
    }

    public final void d(nk0 nk0) {
        cn0.b().c(this).f(this, qk0.e(nk0));
    }

    public final int e() {
        if (this.zzbqy == -1) {
            this.zzbqy = cn0.b().c(this).h(this);
        }
        return this.zzbqy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return cn0.b().c(this).b(this, (cl0) obj);
        }
        return false;
    }

    public final /* synthetic */ pm0 f() {
        return (cl0) l(e.f, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final void h(int i) {
        this.zzbqy = i;
    }

    public int hashCode() {
        int i = this.zzbmy;
        if (i != 0) {
            return i;
        }
        int c2 = cn0.b().c(this).c(this);
        this.zzbmy = c2;
        return c2;
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return this.zzbqy;
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends cl0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType j(MessageType messagetype) {
        BuilderType q = q();
        q.o(messagetype);
        return q;
    }

    /* access modifiers changed from: protected */
    public abstract Object l(int i, Object obj, Object obj2);

    /* access modifiers changed from: protected */
    public final <MessageType extends cl0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType q() {
        return (b) l(e.e, (Object) null, (Object) null);
    }

    public String toString() {
        return qm0.a(this, super.toString());
    }
}
