package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import androidx.fragment.app.s;
import androidx.preference.DialogPreference;
import androidx.preference.j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class g extends Fragment implements j.c, j.a, j.b, DialogPreference.a {
    private final c a0 = new c();
    private j b0;
    RecyclerView c0;
    private boolean d0;
    private boolean e0;
    private int f0 = R$layout.preference_list_fragment;
    private Runnable g0;
    private Handler h0 = new a();
    private final Runnable i0 = new b();

    class a extends Handler {
        a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                g.this.J1();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            RecyclerView recyclerView = g.this.c0;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    private class c extends RecyclerView.n {
        private Drawable a;
        private int b;
        private boolean c = true;

        c() {
        }

        private boolean m(View view, RecyclerView recyclerView) {
            RecyclerView.c0 g0 = recyclerView.g0(view);
            boolean z = false;
            if (!((g0 instanceof l) && ((l) g0).O())) {
                return false;
            }
            boolean z2 = this.c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            RecyclerView.c0 g02 = recyclerView.g0(recyclerView.getChildAt(indexOfChild + 1));
            if ((g02 instanceof l) && ((l) g02).N()) {
                z = true;
            }
            return z;
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            if (m(view, recyclerView)) {
                rect.bottom = this.b;
            }
        }

        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if (this.a != null) {
                int childCount = recyclerView.getChildCount();
                int width = recyclerView.getWidth();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    if (m(childAt, recyclerView)) {
                        int y = ((int) childAt.getY()) + childAt.getHeight();
                        this.a.setBounds(0, y, width, this.b + y);
                        this.a.draw(canvas);
                    }
                }
            }
        }

        public void j(boolean z) {
            this.c = z;
        }

        public void k(Drawable drawable) {
            this.b = drawable != null ? drawable.getIntrinsicHeight() : 0;
            this.a = drawable;
            g.this.c0.u0();
        }

        public void l(int i) {
            this.b = i;
            g.this.c0.u0();
        }
    }

    public interface d {
        boolean a(g gVar, Preference preference);
    }

    public interface e {
        boolean a(g gVar, Preference preference);
    }

    public interface f {
        boolean a(g gVar, PreferenceScreen preferenceScreen);
    }

    private void T1() {
        if (!this.h0.hasMessages(1)) {
            this.h0.obtainMessage(1).sendToTarget();
        }
    }

    private void U1() {
        if (this.b0 == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void Z1() {
        L1().setAdapter((RecyclerView.g) null);
        PreferenceScreen M1 = M1();
        if (M1 != null) {
            M1.f0();
        }
        S1();
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        PreferenceScreen M1 = M1();
        if (M1 != null) {
            Bundle bundle2 = new Bundle();
            M1.B0(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    public void J1() {
        PreferenceScreen M1 = M1();
        if (M1 != null) {
            L1().setAdapter(O1(M1));
            M1.Z();
        }
        N1();
    }

    public void K0() {
        super.K0();
        this.b0.o(this);
        this.b0.m(this);
    }

    public Fragment K1() {
        return null;
    }

    public void L0() {
        super.L0();
        this.b0.o((j.c) null);
        this.b0.m((j.a) null);
    }

    public final RecyclerView L1() {
        return this.c0;
    }

    public void M0(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen M1;
        super.M0(view, bundle);
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (M1 = M1()) == null)) {
            M1.A0(bundle2);
        }
        if (this.d0) {
            J1();
            Runnable runnable = this.g0;
            if (runnable != null) {
                runnable.run();
                this.g0 = null;
            }
        }
        this.e0 = true;
    }

    public PreferenceScreen M1() {
        return this.b0.i();
    }

    /* access modifiers changed from: protected */
    public void N1() {
    }

    /* access modifiers changed from: protected */
    public RecyclerView.g O1(PreferenceScreen preferenceScreen) {
        return new h(preferenceScreen);
    }

    public RecyclerView.o P1() {
        return new LinearLayoutManager(u());
    }

    public abstract void Q1(Bundle bundle, String str);

    public RecyclerView R1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (u().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R$id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R$layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(P1());
        recyclerView2.setAccessibilityDelegateCompat(new k(recyclerView2));
        return recyclerView2;
    }

    /* access modifiers changed from: protected */
    public void S1() {
    }

    public void V1(Drawable drawable) {
        this.a0.k(drawable);
    }

    public void W1(int i) {
        this.a0.l(i);
    }

    public void X1(PreferenceScreen preferenceScreen) {
        if (this.b0.p(preferenceScreen) && preferenceScreen != null) {
            S1();
            this.d0 = true;
            if (this.e0) {
                T1();
            }
        }
    }

    public void Y1(int i, String str) {
        U1();
        PreferenceScreen k = this.b0.k(u(), i, (PreferenceScreen) null);
        Object obj = k;
        if (str != null) {
            Object X0 = k.X0(str);
            boolean z = X0 instanceof PreferenceScreen;
            obj = X0;
            if (!z) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        X1((PreferenceScreen) obj);
    }

    public <T extends Preference> T b(CharSequence charSequence) {
        j jVar = this.b0;
        if (jVar == null) {
            return null;
        }
        return jVar.a(charSequence);
    }

    public void d(Preference preference) {
        androidx.fragment.app.c cVar;
        boolean a2 = K1() instanceof d ? ((d) K1()).a(this, preference) : false;
        if (!a2 && (n() instanceof d)) {
            a2 = ((d) n()).a(this, preference);
        }
        if (!a2 && G().Z("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                cVar = a.f2(preference.x());
            } else if (preference instanceof ListPreference) {
                cVar = c.f2(preference.x());
            } else if (preference instanceof MultiSelectListPreference) {
                cVar = d.f2(preference.x());
            } else {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            cVar.C1(this, 0);
            cVar.W1(G(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public void e(PreferenceScreen preferenceScreen) {
        if (!(K1() instanceof f ? ((f) K1()).a(this, preferenceScreen) : false) && (n() instanceof f)) {
            ((f) n()).a(this, preferenceScreen);
        }
    }

    public boolean f(Preference preference) {
        if (preference.t() == null) {
            return false;
        }
        boolean a2 = K1() instanceof e ? ((e) K1()).a(this, preference) : false;
        if (!a2 && (n() instanceof e)) {
            a2 = ((e) n()).a(this, preference);
        }
        if (a2) {
            return true;
        }
        k q = m1().q();
        Bundle r = preference.r();
        Fragment a3 = q.h0().a(m1().getClassLoader(), preference.t());
        a3.u1(r);
        a3.C1(this, 0);
        s j = q.j();
        j.q(((View) Q().getParent()).getId(), a3);
        j.g((String) null);
        j.i();
        return true;
    }

    public void n0(Bundle bundle) {
        super.n0(bundle);
        TypedValue typedValue = new TypedValue();
        n().getTheme().resolveAttribute(R$attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R$style.PreferenceThemeOverlay;
        }
        n().getTheme().applyStyle(i, false);
        j jVar = new j(u());
        this.b0 = jVar;
        jVar.n(this);
        Q1(bundle, s() != null ? s().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = u().obtainStyledAttributes((AttributeSet) null, R$styleable.PreferenceFragmentCompat, R$attr.preferenceFragmentCompatStyle, 0);
        this.f0 = obtainStyledAttributes.getResourceId(R$styleable.PreferenceFragmentCompat_android_layout, this.f0);
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.PreferenceFragmentCompat_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.PreferenceFragmentCompat_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(R$styleable.PreferenceFragmentCompat_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(u());
        View inflate = cloneInContext.inflate(this.f0, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView R1 = R1(cloneInContext, viewGroup2, bundle);
            if (R1 != null) {
                this.c0 = R1;
                R1.h(this.a0);
                V1(drawable);
                if (dimensionPixelSize != -1) {
                    W1(dimensionPixelSize);
                }
                this.a0.j(z);
                if (this.c0.getParent() == null) {
                    viewGroup2.addView(this.c0);
                }
                this.h0.post(this.i0);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public void u0() {
        this.h0.removeCallbacks(this.i0);
        this.h0.removeMessages(1);
        if (this.d0) {
            Z1();
        }
        this.c0 = null;
        super.u0();
    }
}
