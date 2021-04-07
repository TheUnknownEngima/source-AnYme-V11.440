package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import com.github.mikephil.charting.utils.Utils;

abstract class a extends ViewGroup {
    protected final C0009a e;
    protected final Context f;
    protected ActionMenuView g;
    protected c h;
    protected int i;
    protected t4 j;
    private boolean k;
    private boolean l;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    protected class C0009a implements u4 {
        private boolean a = false;
        int b;

        protected C0009a() {
        }

        public void a(View view) {
            this.a = true;
        }

        public void b(View view) {
            if (!this.a) {
                a aVar = a.this;
                aVar.j = null;
                a.super.setVisibility(this.b);
            }
        }

        public void c(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }

        public C0009a d(t4 t4Var, int i) {
            a.this.j = t4Var;
            this.b = i;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e = new C0009a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R$attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f = context;
        } else {
            this.f = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    /* access modifiers changed from: protected */
    public int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    /* access modifiers changed from: protected */
    public int e(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public t4 f(int i2, long j2) {
        t4 t4Var = this.j;
        if (t4Var != null) {
            t4Var.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(Utils.FLOAT_EPSILON);
            }
            t4 c = o4.c(this);
            c.a(1.0f);
            c.e(j2);
            C0009a aVar = this.e;
            aVar.d(c, i2);
            c.g(aVar);
            return c;
        }
        t4 c2 = o4.c(this);
        c2.a(Utils.FLOAT_EPSILON);
        c2.e(j2);
        C0009a aVar2 = this.e;
        aVar2.d(c2, i2);
        c2.g(aVar2);
        return c2;
    }

    public int getAnimatedVisibility() {
        return this.j != null ? this.e.b : getVisibility();
    }

    public int getContentHeight() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(R$styleable.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.h;
        if (cVar != null) {
            cVar.I(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.l = false;
        }
        if (!this.l) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.l = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.l = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.k = false;
        }
        if (!this.k) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.k = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.k = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            t4 t4Var = this.j;
            if (t4Var != null) {
                t4Var.b();
            }
            super.setVisibility(i2);
        }
    }
}
