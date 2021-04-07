package defpackage;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: rl1  reason: default package */
public final class rl1 {
    static final int a = c(1, 3);
    static final int b = c(1, 4);
    static final int c = c(2, 0);
    static final int d = c(3, 2);

    /* renamed from: rl1$b */
    public enum b {
        DOUBLE(c.DOUBLE, 1),
        FLOAT(c.FLOAT, 5),
        INT64(c.LONG, 0),
        UINT64(c.LONG, 0),
        INT32(c.INT, 0),
        FIXED64(c.LONG, 1),
        FIXED32(c.INT, 5),
        BOOL(c.BOOLEAN, 0),
        STRING(c.STRING, 2) {
            public boolean isPackable() {
                return false;
            }
        },
        GROUP(c.MESSAGE, 3) {
            public boolean isPackable() {
                return false;
            }
        },
        MESSAGE(c.MESSAGE, 2) {
            public boolean isPackable() {
                return false;
            }
        },
        BYTES(c.BYTE_STRING, 2) {
            public boolean isPackable() {
                return false;
            }
        },
        UINT32(c.INT, 0),
        ENUM(c.ENUM, 0),
        SFIXED32(c.INT, 5),
        SFIXED64(c.LONG, 1),
        SINT32(c.INT, 0),
        SINT64(c.LONG, 0);
        
        private final c javaType;
        private final int wireType;

        private b(c cVar, int i) {
            this.javaType = cVar;
            this.wireType = i;
        }

        public c getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }
    }

    /* renamed from: rl1$c */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(Utils.FLOAT_EPSILON)),
        DOUBLE(Double.valueOf(Utils.DOUBLE_EPSILON)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ej1.f),
        ENUM((String) null),
        MESSAGE((String) null);
        
        private final Object defaultDefault;

        private c(Object obj) {
            this.defaultDefault = obj;
        }

        /* access modifiers changed from: package-private */
        public Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    public static int a(int i) {
        return i >>> 3;
    }

    public static int b(int i) {
        return i & 7;
    }

    static int c(int i, int i2) {
        return (i << 3) | i2;
    }
}
