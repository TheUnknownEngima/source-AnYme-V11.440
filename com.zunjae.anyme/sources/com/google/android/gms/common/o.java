package com.google.android.gms.common;

import android.os.RemoteException;
import com.google.android.gms.common.internal.n0;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.internal.r;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class o extends n0 {
    private int a;

    protected o(byte[] bArr) {
        r.a(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    protected static byte[] s3(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final w80 b() {
        return x80.s3(r3());
    }

    public final int c() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        w80 b;
        if (obj != null && (obj instanceof o0)) {
            try {
                o0 o0Var = (o0) obj;
                if (o0Var.c() != hashCode() || (b = o0Var.b()) == null) {
                    return false;
                }
                return Arrays.equals(r3(), (byte[]) x80.r3(b));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] r3();
}
