package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.preference.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Preference implements Comparable<Preference> {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private int L;
    private c M;
    private List<Preference> N;
    private PreferenceGroup O;
    private boolean P;
    private f Q;
    private g R;
    private final View.OnClickListener S;
    private Context e;
    private j f;
    private e g;
    private long h;
    private boolean i;
    private d j;
    private e k;
    private int l;
    private int m;
    private CharSequence n;
    private CharSequence o;
    private int p;
    private Drawable q;
    private String r;
    private Intent s;
    private String t;
    private Bundle u;
    private boolean v;
    private boolean w;
    private boolean x;
    private String y;
    private Object z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            Preference.this.t0(view);
        }
    }

    public static class b extends AbsSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        static class a implements Parcelable.Creator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* renamed from: b */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    interface c {
        void b(Preference preference);

        void d(Preference preference);
    }

    public interface d {
        boolean a(Preference preference, Object obj);
    }

    public interface e {
        boolean a(Preference preference);
    }

    private static class f implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        private final Preference e;

        f(Preference preference) {
            this.e = preference;
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence K = this.e.K();
            if (this.e.P() && !TextUtils.isEmpty(K)) {
                contextMenu.setHeaderTitle(K);
                contextMenu.add(0, 0, 0, R$string.copy).setOnMenuItemClickListener(this);
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CharSequence K = this.e.K();
            ((ClipboardManager) this.e.q().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", K));
            Toast.makeText(this.e.q(), this.e.q().getString(R$string.preference_copied, new Object[]{K}), 0).show();
            return true;
        }
    }

    public interface g<T extends Preference> {
        CharSequence a(T t);
    }

    public Preference(Context context) {
        this(context, (AttributeSet) null);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i2.a(context, R$attr.preferenceStyle, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Preference(android.content.Context r5, android.util.AttributeSet r6, int r7, int r8) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r4.l = r0
            r1 = 0
            r4.m = r1
            r2 = 1
            r4.v = r2
            r4.w = r2
            r4.x = r2
            r4.A = r2
            r4.B = r2
            r4.C = r2
            r4.D = r2
            r4.E = r2
            r4.G = r2
            r4.J = r2
            int r3 = androidx.preference.R$layout.preference
            r4.K = r3
            androidx.preference.Preference$a r3 = new androidx.preference.Preference$a
            r3.<init>()
            r4.S = r3
            r4.e = r5
            int[] r3 = androidx.preference.R$styleable.Preference
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r3, r7, r8)
            int r6 = androidx.preference.R$styleable.Preference_icon
            int r7 = androidx.preference.R$styleable.Preference_android_icon
            int r6 = defpackage.i2.n(r5, r6, r7, r1)
            r4.p = r6
            int r6 = androidx.preference.R$styleable.Preference_key
            int r7 = androidx.preference.R$styleable.Preference_android_key
            java.lang.String r6 = defpackage.i2.o(r5, r6, r7)
            r4.r = r6
            int r6 = androidx.preference.R$styleable.Preference_title
            int r7 = androidx.preference.R$styleable.Preference_android_title
            java.lang.CharSequence r6 = defpackage.i2.p(r5, r6, r7)
            r4.n = r6
            int r6 = androidx.preference.R$styleable.Preference_summary
            int r7 = androidx.preference.R$styleable.Preference_android_summary
            java.lang.CharSequence r6 = defpackage.i2.p(r5, r6, r7)
            r4.o = r6
            int r6 = androidx.preference.R$styleable.Preference_order
            int r7 = androidx.preference.R$styleable.Preference_android_order
            int r6 = defpackage.i2.d(r5, r6, r7, r0)
            r4.l = r6
            int r6 = androidx.preference.R$styleable.Preference_fragment
            int r7 = androidx.preference.R$styleable.Preference_android_fragment
            java.lang.String r6 = defpackage.i2.o(r5, r6, r7)
            r4.t = r6
            int r6 = androidx.preference.R$styleable.Preference_layout
            int r7 = androidx.preference.R$styleable.Preference_android_layout
            int r8 = androidx.preference.R$layout.preference
            int r6 = defpackage.i2.n(r5, r6, r7, r8)
            r4.K = r6
            int r6 = androidx.preference.R$styleable.Preference_widgetLayout
            int r7 = androidx.preference.R$styleable.Preference_android_widgetLayout
            int r6 = defpackage.i2.n(r5, r6, r7, r1)
            r4.L = r6
            int r6 = androidx.preference.R$styleable.Preference_enabled
            int r7 = androidx.preference.R$styleable.Preference_android_enabled
            boolean r6 = defpackage.i2.b(r5, r6, r7, r2)
            r4.v = r6
            int r6 = androidx.preference.R$styleable.Preference_selectable
            int r7 = androidx.preference.R$styleable.Preference_android_selectable
            boolean r6 = defpackage.i2.b(r5, r6, r7, r2)
            r4.w = r6
            int r6 = androidx.preference.R$styleable.Preference_persistent
            int r7 = androidx.preference.R$styleable.Preference_android_persistent
            boolean r6 = defpackage.i2.b(r5, r6, r7, r2)
            r4.x = r6
            int r6 = androidx.preference.R$styleable.Preference_dependency
            int r7 = androidx.preference.R$styleable.Preference_android_dependency
            java.lang.String r6 = defpackage.i2.o(r5, r6, r7)
            r4.y = r6
            int r6 = androidx.preference.R$styleable.Preference_allowDividerAbove
            boolean r7 = r4.w
            boolean r6 = defpackage.i2.b(r5, r6, r6, r7)
            r4.D = r6
            int r6 = androidx.preference.R$styleable.Preference_allowDividerBelow
            boolean r7 = r4.w
            boolean r6 = defpackage.i2.b(r5, r6, r6, r7)
            r4.E = r6
            int r6 = androidx.preference.R$styleable.Preference_defaultValue
            boolean r6 = r5.hasValue(r6)
            if (r6 == 0) goto L_0x00d2
            int r6 = androidx.preference.R$styleable.Preference_defaultValue
        L_0x00cb:
            java.lang.Object r6 = r4.g0(r5, r6)
            r4.z = r6
            goto L_0x00dd
        L_0x00d2:
            int r6 = androidx.preference.R$styleable.Preference_android_defaultValue
            boolean r6 = r5.hasValue(r6)
            if (r6 == 0) goto L_0x00dd
            int r6 = androidx.preference.R$styleable.Preference_android_defaultValue
            goto L_0x00cb
        L_0x00dd:
            int r6 = androidx.preference.R$styleable.Preference_shouldDisableView
            int r7 = androidx.preference.R$styleable.Preference_android_shouldDisableView
            boolean r6 = defpackage.i2.b(r5, r6, r7, r2)
            r4.J = r6
            int r6 = androidx.preference.R$styleable.Preference_singleLineTitle
            boolean r6 = r5.hasValue(r6)
            r4.F = r6
            if (r6 == 0) goto L_0x00fb
            int r6 = androidx.preference.R$styleable.Preference_singleLineTitle
            int r7 = androidx.preference.R$styleable.Preference_android_singleLineTitle
            boolean r6 = defpackage.i2.b(r5, r6, r7, r2)
            r4.G = r6
        L_0x00fb:
            int r6 = androidx.preference.R$styleable.Preference_iconSpaceReserved
            int r7 = androidx.preference.R$styleable.Preference_android_iconSpaceReserved
            boolean r6 = defpackage.i2.b(r5, r6, r7, r1)
            r4.H = r6
            int r6 = androidx.preference.R$styleable.Preference_isPreferenceVisible
            boolean r6 = defpackage.i2.b(r5, r6, r6, r2)
            r4.C = r6
            int r6 = androidx.preference.R$styleable.Preference_enableCopying
            boolean r6 = defpackage.i2.b(r5, r6, r6, r1)
            r4.I = r6
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    private void D0(View view, boolean z2) {
        view.setEnabled(z2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                D0(viewGroup.getChildAt(childCount), z2);
            }
        }
    }

    private void S0(SharedPreferences.Editor editor) {
        if (this.f.r()) {
            editor.apply();
        }
    }

    private void T0() {
        Preference m2;
        String str = this.y;
        if (str != null && (m2 = m(str)) != null) {
            m2.U0(this);
        }
    }

    private void U0(Preference preference) {
        List<Preference> list = this.N;
        if (list != null) {
            list.remove(preference);
        }
    }

    private void l() {
        Object obj;
        boolean z2 = true;
        if (H() != null) {
            p0(true, this.z);
            return;
        }
        if (!R0() || !J().contains(this.r)) {
            obj = this.z;
            if (obj != null) {
                z2 = false;
            } else {
                return;
            }
        } else {
            obj = null;
        }
        p0(z2, obj);
    }

    private void y0() {
        if (!TextUtils.isEmpty(this.y)) {
            Preference m2 = m(this.y);
            if (m2 != null) {
                m2.z0(this);
                return;
            }
            throw new IllegalStateException("Dependency \"" + this.y + "\" not found for preference \"" + this.r + "\" (title: \"" + this.n + "\"");
        }
    }

    private void z0(Preference preference) {
        if (this.N == null) {
            this.N = new ArrayList();
        }
        this.N.add(preference);
        preference.e0(this, Q0());
    }

    public int A() {
        return this.l;
    }

    public void A0(Bundle bundle) {
        i(bundle);
    }

    public PreferenceGroup B() {
        return this.O;
    }

    public void B0(Bundle bundle) {
        k(bundle);
    }

    /* access modifiers changed from: protected */
    public boolean C(boolean z2) {
        if (!R0()) {
            return z2;
        }
        e H2 = H();
        return H2 != null ? H2.a(this.r, z2) : this.f.j().getBoolean(this.r, z2);
    }

    public void C0(boolean z2) {
        if (this.v != z2) {
            this.v = z2;
            W(Q0());
            V();
        }
    }

    /* access modifiers changed from: protected */
    public int E(int i2) {
        if (!R0()) {
            return i2;
        }
        e H2 = H();
        return H2 != null ? H2.b(this.r, i2) : this.f.j().getInt(this.r, i2);
    }

    public void E0(int i2) {
        F0(defpackage.f.d(this.e, i2));
        this.p = i2;
    }

    /* access modifiers changed from: protected */
    public String F(String str) {
        if (!R0()) {
            return str;
        }
        e H2 = H();
        return H2 != null ? H2.c(this.r, str) : this.f.j().getString(this.r, str);
    }

    public void F0(Drawable drawable) {
        if (this.q != drawable) {
            this.q = drawable;
            this.p = 0;
            V();
        }
    }

    public Set<String> G(Set<String> set) {
        if (!R0()) {
            return set;
        }
        e H2 = H();
        return H2 != null ? H2.d(this.r, set) : this.f.j().getStringSet(this.r, set);
    }

    public void G0(Intent intent) {
        this.s = intent;
    }

    public e H() {
        e eVar = this.g;
        if (eVar != null) {
            return eVar;
        }
        j jVar = this.f;
        if (jVar != null) {
            return jVar.h();
        }
        return null;
    }

    public void H0(int i2) {
        this.K = i2;
    }

    public j I() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public final void I0(c cVar) {
        this.M = cVar;
    }

    public SharedPreferences J() {
        if (this.f == null || H() != null) {
            return null;
        }
        return this.f.j();
    }

    public void J0(d dVar) {
        this.j = dVar;
    }

    public CharSequence K() {
        return L() != null ? L().a(this) : this.o;
    }

    public void K0(e eVar) {
        this.k = eVar;
    }

    public final g L() {
        return this.R;
    }

    public void L0(int i2) {
        if (i2 != this.l) {
            this.l = i2;
            Y();
        }
    }

    public CharSequence M() {
        return this.n;
    }

    public void M0(CharSequence charSequence) {
        if (L() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.o, charSequence)) {
            this.o = charSequence;
            V();
        }
    }

    public final int N() {
        return this.L;
    }

    public final void N0(g gVar) {
        this.R = gVar;
        V();
    }

    public boolean O() {
        return !TextUtils.isEmpty(this.r);
    }

    public void O0(int i2) {
        P0(this.e.getString(i2));
    }

    public boolean P() {
        return this.I;
    }

    public void P0(CharSequence charSequence) {
        if ((charSequence == null && this.n != null) || (charSequence != null && !charSequence.equals(this.n))) {
            this.n = charSequence;
            V();
        }
    }

    public boolean Q() {
        return this.v && this.A && this.B;
    }

    public boolean Q0() {
        return !Q();
    }

    /* access modifiers changed from: protected */
    public boolean R0() {
        return this.f != null && S() && O();
    }

    public boolean S() {
        return this.x;
    }

    public boolean T() {
        return this.w;
    }

    public final boolean U() {
        return this.C;
    }

    /* access modifiers changed from: protected */
    public void V() {
        c cVar = this.M;
        if (cVar != null) {
            cVar.d(this);
        }
    }

    public void W(boolean z2) {
        List<Preference> list = this.N;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).e0(this, z2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void Y() {
        c cVar = this.M;
        if (cVar != null) {
            cVar.b(this);
        }
    }

    public void Z() {
        y0();
    }

    /* access modifiers changed from: package-private */
    public void a(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || this.O == null) {
            this.O = preferenceGroup;
            return;
        }
        throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
    }

    /* access modifiers changed from: protected */
    public void a0(j jVar) {
        this.f = jVar;
        if (!this.i) {
            this.h = jVar.d();
        }
        l();
    }

    /* access modifiers changed from: protected */
    public void b0(j jVar, long j2) {
        this.h = j2;
        this.i = true;
        try {
            a0(jVar);
        } finally {
            this.i = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c0(androidx.preference.l r9) {
        /*
            r8 = this;
            android.view.View r0 = r9.e
            android.view.View$OnClickListener r1 = r8.S
            r0.setOnClickListener(r1)
            int r1 = r8.m
            r0.setId(r1)
            r1 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r1 = r9.M(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            r3 = 0
            r4 = 8
            if (r1 == 0) goto L_0x0037
            java.lang.CharSequence r5 = r8.K()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0034
            r1.setText(r5)
            r1.setVisibility(r3)
            int r1 = r1.getCurrentTextColor()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0038
        L_0x0034:
            r1.setVisibility(r4)
        L_0x0037:
            r1 = r2
        L_0x0038:
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r9.M(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0075
            java.lang.CharSequence r6 = r8.M()
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0072
            r5.setText(r6)
            r5.setVisibility(r3)
            boolean r6 = r8.F
            if (r6 == 0) goto L_0x005c
            boolean r6 = r8.G
            r5.setSingleLine(r6)
        L_0x005c:
            boolean r6 = r8.T()
            if (r6 != 0) goto L_0x0075
            boolean r6 = r8.Q()
            if (r6 == 0) goto L_0x0075
            if (r1 == 0) goto L_0x0075
            int r1 = r1.intValue()
            r5.setTextColor(r1)
            goto L_0x0075
        L_0x0072:
            r5.setVisibility(r4)
        L_0x0075:
            r1 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r1 = r9.M(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5 = 4
            if (r1 == 0) goto L_0x00b1
            int r6 = r8.p
            if (r6 != 0) goto L_0x0089
            android.graphics.drawable.Drawable r6 = r8.q
            if (r6 == 0) goto L_0x009e
        L_0x0089:
            android.graphics.drawable.Drawable r6 = r8.q
            if (r6 != 0) goto L_0x0097
            android.content.Context r6 = r8.e
            int r7 = r8.p
            android.graphics.drawable.Drawable r6 = defpackage.f.d(r6, r7)
            r8.q = r6
        L_0x0097:
            android.graphics.drawable.Drawable r6 = r8.q
            if (r6 == 0) goto L_0x009e
            r1.setImageDrawable(r6)
        L_0x009e:
            android.graphics.drawable.Drawable r6 = r8.q
            if (r6 == 0) goto L_0x00a6
            r1.setVisibility(r3)
            goto L_0x00b1
        L_0x00a6:
            boolean r6 = r8.H
            if (r6 == 0) goto L_0x00ac
            r6 = 4
            goto L_0x00ae
        L_0x00ac:
            r6 = 8
        L_0x00ae:
            r1.setVisibility(r6)
        L_0x00b1:
            int r1 = androidx.preference.R$id.icon_frame
            android.view.View r1 = r9.M(r1)
            if (r1 != 0) goto L_0x00c0
            r1 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r1 = r9.M(r1)
        L_0x00c0:
            if (r1 == 0) goto L_0x00d2
            android.graphics.drawable.Drawable r6 = r8.q
            if (r6 == 0) goto L_0x00ca
            r1.setVisibility(r3)
            goto L_0x00d2
        L_0x00ca:
            boolean r3 = r8.H
            if (r3 == 0) goto L_0x00cf
            r4 = 4
        L_0x00cf:
            r1.setVisibility(r4)
        L_0x00d2:
            boolean r1 = r8.J
            if (r1 == 0) goto L_0x00db
            boolean r1 = r8.Q()
            goto L_0x00dc
        L_0x00db:
            r1 = 1
        L_0x00dc:
            r8.D0(r0, r1)
            boolean r1 = r8.T()
            r0.setFocusable(r1)
            r0.setClickable(r1)
            boolean r3 = r8.D
            r9.P(r3)
            boolean r3 = r8.E
            r9.Q(r3)
            boolean r9 = r8.P()
            if (r9 == 0) goto L_0x0104
            androidx.preference.Preference$f r3 = r8.Q
            if (r3 != 0) goto L_0x0104
            androidx.preference.Preference$f r3 = new androidx.preference.Preference$f
            r3.<init>(r8)
            r8.Q = r3
        L_0x0104:
            if (r9 == 0) goto L_0x0109
            androidx.preference.Preference$f r3 = r8.Q
            goto L_0x010a
        L_0x0109:
            r3 = r2
        L_0x010a:
            r0.setOnCreateContextMenuListener(r3)
            r0.setLongClickable(r9)
            if (r9 == 0) goto L_0x0117
            if (r1 != 0) goto L_0x0117
            defpackage.o4.l0(r0, r2)
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.c0(androidx.preference.l):void");
    }

    /* access modifiers changed from: protected */
    public void d0() {
    }

    public boolean e(Object obj) {
        d dVar = this.j;
        return dVar == null || dVar.a(this, obj);
    }

    public void e0(Preference preference, boolean z2) {
        if (this.A == z2) {
            this.A = !z2;
            W(Q0());
            V();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
    }

    public void f0() {
        T0();
    }

    /* access modifiers changed from: protected */
    public Object g0(TypedArray typedArray, int i2) {
        return null;
    }

    /* renamed from: h */
    public int compareTo(Preference preference) {
        int i2 = this.l;
        int i3 = preference.l;
        if (i2 != i3) {
            return i2 - i3;
        }
        CharSequence charSequence = this.n;
        CharSequence charSequence2 = preference.n;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.n.toString());
    }

    @Deprecated
    public void h0(a5 a5Var) {
    }

    /* access modifiers changed from: package-private */
    public void i(Bundle bundle) {
        Parcelable parcelable;
        if (O() && (parcelable = bundle.getParcelable(this.r)) != null) {
            this.P = false;
            l0(parcelable);
            if (!this.P) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    public void j0(Preference preference, boolean z2) {
        if (this.B == z2) {
            this.B = !z2;
            W(Q0());
            V();
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Bundle bundle) {
        if (O()) {
            this.P = false;
            Parcelable m0 = m0();
            if (!this.P) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (m0 != null) {
                bundle.putParcelable(this.r, m0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void k0() {
        T0();
    }

    /* access modifiers changed from: protected */
    public void l0(Parcelable parcelable) {
        this.P = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* access modifiers changed from: protected */
    public <T extends Preference> T m(String str) {
        j jVar = this.f;
        if (jVar == null) {
            return null;
        }
        return jVar.a(str);
    }

    /* access modifiers changed from: protected */
    public Parcelable m0() {
        this.P = true;
        return AbsSavedState.EMPTY_STATE;
    }

    /* access modifiers changed from: protected */
    public void n0(Object obj) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void p0(boolean z2, Object obj) {
        n0(obj);
    }

    public Context q() {
        return this.e;
    }

    public Bundle r() {
        if (this.u == null) {
            this.u = new Bundle();
        }
        return this.u;
    }

    /* access modifiers changed from: package-private */
    public StringBuilder s() {
        StringBuilder sb = new StringBuilder();
        CharSequence M2 = M();
        if (!TextUtils.isEmpty(M2)) {
            sb.append(M2);
            sb.append(' ');
        }
        CharSequence K2 = K();
        if (!TextUtils.isEmpty(K2)) {
            sb.append(K2);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public void s0() {
        j.c f2;
        if (Q() && T()) {
            d0();
            e eVar = this.k;
            if (eVar == null || !eVar.a(this)) {
                j I2 = I();
                if ((I2 == null || (f2 = I2.f()) == null || !f2.f(this)) && this.s != null) {
                    q().startActivity(this.s);
                }
            }
        }
    }

    public String t() {
        return this.t;
    }

    /* access modifiers changed from: protected */
    public void t0(View view) {
        s0();
    }

    public String toString() {
        return s().toString();
    }

    /* access modifiers changed from: protected */
    public boolean u0(boolean z2) {
        if (!R0()) {
            return false;
        }
        if (z2 == C(!z2)) {
            return true;
        }
        e H2 = H();
        if (H2 != null) {
            H2.e(this.r, z2);
        } else {
            SharedPreferences.Editor c2 = this.f.c();
            c2.putBoolean(this.r, z2);
            S0(c2);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public long v() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public boolean v0(int i2) {
        if (!R0()) {
            return false;
        }
        if (i2 == E(~i2)) {
            return true;
        }
        e H2 = H();
        if (H2 != null) {
            H2.f(this.r, i2);
        } else {
            SharedPreferences.Editor c2 = this.f.c();
            c2.putInt(this.r, i2);
            S0(c2);
        }
        return true;
    }

    public Intent w() {
        return this.s;
    }

    /* access modifiers changed from: protected */
    public boolean w0(String str) {
        if (!R0()) {
            return false;
        }
        if (TextUtils.equals(str, F((String) null))) {
            return true;
        }
        e H2 = H();
        if (H2 != null) {
            H2.g(this.r, str);
        } else {
            SharedPreferences.Editor c2 = this.f.c();
            c2.putString(this.r, str);
            S0(c2);
        }
        return true;
    }

    public String x() {
        return this.r;
    }

    public boolean x0(Set<String> set) {
        if (!R0()) {
            return false;
        }
        if (set.equals(G((Set<String>) null))) {
            return true;
        }
        e H2 = H();
        if (H2 != null) {
            H2.h(this.r, set);
        } else {
            SharedPreferences.Editor c2 = this.f.c();
            c2.putStringSet(this.r, set);
            S0(c2);
        }
        return true;
    }

    public final int z() {
        return this.K;
    }
}
