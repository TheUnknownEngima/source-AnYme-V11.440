package defpackage;

import android.content.Context;
import androidx.work.h;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: v7  reason: default package */
public abstract class v7<T> {
    private static final String e = h.f("ConstraintTracker");
    protected final Context a;
    private final Object b = new Object();
    private final Set<g7<T>> c = new LinkedHashSet();
    private T d;

    v7(Context context) {
        this.a = context.getApplicationContext();
    }

    public void a(g7<T> g7Var) {
        synchronized (this.b) {
            if (this.c.add(g7Var)) {
                if (this.c.size() == 1) {
                    this.d = b();
                    h.c().a(e, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.d}), new Throwable[0]);
                    e();
                }
                g7Var.a(this.d);
            }
        }
    }

    public abstract T b();

    public void c(g7<T> g7Var) {
        synchronized (this.b) {
            if (this.c.remove(g7Var) && this.c.isEmpty()) {
                f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.b
            monitor-enter(r0)
            T r1 = r3.d     // Catch:{ all -> 0x0037 }
            if (r1 == r4) goto L_0x0035
            T r1 = r3.d     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0014
            T r1 = r3.d     // Catch:{ all -> 0x0037 }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0014
            goto L_0x0035
        L_0x0014:
            r3.d = r4     // Catch:{ all -> 0x0037 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0037 }
            java.util.Set<g7<T>> r1 = r3.c     // Catch:{ all -> 0x0037 }
            r4.<init>(r1)     // Catch:{ all -> 0x0037 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0021:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0037 }
            g7 r1 = (defpackage.g7) r1     // Catch:{ all -> 0x0037 }
            T r2 = r3.d     // Catch:{ all -> 0x0037 }
            r1.a(r2)     // Catch:{ all -> 0x0037 }
            goto L_0x0021
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7.d(java.lang.Object):void");
    }

    public abstract void e();

    public abstract void f();
}
