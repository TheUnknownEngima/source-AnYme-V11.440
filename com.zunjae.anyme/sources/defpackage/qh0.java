package defpackage;

/* renamed from: qh0  reason: default package */
public enum qh0 implements fl0 {
    TCP_PROBING_SUMMARY_RESULT_CODE_UNKNOWN(0),
    TCP_PROBING_SUMMARY_RESULT_CODE_SKIPPED_REACHED_ATTEMPT_LIMIT(1),
    TCP_PROBING_SUMMARY_RESULT_CODE_SKIPPED_ALREADY_PUBLISHED(2),
    TCP_PROBING_SUMMARY_RESULT_CODE_SKIPPED_DISABLED(3),
    TCP_PROBING_SUMMARY_RESULT_CODE_SUCCESS(4),
    TCP_PROBING_SUMMARY_RESULT_CODE_FAIL(5);
    
    private static final il0<qh0> zzahh = null;
    private final int value;

    static {
        zzahh = new th0();
    }

    private qh0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return sh0.a;
    }

    public final String toString() {
        return "<" + qh0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
