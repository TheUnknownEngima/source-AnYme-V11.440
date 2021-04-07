package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;

public class z extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    Runnable e;
    private c f;
    LinearLayoutCompat g;
    private Spinner h;
    private boolean i;
    int j;
    int k;
    private int l;
    private int m;

    class a implements Runnable {
        final /* synthetic */ View e;

        a(View view) {
            this.e = view;
        }

        public void run() {
            z.this.smoothScrollTo(this.e.getLeft() - ((z.this.getWidth() - this.e.getWidth()) / 2), 0);
            z.this.e = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        public int getCount() {
            return z.this.g.getChildCount();
        }

        public Object getItem(int i) {
            return ((d) z.this.g.getChildAt(i)).b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return z.this.c((ActionBar.b) getItem(i), true);
            }
            ((d) view).a((ActionBar.b) getItem(i));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = z.this.g.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = z.this.g.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {
        private final int[] e;
        private ActionBar.b f;
        private TextView g;
        private ImageView h;
        private View i;

        public d(Context context, ActionBar.b bVar, boolean z) {
            super(context, (AttributeSet) null, R$attr.actionBarTabStyle);
            int[] iArr = {16842964};
            this.e = iArr;
            this.f = bVar;
            g0 u = g0.u(context, (AttributeSet) null, iArr, R$attr.actionBarTabStyle, 0);
            if (u.r(0)) {
                setBackgroundDrawable(u.g(0));
            }
            u.v();
            if (z) {
                setGravity(8388627);
            }
            c();
        }

        public void a(ActionBar.b bVar) {
            this.f = bVar;
            c();
        }

        public ActionBar.b b() {
            return this.f;
        }

        public void c() {
            ActionBar.b bVar = this.f;
            View b = bVar.b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.i = b;
                TextView textView = this.g;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.h;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.h.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.i;
            if (view != null) {
                removeView(view);
                this.i = null;
            }
            Drawable c = bVar.c();
            CharSequence d = bVar.d();
            if (c != null) {
                if (this.h == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.h = appCompatImageView;
                }
                this.h.setImageDrawable(c);
                this.h.setVisibility(0);
            } else {
                ImageView imageView2 = this.h;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.h.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.g == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, R$attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.g = appCompatTextView;
                }
                this.g.setText(d);
                this.g.setVisibility(0);
            } else {
                TextView textView2 = this.g;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.g.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.h;
            if (imageView3 != null) {
                imageView3.setContentDescription(bVar.a());
            }
            if (!z) {
                charSequence = bVar.a();
            }
            i0.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i2, int i3) {
            int i4;
            super.onMeasure(i2, i3);
            if (z.this.j > 0 && getMeasuredWidth() > (i4 = z.this.j)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    private Spinner b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, R$attr.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private boolean d() {
        Spinner spinner = this.h;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (!d()) {
            if (this.h == null) {
                this.h = b();
            }
            removeView(this.g);
            addView(this.h, new ViewGroup.LayoutParams(-2, -1));
            if (this.h.getAdapter() == null) {
                this.h.setAdapter(new b());
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.e = null;
            }
            this.h.setSelection(this.m);
        }
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.h);
        addView(this.g, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.h.getSelectedItemPosition());
        return false;
    }

    public void a(int i2) {
        View childAt = this.g.getChildAt(i2);
        Runnable runnable = this.e;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.e = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    public d c(ActionBar.b bVar, boolean z) {
        d dVar = new d(getContext(), bVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.l));
        } else {
            dVar.setFocusable(true);
            if (this.f == null) {
                this.f = new c();
            }
            dVar.setOnClickListener(this.f);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.e;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m b2 = m.b(getContext());
        setContentHeight(b2.f());
        this.k = b2.e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.e;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((d) view).b().e();
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.g.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i4 = -1;
        } else {
            if (childCount > 2) {
                this.j = (int) (((float) View.MeasureSpec.getSize(i2)) * 0.4f);
            } else {
                this.j = View.MeasureSpec.getSize(i2) / 2;
            }
            i4 = Math.min(this.j, this.k);
        }
        this.j = i4;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.l, 1073741824);
        if (z2 || !this.i) {
            z = false;
        }
        if (z) {
            this.g.measure(0, makeMeasureSpec);
            if (this.g.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i2, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.m);
                    return;
                }
            }
        }
        f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.i = z;
    }

    public void setContentHeight(int i2) {
        this.l = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.m = i2;
        int childCount = this.g.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.g.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.h;
        if (spinner != null && i2 >= 0) {
            spinner.setSelection(i2);
        }
    }
}
