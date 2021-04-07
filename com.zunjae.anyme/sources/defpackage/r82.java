package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: r82  reason: default package */
final class r82 implements g82<t72> {
    /* access modifiers changed from: private */
    public final CharSequence a;
    /* access modifiers changed from: private */
    public final int b;
    /* access modifiers changed from: private */
    public final int c;
    /* access modifiers changed from: private */
    public final d62<CharSequence, Integer, l22<Integer, Integer>> d;

    /* renamed from: r82$a */
    public static final class a implements Iterator<t72>, j72 {
        private int e = -1;
        private int f;
        private int g;
        private t72 h;
        private int i;
        final /* synthetic */ r82 j;

        a(r82 r82) {
            this.j = r82;
            int g2 = w72.g(r82.b, 0, r82.a.length());
            this.f = g2;
            this.g = g2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < defpackage.r82.c(r6.j)) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.g
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.e = r1
                r0 = 0
                r6.h = r0
                goto L_0x0099
            L_0x000c:
                r82 r0 = r6.j
                int r0 = r0.c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.i
                int r0 = r0 + r3
                r6.i = r0
                r82 r4 = r6.j
                int r4 = r4.c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.g
                r82 r4 = r6.j
                java.lang.CharSequence r4 = r4.a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                int r0 = r6.f
                t72 r1 = new t72
                r82 r4 = r6.j
                java.lang.CharSequence r4 = r4.a
                int r4 = defpackage.g92.y(r4)
                r1.<init>(r0, r4)
            L_0x0042:
                r6.h = r1
            L_0x0044:
                r6.g = r2
                goto L_0x0097
            L_0x0047:
                r82 r0 = r6.j
                d62 r0 = r0.d
                r82 r4 = r6.j
                java.lang.CharSequence r4 = r4.a
                int r5 = r6.g
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.G(r4, r5)
                l22 r0 = (defpackage.l22) r0
                if (r0 != 0) goto L_0x0073
                int r0 = r6.f
                t72 r1 = new t72
                r82 r4 = r6.j
                java.lang.CharSequence r4 = r4.a
                int r4 = defpackage.g92.y(r4)
                r1.<init>(r0, r4)
                goto L_0x0042
            L_0x0073:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f
                t72 r4 = defpackage.w72.i(r4, r2)
                r6.h = r4
                int r2 = r2 + r0
                r6.f = r2
                if (r0 != 0) goto L_0x0095
                r1 = 1
            L_0x0095:
                int r2 = r2 + r1
                goto L_0x0044
            L_0x0097:
                r6.e = r3
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.r82.a.a():void");
        }

        /* renamed from: b */
        public t72 next() {
            if (this.e == -1) {
                a();
            }
            if (this.e != 0) {
                t72 t72 = this.h;
                if (t72 != null) {
                    this.h = null;
                    this.e = -1;
                    return t72;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.e == -1) {
                a();
            }
            return this.e == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public r82(CharSequence charSequence, int i, int i2, d62<? super CharSequence, ? super Integer, l22<Integer, Integer>> d62) {
        v62.e(charSequence, "input");
        v62.e(d62, "getNextMatch");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = d62;
    }

    public Iterator<t72> iterator() {
        return new a(this);
    }
}
