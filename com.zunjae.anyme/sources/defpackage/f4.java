package defpackage;

import android.view.View;
import android.view.ViewParent;

/* renamed from: f4  reason: default package */
public class f4 {
    private ViewParent a;
    private ViewParent b;
    private final View c;
    private boolean d;
    private int[] e;

    public f4(View view) {
        this.c = view;
    }

    private boolean g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent h;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!l() || (h = h(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] i8 = i();
            i8[0] = 0;
            i8[1] = 0;
            iArr3 = i8;
        } else {
            iArr3 = iArr2;
        }
        s4.d(h, this.c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    private ViewParent h(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    private int[] i() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    private void n(int i, ViewParent viewParent) {
        if (i == 0) {
            this.a = viewParent;
        } else if (i == 1) {
            this.b = viewParent;
        }
    }

    public boolean a(float f, float f2, boolean z) {
        ViewParent h;
        if (!l() || (h = h(0)) == null) {
            return false;
        }
        return s4.a(h, this.c, f, f2, z);
    }

    public boolean b(float f, float f2) {
        ViewParent h;
        if (!l() || (h = h(0)) == null) {
            return false;
        }
        return s4.b(h, this.c, f, f2);
    }

    public boolean c(int i, int i2, int[] iArr, int[] iArr2) {
        return d(i, i2, iArr, iArr2, 0);
    }

    public boolean d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent h;
        int i4;
        int i5;
        if (!l() || (h = h(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                iArr = i();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            s4.c(h, this.c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public void e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean f(int i, int i2, int i3, int i4, int[] iArr) {
        return g(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i) {
        return h(i) != null;
    }

    public boolean l() {
        return this.d;
    }

    public void m(boolean z) {
        if (this.d) {
            o4.B0(this.c);
        }
        this.d = z;
    }

    public boolean o(int i) {
        return p(i, 0);
    }

    public boolean p(int i, int i2) {
        if (k(i2)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.c;
        for (ViewParent parent = this.c.getParent(); parent != null; parent = parent.getParent()) {
            if (s4.f(parent, view, this.c, i, i2)) {
                n(i2, parent);
                s4.e(parent, view, this.c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i) {
        ViewParent h = h(i);
        if (h != null) {
            s4.g(h, this.c, i);
            n(i, (ViewParent) null);
        }
    }
}
