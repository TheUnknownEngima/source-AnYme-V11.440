package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: pl1  reason: default package */
final class pl1 {
    private static final Logger a = Logger.getLogger(pl1.class.getName());
    private static final Unsafe b = B();
    private static final Class<?> c = zi1.b();
    private static final boolean d = m(Long.TYPE);
    private static final boolean e = m(Integer.TYPE);
    private static final e f = z();
    private static final boolean g = R();
    private static final boolean h = Q();
    static final long i = ((long) j(byte[].class));
    static final boolean j = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: pl1$a */
    static class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        /* renamed from: a */
        public Unsafe run() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: pl1$b */
    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j) {
            return pl1.j ? pl1.q(obj, j) : pl1.r(obj, j);
        }

        public byte d(Object obj, long j) {
            return pl1.j ? pl1.t(obj, j) : pl1.u(obj, j);
        }

        public double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        public float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        public void k(Object obj, long j, boolean z) {
            if (pl1.j) {
                pl1.G(obj, j, z);
            } else {
                pl1.H(obj, j, z);
            }
        }

        public void l(Object obj, long j, byte b) {
            if (pl1.j) {
                pl1.J(obj, j, b);
            } else {
                pl1.K(obj, j, b);
            }
        }

        public void m(Object obj, long j, double d) {
            p(obj, j, Double.doubleToLongBits(d));
        }

        public void n(Object obj, long j, float f) {
            o(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: pl1$c */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j) {
            return pl1.j ? pl1.q(obj, j) : pl1.r(obj, j);
        }

        public byte d(Object obj, long j) {
            return pl1.j ? pl1.t(obj, j) : pl1.u(obj, j);
        }

        public double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        public float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        public void k(Object obj, long j, boolean z) {
            if (pl1.j) {
                pl1.G(obj, j, z);
            } else {
                pl1.H(obj, j, z);
            }
        }

        public void l(Object obj, long j, byte b) {
            if (pl1.j) {
                pl1.J(obj, j, b);
            } else {
                pl1.K(obj, j, b);
            }
        }

        public void m(Object obj, long j, double d) {
            p(obj, j, Double.doubleToLongBits(d));
        }

        public void n(Object obj, long j, float f) {
            o(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: pl1$d */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        public byte d(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        public double e(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        public float f(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        public void k(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        public void l(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        public void m(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        public void n(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }
    }

    /* renamed from: pl1$e */
    private static abstract class e {
        Unsafe a;

        e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j);

        public abstract byte d(Object obj, long j);

        public abstract double e(Object obj, long j);

        public abstract float f(Object obj, long j);

        public final int g(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long h(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public final Object i(Object obj, long j) {
            return this.a.getObject(obj, j);
        }

        public final long j(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j, boolean z);

        public abstract void l(Object obj, long j, byte b);

        public abstract void m(Object obj, long j, double d);

        public abstract void n(Object obj, long j, float f);

        public final void o(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void p(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public final void q(Object obj, long j, Object obj2) {
            this.a.putObject(obj, j, obj2);
        }
    }

    static {
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        j(cls6);
        k(cls6);
        j(cls5);
        k(cls5);
        j(cls4);
        k(cls4);
        j(cls3);
        k(cls3);
        j(cls2);
        k(cls2);
        j(cls);
        k(cls);
        o(l());
    }

    private pl1() {
    }

    static Object A(Object obj, long j2) {
        return f.i(obj, j2);
    }

    static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean C() {
        return h;
    }

    static boolean D() {
        return g;
    }

    static long E(Field field) {
        return f.j(field);
    }

    static void F(Object obj, long j2, boolean z) {
        f.k(obj, j2, z);
    }

    /* access modifiers changed from: private */
    public static void G(Object obj, long j2, boolean z) {
        J(obj, j2, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void H(Object obj, long j2, boolean z) {
        K(obj, j2, z ? (byte) 1 : 0);
    }

    static void I(byte[] bArr, long j2, byte b2) {
        f.l(bArr, i + j2, b2);
    }

    /* access modifiers changed from: private */
    public static void J(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int x = x(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        N(obj, j3, ((255 & b2) << i2) | (x & (~(255 << i2))));
    }

    /* access modifiers changed from: private */
    public static void K(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        N(obj, j3, ((255 & b2) << i2) | (x(obj, j3) & (~(255 << i2))));
    }

    static void L(Object obj, long j2, double d2) {
        f.m(obj, j2, d2);
    }

    static void M(Object obj, long j2, float f2) {
        f.n(obj, j2, f2);
    }

    static void N(Object obj, long j2, int i2) {
        f.o(obj, j2, i2);
    }

    static void O(Object obj, long j2, long j3) {
        f.p(obj, j2, j3);
    }

    static void P(Object obj, long j2, Object obj2) {
        f.q(obj, j2, obj2);
    }

    private static boolean Q() {
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
            if (zi1.c()) {
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
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean R() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            if (l() == null) {
                return false;
            }
            if (zi1.c()) {
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
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    static <T> T i(Class<T> cls) {
        try {
            return b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static int j(Class<?> cls) {
        if (h) {
            return f.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (h) {
            return f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field n;
        if (zi1.c() && (n = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return n;
        }
        Field n2 = n(Buffer.class, "address");
        if (n2 == null || n2.getType() != Long.TYPE) {
            return null;
        }
        return n2;
    }

    private static boolean m(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!zi1.c()) {
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

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f) == null) {
            return -1;
        }
        return eVar.j(field);
    }

    static boolean p(Object obj, long j2) {
        return f.c(obj, j2);
    }

    /* access modifiers changed from: private */
    public static boolean q(Object obj, long j2) {
        return t(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean r(Object obj, long j2) {
        return u(obj, j2) != 0;
    }

    static byte s(byte[] bArr, long j2) {
        return f.d(bArr, i + j2);
    }

    /* access modifiers changed from: private */
    public static byte t(Object obj, long j2) {
        return (byte) ((x(obj, -4 & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    public static byte u(Object obj, long j2) {
        return (byte) ((x(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    static double v(Object obj, long j2) {
        return f.e(obj, j2);
    }

    static float w(Object obj, long j2) {
        return f.f(obj, j2);
    }

    static int x(Object obj, long j2) {
        return f.g(obj, j2);
    }

    static long y(Object obj, long j2) {
        return f.h(obj, j2);
    }

    private static e z() {
        if (b == null) {
            return null;
        }
        if (!zi1.c()) {
            return new d(b);
        }
        if (d) {
            return new c(b);
        }
        if (e) {
            return new b(b);
        }
        return null;
    }
}
