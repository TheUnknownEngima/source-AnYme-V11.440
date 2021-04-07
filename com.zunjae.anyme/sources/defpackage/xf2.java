package defpackage;

import defpackage.sf2;
import org.jsoup.nodes.b;
import org.jsoup.nodes.f;
import org.jsoup.nodes.g;
import org.jsoup.nodes.h;
import org.jsoup.nodes.k;
import org.jsoup.nodes.l;

/* renamed from: xf2  reason: default package */
public class xf2 extends wf2 {

    /* renamed from: xf2$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                sf2$i[] r0 = defpackage.sf2.i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                sf2$i r1 = defpackage.sf2.i.StartTag     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                sf2$i r1 = defpackage.sf2.i.EndTag     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                sf2$i r1 = defpackage.sf2.i.Comment     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                sf2$i r1 = defpackage.sf2.i.Character     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                sf2$i r1 = defpackage.sf2.i.Doctype     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                sf2$i r1 = defpackage.sf2.i.EOF     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xf2.a.<clinit>():void");
        }
    }

    private void n(k kVar) {
        a().a0(kVar);
    }

    private void o(sf2.f fVar) {
        h hVar;
        String z = fVar.z();
        int size = this.d.size() - 1;
        while (true) {
            if (size < 0) {
                hVar = null;
                break;
            }
            hVar = this.d.get(size);
            if (hVar.x().equals(z)) {
                break;
            }
            size--;
        }
        if (hVar != null) {
            int size2 = this.d.size() - 1;
            while (size2 >= 0) {
                h hVar2 = this.d.get(size2);
                this.d.remove(size2);
                if (hVar2 != hVar) {
                    size2--;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public pf2 b() {
        return pf2.d;
    }

    /* access modifiers changed from: protected */
    public void c(String str, String str2, of2 of2, pf2 pf2) {
        super.c(str, str2, of2, pf2);
        this.d.add(this.c);
        this.c.I0().q(f.a.C0255a.xml);
    }

    /* access modifiers changed from: protected */
    public boolean e(sf2 sf2) {
        switch (a.a[sf2.a.ordinal()]) {
            case 1:
                j(sf2.e());
                return true;
            case 2:
                o(sf2.d());
                return true;
            case 3:
                l(sf2.b());
                return true;
            case 4:
                k(sf2.a());
                return true;
            case 5:
                m(sf2.c());
                return true;
            case 6:
                return true;
            default:
                jf2.a("Unexpected token type: " + sf2.a);
                throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public h j(sf2.g gVar) {
        rf2 k = rf2.k(gVar.z(), this.h);
        String str = this.e;
        pf2 pf2 = this.h;
        b bVar = gVar.j;
        pf2.a(bVar);
        h hVar = new h(k, str, bVar);
        n(hVar);
        if (gVar.y()) {
            this.b.a();
            if (!k.f()) {
                k.j();
            }
        } else {
            this.d.add(hVar);
        }
        return hVar;
    }

    /* access modifiers changed from: package-private */
    public void k(sf2.b bVar) {
        n(new l(bVar.p(), this.e));
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [org.jsoup.nodes.k, org.jsoup.nodes.m] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(defpackage.sf2.c r7) {
        /*
            r6 = this;
            org.jsoup.nodes.d r0 = new org.jsoup.nodes.d
            java.lang.String r1 = r7.o()
            java.lang.String r2 = r6.e
            r0.<init>(r1, r2)
            boolean r7 = r7.c
            if (r7 == 0) goto L_0x007b
            java.lang.String r7 = r0.X()
            int r1 = r7.length()
            r2 = 1
            if (r1 <= r2) goto L_0x007b
            java.lang.String r1 = "!"
            boolean r3 = r7.startsWith(r1)
            if (r3 != 0) goto L_0x002a
            java.lang.String r3 = "?"
            boolean r3 = r7.startsWith(r3)
            if (r3 == 0) goto L_0x007b
        L_0x002a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<"
            r3.append(r4)
            int r4 = r7.length()
            int r4 = r4 - r2
            java.lang.String r2 = r7.substring(r2, r4)
            r3.append(r2)
            java.lang.String r2 = ">"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = r6.e
            qf2 r4 = defpackage.qf2.e()
            org.jsoup.nodes.f r2 = defpackage.df2.c(r2, r3, r4)
            r3 = 0
            org.jsoup.nodes.h r2 = r2.g0(r3)
            org.jsoup.nodes.m r3 = new org.jsoup.nodes.m
            pf2 r4 = r6.h
            java.lang.String r5 = r2.D0()
            java.lang.String r4 = r4.b(r5)
            java.lang.String r0 = r0.g()
            boolean r7 = r7.startsWith(r1)
            r3.<init>(r4, r0, r7)
            org.jsoup.nodes.b r7 = r3.f()
            org.jsoup.nodes.b r0 = r2.f()
            r7.c(r0)
            r0 = r3
        L_0x007b:
            r6.n(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf2.l(sf2$c):void");
    }

    /* access modifiers changed from: package-private */
    public void m(sf2.d dVar) {
        n(new g(this.h.b(dVar.o()), dVar.p(), dVar.q(), dVar.r(), this.e));
    }
}
