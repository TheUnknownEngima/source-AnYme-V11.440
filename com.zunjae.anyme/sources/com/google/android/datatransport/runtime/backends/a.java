package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.f;
import java.util.Arrays;

final class a extends f {
    private final Iterable<zn> a;
    private final byte[] b;

    static final class b extends f.a {
        private Iterable<zn> a;
        private byte[] b;

        b() {
        }

        public f a() {
            String str = "";
            if (this.a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.a b(Iterable<zn> iterable) {
            if (iterable != null) {
                this.a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        public f.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    private a(Iterable<zn> iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }

    public Iterable<zn> b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a.equals(fVar.b())) {
            if (Arrays.equals(this.b, fVar instanceof a ? ((a) fVar).b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}
