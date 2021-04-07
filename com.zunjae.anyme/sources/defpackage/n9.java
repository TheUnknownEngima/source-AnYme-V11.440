package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.c0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: n9  reason: default package */
public final class n9<IT, VH extends RecyclerView.c0> implements com.afollestad.recyclical.a<IT, VH> {
    private d62<? super r9<? extends Object>, ? super Integer, u22> a;
    private d62<? super r9<? extends Object>, ? super Integer, u22> b;
    private z52<? super View, ?> c;
    private e62<?, ? super Integer, ?, u22> d;
    private z52<Object, ? extends Number> e;
    private z52<Object, u22> f;
    private List<a<?, ?, ?>> g = new ArrayList();
    private final View.OnClickListener h = new b(this);
    private final View.OnLongClickListener i = new c(this);
    private final com.afollestad.recyclical.c j;
    private final String k;

    /* renamed from: n9$a */
    public static final class a<IT, VH extends RecyclerView.c0, VT extends View> {
        private final Class<VH> a;
        private final z52<VH, VT> b;
        private final e62<r9<? extends IT>, Integer, VT, u22> c;

        public a(Class<VH> cls, z52<? super VH, ? extends VT> z52, e62<? super r9<? extends IT>, ? super Integer, ? super VT, u22> e62) {
            v62.f(cls, "viewHolderType");
            v62.f(z52, "child");
            v62.f(e62, "callback");
            this.a = cls;
            this.b = z52;
            this.c = e62;
        }

        public final e62<r9<? extends IT>, Integer, VT, u22> a() {
            return this.c;
        }

        public final z52<VH, VT> b() {
            return this.b;
        }

        public final Class<VH> c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c);
        }

        public int hashCode() {
            Class<VH> cls = this.a;
            int i = 0;
            int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
            z52<VH, VT> z52 = this.b;
            int hashCode2 = (hashCode + (z52 != null ? z52.hashCode() : 0)) * 31;
            e62<r9<? extends IT>, Integer, VT, u22> e62 = this.c;
            if (e62 != null) {
                i = e62.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "ChildClickData(viewHolderType=" + this.a + ", child=" + this.b + ", callback=" + this.c + ")";
        }
    }

    /* renamed from: n9$b */
    static final class b implements View.OnClickListener {
        final /* synthetic */ n9 e;

        b(n9 n9Var) {
            this.e = n9Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
            defpackage.k52.a(r0, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                g9 r0 = defpackage.g9.c
                java.lang.String r1 = "itemView"
                defpackage.v62.b(r5, r1)
                boolean r0 = r0.b(r5)
                if (r0 == 0) goto L_0x004f
                androidx.recyclerview.widget.RecyclerView$c0 r5 = defpackage.l9.g(r5)
                int r5 = r5.j()
                n9 r0 = r4.e
                r9 r0 = defpackage.l9.c(r0, r5)
                r1 = 0
                n9 r2 = r4.e     // Catch:{ all -> 0x0048 }
                d62 r2 = r2.k()     // Catch:{ all -> 0x0048 }
                if (r2 == 0) goto L_0x002e
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0048 }
                java.lang.Object r2 = r2.G(r0, r3)     // Catch:{ all -> 0x0048 }
                u22 r2 = (defpackage.u22) r2     // Catch:{ all -> 0x0048 }
            L_0x002e:
                n9 r2 = r4.e     // Catch:{ all -> 0x0048 }
                com.afollestad.recyclical.c r2 = r2.n()     // Catch:{ all -> 0x0048 }
                d62 r2 = r2.b()     // Catch:{ all -> 0x0048 }
                if (r2 == 0) goto L_0x0044
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0048 }
                java.lang.Object r5 = r2.G(r0, r5)     // Catch:{ all -> 0x0048 }
                u22 r5 = (defpackage.u22) r5     // Catch:{ all -> 0x0048 }
            L_0x0044:
                defpackage.k52.a(r0, r1)
                goto L_0x004f
            L_0x0048:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x004a }
            L_0x004a:
                r1 = move-exception
                defpackage.k52.a(r0, r5)
                throw r1
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.n9.b.onClick(android.view.View):void");
        }
    }

    /* renamed from: n9$c */
    static final class c implements View.OnLongClickListener {
        final /* synthetic */ n9 e;

        c(n9 n9Var) {
            this.e = n9Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
            defpackage.k52.a(r0, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onLongClick(android.view.View r5) {
            /*
                r4 = this;
                g9 r0 = defpackage.g9.c
                java.lang.String r1 = "itemView"
                defpackage.v62.b(r5, r1)
                boolean r0 = r0.b(r5)
                if (r0 == 0) goto L_0x004f
                androidx.recyclerview.widget.RecyclerView$c0 r5 = defpackage.l9.g(r5)
                int r5 = r5.j()
                n9 r0 = r4.e
                r9 r0 = defpackage.l9.c(r0, r5)
                r1 = 0
                n9 r2 = r4.e     // Catch:{ all -> 0x0048 }
                d62 r2 = r2.l()     // Catch:{ all -> 0x0048 }
                if (r2 == 0) goto L_0x002e
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0048 }
                java.lang.Object r2 = r2.G(r0, r3)     // Catch:{ all -> 0x0048 }
                u22 r2 = (defpackage.u22) r2     // Catch:{ all -> 0x0048 }
            L_0x002e:
                n9 r2 = r4.e     // Catch:{ all -> 0x0048 }
                com.afollestad.recyclical.c r2 = r2.n()     // Catch:{ all -> 0x0048 }
                d62 r2 = r2.c()     // Catch:{ all -> 0x0048 }
                if (r2 == 0) goto L_0x0044
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0048 }
                java.lang.Object r5 = r2.G(r0, r5)     // Catch:{ all -> 0x0048 }
                u22 r5 = (defpackage.u22) r5     // Catch:{ all -> 0x0048 }
            L_0x0044:
                defpackage.k52.a(r0, r1)
                goto L_0x004f
            L_0x0048:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x004a }
            L_0x004a:
                r1 = move-exception
                defpackage.k52.a(r0, r5)
                throw r1
            L_0x004f:
                r5 = 1
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.n9.c.onLongClick(android.view.View):boolean");
        }
    }

    public n9(com.afollestad.recyclical.c cVar, String str) {
        v62.f(cVar, "setup");
        v62.f(str, "itemClassName");
        this.j = cVar;
        this.k = str;
    }

    public com.afollestad.recyclical.a<IT, VH> a(d62<? super r9<? extends IT>, ? super Integer, u22> d62) {
        v62.f(d62, "block");
        i72.c(d62, 2);
        this.b = d62;
        return this;
    }

    public com.afollestad.recyclical.a<IT, VH> b(z52<? super IT, ? extends Number> z52) {
        v62.f(z52, "idGetter");
        i72.c(z52, 1);
        this.e = z52;
        return this;
    }

    public com.afollestad.recyclical.a<IT, VH> c(z52<? super View, ? extends VH> z52, e62<? super VH, ? super Integer, ? super IT, u22> e62) {
        v62.f(z52, "viewHolderCreator");
        v62.f(e62, "block");
        this.c = z52;
        this.d = e62;
        return this;
    }

    public com.afollestad.recyclical.a<IT, VH> d(d62<? super r9<? extends IT>, ? super Integer, u22> d62) {
        v62.f(d62, "block");
        i72.c(d62, 2);
        this.a = d62;
        return this;
    }

    public final e62<?, Integer, ?, u22> e() {
        return this.d;
    }

    public final List<a<?, ?, ?>> f() {
        return this.g;
    }

    public final z52<View, ?> g() {
        return this.c;
    }

    public final a9<?> h() {
        return this.j.a();
    }

    public final z52<Object, Number> i() {
        return this.e;
    }

    public final String j() {
        return this.k;
    }

    public final d62<r9<? extends Object>, Integer, u22> k() {
        return this.a;
    }

    public final d62<r9<? extends Object>, Integer, u22> l() {
        return this.b;
    }

    public final z52<Object, u22> m() {
        return this.f;
    }

    public final com.afollestad.recyclical.c n() {
        return this.j;
    }

    public final View.OnClickListener o() {
        return this.h;
    }

    public final View.OnLongClickListener p() {
        return this.i;
    }
}
