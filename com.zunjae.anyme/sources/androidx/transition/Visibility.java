package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.a;

public abstract class Visibility extends Transition {
    private static final String[] O = {"android:visibility:visibility", "android:visibility:parent"};
    private int N = 3;

    class a extends t {
        final /* synthetic */ ViewGroup e;
        final /* synthetic */ View f;
        final /* synthetic */ View g;

        a(ViewGroup viewGroup, View view, View view2) {
            this.e = viewGroup;
            this.f = view;
            this.g = view2;
        }

        public void b(Transition transition) {
            d0.b(this.e).d(this.f);
        }

        public void c(Transition transition) {
            this.g.setTag(R$id.save_overlay_view, (Object) null);
            d0.b(this.e).d(this.f);
            transition.h0(this);
        }

        public void e(Transition transition) {
            if (this.f.getParent() == null) {
                d0.b(this.e).c(this.f);
            } else {
                Visibility.this.cancel();
            }
        }
    }

    private static class b extends AnimatorListenerAdapter implements Transition.f, a.C0058a {
        private final View e;
        private final int f;
        private final ViewGroup g;
        private final boolean h;
        private boolean i;
        boolean j = false;

        b(View view, int i2, boolean z) {
            this.e = view;
            this.f = i2;
            this.g = (ViewGroup) view.getParent();
            this.h = z;
            g(true);
        }

        private void f() {
            if (!this.j) {
                i0.i(this.e, this.f);
                ViewGroup viewGroup = this.g;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z) {
            ViewGroup viewGroup;
            if (this.h && this.i != z && (viewGroup = this.g) != null) {
                this.i = z;
                d0.d(viewGroup, z);
            }
        }

        public void a(Transition transition) {
        }

        public void b(Transition transition) {
            g(false);
        }

        public void c(Transition transition) {
            f();
            transition.h0(this);
        }

        public void d(Transition transition) {
        }

        public void e(Transition transition) {
            g(true);
        }

        public void onAnimationCancel(Animator animator) {
            this.j = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.j) {
                i0.i(this.e, this.f);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.j) {
                i0.i(this.e, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    private static class c {
        boolean a;
        boolean b;
        int c;
        int d;
        ViewGroup e;
        ViewGroup f;

        c() {
        }
    }

    public Visibility() {
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.c);
        int k = i2.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (k != 0) {
            F0(k);
        }
    }

    private void x0(x xVar) {
        xVar.a.put("android:visibility:visibility", Integer.valueOf(xVar.b.getVisibility()));
        xVar.a.put("android:visibility:parent", xVar.b.getParent());
        int[] iArr = new int[2];
        xVar.b.getLocationOnScreen(iArr);
        xVar.a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        if (r9 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (r0.e == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r0.c == 0) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.transition.Visibility.c z0(androidx.transition.x r8, androidx.transition.x r9) {
        /*
            r7 = this;
            androidx.transition.Visibility$c r0 = new androidx.transition.Visibility$c
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L_0x0037
        L_0x0033:
            r0.c = r4
            r0.e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L_0x005e
        L_0x005a:
            r0.d = r4
            r0.f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0086
            if (r9 == 0) goto L_0x0086
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r8 = r0.e
            android.view.ViewGroup r9 = r0.f
            if (r8 != r9) goto L_0x0070
            return r0
        L_0x0070:
            int r8 = r0.c
            int r9 = r0.d
            if (r8 == r9) goto L_0x007c
            if (r8 != 0) goto L_0x0079
            goto L_0x0097
        L_0x0079:
            if (r9 != 0) goto L_0x009a
            goto L_0x008c
        L_0x007c:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L_0x0081
            goto L_0x0097
        L_0x0081:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L_0x009a
            goto L_0x008c
        L_0x0086:
            if (r8 != 0) goto L_0x0091
            int r8 = r0.d
            if (r8 != 0) goto L_0x0091
        L_0x008c:
            r0.b = r2
        L_0x008e:
            r0.a = r2
            goto L_0x009a
        L_0x0091:
            if (r9 != 0) goto L_0x009a
            int r8 = r0.c
            if (r8 != 0) goto L_0x009a
        L_0x0097:
            r0.b = r1
            goto L_0x008e
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.z0(androidx.transition.x, androidx.transition.x):androidx.transition.Visibility$c");
    }

    public Animator A0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return null;
    }

    public Animator C0(ViewGroup viewGroup, x xVar, int i, x xVar2, int i2) {
        if ((this.N & 1) != 1 || xVar2 == null) {
            return null;
        }
        if (xVar == null) {
            View view = (View) xVar2.b.getParent();
            if (z0(B(view, false), S(view, false)).a) {
                return null;
            }
        }
        return A0(viewGroup, xVar2.b, xVar, xVar2);
    }

    public Animator D0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r10.z != false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator E0(android.view.ViewGroup r11, androidx.transition.x r12, int r13, androidx.transition.x r14, int r15) {
        /*
            r10 = this;
            int r13 = r10.N
            r0 = 2
            r13 = r13 & r0
            r1 = 0
            if (r13 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r12 != 0) goto L_0x000b
            return r1
        L_0x000b:
            android.view.View r13 = r12.b
            if (r14 == 0) goto L_0x0012
            android.view.View r2 = r14.b
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            int r3 = androidx.transition.R$id.save_overlay_view
            java.lang.Object r3 = r13.getTag(r3)
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0023
            r2 = r1
            r6 = 1
            goto L_0x0089
        L_0x0023:
            if (r2 == 0) goto L_0x0036
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != 0) goto L_0x002c
            goto L_0x0036
        L_0x002c:
            r3 = 4
            if (r15 != r3) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            if (r13 != r2) goto L_0x003b
        L_0x0032:
            r3 = r2
            r6 = 0
            r2 = r1
            goto L_0x003e
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r3 = r1
            r6 = 0
            goto L_0x003e
        L_0x003b:
            r2 = r1
            r3 = r2
            r6 = 1
        L_0x003e:
            if (r6 == 0) goto L_0x0085
            android.view.ViewParent r6 = r13.getParent()
            if (r6 != 0) goto L_0x0047
            goto L_0x0081
        L_0x0047:
            android.view.ViewParent r6 = r13.getParent()
            boolean r6 = r6 instanceof android.view.View
            if (r6 == 0) goto L_0x0085
            android.view.ViewParent r6 = r13.getParent()
            android.view.View r6 = (android.view.View) r6
            androidx.transition.x r7 = r10.S(r6, r5)
            androidx.transition.x r8 = r10.B(r6, r5)
            androidx.transition.Visibility$c r7 = r10.z0(r7, r8)
            boolean r7 = r7.a
            if (r7 != 0) goto L_0x006a
            android.view.View r2 = androidx.transition.w.a(r11, r13, r6)
            goto L_0x0085
        L_0x006a:
            int r7 = r6.getId()
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L_0x0085
            r6 = -1
            if (r7 == r6) goto L_0x0085
            android.view.View r6 = r11.findViewById(r7)
            if (r6 == 0) goto L_0x0085
            boolean r6 = r10.z
            if (r6 == 0) goto L_0x0085
        L_0x0081:
            r2 = r3
            r6 = 0
            r3 = r13
            goto L_0x0089
        L_0x0085:
            r6 = 0
            r9 = r3
            r3 = r2
            r2 = r9
        L_0x0089:
            if (r3 == 0) goto L_0x00db
            if (r6 != 0) goto L_0x00bd
            java.util.Map<java.lang.String, java.lang.Object> r15 = r12.a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r15 = r15.get(r1)
            int[] r15 = (int[]) r15
            r1 = r15[r4]
            r15 = r15[r5]
            int[] r0 = new int[r0]
            r11.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r3.getLeft()
            int r1 = r1 - r2
            r3.offsetLeftAndRight(r1)
            r0 = r0[r5]
            int r15 = r15 - r0
            int r0 = r3.getTop()
            int r15 = r15 - r0
            r3.offsetTopAndBottom(r15)
            androidx.transition.c0 r15 = androidx.transition.d0.b(r11)
            r15.c(r3)
        L_0x00bd:
            android.animation.Animator r12 = r10.D0(r11, r3, r12, r14)
            if (r6 != 0) goto L_0x00da
            if (r12 != 0) goto L_0x00cd
            androidx.transition.c0 r11 = androidx.transition.d0.b(r11)
            r11.d(r3)
            goto L_0x00da
        L_0x00cd:
            int r14 = androidx.transition.R$id.save_overlay_view
            r13.setTag(r14, r3)
            androidx.transition.Visibility$a r14 = new androidx.transition.Visibility$a
            r14.<init>(r11, r3, r13)
            r10.b(r14)
        L_0x00da:
            return r12
        L_0x00db:
            if (r2 == 0) goto L_0x00fd
            int r13 = r2.getVisibility()
            androidx.transition.i0.i(r2, r4)
            android.animation.Animator r11 = r10.D0(r11, r2, r12, r14)
            if (r11 == 0) goto L_0x00f9
            androidx.transition.Visibility$b r12 = new androidx.transition.Visibility$b
            r12.<init>(r2, r15, r5)
            r11.addListener(r12)
            androidx.transition.a.a(r11, r12)
            r10.b(r12)
            goto L_0x00fc
        L_0x00f9:
            androidx.transition.i0.i(r2, r13)
        L_0x00fc:
            return r11
        L_0x00fd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.E0(android.view.ViewGroup, androidx.transition.x, int, androidx.transition.x, int):android.animation.Animator");
    }

    public void F0(int i) {
        if ((i & -4) == 0) {
            this.N = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public String[] R() {
        return O;
    }

    public boolean T(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.a.containsKey("android:visibility:visibility") != xVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c z0 = z0(xVar, xVar2);
        if (z0.a) {
            return z0.c == 0 || z0.d == 0;
        }
        return false;
    }

    public void j(x xVar) {
        x0(xVar);
    }

    public void p(x xVar) {
        x0(xVar);
    }

    public Animator t(ViewGroup viewGroup, x xVar, x xVar2) {
        c z0 = z0(xVar, xVar2);
        if (!z0.a) {
            return null;
        }
        if (z0.e == null && z0.f == null) {
            return null;
        }
        if (z0.b) {
            return C0(viewGroup, xVar, z0.c, xVar2, z0.d);
        }
        return E0(viewGroup, xVar, z0.c, xVar2, z0.d);
    }

    public int y0() {
        return this.N;
    }
}
