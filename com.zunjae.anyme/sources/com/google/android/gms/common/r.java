package com.google.android.gms.common;

import java.util.Arrays;

final class r extends o {
    private final byte[] b;

    r(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.b = bArr;
    }

    /* access modifiers changed from: package-private */
    public final byte[] r3() {
        return this.b;
    }
}
