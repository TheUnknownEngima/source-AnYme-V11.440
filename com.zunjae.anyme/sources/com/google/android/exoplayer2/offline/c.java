package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer2.scheduler.d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public final class c {
    private final Context a;
    private final a b;
    private final d.c c;
    private final CopyOnWriteArraySet<b> d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    private int i;
    private boolean j;
    private List<b> k;
    private d l;

    private static final class a extends Handler {
    }

    public interface b {
        void a(c cVar, boolean z);

        void b(c cVar, boolean z);

        void c(c cVar, com.google.android.exoplayer2.scheduler.c cVar2, int i);
    }

    private void i() {
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().b(this, this.j);
        }
    }

    private void j(d dVar, int i2) {
        com.google.android.exoplayer2.scheduler.c f2 = dVar.f();
        if (this.i != i2) {
            this.i = i2;
            this.e++;
            this.b.obtainMessage(2, i2, 0).sendToTarget();
        }
        boolean r = r();
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().c(this, f2, i2);
        }
        if (r) {
            i();
        }
    }

    private void o(boolean z) {
        if (this.h != z) {
            this.h = z;
            this.e++;
            this.b.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            boolean r = r();
            Iterator<b> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().a(this, z);
            }
            if (r) {
                i();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean r() {
        /*
            r4 = this;
            boolean r0 = r4.h
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0024
            int r0 = r4.i
            if (r0 == 0) goto L_0x0024
            r0 = 0
        L_0x000b:
            java.util.List<com.google.android.exoplayer2.offline.b> r3 = r4.k
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x0024
            java.util.List<com.google.android.exoplayer2.offline.b> r3 = r4.k
            java.lang.Object r3 = r3.get(r0)
            com.google.android.exoplayer2.offline.b r3 = (com.google.android.exoplayer2.offline.b) r3
            int r3 = r3.a
            if (r3 != 0) goto L_0x0021
            r0 = 1
            goto L_0x0025
        L_0x0021:
            int r0 = r0 + 1
            goto L_0x000b
        L_0x0024:
            r0 = 0
        L_0x0025:
            boolean r3 = r4.j
            if (r3 == r0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            r4.j = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.c.r():boolean");
    }

    public void a(e eVar, int i2) {
        this.e++;
        this.b.obtainMessage(6, i2, 0, eVar).sendToTarget();
    }

    public void b(b bVar) {
        this.d.add(bVar);
    }

    public List<b> c() {
        return this.k;
    }

    public boolean d() {
        return this.h;
    }

    public com.google.android.exoplayer2.scheduler.c e() {
        return this.l.f();
    }

    public boolean f() {
        return this.f == 0 && this.e == 0;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.j;
    }

    public void k() {
        o(true);
    }

    public void l() {
        this.e++;
        this.b.obtainMessage(8).sendToTarget();
    }

    public void m(String str) {
        this.e++;
        this.b.obtainMessage(7, str).sendToTarget();
    }

    public void n() {
        o(false);
    }

    public void p(com.google.android.exoplayer2.scheduler.c cVar) {
        if (!cVar.equals(this.l.f())) {
            this.l.j();
            d dVar = new d(this.a, this.c, cVar);
            this.l = dVar;
            j(this.l, dVar.i());
        }
    }

    public void q(String str, int i2) {
        this.e++;
        this.b.obtainMessage(3, i2, 0, str).sendToTarget();
    }
}
