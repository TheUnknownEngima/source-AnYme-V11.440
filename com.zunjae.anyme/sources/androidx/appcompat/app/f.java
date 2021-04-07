package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$color;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$style;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.m0;
import androidx.appcompat.widget.s;
import androidx.lifecycle.h;
import com.github.mikephil.charting.utils.Utils;
import defpackage.n;
import defpackage.r;
import defpackage.z3;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

class f extends e implements g.a, LayoutInflater.Factory2 {
    private static final Map<Class<?>, Integer> e0 = new b0();
    private static final boolean f0 = (Build.VERSION.SDK_INT < 21);
    private static final int[] g0 = {16842836};
    private static boolean h0 = true;
    private static final boolean i0;
    private TextView A;
    private View B;
    private boolean C;
    private boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    boolean I;
    private boolean J;
    private p[] K;
    private p L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    boolean Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private m V;
    private m W;
    boolean X;
    int Y;
    private final Runnable Z;
    private boolean a0;
    private Rect b0;
    private Rect c0;
    private AppCompatViewInflater d0;
    final Object h;
    final Context i;
    Window j;
    private k k;
    final d l;
    ActionBar m;
    MenuInflater n;
    private CharSequence o;
    private androidx.appcompat.widget.o p;
    private i q;
    private q r;
    defpackage.n s;
    ActionBarContextView t;
    PopupWindow u;
    Runnable v;
    t4 w;
    private boolean x;
    private boolean y;
    private ViewGroup z;

    static class a implements Thread.UncaughtExceptionHandler {
        final /* synthetic */ Thread.UncaughtExceptionHandler a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.a.uncaughtException(thread, notFoundException);
                return;
            }
            this.a.uncaughtException(thread, th);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            f fVar = f.this;
            if ((fVar.Y & 1) != 0) {
                fVar.U(0);
            }
            f fVar2 = f.this;
            if ((fVar2.Y & 4096) != 0) {
                fVar2.U(108);
            }
            f fVar3 = f.this;
            fVar3.X = false;
            fVar3.Y = 0;
        }
    }

    class c implements k4 {
        c() {
        }

        public x4 a(View view, x4 x4Var) {
            int f = x4Var.f();
            int K0 = f.this.K0(f);
            if (f != K0) {
                x4Var = x4Var.j(x4Var.d(), K0, x4Var.e(), x4Var.c());
            }
            return o4.V(view, x4Var);
        }
    }

    class d implements s.a {
        d() {
        }

        public void a(Rect rect) {
            rect.top = f.this.K0(rect.top);
        }
    }

    class e implements ContentFrameLayout.a {
        e() {
        }

        public void a() {
        }

        public void onDetachedFromWindow() {
            f.this.S();
        }
    }

    /* renamed from: androidx.appcompat.app.f$f  reason: collision with other inner class name */
    class C0007f implements Runnable {

        /* renamed from: androidx.appcompat.app.f$f$a */
        class a extends v4 {
            a() {
            }

            public void b(View view) {
                f.this.t.setAlpha(1.0f);
                f.this.w.g((u4) null);
                f.this.w = null;
            }

            public void c(View view) {
                f.this.t.setVisibility(0);
            }
        }

        C0007f() {
        }

        public void run() {
            f fVar = f.this;
            fVar.u.showAtLocation(fVar.t, 55, 0, 0);
            f.this.V();
            if (f.this.C0()) {
                f.this.t.setAlpha(Utils.FLOAT_EPSILON);
                f fVar2 = f.this;
                t4 c = o4.c(fVar2.t);
                c.a(1.0f);
                fVar2.w = c;
                f.this.w.g(new a());
                return;
            }
            f.this.t.setAlpha(1.0f);
            f.this.t.setVisibility(0);
        }
    }

    class g extends v4 {
        g() {
        }

        public void b(View view) {
            f.this.t.setAlpha(1.0f);
            f.this.w.g((u4) null);
            f.this.w = null;
        }

        public void c(View view) {
            f.this.t.setVisibility(0);
            f.this.t.sendAccessibilityEvent(32);
            if (f.this.t.getParent() instanceof View) {
                o4.g0((View) f.this.t.getParent());
            }
        }
    }

    private class h implements a.b {
        h() {
        }

        public boolean a() {
            ActionBar l = f.this.l();
            return (l == null || (l.j() & 4) == 0) ? false : true;
        }

        public Context b() {
            return f.this.Z();
        }

        public void c(Drawable drawable, int i) {
            ActionBar l = f.this.l();
            if (l != null) {
                l.v(drawable);
                l.t(i);
            }
        }

        public Drawable d() {
            g0 t = g0.t(b(), (AttributeSet) null, new int[]{R$attr.homeAsUpIndicator});
            Drawable g = t.g(0);
            t.v();
            return g;
        }

        public void e(int i) {
            ActionBar l = f.this.l();
            if (l != null) {
                l.t(i);
            }
        }
    }

    private final class i implements m.a {
        i() {
        }

        public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
            f.this.M(gVar);
        }

        public boolean d(androidx.appcompat.view.menu.g gVar) {
            Window.Callback e0 = f.this.e0();
            if (e0 == null) {
                return true;
            }
            e0.onMenuOpened(108, gVar);
            return true;
        }
    }

    class j implements n.a {
        private n.a a;

        class a extends v4 {
            a() {
            }

            public void b(View view) {
                f.this.t.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.u;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.t.getParent() instanceof View) {
                    o4.g0((View) f.this.t.getParent());
                }
                f.this.t.removeAllViews();
                f.this.w.g((u4) null);
                f.this.w = null;
            }
        }

        public j(n.a aVar) {
            this.a = aVar;
        }

        public void a(defpackage.n nVar) {
            this.a.a(nVar);
            f fVar = f.this;
            if (fVar.u != null) {
                fVar.j.getDecorView().removeCallbacks(f.this.v);
            }
            f fVar2 = f.this;
            if (fVar2.t != null) {
                fVar2.V();
                f fVar3 = f.this;
                t4 c = o4.c(fVar3.t);
                c.a(Utils.FLOAT_EPSILON);
                fVar3.w = c;
                f.this.w.g(new a());
            }
            f fVar4 = f.this;
            d dVar = fVar4.l;
            if (dVar != null) {
                dVar.f(fVar4.s);
            }
            f.this.s = null;
        }

        public boolean b(defpackage.n nVar, Menu menu) {
            return this.a.b(nVar, menu);
        }

        public boolean c(defpackage.n nVar, Menu menu) {
            return this.a.c(nVar, menu);
        }

        public boolean d(defpackage.n nVar, MenuItem menuItem) {
            return this.a.d(nVar, menuItem);
        }
    }

    class k extends u {
        k(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode b(ActionMode.Callback callback) {
            r.a aVar = new r.a(f.this.i, callback);
            defpackage.n E0 = f.this.E0(aVar);
            if (E0 != null) {
                return aVar.e(E0);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.q0(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            f.this.t0(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            f.this.u0(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.e0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.e0(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.g gVar;
            p c0 = f.this.c0(0, true);
            if (c0 == null || (gVar = c0.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return f.this.l0() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!f.this.l0() || i != 0) ? super.onWindowStartingActionMode(callback, i) : b(callback);
        }
    }

    private class l extends m {
        private final PowerManager c;

        l(Context context) {
            super();
            this.c = (PowerManager) context.getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !this.c.isPowerSaveMode()) ? 1 : 2;
        }

        public void d() {
            f.this.G();
        }
    }

    abstract class m {
        private BroadcastReceiver a;

        class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                m.this.d();
            }
        }

        m() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    f.this.i.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract IntentFilter b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.a == null) {
                    this.a = new a();
                }
                f.this.i.registerReceiver(this.a, b2);
            }
        }
    }

    private class n extends m {
        private final k c;

        n(k kVar) {
            super();
            this.c = kVar;
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            return this.c.d() ? 2 : 1;
        }

        public void d() {
            f.this.G();
        }
    }

    private class o extends ContentFrameLayout {
        public o(Context context) {
            super(context);
        }

        private boolean c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.O(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(defpackage.f.d(getContext(), i));
        }
    }

    protected static final class p {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        androidx.appcompat.view.menu.g j;
        androidx.appcompat.view.menu.e k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        p(int i2) {
            this.a = i2;
        }

        /* access modifiers changed from: package-private */
        public androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.l, R$layout.abc_list_menu_item_layout);
                this.k = eVar;
                eVar.k(aVar);
                this.j.b(this.k);
            }
            return this.k.b(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.a().getCount() > 0;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.Q(this.k);
                }
                this.j = gVar;
                if (gVar != null && (eVar = this.k) != null) {
                    gVar.b(eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R$attr.actionBarPopupTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            }
            newTheme.resolveAttribute(R$attr.panelMenuListTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                i3 = R$style.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i3, true);
            defpackage.p pVar = new defpackage.p(context, 0);
            pVar.getTheme().setTo(newTheme);
            this.l = pVar;
            TypedArray obtainStyledAttributes = pVar.obtainStyledAttributes(R$styleable.AppCompatTheme);
            this.b = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTheme_panelBackground, 0);
            this.f = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private final class q implements m.a {
        q() {
        }

        public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g F = gVar.F();
            boolean z2 = F != gVar;
            f fVar = f.this;
            if (z2) {
                gVar = F;
            }
            p Y = fVar.Y(gVar);
            if (Y == null) {
                return;
            }
            if (z2) {
                f.this.L(Y.a, Y, F);
                f.this.P(Y, true);
                return;
            }
            f.this.P(Y, z);
        }

        public boolean d(androidx.appcompat.view.menu.g gVar) {
            Window.Callback e0;
            if (gVar != null) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.E || (e0 = fVar.e0()) == null || f.this.Q) {
                return true;
            }
            e0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        boolean z2 = false;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21 && i2 <= 25) {
            z2 = true;
        }
        i0 = z2;
        if (f0 && !h0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    f(Activity activity, d dVar) {
        this(activity, (Window) null, dVar, activity);
    }

    f(Dialog dialog, d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    private f(Context context, Window window, d dVar, Object obj) {
        Integer num;
        AppCompatActivity H0;
        this.w = null;
        this.x = true;
        this.R = -100;
        this.Z = new b();
        this.i = context;
        this.l = dVar;
        this.h = obj;
        if (this.R == -100 && (obj instanceof Dialog) && (H0 = H0()) != null) {
            this.R = H0.z().j();
        }
        if (this.R == -100 && (num = e0.get(this.h.getClass())) != null) {
            this.R = num.intValue();
            e0.remove(this.h.getClass());
        }
        if (window != null) {
            J(window);
        }
        androidx.appcompat.widget.g.h();
    }

    private void A0(androidx.appcompat.view.menu.g gVar, boolean z2) {
        androidx.appcompat.widget.o oVar = this.p;
        if (oVar == null || !oVar.d() || (ViewConfiguration.get(this.i).hasPermanentMenuKey() && !this.p.f())) {
            p c02 = c0(0, true);
            c02.q = true;
            P(c02, false);
            w0(c02, (KeyEvent) null);
            return;
        }
        Window.Callback e02 = e0();
        if (this.p.b() && z2) {
            this.p.g();
            if (!this.Q) {
                e02.onPanelClosed(108, c0(0, true).j);
            }
        } else if (e02 != null && !this.Q) {
            if (this.X && (this.Y & 1) != 0) {
                this.j.getDecorView().removeCallbacks(this.Z);
                this.Z.run();
            }
            p c03 = c0(0, true);
            androidx.appcompat.view.menu.g gVar2 = c03.j;
            if (gVar2 != null && !c03.r && e02.onPreparePanel(0, c03.i, gVar2)) {
                e02.onMenuOpened(108, c03.j);
                this.p.h();
            }
        }
    }

    private int B0(int i2) {
        if (i2 == 8) {
            return 108;
        }
        if (i2 == 9) {
            return 109;
        }
        return i2;
    }

    private boolean D0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.j.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || o4.N((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private void G0() {
        if (this.y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private boolean H(boolean z2) {
        if (this.Q) {
            return false;
        }
        int K2 = K();
        boolean I0 = I0(m0(K2), z2);
        if (K2 == 0) {
            b0().e();
        } else {
            m mVar = this.V;
            if (mVar != null) {
                mVar.a();
            }
        }
        if (K2 == 3) {
            a0().e();
        } else {
            m mVar2 = this.W;
            if (mVar2 != null) {
                mVar2.a();
            }
        }
        return I0;
    }

    private AppCompatActivity H0() {
        Context context = this.i;
        while (context != null) {
            if (!(context instanceof AppCompatActivity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (AppCompatActivity) context;
            }
        }
        return null;
    }

    private void I() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.z.findViewById(16908290);
        View decorView = this.j.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.i.obtainStyledAttributes(R$styleable.AppCompatTheme);
        obtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private boolean I0(int i2, boolean z2) {
        int i3 = this.i.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z3 = true;
        int i4 = i2 != 1 ? i2 != 2 ? i3 : 32 : 16;
        boolean k0 = k0();
        boolean z4 = false;
        if ((i0 || i4 != i3) && !k0 && Build.VERSION.SDK_INT >= 17 && !this.N && (this.h instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & -49) | i4;
            try {
                ((ContextThemeWrapper) this.h).applyOverrideConfiguration(configuration);
                z4 = true;
            } catch (IllegalStateException unused) {
            }
        }
        int i5 = this.i.getResources().getConfiguration().uiMode & 48;
        if (!z4 && i5 != i4 && z2 && !k0 && this.N && (Build.VERSION.SDK_INT >= 17 || this.O)) {
            Object obj = this.h;
            if (obj instanceof Activity) {
                androidx.core.app.a.n((Activity) obj);
                z4 = true;
            }
        }
        if (z4 || i5 == i4) {
            z3 = z4;
        } else {
            J0(i4, k0);
        }
        if (z3) {
            Object obj2 = this.h;
            if (obj2 instanceof AppCompatActivity) {
                ((AppCompatActivity) obj2).C(i2);
            }
        }
        return z3;
    }

    private void J(Window window) {
        if (this.j == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof k)) {
                k kVar = new k(callback);
                this.k = kVar;
                window.setCallback(kVar);
                g0 t2 = g0.t(this.i, (AttributeSet) null, g0);
                Drawable h2 = t2.h(0);
                if (h2 != null) {
                    window.setBackgroundDrawable(h2);
                }
                t2.v();
                this.j = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private void J0(int i2, boolean z2) {
        Resources resources = this.i.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i2 | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            h.a(resources);
        }
        int i3 = this.S;
        if (i3 != 0) {
            this.i.setTheme(i3);
            if (Build.VERSION.SDK_INT >= 23) {
                this.i.getTheme().applyStyle(this.S, true);
            }
        }
        if (z2) {
            Object obj = this.h;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.n) {
                    if (!((androidx.lifecycle.n) activity).a().b().isAtLeast(h.b.STARTED)) {
                        return;
                    }
                } else if (!this.P) {
                    return;
                }
                activity.onConfigurationChanged(configuration);
            }
        }
    }

    private int K() {
        int i2 = this.R;
        return i2 != -100 ? i2 : e.h();
    }

    private void N() {
        m mVar = this.V;
        if (mVar != null) {
            mVar.a();
        }
        m mVar2 = this.W;
        if (mVar2 != null) {
            mVar2.a();
        }
    }

    private ViewGroup Q() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.i.obtainStyledAttributes(R$styleable.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowNoTitle, false)) {
                z(1);
            } else if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionBar, false)) {
                z(108);
            }
            if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                z(109);
            }
            if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                z(10);
            }
            this.H = obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            X();
            this.j.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.i);
            if (this.I) {
                viewGroup = (ViewGroup) from.inflate(this.G ? R$layout.abc_screen_simple_overlay_action_mode : R$layout.abc_screen_simple, (ViewGroup) null);
                if (Build.VERSION.SDK_INT >= 21) {
                    o4.v0(viewGroup, new c());
                } else {
                    ((s) viewGroup).setOnFitSystemWindowsListener(new d());
                }
            } else if (this.H) {
                viewGroup = (ViewGroup) from.inflate(R$layout.abc_dialog_title_material, (ViewGroup) null);
                this.F = false;
                this.E = false;
            } else if (this.E) {
                TypedValue typedValue = new TypedValue();
                this.i.getTheme().resolveAttribute(R$attr.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new defpackage.p(this.i, typedValue.resourceId) : this.i).inflate(R$layout.abc_screen_toolbar, (ViewGroup) null);
                androidx.appcompat.widget.o oVar = (androidx.appcompat.widget.o) viewGroup.findViewById(R$id.decor_content_parent);
                this.p = oVar;
                oVar.setWindowCallback(e0());
                if (this.F) {
                    this.p.i(109);
                }
                if (this.C) {
                    this.p.i(2);
                }
                if (this.D) {
                    this.p.i(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.p == null) {
                    this.A = (TextView) viewGroup.findViewById(R$id.title);
                }
                m0.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R$id.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.j.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.j.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.E + ", windowActionBarOverlay: " + this.F + ", android:windowIsFloating: " + this.H + ", windowActionModeOverlay: " + this.G + ", windowNoTitle: " + this.I + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void W() {
        if (!this.y) {
            this.z = Q();
            CharSequence d02 = d0();
            if (!TextUtils.isEmpty(d02)) {
                androidx.appcompat.widget.o oVar = this.p;
                if (oVar != null) {
                    oVar.setWindowTitle(d02);
                } else if (x0() != null) {
                    x0().z(d02);
                } else {
                    TextView textView = this.A;
                    if (textView != null) {
                        textView.setText(d02);
                    }
                }
            }
            I();
            v0(this.z);
            this.y = true;
            p c02 = c0(0, false);
            if (this.Q) {
                return;
            }
            if (c02 == null || c02.j == null) {
                j0(108);
            }
        }
    }

    private void X() {
        if (this.j == null) {
            Object obj = this.h;
            if (obj instanceof Activity) {
                J(((Activity) obj).getWindow());
            }
        }
        if (this.j == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private m a0() {
        if (this.W == null) {
            this.W = new l(this.i);
        }
        return this.W;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f0() {
        /*
            r3 = this;
            r3.W()
            boolean r0 = r3.E
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.app.ActionBar r0 = r3.m
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.h
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            androidx.appcompat.app.l r0 = new androidx.appcompat.app.l
            java.lang.Object r1 = r3.h
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.F
            r0.<init>(r1, r2)
        L_0x001d:
            r3.m = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            androidx.appcompat.app.l r0 = new androidx.appcompat.app.l
            java.lang.Object r1 = r3.h
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            androidx.appcompat.app.ActionBar r0 = r3.m
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.a0
            r0.r(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.f0():void");
    }

    private boolean g0(p pVar) {
        View view = pVar.i;
        if (view != null) {
            pVar.h = view;
            return true;
        } else if (pVar.j == null) {
            return false;
        } else {
            if (this.r == null) {
                this.r = new q();
            }
            View view2 = (View) pVar.a(this.r);
            pVar.h = view2;
            return view2 != null;
        }
    }

    private boolean h0(p pVar) {
        pVar.d(Z());
        pVar.g = new o(pVar.l);
        pVar.c = 81;
        return true;
    }

    private boolean i0(p pVar) {
        Context context = this.i;
        int i2 = pVar.a;
        if ((i2 == 0 || i2 == 108) && this.p != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(R$attr.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                defpackage.p pVar2 = new defpackage.p(context, 0);
                pVar2.getTheme().setTo(theme2);
                context = pVar2;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.V(this);
        pVar.c(gVar);
        return true;
    }

    private void j0(int i2) {
        this.Y = (1 << i2) | this.Y;
        if (!this.X) {
            o4.b0(this.j.getDecorView(), this.Z);
            this.X = true;
        }
    }

    private boolean k0() {
        if (!this.U && (this.h instanceof Activity)) {
            PackageManager packageManager = this.i.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.i, this.h.getClass()), 0);
                this.T = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException unused) {
                this.T = false;
            }
        }
        this.U = true;
        return this.T;
    }

    private boolean p0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p c02 = c0(i2, true);
        if (!c02.o) {
            return z0(c02, keyEvent);
        }
        return false;
    }

    private boolean s0(int i2, KeyEvent keyEvent) {
        AudioManager audioManager;
        boolean z2;
        androidx.appcompat.widget.o oVar;
        if (this.s != null) {
            return false;
        }
        boolean z3 = true;
        p c02 = c0(i2, true);
        if (i2 == 0 && (oVar = this.p) != null && oVar.d() && !ViewConfiguration.get(this.i).hasPermanentMenuKey()) {
            if (this.p.b()) {
                z3 = this.p.g();
            } else if (!this.Q && z0(c02, keyEvent)) {
                z3 = this.p.h();
            }
            audioManager.playSoundEffect(0);
            return z3;
        } else if (c02.o || c02.n) {
            boolean z4 = c02.o;
            P(c02, true);
            z3 = z4;
            if (z3 && (audioManager = (AudioManager) this.i.getSystemService("audio")) != null) {
                audioManager.playSoundEffect(0);
            }
            return z3;
        } else if (c02.m) {
            if (c02.r) {
                c02.m = false;
                z2 = z0(c02, keyEvent);
            } else {
                z2 = true;
            }
            if (z2) {
                w0(c02, keyEvent);
                audioManager.playSoundEffect(0);
                return z3;
            }
        }
        z3 = false;
        audioManager.playSoundEffect(0);
        return z3;
    }

    private void w0(p pVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (!pVar.o && !this.Q) {
            if (pVar.a == 0) {
                if ((this.i.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback e02 = e0();
            if (e02 == null || e02.onMenuOpened(pVar.a, pVar.j)) {
                WindowManager windowManager = (WindowManager) this.i.getSystemService("window");
                if (windowManager != null && z0(pVar, keyEvent)) {
                    if (pVar.g == null || pVar.q) {
                        ViewGroup viewGroup = pVar.g;
                        if (viewGroup == null) {
                            if (!h0(pVar) || pVar.g == null) {
                                return;
                            }
                        } else if (pVar.q && viewGroup.getChildCount() > 0) {
                            pVar.g.removeAllViews();
                        }
                        if (g0(pVar) && pVar.b()) {
                            ViewGroup.LayoutParams layoutParams2 = pVar.h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            pVar.g.setBackgroundResource(pVar.b);
                            ViewParent parent = pVar.h.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(pVar.h);
                            }
                            pVar.g.addView(pVar.h, layoutParams2);
                            if (!pVar.h.hasFocus()) {
                                pVar.h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = pVar.i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i2 = -1;
                            pVar.n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, pVar.d, pVar.e, 1002, 8519680, -3);
                            layoutParams3.gravity = pVar.c;
                            layoutParams3.windowAnimations = pVar.f;
                            windowManager.addView(pVar.g, layoutParams3);
                            pVar.o = true;
                            return;
                        }
                    }
                    i2 = -2;
                    pVar.n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, pVar.d, pVar.e, 1002, 8519680, -3);
                    layoutParams32.gravity = pVar.c;
                    layoutParams32.windowAnimations = pVar.f;
                    windowManager.addView(pVar.g, layoutParams32);
                    pVar.o = true;
                    return;
                }
                return;
            }
            P(pVar, true);
        }
    }

    private boolean y0(p pVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((pVar.m || z0(pVar, keyEvent)) && (gVar = pVar.j) != null) {
            z2 = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.p == null) {
            P(pVar, true);
        }
        return z2;
    }

    private boolean z0(p pVar, KeyEvent keyEvent) {
        androidx.appcompat.widget.o oVar;
        androidx.appcompat.widget.o oVar2;
        androidx.appcompat.widget.o oVar3;
        if (this.Q) {
            return false;
        }
        if (pVar.m) {
            return true;
        }
        p pVar2 = this.L;
        if (!(pVar2 == null || pVar2 == pVar)) {
            P(pVar2, false);
        }
        Window.Callback e02 = e0();
        if (e02 != null) {
            pVar.i = e02.onCreatePanelView(pVar.a);
        }
        int i2 = pVar.a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (oVar3 = this.p) != null) {
            oVar3.c();
        }
        if (pVar.i == null && (!z2 || !(x0() instanceof i))) {
            if (pVar.j == null || pVar.r) {
                if (pVar.j == null && (!i0(pVar) || pVar.j == null)) {
                    return false;
                }
                if (z2 && this.p != null) {
                    if (this.q == null) {
                        this.q = new i();
                    }
                    this.p.a(pVar.j, this.q);
                }
                pVar.j.h0();
                if (!e02.onCreatePanelMenu(pVar.a, pVar.j)) {
                    pVar.c((androidx.appcompat.view.menu.g) null);
                    if (z2 && (oVar2 = this.p) != null) {
                        oVar2.a((Menu) null, this.q);
                    }
                    return false;
                }
                pVar.r = false;
            }
            pVar.j.h0();
            Bundle bundle = pVar.s;
            if (bundle != null) {
                pVar.j.R(bundle);
                pVar.s = null;
            }
            if (!e02.onPreparePanel(0, pVar.i, pVar.j)) {
                if (z2 && (oVar = this.p) != null) {
                    oVar.a((Menu) null, this.q);
                }
                pVar.j.g0();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            pVar.p = z3;
            pVar.j.setQwertyMode(z3);
            pVar.j.g0();
        }
        pVar.m = true;
        pVar.n = false;
        this.L = pVar;
        return true;
    }

    public void A(int i2) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.i).inflate(i2, viewGroup);
        this.k.a().onContentChanged();
    }

    public void B(View view) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.k.a().onContentChanged();
    }

    public void C(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.k.a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.z;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean C0() {
        /*
            r1 = this;
            boolean r0 = r1.y
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.z
            if (r0 == 0) goto L_0x0010
            boolean r0 = defpackage.o4.O(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.C0():boolean");
    }

    public void D(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.h instanceof Activity) {
            ActionBar l2 = l();
            if (!(l2 instanceof l)) {
                this.n = null;
                if (l2 != null) {
                    l2.n();
                }
                if (toolbar != null) {
                    i iVar = new i(toolbar, d0(), this.k);
                    this.m = iVar;
                    window = this.j;
                    callback = iVar.C();
                } else {
                    this.m = null;
                    window = this.j;
                    callback = this.k;
                }
                window.setCallback(callback);
                n();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public void E(int i2) {
        this.S = i2;
    }

    public defpackage.n E0(n.a aVar) {
        d dVar;
        if (aVar != null) {
            defpackage.n nVar = this.s;
            if (nVar != null) {
                nVar.c();
            }
            j jVar = new j(aVar);
            ActionBar l2 = l();
            if (l2 != null) {
                defpackage.n A2 = l2.A(jVar);
                this.s = A2;
                if (!(A2 == null || (dVar = this.l) == null)) {
                    dVar.d(A2);
                }
            }
            if (this.s == null) {
                this.s = F0(jVar);
            }
            return this.s;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public final void F(CharSequence charSequence) {
        this.o = charSequence;
        androidx.appcompat.widget.o oVar = this.p;
        if (oVar != null) {
            oVar.setWindowTitle(charSequence);
        } else if (x0() != null) {
            x0().z(charSequence);
        } else {
            TextView textView = this.A;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.n F0(defpackage.n.a r8) {
        /*
            r7 = this;
            r7.V()
            n r0 = r7.s
            if (r0 == 0) goto L_0x000a
            r0.c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.f.j
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.f$j r0 = new androidx.appcompat.app.f$j
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.d r0 = r7.l
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.Q
            if (r2 != 0) goto L_0x0022
            n r0 = r0.i(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.s = r0
            goto L_0x0161
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.t
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.H
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.i
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = androidx.appcompat.R$attr.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.i
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            p r4 = new p
            android.content.Context r6 = r7.i
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.i
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.t = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = androidx.appcompat.R$attr.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.u = r5
            r6 = 2
            androidx.core.widget.h.b(r5, r6)
            android.widget.PopupWindow r5 = r7.u
            androidx.appcompat.widget.ActionBarContextView r6 = r7.t
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.u
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = androidx.appcompat.R$attr.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.t
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.u
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.f$f r0 = new androidx.appcompat.app.f$f
            r0.<init>()
            r7.v = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.z
            int r4 = androidx.appcompat.R$id.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.Z()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.t = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.t
            if (r0 == 0) goto L_0x0161
            r7.V()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.t
            r0.k()
            q r0 = new q
            androidx.appcompat.widget.ActionBarContextView r4 = r7.t
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.t
            android.widget.PopupWindow r6 = r7.u
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.e()
            boolean r8 = r8.b(r0, r3)
            if (r8 == 0) goto L_0x015f
            r0.k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            r8.h(r0)
            r7.s = r0
            boolean r8 = r7.C0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0129
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            t4 r8 = defpackage.o4.c(r8)
            r8.a(r0)
            r7.w = r8
            androidx.appcompat.app.f$g r0 = new androidx.appcompat.app.f$g
            r0.<init>()
            r8.g(r0)
            goto L_0x014f
        L_0x0129:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x014f
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            defpackage.o4.g0(r8)
        L_0x014f:
            android.widget.PopupWindow r8 = r7.u
            if (r8 == 0) goto L_0x0161
            android.view.Window r8 = r7.j
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.v
            r8.post(r0)
            goto L_0x0161
        L_0x015f:
            r7.s = r1
        L_0x0161:
            n r8 = r7.s
            if (r8 == 0) goto L_0x016c
            androidx.appcompat.app.d r0 = r7.l
            if (r0 == 0) goto L_0x016c
            r0.d(r8)
        L_0x016c:
            n r8 = r7.s
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.F0(n$a):n");
    }

    public boolean G() {
        return H(true);
    }

    /* access modifiers changed from: package-private */
    public int K0(int i2) {
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.t;
        int i3 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
            boolean z4 = true;
            if (this.t.isShown()) {
                if (this.b0 == null) {
                    this.b0 = new Rect();
                    this.c0 = new Rect();
                }
                Rect rect = this.b0;
                Rect rect2 = this.c0;
                rect.set(0, i2, 0, 0);
                m0.a(this.z, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.B;
                    if (view == null) {
                        View view2 = new View(this.i);
                        this.B = view2;
                        view2.setBackgroundColor(this.i.getResources().getColor(R$color.abc_input_method_navigation_guard));
                        this.z.addView(this.B, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.B.setLayoutParams(layoutParams);
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.B == null) {
                    z4 = false;
                }
                if (!this.G && z4) {
                    i2 = 0;
                }
                boolean z5 = z4;
                z4 = z3;
                z2 = z5;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z4 = false;
            }
            if (z4) {
                this.t.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.B;
        if (view3 != null) {
            if (!z2) {
                i3 = 8;
            }
            view3.setVisibility(i3);
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public void L(int i2, p pVar, Menu menu) {
        if (menu == null) {
            if (pVar == null && i2 >= 0) {
                p[] pVarArr = this.K;
                if (i2 < pVarArr.length) {
                    pVar = pVarArr[i2];
                }
            }
            if (pVar != null) {
                menu = pVar.j;
            }
        }
        if ((pVar == null || pVar.o) && !this.Q) {
            this.k.a().onPanelClosed(i2, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void M(androidx.appcompat.view.menu.g gVar) {
        if (!this.J) {
            this.J = true;
            this.p.j();
            Window.Callback e02 = e0();
            if (e02 != null && !this.Q) {
                e02.onPanelClosed(108, gVar);
            }
            this.J = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void O(int i2) {
        P(c0(i2, true), true);
    }

    /* access modifiers changed from: package-private */
    public void P(p pVar, boolean z2) {
        ViewGroup viewGroup;
        androidx.appcompat.widget.o oVar;
        if (!z2 || pVar.a != 0 || (oVar = this.p) == null || !oVar.b()) {
            WindowManager windowManager = (WindowManager) this.i.getSystemService("window");
            if (!(windowManager == null || !pVar.o || (viewGroup = pVar.g) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    L(pVar.a, pVar, (Menu) null);
                }
            }
            pVar.m = false;
            pVar.n = false;
            pVar.o = false;
            pVar.h = null;
            pVar.q = true;
            if (this.L == pVar) {
                this.L = null;
                return;
            }
            return;
        }
        M(pVar.j);
    }

    public View R(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        AppCompatViewInflater appCompatViewInflater;
        boolean z3 = false;
        if (this.d0 == null) {
            String string = this.i.obtainStyledAttributes(R$styleable.AppCompatTheme).getString(R$styleable.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.d0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    "Failed to instantiate custom view inflater " + string + ". Falling back to default.";
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.d0 = appCompatViewInflater;
        }
        if (f0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z3 = D0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z3 = true;
            }
            z2 = z3;
        } else {
            z2 = false;
        }
        return this.d0.q(view, str, context, attributeSet, z2, f0, true, l0.b());
    }

    /* access modifiers changed from: package-private */
    public void S() {
        androidx.appcompat.view.menu.g gVar;
        androidx.appcompat.widget.o oVar = this.p;
        if (oVar != null) {
            oVar.j();
        }
        if (this.u != null) {
            this.j.getDecorView().removeCallbacks(this.v);
            if (this.u.isShowing()) {
                try {
                    this.u.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.u = null;
        }
        V();
        p c02 = c0(0, false);
        if (c02 != null && (gVar = c02.j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.h;
        boolean z2 = true;
        if (((obj instanceof z3.a) || (obj instanceof g)) && (decorView = this.j.getDecorView()) != null && z3.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.k.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z2 = false;
        }
        return z2 ? o0(keyCode, keyEvent) : r0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public void U(int i2) {
        p c02;
        p c03 = c0(i2, true);
        if (c03.j != null) {
            Bundle bundle = new Bundle();
            c03.j.T(bundle);
            if (bundle.size() > 0) {
                c03.s = bundle;
            }
            c03.j.h0();
            c03.j.clear();
        }
        c03.r = true;
        c03.q = true;
        if ((i2 == 108 || i2 == 0) && this.p != null && (c02 = c0(0, false)) != null) {
            c02.m = false;
            z0(c02, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void V() {
        t4 t4Var = this.w;
        if (t4Var != null) {
            t4Var.b();
        }
    }

    /* access modifiers changed from: package-private */
    public p Y(Menu menu) {
        p[] pVarArr = this.K;
        int length = pVarArr != null ? pVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            p pVar = pVarArr[i2];
            if (pVar != null && pVar.j == menu) {
                return pVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Context Z() {
        ActionBar l2 = l();
        Context k2 = l2 != null ? l2.k() : null;
        return k2 == null ? this.i : k2;
    }

    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        p Y2;
        Window.Callback e02 = e0();
        if (e02 == null || this.Q || (Y2 = Y(gVar.F())) == null) {
            return false;
        }
        return e02.onMenuItemSelected(Y2.a, menuItem);
    }

    public void b(androidx.appcompat.view.menu.g gVar) {
        A0(gVar, true);
    }

    /* access modifiers changed from: package-private */
    public final m b0() {
        if (this.V == null) {
            this.V = new n(k.a(this.i));
        }
        return this.V;
    }

    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ((ViewGroup) this.z.findViewById(16908290)).addView(view, layoutParams);
        this.k.a().onContentChanged();
    }

    /* access modifiers changed from: protected */
    public p c0(int i2, boolean z2) {
        p[] pVarArr = this.K;
        if (pVarArr == null || pVarArr.length <= i2) {
            p[] pVarArr2 = new p[(i2 + 1)];
            if (pVarArr != null) {
                System.arraycopy(pVarArr, 0, pVarArr2, 0, pVarArr.length);
            }
            this.K = pVarArr2;
            pVarArr = pVarArr2;
        }
        p pVar = pVarArr[i2];
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(i2);
        pVarArr[i2] = pVar2;
        return pVar2;
    }

    public void d(Context context) {
        H(false);
        this.N = true;
    }

    /* access modifiers changed from: package-private */
    public final CharSequence d0() {
        Object obj = this.h;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.o;
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback e0() {
        return this.j.getCallback();
    }

    public <T extends View> T g(int i2) {
        W();
        return this.j.findViewById(i2);
    }

    public final a.b i() {
        return new h();
    }

    public int j() {
        return this.R;
    }

    public MenuInflater k() {
        if (this.n == null) {
            f0();
            ActionBar actionBar = this.m;
            this.n = new s(actionBar != null ? actionBar.k() : this.i);
        }
        return this.n;
    }

    public ActionBar l() {
        f0();
        return this.m;
    }

    public boolean l0() {
        return this.x;
    }

    public void m() {
        LayoutInflater from = LayoutInflater.from(this.i);
        if (from.getFactory() == null) {
            a4.b(from, this);
        } else {
            boolean z2 = from.getFactory2() instanceof f;
        }
    }

    /* access modifiers changed from: package-private */
    public int m0(int i2) {
        m b02;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        b02 = a0();
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.i.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                b02 = b0();
            }
            return b02.c();
        }
        return i2;
    }

    public void n() {
        ActionBar l2 = l();
        if (l2 == null || !l2.l()) {
            j0(0);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean n0() {
        defpackage.n nVar = this.s;
        if (nVar != null) {
            nVar.c();
            return true;
        }
        ActionBar l2 = l();
        return l2 != null && l2.h();
    }

    /* access modifiers changed from: package-private */
    public boolean o0(int i2, KeyEvent keyEvent) {
        boolean z2 = true;
        if (i2 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z2 = false;
            }
            this.M = z2;
        } else if (i2 == 82) {
            p0(0, keyEvent);
            return true;
        }
        return false;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return R(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public void q(Configuration configuration) {
        ActionBar l2;
        if (this.E && this.y && (l2 = l()) != null) {
            l2.m(configuration);
        }
        androidx.appcompat.widget.g.b().g(this.i);
        H(false);
    }

    /* access modifiers changed from: package-private */
    public boolean q0(int i2, KeyEvent keyEvent) {
        ActionBar l2 = l();
        if (l2 != null && l2.o(i2, keyEvent)) {
            return true;
        }
        p pVar = this.L;
        if (pVar == null || !y0(pVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.L == null) {
                p c02 = c0(0, true);
                z0(c02, keyEvent);
                boolean y0 = y0(c02, keyEvent.getKeyCode(), keyEvent, 1);
                c02.m = false;
                if (y0) {
                    return true;
                }
            }
            return false;
        }
        p pVar2 = this.L;
        if (pVar2 != null) {
            pVar2.n = true;
        }
        return true;
    }

    public void r(Bundle bundle) {
        this.N = true;
        H(false);
        X();
        Object obj = this.h;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.f.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar x0 = x0();
                if (x0 == null) {
                    this.a0 = true;
                } else {
                    x0.r(true);
                }
            }
        }
        this.O = true;
    }

    /* access modifiers changed from: package-private */
    public boolean r0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z2 = this.M;
            this.M = false;
            p c02 = c0(0, false);
            if (c02 != null && c02.o) {
                if (!z2) {
                    P(c02, true);
                }
                return true;
            } else if (n0()) {
                return true;
            }
        } else if (i2 == 82) {
            s0(0, keyEvent);
            return true;
        }
        return false;
    }

    public void s() {
        e.p(this);
        if (this.X) {
            this.j.getDecorView().removeCallbacks(this.Z);
        }
        this.P = false;
        this.Q = true;
        ActionBar actionBar = this.m;
        if (actionBar != null) {
            actionBar.n();
        }
        N();
    }

    public void t(Bundle bundle) {
        W();
    }

    /* access modifiers changed from: package-private */
    public void t0(int i2) {
        ActionBar l2;
        if (i2 == 108 && (l2 = l()) != null) {
            l2.i(true);
        }
    }

    public void u() {
        ActionBar l2 = l();
        if (l2 != null) {
            l2.w(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void u0(int i2) {
        if (i2 == 108) {
            ActionBar l2 = l();
            if (l2 != null) {
                l2.i(false);
            }
        } else if (i2 == 0) {
            p c02 = c0(i2, true);
            if (c02.o) {
                P(c02, false);
            }
        }
    }

    public void v(Bundle bundle) {
        if (this.R != -100) {
            e0.put(this.h.getClass(), Integer.valueOf(this.R));
        }
    }

    /* access modifiers changed from: package-private */
    public void v0(ViewGroup viewGroup) {
    }

    public void w() {
        this.P = true;
        G();
        e.o(this);
    }

    public void x() {
        this.P = false;
        e.p(this);
        ActionBar l2 = l();
        if (l2 != null) {
            l2.w(false);
        }
        if (this.h instanceof Dialog) {
            N();
        }
    }

    /* access modifiers changed from: package-private */
    public final ActionBar x0() {
        return this.m;
    }

    public boolean z(int i2) {
        int B0 = B0(i2);
        if (this.I && B0 == 108) {
            return false;
        }
        if (this.E && B0 == 1) {
            this.E = false;
        }
        if (B0 == 1) {
            G0();
            this.I = true;
            return true;
        } else if (B0 == 2) {
            G0();
            this.C = true;
            return true;
        } else if (B0 == 5) {
            G0();
            this.D = true;
            return true;
        } else if (B0 == 10) {
            G0();
            this.G = true;
            return true;
        } else if (B0 == 108) {
            G0();
            this.E = true;
            return true;
        } else if (B0 != 109) {
            return this.j.requestFeature(B0);
        } else {
            G0();
            this.F = true;
            return true;
        }
    }
}
