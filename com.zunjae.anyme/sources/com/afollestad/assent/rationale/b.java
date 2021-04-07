package com.afollestad.assent.rationale;

import android.app.Activity;
import androidx.lifecycle.h;
import com.afollestad.assent.g;
import com.afollestad.assent.h;
import com.afollestad.assent.i;
import com.afollestad.assent.internal.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public abstract class b {
    static final /* synthetic */ d82[] l;
    private final Map<g, CharSequence> a;
    private final q72 b;
    private final q72 c;
    private final q72 d;
    private final h e;
    private d f;
    /* access modifiers changed from: private */
    public com.afollestad.assent.b g;
    /* access modifiers changed from: private */
    public com.afollestad.assent.b h;
    private Object i;
    private final Activity j;
    private final f62<g[], Integer, b, z52<? super com.afollestad.assent.b, u22>, u22> k;

    static final class a extends w62 implements z52<com.afollestad.assent.b, u22> {
        final /* synthetic */ b f;
        final /* synthetic */ g g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, g gVar) {
            super(1);
            this.f = bVar;
            this.g = gVar;
        }

        public final void a(com.afollestad.assent.b bVar) {
            v62.f(bVar, "it");
            b bVar2 = this.f;
            bVar2.h = com.afollestad.assent.c.a(bVar2.h, bVar);
            this.f.k().remove(this.g);
            this.f.s();
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.assent.b) obj);
            return u22.a;
        }
    }

    /* renamed from: com.afollestad.assent.rationale.b$b  reason: collision with other inner class name */
    static final class C0074b extends w62 implements z52<com.afollestad.assent.b, u22> {
        final /* synthetic */ b f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0074b(b bVar) {
            super(1);
            this.f = bVar;
        }

        public final void a(com.afollestad.assent.b bVar) {
            v62.f(bVar, "it");
            this.f.g = bVar;
            this.f.s();
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.assent.b) obj);
            return u22.a;
        }
    }

    static final class c extends w62 implements z52<h.a, u22> {
        final /* synthetic */ b f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.f = bVar;
        }

        public final void a(h.a aVar) {
            v62.f(aVar, "it");
            this.f.m();
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((h.a) obj);
            return u22.a;
        }
    }

    static final class d extends w62 implements z52<Boolean, u22> {
        final /* synthetic */ b f;
        final /* synthetic */ g g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, g gVar) {
            super(1);
            this.f = bVar;
            this.g = gVar;
        }

        public final void a(boolean z) {
            if (z) {
                this.f.p(this.g);
            } else {
                this.f.q(this.g);
            }
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a(((Boolean) obj).booleanValue());
            return u22.a;
        }
    }

    static {
        Class<b> cls = b.class;
        y62 y62 = new y62(f72.b(cls), "requestCode", "getRequestCode()I");
        f72.e(y62);
        y62 y622 = new y62(f72.b(cls), "callback", "getCallback()Lkotlin/jvm/functions/Function1;");
        f72.e(y622);
        y62 y623 = new y62(f72.b(cls), "remainingRationalePermissions", "getRemainingRationalePermissions()Ljava/util/Set;");
        f72.e(y623);
        l = new d82[]{y62, y622, y623};
    }

    public b(Activity activity, f62<? super g[], ? super Integer, ? super b, ? super z52<? super com.afollestad.assent.b, u22>, u22> f62, d dVar) {
        v62.f(activity, "context");
        v62.f(f62, "requester");
        this.j = activity;
        this.k = f62;
        this.a = new LinkedHashMap();
        this.b = o72.a.a();
        this.c = o72.a.a();
        this.d = o72.a.a();
        i iVar = new i(this.j);
        this.e = iVar;
        this.f = dVar == null ? new c(this.j, iVar) : dVar;
        this.i = this.j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Activity activity, f62 f62, d dVar, int i2, r62 r62) {
        this(activity, f62, (i2 & 4) != 0 ? null : dVar);
    }

    private final void h() {
        e.a(this, "finish()", new Object[0]);
        com.afollestad.assent.b bVar = this.g;
        com.afollestad.assent.b bVar2 = this.h;
        if (bVar != null && bVar2 != null) {
            i().r(com.afollestad.assent.c.a(bVar, bVar2));
        } else if (bVar != null) {
            i().r(bVar);
        } else if (bVar2 != null) {
            i().r(bVar2);
        }
    }

    private final z52<com.afollestad.assent.b, u22> i() {
        return (z52) this.c.b(this, l[1]);
    }

    private final CharSequence j(g gVar) {
        CharSequence charSequence = this.a.get(gVar);
        if (charSequence != null) {
            return charSequence;
        }
        throw new IllegalStateException(("No message provided for " + gVar).toString());
    }

    /* access modifiers changed from: private */
    public final Set<g> k() {
        return (Set) this.d.b(this, l[2]);
    }

    private final int l() {
        return ((Number) this.b.b(this, l[0])).intValue();
    }

    private final void n(g gVar) {
        e.a(this, "Permission %s is permanently denied.", gVar);
        this.h = com.afollestad.assent.c.a(this.h, new com.afollestad.assent.b(v32.b(q22.a(gVar, com.afollestad.assent.e.PERMANENTLY_DENIED))));
        k().remove(gVar);
        s();
    }

    /* access modifiers changed from: private */
    public final void p(g gVar) {
        e.a(this, "Got rationale confirm signal for permission %s", gVar);
        this.k.B(new g[]{gVar}, Integer.valueOf(l()), null, new a(this, gVar));
    }

    /* access modifiers changed from: private */
    public final void q(g gVar) {
        e.a(this, "Got rationale deny signal for permission %s", gVar);
        this.h = com.afollestad.assent.c.a(this.h, new com.afollestad.assent.b(v32.b(q22.a(gVar, com.afollestad.assent.e.DENIED))));
        k().remove(gVar);
        s();
    }

    /* access modifiers changed from: private */
    public final void s() {
        g gVar = (g) n32.A(k());
        if (gVar != null) {
            e.a(this, "Showing rationale for permission %s", gVar);
            com.afollestad.assent.internal.d.a(this.i, new h.a[]{h.a.ON_DESTROY}, new c(this));
            if (this.f.b(gVar)) {
                n(gVar);
            } else {
                w(gVar, j(gVar), new a(new d(this, gVar)));
            }
        } else {
            h();
        }
    }

    private final void t(z52<? super com.afollestad.assent.b, u22> z52) {
        this.c.a(this, l[1], z52);
    }

    private final void u(Set<g> set) {
        this.d.a(this, l[2], set);
    }

    private final void v(int i2) {
        this.b.a(this, l[0], Integer.valueOf(i2));
    }

    public abstract void m();

    public final void o(g gVar, CharSequence charSequence) {
        v62.f(gVar, "permission");
        v62.f(charSequence, "message");
        this.a.put(gVar, charSequence);
    }

    public final void r(g[] gVarArr, int i2, z52<? super com.afollestad.assent.b, u22> z52) {
        g[] gVarArr2 = gVarArr;
        z52<? super com.afollestad.assent.b, u22> z522 = z52;
        v62.f(gVarArr2, "permissions");
        v62.f(z522, "finalCallback");
        v(i2);
        t(z522);
        ArrayList arrayList = new ArrayList();
        int length = gVarArr2.length;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= length) {
                break;
            }
            g gVar = gVarArr2[i3];
            if (!this.f.a(gVar) && !this.f.b(gVar)) {
                z = false;
            }
            if (z) {
                arrayList.add(gVar);
            }
            i3++;
        }
        u(n32.e0(arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (g gVar2 : gVarArr2) {
            if (!this.f.a(gVar2)) {
                arrayList2.add(gVar2);
            }
        }
        e.a(this, "Found %d permissions that DO require a rationale: %s", Integer.valueOf(k().size()), n32.G(k(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (z52) null, 63, (Object) null));
        if (arrayList2.isEmpty()) {
            e.a(this, "No simple permissions to request", new Object[0]);
            s();
            return;
        }
        f62<g[], Integer, b, z52<? super com.afollestad.assent.b, u22>, u22> f62 = this.k;
        Object[] array = arrayList2.toArray(new g[0]);
        if (array != null) {
            f62.B(array, Integer.valueOf(i2), null, new C0074b(this));
            return;
        }
        throw new r22("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public abstract void w(g gVar, CharSequence charSequence, a aVar);
}
