package defpackage;

import java.lang.reflect.Type;

/* renamed from: my0  reason: default package */
public enum my0 {
    DOUBLE(0, oy0.SCALAR, gz0.DOUBLE),
    FLOAT(1, oy0.SCALAR, gz0.FLOAT),
    INT64(2, oy0.SCALAR, gz0.LONG),
    UINT64(3, oy0.SCALAR, gz0.LONG),
    INT32(4, oy0.SCALAR, gz0.INT),
    FIXED64(5, oy0.SCALAR, gz0.LONG),
    FIXED32(6, oy0.SCALAR, gz0.INT),
    BOOL(7, oy0.SCALAR, gz0.BOOLEAN),
    STRING(8, oy0.SCALAR, gz0.STRING),
    MESSAGE(9, oy0.SCALAR, gz0.MESSAGE),
    BYTES(10, oy0.SCALAR, gz0.BYTE_STRING),
    UINT32(11, oy0.SCALAR, gz0.INT),
    ENUM(12, oy0.SCALAR, gz0.ENUM),
    SFIXED32(13, oy0.SCALAR, gz0.INT),
    SFIXED64(14, oy0.SCALAR, gz0.LONG),
    SINT32(15, oy0.SCALAR, gz0.INT),
    SINT64(16, oy0.SCALAR, gz0.LONG),
    GROUP(17, oy0.SCALAR, gz0.MESSAGE),
    DOUBLE_LIST(18, oy0.VECTOR, gz0.DOUBLE),
    FLOAT_LIST(19, oy0.VECTOR, gz0.FLOAT),
    INT64_LIST(20, oy0.VECTOR, gz0.LONG),
    UINT64_LIST(21, oy0.VECTOR, gz0.LONG),
    INT32_LIST(22, oy0.VECTOR, gz0.INT),
    FIXED64_LIST(23, oy0.VECTOR, gz0.LONG),
    FIXED32_LIST(24, oy0.VECTOR, gz0.INT),
    BOOL_LIST(25, oy0.VECTOR, gz0.BOOLEAN),
    STRING_LIST(26, oy0.VECTOR, gz0.STRING),
    MESSAGE_LIST(27, oy0.VECTOR, gz0.MESSAGE),
    BYTES_LIST(28, oy0.VECTOR, gz0.BYTE_STRING),
    UINT32_LIST(29, oy0.VECTOR, gz0.INT),
    ENUM_LIST(30, oy0.VECTOR, gz0.ENUM),
    SFIXED32_LIST(31, oy0.VECTOR, gz0.INT),
    SFIXED64_LIST(32, oy0.VECTOR, gz0.LONG),
    SINT32_LIST(33, oy0.VECTOR, gz0.INT),
    SINT64_LIST(34, oy0.VECTOR, gz0.LONG),
    DOUBLE_LIST_PACKED(35, oy0.PACKED_VECTOR, gz0.DOUBLE),
    FLOAT_LIST_PACKED(36, oy0.PACKED_VECTOR, gz0.FLOAT),
    INT64_LIST_PACKED(37, oy0.PACKED_VECTOR, gz0.LONG),
    UINT64_LIST_PACKED(38, oy0.PACKED_VECTOR, gz0.LONG),
    INT32_LIST_PACKED(39, oy0.PACKED_VECTOR, gz0.INT),
    FIXED64_LIST_PACKED(40, oy0.PACKED_VECTOR, gz0.LONG),
    FIXED32_LIST_PACKED(41, oy0.PACKED_VECTOR, gz0.INT),
    BOOL_LIST_PACKED(42, oy0.PACKED_VECTOR, gz0.BOOLEAN),
    UINT32_LIST_PACKED(43, oy0.PACKED_VECTOR, gz0.INT),
    ENUM_LIST_PACKED(44, oy0.PACKED_VECTOR, gz0.ENUM),
    SFIXED32_LIST_PACKED(45, oy0.PACKED_VECTOR, gz0.INT),
    SFIXED64_LIST_PACKED(46, oy0.PACKED_VECTOR, gz0.LONG),
    SINT32_LIST_PACKED(47, oy0.PACKED_VECTOR, gz0.INT),
    SINT64_LIST_PACKED(48, oy0.PACKED_VECTOR, gz0.LONG),
    GROUP_LIST(49, oy0.VECTOR, gz0.MESSAGE),
    MAP(50, oy0.MAP, gz0.VOID);
    
    private static final my0[] zzbe = null;
    private static final Type[] zzbf = null;
    private final gz0 zzaz;
    private final int zzba;
    private final oy0 zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    static {
        int i;
        zzbf = new Type[0];
        my0[] values = values();
        zzbe = new my0[values.length];
        for (my0 my0 : values) {
            zzbe[my0.zzba] = my0;
        }
    }

    private my0(int i, oy0 oy0, gz0 gz0) {
        int i2;
        this.zzba = i;
        this.zzbb = oy0;
        this.zzaz = gz0;
        int i3 = py0.a[oy0.ordinal()];
        boolean z = true;
        this.zzbc = (i3 == 1 || i3 == 2) ? gz0.zza() : null;
        this.zzbd = (oy0 != oy0.SCALAR || (i2 = py0.b[gz0.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : z;
    }

    public final int zza() {
        return this.zzba;
    }
}
