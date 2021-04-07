package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.R$attr;
import com.google.android.gms.cast.framework.R$dimen;
import com.google.android.gms.cast.framework.R$style;
import com.google.android.gms.cast.framework.R$styleable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.m;
import java.util.ArrayList;
import java.util.List;

public class CastSeekBar extends View {
    public b e;
    private boolean f;
    private Integer g;
    private List<a> h;
    public c i;
    private final float j;
    private final float k;
    private final float l;
    private final float m;
    private final float n;
    private final Paint o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private int[] t;
    private Point u;
    private Runnable v;

    public static class a {
        public int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode();
        }
    }

    public static class b {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
        }

        public final int hashCode() {
            return q.b(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f));
        }
    }

    public static abstract class c {
        public abstract void a(CastSeekBar castSeekBar, int i, boolean z);

        public abstract void b(CastSeekBar castSeekBar);

        public abstract void c(CastSeekBar castSeekBar);
    }

    class d extends View.AccessibilityDelegate {
        private d() {
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SeekBar.class.getName());
            accessibilityEvent.setItemCount(CastSeekBar.this.e.b);
            accessibilityEvent.setCurrentItemIndex(CastSeekBar.this.getProgress());
        }

        @TargetApi(16)
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(SeekBar.class.getName());
            if (m.c() && view.isEnabled()) {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.addAction(8192);
            }
        }

        @TargetApi(16)
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (!view.isEnabled()) {
                return false;
            }
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (m.c() && (i == 4096 || i == 8192)) {
                CastSeekBar.this.e();
                int i2 = CastSeekBar.this.e.b / 20;
                if (i == 8192) {
                    i2 = -i2;
                }
                CastSeekBar castSeekBar = CastSeekBar.this;
                castSeekBar.h(castSeekBar.getProgress() + i2);
                CastSeekBar.this.f();
            }
            return false;
        }
    }

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CastSeekBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = new ArrayList();
        setAccessibilityDelegate(new d());
        Paint paint = new Paint(1);
        this.o = paint;
        paint.setStyle(Paint.Style.FILL);
        this.j = context.getResources().getDimension(R$dimen.cast_seek_bar_minimum_width);
        this.k = context.getResources().getDimension(R$dimen.cast_seek_bar_minimum_height);
        this.l = context.getResources().getDimension(R$dimen.cast_seek_bar_progress_height) / 2.0f;
        this.m = context.getResources().getDimension(R$dimen.cast_seek_bar_thumb_size) / 2.0f;
        this.n = context.getResources().getDimension(R$dimen.cast_seek_bar_ad_break_radius);
        b bVar = new b();
        this.e = bVar;
        bVar.b = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, R$styleable.CastExpandedController, R$attr.castExpandedControllerStyle, R$style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.CastExpandedController_castSeekBarProgressAndThumbColor, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R$styleable.CastExpandedController_castSeekBarSecondaryProgressColor, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(R$styleable.CastExpandedController_castSeekBarUnseekableProgressColor, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(R$styleable.CastExpandedController_castAdBreakMarkerColor, 0);
        this.p = context.getResources().getColor(resourceId);
        this.q = context.getResources().getColor(resourceId2);
        this.r = context.getResources().getColor(resourceId3);
        this.s = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }

    private final void a(Canvas canvas, int i2, int i3, int i4, int i5) {
        this.o.setColor(i5);
        int i6 = this.e.b;
        float f2 = (float) i4;
        float f3 = this.l;
        Canvas canvas2 = canvas;
        canvas2.drawRect(((((float) i2) * 1.0f) / ((float) i6)) * f2, -f3, ((((float) i3) * 1.0f) / ((float) i6)) * f2, f3, this.o);
    }

    /* access modifiers changed from: private */
    public final void e() {
        this.f = true;
        c cVar = this.i;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    /* access modifiers changed from: private */
    public final void f() {
        this.f = false;
        c cVar = this.i;
        if (cVar != null) {
            cVar.b(this);
        }
    }

    /* access modifiers changed from: private */
    public final void h(int i2) {
        b bVar = this.e;
        if (bVar.f) {
            this.g = Integer.valueOf(t60.h(i2, bVar.d, bVar.e));
            c cVar = this.i;
            if (cVar != null) {
                cVar.a(this, getProgress(), true);
            }
            Runnable runnable = this.v;
            if (runnable == null) {
                this.v = new a(this);
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.v, 200);
            postInvalidate();
        }
    }

    private final int i(int i2) {
        return (int) (((((double) i2) * 1.0d) / ((double) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) * ((double) this.e.b));
    }

    public final void b(b bVar) {
        if (!this.f) {
            b bVar2 = new b();
            bVar2.a = bVar.a;
            bVar2.b = bVar.b;
            bVar2.c = bVar.c;
            bVar2.d = bVar.d;
            bVar2.e = bVar.e;
            bVar2.f = bVar.f;
            this.e = bVar2;
            this.g = null;
            c cVar = this.i;
            if (cVar != null) {
                cVar.a(this, getProgress(), false);
            }
            postInvalidate();
        }
    }

    public int getMaxProgress() {
        return this.e.b;
    }

    public int getProgress() {
        Integer num = this.g;
        return num != null ? num.intValue() : this.e.a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        Runnable runnable = this.v;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            int r0 = r12.save()
            int r1 = r11.getPaddingLeft()
            float r1 = (float) r1
            int r2 = r11.getPaddingTop()
            float r2 = (float) r2
            r12.translate(r1, r2)
            int r1 = r11.getMeasuredWidth()
            int r2 = r11.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r11.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r11.getMeasuredHeight()
            int r3 = r11.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r11.getPaddingBottom()
            int r2 = r2 - r3
            int r9 = r11.getProgress()
            int r10 = r12.save()
            int r2 = r2 / 2
            float r2 = (float) r2
            r3 = 0
            r12.translate(r3, r2)
            com.google.android.gms.cast.framework.media.widget.CastSeekBar$b r2 = r11.e
            boolean r3 = r2.f
            if (r3 == 0) goto L_0x007a
            int r6 = r2.d
            if (r6 <= 0) goto L_0x004f
            r5 = 0
            int r8 = r11.r
            r3 = r11
            r4 = r12
            r7 = r1
            r3.a(r4, r5, r6, r7, r8)
        L_0x004f:
            com.google.android.gms.cast.framework.media.widget.CastSeekBar$b r2 = r11.e
            int r5 = r2.d
            if (r9 <= r5) goto L_0x005e
            int r8 = r11.p
            r3 = r11
            r4 = r12
            r6 = r9
            r7 = r1
            r3.a(r4, r5, r6, r7, r8)
        L_0x005e:
            com.google.android.gms.cast.framework.media.widget.CastSeekBar$b r2 = r11.e
            int r6 = r2.e
            if (r6 <= r9) goto L_0x006d
            int r8 = r11.q
            r3 = r11
            r4 = r12
            r5 = r9
            r7 = r1
            r3.a(r4, r5, r6, r7, r8)
        L_0x006d:
            com.google.android.gms.cast.framework.media.widget.CastSeekBar$b r2 = r11.e
            int r6 = r2.b
            int r5 = r2.e
            if (r6 <= r5) goto L_0x00a8
            int r8 = r11.r
            r3 = r11
            r4 = r12
            goto L_0x00a4
        L_0x007a:
            int r2 = r2.c
            r3 = 0
            int r2 = java.lang.Math.max(r2, r3)
            if (r2 <= 0) goto L_0x008d
            r5 = 0
            int r8 = r11.r
            r3 = r11
            r4 = r12
            r6 = r2
            r7 = r1
            r3.a(r4, r5, r6, r7, r8)
        L_0x008d:
            if (r9 <= r2) goto L_0x0099
            int r8 = r11.p
            r3 = r11
            r4 = r12
            r5 = r2
            r6 = r9
            r7 = r1
            r3.a(r4, r5, r6, r7, r8)
        L_0x0099:
            com.google.android.gms.cast.framework.media.widget.CastSeekBar$b r2 = r11.e
            int r6 = r2.b
            if (r6 <= r9) goto L_0x00a8
            int r8 = r11.r
            r3 = r11
            r4 = r12
            r5 = r9
        L_0x00a4:
            r7 = r1
            r3.a(r4, r5, r6, r7, r8)
        L_0x00a8:
            r12.restoreToCount(r10)
            java.util.List<com.google.android.gms.cast.framework.media.widget.CastSeekBar$a> r1 = r11.h
            if (r1 == 0) goto L_0x010e
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00b6
            goto L_0x010e
        L_0x00b6:
            android.graphics.Paint r1 = r11.o
            int r2 = r11.s
            r1.setColor(r2)
            int r1 = r11.getMeasuredWidth()
            int r2 = r11.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r11.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r11.getMeasuredHeight()
            int r3 = r11.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r11.getPaddingBottom()
            int r2 = r2 - r3
            java.util.List<com.google.android.gms.cast.framework.media.widget.CastSeekBar$a> r3 = r11.h
            java.util.Iterator r3 = r3.iterator()
        L_0x00df:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x010e
            java.lang.Object r4 = r3.next()
            com.google.android.gms.cast.framework.media.widget.CastSeekBar$a r4 = (com.google.android.gms.cast.framework.media.widget.CastSeekBar.a) r4
            if (r4 == 0) goto L_0x00df
            int r4 = r4.a
            if (r4 < 0) goto L_0x00df
            com.google.android.gms.cast.framework.media.widget.CastSeekBar$b r5 = r11.e
            int r5 = r5.b
            int r4 = java.lang.Math.min(r4, r5)
            float r4 = (float) r4
            float r5 = (float) r1
            float r4 = r4 * r5
            com.google.android.gms.cast.framework.media.widget.CastSeekBar$b r5 = r11.e
            int r5 = r5.b
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r2 / 2
            float r5 = (float) r5
            float r6 = r11.n
            android.graphics.Paint r7 = r11.o
            r12.drawCircle(r4, r5, r6, r7)
            goto L_0x00df
        L_0x010e:
            boolean r1 = r11.isEnabled()
            if (r1 == 0) goto L_0x0164
            com.google.android.gms.cast.framework.media.widget.CastSeekBar$b r1 = r11.e
            boolean r1 = r1.f
            if (r1 != 0) goto L_0x011b
            goto L_0x0164
        L_0x011b:
            android.graphics.Paint r1 = r11.o
            int r2 = r11.p
            r1.setColor(r2)
            int r1 = r11.getMeasuredWidth()
            int r2 = r11.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r11.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r11.getMeasuredHeight()
            int r3 = r11.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r11.getPaddingBottom()
            int r2 = r2 - r3
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = r11.getProgress()
            double r5 = (double) r5
            double r5 = r5 * r3
            com.google.android.gms.cast.framework.media.widget.CastSeekBar$b r3 = r11.e
            int r3 = r3.b
            double r3 = (double) r3
            double r5 = r5 / r3
            double r3 = (double) r1
            double r5 = r5 * r3
            int r1 = (int) r5
            int r3 = r12.save()
            float r1 = (float) r1
            float r2 = (float) r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            float r4 = r11.m
            android.graphics.Paint r5 = r11.o
            r12.drawCircle(r1, r2, r4, r5)
            r12.restoreToCount(r3)
        L_0x0164:
            r12.restoreToCount(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.widget.CastSeekBar.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i2, int i3) {
        setMeasuredDimension(View.resolveSizeAndState((int) (this.j + ((float) getPaddingLeft()) + ((float) getPaddingRight())), i2, 0), View.resolveSizeAndState((int) (this.k + ((float) getPaddingTop()) + ((float) getPaddingBottom())), i3, 0));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !this.e.f) {
            return false;
        }
        if (this.u == null) {
            this.u = new Point();
        }
        if (this.t == null) {
            this.t = new int[2];
        }
        getLocationOnScreen(this.t);
        this.u.set((((int) motionEvent.getRawX()) - this.t[0]) - getPaddingLeft(), ((int) motionEvent.getRawY()) - this.t[1]);
        int action = motionEvent.getAction();
        if (action == 0) {
            e();
            h(i(this.u.x));
            return true;
        } else if (action == 1) {
            h(i(this.u.x));
            f();
            return true;
        } else if (action == 2) {
            h(i(this.u.x));
            return true;
        } else if (action != 3) {
            return false;
        } else {
            this.f = false;
            this.g = null;
            c cVar = this.i;
            if (cVar != null) {
                cVar.a(this, getProgress(), true);
                this.i.b(this);
            }
            postInvalidate();
            return true;
        }
    }

    public final void setAdBreaks(List<a> list) {
        if (!q.a(this.h, list)) {
            this.h = list == null ? null : new ArrayList(list);
            postInvalidate();
        }
    }
}
