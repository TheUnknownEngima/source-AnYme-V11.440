package defpackage;

import defpackage.sy0;
import defpackage.sy0.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: sy0  reason: default package */
public abstract class sy0<MessageType extends sy0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends cx0<MessageType, BuilderType> {
    private static Map<Object, sy0<?, ?>> zzd = new ConcurrentHashMap();
    protected p11 zzb = p11.a();
    private int zzc = -1;

    /* renamed from: sy0$a */
    public static class a<T extends sy0<T, ?>> extends gx0<T> {
        public a(T t) {
        }
    }

    /* renamed from: sy0$b */
    public static abstract class b<MessageType extends sy0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends ex0<MessageType, BuilderType> {
        private final MessageType e;
        protected MessageType f;
        protected boolean g = false;

        protected b(MessageType messagetype) {
            this.e = messagetype;
            this.f = (sy0) messagetype.q(e.d, (Object) null, (Object) null);
        }

        private static void r(MessageType messagetype, MessageType messagetype2) {
            q01.a().c(messagetype).h(messagetype, messagetype2);
        }

        private final BuilderType s(byte[] bArr, int i, int i2, fy0 fy0) {
            if (this.g) {
                t();
                this.g = false;
            }
            try {
                q01.a().c(this.f).f(this.f, bArr, 0, i2, new kx0(fy0));
                return this;
            } catch (ez0 e2) {
                throw e2;
            } catch (IndexOutOfBoundsException unused) {
                throw ez0.a();
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            }
        }

        public /* synthetic */ Object clone() {
            b bVar = (b) this.e.q(e.e, (Object) null, (Object) null);
            bVar.q((sy0) m());
            return bVar;
        }

        public final boolean g() {
            return sy0.u(this.f, false);
        }

        public final /* synthetic */ f01 j() {
            return this.e;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ ex0 n(cx0 cx0) {
            q((sy0) cx0);
            return this;
        }

        public final /* synthetic */ ex0 o(byte[] bArr, int i, int i2) {
            s(bArr, 0, i2, fy0.a());
            return this;
        }

        public final /* synthetic */ ex0 p(byte[] bArr, int i, int i2, fy0 fy0) {
            s(bArr, 0, i2, fy0);
            return this;
        }

        public final BuilderType q(MessageType messagetype) {
            if (this.g) {
                t();
                this.g = false;
            }
            r(this.f, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        public void t() {
            MessageType messagetype = (sy0) this.f.q(e.d, (Object) null, (Object) null);
            r(messagetype, this.f);
            this.f = messagetype;
        }

        /* renamed from: u */
        public MessageType m() {
            if (this.g) {
                return this.f;
            }
            MessageType messagetype = this.f;
            q01.a().c(messagetype).c(messagetype);
            this.g = true;
            return this.f;
        }

        /* renamed from: v */
        public final MessageType k() {
            MessageType messagetype = (sy0) m();
            if (messagetype.g()) {
                return messagetype;
            }
            throw new n11(messagetype);
        }
    }

    /* renamed from: sy0$c */
    static final class c implements ny0<c> {
        public final e01 R(e01 e01, f01 f01) {
            throw new NoSuchMethodError();
        }

        public final k01 X(k01 k01, k01 k012) {
            throw new NoSuchMethodError();
        }

        public final e21 b() {
            throw new NoSuchMethodError();
        }

        public final h21 c() {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final boolean d() {
            throw new NoSuchMethodError();
        }

        public final boolean g() {
            throw new NoSuchMethodError();
        }

        public final int zza() {
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: sy0$d */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends sy0<MessageType, BuilderType> implements h01 {
        protected ly0<c> zzc = ly0.c();

        /* access modifiers changed from: package-private */
        public final ly0<c> A() {
            if (this.zzc.o()) {
                this.zzc = (ly0) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: sy0$e */
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

    /* renamed from: sy0$f */
    public static class f<ContainingType extends f01, Type> extends gy0<ContainingType, Type> {
    }

    static <T extends sy0<?, ?>> T n(Class<T> cls) {
        T t = (sy0) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (sy0) zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (sy0) ((sy0) s11.c(cls)).q(e.f, (Object) null, (Object) null);
            if (t != null) {
                zzd.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <E> bz0<E> o(bz0<E> bz0) {
        int size = bz0.size();
        return bz0.f(size == 0 ? 10 : size << 1);
    }

    protected static cz0 p(cz0 cz0) {
        int size = cz0.size();
        return cz0.I(size == 0 ? 10 : size << 1);
    }

    protected static Object r(f01 f01, String str, Object[] objArr) {
        return new s01(f01, str, objArr);
    }

    static Object s(Method method, Object obj, Object... objArr) {
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

    protected static <T extends sy0<?, ?>> void t(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static final <T extends sy0<T, ?>> boolean u(T t, boolean z) {
        byte byteValue = ((Byte) t.q(e.a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b2 = q01.a().c(t).b(t);
        if (z) {
            t.q(e.b, b2 ? t : null, (Object) null);
        }
        return b2;
    }

    protected static zy0 x() {
        return vy0.d();
    }

    protected static cz0 y() {
        return sz0.d();
    }

    protected static <E> bz0<E> z() {
        return t01.g();
    }

    public final /* synthetic */ e01 c() {
        b bVar = (b) q(e.e, (Object) null, (Object) null);
        bVar.q(this);
        return bVar;
    }

    public final int d() {
        if (this.zzc == -1) {
            this.zzc = q01.a().c(this).d(this);
        }
        return this.zzc;
    }

    public final void e(cy0 cy0) {
        q01.a().c(this).g(this, ey0.O(cy0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return q01.a().c(this).e(this, (sy0) obj);
        }
        return false;
    }

    public final /* synthetic */ e01 f() {
        return (b) q(e.e, (Object) null, (Object) null);
    }

    public final boolean g() {
        return u(this, true);
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int a2 = q01.a().c(this).a(this);
        this.zza = a2;
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return this.zzc;
    }

    public final /* synthetic */ f01 j() {
        return (sy0) q(e.f, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final void l(int i) {
        this.zzc = i;
    }

    /* access modifiers changed from: protected */
    public abstract Object q(int i, Object obj, Object obj2);

    public String toString() {
        return g01.a(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends sy0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType v() {
        return (b) q(e.e, (Object) null, (Object) null);
    }

    public final BuilderType w() {
        BuilderType buildertype = (b) q(e.e, (Object) null, (Object) null);
        buildertype.q(this);
        return buildertype;
    }
}
