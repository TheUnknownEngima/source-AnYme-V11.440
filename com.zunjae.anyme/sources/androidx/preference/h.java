package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import java.util.ArrayList;
import java.util.List;

public class h extends RecyclerView.g<l> implements Preference.c {
    private PreferenceGroup c;
    private List<Preference> d;
    private List<Preference> e;
    private List<d> f;
    private Handler g;
    private Runnable h = new a();

    class a implements Runnable {
        a() {
        }

        public void run() {
            h.this.O();
        }
    }

    class b extends f.b {
        final /* synthetic */ List a;
        final /* synthetic */ List b;
        final /* synthetic */ j.d c;

        b(h hVar, List list, List list2, j.d dVar) {
            this.a = list;
            this.b = list2;
            this.c = dVar;
        }

        public boolean a(int i, int i2) {
            return this.c.a((Preference) this.a.get(i), (Preference) this.b.get(i2));
        }

        public boolean b(int i, int i2) {
            return this.c.b((Preference) this.a.get(i), (Preference) this.b.get(i2));
        }

        public int d() {
            return this.b.size();
        }

        public int e() {
            return this.a.size();
        }
    }

    class c implements Preference.e {
        final /* synthetic */ PreferenceGroup a;

        c(PreferenceGroup preferenceGroup) {
            this.a = preferenceGroup;
        }

        public boolean a(Preference preference) {
            this.a.h1(Integer.MAX_VALUE);
            h.this.b(preference);
            PreferenceGroup.b Z0 = this.a.Z0();
            if (Z0 == null) {
                return true;
            }
            Z0.a();
            return true;
        }
    }

    private static class d {
        int a;
        int b;
        String c;

        d(Preference preference) {
            this.c = preference.getClass().getName();
            this.a = preference.z();
            this.b = preference.N();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && TextUtils.equals(this.c, dVar.c);
        }

        public int hashCode() {
            return ((((527 + this.a) * 31) + this.b) * 31) + this.c.hashCode();
        }
    }

    public h(PreferenceGroup preferenceGroup) {
        this.c = preferenceGroup;
        this.g = new Handler();
        this.c.I0(this);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.c;
        F(preferenceGroup2 instanceof PreferenceScreen ? ((PreferenceScreen) preferenceGroup2).k1() : true);
        O();
    }

    private b H(PreferenceGroup preferenceGroup, List<Preference> list) {
        b bVar = new b(preferenceGroup.q(), list, preferenceGroup.v());
        bVar.K0(new c(preferenceGroup));
        return bVar;
    }

    private List<Preference> I(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int b1 = preferenceGroup.b1();
        int i = 0;
        for (int i2 = 0; i2 < b1; i2++) {
            Preference a1 = preferenceGroup.a1(i2);
            if (a1.U()) {
                if (!L(preferenceGroup) || i < preferenceGroup.Y0()) {
                    arrayList.add(a1);
                } else {
                    arrayList2.add(a1);
                }
                if (!(a1 instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) a1;
                    if (!preferenceGroup2.c1()) {
                        continue;
                    } else if (!L(preferenceGroup) || !L(preferenceGroup2)) {
                        for (Preference next : I(preferenceGroup2)) {
                            if (!L(preferenceGroup) || i < preferenceGroup.Y0()) {
                                arrayList.add(next);
                            } else {
                                arrayList2.add(next);
                            }
                            i++;
                        }
                    } else {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                }
            }
        }
        if (L(preferenceGroup) && i > preferenceGroup.Y0()) {
            arrayList.add(H(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private void J(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.j1();
        int b1 = preferenceGroup.b1();
        for (int i = 0; i < b1; i++) {
            Preference a1 = preferenceGroup.a1(i);
            list.add(a1);
            d dVar = new d(a1);
            if (!this.f.contains(dVar)) {
                this.f.add(dVar);
            }
            if (a1 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) a1;
                if (preferenceGroup2.c1()) {
                    J(list, preferenceGroup2);
                }
            }
            a1.I0(this);
        }
    }

    private boolean L(PreferenceGroup preferenceGroup) {
        return preferenceGroup.Y0() != Integer.MAX_VALUE;
    }

    public Preference K(int i) {
        if (i < 0 || i >= g()) {
            return null;
        }
        return this.e.get(i);
    }

    /* renamed from: M */
    public void w(l lVar, int i) {
        K(i).c0(lVar);
    }

    /* renamed from: N */
    public l y(ViewGroup viewGroup, int i) {
        d dVar = this.f.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, R$styleable.BackgroundStyle);
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = f.d(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(dVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            o4.l0(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = dVar.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new l(inflate);
    }

    /* access modifiers changed from: package-private */
    public void O() {
        for (Preference I0 : this.d) {
            I0.I0((Preference.c) null);
        }
        ArrayList arrayList = new ArrayList(this.d.size());
        this.d = arrayList;
        J(arrayList, this.c);
        List<Preference> list = this.e;
        List<Preference> I = I(this.c);
        this.e = I;
        j I2 = this.c.I();
        if (I2 == null || I2.g() == null) {
            l();
        } else {
            f.a(new b(this, list, I, I2.g())).e(this);
        }
        for (Preference f2 : this.d) {
            f2.f();
        }
    }

    public void b(Preference preference) {
        this.g.removeCallbacks(this.h);
        this.g.post(this.h);
    }

    public void d(Preference preference) {
        int indexOf = this.e.indexOf(preference);
        if (indexOf != -1) {
            n(indexOf, preference);
        }
    }

    public int g() {
        return this.e.size();
    }

    public long h(int i) {
        if (!k()) {
            return -1;
        }
        return K(i).v();
    }

    public int i(int i) {
        d dVar = new d(K(i));
        int indexOf = this.f.indexOf(dVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f.size();
        this.f.add(dVar);
        return size;
    }
}
