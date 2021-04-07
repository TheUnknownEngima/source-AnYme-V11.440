package defpackage;

import android.util.SparseArray;

/* renamed from: rn  reason: default package */
public enum rn {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    private static final SparseArray<rn> zzg = null;

    static {
        DEFAULT = new rn("DEFAULT", 0, 0);
        UNMETERED_ONLY = new rn("UNMETERED_ONLY", 1, 1);
        UNMETERED_OR_DAILY = new rn("UNMETERED_OR_DAILY", 2, 2);
        FAST_IF_RADIO_AWAKE = new rn("FAST_IF_RADIO_AWAKE", 3, 3);
        NEVER = new rn("NEVER", 4, 4);
        UNRECOGNIZED = new rn("UNRECOGNIZED", 5, -1);
        SparseArray<rn> sparseArray = new SparseArray<>();
        zzg = sparseArray;
        sparseArray.put(0, DEFAULT);
        zzg.put(1, UNMETERED_ONLY);
        zzg.put(2, UNMETERED_OR_DAILY);
        zzg.put(3, FAST_IF_RADIO_AWAKE);
        zzg.put(4, NEVER);
        zzg.put(-1, UNRECOGNIZED);
    }

    private rn(int i) {
    }
}
