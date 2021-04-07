package kotlinx.coroutines.internal;

import kotlinx.coroutines.i;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.z1;

final class o extends z1 implements o0 {
    private final Throwable e;
    private final String f;

    public o(Throwable th, String str) {
        this.e = th;
        this.f = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Throwable th, String str, int i, r62 r62) {
        this(th, (i & 2) != 0 ? null : str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 != null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void Y() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.e
            if (r0 == 0) goto L_0x0037
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f
            if (r1 == 0) goto L_0x0026
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            java.lang.String r1 = ""
        L_0x0028:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.e
            r1.<init>(r0, r2)
            throw r1
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android'"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.o.Y():java.lang.Void");
    }

    public /* bridge */ /* synthetic */ void N(n42 n42, Runnable runnable) {
        V(n42, runnable);
        throw null;
    }

    public boolean Q(n42 n42) {
        v62.f(n42, "context");
        Y();
        throw null;
    }

    public z1 U() {
        return this;
    }

    public Void V(n42 n42, Runnable runnable) {
        v62.f(n42, "context");
        v62.f(runnable, "block");
        Y();
        throw null;
    }

    public Void Z(long j, i<? super u22> iVar) {
        v62.f(iVar, "continuation");
        Y();
        throw null;
    }

    public /* bridge */ /* synthetic */ void k(long j, i iVar) {
        Z(j, iVar);
        throw null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Main[missing");
        if (this.e != null) {
            str = ", cause=" + this.e;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
