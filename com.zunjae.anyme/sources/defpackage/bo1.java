package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.materialdrawer.R$attr;
import com.mikepenz.materialdrawer.R$color;
import com.mikepenz.materialdrawer.R$id;
import com.mikepenz.materialdrawer.R$layout;
import com.mikepenz.materialdrawer.R$styleable;
import defpackage.mo1;
import java.util.List;

/* renamed from: bo1  reason: default package */
public class bo1 extends qn1<bo1, b> implements ho1<bo1> {
    protected boolean l = false;
    protected kn1 m;
    protected ln1 n;
    protected ln1 o;
    protected in1 p;
    protected in1 q;
    protected in1 r;
    protected in1 s;
    protected Typeface t = null;
    protected Pair<Integer, ColorStateList> u;

    /* renamed from: bo1$b */
    public static class b extends RecyclerView.c0 {
        /* access modifiers changed from: private */
        public TextView A;
        /* access modifiers changed from: private */
        public View x;
        /* access modifiers changed from: private */
        public ImageView y;
        /* access modifiers changed from: private */
        public TextView z;

        private b(View view) {
            super(view);
            this.x = view;
            this.y = (ImageView) view.findViewById(R$id.material_drawer_profileIcon);
            this.z = (TextView) view.findViewById(R$id.material_drawer_name);
            this.A = (TextView) view.findViewById(R$id.material_drawer_email);
        }
    }

    /* renamed from: H */
    public void q(b bVar, List list) {
        super.q(bVar, list);
        Context context = bVar.e.getContext();
        bVar.e.setId(hashCode());
        bVar.e.setEnabled(isEnabled());
        bVar.e.setSelected(f());
        int K = K(context);
        int I = I(context);
        int M = M(context);
        no1.h(context, bVar.x, K, z());
        if (this.l) {
            bVar.z.setVisibility(0);
            so1.b(a(), bVar.z);
        } else {
            bVar.z.setVisibility(8);
        }
        so1.b((this.l || r() != null || a() == null) ? r() : a(), bVar.A);
        if (Q() != null) {
            bVar.z.setTypeface(Q());
            bVar.A.setTypeface(Q());
        }
        if (this.l) {
            bVar.z.setTextColor(P(I, M));
        }
        bVar.A.setTextColor(P(I, M));
        mo1.c().a(bVar.y);
        ro1.e(getIcon(), bVar.y, mo1.c.PROFILE_DRAWER_ITEM.name());
        no1.f(bVar.x);
        A(this, bVar.e);
    }

    /* access modifiers changed from: protected */
    public int I(Context context) {
        int i;
        int i2;
        in1 in1;
        if (isEnabled()) {
            in1 = O();
            i2 = R$attr.material_drawer_primary_text;
            i = R$color.material_drawer_primary_text;
        } else {
            in1 = J();
            i2 = R$attr.material_drawer_hint_text;
            i = R$color.material_drawer_hint_text;
        }
        return po1.g(in1, context, i2, i);
    }

    public in1 J() {
        return this.s;
    }

    /* access modifiers changed from: protected */
    public int K(Context context) {
        in1 L;
        int i;
        int i2;
        if (no1.a(context, R$styleable.MaterialDrawer_material_drawer_legacy_style, false)) {
            L = L();
            i = R$attr.material_drawer_selected_legacy;
            i2 = R$color.material_drawer_selected_legacy;
        } else {
            L = L();
            i = R$attr.material_drawer_selected;
            i2 = R$color.material_drawer_selected;
        }
        return po1.g(L, context, i, i2);
    }

    public in1 L() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    public int M(Context context) {
        return po1.g(N(), context, R$attr.material_drawer_selected_text, R$color.material_drawer_selected_text);
    }

    public in1 N() {
        return this.r;
    }

    public in1 O() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    public ColorStateList P(int i, int i2) {
        Pair<Integer, ColorStateList> pair = this.u;
        if (pair == null || i + i2 != ((Integer) pair.first).intValue()) {
            this.u = new Pair<>(Integer.valueOf(i + i2), no1.d(i, i2));
        }
        return (ColorStateList) this.u.second;
    }

    public Typeface Q() {
        return this.t;
    }

    /* renamed from: R */
    public b y(View view) {
        return new b(view);
    }

    public bo1 S(String str) {
        this.o = new ln1(str);
        return this;
    }

    public bo1 T(String str) {
        this.m = new kn1(str);
        return this;
    }

    public bo1 U(CharSequence charSequence) {
        this.n = new ln1(charSequence);
        return this;
    }

    public ln1 a() {
        return this.n;
    }

    public int d() {
        return R$id.material_drawer_item_profile;
    }

    public kn1 getIcon() {
        return this.m;
    }

    public int h() {
        return R$layout.material_drawer_item_profile;
    }

    public ln1 r() {
        return this.o;
    }
}
