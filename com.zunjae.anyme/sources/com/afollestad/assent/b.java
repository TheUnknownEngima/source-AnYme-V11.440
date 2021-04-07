package com.afollestad.assent;

import com.afollestad.assent.rationale.d;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b {
    private final Map<g, e> a;

    static final class a extends w62 implements z52<g, e> {
        final /* synthetic */ b f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.f = bVar;
        }

        /* renamed from: a */
        public final e r(g gVar) {
            v62.f(gVar, "permission");
            e eVar = this.f.a().get(gVar);
            if (eVar != null) {
                return eVar;
            }
            throw new IllegalStateException(("Permission " + gVar + " not in result map.").toString());
        }
    }

    /* renamed from: com.afollestad.assent.b$b  reason: collision with other inner class name */
    static final class C0071b extends w62 implements z52<Map.Entry<? extends g, ? extends e>, String> {
        public static final C0071b f = new C0071b();

        C0071b() {
            super(1);
        }

        /* renamed from: a */
        public final String r(Map.Entry<? extends g, ? extends e> entry) {
            v62.f(entry, "it");
            return ((g) entry.getKey()) + " -> " + ((e) entry.getValue());
        }
    }

    public b(Map<g, ? extends e> map) {
        v62.f(map, "resultsMap");
        this.a = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(java.util.Set<? extends com.afollestad.assent.g> r6, java.util.List<? extends com.afollestad.assent.e> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "permissions"
            defpackage.v62.f(r6, r0)
            java.lang.String r0 = "grantResults"
            defpackage.v62.f(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.g32.l(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
        L_0x001a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r6.next()
            int r3 = r1 + 1
            if (r1 < 0) goto L_0x0038
            com.afollestad.assent.g r2 = (com.afollestad.assent.g) r2
            l22 r4 = new l22
            java.lang.Object r1 = r7.get(r1)
            r4.<init>(r2, r1)
            r0.add(r4)
            r1 = r3
            goto L_0x001a
        L_0x0038:
            defpackage.d32.k()
            r6 = 0
            throw r6
        L_0x003d:
            java.util.Map r6 = defpackage.t32.k(r0)
            r5.<init>(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.assent.b.<init>(java.util.Set, java.util.List):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(Set<? extends g> set, int[] iArr, d dVar) {
        this(set, f.b(iArr, set, dVar));
        v62.f(set, "permissions");
        v62.f(iArr, "grantResults");
        v62.f(dVar, "shouldShowRationale");
    }

    public final Map<g, e> a() {
        return this.a;
    }

    public final boolean b(g... gVarArr) {
        boolean z;
        v62.f(gVarArr, "permissions");
        Iterator it = m82.h(b32.f(gVarArr), new a(this)).iterator();
        do {
            z = true;
            if (!it.hasNext()) {
                return true;
            }
            if (((e) it.next()) != e.GRANTED) {
                z = false;
                continue;
            }
        } while (z);
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && v62.a(((b) obj).a, this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return n32.G(this.a.entrySet(), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C0071b.f, 30, (Object) null);
    }
}
