package com.mikepenz.materialdrawer.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.github.mikephil.charting.utils.Utils;
import com.mikepenz.materialdrawer.R$style;
import com.mikepenz.materialdrawer.R$styleable;

public class BezelImageView extends AppCompatImageView {
    private Paint g;
    private Paint h;
    private Rect i;
    private RectF j;
    private Drawable k;
    private boolean l;
    private ColorMatrixColorFilter m;
    private int n;
    private int o;
    private ColorFilter p;
    private boolean q;
    private Bitmap r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private ColorMatrixColorFilter w;
    private ColorFilter x;

    @TargetApi(21)
    private class a extends ViewOutlineProvider {
        int a;
        int b;

        a(BezelImageView bezelImageView, int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, this.a, this.b);
        }
    }

    public BezelImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BezelImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l = true;
        this.n = 150;
        this.q = false;
        this.u = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BezelImageView, i2, R$style.BezelImageView);
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.BezelImageView_biv_maskDrawable);
        this.k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.l = obtainStyledAttributes.getBoolean(R$styleable.BezelImageView_biv_drawCircularShadow, true);
        this.o = obtainStyledAttributes.getColor(R$styleable.BezelImageView_biv_selectorOnPress, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.g = paint;
        paint.setColor(-16777216);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.r = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(Utils.FLOAT_EPSILON);
        this.m = new ColorMatrixColorFilter(colorMatrix);
        if (this.o != 0) {
            this.p = new PorterDuffColorFilter(Color.argb(this.n, Color.red(this.o), Color.green(this.o), Color.blue(this.o)), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public void c(boolean z) {
        if (z) {
            this.w = this.m;
            this.x = this.p;
            this.p = null;
            this.m = null;
            return;
        }
        ColorMatrixColorFilter colorMatrixColorFilter = this.w;
        if (colorMatrixColorFilter != null) {
            this.m = colorMatrixColorFilter;
        }
        ColorFilter colorFilter = this.x;
        if (colorFilter != null) {
            this.p = colorFilter;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            this.v = false;
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.v = true;
        } else if (action == 1 || action == 3 || action == 4 || action == 8) {
            this.v = false;
        }
        invalidate();
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful()) {
            this.k.setState(getDrawableState());
        }
        if (isDuplicateParentStateEnabled()) {
            o4.Z(this);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        if (drawable == this.k) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r4 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        r10.h.setColorFilter(r10.m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r4 != null) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.Rect r0 = r10.i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r0.width()
            android.graphics.Rect r1 = r10.i
            int r1 = r1.height()
            if (r0 == 0) goto L_0x00b8
            if (r1 != 0) goto L_0x0015
            goto L_0x00b8
        L_0x0015:
            boolean r2 = r10.q
            r3 = 0
            if (r2 == 0) goto L_0x0028
            int r2 = r10.s
            if (r0 != r2) goto L_0x0028
            int r2 = r10.t
            if (r1 != r2) goto L_0x0028
            boolean r2 = r10.v
            boolean r4 = r10.u
            if (r2 == r4) goto L_0x00a5
        L_0x0028:
            int r2 = r10.s
            if (r0 != r2) goto L_0x0037
            int r2 = r10.t
            if (r1 != r2) goto L_0x0037
            android.graphics.Bitmap r0 = r10.r
            r1 = 0
            r0.eraseColor(r1)
            goto L_0x0048
        L_0x0037:
            android.graphics.Bitmap r2 = r10.r
            r2.recycle()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            r10.r = r2
            r10.s = r0
            r10.t = r1
        L_0x0048:
            android.graphics.Canvas r0 = new android.graphics.Canvas
            android.graphics.Bitmap r1 = r10.r
            r0.<init>(r1)
            android.graphics.drawable.Drawable r1 = r10.k
            r2 = 31
            if (r1 == 0) goto L_0x0087
            int r1 = r0.save()
            android.graphics.drawable.Drawable r4 = r10.k
            r4.draw(r0)
            boolean r4 = r10.v
            if (r4 == 0) goto L_0x0074
            android.graphics.ColorFilter r4 = r10.p
            if (r4 == 0) goto L_0x006c
        L_0x0066:
            android.graphics.Paint r5 = r10.h
            r5.setColorFilter(r4)
            goto L_0x0079
        L_0x006c:
            android.graphics.Paint r4 = r10.h
            android.graphics.ColorMatrixColorFilter r5 = r10.m
            r4.setColorFilter(r5)
            goto L_0x0079
        L_0x0074:
            android.graphics.Paint r4 = r10.h
            r4.setColorFilter(r3)
        L_0x0079:
            android.graphics.RectF r4 = r10.j
            android.graphics.Paint r5 = r10.h
            r0.saveLayer(r4, r5, r2)
            super.onDraw(r0)
            r0.restoreToCount(r1)
            goto L_0x00a5
        L_0x0087:
            boolean r1 = r10.v
            if (r1 == 0) goto L_0x00a2
            int r1 = r0.save()
            r5 = 0
            r6 = 0
            int r4 = r10.s
            float r7 = (float) r4
            int r4 = r10.t
            float r8 = (float) r4
            android.graphics.Paint r9 = r10.g
            r4 = r0
            r4.drawRect(r5, r6, r7, r8, r9)
            android.graphics.ColorFilter r4 = r10.p
            if (r4 == 0) goto L_0x006c
            goto L_0x0066
        L_0x00a2:
            super.onDraw(r0)
        L_0x00a5:
            android.graphics.Bitmap r0 = r10.r
            android.graphics.Rect r1 = r10.i
            int r2 = r1.left
            float r2 = (float) r2
            int r1 = r1.top
            float r1 = (float) r1
            r11.drawBitmap(r0, r2, r1, r3)
            boolean r11 = r10.isPressed()
            r10.u = r11
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mikepenz.materialdrawer.view.BezelImageView.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 21 && this.l) {
            setOutlineProvider(new a(this, i2, i3));
        }
    }

    /* access modifiers changed from: protected */
    public boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        this.i = new Rect(0, 0, i4 - i2, i5 - i3);
        this.j = new RectF(this.i);
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setBounds(this.i);
        }
        if (frame) {
            this.q = false;
        }
        return frame;
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i2) {
        super.setImageResource(i2);
    }

    public void setImageURI(Uri uri) {
        if ("http".equals(uri.getScheme()) || "https".equals(uri.getScheme())) {
            mo1.c().e(this, uri, (String) null);
        } else {
            super.setImageURI(uri);
        }
    }

    public void setSelectorColor(int i2) {
        this.o = i2;
        this.p = new PorterDuffColorFilter(Color.argb(this.n, Color.red(this.o), Color.green(this.o), Color.blue(this.o)), PorterDuff.Mode.SRC_ATOP);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.k || super.verifyDrawable(drawable);
    }
}
