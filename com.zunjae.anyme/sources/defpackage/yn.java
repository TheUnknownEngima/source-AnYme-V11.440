package defpackage;

import java.util.Arrays;

/* renamed from: yn  reason: default package */
public final class yn {
    private final vm a;
    private final byte[] b;

    public yn(vm vmVar, byte[] bArr) {
        if (vmVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.a = vmVar;
            this.b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public byte[] a() {
        return this.b;
    }

    public vm b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn)) {
            return false;
        }
        yn ynVar = (yn) obj;
        if (!this.a.equals(ynVar.a)) {
            return false;
        }
        return Arrays.equals(this.b, ynVar.b);
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
