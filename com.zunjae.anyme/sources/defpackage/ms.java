package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.v;
import defpackage.ks;
import defpackage.ns;
import defpackage.ps;
import defpackage.ts;
import defpackage.us;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@TargetApi(18)
/* renamed from: ms  reason: default package */
public class ms<T extends ts> implements rs<T> {
    private final UUID b;
    private final us.c<T> c;
    private final xs d;
    private final HashMap<String, String> e;
    private final x40<ls> f;
    private final boolean g;
    private final int[] h;
    private final boolean i;
    private final ms<T>.e j;
    private final t k;
    /* access modifiers changed from: private */
    public final List<ks<T>> l;
    private final List<ks<T>> m;
    private int n;
    private us<T> o;
    private ks<T> p;
    private ks<T> q;
    private Looper r;
    private int s;
    private byte[] t;
    volatile ms<T>.c u;

    /* renamed from: ms$b */
    private class b implements us.b<T> {
        private b(ms msVar) {
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: ms$c */
    private class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (ks ksVar : ms.this.l) {
                    if (ksVar.l(bArr)) {
                        ksVar.s(message.what);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: ms$d */
    public static final class d extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private d(java.util.UUID r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                java.lang.String r0 = java.lang.String.valueOf(r3)
                int r0 = r0.length()
                int r0 = r0 + 29
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Media does not support uuid: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ms.d.<init>(java.util.UUID):void");
        }
    }

    /* renamed from: ms$e */
    private class e implements ks.a<T> {
    }

    private void h(Looper looper) {
        Looper looper2 = this.r;
        q40.f(looper2 == null || looper2 == looper);
        this.r = looper;
    }

    private ks<T> i(List<ns.b> list, boolean z) {
        q40.e(this.o);
        UUID uuid = this.b;
        us<T> usVar = this.o;
        ms<T>.e eVar = this.j;
        fs fsVar = new fs(this);
        int i2 = this.s;
        byte[] bArr = this.t;
        HashMap<String, String> hashMap = this.e;
        xs xsVar = this.d;
        Looper looper = this.r;
        q40.e(looper);
        return new ks(uuid, usVar, eVar, fsVar, list, i2, this.i | z, z, bArr, hashMap, xsVar, looper, this.f, this.k);
    }

    private static List<ns.b> j(ns nsVar, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(nsVar.h);
        for (int i2 = 0; i2 < nsVar.h; i2++) {
            ns.b e2 = nsVar.e(i2);
            if ((e2.e(uuid) || (v.c.equals(uuid) && e2.e(v.b))) && (e2.i != null || z)) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    private void m(Looper looper) {
        if (this.u == null) {
            this.u = new c(looper);
        }
    }

    /* access modifiers changed from: private */
    public void n(ks<T> ksVar) {
        this.l.remove(ksVar);
        if (this.p == ksVar) {
            this.p = null;
        }
        if (this.q == ksVar) {
            this.q = null;
        }
        if (this.m.size() > 1 && this.m.get(0) == ksVar) {
            this.m.get(1).w();
        }
        this.m.remove(ksVar);
    }

    public final void a() {
        int i2 = this.n - 1;
        this.n = i2;
        if (i2 == 0) {
            us<T> usVar = this.o;
            q40.e(usVar);
            usVar.a();
            this.o = null;
        }
    }

    public Class<T> b(ns nsVar) {
        if (!e(nsVar)) {
            return null;
        }
        us<T> usVar = this.o;
        q40.e(usVar);
        return usVar.b();
    }

    public ps<T> c(Looper looper, int i2) {
        h(looper);
        us<T> usVar = this.o;
        q40.e(usVar);
        us usVar2 = usVar;
        if ((vs.class.equals(usVar2.b()) && vs.d) || v50.j0(this.h, i2) == -1 || usVar2.b() == null) {
            return null;
        }
        m(looper);
        if (this.p == null) {
            ks<T> i3 = i(Collections.emptyList(), true);
            this.l.add(i3);
            this.p = i3;
        }
        this.p.b();
        return this.p;
    }

    public ps<T> d(Looper looper, ns nsVar) {
        List<ns.b> list;
        h(looper);
        m(looper);
        ks<T> ksVar = null;
        if (this.t == null) {
            list = j(nsVar, this.b, false);
            if (list.isEmpty()) {
                d dVar = new d(this.b);
                this.f.b(new gs(dVar));
                return new ss(new ps.a(dVar));
            }
        } else {
            list = null;
        }
        if (this.g) {
            Iterator<ks<T>> it = this.l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ks<T> next = it.next();
                if (v50.b(next.a, list)) {
                    ksVar = next;
                    break;
                }
            }
        } else {
            ksVar = this.q;
        }
        if (ksVar == null) {
            ksVar = i(list, false);
            if (!this.g) {
                this.q = ksVar;
            }
            this.l.add(ksVar);
        }
        ksVar.b();
        return ksVar;
    }

    public boolean e(ns nsVar) {
        if (this.t != null) {
            return true;
        }
        if (j(nsVar, this.b, true).isEmpty()) {
            if (nsVar.h != 1 || !nsVar.e(0).e(v.b)) {
                return false;
            }
            String valueOf = String.valueOf(this.b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
            sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(valueOf);
            b50.h("DefaultDrmSessionMgr", sb.toString());
        }
        String str = nsVar.g;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return (!"cbc1".equals(str) && !"cbcs".equals(str) && !"cens".equals(str)) || v50.a >= 25;
    }

    public final void g(Handler handler, ls lsVar) {
        this.f.a(handler, lsVar);
    }

    public final void t() {
        int i2 = this.n;
        this.n = i2 + 1;
        if (i2 == 0) {
            q40.f(this.o == null);
            us<T> a2 = this.c.a(this.b);
            this.o = a2;
            a2.i(new b());
        }
    }
}
