package defpackage;

/* renamed from: kc2  reason: default package */
public enum kc2 {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public final int httpCode;

    private kc2(int i) {
        this.httpCode = i;
    }

    public static kc2 fromHttp2(int i) {
        for (kc2 kc2 : values()) {
            if (kc2.httpCode == i) {
                return kc2;
            }
        }
        return null;
    }
}
