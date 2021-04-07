package defpackage;

/* renamed from: ko0  reason: default package */
public enum ko0 {
    DOUBLE(ro0.DOUBLE, 1),
    FLOAT(ro0.FLOAT, 5),
    INT64(ro0.LONG, 0),
    UINT64(ro0.LONG, 0),
    INT32(ro0.INT, 0),
    FIXED64(ro0.LONG, 1),
    FIXED32(ro0.INT, 5),
    BOOL(ro0.BOOLEAN, 0),
    STRING(ro0.STRING, 2),
    GROUP(ro0.MESSAGE, 3),
    MESSAGE(ro0.MESSAGE, 2),
    BYTES(ro0.BYTE_STRING, 2),
    UINT32(ro0.INT, 0),
    ENUM(ro0.ENUM, 0),
    SFIXED32(ro0.INT, 5),
    SFIXED64(ro0.LONG, 1),
    SINT32(ro0.INT, 0),
    SINT64(ro0.LONG, 0);
    
    private final ro0 zzbwu;
    private final int zzbwv;

    private ko0(ro0 ro0, int i) {
        this.zzbwu = ro0;
        this.zzbwv = i;
    }

    public final ro0 zzlw() {
        return this.zzbwu;
    }

    public final int zzlx() {
        return this.zzbwv;
    }
}
