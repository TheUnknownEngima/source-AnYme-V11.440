package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.c0;
import com.mikepenz.materialdrawer.R$attr;
import com.mikepenz.materialdrawer.R$color;
import com.mikepenz.materialdrawer.R$styleable;

/* renamed from: tn1  reason: default package */
public abstract class tn1<T, VH extends RecyclerView.c0> extends qn1<T, VH> {
    protected kn1 l;
    protected kn1 m;
    protected ln1 n;
    protected boolean o = false;
    protected in1 p;
    protected in1 q;
    protected in1 r;
    protected in1 s;
    protected in1 t;
    protected in1 u;
    protected in1 v;
    protected Typeface w = null;
    protected Pair<Integer, ColorStateList> x;
    protected int y = 1;

    /* access modifiers changed from: protected */
    public int H(Context context) {
        int i;
        int i2;
        in1 in1;
        if (isEnabled()) {
            in1 = T();
            i2 = R$attr.material_drawer_primary_text;
            i = R$color.material_drawer_primary_text;
        } else {
            in1 = J();
            i2 = R$attr.material_drawer_hint_text;
            i = R$color.material_drawer_hint_text;
        }
        return po1.g(in1, context, i2, i);
    }

    public in1 I() {
        return this.v;
    }

    public in1 J() {
        return this.s;
    }

    public int K(Context context) {
        int i;
        int i2;
        in1 in1;
        if (isEnabled()) {
            in1 = L();
            i2 = R$attr.material_drawer_primary_icon;
            i = R$color.material_drawer_primary_icon;
        } else {
            in1 = I();
            i2 = R$attr.material_drawer_hint_icon;
            i = R$color.material_drawer_hint_icon;
        }
        return po1.g(in1, context, i2, i);
    }

    public in1 L() {
        return this.t;
    }

    /* access modifiers changed from: protected */
    public int M(Context context) {
        in1 N;
        int i;
        int i2;
        if (no1.a(context, R$styleable.MaterialDrawer_material_drawer_legacy_style, false)) {
            N = N();
            i = R$attr.material_drawer_selected_legacy;
            i2 = R$color.material_drawer_selected_legacy;
        } else {
            N = N();
            i = R$attr.material_drawer_selected;
            i2 = R$color.material_drawer_selected;
        }
        return po1.g(N, context, i, i2);
    }

    public in1 N() {
        return this.p;
    }

    public kn1 O() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    public int P(Context context) {
        return po1.g(Q(), context, R$attr.material_drawer_selected_text, R$color.material_drawer_selected_text);
    }

    public in1 Q() {
        return this.u;
    }

    /* access modifiers changed from: protected */
    public int R(Context context) {
        return po1.g(S(), context, R$attr.material_drawer_selected_text, R$color.material_drawer_selected_text);
    }

    public in1 S() {
        return this.r;
    }

    public in1 T() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    public ColorStateList U(int i, int i2) {
        Pair<Integer, ColorStateList> pair = this.x;
        if (pair == null || i + i2 != ((Integer) pair.first).intValue()) {
            this.x = new Pair<>(Integer.valueOf(i + i2), no1.d(i, i2));
        }
        return (ColorStateList) this.x.second;
    }

    public Typeface V() {
        return this.w;
    }

    public boolean W() {
        return this.o;
    }

    public T X(int i) {
        this.l = new kn1(i);
        return this;
    }

    public T Y(zm1 zm1) {
        this.l = new kn1(zm1);
        if (Build.VERSION.SDK_INT >= 21) {
            this.m = new kn1(zm1);
        } else {
            Z(true);
        }
        return this;
    }

    public T Z(boolean z) {
        this.o = z;
        return this;
    }

    public ln1 a() {
        return this.n;
    }

    public T a0(String str) {
        this.n = new ln1(str);
        return this;
    }

    public T b0(int i) {
        this.q = in1.j(i);
        return this;
    }

    public T c0(int i) {
        this.q = in1.k(i);
        return this;
    }

    public kn1 getIcon() {
        return this.l;
    }
}
