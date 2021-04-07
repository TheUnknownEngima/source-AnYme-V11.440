package com.zunjae.anyme.abstracts;

public final /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[d.values().length];
        a = iArr;
        iArr[d.DELETE.ordinal()] = 1;
        a[d.UPDATE.ordinal()] = 2;
        a[d.ADD.ordinal()] = 3;
        int[] iArr2 = new int[d.values().length];
        b = iArr2;
        iArr2[d.UPDATE.ordinal()] = 1;
        b[d.DELETE.ordinal()] = 2;
        b[d.ADD.ordinal()] = 3;
    }
}
