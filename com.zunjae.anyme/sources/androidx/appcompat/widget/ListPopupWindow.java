package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.p;
import androidx.core.widget.h;
import java.lang.reflect.Method;

public class ListPopupWindow implements p {
    private static Method J;
    private static Method K;
    private static Method L;
    final f A;
    private final e B;
    private final d C;
    private final b D;
    final Handler E;
    private final Rect F;
    private Rect G;
    private boolean H;
    PopupWindow I;
    private Context e;
    private ListAdapter f;
    r g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;
    private boolean r;
    int s;
    private View t;
    private int u;
    private DataSetObserver v;
    private View w;
    private Drawable x;
    private AdapterView.OnItemClickListener y;
    private AdapterView.OnItemSelectedListener z;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            r rVar;
            if (i != -1 && (rVar = ListPopupWindow.this.g) != null) {
                rVar.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            ListPopupWindow.this.r();
        }
    }

    private class c extends DataSetObserver {
        c() {
        }

        public void onChanged() {
            if (ListPopupWindow.this.a()) {
                ListPopupWindow.this.b();
            }
        }

        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    private class d implements AbsListView.OnScrollListener {
        d() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.A() && ListPopupWindow.this.I.getContentView() != null) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.E.removeCallbacks(listPopupWindow.A);
                ListPopupWindow.this.A.run();
            }
        }
    }

    private class e implements View.OnTouchListener {
        e() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.I) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.I.getWidth() && y >= 0 && y < ListPopupWindow.this.I.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.E.postDelayed(listPopupWindow.A, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.E.removeCallbacks(listPopupWindow2.A);
                return false;
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void run() {
            r rVar = ListPopupWindow.this.g;
            if (rVar != null && o4.N(rVar) && ListPopupWindow.this.g.getCount() > ListPopupWindow.this.g.getChildCount()) {
                int childCount = ListPopupWindow.this.g.getChildCount();
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (childCount <= listPopupWindow.s) {
                    listPopupWindow.I.setInputMethodMode(2);
                    ListPopupWindow.this.b();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                J = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                L = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                K = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, (AttributeSet) null, R$attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.h = -2;
        this.i = -2;
        this.l = 1002;
        this.p = 0;
        this.q = false;
        this.r = false;
        this.s = Integer.MAX_VALUE;
        this.u = 0;
        this.A = new f();
        this.B = new e();
        this.C = new d();
        this.D = new b();
        this.F = new Rect();
        this.e = context;
        this.E = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ListPopupWindow, i2, i3);
        this.j = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.m = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i2, i3);
        this.I = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    private void C() {
        View view = this.t;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.t);
            }
        }
    }

    private void N(boolean z2) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = J;
            if (method != null) {
                try {
                    method.invoke(this.I, new Object[]{Boolean.valueOf(z2)});
                } catch (Exception unused) {
                }
            }
        } else {
            this.I.setIsClippedToScreen(z2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: androidx.appcompat.widget.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: androidx.appcompat.widget.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int q() {
        /*
            r12 = this;
            androidx.appcompat.widget.r r0 = r12.g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00b2
            android.content.Context r0 = r12.e
            boolean r5 = r12.H
            r5 = r5 ^ r3
            androidx.appcompat.widget.r r5 = r12.s(r0, r5)
            r12.g = r5
            android.graphics.drawable.Drawable r6 = r12.x
            if (r6 == 0) goto L_0x001b
            r5.setSelector(r6)
        L_0x001b:
            androidx.appcompat.widget.r r5 = r12.g
            android.widget.ListAdapter r6 = r12.f
            r5.setAdapter(r6)
            androidx.appcompat.widget.r r5 = r12.g
            android.widget.AdapterView$OnItemClickListener r6 = r12.y
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.r r5 = r12.g
            r5.setFocusable(r3)
            androidx.appcompat.widget.r r5 = r12.g
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.r r5 = r12.g
            androidx.appcompat.widget.ListPopupWindow$a r6 = new androidx.appcompat.widget.ListPopupWindow$a
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.r r5 = r12.g
            androidx.appcompat.widget.ListPopupWindow$d r6 = r12.C
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.z
            if (r5 == 0) goto L_0x004d
            androidx.appcompat.widget.r r6 = r12.g
            r6.setOnItemSelectedListener(r5)
        L_0x004d:
            androidx.appcompat.widget.r r5 = r12.g
            android.view.View r6 = r12.t
            if (r6 == 0) goto L_0x00ab
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.u
            if (r8 == 0) goto L_0x0082
            if (r8 == r3) goto L_0x007b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.u
            r0.append(r5)
            r0.toString()
            goto L_0x0088
        L_0x007b:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0088
        L_0x0082:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0088:
            int r0 = r12.i
            if (r0 < 0) goto L_0x008f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0091
        L_0x008f:
            r0 = 0
            r5 = 0
        L_0x0091:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00ac
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            android.widget.PopupWindow r6 = r12.I
            r6.setContentView(r5)
            goto L_0x00d0
        L_0x00b2:
            android.widget.PopupWindow r0 = r12.I
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.t
            if (r0 == 0) goto L_0x00cf
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            android.widget.PopupWindow r5 = r12.I
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00ec
            android.graphics.Rect r6 = r12.F
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.F
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.m
            if (r7 != 0) goto L_0x00f2
            int r6 = -r6
            r12.k = r6
            goto L_0x00f2
        L_0x00ec:
            android.graphics.Rect r5 = r12.F
            r5.setEmpty()
            r5 = 0
        L_0x00f2:
            android.widget.PopupWindow r6 = r12.I
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r3 = 0
        L_0x00fd:
            android.view.View r4 = r12.t()
            int r6 = r12.k
            int r3 = r12.u(r4, r6, r3)
            boolean r4 = r12.q
            if (r4 != 0) goto L_0x0155
            int r4 = r12.h
            if (r4 != r2) goto L_0x0110
            goto L_0x0155
        L_0x0110:
            int r4 = r12.i
            r6 = -2
            if (r4 == r6) goto L_0x011e
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x011e
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x0136
        L_0x011e:
            android.content.Context r2 = r12.e
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.F
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x0136:
            r7 = r1
            androidx.appcompat.widget.r r6 = r12.g
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0153
            androidx.appcompat.widget.r r2 = r12.g
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.r r3 = r12.g
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0153:
            int r1 = r1 + r0
            return r1
        L_0x0155:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ListPopupWindow.q():int");
    }

    private int u(View view, int i2, boolean z2) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.I.getMaxAvailableHeight(view, i2, z2);
        }
        Method method = K;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.I, new Object[]{view, Integer.valueOf(i2), Boolean.valueOf(z2)})).intValue();
            } catch (Exception unused) {
            }
        }
        return this.I.getMaxAvailableHeight(view, i2);
    }

    public boolean A() {
        return this.I.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.H;
    }

    public void D(View view) {
        this.w = view;
    }

    public void E(int i2) {
        this.I.setAnimationStyle(i2);
    }

    public void F(int i2) {
        Drawable background = this.I.getBackground();
        if (background != null) {
            background.getPadding(this.F);
            Rect rect = this.F;
            this.i = rect.left + rect.right + i2;
            return;
        }
        Q(i2);
    }

    public void G(int i2) {
        this.p = i2;
    }

    public void H(Rect rect) {
        this.G = rect != null ? new Rect(rect) : null;
    }

    public void I(int i2) {
        this.I.setInputMethodMode(i2);
    }

    public void J(boolean z2) {
        this.H = z2;
        this.I.setFocusable(z2);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.I.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.y = onItemClickListener;
    }

    public void M(boolean z2) {
        this.o = true;
        this.n = z2;
    }

    public void O(int i2) {
        this.u = i2;
    }

    public void P(int i2) {
        r rVar = this.g;
        if (a() && rVar != null) {
            rVar.setListSelectionHidden(false);
            rVar.setSelection(i2);
            if (rVar.getChoiceMode() != 0) {
                rVar.setItemChecked(i2, true);
            }
        }
    }

    public void Q(int i2) {
        this.i = i2;
    }

    public boolean a() {
        return this.I.isShowing();
    }

    public void b() {
        int q2 = q();
        boolean A2 = A();
        h.b(this.I, this.l);
        boolean z2 = true;
        if (!this.I.isShowing()) {
            int i2 = this.i;
            if (i2 == -1) {
                i2 = -1;
            } else if (i2 == -2) {
                i2 = t().getWidth();
            }
            int i3 = this.h;
            if (i3 == -1) {
                q2 = -1;
            } else if (i3 != -2) {
                q2 = i3;
            }
            this.I.setWidth(i2);
            this.I.setHeight(q2);
            N(true);
            this.I.setOutsideTouchable(!this.r && !this.q);
            this.I.setTouchInterceptor(this.B);
            if (this.o) {
                h.a(this.I, this.n);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = L;
                if (method != null) {
                    try {
                        method.invoke(this.I, new Object[]{this.G});
                    } catch (Exception unused) {
                    }
                }
            } else {
                this.I.setEpicenterBounds(this.G);
            }
            h.c(this.I, t(), this.j, this.k, this.p);
            this.g.setSelection(-1);
            if (!this.H || this.g.isInTouchMode()) {
                r();
            }
            if (!this.H) {
                this.E.post(this.D);
            }
        } else if (o4.N(t())) {
            int i4 = this.i;
            if (i4 == -1) {
                i4 = -1;
            } else if (i4 == -2) {
                i4 = t().getWidth();
            }
            int i5 = this.h;
            if (i5 == -1) {
                if (!A2) {
                    q2 = -1;
                }
                if (A2) {
                    this.I.setWidth(this.i == -1 ? -1 : 0);
                    this.I.setHeight(0);
                } else {
                    this.I.setWidth(this.i == -1 ? -1 : 0);
                    this.I.setHeight(-1);
                }
            } else if (i5 != -2) {
                q2 = i5;
            }
            PopupWindow popupWindow = this.I;
            if (this.r || this.q) {
                z2 = false;
            }
            popupWindow.setOutsideTouchable(z2);
            this.I.update(t(), this.j, this.k, i4 < 0 ? -1 : i4, q2 < 0 ? -1 : q2);
        }
    }

    public void c(Drawable drawable) {
        this.I.setBackgroundDrawable(drawable);
    }

    public int d() {
        return this.j;
    }

    public void dismiss() {
        this.I.dismiss();
        C();
        this.I.setContentView((View) null);
        this.g = null;
        this.E.removeCallbacks(this.A);
    }

    public void f(int i2) {
        this.j = i2;
    }

    public Drawable i() {
        return this.I.getBackground();
    }

    public void k(int i2) {
        this.k = i2;
        this.m = true;
    }

    public ListView n() {
        return this.g;
    }

    public int o() {
        if (!this.m) {
            return 0;
        }
        return this.k;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.v;
        if (dataSetObserver == null) {
            this.v = new c();
        } else {
            ListAdapter listAdapter2 = this.f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.v);
        }
        r rVar = this.g;
        if (rVar != null) {
            rVar.setAdapter(this.f);
        }
    }

    public void r() {
        r rVar = this.g;
        if (rVar != null) {
            rVar.setListSelectionHidden(true);
            rVar.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public r s(Context context, boolean z2) {
        return new r(context, z2);
    }

    public View t() {
        return this.w;
    }

    public Object v() {
        if (!a()) {
            return null;
        }
        return this.g.getSelectedItem();
    }

    public long w() {
        if (!a()) {
            return Long.MIN_VALUE;
        }
        return this.g.getSelectedItemId();
    }

    public int x() {
        if (!a()) {
            return -1;
        }
        return this.g.getSelectedItemPosition();
    }

    public View y() {
        if (!a()) {
            return null;
        }
        return this.g.getSelectedView();
    }

    public int z() {
        return this.i;
    }
}
