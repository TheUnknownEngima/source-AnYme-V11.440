package kotlinx.coroutines;

import kotlinx.coroutines.internal.u;

public final class d1 {
    /* access modifiers changed from: private */
    public static final u a = new u("REMOVED_TASK");
    /* access modifiers changed from: private */
    public static final u b = new u("CLOSED_EMPTY");

    public static final long c(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
