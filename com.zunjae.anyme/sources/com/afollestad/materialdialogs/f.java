package com.afollestad.materialdialogs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.a;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class f extends c implements View.OnClickListener, a.c {
    protected final e g;
    private final Handler h = new Handler();
    protected ImageView i;
    protected TextView j;
    protected TextView k;
    EditText l;
    RecyclerView m;
    View n;
    FrameLayout o;
    ProgressBar p;
    TextView q;
    TextView r;
    TextView s;
    CheckBox t;
    MDButton u;
    MDButton v;
    MDButton w;
    m x;
    List<Integer> y;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: com.afollestad.materialdialogs.f$a$a  reason: collision with other inner class name */
        class C0076a implements Runnable {
            final /* synthetic */ int e;

            C0076a(int i) {
                this.e = i;
            }

            public void run() {
                f.this.m.requestFocus();
                f.this.g.Y.F1(this.e);
            }
        }

        a() {
        }

        public void onGlobalLayout() {
            int i;
            if (Build.VERSION.SDK_INT < 16) {
                f.this.m.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                f.this.m.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            m mVar = f.this.x;
            if (mVar == m.SINGLE || mVar == m.MULTI) {
                f fVar = f.this;
                if (fVar.x == m.SINGLE) {
                    i = fVar.g.O;
                    if (i < 0) {
                        return;
                    }
                } else {
                    List<Integer> list = fVar.y;
                    if (list != null && list.size() != 0) {
                        Collections.sort(f.this.y);
                        i = f.this.y.get(0).intValue();
                    } else {
                        return;
                    }
                }
                f.this.m.post(new C0076a(i));
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            f fVar = f.this;
            TextView textView = fVar.q;
            if (textView != null) {
                textView.setText(fVar.g.A0.format((double) (((float) fVar.h()) / ((float) f.this.k()))));
            }
            f fVar2 = f.this;
            TextView textView2 = fVar2.r;
            if (textView2 != null) {
                textView2.setText(String.format(fVar2.g.z0, new Object[]{Integer.valueOf(fVar2.h()), Integer.valueOf(f.this.k())}));
            }
        }
    }

    class c implements TextWatcher {
        c() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int length = charSequence.toString().length();
            boolean z = false;
            if (!f.this.g.p0) {
                if (length == 0) {
                    z = true;
                }
                f.this.e(b.POSITIVE).setEnabled(!z);
            }
            f.this.m(length, z);
            f fVar = f.this;
            e eVar = fVar.g;
            if (eVar.r0) {
                eVar.o0.a(fVar, charSequence);
            }
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.afollestad.materialdialogs.f$m[] r0 = com.afollestad.materialdialogs.f.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                com.afollestad.materialdialogs.f$m r2 = com.afollestad.materialdialogs.f.m.REGULAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.afollestad.materialdialogs.f$m r3 = com.afollestad.materialdialogs.f.m.SINGLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.afollestad.materialdialogs.f$m r4 = com.afollestad.materialdialogs.f.m.MULTI     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.afollestad.materialdialogs.b[] r3 = com.afollestad.materialdialogs.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                com.afollestad.materialdialogs.b r4 = com.afollestad.materialdialogs.b.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.afollestad.materialdialogs.b r3 = com.afollestad.materialdialogs.b.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.afollestad.materialdialogs.b r1 = com.afollestad.materialdialogs.b.POSITIVE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.f.d.<clinit>():void");
        }
    }

    public static class e {
        protected n A;
        protected NumberFormat A0;
        protected n B;
        protected boolean B0;
        protected n C;
        protected boolean C0;
        protected n D;
        protected boolean D0;
        protected i E;
        protected boolean E0;
        protected l F;
        protected boolean F0;
        protected k G;
        protected boolean G0;
        protected j H;
        protected boolean H0;
        protected boolean I;
        protected boolean I0;
        protected boolean J;
        protected boolean J0;
        protected h K;
        protected int K0;
        protected boolean L;
        protected int L0;
        protected boolean M;
        protected int M0;
        protected float N;
        protected int N0;
        protected int O;
        protected int O0;
        protected Integer[] P;
        protected Integer[] Q;
        protected boolean R;
        protected Typeface S;
        protected Typeface T;
        protected Drawable U;
        protected boolean V;
        protected int W;
        protected RecyclerView.g<?> X;
        protected RecyclerView.o Y;
        protected DialogInterface.OnDismissListener Z;
        protected final Context a;
        protected DialogInterface.OnCancelListener a0;
        protected CharSequence b;
        protected DialogInterface.OnKeyListener b0;
        protected e c;
        protected DialogInterface.OnShowListener c0;
        protected e d;
        protected g d0;
        protected e e = e.END;
        protected boolean e0;
        protected e f;
        protected int f0;
        protected e g;
        protected int g0;
        protected int h;
        protected int h0;
        protected int i;
        protected boolean i0;
        protected int j;
        protected boolean j0;
        protected CharSequence k;
        protected int k0;
        protected ArrayList<CharSequence> l;
        protected int l0;
        protected CharSequence m;
        protected CharSequence m0;
        protected CharSequence n;
        protected CharSequence n0;
        protected CharSequence o;
        protected h o0;
        protected boolean p;
        protected boolean p0;
        protected boolean q;
        protected int q0;
        protected boolean r;
        protected boolean r0;
        protected View s;
        protected int s0;
        protected int t;
        protected int t0;
        protected ColorStateList u;
        protected int u0;
        protected ColorStateList v;
        protected int[] v0;
        protected ColorStateList w;
        protected CharSequence w0;
        protected ColorStateList x;
        protected boolean x0;
        protected ColorStateList y;
        protected CompoundButton.OnCheckedChangeListener y0;
        protected C0077f z;
        protected String z0;

        public e(Context context) {
            e eVar = e.START;
            this.c = eVar;
            this.d = eVar;
            e eVar2 = e.START;
            this.f = eVar2;
            this.g = eVar2;
            this.h = 0;
            this.i = -1;
            this.j = -1;
            this.I = false;
            this.J = false;
            this.K = h.LIGHT;
            this.L = true;
            this.M = true;
            this.N = 1.2f;
            this.O = -1;
            this.P = null;
            this.Q = null;
            this.R = true;
            this.W = -1;
            this.k0 = -2;
            this.l0 = 0;
            this.q0 = -1;
            this.s0 = -1;
            this.t0 = -1;
            this.u0 = 0;
            this.C0 = false;
            this.D0 = false;
            this.E0 = false;
            this.F0 = false;
            this.G0 = false;
            this.H0 = false;
            this.I0 = false;
            this.J0 = false;
            this.a = context;
            int m2 = x8.m(context, R$attr.colorAccent, x8.c(context, R$color.md_material_blue_600));
            this.t = m2;
            if (Build.VERSION.SDK_INT >= 21) {
                this.t = x8.m(context, 16843829, m2);
            }
            this.v = x8.b(context, this.t);
            this.w = x8.b(context, this.t);
            this.x = x8.b(context, this.t);
            this.y = x8.b(context, x8.m(context, R$attr.md_link_color, this.t));
            this.h = x8.m(context, R$attr.md_btn_ripple_color, x8.m(context, R$attr.colorControlHighlight, Build.VERSION.SDK_INT >= 21 ? x8.l(context, 16843820) : 0));
            this.A0 = NumberFormat.getPercentInstance();
            this.z0 = "%1d/%2d";
            this.K = x8.g(x8.l(context, 16842806)) ? h.LIGHT : h.DARK;
            h();
            this.c = x8.r(context, R$attr.md_title_gravity, this.c);
            this.d = x8.r(context, R$attr.md_content_gravity, this.d);
            this.e = x8.r(context, R$attr.md_btnstacked_gravity, this.e);
            this.f = x8.r(context, R$attr.md_items_gravity, this.f);
            this.g = x8.r(context, R$attr.md_buttons_gravity, this.g);
            try {
                F(x8.s(context, R$attr.md_medium_font), x8.s(context, R$attr.md_regular_font));
            } catch (Throwable unused) {
            }
            if (this.T == null) {
                try {
                    this.T = Build.VERSION.SDK_INT >= 21 ? Typeface.create("sans-serif-medium", 0) : Typeface.create("sans-serif", 1);
                } catch (Throwable unused2) {
                    this.T = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.S == null) {
                try {
                    this.S = Typeface.create("sans-serif", 0);
                } catch (Throwable unused3) {
                    Typeface typeface = Typeface.SANS_SERIF;
                    this.S = typeface;
                    if (typeface == null) {
                        this.S = Typeface.DEFAULT;
                    }
                }
            }
        }

        private void h() {
            if (com.afollestad.materialdialogs.internal.d.b(false) != null) {
                com.afollestad.materialdialogs.internal.d a2 = com.afollestad.materialdialogs.internal.d.a();
                if (a2.a) {
                    this.K = h.DARK;
                }
                int i2 = a2.b;
                if (i2 != 0) {
                    this.i = i2;
                }
                int i3 = a2.c;
                if (i3 != 0) {
                    this.j = i3;
                }
                ColorStateList colorStateList = a2.d;
                if (colorStateList != null) {
                    this.v = colorStateList;
                }
                ColorStateList colorStateList2 = a2.e;
                if (colorStateList2 != null) {
                    this.x = colorStateList2;
                }
                ColorStateList colorStateList3 = a2.f;
                if (colorStateList3 != null) {
                    this.w = colorStateList3;
                }
                int i4 = a2.h;
                if (i4 != 0) {
                    this.h0 = i4;
                }
                Drawable drawable = a2.i;
                if (drawable != null) {
                    this.U = drawable;
                }
                int i5 = a2.j;
                if (i5 != 0) {
                    this.g0 = i5;
                }
                int i6 = a2.k;
                if (i6 != 0) {
                    this.f0 = i6;
                }
                int i7 = a2.n;
                if (i7 != 0) {
                    this.L0 = i7;
                }
                int i8 = a2.m;
                if (i8 != 0) {
                    this.K0 = i8;
                }
                int i9 = a2.o;
                if (i9 != 0) {
                    this.M0 = i9;
                }
                int i10 = a2.p;
                if (i10 != 0) {
                    this.N0 = i10;
                }
                int i11 = a2.q;
                if (i11 != 0) {
                    this.O0 = i11;
                }
                int i12 = a2.g;
                if (i12 != 0) {
                    this.t = i12;
                }
                ColorStateList colorStateList4 = a2.l;
                if (colorStateList4 != null) {
                    this.y = colorStateList4;
                }
                this.c = a2.r;
                this.d = a2.s;
                this.e = a2.t;
                this.f = a2.u;
                this.g = a2.v;
            }
        }

        public e A(n nVar) {
            this.A = nVar;
            return this;
        }

        public e B(CharSequence charSequence) {
            this.m = charSequence;
            return this;
        }

        public e C(boolean z2, int i2) {
            if (this.s == null) {
                if (z2) {
                    this.i0 = true;
                    this.k0 = -2;
                } else {
                    this.B0 = false;
                    this.i0 = false;
                    this.k0 = -1;
                    this.l0 = i2;
                }
                return this;
            }
            throw new IllegalStateException("You cannot set progress() when you're using a custom view.");
        }

        public f D() {
            f c2 = c();
            c2.show();
            return c2;
        }

        public e E(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }

        public e F(String str, String str2) {
            if (str != null && !str.trim().isEmpty()) {
                Typeface a2 = z8.a(this.a, str);
                this.T = a2;
                if (a2 == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str + "\"");
                }
            }
            if (str2 != null && !str2.trim().isEmpty()) {
                Typeface a3 = z8.a(this.a, str2);
                this.S = a3;
                if (a3 == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str2 + "\"");
                }
            }
            return this;
        }

        public e a(boolean z2) {
            this.R = z2;
            return this;
        }

        public e b(e eVar) {
            this.e = eVar;
            return this;
        }

        public f c() {
            return new f(this);
        }

        public e d(DialogInterface.OnCancelListener onCancelListener) {
            this.a0 = onCancelListener;
            return this;
        }

        public e e(boolean z2) {
            this.L = z2;
            this.M = z2;
            return this;
        }

        public e f(boolean z2) {
            this.M = z2;
            return this;
        }

        public e g(CharSequence charSequence, boolean z2, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.w0 = charSequence;
            this.x0 = z2;
            this.y0 = onCheckedChangeListener;
            return this;
        }

        public e i(CharSequence charSequence) {
            if (this.s == null) {
                this.k = charSequence;
                return this;
            }
            throw new IllegalStateException("You cannot set content() when you're using a custom view.");
        }

        public final Context j() {
            return this.a;
        }

        public e k(int i2) {
            this.U = h2.b(this.a.getResources(), i2, (Resources.Theme) null);
            return this;
        }

        public e l(CharSequence charSequence, CharSequence charSequence2, h hVar) {
            m(charSequence, charSequence2, true, hVar);
            return this;
        }

        public e m(CharSequence charSequence, CharSequence charSequence2, boolean z2, h hVar) {
            if (this.s == null) {
                this.o0 = hVar;
                this.n0 = charSequence;
                this.m0 = charSequence2;
                this.p0 = z2;
                return this;
            }
            throw new IllegalStateException("You cannot set content() when you're using a custom view.");
        }

        public e n(int i2, int i3) {
            o(i2, i3, 0);
            return this;
        }

        public e o(int i2, int i3, int i4) {
            if (i2 >= 0) {
                this.s0 = i2;
                this.t0 = i3;
                if (i4 == 0) {
                    this.u0 = x8.c(this.a, R$color.md_edittext_error);
                } else {
                    this.u0 = i4;
                }
                if (this.s0 > 0) {
                    this.p0 = false;
                }
                return this;
            }
            throw new IllegalArgumentException("Min length for input dialogs cannot be less than 0.");
        }

        public e p(int i2) {
            this.q0 = i2;
            return this;
        }

        public e q(Collection collection) {
            if (collection.size() > 0) {
                CharSequence[] charSequenceArr = new CharSequence[collection.size()];
                int i2 = 0;
                for (Object obj : collection) {
                    charSequenceArr[i2] = obj.toString();
                    i2++;
                }
                r(charSequenceArr);
            } else if (collection.size() == 0) {
                this.l = new ArrayList<>();
            }
            return this;
        }

        public e r(CharSequence... charSequenceArr) {
            if (this.s == null) {
                ArrayList<CharSequence> arrayList = new ArrayList<>();
                this.l = arrayList;
                Collections.addAll(arrayList, charSequenceArr);
                return this;
            }
            throw new IllegalStateException("You cannot set items() when you're using a custom view.");
        }

        public e s(i iVar) {
            this.E = iVar;
            this.G = null;
            this.H = null;
            return this;
        }

        public e t(Integer[] numArr, j jVar) {
            this.P = numArr;
            this.E = null;
            this.G = null;
            this.H = jVar;
            return this;
        }

        public e u(int i2, k kVar) {
            this.O = i2;
            this.E = null;
            this.G = kVar;
            this.H = null;
            return this;
        }

        public e v(int i2) {
            this.W = i2;
            return this;
        }

        public e w(CharSequence charSequence) {
            this.o = charSequence;
            return this;
        }

        public e x(CharSequence charSequence) {
            this.n = charSequence;
            return this;
        }

        public e y(n nVar) {
            this.B = nVar;
            return this;
        }

        public e z(n nVar) {
            this.C = nVar;
            return this;
        }
    }

    @Deprecated
    /* renamed from: com.afollestad.materialdialogs.f$f  reason: collision with other inner class name */
    public static abstract class C0077f {
        @Deprecated
        public abstract void a(f fVar);

        @Deprecated
        public abstract void b(f fVar);

        @Deprecated
        public abstract void c(f fVar);

        @Deprecated
        public abstract void d(f fVar);
    }

    private static class g extends WindowManager.BadTokenException {
        g(String str) {
            super(str);
        }
    }

    public interface h {
        void a(f fVar, CharSequence charSequence);
    }

    public interface i {
        void a(f fVar, View view, int i, CharSequence charSequence);
    }

    public interface j {
        boolean a(f fVar, Integer[] numArr, CharSequence[] charSequenceArr);
    }

    public interface k {
        boolean a(f fVar, View view, int i, CharSequence charSequence);
    }

    public interface l {
        boolean a(f fVar, View view, int i, CharSequence charSequence);
    }

    enum m {
        REGULAR,
        SINGLE,
        MULTI;

        public static int getLayoutForType(m mVar) {
            int i = d.b[mVar.ordinal()];
            if (i == 1) {
                return R$layout.md_listitem;
            }
            if (i == 2) {
                return R$layout.md_listitem_singlechoice;
            }
            if (i == 3) {
                return R$layout.md_listitem_multichoice;
            }
            throw new IllegalArgumentException("Not a valid list type");
        }
    }

    public interface n {
        void a(f fVar, b bVar);
    }

    @SuppressLint({"InflateParams"})
    protected f(e eVar) {
        super(eVar.a, d.c(eVar));
        this.g = eVar;
        this.e = (MDRootLayout) LayoutInflater.from(eVar.a).inflate(d.b(eVar), (ViewGroup) null);
        d.d(this);
    }

    private boolean o() {
        if (this.g.H == null) {
            return false;
        }
        Collections.sort(this.y);
        ArrayList arrayList = new ArrayList();
        for (Integer next : this.y) {
            if (next.intValue() >= 0 && next.intValue() <= this.g.l.size() - 1) {
                arrayList.add(this.g.l.get(next.intValue()));
            }
        }
        j jVar = this.g.H;
        List<Integer> list = this.y;
        return jVar.a(this, (Integer[]) list.toArray(new Integer[list.size()]), (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]));
    }

    private boolean p(View view) {
        e eVar = this.g;
        if (eVar.G == null) {
            return false;
        }
        CharSequence charSequence = null;
        int i2 = eVar.O;
        if (i2 >= 0 && i2 < eVar.l.size()) {
            e eVar2 = this.g;
            charSequence = eVar2.l.get(eVar2.O);
        }
        e eVar3 = this.g;
        return eVar3.G.a(this, view, eVar3.O, charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00de, code lost:
        r4 = r3.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f1, code lost:
        r4 = r3.g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.afollestad.materialdialogs.f r4, android.view.View r5, int r6, java.lang.CharSequence r7, boolean r8) {
        /*
            r3 = this;
            boolean r4 = r5.isEnabled()
            r7 = 0
            if (r4 != 0) goto L_0x0008
            return r7
        L_0x0008:
            com.afollestad.materialdialogs.f$m r4 = r3.x
            r0 = 1
            if (r4 == 0) goto L_0x00d3
            com.afollestad.materialdialogs.f$m r1 = com.afollestad.materialdialogs.f.m.REGULAR
            if (r4 != r1) goto L_0x0013
            goto L_0x00d3
        L_0x0013:
            com.afollestad.materialdialogs.f$m r8 = com.afollestad.materialdialogs.f.m.MULTI
            if (r4 != r8) goto L_0x007f
            int r4 = com.afollestad.materialdialogs.R$id.md_control
            android.view.View r4 = r5.findViewById(r4)
            android.widget.CheckBox r4 = (android.widget.CheckBox) r4
            boolean r5 = r4.isEnabled()
            if (r5 != 0) goto L_0x0026
            return r7
        L_0x0026:
            java.util.List<java.lang.Integer> r5 = r3.y
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.contains(r8)
            r5 = r5 ^ r0
            if (r5 == 0) goto L_0x0059
            java.util.List<java.lang.Integer> r5 = r3.y
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.add(r7)
            com.afollestad.materialdialogs.f$e r5 = r3.g
            boolean r5 = r5.I
            if (r5 == 0) goto L_0x0054
            boolean r5 = r3.o()
            if (r5 == 0) goto L_0x0049
            goto L_0x0054
        L_0x0049:
            java.util.List<java.lang.Integer> r4 = r3.y
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4.remove(r5)
            goto L_0x0104
        L_0x0054:
            r4.setChecked(r0)
            goto L_0x0104
        L_0x0059:
            java.util.List<java.lang.Integer> r5 = r3.y
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r5.remove(r8)
            com.afollestad.materialdialogs.f$e r5 = r3.g
            boolean r5 = r5.I
            if (r5 == 0) goto L_0x007a
            boolean r5 = r3.o()
            if (r5 == 0) goto L_0x006f
            goto L_0x007a
        L_0x006f:
            java.util.List<java.lang.Integer> r4 = r3.y
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4.add(r5)
            goto L_0x0104
        L_0x007a:
            r4.setChecked(r7)
            goto L_0x0104
        L_0x007f:
            com.afollestad.materialdialogs.f$m r8 = com.afollestad.materialdialogs.f.m.SINGLE
            if (r4 != r8) goto L_0x0104
            int r4 = com.afollestad.materialdialogs.R$id.md_control
            android.view.View r4 = r5.findViewById(r4)
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4
            boolean r8 = r4.isEnabled()
            if (r8 != 0) goto L_0x0092
            return r7
        L_0x0092:
            com.afollestad.materialdialogs.f$e r8 = r3.g
            int r1 = r8.O
            boolean r2 = r8.R
            if (r2 == 0) goto L_0x00a9
            java.lang.CharSequence r8 = r8.m
            if (r8 != 0) goto L_0x00a9
            r3.dismiss()
            com.afollestad.materialdialogs.f$e r8 = r3.g
            r8.O = r6
            r3.p(r5)
            goto L_0x00bb
        L_0x00a9:
            com.afollestad.materialdialogs.f$e r7 = r3.g
            boolean r8 = r7.J
            if (r8 == 0) goto L_0x00ba
            r7.O = r6
            boolean r7 = r3.p(r5)
            com.afollestad.materialdialogs.f$e r5 = r3.g
            r5.O = r1
            goto L_0x00bb
        L_0x00ba:
            r7 = 1
        L_0x00bb:
            if (r7 == 0) goto L_0x0104
            com.afollestad.materialdialogs.f$e r5 = r3.g
            r5.O = r6
            r4.setChecked(r0)
            com.afollestad.materialdialogs.f$e r4 = r3.g
            androidx.recyclerview.widget.RecyclerView$g<?> r4 = r4.X
            r4.m(r1)
            com.afollestad.materialdialogs.f$e r4 = r3.g
            androidx.recyclerview.widget.RecyclerView$g<?> r4 = r4.X
            r4.m(r6)
            goto L_0x0104
        L_0x00d3:
            com.afollestad.materialdialogs.f$e r4 = r3.g
            boolean r4 = r4.R
            if (r4 == 0) goto L_0x00dc
            r3.dismiss()
        L_0x00dc:
            if (r8 != 0) goto L_0x00ef
            com.afollestad.materialdialogs.f$e r4 = r3.g
            com.afollestad.materialdialogs.f$i r7 = r4.E
            if (r7 == 0) goto L_0x00ef
            java.util.ArrayList<java.lang.CharSequence> r4 = r4.l
            java.lang.Object r4 = r4.get(r6)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r7.a(r3, r5, r6, r4)
        L_0x00ef:
            if (r8 == 0) goto L_0x0104
            com.afollestad.materialdialogs.f$e r4 = r3.g
            com.afollestad.materialdialogs.f$l r7 = r4.F
            if (r7 == 0) goto L_0x0104
            java.util.ArrayList<java.lang.CharSequence> r4 = r4.l
            java.lang.Object r4 = r4.get(r6)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = r7.a(r3, r5, r6, r4)
            return r4
        L_0x0104:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.f.a(com.afollestad.materialdialogs.f, android.view.View, int, java.lang.CharSequence, boolean):boolean");
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        RecyclerView recyclerView = this.m;
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new a());
        }
    }

    public void dismiss() {
        if (this.l != null) {
            x8.f(this, this.g);
        }
        super.dismiss();
    }

    public final MDButton e(b bVar) {
        int i2 = d.a[bVar.ordinal()];
        return i2 != 1 ? i2 != 2 ? this.u : this.w : this.v;
    }

    public final e f() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public Drawable g(b bVar, boolean z) {
        if (z) {
            e eVar = this.g;
            int i2 = eVar.L0;
            Context context = eVar.a;
            if (i2 != 0) {
                return h2.b(context.getResources(), this.g.L0, (Resources.Theme) null);
            }
            Drawable p2 = x8.p(context, R$attr.md_btn_stacked_selector);
            return p2 != null ? p2 : x8.p(getContext(), R$attr.md_btn_stacked_selector);
        }
        int i3 = d.a[bVar.ordinal()];
        if (i3 == 1) {
            e eVar2 = this.g;
            int i4 = eVar2.N0;
            Context context2 = eVar2.a;
            if (i4 != 0) {
                return h2.b(context2.getResources(), this.g.N0, (Resources.Theme) null);
            }
            Drawable p3 = x8.p(context2, R$attr.md_btn_neutral_selector);
            if (p3 != null) {
                return p3;
            }
            Drawable p4 = x8.p(getContext(), R$attr.md_btn_neutral_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                y8.a(p4, this.g.h);
            }
            return p4;
        } else if (i3 != 2) {
            e eVar3 = this.g;
            int i5 = eVar3.M0;
            Context context3 = eVar3.a;
            if (i5 != 0) {
                return h2.b(context3.getResources(), this.g.M0, (Resources.Theme) null);
            }
            Drawable p5 = x8.p(context3, R$attr.md_btn_positive_selector);
            if (p5 != null) {
                return p5;
            }
            Drawable p6 = x8.p(getContext(), R$attr.md_btn_positive_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                y8.a(p6, this.g.h);
            }
            return p6;
        } else {
            e eVar4 = this.g;
            int i6 = eVar4.O0;
            Context context4 = eVar4.a;
            if (i6 != 0) {
                return h2.b(context4.getResources(), this.g.O0, (Resources.Theme) null);
            }
            Drawable p7 = x8.p(context4, R$attr.md_btn_negative_selector);
            if (p7 != null) {
                return p7;
            }
            Drawable p8 = x8.p(getContext(), R$attr.md_btn_negative_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                y8.a(p8, this.g.h);
            }
            return p8;
        }
    }

    public final int h() {
        ProgressBar progressBar = this.p;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getProgress();
    }

    public final EditText i() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public final Drawable j() {
        e eVar = this.g;
        int i2 = eVar.K0;
        Context context = eVar.a;
        if (i2 != 0) {
            return h2.b(context.getResources(), this.g.K0, (Resources.Theme) null);
        }
        Drawable p2 = x8.p(context, R$attr.md_list_selector);
        return p2 != null ? p2 : x8.p(getContext(), R$attr.md_list_selector);
    }

    public final int k() {
        ProgressBar progressBar = this.p;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getMax();
    }

    public final View l() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public void m(int i2, boolean z) {
        int i3;
        TextView textView = this.s;
        if (textView != null) {
            boolean z2 = false;
            if (this.g.t0 > 0) {
                textView.setText(String.format(Locale.getDefault(), "%d/%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.g.t0)}));
                this.s.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            if ((z && i2 == 0) || (((i3 = this.g.t0) > 0 && i2 > i3) || i2 < this.g.s0)) {
                z2 = true;
            }
            e eVar = this.g;
            int i4 = z2 ? eVar.u0 : eVar.j;
            e eVar2 = this.g;
            int i5 = z2 ? eVar2.u0 : eVar2.t;
            if (this.g.t0 > 0) {
                this.s.setTextColor(i4);
            }
            com.afollestad.materialdialogs.internal.c.e(this.l, i5);
            e(b.POSITIVE).setEnabled(!z2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        if (this.m != null) {
            ArrayList<CharSequence> arrayList = this.g.l;
            if ((arrayList != null && arrayList.size() != 0) || this.g.X != null) {
                e eVar = this.g;
                if (eVar.Y == null) {
                    eVar.Y = new LinearLayoutManager(getContext());
                }
                if (this.m.getLayoutManager() == null) {
                    this.m.setLayoutManager(this.g.Y);
                }
                this.m.setAdapter(this.g.X);
                if (this.x != null) {
                    ((a) this.g.X).M(this);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r3.g.R != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a0, code lost:
        if (r3.g.R != false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r4.getTag()
            com.afollestad.materialdialogs.b r0 = (com.afollestad.materialdialogs.b) r0
            int[] r1 = com.afollestad.materialdialogs.f.d.a
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x0083
            r2 = 2
            if (r1 == r2) goto L_0x0060
            r2 = 3
            if (r1 == r2) goto L_0x0019
            goto L_0x00a5
        L_0x0019:
            com.afollestad.materialdialogs.f$e r1 = r3.g
            com.afollestad.materialdialogs.f$f r1 = r1.z
            if (r1 == 0) goto L_0x0029
            r1.a(r3)
            com.afollestad.materialdialogs.f$e r1 = r3.g
            com.afollestad.materialdialogs.f$f r1 = r1.z
            r1.d(r3)
        L_0x0029:
            com.afollestad.materialdialogs.f$e r1 = r3.g
            com.afollestad.materialdialogs.f$n r1 = r1.A
            if (r1 == 0) goto L_0x0032
            r1.a(r3, r0)
        L_0x0032:
            com.afollestad.materialdialogs.f$e r1 = r3.g
            boolean r1 = r1.J
            if (r1 != 0) goto L_0x003b
            r3.p(r4)
        L_0x003b:
            com.afollestad.materialdialogs.f$e r4 = r3.g
            boolean r4 = r4.I
            if (r4 != 0) goto L_0x0044
            r3.o()
        L_0x0044:
            com.afollestad.materialdialogs.f$e r4 = r3.g
            com.afollestad.materialdialogs.f$h r1 = r4.o0
            if (r1 == 0) goto L_0x0059
            android.widget.EditText r2 = r3.l
            if (r2 == 0) goto L_0x0059
            boolean r4 = r4.r0
            if (r4 != 0) goto L_0x0059
            android.text.Editable r4 = r2.getText()
            r1.a(r3, r4)
        L_0x0059:
            com.afollestad.materialdialogs.f$e r4 = r3.g
            boolean r4 = r4.R
            if (r4 == 0) goto L_0x00a5
            goto L_0x00a2
        L_0x0060:
            com.afollestad.materialdialogs.f$e r4 = r3.g
            com.afollestad.materialdialogs.f$f r4 = r4.z
            if (r4 == 0) goto L_0x0070
            r4.a(r3)
            com.afollestad.materialdialogs.f$e r4 = r3.g
            com.afollestad.materialdialogs.f$f r4 = r4.z
            r4.b(r3)
        L_0x0070:
            com.afollestad.materialdialogs.f$e r4 = r3.g
            com.afollestad.materialdialogs.f$n r4 = r4.B
            if (r4 == 0) goto L_0x0079
            r4.a(r3, r0)
        L_0x0079:
            com.afollestad.materialdialogs.f$e r4 = r3.g
            boolean r4 = r4.R
            if (r4 == 0) goto L_0x00a5
            r3.cancel()
            goto L_0x00a5
        L_0x0083:
            com.afollestad.materialdialogs.f$e r4 = r3.g
            com.afollestad.materialdialogs.f$f r4 = r4.z
            if (r4 == 0) goto L_0x0093
            r4.a(r3)
            com.afollestad.materialdialogs.f$e r4 = r3.g
            com.afollestad.materialdialogs.f$f r4 = r4.z
            r4.c(r3)
        L_0x0093:
            com.afollestad.materialdialogs.f$e r4 = r3.g
            com.afollestad.materialdialogs.f$n r4 = r4.C
            if (r4 == 0) goto L_0x009c
            r4.a(r3, r0)
        L_0x009c:
            com.afollestad.materialdialogs.f$e r4 = r3.g
            boolean r4 = r4.R
            if (r4 == 0) goto L_0x00a5
        L_0x00a2:
            r3.dismiss()
        L_0x00a5:
            com.afollestad.materialdialogs.f$e r4 = r3.g
            com.afollestad.materialdialogs.f$n r4 = r4.D
            if (r4 == 0) goto L_0x00ae
            r4.a(r3, r0)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.f.onClick(android.view.View):void");
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (this.l != null) {
            x8.u(this, this.g);
            if (this.l.getText().length() > 0) {
                EditText editText = this.l;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    public final void q(CharSequence charSequence) {
        this.k.setText(charSequence);
        this.k.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* access modifiers changed from: package-private */
    public void r() {
        EditText editText = this.l;
        if (editText != null) {
            editText.addTextChangedListener(new c());
        }
    }

    public final void s(int i2) {
        if (this.g.k0 > -2) {
            this.p.setProgress(i2);
            this.h.post(new b());
        }
    }

    public final void setTitle(int i2) {
        setTitle((CharSequence) this.g.a.getString(i2));
    }

    public final void setTitle(CharSequence charSequence) {
        this.j.setText(charSequence);
    }

    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
            throw new g("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    public final void t(TextView textView, Typeface typeface) {
        if (typeface != null) {
            textView.setPaintFlags(textView.getPaintFlags() | 128);
            textView.setTypeface(typeface);
        }
    }
}
