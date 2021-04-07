package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.materialdrawer.R$attr;
import com.mikepenz.materialdrawer.R$color;
import com.mikepenz.materialdrawer.R$id;
import com.mikepenz.materialdrawer.R$layout;
import com.mikepenz.materialdrawer.R$styleable;
import java.util.List;

/* renamed from: co1  reason: default package */
public class co1 extends qn1<co1, b> implements ho1<co1> {
    private kn1 l;
    private ln1 m;
    private ln1 n;
    private boolean o = false;
    private in1 p;
    private in1 q;
    private in1 r;
    private in1 s;
    private Typeface t = null;
    private boolean u = false;

    /* renamed from: co1$b */
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
            this.y = (ImageView) view.findViewById(R$id.material_drawer_icon);
            this.z = (TextView) view.findViewById(R$id.material_drawer_name);
            this.A = (TextView) view.findViewById(R$id.material_drawer_description);
        }
    }

    public /* bridge */ /* synthetic */ Object E(boolean z) {
        T(z);
        return this;
    }

    /* renamed from: H */
    public void q(b bVar, List list) {
        super.q(bVar, list);
        Context context = bVar.e.getContext();
        bVar.e.setId(hashCode());
        bVar.e.setEnabled(isEnabled());
        bVar.e.setSelected(f());
        int L = L(context);
        int g = po1.g(N(), context, R$attr.material_drawer_primary_text, R$color.material_drawer_primary_text);
        int g2 = po1.g(K(), context, R$attr.material_drawer_primary_icon, R$color.material_drawer_primary_icon);
        int g3 = po1.g(J(), context, R$attr.material_drawer_primary_text, R$color.material_drawer_primary_text);
        o4.l0(bVar.x, to1.g(context, L, z()));
        so1.b(a(), bVar.z);
        bVar.z.setTextColor(g);
        so1.d(I(), bVar.A);
        bVar.A.setTextColor(g3);
        if (O() != null) {
            bVar.z.setTypeface(O());
            bVar.A.setTypeface(O());
        }
        kn1.j(this.l, bVar.y, g2, Q(), 2);
        no1.f(bVar.x);
        A(this, bVar.e);
    }

    public ln1 I() {
        return this.n;
    }

    public in1 J() {
        return this.s;
    }

    public in1 K() {
        return this.r;
    }

    /* access modifiers changed from: protected */
    public int L(Context context) {
        in1 M;
        int i;
        int i2;
        if (no1.a(context, R$styleable.MaterialDrawer_material_drawer_legacy_style, false)) {
            M = M();
            i = R$attr.material_drawer_selected_legacy;
            i2 = R$color.material_drawer_selected_legacy;
        } else {
            M = M();
            i = R$attr.material_drawer_selected;
            i2 = R$color.material_drawer_selected;
        }
        return po1.g(M, context, i, i2);
    }

    public in1 M() {
        return this.p;
    }

    public in1 N() {
        return this.q;
    }

    public Typeface O() {
        return this.t;
    }

    /* renamed from: P */
    public b y(View view) {
        return new b(view);
    }

    public boolean Q() {
        return this.o;
    }

    public co1 R(zm1 zm1) {
        this.l = new kn1(zm1);
        return this;
    }

    public co1 S(CharSequence charSequence) {
        this.m = new ln1(charSequence);
        return this;
    }

    public co1 T(boolean z) {
        this.u = z;
        return this;
    }

    public ln1 a() {
        return this.m;
    }

    public boolean b() {
        return this.u;
    }

    public int d() {
        return R$id.material_drawer_item_profile_setting;
    }

    public kn1 getIcon() {
        return this.l;
    }

    public int h() {
        return R$layout.material_drawer_item_profile_setting;
    }

    public ln1 r() {
        return this.n;
    }
}
