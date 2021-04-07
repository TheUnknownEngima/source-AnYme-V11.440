package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: bo0  reason: default package */
final class bo0 {
    private static final Logger a = Logger.getLogger(bo0.class.getName());
    private static final Unsafe b = A();
    private static final Class<?> c = yj0.c();
    private static final boolean d = v(Long.TYPE);
    private static final boolean e = v(Integer.TYPE);
    private static final d f;
    private static final boolean g = C();
    private static final boolean h = B();
    private static final long i = ((long) s(byte[].class));
    static final boolean j = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: bo0$a */
    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        public final void a(Object obj, long j, double d) {
            d(obj, j, Double.doubleToLongBits(d));
        }

        public final void b(Object obj, long j, float f) {
            c(obj, j, Float.floatToIntBits(f));
        }

        public final void e(Object obj, long j, boolean z) {
            if (bo0.j) {
                bo0.l(obj, j, z);
            } else {
                bo0.n(obj, j, z);
            }
        }

        public final void f(Object obj, long j, byte b) {
            if (bo0.j) {
                bo0.b(obj, j, b);
            } else {
                bo0.k(obj, j, b);
            }
        }

        public final boolean i(Object obj, long j) {
            return bo0.j ? bo0.J(obj, j) : bo0.K(obj, j);
        }

        public final float j(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        public final double k(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        public final byte l(Object obj, long j) {
            return bo0.j ? bo0.H(obj, j) : bo0.I(obj, j);
        }
    }

    /* renamed from: bo0$b */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public final void a(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        public final void b(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        public final void e(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        public final void f(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        public final boolean i(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        public final float j(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        public final double k(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        public final byte l(Object obj, long j) {
            return this.a.getByte(obj, j);
        }
    }

    /* renamed from: bo0$c */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public final void a(Object obj, long j, double d) {
            d(obj, j, Double.doubleToLongBits(d));
        }

        public final void b(Object obj, long j, float f) {
            c(obj, j, Float.floatToIntBits(f));
        }

        public final void e(Object obj, long j, boolean z) {
            if (bo0.j) {
                bo0.l(obj, j, z);
            } else {
                bo0.n(obj, j, z);
            }
        }

        public final void f(Object obj, long j, byte b) {
            if (bo0.j) {
                bo0.b(obj, j, b);
            } else {
                bo0.k(obj, j, b);
            }
        }

        public final boolean i(Object obj, long j) {
            return bo0.j ? bo0.J(obj, j) : bo0.K(obj, j);
        }

        public final float j(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        public final double k(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        public final byte l(Object obj, long j) {
            return bo0.j ? bo0.H(obj, j) : bo0.I(obj, j);
        }
    }

    /* renamed from: bo0$d */
    static abstract class d {
        Unsafe a;

        d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract void a(Object obj, long j, double d);

        public abstract void b(Object obj, long j, float f);

        public final void c(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void d(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public abstract void e(Object obj, long j, boolean z);

        public abstract void f(Object obj, long j, byte b);

        public final int g(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long h(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public abstract boolean i(Object obj, long j);

        public abstract float j(Object obj, long j);

        public abstract double k(Object obj, long j);

        public abstract byte l(Object obj, long j);
    }

    static {
        d dVar;
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        d dVar2 = null;
        if (b != null) {
            if (!yj0.b()) {
                dVar2 = new b(b);
            } else if (d) {
                dVar2 = new c(b);
            } else if (e) {
                dVar2 = new a(b);
            }
        }
        f = dVar2;
        s(cls6);
        t(cls6);
        s(cls5);
        t(cls5);
        s(cls4);
        t(cls4);
        s(cls3);
        t(cls3);
        s(cls2);
        t(cls2);
        s(cls);
        t(cls);
        Field D = D();
        if (!(D == null || (dVar = f) == null)) {
            dVar.a.objectFieldOffset(D);
        }
    }

    private bo0() {
    }

    static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new eo0());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean B() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls2.getMethod("getInt", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putInt", new Class[]{cls, Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putLong", new Class[]{cls, Long.TYPE, Long.TYPE});
            cls2.getMethod("getObject", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putObject", new Class[]{cls, Long.TYPE, cls});
            if (yj0.b()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putByte", new Class[]{cls, Long.TYPE, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putBoolean", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putFloat", new Class[]{cls, Long.TYPE, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putDouble", new Class[]{cls, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean C() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            if (D() == null) {
                return false;
            }
            if (yj0.b()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{Long.TYPE});
            cls2.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{Long.TYPE});
            cls2.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{Long.TYPE});
            cls2.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls2.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls2.getMethod("copyMemory", new Class[]{cls, Long.TYPE, cls, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static Field D() {
        Field j2;
        if (yj0.b() && (j2 = j(Buffer.class, "effectiveDirectAddress")) != null) {
            return j2;
        }
        Field j3 = j(Buffer.class, "address");
        if (j3 == null || j3.getType() != Long.TYPE) {
            return null;
        }
        return j3;
    }

    static float E(Object obj, long j2) {
        return f.j(obj, j2);
    }

    static double F(Object obj, long j2) {
        return f.k(obj, j2);
    }

    static Object G(Object obj, long j2) {
        return f.a.getObject(obj, j2);
    }

    /* access modifiers changed from: private */
    public static byte H(Object obj, long j2) {
        return (byte) (u(obj, -4 & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte I(Object obj, long j2) {
        return (byte) (u(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean J(Object obj, long j2) {
        return H(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean K(Object obj, long j2) {
        return I(obj, j2) != 0;
    }

    static byte a(byte[] bArr, long j2) {
        return f.l(bArr, i + j2);
    }

    /* access modifiers changed from: private */
    public static void b(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int u = u(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        e(obj, j3, ((255 & b2) << i2) | (u & (~(255 << i2))));
    }

    static void c(Object obj, long j2, double d2) {
        f.a(obj, j2, d2);
    }

    static void d(Object obj, long j2, float f2) {
        f.b(obj, j2, f2);
    }

    static void e(Object obj, long j2, int i2) {
        f.c(obj, j2, i2);
    }

    static void f(Object obj, long j2, long j3) {
        f.d(obj, j2, j3);
    }

    static void g(Object obj, long j2, Object obj2) {
        f.a.putObject(obj, j2, obj2);
    }

    static void h(Object obj, long j2, boolean z) {
        f.e(obj, j2, z);
    }

    static void i(byte[] bArr, long j2, byte b2) {
        f.f(bArr, i + j2, b2);
    }

    private static Field j(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void k(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        e(obj, j3, ((255 & b2) << i2) | (u(obj, j3) & (~(255 << i2))));
    }

    /* access modifiers changed from: private */
    public static void l(Object obj, long j2, boolean z) {
        b(obj, j2, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void n(Object obj, long j2, boolean z) {
        k(obj, j2, z ? (byte) 1 : 0);
    }

    static <T> T r(Class<T> cls) {
        try {
            return b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static int s(Class<?> cls) {
        if (h) {
            return f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int t(Class<?> cls) {
        if (h) {
            return f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    static int u(Object obj, long j2) {
        return f.g(obj, j2);
    }

    private static boolean v(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!yj0.b()) {
            return false;
        }
        try {
            Class<?> cls3 = c;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static long w(Object obj, long j2) {
        return f.h(obj, j2);
    }

    static boolean x(Object obj, long j2) {
        return f.i(obj, j2);
    }

    static boolean y() {
        return h;
    }

    static boolean z() {
        return g;
    }
}
