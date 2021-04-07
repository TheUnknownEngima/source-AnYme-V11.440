package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class q extends o {
    private static final WeakReference<byte[]> c = new WeakReference<>((Object) null);
    private WeakReference<byte[]> b = c;

    q(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    public final byte[] r3() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.b.get();
            if (bArr == null) {
                bArr = t3();
                this.b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] t3();
}
