package defpackage;

/* renamed from: e21  reason: default package */
public enum e21 {
    DOUBLE(h21.DOUBLE, 1),
    FLOAT(h21.FLOAT, 5),
    INT64(h21.LONG, 0),
    UINT64(h21.LONG, 0),
    INT32(h21.INT, 0),
    FIXED64(h21.LONG, 1),
    FIXED32(h21.INT, 5),
    BOOL(h21.BOOLEAN, 0),
    GROUP(h21.MESSAGE, 3),
    MESSAGE(h21.MESSAGE, 2),
    BYTES(h21.BYTE_STRING, 2),
    UINT32(h21.INT, 0),
    ENUM(h21.ENUM, 0),
    SFIXED32(h21.INT, 5),
    SFIXED64(h21.LONG, 1),
    SINT32(h21.INT, 0),
    SINT64(h21.LONG, 0);
    
    private final h21 zzs;
    private final int zzt;

    private e21(h21 h21, int i) {
        this.zzs = h21;
        this.zzt = i;
    }

    public final h21 zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
