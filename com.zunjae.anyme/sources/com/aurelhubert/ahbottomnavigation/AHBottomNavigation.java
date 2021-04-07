package com.aurelhubert.ahbottomnavigation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AHBottomNavigation extends FrameLayout {
    private Typeface A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private float K;
    private float L;
    private int M;
    private int N;
    private float O;
    private float P;
    private boolean Q;
    private h R;
    private int S;
    private int T;
    private Drawable U;
    private Typeface V;
    private int W;
    private int a0;
    private int b0;
    private int c0;
    private long d0;
    private g e;
    private f f;
    /* access modifiers changed from: private */
    public Context g;
    private Resources h;
    /* access modifiers changed from: private */
    public ArrayList<a> i = new ArrayList<>();
    private ArrayList<View> j = new ArrayList<>();
    private AHBottomNavigationBehavior<AHBottomNavigation> k;
    private LinearLayout l;
    /* access modifiers changed from: private */
    public View m;
    private Animator n;
    private boolean o = false;
    private boolean p = false;
    private boolean q;
    private List<s9> r = s9.d(5);
    private Boolean[] s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            AHBottomNavigation.this.requestLayout();
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ int e;

        b(int i) {
            this.e = i;
        }

        public void onClick(View view) {
            AHBottomNavigation.this.p(this.e, true);
        }
    }

    class c implements View.OnClickListener {
        final /* synthetic */ int e;

        c(int i) {
            this.e = i;
        }

        public void onClick(View view) {
            AHBottomNavigation.this.r(this.e, true);
        }
    }

    class d implements Animator.AnimatorListener {
        final /* synthetic */ int e;

        d(int i) {
            this.e = i;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            AHBottomNavigation aHBottomNavigation = AHBottomNavigation.this;
            aHBottomNavigation.setBackgroundColor(((a) aHBottomNavigation.i.get(this.e)).a(AHBottomNavigation.this.g));
            AHBottomNavigation.this.m.setBackgroundColor(0);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            AHBottomNavigation.this.m.setBackgroundColor(((a) AHBottomNavigation.this.i.get(this.e)).a(AHBottomNavigation.this.g));
        }
    }

    class e implements Animator.AnimatorListener {
        final /* synthetic */ int e;

        e(int i) {
            this.e = i;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            AHBottomNavigation aHBottomNavigation = AHBottomNavigation.this;
            aHBottomNavigation.setBackgroundColor(((a) aHBottomNavigation.i.get(this.e)).a(AHBottomNavigation.this.g));
            AHBottomNavigation.this.m.setBackgroundColor(0);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            AHBottomNavigation.this.m.setBackgroundColor(((a) AHBottomNavigation.this.i.get(this.e)).a(AHBottomNavigation.this.g));
        }
    }

    public interface f {
        void a(int i);
    }

    public interface g {
        boolean a(int i, boolean z);
    }

    public enum h {
        SHOW_WHEN_ACTIVE,
        SHOW_WHEN_ACTIVE_FORCE,
        ALWAYS_SHOW,
        ALWAYS_HIDE
    }

    public AHBottomNavigation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Boolean bool = Boolean.TRUE;
        this.s = new Boolean[]{bool, bool, bool, bool, bool};
        this.t = false;
        this.u = 0;
        this.v = 0;
        this.w = true;
        this.x = false;
        this.y = false;
        this.z = true;
        this.B = -1;
        this.C = 0;
        this.N = 0;
        this.Q = true;
        this.R = h.SHOW_WHEN_ACTIVE;
        l(context, attributeSet);
    }

    public AHBottomNavigation(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Boolean bool = Boolean.TRUE;
        this.s = new Boolean[]{bool, bool, bool, bool, bool};
        this.t = false;
        this.u = 0;
        this.v = 0;
        this.w = true;
        this.x = false;
        this.y = false;
        this.z = true;
        this.B = -1;
        this.C = 0;
        this.N = 0;
        this.Q = true;
        this.R = h.SHOW_WHEN_ACTIVE;
        l(context, attributeSet);
    }

    @SuppressLint({"NewApi"})
    @TargetApi(21)
    private int g(int i2) {
        if (!this.q) {
            return i2;
        }
        int identifier = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            this.N = this.h.getDimensionPixelSize(identifier);
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{16842973, 16843760});
        obtainStyledAttributes.getBoolean(0, false);
        boolean z2 = obtainStyledAttributes.getBoolean(1, true);
        if (k() && z2) {
            i2 += this.N;
        }
        obtainStyledAttributes.recycle();
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h(android.widget.LinearLayout r19) {
        /*
            r18 = this;
            r0 = r18
            android.content.Context r1 = r0.g
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            android.content.res.Resources r2 = r0.h
            int r3 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_height
            float r2 = r2.getDimension(r3)
            android.content.res.Resources r3 = r0.h
            int r4 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_min_width
            float r3 = r3.getDimension(r4)
            android.content.res.Resources r4 = r0.h
            int r5 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_max_width
            float r4 = r4.getDimension(r5)
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$h r5 = r0.R
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$h r6 = com.aurelhubert.ahbottomnavigation.AHBottomNavigation.h.ALWAYS_SHOW
            r7 = 3
            if (r5 != r6) goto L_0x0043
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r5 = r0.i
            int r5 = r5.size()
            if (r5 <= r7) goto L_0x0043
            android.content.res.Resources r3 = r0.h
            int r4 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_small_inactive_min_width
            float r3 = r3.getDimension(r4)
            android.content.res.Resources r4 = r0.h
            int r5 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_small_inactive_max_width
            float r4 = r4.getDimension(r5)
        L_0x0043:
            int r5 = r18.getWidth()
            int r6 = r18.getPaddingLeft()
            int r5 = r5 - r6
            int r6 = r18.getPaddingRight()
            int r5 = r5 - r6
            if (r5 == 0) goto L_0x0262
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r6 = r0.i
            int r6 = r6.size()
            if (r6 != 0) goto L_0x005d
            goto L_0x0262
        L_0x005d:
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r6 = r0.i
            int r6 = r6.size()
            int r5 = r5 / r6
            float r5 = (float) r5
            int r6 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x006a
            goto L_0x0071
        L_0x006a:
            int r3 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0070
            r3 = r4
            goto L_0x0071
        L_0x0070:
            r3 = r5
        L_0x0071:
            android.content.res.Resources r4 = r0.h
            int r5 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_text_size_active
            float r4 = r4.getDimension(r5)
            android.content.res.Resources r5 = r0.h
            int r6 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_text_size_inactive
            float r5 = r5.getDimension(r6)
            android.content.res.Resources r6 = r0.h
            int r8 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_margin_top_active
            float r6 = r6.getDimension(r8)
            int r6 = (int) r6
            float r8 = r0.K
            r9 = 0
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 == 0) goto L_0x009a
            float r10 = r0.L
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x009a
            r4 = r8
            r5 = r10
            goto L_0x00b8
        L_0x009a:
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$h r8 = r0.R
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$h r9 = com.aurelhubert.ahbottomnavigation.AHBottomNavigation.h.ALWAYS_SHOW
            if (r8 != r9) goto L_0x00b8
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r8 = r0.i
            int r8 = r8.size()
            if (r8 <= r7) goto L_0x00b8
            android.content.res.Resources r4 = r0.h
            int r5 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_text_size_forced_active
            float r4 = r4.getDimension(r5)
            android.content.res.Resources r5 = r0.h
            int r8 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_text_size_forced_inactive
            float r5 = r5.getDimension(r8)
        L_0x00b8:
            r8 = 0
            r9 = 0
        L_0x00ba:
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r10 = r0.i
            int r10 = r10.size()
            if (r9 >= r10) goto L_0x025d
            int r10 = r0.u
            if (r10 != r9) goto L_0x00c8
            r10 = 1
            goto L_0x00c9
        L_0x00c8:
            r10 = 0
        L_0x00c9:
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r12 = r0.i
            java.lang.Object r12 = r12.get(r9)
            com.aurelhubert.ahbottomnavigation.a r12 = (com.aurelhubert.ahbottomnavigation.a) r12
            int r13 = com.aurelhubert.ahbottomnavigation.R$layout.bottom_navigation_item
            android.view.View r13 = r1.inflate(r13, r0, r8)
            int r14 = com.aurelhubert.ahbottomnavigation.R$id.bottom_navigation_container
            android.view.View r14 = r13.findViewById(r14)
            android.widget.FrameLayout r14 = (android.widget.FrameLayout) r14
            int r15 = com.aurelhubert.ahbottomnavigation.R$id.bottom_navigation_item_icon
            android.view.View r15 = r13.findViewById(r15)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            int r11 = com.aurelhubert.ahbottomnavigation.R$id.bottom_navigation_item_title
            android.view.View r11 = r13.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            int r8 = com.aurelhubert.ahbottomnavigation.R$id.bottom_navigation_notification
            android.view.View r8 = r13.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.content.Context r7 = r0.g
            android.graphics.drawable.Drawable r7 = r12.b(r7)
            r15.setImageDrawable(r7)
            android.content.Context r7 = r0.g
            java.lang.String r7 = r12.c(r7)
            r11.setText(r7)
            android.graphics.Typeface r7 = r0.A
            if (r7 == 0) goto L_0x0110
            r11.setTypeface(r7)
        L_0x0110:
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$h r7 = r0.R
            r16 = r1
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$h r1 = com.aurelhubert.ahbottomnavigation.AHBottomNavigation.h.ALWAYS_SHOW
            if (r7 != r1) goto L_0x0130
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r1 = r0.i
            int r1 = r1.size()
            r7 = 3
            if (r1 <= r7) goto L_0x0130
            int r1 = r14.getPaddingTop()
            int r7 = r14.getPaddingBottom()
            r17 = r4
            r4 = 0
            r14.setPadding(r4, r1, r4, r7)
            goto L_0x0132
        L_0x0130:
            r17 = r4
        L_0x0132:
            if (r10 == 0) goto L_0x016d
            boolean r1 = r0.p
            if (r1 == 0) goto L_0x013d
            r1 = 1
            r13.setSelected(r1)
            goto L_0x013e
        L_0x013d:
            r1 = 1
        L_0x013e:
            r15.setSelected(r1)
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            boolean r1 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0182
            android.view.ViewGroup$LayoutParams r1 = r15.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r4 = r1.leftMargin
            int r7 = r1.rightMargin
            int r14 = r1.bottomMargin
            r1.setMargins(r4, r6, r7, r14)
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r4 = r0.W
            int r7 = r1.topMargin
            int r8 = r1.rightMargin
            int r14 = r1.bottomMargin
            r1.setMargins(r4, r7, r8, r14)
            r13.requestLayout()
            goto L_0x0182
        L_0x016d:
            r1 = 0
            r15.setSelected(r1)
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r4 = r0.a0
            int r7 = r1.topMargin
            int r8 = r1.rightMargin
            int r14 = r1.bottomMargin
            r1.setMargins(r4, r7, r8, r14)
        L_0x0182:
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x019a
            if (r10 == 0) goto L_0x01a7
            android.content.Context r1 = r0.g
            int r1 = r12.a(r1)
            r0.setBackgroundColor(r1)
            android.content.Context r1 = r0.g
            int r1 = r12.a(r1)
            r0.v = r1
            goto L_0x01a7
        L_0x019a:
            int r1 = r0.C
            if (r1 == 0) goto L_0x01a2
            r0.setBackgroundResource(r1)
            goto L_0x01a7
        L_0x01a2:
            int r1 = r0.B
            r0.setBackgroundColor(r1)
        L_0x01a7:
            if (r10 == 0) goto L_0x01ac
            r1 = r17
            goto L_0x01ad
        L_0x01ac:
            r1 = r5
        L_0x01ad:
            r4 = 0
            r11.setTextSize(r4, r1)
            java.lang.Boolean[] r1 = r0.s
            r1 = r1[r9]
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0209
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$b r1 = new com.aurelhubert.ahbottomnavigation.AHBottomNavigation$b
            r1.<init>(r9)
            r13.setOnClickListener(r1)
            boolean r1 = r0.Q
            if (r1 == 0) goto L_0x01e3
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r1 = r0.i
            java.lang.Object r1 = r1.get(r9)
            com.aurelhubert.ahbottomnavigation.a r1 = (com.aurelhubert.ahbottomnavigation.a) r1
            android.content.Context r4 = r0.g
            android.graphics.drawable.Drawable r1 = r1.b(r4)
            if (r10 == 0) goto L_0x01da
            int r4 = r0.D
            goto L_0x01dc
        L_0x01da:
            int r4 = r0.E
        L_0x01dc:
            boolean r7 = r0.Q
            android.graphics.drawable.Drawable r1 = com.aurelhubert.ahbottomnavigation.b.a(r1, r4, r7)
            goto L_0x01f1
        L_0x01e3:
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r1 = r0.i
            java.lang.Object r1 = r1.get(r9)
            com.aurelhubert.ahbottomnavigation.a r1 = (com.aurelhubert.ahbottomnavigation.a) r1
            android.content.Context r4 = r0.g
            android.graphics.drawable.Drawable r1 = r1.b(r4)
        L_0x01f1:
            r15.setImageDrawable(r1)
            if (r10 == 0) goto L_0x01f9
            int r1 = r0.D
            goto L_0x01fb
        L_0x01f9:
            int r1 = r0.E
        L_0x01fb:
            r11.setTextColor(r1)
            boolean r1 = r0.z
            r13.setSoundEffectsEnabled(r1)
            r1 = 1
            r13.setEnabled(r1)
            r1 = 0
            goto L_0x0242
        L_0x0209:
            boolean r1 = r0.Q
            if (r1 == 0) goto L_0x0224
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r1 = r0.i
            java.lang.Object r1 = r1.get(r9)
            com.aurelhubert.ahbottomnavigation.a r1 = (com.aurelhubert.ahbottomnavigation.a) r1
            android.content.Context r4 = r0.g
            android.graphics.drawable.Drawable r1 = r1.b(r4)
            int r4 = r0.G
            boolean r7 = r0.Q
            android.graphics.drawable.Drawable r1 = com.aurelhubert.ahbottomnavigation.b.a(r1, r4, r7)
            goto L_0x0232
        L_0x0224:
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r1 = r0.i
            java.lang.Object r1 = r1.get(r9)
            com.aurelhubert.ahbottomnavigation.a r1 = (com.aurelhubert.ahbottomnavigation.a) r1
            android.content.Context r4 = r0.g
            android.graphics.drawable.Drawable r1 = r1.b(r4)
        L_0x0232:
            r15.setImageDrawable(r1)
            int r1 = r0.G
            r11.setTextColor(r1)
            r1 = 1
            r13.setClickable(r1)
            r1 = 0
            r13.setEnabled(r1)
        L_0x0242:
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            int r7 = (int) r3
            int r8 = (int) r2
            r4.<init>(r7, r8)
            r7 = r19
            r7.addView(r13, r4)
            java.util.ArrayList<android.view.View> r4 = r0.j
            r4.add(r13)
            int r9 = r9 + 1
            r1 = r16
            r4 = r17
            r7 = 3
            r8 = 0
            goto L_0x00ba
        L_0x025d:
            r1 = -1
            r2 = 1
            r0.q(r2, r1)
        L_0x0262:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aurelhubert.ahbottomnavigation.AHBottomNavigation.h(android.widget.LinearLayout):void");
    }

    private void i() {
        if (this.i.size() >= 3) {
            int size = this.i.size();
        }
        int dimension = (int) this.h.getDimension(R$dimen.bottom_navigation_height);
        removeAllViews();
        this.j.clear();
        this.m = new View(this.g);
        if (Build.VERSION.SDK_INT >= 21) {
            addView(this.m, new FrameLayout.LayoutParams(-1, g(dimension)));
            this.M = dimension;
        }
        LinearLayout linearLayout = new LinearLayout(this.g);
        this.l = linearLayout;
        linearLayout.setOrientation(0);
        this.l.setGravity(17);
        addView(this.l, new FrameLayout.LayoutParams(-1, dimension));
        if (m()) {
            h(this.l);
        } else {
            j(this.l);
        }
        post(new a());
    }

    private void j(LinearLayout linearLayout) {
        Drawable drawable;
        LayoutInflater layoutInflater = (LayoutInflater) this.g.getSystemService("layout_inflater");
        float dimension = this.h.getDimension(R$dimen.bottom_navigation_height);
        float dimension2 = this.h.getDimension(R$dimen.bottom_navigation_small_inactive_min_width);
        float dimension3 = this.h.getDimension(R$dimen.bottom_navigation_small_inactive_max_width);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        if (width != 0 && this.i.size() != 0) {
            float size = (float) (width / this.i.size());
            if (size >= dimension2) {
                dimension2 = size > dimension3 ? dimension3 : size;
            }
            int dimension4 = (int) this.h.getDimension(R$dimen.bottom_navigation_small_margin_top_active);
            float dimension5 = this.h.getDimension(R$dimen.bottom_navigation_small_selected_width_difference);
            this.O = (((float) this.i.size()) * dimension5) + dimension2;
            float f2 = dimension2 - dimension5;
            this.P = f2;
            int i2 = 0;
            while (i2 < this.i.size()) {
                a aVar = this.i.get(i2);
                View inflate = layoutInflater.inflate(R$layout.bottom_navigation_small_item, this, false);
                ImageView imageView = (ImageView) inflate.findViewById(R$id.bottom_navigation_small_item_icon);
                TextView textView = (TextView) inflate.findViewById(R$id.bottom_navigation_small_item_title);
                TextView textView2 = (TextView) inflate.findViewById(R$id.bottom_navigation_notification);
                imageView.setImageDrawable(aVar.b(this.g));
                if (this.R != h.ALWAYS_HIDE) {
                    textView.setText(aVar.c(this.g));
                }
                float f3 = this.K;
                if (f3 != Utils.FLOAT_EPSILON) {
                    textView.setTextSize(0, f3);
                }
                Typeface typeface = this.A;
                if (typeface != null) {
                    textView.setTypeface(typeface);
                }
                if (i2 == this.u) {
                    if (this.p) {
                        inflate.setSelected(true);
                    }
                    imageView.setSelected(true);
                    if (this.R != h.ALWAYS_HIDE && (inflate.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dimension4, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                        marginLayoutParams2.setMargins(this.W, this.b0, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                        inflate.requestLayout();
                    }
                } else {
                    imageView.setSelected(false);
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                    marginLayoutParams3.setMargins(this.a0, this.c0, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                }
                if (!this.o) {
                    int i3 = this.C;
                    if (i3 != 0) {
                        setBackgroundResource(i3);
                    } else {
                        setBackgroundColor(this.B);
                    }
                } else if (i2 == this.u) {
                    setBackgroundColor(aVar.a(this.g));
                    this.v = aVar.a(this.g);
                }
                if (this.s[i2].booleanValue()) {
                    if (this.Q) {
                        drawable = b.a(this.i.get(i2).b(this.g), this.u == i2 ? this.D : this.E, this.Q);
                    } else {
                        drawable = this.i.get(i2).b(this.g);
                    }
                    imageView.setImageDrawable(drawable);
                    textView.setTextColor(this.u == i2 ? this.D : this.E);
                    textView.setAlpha(this.u == i2 ? 1.0f : Utils.FLOAT_EPSILON);
                    inflate.setOnClickListener(new c(i2));
                    inflate.setSoundEffectsEnabled(this.z);
                    inflate.setEnabled(true);
                } else {
                    imageView.setImageDrawable(this.Q ? b.a(this.i.get(i2).b(this.g), this.G, this.Q) : this.i.get(i2).b(this.g));
                    textView.setTextColor(this.G);
                    textView.setAlpha(Utils.FLOAT_EPSILON);
                    inflate.setClickable(true);
                    inflate.setEnabled(false);
                }
                int i4 = i2 == this.u ? (int) this.O : (int) f2;
                if (this.R == h.ALWAYS_HIDE) {
                    i4 = (int) (((double) f2) * 1.16d);
                }
                linearLayout.addView(inflate, new FrameLayout.LayoutParams(i4, (int) dimension));
                this.j.add(inflate);
                i2++;
            }
            q(true, -1);
        }
    }

    private void l(Context context, AttributeSet attributeSet) {
        this.g = context;
        this.h = context.getResources();
        this.F = androidx.core.content.a.d(context, R$color.colorBottomNavigationAccent);
        this.H = androidx.core.content.a.d(context, R$color.colorBottomNavigationInactive);
        this.G = androidx.core.content.a.d(context, R$color.colorBottomNavigationDisable);
        this.I = androidx.core.content.a.d(context, R$color.colorBottomNavigationActiveColored);
        this.J = androidx.core.content.a.d(context, R$color.colorBottomNavigationInactiveColored);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AHBottomNavigationBehavior_Params, 0, 0);
            try {
                this.p = obtainStyledAttributes.getBoolean(R$styleable.AHBottomNavigationBehavior_Params_selectedBackgroundVisible, false);
                this.q = obtainStyledAttributes.getBoolean(R$styleable.AHBottomNavigationBehavior_Params_translucentNavigationEnabled, false);
                this.F = obtainStyledAttributes.getColor(R$styleable.AHBottomNavigationBehavior_Params_accentColor, androidx.core.content.a.d(context, R$color.colorBottomNavigationAccent));
                this.H = obtainStyledAttributes.getColor(R$styleable.AHBottomNavigationBehavior_Params_inactiveColor, androidx.core.content.a.d(context, R$color.colorBottomNavigationInactive));
                this.G = obtainStyledAttributes.getColor(R$styleable.AHBottomNavigationBehavior_Params_disableColor, androidx.core.content.a.d(context, R$color.colorBottomNavigationDisable));
                this.I = obtainStyledAttributes.getColor(R$styleable.AHBottomNavigationBehavior_Params_coloredActive, androidx.core.content.a.d(context, R$color.colorBottomNavigationActiveColored));
                this.J = obtainStyledAttributes.getColor(R$styleable.AHBottomNavigationBehavior_Params_coloredInactive, androidx.core.content.a.d(context, R$color.colorBottomNavigationInactiveColored));
                this.o = obtainStyledAttributes.getBoolean(R$styleable.AHBottomNavigationBehavior_Params_colored, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.S = androidx.core.content.a.d(context, 17170443);
        this.M = (int) this.h.getDimension(R$dimen.bottom_navigation_height);
        this.D = this.F;
        this.E = this.H;
        this.W = (int) this.h.getDimension(R$dimen.bottom_navigation_notification_margin_left_active);
        this.a0 = (int) this.h.getDimension(R$dimen.bottom_navigation_notification_margin_left);
        this.b0 = (int) this.h.getDimension(R$dimen.bottom_navigation_notification_margin_top_active);
        this.c0 = (int) this.h.getDimension(R$dimen.bottom_navigation_notification_margin_top);
        this.d0 = 150;
        o4.p0(this, this.h.getDimension(R$dimen.bottom_navigation_elevation));
        setLayoutParams(new ViewGroup.LayoutParams(-1, this.M));
    }

    private boolean m() {
        h hVar = this.R;
        return (hVar == h.ALWAYS_HIDE || hVar == h.SHOW_WHEN_ACTIVE_FORCE || (this.i.size() != 3 && this.R != h.ALWAYS_SHOW)) ? false : true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(int r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            int r2 = r0.u
            r3 = 1
            if (r2 != r1) goto L_0x0013
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$g r2 = r0.e
            if (r2 == 0) goto L_0x0012
            if (r21 == 0) goto L_0x0012
            r2.a(r1, r3)
        L_0x0012:
            return
        L_0x0013:
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$g r2 = r0.e
            r4 = 0
            if (r2 == 0) goto L_0x0021
            if (r21 == 0) goto L_0x0021
            boolean r2 = r2.a(r1, r4)
            if (r2 != 0) goto L_0x0021
            return
        L_0x0021:
            android.content.res.Resources r2 = r0.h
            int r5 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_margin_top_active
            float r2 = r2.getDimension(r5)
            int r2 = (int) r2
            android.content.res.Resources r5 = r0.h
            int r6 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_margin_top_inactive
            float r5 = r5.getDimension(r6)
            int r5 = (int) r5
            android.content.res.Resources r6 = r0.h
            int r7 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_text_size_active
            float r6 = r6.getDimension(r7)
            android.content.res.Resources r7 = r0.h
            int r8 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_text_size_inactive
            float r7 = r7.getDimension(r8)
            float r8 = r0.K
            r9 = 0
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 == 0) goto L_0x0053
            float r10 = r0.L
            int r11 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0053
            r6 = r8
            r7 = r10
            goto L_0x0072
        L_0x0053:
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$h r8 = r0.R
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$h r10 = com.aurelhubert.ahbottomnavigation.AHBottomNavigation.h.ALWAYS_SHOW
            if (r8 != r10) goto L_0x0072
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r8 = r0.i
            int r8 = r8.size()
            r10 = 3
            if (r8 <= r10) goto L_0x0072
            android.content.res.Resources r6 = r0.h
            int r7 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_text_size_forced_active
            float r6 = r6.getDimension(r7)
            android.content.res.Resources r7 = r0.h
            int r8 = com.aurelhubert.ahbottomnavigation.R$dimen.bottom_navigation_text_size_forced_inactive
            float r7 = r7.getDimension(r8)
        L_0x0072:
            r8 = 0
        L_0x0073:
            java.util.ArrayList<android.view.View> r10 = r0.j
            int r10 = r10.size()
            if (r8 >= r10) goto L_0x01d7
            java.util.ArrayList<android.view.View> r10 = r0.j
            java.lang.Object r10 = r10.get(r8)
            android.view.View r10 = (android.view.View) r10
            boolean r11 = r0.p
            if (r11 == 0) goto L_0x008f
            if (r8 != r1) goto L_0x008b
            r11 = 1
            goto L_0x008c
        L_0x008b:
            r11 = 0
        L_0x008c:
            r10.setSelected(r11)
        L_0x008f:
            if (r8 != r1) goto L_0x017b
            int r11 = com.aurelhubert.ahbottomnavigation.R$id.bottom_navigation_item_title
            android.view.View r11 = r10.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            int r12 = com.aurelhubert.ahbottomnavigation.R$id.bottom_navigation_item_icon
            android.view.View r12 = r10.findViewById(r12)
            r15 = r12
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            int r12 = com.aurelhubert.ahbottomnavigation.R$id.bottom_navigation_notification
            android.view.View r12 = r10.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r15.setSelected(r3)
            com.aurelhubert.ahbottomnavigation.b.g(r15, r5, r2)
            int r13 = r0.a0
            int r14 = r0.W
            com.aurelhubert.ahbottomnavigation.b.d(r12, r13, r14)
            int r12 = r0.E
            int r13 = r0.D
            com.aurelhubert.ahbottomnavigation.b.e(r11, r12, r13)
            com.aurelhubert.ahbottomnavigation.b.f(r11, r7, r6)
            boolean r11 = r0.Q
            if (r11 == 0) goto L_0x00e4
            android.content.Context r13 = r0.g
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r11 = r0.i
            java.lang.Object r11 = r11.get(r1)
            com.aurelhubert.ahbottomnavigation.a r11 = (com.aurelhubert.ahbottomnavigation.a) r11
            android.content.Context r12 = r0.g
            android.graphics.drawable.Drawable r14 = r11.b(r12)
            int r11 = r0.E
            int r12 = r0.D
            boolean r3 = r0.Q
            r16 = r11
            r17 = r12
            r18 = r3
            com.aurelhubert.ahbottomnavigation.b.c(r13, r14, r15, r16, r17, r18)
        L_0x00e4:
            int r3 = android.os.Build.VERSION.SDK_INT
            r11 = 21
            if (r3 < r11) goto L_0x0150
            boolean r3 = r0.o
            if (r3 == 0) goto L_0x0150
            int r3 = r19.getWidth()
            int r11 = r19.getHeight()
            int r3 = java.lang.Math.max(r3, r11)
            float r11 = r10.getX()
            int r11 = (int) r11
            int r12 = r10.getWidth()
            int r12 = r12 / 2
            int r11 = r11 + r12
            int r10 = r10.getHeight()
            int r10 = r10 / 2
            android.animation.Animator r12 = r0.n
            if (r12 == 0) goto L_0x0131
            boolean r12 = r12.isRunning()
            if (r12 == 0) goto L_0x0131
            android.animation.Animator r12 = r0.n
            r12.cancel()
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r12 = r0.i
            java.lang.Object r12 = r12.get(r1)
            com.aurelhubert.ahbottomnavigation.a r12 = (com.aurelhubert.ahbottomnavigation.a) r12
            android.content.Context r13 = r0.g
            int r12 = r12.a(r13)
            r0.setBackgroundColor(r12)
            android.view.View r12 = r0.m
            r12.setBackgroundColor(r4)
        L_0x0131:
            android.view.View r12 = r0.m
            float r3 = (float) r3
            android.animation.Animator r3 = android.view.ViewAnimationUtils.createCircularReveal(r12, r11, r10, r9, r3)
            r0.n = r3
            r10 = 5
            r3.setStartDelay(r10)
            android.animation.Animator r3 = r0.n
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$d r10 = new com.aurelhubert.ahbottomnavigation.AHBottomNavigation$d
            r10.<init>(r1)
            r3.addListener(r10)
            android.animation.Animator r3 = r0.n
            r3.start()
            goto L_0x01d2
        L_0x0150:
            boolean r3 = r0.o
            if (r3 == 0) goto L_0x0168
            int r3 = r0.v
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r10 = r0.i
            java.lang.Object r10 = r10.get(r1)
            com.aurelhubert.ahbottomnavigation.a r10 = (com.aurelhubert.ahbottomnavigation.a) r10
            android.content.Context r11 = r0.g
            int r10 = r10.a(r11)
            com.aurelhubert.ahbottomnavigation.b.h(r0, r3, r10)
            goto L_0x01d2
        L_0x0168:
            int r3 = r0.C
            if (r3 == 0) goto L_0x0170
            r0.setBackgroundResource(r3)
            goto L_0x0175
        L_0x0170:
            int r3 = r0.B
            r0.setBackgroundColor(r3)
        L_0x0175:
            android.view.View r3 = r0.m
            r3.setBackgroundColor(r4)
            goto L_0x01d2
        L_0x017b:
            int r3 = r0.u
            if (r8 != r3) goto L_0x01d2
            int r3 = com.aurelhubert.ahbottomnavigation.R$id.bottom_navigation_item_title
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r11 = com.aurelhubert.ahbottomnavigation.R$id.bottom_navigation_item_icon
            android.view.View r11 = r10.findViewById(r11)
            r14 = r11
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            int r11 = com.aurelhubert.ahbottomnavigation.R$id.bottom_navigation_notification
            android.view.View r10 = r10.findViewById(r11)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r14.setSelected(r4)
            com.aurelhubert.ahbottomnavigation.b.g(r14, r2, r5)
            int r11 = r0.W
            int r12 = r0.a0
            com.aurelhubert.ahbottomnavigation.b.d(r10, r11, r12)
            int r10 = r0.D
            int r11 = r0.E
            com.aurelhubert.ahbottomnavigation.b.e(r3, r10, r11)
            com.aurelhubert.ahbottomnavigation.b.f(r3, r6, r7)
            boolean r3 = r0.Q
            if (r3 == 0) goto L_0x01d2
            android.content.Context r12 = r0.g
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r3 = r0.i
            int r10 = r0.u
            java.lang.Object r3 = r3.get(r10)
            com.aurelhubert.ahbottomnavigation.a r3 = (com.aurelhubert.ahbottomnavigation.a) r3
            android.content.Context r10 = r0.g
            android.graphics.drawable.Drawable r13 = r3.b(r10)
            int r15 = r0.D
            int r3 = r0.E
            boolean r10 = r0.Q
            r16 = r3
            r17 = r10
            com.aurelhubert.ahbottomnavigation.b.c(r12, r13, r14, r15, r16, r17)
        L_0x01d2:
            int r8 = r8 + 1
            r3 = 1
            goto L_0x0073
        L_0x01d7:
            r0.u = r1
            if (r1 <= 0) goto L_0x01f6
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r2 = r0.i
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x01f6
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.a> r1 = r0.i
            int r2 = r0.u
            java.lang.Object r1 = r1.get(r2)
            com.aurelhubert.ahbottomnavigation.a r1 = (com.aurelhubert.ahbottomnavigation.a) r1
            android.content.Context r2 = r0.g
            int r1 = r1.a(r2)
            r0.v = r1
            goto L_0x020d
        L_0x01f6:
            int r1 = r0.u
            r2 = -1
            if (r1 != r2) goto L_0x020d
            int r1 = r0.C
            if (r1 == 0) goto L_0x0203
            r0.setBackgroundResource(r1)
            goto L_0x0208
        L_0x0203:
            int r1 = r0.B
            r0.setBackgroundColor(r1)
        L_0x0208:
            android.view.View r1 = r0.m
            r1.setBackgroundColor(r4)
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aurelhubert.ahbottomnavigation.AHBottomNavigation.p(int, boolean):void");
    }

    private void q(boolean z2, int i2) {
        TimeInterpolator timeInterpolator;
        ViewPropertyAnimator viewPropertyAnimator;
        Drawable a2;
        int i3 = 0;
        while (i3 < this.j.size() && i3 < this.r.size()) {
            if (i2 == -1 || i2 == i3) {
                s9 s9Var = this.r.get(i3);
                int b2 = t9.b(s9Var, this.S);
                int a3 = t9.a(s9Var, this.T);
                TextView textView = (TextView) this.j.get(i3).findViewById(R$id.bottom_navigation_notification);
                boolean z3 = !textView.getText().toString().equals(String.valueOf(s9Var.f()));
                if (z2) {
                    textView.setTextColor(b2);
                    Typeface typeface = this.V;
                    if (typeface != null) {
                        textView.setTypeface(typeface);
                    } else {
                        textView.setTypeface((Typeface) null, 1);
                    }
                    Drawable drawable = this.U;
                    if (drawable != null) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            a2 = drawable.getConstantState().newDrawable();
                        }
                        textView.setBackgroundDrawable(drawable);
                    } else if (a3 != 0) {
                        Drawable f2 = androidx.core.content.a.f(this.g, R$drawable.notification_background);
                        if (Build.VERSION.SDK_INT >= 16) {
                            a2 = b.a(f2, a3, this.Q);
                        } else {
                            drawable = b.a(f2, a3, this.Q);
                            textView.setBackgroundDrawable(drawable);
                        }
                    }
                    textView.setBackground(a2);
                }
                if (s9Var.h() && textView.getText().length() > 0) {
                    textView.setText("");
                    if (z3) {
                        viewPropertyAnimator = textView.animate().scaleX(Utils.FLOAT_EPSILON).scaleY(Utils.FLOAT_EPSILON).alpha(Utils.FLOAT_EPSILON);
                        timeInterpolator = new AccelerateInterpolator();
                    }
                } else if (!s9Var.h()) {
                    textView.setText(String.valueOf(s9Var.f()));
                    if (z3) {
                        textView.setScaleX(Utils.FLOAT_EPSILON);
                        textView.setScaleY(Utils.FLOAT_EPSILON);
                        viewPropertyAnimator = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                        timeInterpolator = new OvershootInterpolator();
                    }
                }
                viewPropertyAnimator.setInterpolator(timeInterpolator).setDuration(this.d0).start();
            }
            i3++;
        }
    }

    /* access modifiers changed from: private */
    public void r(int i2, boolean z2) {
        int i3 = i2;
        if (this.u == i3) {
            g gVar = this.e;
            if (gVar != null && z2) {
                gVar.a(i3, true);
                return;
            }
            return;
        }
        g gVar2 = this.e;
        if (gVar2 == null || !z2 || gVar2.a(i3, false)) {
            int dimension = (int) this.h.getDimension(R$dimen.bottom_navigation_small_margin_top_active);
            int dimension2 = (int) this.h.getDimension(R$dimen.bottom_navigation_small_margin_top);
            int i4 = 0;
            while (i4 < this.j.size()) {
                View view = this.j.get(i4);
                if (this.p) {
                    view.setSelected(i4 == i3);
                }
                if (i4 == i3) {
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(R$id.bottom_navigation_small_container);
                    TextView textView = (TextView) view.findViewById(R$id.bottom_navigation_small_item_title);
                    ImageView imageView = (ImageView) view.findViewById(R$id.bottom_navigation_small_item_icon);
                    TextView textView2 = (TextView) view.findViewById(R$id.bottom_navigation_notification);
                    imageView.setSelected(true);
                    if (this.R != h.ALWAYS_HIDE) {
                        b.g(imageView, dimension2, dimension);
                        b.d(textView2, this.a0, this.W);
                        b.g(textView2, this.c0, this.b0);
                        b.e(textView, this.E, this.D);
                        b.i(frameLayout, this.P, this.O);
                    }
                    b.b(textView, Utils.FLOAT_EPSILON, 1.0f);
                    if (this.Q) {
                        b.c(this.g, this.i.get(i3).b(this.g), imageView, this.E, this.D, this.Q);
                    }
                    if (Build.VERSION.SDK_INT >= 21 && this.o) {
                        int max = Math.max(getWidth(), getHeight());
                        int x2 = ((int) this.j.get(i3).getX()) + (this.j.get(i3).getWidth() / 2);
                        int height = this.j.get(i3).getHeight() / 2;
                        Animator animator = this.n;
                        if (animator != null && animator.isRunning()) {
                            this.n.cancel();
                            setBackgroundColor(this.i.get(i3).a(this.g));
                            this.m.setBackgroundColor(0);
                        }
                        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.m, x2, height, Utils.FLOAT_EPSILON, (float) max);
                        this.n = createCircularReveal;
                        createCircularReveal.setStartDelay(5);
                        this.n.addListener(new e(i3));
                        this.n.start();
                    } else if (this.o) {
                        b.h(this, this.v, this.i.get(i3).a(this.g));
                    } else {
                        int i5 = this.C;
                        if (i5 != 0) {
                            setBackgroundResource(i5);
                        } else {
                            setBackgroundColor(this.B);
                        }
                        this.m.setBackgroundColor(0);
                    }
                } else if (i4 == this.u) {
                    View findViewById = view.findViewById(R$id.bottom_navigation_small_container);
                    TextView textView3 = (TextView) view.findViewById(R$id.bottom_navigation_small_item_title);
                    ImageView imageView2 = (ImageView) view.findViewById(R$id.bottom_navigation_small_item_icon);
                    TextView textView4 = (TextView) view.findViewById(R$id.bottom_navigation_notification);
                    imageView2.setSelected(false);
                    if (this.R != h.ALWAYS_HIDE) {
                        b.g(imageView2, dimension, dimension2);
                        b.d(textView4, this.W, this.a0);
                        b.g(textView4, this.b0, this.c0);
                        b.e(textView3, this.D, this.E);
                        b.i(findViewById, this.O, this.P);
                    }
                    b.b(textView3, 1.0f, Utils.FLOAT_EPSILON);
                    if (this.Q) {
                        b.c(this.g, this.i.get(this.u).b(this.g), imageView2, this.D, this.E, this.Q);
                    }
                }
                i4++;
            }
            this.u = i3;
            if (i3 > 0 && i3 < this.i.size()) {
                this.v = this.i.get(this.u).a(this.g);
            } else if (this.u == -1) {
                int i6 = this.C;
                if (i6 != 0) {
                    setBackgroundResource(i6);
                } else {
                    setBackgroundColor(this.B);
                }
                this.m.setBackgroundColor(0);
            }
        }
    }

    public void f(List<a> list) {
        if (list.size() <= 5) {
            int size = this.i.size() + list.size();
        }
        this.i.addAll(list);
        i();
    }

    public int getAccentColor() {
        return this.D;
    }

    public int getCurrentItem() {
        return this.u;
    }

    public int getDefaultBackgroundColor() {
        return this.B;
    }

    public int getInactiveColor() {
        return this.E;
    }

    public int getItemsCount() {
        return this.i.size();
    }

    public h getTitleState() {
        return this.R;
    }

    @SuppressLint({"NewApi"})
    @TargetApi(21)
    public boolean k() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        int i3 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        return i3 > displayMetrics2.widthPixels || i2 > displayMetrics2.heightPixels;
    }

    public void n(int i2, boolean z2) {
        if (i2 >= this.i.size()) {
            "The position is out of bounds of the items (" + this.i.size() + " elements)";
            return;
        }
        h hVar = this.R;
        if (hVar == h.ALWAYS_HIDE || hVar == h.SHOW_WHEN_ACTIVE_FORCE || !(this.i.size() == 3 || this.R == h.ALWAYS_SHOW)) {
            r(i2, z2);
        } else {
            p(i2, z2);
        }
    }

    public void o(String str, int i2) {
        if (i2 < 0 || i2 > this.i.size() - 1) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, "The position (%d) is out of bounds of the items (%d elements)", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.i.size())}));
        }
        this.r.set(i2, s9.i(str));
        q(false, i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!this.t) {
            setBehaviorTranslationEnabled(this.w);
            this.t = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.u = bundle.getInt("current_item");
            this.r = bundle.getParcelableArrayList("notifications");
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putInt("current_item", this.u);
        bundle.putParcelableArrayList("notifications", new ArrayList(this.r));
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        i();
    }

    public void setAccentColor(int i2) {
        this.F = i2;
        this.D = i2;
        i();
    }

    public void setBehaviorTranslationEnabled(boolean z2) {
        this.w = z2;
        if (getParent() instanceof CoordinatorLayout) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.k;
            if (aHBottomNavigationBehavior == null) {
                this.k = new AHBottomNavigationBehavior<>(z2, this.N);
            } else {
                aHBottomNavigationBehavior.S(z2, this.N);
            }
            f fVar = this.f;
            if (fVar != null) {
                this.k.T(fVar);
            }
            ((CoordinatorLayout.e) layoutParams).o(this.k);
            if (this.x) {
                this.x = false;
                this.k.R(this, this.M, this.y);
            }
        }
    }

    public void setColored(boolean z2) {
        this.o = z2;
        this.D = z2 ? this.I : this.F;
        this.E = z2 ? this.J : this.H;
        i();
    }

    public void setCurrentItem(int i2) {
        n(i2, true);
    }

    public void setDefaultBackgroundColor(int i2) {
        this.B = i2;
        i();
    }

    public void setDefaultBackgroundResource(int i2) {
        this.C = i2;
        i();
    }

    public void setForceTint(boolean z2) {
        this.Q = z2;
        i();
    }

    public void setInactiveColor(int i2) {
        this.H = i2;
        this.E = i2;
        i();
    }

    public void setItemDisableColor(int i2) {
        this.G = i2;
    }

    public void setNotificationAnimationDuration(long j2) {
        this.d0 = j2;
        q(true, -1);
    }

    public void setNotificationBackground(Drawable drawable) {
        this.U = drawable;
        q(true, -1);
    }

    public void setNotificationBackgroundColor(int i2) {
        this.T = i2;
        q(true, -1);
    }

    public void setNotificationBackgroundColorResource(int i2) {
        this.T = androidx.core.content.a.d(this.g, i2);
        q(true, -1);
    }

    public void setNotificationTextColor(int i2) {
        this.S = i2;
        q(true, -1);
    }

    public void setNotificationTextColorResource(int i2) {
        this.S = androidx.core.content.a.d(this.g, i2);
        q(true, -1);
    }

    public void setNotificationTypeface(Typeface typeface) {
        this.V = typeface;
        q(true, -1);
    }

    public void setOnNavigationPositionListener(f fVar) {
        this.f = fVar;
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.k;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.T(fVar);
        }
    }

    public void setOnTabSelectedListener(g gVar) {
        this.e = gVar;
    }

    public void setSelectedBackgroundVisible(boolean z2) {
        this.p = z2;
        i();
    }

    public void setSoundEffectsEnabled(boolean z2) {
        super.setSoundEffectsEnabled(z2);
        this.z = z2;
    }

    public void setTitleState(h hVar) {
        this.R = hVar;
        i();
    }

    public void setTitleTypeface(Typeface typeface) {
        this.A = typeface;
        i();
    }

    public void setTranslucentNavigationEnabled(boolean z2) {
        this.q = z2;
    }

    public void setUseElevation(boolean z2) {
        o4.p0(this, z2 ? this.h.getDimension(R$dimen.bottom_navigation_elevation) : Utils.FLOAT_EPSILON);
        setClipToPadding(false);
    }
}
