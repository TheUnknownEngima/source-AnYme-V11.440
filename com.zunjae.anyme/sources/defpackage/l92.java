package defpackage;

import defpackage.m92;

/* renamed from: l92  reason: default package */
public final /* synthetic */ class l92 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[m92.b.values().length];
        a = iArr;
        iArr[m92.b.PARKING.ordinal()] = 1;
        a[m92.b.BLOCKING.ordinal()] = 2;
        a[m92.b.CPU_ACQUIRED.ordinal()] = 3;
        a[m92.b.RETIRING.ordinal()] = 4;
        a[m92.b.TERMINATED.ordinal()] = 5;
    }
}
