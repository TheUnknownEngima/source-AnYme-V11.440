package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import defpackage.l5;
import java.util.ArrayList;
import java.util.List;

/* renamed from: k5  reason: default package */
public abstract class k5 extends w3 {
    private static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final l5.a<a5> o = new a();
    private static final l5.b<i0<a5>, a5> p = new b();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final int[] g = new int[2];
    private final AccessibilityManager h;
    private final View i;
    private c j;
    int k = Integer.MIN_VALUE;
    int l = Integer.MIN_VALUE;
    private int m = Integer.MIN_VALUE;

    /* renamed from: k5$a */
    static class a implements l5.a<a5> {
        a() {
        }

        /* renamed from: b */
        public void a(a5 a5Var, Rect rect) {
            a5Var.m(rect);
        }
    }

    /* renamed from: k5$b */
    static class b implements l5.b<i0<a5>, a5> {
        b() {
        }

        /* renamed from: c */
        public a5 a(i0<a5> i0Var, int i) {
            return i0Var.s(i);
        }

        /* renamed from: d */
        public int b(i0<a5> i0Var) {
            return i0Var.r();
        }
    }

    /* renamed from: k5$c */
    private class c extends b5 {
        c() {
        }

        public a5 a(int i) {
            return a5.R(k5.this.J(i));
        }

        public a5 c(int i) {
            int i2 = i == 2 ? k5.this.k : k5.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }

        public boolean e(int i, int i2, Bundle bundle) {
            return k5.this.R(i, i2, bundle);
        }
    }

    public k5(View view) {
        if (view != null) {
            this.i = view;
            this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (o4.w(view) == 0) {
                o4.s0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(View view, int i2, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 == 17) {
            rect.set(width, 0, width, height);
        } else if (i2 == 33) {
            rect.set(0, height, width, height);
        } else if (i2 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i2 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean G(android.graphics.Rect r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0032
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x000a
            goto L_0x0032
        L_0x000a:
            android.view.View r4 = r3.i
            int r4 = r4.getWindowVisibility()
            if (r4 == 0) goto L_0x0013
            return r0
        L_0x0013:
            android.view.View r4 = r3.i
        L_0x0015:
            android.view.ViewParent r4 = r4.getParent()
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L_0x002f
            android.view.View r4 = (android.view.View) r4
            float r1 = r4.getAlpha()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x002e
            int r1 = r4.getVisibility()
            if (r1 == 0) goto L_0x0015
        L_0x002e:
            return r0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r0 = 1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5.G(android.graphics.Rect):boolean");
    }

    private static int H(int i2) {
        if (i2 == 19) {
            return 33;
        }
        if (i2 != 21) {
            return i2 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean I(int i2, Rect rect) {
        Object obj;
        i0<a5> y = y();
        int i3 = this.l;
        int i4 = Integer.MIN_VALUE;
        a5 f2 = i3 == Integer.MIN_VALUE ? null : y.f(i3);
        if (i2 == 1 || i2 == 2) {
            obj = l5.d(y, p, o, f2, i2, o4.y(this.i) == 1, false);
        } else if (i2 == 17 || i2 == 33 || i2 == 66 || i2 == 130) {
            Rect rect2 = new Rect();
            int i5 = this.l;
            if (i5 != Integer.MIN_VALUE) {
                z(i5, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.i, i2, rect2);
            }
            obj = l5.c(y, p, o, f2, rect2, i2);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        a5 a5Var = (a5) obj;
        if (a5Var != null) {
            i4 = y.o(y.n(a5Var));
        }
        return V(i4);
    }

    private boolean S(int i2, int i3, Bundle bundle) {
        return i3 != 1 ? i3 != 2 ? i3 != 64 ? i3 != 128 ? L(i2, i3, bundle) : n(i2) : U(i2) : o(i2) : V(i2);
    }

    private boolean T(int i2, Bundle bundle) {
        return o4.Y(this.i, i2, bundle);
    }

    private boolean U(int i2) {
        int i3;
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled() || (i3 = this.k) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            n(i3);
        }
        this.k = i2;
        this.i.invalidate();
        W(i2, 32768);
        return true;
    }

    private void X(int i2) {
        int i3 = this.m;
        if (i3 != i2) {
            this.m = i2;
            W(i2, 128);
            W(i3, 256);
        }
    }

    private boolean n(int i2) {
        if (this.k != i2) {
            return false;
        }
        this.k = Integer.MIN_VALUE;
        this.i.invalidate();
        W(i2, 65536);
        return true;
    }

    private boolean p() {
        int i2 = this.l;
        return i2 != Integer.MIN_VALUE && L(i2, 16, (Bundle) null);
    }

    private AccessibilityEvent q(int i2, int i3) {
        return i2 != -1 ? r(i2, i3) : s(i3);
    }

    private AccessibilityEvent r(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        a5 J = J(i2);
        obtain.getText().add(J.y());
        obtain.setContentDescription(J.s());
        obtain.setScrollable(J.L());
        obtain.setPassword(J.K());
        obtain.setEnabled(J.G());
        obtain.setChecked(J.E());
        N(i2, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(J.p());
            c5.c(obtain, this.i, i2);
            obtain.setPackageName(this.i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private AccessibilityEvent s(int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private a5 t(int i2) {
        a5 P = a5.P();
        P.j0(true);
        P.l0(true);
        P.d0("android.view.View");
        P.Y(n);
        P.Z(n);
        P.u0(this.i);
        P(i2, P);
        if (P.y() == null && P.s() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        P.m(this.e);
        if (!this.e.equals(n)) {
            int k2 = P.k();
            if ((k2 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((k2 & 128) == 0) {
                P.s0(this.i.getContext().getPackageName());
                P.D0(this.i, i2);
                if (this.k == i2) {
                    P.W(true);
                    P.a(128);
                } else {
                    P.W(false);
                    P.a(64);
                }
                boolean z = this.l == i2;
                if (z) {
                    P.a(2);
                } else if (P.H()) {
                    P.a(1);
                }
                P.m0(z);
                this.i.getLocationOnScreen(this.g);
                P.n(this.d);
                if (this.d.equals(n)) {
                    P.m(this.d);
                    if (P.b != -1) {
                        a5 P2 = a5.P();
                        for (int i3 = P.b; i3 != -1; i3 = P2.b) {
                            P2.v0(this.i, -1);
                            P2.Y(n);
                            P(i3, P2);
                            P2.m(this.e);
                            Rect rect = this.d;
                            Rect rect2 = this.e;
                            rect.offset(rect2.left, rect2.top);
                        }
                        P2.T();
                    }
                    this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                }
                if (this.i.getLocalVisibleRect(this.f)) {
                    this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                    if (this.d.intersect(this.f)) {
                        P.Z(this.d);
                        if (G(this.d)) {
                            P.G0(true);
                        }
                    }
                }
                return P;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private a5 u() {
        a5 Q = a5.Q(this.i);
        o4.W(this.i, Q);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (Q.o() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Q.d(this.i, ((Integer) arrayList.get(i2)).intValue());
            }
            return Q;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private i0<a5> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        i0<a5> i0Var = new i0<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            i0Var.p(i2, t(i2));
        }
        return i0Var;
    }

    private void z(int i2, Rect rect) {
        J(i2).m(rect);
    }

    public final int A() {
        return this.l;
    }

    /* access modifiers changed from: protected */
    public abstract int B(float f2, float f3);

    /* access modifiers changed from: protected */
    public abstract void C(List<Integer> list);

    public final void E(int i2) {
        F(i2, 0);
    }

    public final void F(int i2, int i3) {
        ViewParent parent;
        if (i2 != Integer.MIN_VALUE && this.h.isEnabled() && (parent = this.i.getParent()) != null) {
            AccessibilityEvent q = q(i2, 2048);
            z4.b(q, i3);
            s4.h(parent, this.i, q);
        }
    }

    /* access modifiers changed from: package-private */
    public a5 J(int i2) {
        return i2 == -1 ? u() : t(i2);
    }

    public final void K(boolean z, int i2, Rect rect) {
        int i3 = this.l;
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        if (z) {
            I(i2, rect);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean L(int i2, int i3, Bundle bundle);

    /* access modifiers changed from: protected */
    public void M(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void N(int i2, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void O(a5 a5Var) {
    }

    /* access modifiers changed from: protected */
    public abstract void P(int i2, a5 a5Var);

    /* access modifiers changed from: protected */
    public void Q(int i2, boolean z) {
    }

    /* access modifiers changed from: package-private */
    public boolean R(int i2, int i3, Bundle bundle) {
        return i2 != -1 ? S(i2, i3, bundle) : T(i3, bundle);
    }

    public final boolean V(int i2) {
        int i3;
        if ((!this.i.isFocused() && !this.i.requestFocus()) || (i3 = this.l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        this.l = i2;
        Q(i2, true);
        W(i2, 8);
        return true;
    }

    public final boolean W(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return s4.h(parent, this.i, q(i2, i3));
    }

    public b5 b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        M(accessibilityEvent);
    }

    public void g(View view, a5 a5Var) {
        super.g(view, a5Var);
        O(a5Var);
    }

    public final boolean o(int i2) {
        if (this.l != i2) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        Q(i2, false);
        W(i2, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B = B(motionEvent.getX(), motionEvent.getY());
            X(B);
            return B != Integer.MIN_VALUE;
        } else if (action != 10 || this.m == Integer.MIN_VALUE) {
            return false;
        } else {
            X(Integer.MIN_VALUE);
            return true;
        }
    }

    public final boolean w(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int H = H(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i2 < repeatCount && I(H, (Rect) null)) {
                            i2++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return I(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return I(1, (Rect) null);
            }
            return false;
        }
    }

    public final int x() {
        return this.k;
    }
}
