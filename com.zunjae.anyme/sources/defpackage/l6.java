package defpackage;

/* renamed from: l6  reason: default package */
public final class l6 implements p6 {
    private final String e;
    private final Object[] f;

    public l6(String str) {
        this(str, (Object[]) null);
    }

    public l6(String str, Object[] objArr) {
        this.e = str;
        this.f = objArr;
    }

    private static void c(o6 o6Var, int i, Object obj) {
        long j;
        int byteValue;
        double doubleValue;
        if (obj == null) {
            o6Var.bindNull(i);
        } else if (obj instanceof byte[]) {
            o6Var.bindBlob(i, (byte[]) obj);
        } else {
            if (obj instanceof Float) {
                doubleValue = (double) ((Float) obj).floatValue();
            } else if (obj instanceof Double) {
                doubleValue = ((Double) obj).doubleValue();
            } else {
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        byteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        byteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        byteValue = ((Byte) obj).byteValue();
                    } else if (obj instanceof String) {
                        o6Var.bindString(i, (String) obj);
                        return;
                    } else if (obj instanceof Boolean) {
                        j = ((Boolean) obj).booleanValue() ? 1 : 0;
                    } else {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte," + " string");
                    }
                    j = (long) byteValue;
                }
                o6Var.bindLong(i, j);
                return;
            }
            o6Var.bindDouble(i, doubleValue);
        }
    }

    public static void d(o6 o6Var, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                c(o6Var, i, obj);
            }
        }
    }

    public String a() {
        return this.e;
    }

    public void b(o6 o6Var) {
        d(o6Var, this.f);
    }
}
