package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.github.mikephil.charting.utils.Utils;
import java.util.Locale;

final class e extends RecyclerView.s {
    private ViewPager2.i a;
    private final ViewPager2 b;
    private final RecyclerView c;
    private final LinearLayoutManager d;
    private int e;
    private int f;
    private a g = new a();
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    private static final class a {
        int a;
        float b;
        int c;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.a = -1;
            this.b = Utils.FLOAT_EPSILON;
            this.c = 0;
        }
    }

    e(ViewPager2 viewPager2) {
        this.b = viewPager2;
        RecyclerView recyclerView = viewPager2.n;
        this.c = recyclerView;
        this.d = (LinearLayoutManager) recyclerView.getLayoutManager();
        n();
    }

    private void c(int i2, float f2, int i3) {
        ViewPager2.i iVar = this.a;
        if (iVar != null) {
            iVar.b(i2, f2, i3);
        }
    }

    private void d(int i2) {
        ViewPager2.i iVar = this.a;
        if (iVar != null) {
            iVar.c(i2);
        }
    }

    private void e(int i2) {
        if ((this.e != 3 || this.f != 0) && this.f != i2) {
            this.f = i2;
            ViewPager2.i iVar = this.a;
            if (iVar != null) {
                iVar.a(i2);
            }
        }
    }

    private int f() {
        return this.d.j2();
    }

    private boolean k() {
        int i2 = this.e;
        return i2 == 1 || i2 == 4;
    }

    private void n() {
        this.e = 0;
        this.f = 0;
        this.g.a();
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }

    private void p(boolean z) {
        this.m = z;
        this.e = z ? 4 : 1;
        int i2 = this.i;
        if (i2 != -1) {
            this.h = i2;
            this.i = -1;
        } else if (this.h == -1) {
            this.h = f();
        }
        e(1);
    }

    private void q() {
        int i2;
        a aVar = this.g;
        int j2 = this.d.j2();
        aVar.a = j2;
        if (j2 == -1) {
            aVar.a();
            return;
        }
        View M = this.d.M(j2);
        if (M == null) {
            aVar.a();
            return;
        }
        int k0 = this.d.k0(M);
        int p0 = this.d.p0(M);
        int s0 = this.d.s0(M);
        int R = this.d.R(M);
        ViewGroup.LayoutParams layoutParams = M.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            k0 += marginLayoutParams.leftMargin;
            p0 += marginLayoutParams.rightMargin;
            s0 += marginLayoutParams.topMargin;
            R += marginLayoutParams.bottomMargin;
        }
        int height = M.getHeight() + s0 + R;
        int width = M.getWidth() + k0 + p0;
        if (this.d.z2() == 0) {
            i2 = (M.getLeft() - k0) - this.c.getPaddingLeft();
            if (this.b.d()) {
                i2 = -i2;
            }
            height = width;
        } else {
            i2 = (M.getTop() - s0) - this.c.getPaddingTop();
        }
        int i3 = -i2;
        aVar.c = i3;
        if (i3 >= 0) {
            aVar.b = height == 0 ? Utils.FLOAT_EPSILON : ((float) i3) / ((float) height);
        } else if (new a(this.d).d()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(aVar.c)}));
        }
    }

    public void a(RecyclerView recyclerView, int i2) {
        boolean z = true;
        if (!(this.e == 1 && this.f == 1) && i2 == 1) {
            p(false);
        } else if (!k() || i2 != 2) {
            if (k() && i2 == 0) {
                q();
                if (!this.k) {
                    int i3 = this.g.a;
                    if (i3 != -1) {
                        c(i3, Utils.FLOAT_EPSILON, 0);
                    }
                } else {
                    a aVar = this.g;
                    if (aVar.c == 0) {
                        int i4 = this.h;
                        int i5 = aVar.a;
                        if (i4 != i5) {
                            d(i5);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    e(0);
                    n();
                }
            }
            if (this.e == 2 && i2 == 0 && this.l) {
                q();
                a aVar2 = this.g;
                if (aVar2.c == 0) {
                    int i6 = this.i;
                    int i7 = aVar2.a;
                    if (i6 != i7) {
                        if (i7 == -1) {
                            i7 = 0;
                        }
                        d(i7);
                    }
                    e(0);
                    n();
                }
            }
        } else if (this.k) {
            e(2);
            this.j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r3.h != r5) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r5 < 0) == r3.b.d()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.k = r4
            r3.q()
            boolean r0 = r3.j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x003a
            r3.j = r2
            if (r6 > 0) goto L_0x0022
            if (r6 != 0) goto L_0x0020
            if (r5 >= 0) goto L_0x0016
            r5 = 1
            goto L_0x0017
        L_0x0016:
            r5 = 0
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.b
            boolean r6 = r6.d()
            if (r5 != r6) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r5 = 0
            goto L_0x0023
        L_0x0022:
            r5 = 1
        L_0x0023:
            if (r5 == 0) goto L_0x002f
            androidx.viewpager2.widget.e$a r5 = r3.g
            int r6 = r5.c
            if (r6 == 0) goto L_0x002f
            int r5 = r5.a
            int r5 = r5 + r4
            goto L_0x0033
        L_0x002f:
            androidx.viewpager2.widget.e$a r5 = r3.g
            int r5 = r5.a
        L_0x0033:
            r3.i = r5
            int r6 = r3.h
            if (r6 == r5) goto L_0x0048
            goto L_0x0045
        L_0x003a:
            int r5 = r3.e
            if (r5 != 0) goto L_0x0048
            androidx.viewpager2.widget.e$a r5 = r3.g
            int r5 = r5.a
            if (r5 != r1) goto L_0x0045
            r5 = 0
        L_0x0045:
            r3.d(r5)
        L_0x0048:
            androidx.viewpager2.widget.e$a r5 = r3.g
            int r5 = r5.a
            if (r5 != r1) goto L_0x004f
            r5 = 0
        L_0x004f:
            androidx.viewpager2.widget.e$a r6 = r3.g
            float r0 = r6.b
            int r6 = r6.c
            r3.c(r5, r0, r6)
            androidx.viewpager2.widget.e$a r5 = r3.g
            int r5 = r5.a
            int r6 = r3.i
            if (r5 == r6) goto L_0x0062
            if (r6 != r1) goto L_0x0072
        L_0x0062:
            androidx.viewpager2.widget.e$a r5 = r3.g
            int r5 = r5.c
            if (r5 != 0) goto L_0x0072
            int r5 = r3.f
            if (r5 == r4) goto L_0x0072
            r3.e(r2)
            r3.n()
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.e.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* access modifiers changed from: package-private */
    public double g() {
        q();
        a aVar = this.g;
        return ((double) aVar.a) + ((double) aVar.b);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.f == 0;
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.l = true;
    }

    /* access modifiers changed from: package-private */
    public void m(int i2, boolean z) {
        this.e = z ? 2 : 3;
        boolean z2 = false;
        this.m = false;
        if (this.i != i2) {
            z2 = true;
        }
        this.i = i2;
        e(2);
        if (z2) {
            d(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void o(ViewPager2.i iVar) {
        this.a = iVar;
    }
}
