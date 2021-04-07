package com.afollestad.materialdialogs.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R$attr;
import com.afollestad.materialdialogs.R$dimen;
import com.afollestad.materialdialogs.R$id;
import com.afollestad.materialdialogs.R$styleable;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.g;
import com.github.mikephil.charting.utils.Utils;

public class MDRootLayout extends ViewGroup {
    /* access modifiers changed from: private */
    public final MDButton[] e = new MDButton[3];
    private int f;
    private View g;
    private View h;
    /* access modifiers changed from: private */
    public boolean i = false;
    /* access modifiers changed from: private */
    public boolean j = false;
    private g k = g.ADAPTIVE;
    private boolean l = false;
    private boolean m = true;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private e s = e.START;
    private int t;
    private Paint u;
    private ViewTreeObserver.OnScrollChangedListener v;
    private ViewTreeObserver.OnScrollChangedListener w;
    private int x;

    class a implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ View e;
        final /* synthetic */ boolean f;
        final /* synthetic */ boolean g;

        a(View view, boolean z, boolean z2) {
            this.e = view;
            this.f = z;
            this.g = z2;
        }

        public boolean onPreDraw() {
            if (this.e.getMeasuredHeight() == 0) {
                return true;
            }
            if (!MDRootLayout.l((WebView) this.e)) {
                if (this.f) {
                    boolean unused = MDRootLayout.this.i = false;
                }
                if (this.g) {
                    boolean unused2 = MDRootLayout.this.j = false;
                }
            } else {
                MDRootLayout.this.h((ViewGroup) this.e, this.f, this.g);
            }
            this.e.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    class b extends RecyclerView.s {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;

        b(ViewGroup viewGroup, boolean z, boolean z2) {
            this.a = viewGroup;
            this.b = z;
            this.c = z2;
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
            super.b(recyclerView, i, i2);
            MDButton[] e = MDRootLayout.this.e;
            int length = e.length;
            boolean z = false;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    MDButton mDButton = e[i3];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z = true;
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            MDRootLayout.this.p(this.a, this.b, this.c, z);
            MDRootLayout.this.invalidate();
        }
    }

    class c implements ViewTreeObserver.OnScrollChangedListener {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;

        c(ViewGroup viewGroup, boolean z, boolean z2) {
            this.a = viewGroup;
            this.b = z;
            this.c = z2;
        }

        public void onScrollChanged() {
            MDButton[] e = MDRootLayout.this.e;
            int length = e.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < length) {
                    MDButton mDButton = e[i];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            ViewGroup viewGroup = this.a;
            if (viewGroup instanceof WebView) {
                MDRootLayout.this.q((WebView) viewGroup, this.b, this.c, z);
            } else {
                MDRootLayout.this.p(viewGroup, this.b, this.c, z);
            }
            MDRootLayout.this.invalidate();
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.afollestad.materialdialogs.e[] r0 = com.afollestad.materialdialogs.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.afollestad.materialdialogs.e r1 = com.afollestad.materialdialogs.e.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.afollestad.materialdialogs.e r1 = com.afollestad.materialdialogs.e.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.d.<clinit>():void");
        }
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o(context, attributeSet, 0);
    }

    @TargetApi(11)
    public MDRootLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        o(context, attributeSet, i2);
    }

    /* access modifiers changed from: private */
    public void h(ViewGroup viewGroup, boolean z, boolean z2) {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        ViewTreeObserver viewTreeObserver;
        if ((!z2 && this.v == null) || (z2 && this.w == null)) {
            if (viewGroup instanceof RecyclerView) {
                b bVar = new b(viewGroup, z, z2);
                RecyclerView recyclerView = (RecyclerView) viewGroup;
                recyclerView.l(bVar);
                bVar.b(recyclerView, 0, 0);
                return;
            }
            c cVar = new c(viewGroup, z, z2);
            if (!z2) {
                this.v = cVar;
                viewTreeObserver = viewGroup.getViewTreeObserver();
                onScrollChangedListener = this.v;
            } else {
                this.w = cVar;
                viewTreeObserver = viewGroup.getViewTreeObserver();
                onScrollChangedListener = this.w;
            }
            viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
            cVar.onScrollChanged();
        }
    }

    private static boolean i(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        return !(adapterView.getFirstVisiblePosition() == 0) || !(adapterView.getLastVisiblePosition() == adapterView.getCount() - 1) || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    public static boolean j(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().v()) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r4.getChildAt(0).getMeasuredHeight();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean k(android.widget.ScrollView r4) {
        /*
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r0 = r4.getChildAt(r1)
            int r0 = r0.getMeasuredHeight()
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r4 = r4.getPaddingBottom()
            int r2 = r2 - r4
            if (r2 >= r0) goto L_0x0021
            r1 = 1
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.k(android.widget.ScrollView):boolean");
    }

    /* access modifiers changed from: private */
    public static boolean l(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    private static View m(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getBottom() == viewGroup.getMeasuredHeight()) {
                return childAt;
            }
        }
        return null;
    }

    private static View n(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                return childAt;
            }
        }
        return null;
    }

    private void o(Context context, AttributeSet attributeSet, int i2) {
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MDRootLayout, i2, 0);
        this.n = obtainStyledAttributes.getBoolean(R$styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        obtainStyledAttributes.recycle();
        this.p = resources.getDimensionPixelSize(R$dimen.md_notitle_vertical_padding);
        this.q = resources.getDimensionPixelSize(R$dimen.md_button_frame_vertical_padding);
        this.t = resources.getDimensionPixelSize(R$dimen.md_button_padding_frame_side);
        this.r = resources.getDimensionPixelSize(R$dimen.md_button_height);
        this.u = new Paint();
        this.x = resources.getDimensionPixelSize(R$dimen.md_divider_height);
        this.u.setColor(x8.l(context, R$attr.md_divider_color));
        setWillNotDraw(false);
    }

    /* access modifiers changed from: private */
    public void p(ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z && viewGroup.getChildCount() > 0) {
            View view = this.g;
            this.i = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (z2 && viewGroup.getChildCount() > 0) {
            if (!z3 || (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() >= viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom()) {
                z4 = false;
            }
            this.j = z4;
        }
    }

    /* access modifiers changed from: private */
    public void q(WebView webView, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z) {
            View view = this.g;
            this.i = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z2) {
            if (!z3 || ((float) ((webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom())) >= ((float) webView.getContentHeight()) * webView.getScale()) {
                z4 = false;
            }
            this.j = z4;
        }
    }

    private void r() {
        e eVar;
        if (Build.VERSION.SDK_INT >= 17 && getResources().getConfiguration().getLayoutDirection() == 1) {
            int i2 = d.a[this.s.ordinal()];
            if (i2 == 1) {
                eVar = e.END;
            } else if (i2 == 2) {
                eVar = e.START;
            } else {
                return;
            }
            this.s = eVar;
        }
    }

    private static boolean s(View view) {
        boolean z = true;
        boolean z2 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!z2 || !(view instanceof MDButton)) {
            return z2;
        }
        if (((MDButton) view).getText().toString().trim().length() <= 0) {
            z = false;
        }
        return z;
    }

    private void u(View view, boolean z, boolean z2) {
        ScrollView scrollView;
        if (view != null) {
            if (view instanceof ScrollView) {
                ScrollView scrollView2 = (ScrollView) view;
                boolean k2 = k(scrollView2);
                scrollView = scrollView2;
                if (!k2) {
                    if (z) {
                        this.i = false;
                    }
                    if (!z2) {
                        return;
                    }
                    this.j = false;
                    return;
                }
            } else if (view instanceof AdapterView) {
                AdapterView adapterView = (AdapterView) view;
                boolean i2 = i(adapterView);
                scrollView = adapterView;
                if (!i2) {
                    if (z) {
                        this.i = false;
                    }
                    if (!z2) {
                        return;
                    }
                    this.j = false;
                    return;
                }
            } else if (view instanceof WebView) {
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, z, z2));
                return;
            } else if (view instanceof RecyclerView) {
                boolean j2 = j((RecyclerView) view);
                if (z) {
                    this.i = j2;
                }
                if (z2) {
                    this.j = j2;
                }
                if (j2) {
                    scrollView = (ViewGroup) view;
                } else {
                    return;
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                View n2 = n(viewGroup);
                u(n2, z, z2);
                View m2 = m(viewGroup);
                if (m2 != n2) {
                    u(m2, false, true);
                    return;
                }
                return;
            } else {
                return;
            }
            h(scrollView, z, z2);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.h;
        if (view != null) {
            if (this.i) {
                int top = view.getTop();
                canvas.drawRect(Utils.FLOAT_EPSILON, (float) (top - this.x), (float) getMeasuredWidth(), (float) top, this.u);
            }
            if (this.j) {
                int bottom = this.h.getBottom();
                canvas.drawRect(Utils.FLOAT_EPSILON, (float) bottom, (float) getMeasuredWidth(), (float) (bottom + this.x), this.u);
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() == R$id.md_titleFrame) {
                this.g = childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNeutral) {
                this.e[0] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNegative) {
                this.e[1] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultPositive) {
                this.e[2] = (MDButton) childAt;
            } else {
                this.h = childAt;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        MDButton mDButton;
        int i10;
        int i11;
        int i12;
        int i13;
        if (s(this.g)) {
            int measuredHeight = this.g.getMeasuredHeight() + i3;
            this.g.layout(i2, i3, i4, measuredHeight);
            i3 = measuredHeight;
        } else if (!this.o && this.m) {
            i3 += this.p;
        }
        if (s(this.h)) {
            View view = this.h;
            view.layout(i2, i3, i4, view.getMeasuredHeight() + i3);
        }
        if (this.l) {
            int i14 = i5 - this.q;
            for (MDButton mDButton2 : this.e) {
                if (s(mDButton2)) {
                    mDButton2.layout(i2, i14 - mDButton2.getMeasuredHeight(), i4, i14);
                    i14 -= mDButton2.getMeasuredHeight();
                }
            }
        } else {
            if (this.m) {
                i5 -= this.q;
            }
            int i15 = i5 - this.r;
            int i16 = this.t;
            if (s(this.e[2])) {
                if (this.s == e.END) {
                    i13 = i2 + i16;
                    i12 = this.e[2].getMeasuredWidth() + i13;
                    i6 = -1;
                } else {
                    int i17 = i4 - i16;
                    i13 = i17 - this.e[2].getMeasuredWidth();
                    i12 = i17;
                    i6 = i13;
                }
                this.e[2].layout(i13, i15, i12, i5);
                i16 += this.e[2].getMeasuredWidth();
            } else {
                i6 = -1;
            }
            if (s(this.e[1])) {
                e eVar = this.s;
                if (eVar == e.END) {
                    i11 = i16 + i2;
                    i10 = this.e[1].getMeasuredWidth() + i11;
                } else if (eVar == e.START) {
                    i10 = i4 - i16;
                    i11 = i10 - this.e[1].getMeasuredWidth();
                } else {
                    i11 = this.t + i2;
                    i10 = this.e[1].getMeasuredWidth() + i11;
                    i7 = i10;
                    this.e[1].layout(i11, i15, i10, i5);
                }
                i7 = -1;
                this.e[1].layout(i11, i15, i10, i5);
            } else {
                i7 = -1;
            }
            if (s(this.e[0])) {
                e eVar2 = this.s;
                if (eVar2 == e.END) {
                    i8 = i4 - this.t;
                    i9 = i8 - this.e[0].getMeasuredWidth();
                } else if (eVar2 == e.START) {
                    i9 = i2 + this.t;
                    i8 = this.e[0].getMeasuredWidth() + i9;
                } else {
                    if (i7 != -1 || i6 == -1) {
                        if (i6 == -1 && i7 != -1) {
                            mDButton = this.e[0];
                        } else if (i6 == -1) {
                            i7 = ((i4 - i2) / 2) - (this.e[0].getMeasuredWidth() / 2);
                            mDButton = this.e[0];
                        }
                        i6 = i7 + mDButton.getMeasuredWidth();
                    } else {
                        i7 = i6 - this.e[0].getMeasuredWidth();
                    }
                    i8 = i6;
                    i9 = i7;
                }
                this.e[0].layout(i9, i15, i8, i5);
            }
        }
        u(this.h, true, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r12)
            int r1 = android.view.View.MeasureSpec.getSize(r13)
            int r2 = r11.f
            if (r1 <= r2) goto L_0x000d
            r1 = r2
        L_0x000d:
            r2 = 1
            r11.m = r2
            com.afollestad.materialdialogs.g r3 = r11.k
            com.afollestad.materialdialogs.g r4 = com.afollestad.materialdialogs.g.ALWAYS
            r5 = 0
            if (r3 != r4) goto L_0x001a
            r3 = 1
        L_0x0018:
            r8 = 0
            goto L_0x0058
        L_0x001a:
            com.afollestad.materialdialogs.g r4 = com.afollestad.materialdialogs.g.NEVER
            if (r3 != r4) goto L_0x0020
            r3 = 0
            goto L_0x0018
        L_0x0020:
            com.afollestad.materialdialogs.internal.MDButton[] r3 = r11.e
            int r4 = r3.length
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0026:
            if (r6 >= r4) goto L_0x0041
            r9 = r3[r6]
            if (r9 == 0) goto L_0x003e
            boolean r10 = s(r9)
            if (r10 == 0) goto L_0x003e
            r9.b(r5, r5)
            r11.measureChild(r9, r12, r13)
            int r8 = r9.getMeasuredWidth()
            int r7 = r7 + r8
            r8 = 1
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x0041:
            android.content.Context r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = com.afollestad.materialdialogs.R$dimen.md_neutral_button_margin
            int r3 = r3.getDimensionPixelSize(r4)
            int r3 = r3 * 2
            int r3 = r0 - r3
            if (r7 <= r3) goto L_0x0057
            r3 = 1
            goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            r11.l = r3
            if (r3 == 0) goto L_0x007c
            com.afollestad.materialdialogs.internal.MDButton[] r3 = r11.e
            int r4 = r3.length
            r6 = 0
            r7 = 0
        L_0x0061:
            if (r6 >= r4) goto L_0x007d
            r9 = r3[r6]
            if (r9 == 0) goto L_0x0079
            boolean r10 = s(r9)
            if (r10 == 0) goto L_0x0079
            r9.b(r2, r5)
            r11.measureChild(r9, r12, r13)
            int r8 = r9.getMeasuredHeight()
            int r7 = r7 + r8
            r8 = 1
        L_0x0079:
            int r6 = r6 + 1
            goto L_0x0061
        L_0x007c:
            r7 = 0
        L_0x007d:
            if (r8 == 0) goto L_0x0099
            boolean r12 = r11.l
            if (r12 == 0) goto L_0x008e
            int r12 = r1 - r7
            int r13 = r11.q
            int r3 = r13 * 2
            int r3 = r3 + r5
            int r13 = r13 * 2
            int r13 = r13 + r5
            goto L_0x00a1
        L_0x008e:
            int r12 = r11.r
            int r12 = r1 - r12
            int r13 = r11.q
            int r13 = r13 * 2
            int r3 = r13 + 0
            goto L_0x00a0
        L_0x0099:
            int r12 = r11.q
            int r12 = r12 * 2
            int r3 = r12 + 0
            r12 = r1
        L_0x00a0:
            r13 = 0
        L_0x00a1:
            android.view.View r4 = r11.g
            boolean r4 = s(r4)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L_0x00bc
            android.view.View r4 = r11.g
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            r4.measure(r7, r5)
            android.view.View r4 = r11.g
            int r4 = r4.getMeasuredHeight()
            int r12 = r12 - r4
            goto L_0x00c3
        L_0x00bc:
            boolean r4 = r11.o
            if (r4 != 0) goto L_0x00c3
            int r4 = r11.p
            int r3 = r3 + r4
        L_0x00c3:
            android.view.View r4 = r11.h
            boolean r4 = s(r4)
            if (r4 == 0) goto L_0x0110
            android.view.View r4 = r11.h
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            int r7 = r12 - r13
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            r4.measure(r6, r7)
            android.view.View r4 = r11.h
            int r4 = r4.getMeasuredHeight()
            int r6 = r12 - r3
            if (r4 > r6) goto L_0x010d
            boolean r4 = r11.n
            if (r4 == 0) goto L_0x0101
            android.view.View r4 = r11.g
            boolean r4 = s(r4)
            if (r4 != 0) goto L_0x0101
            if (r8 == 0) goto L_0x00f5
            goto L_0x0101
        L_0x00f5:
            r11.m = r5
            android.view.View r2 = r11.h
            int r2 = r2.getMeasuredHeight()
            int r2 = r2 + r13
            int r5 = r12 - r2
            goto L_0x0111
        L_0x0101:
            r11.m = r2
            android.view.View r13 = r11.h
            int r13 = r13.getMeasuredHeight()
            int r13 = r13 + r3
            int r5 = r12 - r13
            goto L_0x0111
        L_0x010d:
            r11.m = r5
            goto L_0x0111
        L_0x0110:
            r5 = r12
        L_0x0111:
            int r1 = r1 - r5
            r11.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.onMeasure(int, int):void");
    }

    public void setButtonGravity(e eVar) {
        this.s = eVar;
        r();
    }

    public void setButtonStackedGravity(e eVar) {
        for (MDButton mDButton : this.e) {
            if (mDButton != null) {
                mDButton.setStackedGravity(eVar);
            }
        }
    }

    public void setDividerColor(int i2) {
        this.u.setColor(i2);
        invalidate();
    }

    public void setMaxHeight(int i2) {
        this.f = i2;
    }

    public void setStackingBehavior(g gVar) {
        this.k = gVar;
        invalidate();
    }

    public void t() {
        this.o = true;
    }
}
