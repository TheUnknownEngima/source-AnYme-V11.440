package com.mikepenz.materialdrawer;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.mikepenz.fastadapter.m;
import com.mikepenz.materialdrawer.c;
import com.mikepenz.materialize.view.ScrimInsetsRelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class d {
    protected boolean A = false;
    protected boolean B = true;
    protected androidx.appcompat.app.a C;
    protected boolean D = false;
    protected View E;
    protected boolean F = true;
    protected boolean G = true;
    protected jn1 H = null;
    protected View I;
    protected boolean J = true;
    protected View K;
    protected boolean L = true;
    protected ViewGroup M;
    protected boolean N = false;
    protected View O;
    protected boolean P = true;
    protected boolean Q = false;
    protected boolean R = false;
    protected int S = 0;
    protected long T = 0;
    protected RecyclerView U;
    protected boolean V = false;
    protected com.mikepenz.fastadapter.b<go1> W;
    protected vl1<go1, go1> X;
    protected vl1<go1, go1> Y;
    protected vl1<go1, go1> Z;
    protected boolean a = false;
    protected com.mikepenz.fastadapter.expandable.a<go1> a0;
    protected int b;
    protected RecyclerView.g b0;
    protected boolean c = false;
    protected RecyclerView.l c0;
    protected Activity d;
    protected boolean d0;
    protected RecyclerView.o e;
    protected List<go1> e0;
    protected ViewGroup f;
    protected boolean f0;
    public final lm1 g = new mm1();
    protected int g0;
    protected boolean h = true;
    protected int h0;
    protected Boolean i;
    protected c.C0154c i0;
    private boolean j = false;
    protected c.a j0;
    protected Toolbar k;
    protected c.b k0;
    protected boolean l = false;
    protected c.d l0;
    protected boolean m = false;
    protected boolean m0;
    protected boolean n = false;
    protected boolean n0;
    protected boolean o = false;
    protected boolean o0;
    protected View p;
    protected f p0;
    protected DrawerLayout q;
    protected Bundle q0;
    protected ScrimInsetsRelativeLayout r;
    protected SharedPreferences r0;
    protected int s = 0;
    protected int t = -1;
    protected Drawable u = null;
    protected int v = -1;
    protected int w = -1;
    protected Integer x = 8388611;
    protected a y;
    protected boolean z = false;

    class a extends DrawerLayout.f {
        boolean a = false;
        final /* synthetic */ SharedPreferences b;

        a(SharedPreferences sharedPreferences) {
            this.b = sharedPreferences;
        }

        public void d(int i) {
            if (i == 1) {
                this.a = true;
            } else if (i == 0) {
                if (this.a) {
                    d dVar = d.this;
                    if (dVar.q.C(dVar.x.intValue())) {
                        SharedPreferences.Editor edit = this.b.edit();
                        edit.putBoolean("navigation_drawer_dragged_open", true);
                        edit.apply();
                        return;
                    }
                }
                this.a = false;
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r0.C;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                com.mikepenz.materialdrawer.d r0 = com.mikepenz.materialdrawer.d.this
                com.mikepenz.materialdrawer.c$d r1 = r0.l0
                if (r1 == 0) goto L_0x0019
                androidx.appcompat.app.a r0 = r0.C
                if (r0 == 0) goto L_0x0019
                boolean r0 = r0.f()
                if (r0 != 0) goto L_0x0019
                com.mikepenz.materialdrawer.d r0 = com.mikepenz.materialdrawer.d.this
                com.mikepenz.materialdrawer.c$d r0 = r0.l0
                boolean r3 = r0.a(r3)
                goto L_0x001a
            L_0x0019:
                r3 = 0
            L_0x001a:
                if (r3 != 0) goto L_0x0047
                com.mikepenz.materialdrawer.d r3 = com.mikepenz.materialdrawer.d.this
                androidx.drawerlayout.widget.DrawerLayout r0 = r3.q
                java.lang.Integer r3 = r3.x
                int r3 = r3.intValue()
                boolean r3 = r0.C(r3)
                if (r3 == 0) goto L_0x003a
                com.mikepenz.materialdrawer.d r3 = com.mikepenz.materialdrawer.d.this
                androidx.drawerlayout.widget.DrawerLayout r0 = r3.q
                java.lang.Integer r3 = r3.x
                int r3 = r3.intValue()
                r0.d(r3)
                goto L_0x0047
            L_0x003a:
                com.mikepenz.materialdrawer.d r3 = com.mikepenz.materialdrawer.d.this
                androidx.drawerlayout.widget.DrawerLayout r0 = r3.q
                java.lang.Integer r3 = r3.x
                int r3 = r3.intValue()
                r0.K(r3)
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mikepenz.materialdrawer.d.b.onClick(android.view.View):void");
        }
    }

    class c extends androidx.appcompat.app.a {
        c(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
            super(activity, drawerLayout, toolbar, i, i2);
        }

        public void a(View view) {
            c.C0154c cVar = d.this.i0;
            if (cVar != null) {
                cVar.a(view);
            }
            super.a(view);
        }

        public void b(View view) {
            c.C0154c cVar = d.this.i0;
            if (cVar != null) {
                cVar.b(view);
            }
            super.b(view);
        }

        public void c(View view, float f) {
            c.C0154c cVar = d.this.i0;
            if (cVar != null) {
                cVar.c(view, f);
            }
            if (!d.this.A) {
                f = Utils.FLOAT_EPSILON;
            }
            super.c(view, f);
        }
    }

    /* renamed from: com.mikepenz.materialdrawer.d$d  reason: collision with other inner class name */
    class C0155d implements DrawerLayout.d {
        C0155d() {
        }

        public void a(View view) {
            c.C0154c cVar = d.this.i0;
            if (cVar != null) {
                cVar.a(view);
            }
        }

        public void b(View view) {
            c.C0154c cVar = d.this.i0;
            if (cVar != null) {
                cVar.b(view);
            }
        }

        public void c(View view, float f) {
            c.C0154c cVar = d.this.i0;
            if (cVar != null) {
                cVar.c(view, f);
            }
        }

        public void d(int i) {
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        public void onClick(View view) {
            e.g(d.this, (go1) view.getTag(R$id.material_drawer_item), view, Boolean.TRUE);
        }
    }

    class f implements dm1<go1> {

        class a implements Runnable {
            final /* synthetic */ View e;
            final /* synthetic */ int f;
            final /* synthetic */ go1 g;

            a(View view, int i, go1 go1) {
                this.e = view;
                this.f = i;
                this.g = go1;
            }

            public void run() {
                d.this.j0.a(this.e, this.f, this.g);
            }
        }

        f() {
        }

        /* renamed from: b */
        public boolean a(View view, com.mikepenz.fastadapter.c<go1> cVar, go1 go1, int i) {
            f fVar;
            if (go1 == null || !(go1 instanceof jo1) || go1.b()) {
                d.this.o();
                d.this.b = -1;
            }
            boolean z = false;
            if (go1 instanceof qn1) {
                qn1 qn1 = (qn1) go1;
                if (qn1.w() != null) {
                    z = qn1.w().a(view, i, go1);
                }
            }
            d dVar = d.this;
            c.a aVar = dVar.j0;
            if (aVar != null) {
                if (dVar.h0 > 0) {
                    new Handler().postDelayed(new a(view, i, go1), (long) d.this.h0);
                } else {
                    z = aVar.a(view, i, go1);
                }
            }
            if (!z && (fVar = d.this.p0) != null) {
                z = fVar.b(go1);
            }
            if ((go1 instanceof com.mikepenz.fastadapter.g) && go1.i() != null) {
                return true;
            }
            if (!z) {
                d.this.f();
            }
            return z;
        }
    }

    class g implements gm1<go1> {
        g() {
        }

        /* renamed from: b */
        public boolean a(View view, com.mikepenz.fastadapter.c<go1> cVar, go1 go1, int i) {
            d dVar = d.this;
            c.b bVar = dVar.k0;
            if (bVar != null) {
                return bVar.a(view, i, dVar.i(i));
            }
            return false;
        }
    }

    class h implements Runnable {
        h() {
        }

        public void run() {
            d.this.q.h();
            d dVar = d.this;
            if (dVar.D) {
                dVar.U.r1(0);
            }
        }
    }

    public d() {
        tl1 tl1 = new tl1();
        tl1.G(this.g);
        this.X = tl1;
        tl1 tl12 = new tl1();
        tl12.G(this.g);
        this.Y = tl12;
        tl1 tl13 = new tl1();
        tl13.G(this.g);
        this.Z = tl13;
        this.a0 = new com.mikepenz.fastadapter.expandable.a<>();
        this.c0 = new androidx.recyclerview.widget.e();
        this.d0 = false;
        this.e0 = new ArrayList();
        this.f0 = true;
        this.g0 = 50;
        this.h0 = 0;
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
        this.p0 = null;
        h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r10.x.intValue() == 8388611) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r10.x.intValue() == 8388611) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r5 = com.mikepenz.materialdrawer.R$drawable.material_drawer_shadow_right;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
            r10 = this;
            android.view.View r0 = r10.p
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = -1
            if (r0 == 0) goto L_0x0016
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r2, r2)
            r0.weight = r1
            com.mikepenz.materialize.view.ScrimInsetsRelativeLayout r1 = r10.r
            android.view.View r2 = r10.p
            r1.addView(r2, r0)
            return
        L_0x0016:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            r4 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 >= r3) goto L_0x004e
            androidx.drawerlayout.widget.DrawerLayout r0 = r10.q
            if (r0 == 0) goto L_0x004e
            android.view.ViewGroup r0 = r10.f
            int r0 = defpackage.o4.y(r0)
            if (r0 != 0) goto L_0x0036
            androidx.drawerlayout.widget.DrawerLayout r0 = r10.q
            java.lang.Integer r5 = r10.x
            int r5 = r5.intValue()
            if (r5 != r4) goto L_0x0040
            goto L_0x0043
        L_0x0036:
            androidx.drawerlayout.widget.DrawerLayout r0 = r10.q
            java.lang.Integer r5 = r10.x
            int r5 = r5.intValue()
            if (r5 != r4) goto L_0x0043
        L_0x0040:
            int r5 = com.mikepenz.materialdrawer.R$drawable.material_drawer_shadow_left
            goto L_0x0045
        L_0x0043:
            int r5 = com.mikepenz.materialdrawer.R$drawable.material_drawer_shadow_right
        L_0x0045:
            java.lang.Integer r6 = r10.x
            int r6 = r6.intValue()
            r0.U(r5, r6)
        L_0x004e:
            androidx.recyclerview.widget.RecyclerView r0 = r10.U
            r5 = 1
            r6 = 0
            if (r0 != 0) goto L_0x00ce
            android.app.Activity r0 = r10.d
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r7 = com.mikepenz.materialdrawer.R$layout.material_drawer_recycler_view
            com.mikepenz.materialize.view.ScrimInsetsRelativeLayout r8 = r10.r
            android.view.View r0 = r0.inflate(r7, r8, r6)
            int r7 = com.mikepenz.materialdrawer.R$id.material_drawer_recycler_view
            android.view.View r7 = r0.findViewById(r7)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r10.U = r7
            androidx.recyclerview.widget.RecyclerView$l r8 = r10.c0
            r7.setItemAnimator(r8)
            androidx.recyclerview.widget.RecyclerView r7 = r10.U
            r7.setFadingEdgeLength(r6)
            androidx.recyclerview.widget.RecyclerView r7 = r10.U
            r7.setClipToPadding(r6)
            androidx.recyclerview.widget.RecyclerView r7 = r10.U
            androidx.recyclerview.widget.RecyclerView$o r8 = r10.e
            r7.setLayoutManager(r8)
            java.lang.Boolean r7 = r10.i
            if (r7 == 0) goto L_0x008c
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0097
        L_0x008c:
            boolean r7 = r10.o
            if (r7 != 0) goto L_0x0097
            android.app.Activity r7 = r10.d
            int r7 = defpackage.to1.i(r7)
            goto L_0x0098
        L_0x0097:
            r7 = 0
        L_0x0098:
            android.app.Activity r8 = r10.d
            android.content.res.Resources r8 = r8.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            int r8 = r8.orientation
            boolean r9 = r10.l
            if (r9 != 0) goto L_0x00ac
            boolean r9 = r10.n
            if (r9 == 0) goto L_0x00c8
        L_0x00ac:
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r3) goto L_0x00c8
            boolean r3 = r10.o
            if (r3 != 0) goto L_0x00c8
            if (r8 == r5) goto L_0x00c1
            r3 = 2
            if (r8 != r3) goto L_0x00c8
            android.app.Activity r3 = r10.d
            boolean r3 = defpackage.no1.e(r3)
            if (r3 == 0) goto L_0x00c8
        L_0x00c1:
            android.app.Activity r3 = r10.d
            int r3 = defpackage.to1.d(r3)
            goto L_0x00c9
        L_0x00c8:
            r3 = 0
        L_0x00c9:
            androidx.recyclerview.widget.RecyclerView r8 = r10.U
            r8.setPadding(r6, r7, r6, r3)
        L_0x00ce:
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r2, r2)
            r3.weight = r1
            com.mikepenz.materialize.view.ScrimInsetsRelativeLayout r1 = r10.r
            r1.addView(r0, r3)
            boolean r0 = r10.j
            if (r0 == 0) goto L_0x00fc
            com.mikepenz.materialize.view.ScrimInsetsRelativeLayout r0 = r10.r
            int r1 = com.mikepenz.materialdrawer.R$id.material_drawer_inner_shadow
            android.view.View r0 = r0.findViewById(r1)
            r0.setVisibility(r6)
            r0.bringToFront()
            java.lang.Integer r1 = r10.x
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x00f7
            int r1 = com.mikepenz.materialdrawer.R$drawable.material_drawer_shadow_left
            goto L_0x00f9
        L_0x00f7:
            int r1 = com.mikepenz.materialdrawer.R$drawable.material_drawer_shadow_right
        L_0x00f9:
            r0.setBackgroundResource(r1)
        L_0x00fc:
            int r0 = r10.s
            if (r0 == 0) goto L_0x0106
            com.mikepenz.materialize.view.ScrimInsetsRelativeLayout r1 = r10.r
        L_0x0102:
            r1.setBackgroundColor(r0)
            goto L_0x0126
        L_0x0106:
            int r0 = r10.t
            if (r0 == r2) goto L_0x0113
            com.mikepenz.materialize.view.ScrimInsetsRelativeLayout r1 = r10.r
            android.app.Activity r3 = r10.d
            int r0 = androidx.core.content.a.d(r3, r0)
            goto L_0x0102
        L_0x0113:
            android.graphics.drawable.Drawable r0 = r10.u
            if (r0 == 0) goto L_0x011d
            com.mikepenz.materialize.view.ScrimInsetsRelativeLayout r1 = r10.r
            defpackage.to1.o(r1, r0)
            goto L_0x0126
        L_0x011d:
            int r0 = r10.v
            if (r0 == r2) goto L_0x0126
            com.mikepenz.materialize.view.ScrimInsetsRelativeLayout r1 = r10.r
            defpackage.to1.n(r1, r0)
        L_0x0126:
            com.mikepenz.materialdrawer.e.f(r10)
            com.mikepenz.materialdrawer.d$e r0 = new com.mikepenz.materialdrawer.d$e
            r0.<init>()
            com.mikepenz.materialdrawer.e.e(r10, r0)
            com.mikepenz.fastadapter.b<go1> r0 = r10.W
            boolean r1 = r10.R
            r0.C0(r1)
            boolean r0 = r10.R
            if (r0 == 0) goto L_0x0146
            com.mikepenz.fastadapter.b<go1> r0 = r10.W
            r0.H0(r6)
            com.mikepenz.fastadapter.b<go1> r0 = r10.W
            r0.A0(r5)
        L_0x0146:
            androidx.recyclerview.widget.RecyclerView$g r0 = r10.b0
            if (r0 != 0) goto L_0x0152
            androidx.recyclerview.widget.RecyclerView r0 = r10.U
            com.mikepenz.fastadapter.b<go1> r1 = r10.W
            r0.setAdapter(r1)
            goto L_0x0157
        L_0x0152:
            androidx.recyclerview.widget.RecyclerView r1 = r10.U
            r1.setAdapter(r0)
        L_0x0157:
            int r0 = r10.S
            if (r0 != 0) goto L_0x0169
            long r0 = r10.T
            r3 = 0
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0169
            int r0 = com.mikepenz.materialdrawer.e.d(r10, r0)
            r10.S = r0
        L_0x0169:
            android.view.View r0 = r10.E
            if (r0 == 0) goto L_0x0173
            int r0 = r10.S
            if (r0 != 0) goto L_0x0173
            r10.S = r5
        L_0x0173:
            com.mikepenz.fastadapter.b<go1> r0 = r10.W
            r0.P()
            com.mikepenz.fastadapter.b<go1> r0 = r10.W
            int r1 = r10.S
            r0.y0(r1)
            com.mikepenz.fastadapter.b<go1> r0 = r10.W
            com.mikepenz.materialdrawer.d$f r1 = new com.mikepenz.materialdrawer.d$f
            r1.<init>()
            r0.D0(r1)
            com.mikepenz.fastadapter.b<go1> r0 = r10.W
            com.mikepenz.materialdrawer.d$g r1 = new com.mikepenz.materialdrawer.d$g
            r1.<init>()
            r0.E0(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r10.U
            if (r0 == 0) goto L_0x019a
            r0.j1(r6)
        L_0x019a:
            android.os.Bundle r0 = r10.q0
            r1 = 0
            if (r0 == 0) goto L_0x01cf
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x01b6
            com.mikepenz.fastadapter.b<go1> r0 = r10.W
            r0.P()
            com.mikepenz.fastadapter.b<go1> r0 = r10.W
            android.os.Bundle r3 = r10.q0
            java.lang.String r4 = "_selection"
            r0.G0(r3, r4)
            android.os.Bundle r0 = r10.q0
            java.lang.String r3 = "bundle_sticky_footer_selection"
            goto L_0x01c8
        L_0x01b6:
            com.mikepenz.fastadapter.b<go1> r0 = r10.W
            r0.P()
            com.mikepenz.fastadapter.b<go1> r0 = r10.W
            android.os.Bundle r3 = r10.q0
            java.lang.String r4 = "_selection_appended"
            r0.G0(r3, r4)
            android.os.Bundle r0 = r10.q0
            java.lang.String r3 = "bundle_sticky_footer_selection_appended"
        L_0x01c8:
            int r0 = r0.getInt(r3, r2)
            com.mikepenz.materialdrawer.e.i(r10, r0, r1)
        L_0x01cf:
            boolean r0 = r10.Q
            if (r0 == 0) goto L_0x0201
            com.mikepenz.materialdrawer.c$a r0 = r10.j0
            if (r0 == 0) goto L_0x0201
            com.mikepenz.fastadapter.b<go1> r0 = r10.W
            java.util.Set r0 = r0.h0()
            int r0 = r0.size()
            if (r0 != 0) goto L_0x01e4
            goto L_0x01f8
        L_0x01e4:
            com.mikepenz.fastadapter.b<go1> r0 = r10.W
            java.util.Set r0 = r0.h0()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r2 = r0.intValue()
        L_0x01f8:
            com.mikepenz.materialdrawer.c$a r0 = r10.j0
            go1 r3 = r10.i(r2)
            r0.a(r1, r2, r3)
        L_0x0201:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mikepenz.materialdrawer.d.g():void");
    }

    private void n() {
        if (this.d != null && this.q != null) {
            if (this.m0 || this.n0) {
                SharedPreferences sharedPreferences = this.r0;
                if (sharedPreferences == null) {
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.d);
                }
                if (this.m0 && !sharedPreferences.getBoolean("navigation_drawer_learned", false)) {
                    this.q.M(this.r);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putBoolean("navigation_drawer_learned", true);
                    edit.apply();
                } else if (this.n0 && !sharedPreferences.getBoolean("navigation_drawer_dragged_open", false)) {
                    this.q.M(this.r);
                    this.q.a(new a(sharedPreferences));
                }
            }
        }
    }

    public d a(go1... go1Arr) {
        l().e(go1Arr);
        return this;
    }

    public d b(go1... go1Arr) {
        if (this.e0 == null) {
            this.e0 = new ArrayList();
        }
        Collections.addAll(this.e0, go1Arr);
        return this;
    }

    public c c() {
        if (this.a) {
            throw new RuntimeException("you must not reuse a DrawerBuilder builder");
        } else if (this.d != null) {
            this.a = true;
            if (this.q == null) {
                t(-1);
            }
            com.mikepenz.materialize.b bVar = new com.mikepenz.materialize.b();
            bVar.b(this.d);
            bVar.e(this.f);
            bVar.d(this.n);
            bVar.f(this.o);
            bVar.k(false);
            bVar.j(this.h);
            bVar.i(this.m);
            bVar.c(this.q);
            bVar.a();
            m(this.d, false);
            c d2 = d();
            this.r.setId(R$id.material_drawer_slider_layout);
            this.q.addView(this.r, 1);
            return d2;
        } else {
            throw new RuntimeException("please pass an activity");
        }
    }

    public c d() {
        ScrimInsetsRelativeLayout scrimInsetsRelativeLayout = (ScrimInsetsRelativeLayout) this.d.getLayoutInflater().inflate(R$layout.material_drawer_slider, this.q, false);
        this.r = scrimInsetsRelativeLayout;
        scrimInsetsRelativeLayout.setBackgroundColor(to1.m(this.d, R$attr.material_drawer_background, R$color.material_drawer_background));
        DrawerLayout.LayoutParams layoutParams = (DrawerLayout.LayoutParams) this.r.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.a = this.x.intValue();
            e.h(this, layoutParams);
            this.r.setLayoutParams(layoutParams);
        }
        g();
        c cVar = new c(this);
        a aVar = this.y;
        if (aVar != null) {
            aVar.c(cVar);
        }
        Bundle bundle = this.q0;
        if (bundle != null && bundle.getBoolean("bundle_drawer_content_switched", false)) {
            this.y.d(this.d);
        }
        n();
        if (!this.c && this.o0) {
            f fVar = new f();
            fVar.f(cVar);
            fVar.e(this.y);
            this.p0 = fVar;
        }
        this.d = null;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public boolean e(int i2, boolean z2) {
        return h().Y(i2) != null;
    }

    /* access modifiers changed from: protected */
    public void f() {
        DrawerLayout drawerLayout;
        if (this.f0 && (drawerLayout = this.q) != null) {
            if (this.g0 > -1) {
                new Handler().postDelayed(new h(), (long) this.g0);
            } else {
                drawerLayout.h();
            }
        }
    }

    /* access modifiers changed from: protected */
    public com.mikepenz.fastadapter.b<go1> h() {
        if (this.W == null) {
            com.mikepenz.fastadapter.b<go1> z0 = com.mikepenz.fastadapter.b.z0(Arrays.asList(new vl1[]{this.X, this.Y, this.Z}), Arrays.asList(new com.mikepenz.fastadapter.d[]{this.a0}));
            this.W = z0;
            z0.I0(true);
            this.W.C0(false);
            this.W.A0(false);
            this.W.F(this.V);
        }
        return this.W;
    }

    /* access modifiers changed from: protected */
    public go1 i(int i2) {
        return h().Y(i2);
    }

    /* access modifiers changed from: protected */
    public m<go1, go1> j() {
        return this.Z;
    }

    /* access modifiers changed from: protected */
    public m<go1, go1> k() {
        return this.X;
    }

    /* access modifiers changed from: protected */
    public m<go1, go1> l() {
        return this.Y;
    }

    /* access modifiers changed from: protected */
    public void m(Activity activity, boolean z2) {
        DrawerLayout.d dVar;
        DrawerLayout drawerLayout;
        Toolbar toolbar;
        b bVar = new b();
        if (z2) {
            this.C = null;
        }
        if (this.B && this.C == null && (toolbar = this.k) != null) {
            c cVar = new c(activity, this.q, toolbar, R$string.material_drawer_open, R$string.material_drawer_close);
            this.C = cVar;
            cVar.k();
        }
        Toolbar toolbar2 = this.k;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(bVar);
        }
        androidx.appcompat.app.a aVar = this.C;
        if (aVar != null) {
            aVar.j(bVar);
            drawerLayout = this.q;
            dVar = this.C;
        } else {
            drawerLayout = this.q;
            dVar = new C0155d();
        }
        drawerLayout.a(dVar);
    }

    /* access modifiers changed from: protected */
    public void o() {
        if (this.M instanceof LinearLayout) {
            for (int i2 = 0; i2 < this.M.getChildCount(); i2++) {
                this.M.getChildAt(i2).setActivated(false);
                this.M.getChildAt(i2).setSelected(false);
            }
        }
    }

    public d p(a aVar) {
        q(aVar, false);
        return this;
    }

    public d q(a aVar, boolean z2) {
        this.y = aVar;
        this.z = z2;
        return this;
    }

    public d r(Activity activity) {
        this.f = (ViewGroup) activity.findViewById(16908290);
        this.d = activity;
        this.e = new LinearLayoutManager(activity);
        return this;
    }

    public d s(int i2) {
        this.x = Integer.valueOf(i2);
        return this;
    }

    public d t(int i2) {
        LayoutInflater layoutInflater;
        int i3;
        View inflate;
        Activity activity = this.d;
        if (activity != null) {
            if (i2 != -1) {
                inflate = activity.getLayoutInflater().inflate(i2, this.f, false);
            } else {
                if (Build.VERSION.SDK_INT < 21) {
                    layoutInflater = activity.getLayoutInflater();
                    i3 = R$layout.material_drawer_fits_not;
                } else {
                    layoutInflater = activity.getLayoutInflater();
                    i3 = R$layout.material_drawer;
                }
                inflate = layoutInflater.inflate(i3, this.f, false);
            }
            this.q = (DrawerLayout) inflate;
            return this;
        }
        throw new RuntimeException("please pass an activity first to use this call");
    }

    public d u(c.a aVar) {
        this.j0 = aVar;
        return this;
    }

    public d v(long j2) {
        this.T = j2;
        return this;
    }

    public d w(Toolbar toolbar) {
        this.k = toolbar;
        return this;
    }

    public d x(boolean z2) {
        this.h = z2;
        return this;
    }
}
