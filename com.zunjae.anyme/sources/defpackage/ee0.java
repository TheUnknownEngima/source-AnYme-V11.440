package defpackage;

/* renamed from: ee0  reason: default package */
public enum ee0 implements fl0 {
    CONSUME_CHUNK_RESULT_UNKNOWN(0),
    CONSUME_CHUNK_RESULT_SUCCESS(1),
    CONSUME_CHUNK_RESULT_FAIL_STRING_PAYLOAD_NOT_ALLOWED(3),
    CONSUME_CHUNK_RESULT_FAIL_NO_PAYLOAD(4),
    CONSUME_CHUNK_RESULT_FAIL_MISMATCHING_CONTINUATION_PAYLOAD_TYPE(5);
    
    private static final il0<ee0> zzahh = null;
    private final int value;

    static {
        zzahh = new he0();
    }

    private ee0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return ge0.a;
    }

    public final String toString() {
        return "<" + ee0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
