package defpackage;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* renamed from: ka2  reason: default package */
public final class ka2 {
    private static final ha2[] e = {ha2.q, ha2.r, ha2.s, ha2.t, ha2.u, ha2.k, ha2.m, ha2.l, ha2.n, ha2.p, ha2.o};
    private static final ha2[] f = {ha2.q, ha2.r, ha2.s, ha2.t, ha2.u, ha2.k, ha2.m, ha2.l, ha2.n, ha2.p, ha2.o, ha2.i, ha2.j, ha2.g, ha2.h, ha2.e, ha2.f, ha2.d};
    public static final ka2 g;
    public static final ka2 h = new a(false).a();
    final boolean a;
    final boolean b;
    @Nullable
    final String[] c;
    @Nullable
    final String[] d;

    /* renamed from: ka2$a */
    public static final class a {
        boolean a;
        @Nullable
        String[] b;
        @Nullable
        String[] c;
        boolean d;

        public a(ka2 ka2) {
            this.a = ka2.a;
            this.b = ka2.c;
            this.c = ka2.d;
            this.d = ka2.b;
        }

        a(boolean z) {
            this.a = z;
        }

        public ka2 a() {
            return new ka2(this);
        }

        public a b(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public a c(ha2... ha2Arr) {
            if (this.a) {
                String[] strArr = new String[ha2Arr.length];
                for (int i = 0; i < ha2Arr.length; i++) {
                    strArr[i] = ha2Arr[i].a;
                }
                b(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a d(boolean z) {
            if (this.a) {
                this.d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a e(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public a f(fb2... fb2Arr) {
            if (this.a) {
                String[] strArr = new String[fb2Arr.length];
                for (int i = 0; i < fb2Arr.length; i++) {
                    strArr[i] = fb2Arr[i].javaName;
                }
                e(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        a aVar = new a(true);
        aVar.c(e);
        aVar.f(fb2.TLS_1_3, fb2.TLS_1_2);
        aVar.d(true);
        aVar.a();
        a aVar2 = new a(true);
        aVar2.c(f);
        aVar2.f(fb2.TLS_1_3, fb2.TLS_1_2, fb2.TLS_1_1, fb2.TLS_1_0);
        aVar2.d(true);
        g = aVar2.a();
        a aVar3 = new a(true);
        aVar3.c(f);
        aVar3.f(fb2.TLS_1_0);
        aVar3.d(true);
        aVar3.a();
    }

    ka2(a aVar) {
        this.a = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.b = aVar.d;
    }

    private ka2 e(SSLSocket sSLSocket, boolean z) {
        String[] z2 = this.c != null ? ib2.z(ha2.b, sSLSocket.getEnabledCipherSuites(), this.c) : sSLSocket.getEnabledCipherSuites();
        String[] z3 = this.d != null ? ib2.z(ib2.o, sSLSocket.getEnabledProtocols(), this.d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int w = ib2.w(ha2.b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && w != -1) {
            z2 = ib2.i(z2, supportedCipherSuites[w]);
        }
        a aVar = new a(this);
        aVar.b(z2);
        aVar.e(z3);
        return aVar.a();
    }

    /* access modifiers changed from: package-private */
    public void a(SSLSocket sSLSocket, boolean z) {
        ka2 e2 = e(sSLSocket, z);
        String[] strArr = e2.d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e2.c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Nullable
    public List<ha2> b() {
        String[] strArr = this.c;
        if (strArr != null) {
            return ha2.b(strArr);
        }
        return null;
    }

    public boolean c(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !ib2.B(ib2.o, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || ib2.B(ha2.b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean d() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ka2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ka2 ka2 = (ka2) obj;
        boolean z = this.a;
        if (z != ka2.a) {
            return false;
        }
        return !z || (Arrays.equals(this.c, ka2.c) && Arrays.equals(this.d, ka2.d) && this.b == ka2.b);
    }

    public boolean f() {
        return this.b;
    }

    @Nullable
    public List<fb2> g() {
        String[] strArr = this.d;
        if (strArr != null) {
            return fb2.forJavaNames(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.a) {
            return ((((527 + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d)) * 31) + (this.b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        String str = "[all enabled]";
        String obj = this.c != null ? b().toString() : str;
        if (this.d != null) {
            str = g().toString();
        }
        return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + str + ", supportsTlsExtensions=" + this.b + ")";
    }
}
