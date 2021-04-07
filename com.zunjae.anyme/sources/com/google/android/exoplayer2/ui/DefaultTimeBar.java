package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.ui.g;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

public class DefaultTimeBar extends View implements g {
    private final CopyOnWriteArraySet<g.a> A;
    private final Point B;
    private final float C;
    private int D;
    private long E;
    private int F;
    private Rect G;
    private ValueAnimator H;
    private float I;
    private boolean J;
    private long K;
    private long L;
    private long M;
    private long N;
    private int O;
    private long[] P;
    private boolean[] Q;
    private final Rect e;
    private final Rect f;
    private final Rect g;
    private final Rect h;
    private final Paint i;
    private final Paint j;
    private final Paint k;
    private final Paint l;
    private final Paint m;
    private final Paint n;
    private final Drawable o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final StringBuilder x;
    private final Formatter y;
    private final Runnable z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2) {
        super(context, attributeSet, i2);
        int i3;
        int i4;
        AttributeSet attributeSet3 = attributeSet2;
        this.e = new Rect();
        this.f = new Rect();
        this.g = new Rect();
        this.h = new Rect();
        this.i = new Paint();
        this.j = new Paint();
        this.k = new Paint();
        this.l = new Paint();
        this.m = new Paint();
        Paint paint = new Paint();
        this.n = paint;
        paint.setAntiAlias(true);
        this.A = new CopyOnWriteArraySet<>();
        this.B = new Point();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.C = f2;
        this.w = c(f2, -50);
        int c = c(this.C, 4);
        int c2 = c(this.C, 26);
        int c3 = c(this.C, 4);
        int c4 = c(this.C, 12);
        int c5 = c(this.C, 0);
        int c6 = c(this.C, 16);
        if (attributeSet3 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, R$styleable.DefaultTimeBar, 0, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.DefaultTimeBar_scrubber_drawable);
                this.o = drawable;
                if (drawable != null) {
                    m(drawable);
                    c2 = Math.max(this.o.getMinimumHeight(), c2);
                }
                this.p = obtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_bar_height, c);
                this.q = obtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_touch_target_height, c2);
                this.r = obtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_ad_marker_width, c3);
                this.s = obtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_scrubber_enabled_size, c4);
                this.t = obtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_scrubber_disabled_size, c5);
                this.u = obtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_scrubber_dragged_size, c6);
                int i5 = obtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_played_color, -1);
                int i6 = obtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_scrubber_color, -1);
                int i7 = obtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_buffered_color, -855638017);
                int i8 = obtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_unplayed_color, 872415231);
                int i9 = obtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_ad_marker_color, -1291845888);
                int i10 = obtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_played_ad_marker_color, 872414976);
                this.i.setColor(i5);
                this.n.setColor(i6);
                this.j.setColor(i7);
                this.k.setColor(i8);
                this.l.setColor(i9);
                this.m.setColor(i10);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.p = c;
            this.q = c2;
            this.r = c3;
            this.s = c4;
            this.t = c5;
            this.u = c6;
            this.i.setColor(-1);
            this.n.setColor(-1);
            this.j.setColor(-855638017);
            this.k.setColor(872415231);
            this.l.setColor(-1291845888);
            this.m.setColor(872414976);
            this.o = null;
        }
        this.x = new StringBuilder();
        this.y = new Formatter(this.x, Locale.getDefault());
        this.z = new b(this);
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            i4 = drawable2.getMinimumWidth();
            i3 = 1;
        } else {
            i3 = 1;
            i4 = Math.max(this.t, Math.max(this.s, this.u));
        }
        this.v = (i4 + i3) / 2;
        this.I = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.H = valueAnimator;
        valueAnimator.addUpdateListener(new c(this));
        this.L = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.D = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static int c(float f2, int i2) {
        return (int) ((((float) i2) * f2) + 0.5f);
    }

    private void d(Canvas canvas) {
        if (this.L > 0) {
            Rect rect = this.h;
            int o2 = v50.o(rect.right, rect.left, this.f.right);
            int centerY = this.h.centerY();
            Drawable drawable = this.o;
            if (drawable == null) {
                canvas.drawCircle((float) o2, (float) centerY, (float) ((int) ((((float) ((this.J || isFocused()) ? this.u : isEnabled() ? this.s : this.t)) * this.I) / 2.0f)), this.n);
                return;
            }
            int intrinsicWidth = ((int) (((float) drawable.getIntrinsicWidth()) * this.I)) / 2;
            int intrinsicHeight = ((int) (((float) this.o.getIntrinsicHeight()) * this.I)) / 2;
            this.o.setBounds(o2 - intrinsicWidth, centerY - intrinsicHeight, o2 + intrinsicWidth, centerY + intrinsicHeight);
            this.o.draw(canvas);
        }
    }

    private void e(Canvas canvas) {
        int height = this.f.height();
        int centerY = this.f.centerY() - (height / 2);
        int i2 = height + centerY;
        if (this.L <= 0) {
            Rect rect = this.f;
            canvas.drawRect((float) rect.left, (float) centerY, (float) rect.right, (float) i2, this.k);
            return;
        }
        Rect rect2 = this.g;
        int i3 = rect2.left;
        int i4 = rect2.right;
        int max = Math.max(Math.max(this.f.left, i4), this.h.right);
        int i5 = this.f.right;
        if (max < i5) {
            canvas.drawRect((float) max, (float) centerY, (float) i5, (float) i2, this.k);
        }
        int max2 = Math.max(i3, this.h.right);
        if (i4 > max2) {
            canvas.drawRect((float) max2, (float) centerY, (float) i4, (float) i2, this.j);
        }
        if (this.h.width() > 0) {
            Rect rect3 = this.h;
            canvas.drawRect((float) rect3.left, (float) centerY, (float) rect3.right, (float) i2, this.i);
        }
        if (this.O != 0) {
            long[] jArr = this.P;
            q40.e(jArr);
            long[] jArr2 = jArr;
            boolean[] zArr = this.Q;
            q40.e(zArr);
            boolean[] zArr2 = zArr;
            int i6 = this.r / 2;
            for (int i7 = 0; i7 < this.O; i7++) {
                long p2 = v50.p(jArr2[i7], 0, this.L);
                Rect rect4 = this.f;
                int min = rect4.left + Math.min(rect4.width() - this.r, Math.max(0, ((int) ((((long) this.f.width()) * p2) / this.L)) - i6));
                canvas.drawRect((float) min, (float) centerY, (float) (min + this.r), (float) i2, zArr2[i7] ? this.m : this.l);
            }
        }
    }

    private boolean f(float f2, float f3) {
        return this.e.contains((int) f2, (int) f3);
    }

    private long getPositionIncrement() {
        long j2 = this.E;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        long j3 = this.L;
        if (j3 == -9223372036854775807L) {
            return 0;
        }
        return j3 / ((long) this.D);
    }

    private String getProgressText() {
        return v50.T(this.x, this.y, this.M);
    }

    private long getScrubberPosition() {
        if (this.f.width() <= 0 || this.L == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.h.width()) * this.L) / ((long) this.f.width());
    }

    private void i(float f2) {
        Rect rect = this.h;
        Rect rect2 = this.f;
        rect.right = v50.o((int) f2, rect2.left, rect2.right);
    }

    private static int j(float f2, int i2) {
        return (int) (((float) i2) / f2);
    }

    private Point k(MotionEvent motionEvent) {
        this.B.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.B;
    }

    private boolean l(long j2) {
        if (this.L <= 0) {
            return false;
        }
        long j3 = this.J ? this.K : this.M;
        long p2 = v50.p(j3 + j2, 0, this.L);
        if (p2 == j3) {
            return false;
        }
        if (!this.J) {
            p(p2);
        } else {
            t(p2);
        }
        r();
        return true;
    }

    private boolean m(Drawable drawable) {
        return v50.a >= 23 && n(drawable, getLayoutDirection());
    }

    private static boolean n(Drawable drawable, int i2) {
        return v50.a >= 23 && drawable.setLayoutDirection(i2);
    }

    private void o(int i2, int i3) {
        Rect rect = this.G;
        if (rect == null || rect.width() != i2 || this.G.height() != i3) {
            Rect rect2 = new Rect(0, 0, i2, i3);
            this.G = rect2;
            setSystemGestureExclusionRects(Collections.singletonList(rect2));
        }
    }

    private void p(long j2) {
        this.K = j2;
        this.J = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<g.a> it = this.A.iterator();
        while (it.hasNext()) {
            it.next().g(this, j2);
        }
    }

    private void q(boolean z2) {
        removeCallbacks(this.z);
        this.J = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<g.a> it = this.A.iterator();
        while (it.hasNext()) {
            it.next().b(this, this.K, z2);
        }
    }

    private void r() {
        this.g.set(this.f);
        this.h.set(this.f);
        long j2 = this.J ? this.K : this.M;
        if (this.L > 0) {
            int width = (int) ((((long) this.f.width()) * this.N) / this.L);
            Rect rect = this.g;
            Rect rect2 = this.f;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((((long) this.f.width()) * j2) / this.L);
            Rect rect3 = this.h;
            Rect rect4 = this.f;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.g;
            int i2 = this.f.left;
            rect5.right = i2;
            this.h.right = i2;
        }
        invalidate(this.e);
    }

    private void s() {
        Drawable drawable = this.o;
        if (drawable != null && drawable.isStateful() && this.o.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void t(long j2) {
        if (this.K != j2) {
            this.K = j2;
            Iterator<g.a> it = this.A.iterator();
            while (it.hasNext()) {
                it.next().a(this, j2);
            }
        }
    }

    public void a(long[] jArr, boolean[] zArr, int i2) {
        q40.a(i2 == 0 || !(jArr == null || zArr == null));
        this.O = i2;
        this.P = jArr;
        this.Q = zArr;
        r();
    }

    public void b(g.a aVar) {
        this.A.add(aVar);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        s();
    }

    public /* synthetic */ void g() {
        q(false);
    }

    public long getPreferredUpdateDelay() {
        int j2 = j(this.C, this.f.width());
        if (j2 != 0) {
            long j3 = this.L;
            if (!(j3 == 0 || j3 == -9223372036854775807L)) {
                return j3 / ((long) j2);
            }
        }
        return Long.MAX_VALUE;
    }

    public /* synthetic */ void h(ValueAnimator valueAnimator) {
        this.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.e);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        e(canvas);
        d(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (this.J && !z2) {
            q(false);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @TargetApi(21)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.L > 0) {
            if (v50.a >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                return;
            }
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (l(r0) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        removeCallbacks(r4.z);
        postDelayed(r4.z, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0030
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0030
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.l(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r5 = r4.z
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.z
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.J
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.q(r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int i8 = (i7 - this.q) / 2;
        int i9 = this.q;
        int i10 = ((i9 - this.p) / 2) + i8;
        this.e.set(getPaddingLeft(), i8, i6 - getPaddingRight(), i9 + i8);
        Rect rect = this.f;
        Rect rect2 = this.e;
        int i11 = rect2.left;
        int i12 = this.v;
        rect.set(i11 + i12, i10, rect2.right - i12, this.p + i10);
        if (v50.a >= 29) {
            o(i6, i7);
        }
        r();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == 0) {
            size = this.q;
        } else if (mode != 1073741824) {
            size = Math.min(this.q, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), size);
        s();
    }

    public void onRtlPropertiesChanged(int i2) {
        Drawable drawable = this.o;
        if (drawable != null && n(drawable, i2)) {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x006d
            long r2 = r7.L
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
            goto L_0x006d
        L_0x0010:
            android.graphics.Point r0 = r7.k(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x005a
            r5 = 3
            if (r3 == r4) goto L_0x004b
            r6 = 2
            if (r3 == r6) goto L_0x0028
            if (r3 == r5) goto L_0x004b
            goto L_0x006d
        L_0x0028:
            boolean r8 = r7.J
            if (r8 == 0) goto L_0x006d
            int r8 = r7.w
            if (r0 >= r8) goto L_0x0037
            int r8 = r7.F
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            goto L_0x003a
        L_0x0037:
            r7.F = r2
            float r8 = (float) r2
        L_0x003a:
            r7.i(r8)
            long r0 = r7.getScrubberPosition()
            r7.t(r0)
        L_0x0044:
            r7.r()
            r7.invalidate()
            return r4
        L_0x004b:
            boolean r0 = r7.J
            if (r0 == 0) goto L_0x006d
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x0056
            r1 = 1
        L_0x0056:
            r7.q(r1)
            return r4
        L_0x005a:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.f(r8, r0)
            if (r0 == 0) goto L_0x006d
            r7.i(r8)
            long r0 = r7.getScrubberPosition()
            r7.p(r0)
            goto L_0x0044
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (l(getPositionIncrement()) != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (l(-getPositionIncrement()) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean performAccessibilityAction(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            boolean r8 = super.performAccessibilityAction(r7, r8)
            r0 = 1
            if (r8 == 0) goto L_0x0008
            return r0
        L_0x0008:
            long r1 = r6.L
            r3 = 0
            r8 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0012
            return r8
        L_0x0012:
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r7 != r1) goto L_0x0025
            long r1 = r6.getPositionIncrement()
            long r1 = -r1
            boolean r7 = r6.l(r1)
            if (r7 == 0) goto L_0x0034
        L_0x0021:
            r6.q(r8)
            goto L_0x0034
        L_0x0025:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r7 != r1) goto L_0x0039
            long r1 = r6.getPositionIncrement()
            boolean r7 = r6.l(r1)
            if (r7 == 0) goto L_0x0034
            goto L_0x0021
        L_0x0034:
            r7 = 4
            r6.sendAccessibilityEvent(r7)
            return r0
        L_0x0039:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public void setAdMarkerColor(int i2) {
        this.l.setColor(i2);
        invalidate(this.e);
    }

    public void setBufferedColor(int i2) {
        this.j.setColor(i2);
        invalidate(this.e);
    }

    public void setBufferedPosition(long j2) {
        this.N = j2;
        r();
    }

    public void setDuration(long j2) {
        this.L = j2;
        if (this.J && j2 == -9223372036854775807L) {
            q(true);
        }
        r();
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (this.J && !z2) {
            q(true);
        }
    }

    public void setKeyCountIncrement(int i2) {
        q40.a(i2 > 0);
        this.D = i2;
        this.E = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j2) {
        q40.a(j2 > 0);
        this.D = -1;
        this.E = j2;
    }

    public void setPlayedAdMarkerColor(int i2) {
        this.m.setColor(i2);
        invalidate(this.e);
    }

    public void setPlayedColor(int i2) {
        this.i.setColor(i2);
        invalidate(this.e);
    }

    public void setPosition(long j2) {
        this.M = j2;
        setContentDescription(getProgressText());
        r();
    }

    public void setScrubberColor(int i2) {
        this.n.setColor(i2);
        invalidate(this.e);
    }

    public void setUnplayedColor(int i2) {
        this.k.setColor(i2);
        invalidate(this.e);
    }
}
