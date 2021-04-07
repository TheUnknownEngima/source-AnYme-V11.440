package defpackage;

import defpackage.ge1;
import java.util.Arrays;

/* renamed from: pd1  reason: default package */
final class pd1 extends ge1.c.b {
    private final String a;
    private final byte[] b;

    /* renamed from: pd1$b */
    static final class b extends ge1.c.b.a {
        private String a;
        private byte[] b;

        b() {
        }

        public ge1.c.b a() {
            String str = "";
            if (this.a == null) {
                str = str + " filename";
            }
            if (this.b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new pd1(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.c.b.a b(byte[] bArr) {
            if (bArr != null) {
                this.b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        public ge1.c.b.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    private pd1(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public byte[] b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ge1.c.b)) {
            return false;
        }
        ge1.c.b bVar = (ge1.c.b) obj;
        if (this.a.equals(bVar.c())) {
            if (Arrays.equals(this.b, bVar instanceof pd1 ? ((pd1) bVar).b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
