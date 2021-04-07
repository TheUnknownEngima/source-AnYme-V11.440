package defpackage;

import java.lang.reflect.Type;

/* renamed from: xk0  reason: default package */
public enum xk0 {
    DOUBLE(0, al0.SCALAR, ql0.DOUBLE),
    FLOAT(1, al0.SCALAR, ql0.FLOAT),
    INT64(2, al0.SCALAR, ql0.LONG),
    UINT64(3, al0.SCALAR, ql0.LONG),
    INT32(4, al0.SCALAR, ql0.INT),
    FIXED64(5, al0.SCALAR, ql0.LONG),
    FIXED32(6, al0.SCALAR, ql0.INT),
    BOOL(7, al0.SCALAR, ql0.BOOLEAN),
    STRING(8, al0.SCALAR, ql0.STRING),
    MESSAGE(9, al0.SCALAR, ql0.MESSAGE),
    BYTES(10, al0.SCALAR, ql0.BYTE_STRING),
    UINT32(11, al0.SCALAR, ql0.INT),
    ENUM(12, al0.SCALAR, ql0.ENUM),
    SFIXED32(13, al0.SCALAR, ql0.INT),
    SFIXED64(14, al0.SCALAR, ql0.LONG),
    SINT32(15, al0.SCALAR, ql0.INT),
    SINT64(16, al0.SCALAR, ql0.LONG),
    GROUP(17, al0.SCALAR, ql0.MESSAGE),
    DOUBLE_LIST(18, al0.VECTOR, ql0.DOUBLE),
    FLOAT_LIST(19, al0.VECTOR, ql0.FLOAT),
    INT64_LIST(20, al0.VECTOR, ql0.LONG),
    UINT64_LIST(21, al0.VECTOR, ql0.LONG),
    INT32_LIST(22, al0.VECTOR, ql0.INT),
    FIXED64_LIST(23, al0.VECTOR, ql0.LONG),
    FIXED32_LIST(24, al0.VECTOR, ql0.INT),
    BOOL_LIST(25, al0.VECTOR, ql0.BOOLEAN),
    STRING_LIST(26, al0.VECTOR, ql0.STRING),
    MESSAGE_LIST(27, al0.VECTOR, ql0.MESSAGE),
    BYTES_LIST(28, al0.VECTOR, ql0.BYTE_STRING),
    UINT32_LIST(29, al0.VECTOR, ql0.INT),
    ENUM_LIST(30, al0.VECTOR, ql0.ENUM),
    SFIXED32_LIST(31, al0.VECTOR, ql0.INT),
    SFIXED64_LIST(32, al0.VECTOR, ql0.LONG),
    SINT32_LIST(33, al0.VECTOR, ql0.INT),
    SINT64_LIST(34, al0.VECTOR, ql0.LONG),
    DOUBLE_LIST_PACKED(35, al0.PACKED_VECTOR, ql0.DOUBLE),
    FLOAT_LIST_PACKED(36, al0.PACKED_VECTOR, ql0.FLOAT),
    INT64_LIST_PACKED(37, al0.PACKED_VECTOR, ql0.LONG),
    UINT64_LIST_PACKED(38, al0.PACKED_VECTOR, ql0.LONG),
    INT32_LIST_PACKED(39, al0.PACKED_VECTOR, ql0.INT),
    FIXED64_LIST_PACKED(40, al0.PACKED_VECTOR, ql0.LONG),
    FIXED32_LIST_PACKED(41, al0.PACKED_VECTOR, ql0.INT),
    BOOL_LIST_PACKED(42, al0.PACKED_VECTOR, ql0.BOOLEAN),
    UINT32_LIST_PACKED(43, al0.PACKED_VECTOR, ql0.INT),
    ENUM_LIST_PACKED(44, al0.PACKED_VECTOR, ql0.ENUM),
    SFIXED32_LIST_PACKED(45, al0.PACKED_VECTOR, ql0.INT),
    SFIXED64_LIST_PACKED(46, al0.PACKED_VECTOR, ql0.LONG),
    SINT32_LIST_PACKED(47, al0.PACKED_VECTOR, ql0.INT),
    SINT64_LIST_PACKED(48, al0.PACKED_VECTOR, ql0.LONG),
    GROUP_LIST(49, al0.VECTOR, ql0.MESSAGE),
    MAP(50, al0.MAP, ql0.VOID);
    
    private static final xk0[] zzbqm = null;
    private static final Type[] zzbqn = null;
    private final int id;
    private final ql0 zzbqi;
    private final al0 zzbqj;
    private final Class<?> zzbqk;
    private final boolean zzbql;

    static {
        int i;
        zzbqn = new Type[0];
        xk0[] values = values();
        zzbqm = new xk0[values.length];
        for (xk0 xk0 : values) {
            zzbqm[xk0.id] = xk0;
        }
    }

    private xk0(int i, al0 al0, ql0 ql0) {
        int i2;
        this.id = i;
        this.zzbqj = al0;
        this.zzbqi = ql0;
        int i3 = bl0.a[al0.ordinal()];
        boolean z = true;
        this.zzbqk = (i3 == 1 || i3 == 2) ? ql0.zzke() : null;
        this.zzbql = (al0 != al0.SCALAR || (i2 = bl0.b[ql0.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : z;
    }

    public final int id() {
        return this.id;
    }
}
