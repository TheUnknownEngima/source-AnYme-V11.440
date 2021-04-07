package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class PagerTabStrip extends PagerTitleStrip {
    private final Paint A = new Paint();
    private final Rect B = new Rect();
    private int C = 255;
    private boolean D = false;
    private boolean E = false;
    private int F;
    private boolean G;
    private float H;
    private float I;
    private int J;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.e;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.e;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = this.r;
        this.u = i;
        this.A.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.v = (int) ((3.0f * f) + 0.5f);
        this.w = (int) ((6.0f * f) + 0.5f);
        this.x = (int) (64.0f * f);
        this.z = (int) ((16.0f * f) + 0.5f);
        this.F = (int) ((1.0f * f) + 0.5f);
        this.y = (int) ((f * 32.0f) + 0.5f);
        this.J = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f.setFocusable(true);
        this.f.setOnClickListener(new a());
        this.h.setFocusable(true);
        this.h.setOnClickListener(new b());
        if (getBackground() == null) {
            this.D = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void d(int i, float f, boolean z2) {
        Rect rect = this.B;
        int height = getHeight();
        int left = this.g.getLeft() - this.z;
        int right = this.g.getRight() + this.z;
        int i2 = height - this.v;
        rect.set(left, i2, right, height);
        super.d(i, f, z2);
        this.C = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.g.getLeft() - this.z, i2, this.g.getRight() + this.z, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.D;
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.y);
    }

    public int getTabIndicatorColor() {
        return this.u;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.g.getLeft() - this.z;
        int right = this.g.getRight() + this.z;
        this.A.setColor((this.C << 24) | (this.u & 16777215));
        float f = (float) height;
        canvas.drawRect((float) left, (float) (height - this.v), (float) right, f, this.A);
        if (this.D) {
            this.A.setColor(-16777216 | (this.u & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.F), (float) (getWidth() - getPaddingRight()), f, this.A);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewPager viewPager;
        int currentItem;
        int action = motionEvent.getAction();
        if (action != 0 && this.G) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (action == 0) {
            this.H = x2;
            this.I = y2;
            this.G = false;
        } else if (action == 1) {
            if (x2 < ((float) (this.g.getLeft() - this.z))) {
                viewPager = this.e;
                currentItem = viewPager.getCurrentItem() - 1;
            } else if (x2 > ((float) (this.g.getRight() + this.z))) {
                viewPager = this.e;
                currentItem = viewPager.getCurrentItem() + 1;
            }
            viewPager.setCurrentItem(currentItem);
        } else if (action == 2 && (Math.abs(x2 - this.H) > ((float) this.J) || Math.abs(y2 - this.I) > ((float) this.J))) {
            this.G = true;
        }
        return true;
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (!this.E) {
            this.D = (i & -16777216) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.E) {
            this.D = drawable == null;
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (!this.E) {
            this.D = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z2) {
        this.D = z2;
        this.E = true;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.w;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.u = i;
        this.A.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(androidx.core.content.a.d(getContext(), i));
    }

    public void setTextSpacing(int i) {
        int i2 = this.x;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }
}
