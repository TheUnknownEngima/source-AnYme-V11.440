package defpackage;

import java.io.Serializable;

/* renamed from: t42  reason: default package */
public abstract class t42 implements k42<Object>, x42, Serializable {
    private final k42<Object> e;

    public t42(k42<Object> k42) {
        this.e = k42;
    }

    public k42<u22> a(Object obj, k42<?> k42) {
        v62.e(k42, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public k42<u22> b(k42<?> k42) {
        v62.e(k42, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public x42 c() {
        k42<Object> k42 = this.e;
        if (!(k42 instanceof x42)) {
            k42 = null;
        }
        return (x42) k42;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [k42<java.lang.Object>, k42, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r3
        L_0x0001:
            defpackage.a52.b(r0)
            k42<java.lang.Object> r1 = r0.e
            defpackage.v62.c(r1)
            java.lang.Object r4 = r0.k(r4)     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = defpackage.s42.d()     // Catch:{ all -> 0x001a }
            if (r4 != r2) goto L_0x0014
            return
        L_0x0014:
            m22$a r2 = defpackage.m22.e     // Catch:{ all -> 0x001a }
            defpackage.m22.a(r4)     // Catch:{ all -> 0x001a }
            goto L_0x0024
        L_0x001a:
            r4 = move-exception
            m22$a r2 = defpackage.m22.e
            java.lang.Object r4 = defpackage.n22.a(r4)
            defpackage.m22.a(r4)
        L_0x0024:
            r0.n()
            boolean r0 = r1 instanceof defpackage.t42
            if (r0 == 0) goto L_0x002f
            r0 = r1
            t42 r0 = (defpackage.t42) r0
            goto L_0x0001
        L_0x002f:
            r1.d(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t42.d(java.lang.Object):void");
    }

    public StackTraceElement g() {
        return z42.d(this);
    }

    public final k42<Object> h() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public abstract Object k(Object obj);

    /* access modifiers changed from: protected */
    public void n() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object g = g();
        if (g == null) {
            g = getClass().getName();
        }
        sb.append(g);
        return sb.toString();
    }
}
