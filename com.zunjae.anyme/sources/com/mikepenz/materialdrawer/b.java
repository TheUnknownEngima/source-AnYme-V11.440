package com.mikepenz.materialdrawer;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.github.mikephil.charting.utils.Utils;
import com.mikepenz.materialdrawer.a;
import com.mikepenz.materialdrawer.c;
import com.mikepenz.materialdrawer.view.BezelImageView;
import defpackage.mn1;
import defpackage.mo1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class b {
    protected String A;
    protected String B;
    protected boolean C = true;
    protected boolean D = true;
    protected boolean E = true;
    protected kn1 F;
    protected ImageView.ScaleType G = null;
    protected boolean H = true;
    protected boolean I = false;
    protected boolean J = false;
    protected Boolean K = null;
    protected boolean L = true;
    protected boolean M = true;
    protected boolean N = false;
    protected boolean O = false;
    protected int P = 100;
    protected a.c Q;
    protected a.d R;
    protected boolean S = true;
    protected boolean T = true;
    protected View U;
    protected List<ho1> V;
    protected a.b W;
    protected a.C0152a X;
    protected c Y;
    protected Bundle Z;
    protected Guideline a;
    private View.OnClickListener a0 = new a();
    protected View b;
    private View.OnClickListener b0 = new C0153b();
    protected ImageView c;
    private View.OnLongClickListener c0 = new c();
    protected BezelImageView d;
    private View.OnLongClickListener d0 = new d();
    protected ImageView e;
    private View.OnClickListener e0 = new f();
    protected TextView f;
    private c.a f0 = new g();
    protected TextView g;
    private c.b g0 = new h();
    protected BezelImageView h;
    protected BezelImageView i;
    protected BezelImageView j;
    protected ho1 k;
    protected ho1 l;
    protected ho1 m;
    protected ho1 n;
    protected boolean o;
    protected int p = -1;
    protected Activity q;
    protected boolean r = false;
    protected Typeface s;
    protected Typeface t;
    protected Typeface u;
    protected jn1 v;
    protected in1 w;
    protected boolean x = false;
    protected boolean y = true;
    protected boolean z = true;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            b.this.j(view, true);
        }
    }

    /* renamed from: com.mikepenz.materialdrawer.b$b  reason: collision with other inner class name */
    class C0153b implements View.OnClickListener {
        C0153b() {
        }

        public void onClick(View view) {
            b.this.j(view, false);
        }
    }

    class c implements View.OnLongClickListener {
        c() {
        }

        public boolean onLongClick(View view) {
            if (b.this.Q == null) {
                return false;
            }
            return b.this.Q.a(view, (ho1) view.getTag(R$id.material_drawer_profile_header), true);
        }
    }

    class d implements View.OnLongClickListener {
        d() {
        }

        public boolean onLongClick(View view) {
            if (b.this.Q == null) {
                return false;
            }
            return b.this.Q.a(view, (ho1) view.getTag(R$id.material_drawer_profile_header), false);
        }
    }

    class e implements Runnable {
        e() {
        }

        public void run() {
            c cVar = b.this.Y;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        public void onClick(View view) {
            a.d dVar = b.this.R;
            boolean a = dVar != null ? dVar.a(view, (ho1) view.getTag(R$id.material_drawer_profile_header)) : false;
            if (b.this.e.getVisibility() == 0 && !a) {
                b.this.o(view.getContext());
            }
        }
    }

    class g implements c.a {
        g() {
        }

        public boolean a(View view, int i, go1 go1) {
            a.b bVar;
            boolean z = false;
            boolean n = (go1 == null || !(go1 instanceof ho1) || !go1.b()) ? false : b.this.n((ho1) go1);
            b bVar2 = b.this;
            if (bVar2.L) {
                bVar2.Y.u((c.a) null);
            }
            b bVar3 = b.this;
            if (!(!bVar3.L || bVar3.Y == null || view == null || view.getContext() == null)) {
                b.this.k(view.getContext());
            }
            c cVar = b.this.Y;
            if (!(cVar == null || cVar.c() == null || b.this.Y.c().p0 == null)) {
                b.this.Y.c().p0.c();
            }
            boolean a2 = (go1 == null || !(go1 instanceof ho1) || (bVar = b.this.W) == null) ? false : bVar.a(view, (ho1) go1, n);
            Boolean bool = b.this.K;
            if (bool != null) {
                if (a2 && !bool.booleanValue()) {
                    z = true;
                }
                a2 = z;
            }
            c cVar2 = b.this.Y;
            if (cVar2 != null && !a2) {
                cVar2.a.f();
            }
            return true;
        }
    }

    class h implements c.b {
        h() {
        }

        public boolean a(View view, int i, go1 go1) {
            if (b.this.X != null) {
                boolean z = go1 != null && go1.f();
                if (go1 != null && (go1 instanceof ho1)) {
                    return b.this.X.a(view, (ho1) go1, z);
                }
            }
            return false;
        }
    }

    private void h(ho1 ho1, boolean z2) {
        if (z2) {
            if (Build.VERSION.SDK_INT >= 23) {
                View view = this.U;
                view.setForeground(defpackage.f.d(view.getContext(), this.p));
            }
            this.U.setOnClickListener(this.e0);
            this.U.setTag(R$id.material_drawer_profile_header, ho1);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.U.setForeground((Drawable) null);
        }
        this.U.setOnClickListener((View.OnClickListener) null);
    }

    /* access modifiers changed from: private */
    public void j(View view, boolean z2) {
        ho1 ho1 = (ho1) view.getTag(R$id.material_drawer_profile_header);
        a.c cVar = this.Q;
        if (!(cVar != null ? cVar.b(view, ho1, z2) : false)) {
            i(view, z2);
        }
    }

    /* access modifiers changed from: private */
    public void k(Context context) {
        c cVar = this.Y;
        if (cVar != null) {
            cVar.q();
        }
        this.e.clearAnimation();
        t4 c2 = o4.c(this.e);
        c2.d(Utils.FLOAT_EPSILON);
        c2.k();
    }

    private void l(int i2) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.U;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = i2;
                this.U.setLayoutParams(layoutParams2);
            }
            View findViewById = this.U.findViewById(R$id.material_drawer_account_header);
            if (!(findViewById == null || (layoutParams = findViewById.getLayoutParams()) == null)) {
                layoutParams.height = i2;
                findViewById.setLayoutParams(layoutParams);
            }
            View findViewById2 = this.U.findViewById(R$id.material_drawer_account_header_background);
            if (findViewById2 != null) {
                ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
                layoutParams3.height = i2;
                findViewById2.setLayoutParams(layoutParams3);
            }
        }
    }

    private void m(ImageView imageView, kn1 kn1) {
        mo1.c().a(imageView);
        imageView.setImageDrawable(mo1.c().b().b(imageView.getContext(), mo1.c.PROFILE.name()));
        ro1.c(kn1, imageView, mo1.c.PROFILE.name());
    }

    public b c(ho1... ho1Arr) {
        if (this.V == null) {
            this.V = new ArrayList();
        }
        c cVar = this.Y;
        if (cVar != null) {
            cVar.a.g.d(ho1Arr);
        }
        Collections.addAll(this.V, ho1Arr);
        return this;
    }

    public a d() {
        int i2;
        int i3;
        List<ho1> list;
        if (this.U == null) {
            p(-1);
        }
        this.b = this.U.findViewById(R$id.material_drawer_account_header);
        this.a = (Guideline) this.U.findViewById(R$id.material_drawer_statusbar_guideline);
        int dimensionPixelSize = this.q.getResources().getDimensionPixelSize(R$dimen.material_drawer_account_header_height);
        int j2 = to1.j(this.q, true);
        jn1 jn1 = this.v;
        if (jn1 != null) {
            i2 = jn1.a(this.q);
        } else if (this.r) {
            i2 = this.q.getResources().getDimensionPixelSize(R$dimen.material_drawer_account_header_height_compact);
        } else {
            i2 = (int) (((double) no1.b(this.q)) * 0.5625d);
            if (Build.VERSION.SDK_INT < 19) {
                int i4 = i2 - j2;
                if (((float) i4) > ((float) dimensionPixelSize) - to1.a(8.0f, this.q)) {
                    i2 = i4;
                }
            }
        }
        if (this.E && Build.VERSION.SDK_INT >= 21) {
            this.a.setGuidelineBegin(j2);
            if (this.r) {
                i2 += j2;
            } else if (i2 - j2 <= dimensionPixelSize) {
                i2 = dimensionPixelSize + j2;
            }
        }
        l(i2);
        ImageView imageView = (ImageView) this.U.findViewById(R$id.material_drawer_account_header_background);
        this.c = imageView;
        ro1.c(this.F, imageView, mo1.c.ACCOUNT_HEADER.name());
        ImageView.ScaleType scaleType = this.G;
        if (scaleType != null) {
            this.c.setScaleType(scaleType);
        }
        int g2 = po1.g(this.w, this.q, R$attr.material_drawer_header_selection_text, R$color.material_drawer_header_selection_text);
        int g3 = po1.g(this.w, this.q, R$attr.material_drawer_header_selection_subtext, R$color.material_drawer_header_selection_subtext);
        this.p = to1.h(this.q);
        h(this.k, true);
        ImageView imageView2 = (ImageView) this.U.findViewById(R$id.material_drawer_account_header_text_switcher);
        this.e = imageView2;
        tm1 tm1 = new tm1(this.q, mn1.a.mdf_arrow_drop_down);
        tm1.I(R$dimen.material_drawer_account_header_dropdown);
        tm1.y(R$dimen.material_drawer_account_header_dropdown_padding);
        tm1.h(g3);
        imageView2.setImageDrawable(tm1);
        this.d = (BezelImageView) this.b.findViewById(R$id.material_drawer_account_header_current);
        this.f = (TextView) this.b.findViewById(R$id.material_drawer_account_header_name);
        this.g = (TextView) this.b.findViewById(R$id.material_drawer_account_header_email);
        Typeface typeface = this.t;
        if (!(typeface == null && (typeface = this.s) == null)) {
            this.f.setTypeface(typeface);
        }
        Typeface typeface2 = this.u;
        if (!(typeface2 == null && (typeface2 = this.s) == null)) {
            this.g.setTypeface(typeface2);
        }
        this.f.setTextColor(g2);
        this.g.setTextColor(g3);
        this.h = (BezelImageView) this.b.findViewById(R$id.material_drawer_account_header_small_first);
        this.i = (BezelImageView) this.b.findViewById(R$id.material_drawer_account_header_small_second);
        this.j = (BezelImageView) this.b.findViewById(R$id.material_drawer_account_header_small_third);
        g();
        f();
        Bundle bundle = this.Z;
        if (!(bundle == null || (i3 = bundle.getInt("bundle_selection_header", -1)) == -1 || (list = this.V) == null || i3 <= -1 || i3 >= list.size())) {
            n(this.V.get(i3));
        }
        c cVar = this.Y;
        if (cVar != null) {
            cVar.r(this.U, this.C, this.D);
        }
        this.q = null;
        return new a(this);
    }

    /* access modifiers changed from: protected */
    public void e() {
        ArrayList arrayList = new ArrayList();
        List<ho1> list = this.V;
        int i2 = -1;
        if (list != null) {
            int i3 = 0;
            for (ho1 next : list) {
                if (next == this.k) {
                    if (!this.x) {
                        i2 = this.Y.a.l().b(i3);
                    }
                }
                if (next instanceof go1) {
                    go1 go1 = (go1) next;
                    go1.e(false);
                    arrayList.add(go1);
                }
                i3++;
            }
        }
        this.Y.z(this.f0, this.g0, arrayList, i2);
    }

    /* access modifiers changed from: protected */
    public void f() {
        List<ho1> list;
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.h.setOnClickListener((View.OnClickListener) null);
        this.i.setVisibility(8);
        this.i.setOnClickListener((View.OnClickListener) null);
        this.j.setVisibility(8);
        this.j.setOnClickListener((View.OnClickListener) null);
        this.f.setText("");
        this.g.setText("");
        h(this.k, true);
        if (this.k != null) {
            if ((this.H || this.I) && !this.J) {
                m(this.d, this.k.getIcon());
                if (this.M) {
                    this.d.setOnClickListener(this.a0);
                    this.d.setOnLongClickListener(this.c0);
                    this.d.c(false);
                } else {
                    this.d.c(true);
                }
                this.d.setVisibility(0);
                this.d.invalidate();
            } else if (this.r) {
                this.d.setVisibility(8);
            }
            h(this.k, true);
            this.e.setVisibility(0);
            this.d.setTag(R$id.material_drawer_profile_header, this.k);
            so1.b(this.k.a(), this.f);
            so1.b(this.k.r(), this.g);
            ho1 ho1 = this.l;
            if (ho1 != null && this.H && !this.I) {
                m(this.h, ho1.getIcon());
                this.h.setTag(R$id.material_drawer_profile_header, this.l);
                if (this.M) {
                    this.h.setOnClickListener(this.b0);
                    this.h.setOnLongClickListener(this.d0);
                    this.h.c(false);
                } else {
                    this.h.c(true);
                }
                this.h.setVisibility(0);
                this.h.invalidate();
            }
            ho1 ho12 = this.m;
            if (ho12 != null && this.H && !this.I) {
                m(this.i, ho12.getIcon());
                this.i.setTag(R$id.material_drawer_profile_header, this.m);
                if (this.M) {
                    this.i.setOnClickListener(this.b0);
                    this.i.setOnLongClickListener(this.d0);
                    this.i.c(false);
                } else {
                    this.i.c(true);
                }
                this.i.setVisibility(0);
                this.i.invalidate();
            }
            ho1 ho13 = this.n;
            if (ho13 != null && this.O && this.H && !this.I) {
                m(this.j, ho13.getIcon());
                this.j.setTag(R$id.material_drawer_profile_header, this.n);
                if (this.M) {
                    this.j.setOnClickListener(this.b0);
                    this.j.setOnLongClickListener(this.d0);
                    this.j.c(false);
                } else {
                    this.j.c(true);
                }
                this.j.setVisibility(0);
                this.j.invalidate();
            }
        } else {
            List<ho1> list2 = this.V;
            if (list2 != null && list2.size() > 0) {
                this.b.setTag(R$id.material_drawer_profile_header, this.V.get(0));
                h(this.k, true);
                this.e.setVisibility(0);
                ho1 ho14 = this.k;
                if (ho14 != null) {
                    so1.b(ho14.a(), this.f);
                    so1.b(this.k.r(), this.g);
                }
            }
        }
        if (!this.y) {
            this.f.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.A)) {
            this.f.setText(this.A);
        }
        if (!this.z) {
            this.g.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.B)) {
            this.g.setText(this.B);
        }
        if (!this.T || (!this.S && this.l == null && ((list = this.V) == null || list.size() == 1))) {
            this.e.setVisibility(8);
            h((ho1) null, false);
        }
        if (this.R != null) {
            h(this.k, true);
        }
    }

    /* access modifiers changed from: protected */
    public void g() {
        Object pop;
        boolean z2;
        if (this.V == null) {
            this.V = new ArrayList();
        }
        ho1 ho1 = this.k;
        int i2 = 0;
        if (ho1 == null) {
            int size = this.V.size();
            int i3 = 0;
            while (i2 < size) {
                if (this.V.size() > i2 && this.V.get(i2).b()) {
                    if (i3 == 0 && this.k == null) {
                        this.k = this.V.get(i2);
                    } else if (i3 == 1 && this.l == null) {
                        this.l = this.V.get(i2);
                    } else if (i3 == 2 && this.m == null) {
                        this.m = this.V.get(i2);
                    } else if (i3 == 3 && this.n == null) {
                        this.n = this.V.get(i2);
                    }
                    i3++;
                }
                i2++;
            }
            return;
        }
        ho1[] ho1Arr = {ho1, this.l, this.m, this.n};
        Object[] objArr = new ho1[4];
        Stack stack = new Stack();
        for (int i4 = 0; i4 < this.V.size(); i4++) {
            ho1 ho12 = this.V.get(i4);
            if (ho12.b()) {
                int i5 = 0;
                while (true) {
                    if (i5 >= 4) {
                        z2 = false;
                        break;
                    } else if (ho1Arr[i5] == ho12) {
                        objArr[i5] = ho12;
                        z2 = true;
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z2) {
                    stack.push(ho12);
                }
            }
        }
        Stack stack2 = new Stack();
        while (i2 < 4) {
            if (objArr[i2] != null) {
                pop = objArr[i2];
            } else if (!stack.isEmpty()) {
                pop = stack.pop();
            } else {
                i2++;
            }
            stack2.push(pop);
            i2++;
        }
        Stack stack3 = new Stack();
        while (!stack2.empty()) {
            stack3.push(stack2.pop());
        }
        if (stack3.isEmpty()) {
            this.k = null;
        } else {
            this.k = (ho1) stack3.pop();
        }
        if (stack3.isEmpty()) {
            this.l = null;
        } else {
            this.l = (ho1) stack3.pop();
        }
        if (stack3.isEmpty()) {
            this.m = null;
        } else {
            this.m = (ho1) stack3.pop();
        }
        if (stack3.isEmpty()) {
            this.n = null;
        } else {
            this.n = (ho1) stack3.pop();
        }
    }

    /* access modifiers changed from: protected */
    public void i(View view, boolean z2) {
        ho1 ho1 = (ho1) view.getTag(R$id.material_drawer_profile_header);
        n(ho1);
        k(view.getContext());
        c cVar = this.Y;
        if (!(cVar == null || cVar.c() == null || this.Y.c().p0 == null)) {
            this.Y.c().p0.c();
        }
        boolean z3 = false;
        a.b bVar = this.W;
        if (bVar != null) {
            z3 = bVar.a(view, ho1, z2);
        }
        if (z3) {
            return;
        }
        if (this.P > 0) {
            new Handler().postDelayed(new e(), (long) this.P);
            return;
        }
        c cVar2 = this.Y;
        if (cVar2 != null) {
            cVar2.a();
        }
    }

    /* access modifiers changed from: protected */
    public boolean n(ho1 ho1) {
        if (ho1 == null) {
            return false;
        }
        if (this.k == ho1) {
            return true;
        }
        char c2 = 65535;
        if (this.N) {
            if (this.l == ho1) {
                c2 = 1;
            } else if (this.m == ho1) {
                c2 = 2;
            } else if (this.n == ho1) {
                c2 = 3;
            }
            ho1 ho12 = this.k;
            this.k = ho1;
            if (c2 == 1) {
                this.l = ho12;
            } else if (c2 == 2) {
                this.m = ho12;
            } else if (c2 == 3) {
                this.n = ho12;
            }
        } else if (this.V != null) {
            ArrayList arrayList = new ArrayList(Arrays.asList(new ho1[]{this.k, this.l, this.m, this.n}));
            if (arrayList.contains(ho1)) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        i2 = -1;
                        break;
                    } else if (arrayList.get(i2) == ho1) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    arrayList.remove(i2);
                    arrayList.add(0, ho1);
                    this.k = (ho1) arrayList.get(0);
                    this.l = (ho1) arrayList.get(1);
                    this.m = (ho1) arrayList.get(2);
                    this.n = (ho1) arrayList.get(3);
                }
            } else {
                this.n = this.m;
                this.m = this.l;
                this.l = this.k;
                this.k = ho1;
            }
        }
        if (this.J) {
            this.n = this.m;
            this.m = this.l;
            this.l = this.k;
        }
        f();
        return false;
    }

    /* access modifiers changed from: protected */
    public void o(Context context) {
        c cVar = this.Y;
        if (cVar == null) {
            return;
        }
        if (cVar.A()) {
            k(context);
            return;
        }
        e();
        this.e.clearAnimation();
        t4 c2 = o4.c(this.e);
        c2.d(180.0f);
        c2.k();
    }

    public b p(int i2) {
        LayoutInflater layoutInflater;
        int i3;
        View inflate;
        Activity activity = this.q;
        if (activity != null) {
            if (i2 != -1) {
                inflate = activity.getLayoutInflater().inflate(i2, (ViewGroup) null, false);
            } else {
                if (this.r) {
                    layoutInflater = activity.getLayoutInflater();
                    i3 = R$layout.material_drawer_compact_header;
                } else {
                    layoutInflater = activity.getLayoutInflater();
                    i3 = R$layout.material_drawer_header;
                }
                inflate = layoutInflater.inflate(i3, (ViewGroup) null, false);
            }
            this.U = inflate;
            return this;
        }
        throw new RuntimeException("please pass an activity first to use this call");
    }

    public b q(Activity activity) {
        this.q = activity;
        return this;
    }

    public b r(boolean z2) {
        this.r = z2;
        return this;
    }

    public b s(boolean z2) {
        this.x = z2;
        return this;
    }

    public b t(int i2) {
        this.F = new kn1(i2);
        return this;
    }

    public b u(a.b bVar) {
        this.W = bVar;
        return this;
    }

    public b v(boolean z2) {
        this.I = z2;
        return this;
    }
}
