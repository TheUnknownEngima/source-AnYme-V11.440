package defpackage;

import defpackage.eo;
import java.util.Arrays;

/* renamed from: un  reason: default package */
final class un extends eo {
    private final String a;
    private final byte[] b;
    private final xm c;

    /* renamed from: un$b */
    static final class b extends eo.a {
        private String a;
        private byte[] b;
        private xm c;

        b() {
        }

        public eo a() {
            String str = "";
            if (this.a == null) {
                str = str + " backendName";
            }
            if (this.c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new un(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public eo.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public eo.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        public eo.a d(xm xmVar) {
            if (xmVar != null) {
                this.c = xmVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    private un(String str, byte[] bArr, xm xmVar) {
        this.a = str;
        this.b = bArr;
        this.c = xmVar;
    }

    public String b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    public xm d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eo)) {
            return false;
        }
        eo eoVar = (eo) obj;
        if (this.a.equals(eoVar.b())) {
            return Arrays.equals(this.b, eoVar instanceof un ? ((un) eoVar).b : eoVar.c()) && this.c.equals(eoVar.d());
        }
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
