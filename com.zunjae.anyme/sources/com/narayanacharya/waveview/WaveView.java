package com.narayanacharya.waveview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import java.util.concurrent.atomic.AtomicBoolean;

public class WaveView extends View {
    private int e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private int m;
    private int n;
    private float o;
    private Paint p;
    private Path q;
    private volatile AtomicBoolean r = new AtomicBoolean(true);

    public static class a {
        /* access modifiers changed from: private */
        public int a;
        /* access modifiers changed from: private */
        public float b;
        /* access modifiers changed from: private */
        public float c;
        /* access modifiers changed from: private */
        public float d;
        /* access modifiers changed from: private */
        public float e;
        /* access modifiers changed from: private */
        public float f;
        /* access modifiers changed from: private */
        public float g;
        /* access modifiers changed from: private */
        public float h;
        /* access modifiers changed from: private */
        public int i;
        /* access modifiers changed from: private */
        public int j;
        /* access modifiers changed from: private */
        public float k;
    }

    public WaveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WaveView);
        try {
            setUp(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public WaveView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WaveView);
        try {
            setUp(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void a() {
        float f2 = this.o;
        float f3 = Utils.FLOAT_EPSILON;
        if (f2 >= Utils.FLOAT_EPSILON) {
            f3 = 1.0f;
            if (f2 <= 1.0f) {
                return;
            }
        }
        this.o = f3;
    }

    private void b() {
        Paint paint = new Paint();
        this.p = paint;
        paint.setColor(this.n);
        this.p.setStyle(Paint.Style.FILL_AND_STROKE);
        this.p.setAntiAlias(true);
        this.q = new Path();
    }

    private void setUp(TypedArray typedArray) {
        if (typedArray != null) {
            this.e = typedArray.getInt(R$styleable.WaveView_waveNumberOfWaves, 3);
            this.h = typedArray.getFloat(R$styleable.WaveView_waveFrequency, 2.0f);
            this.g = typedArray.getFloat(R$styleable.WaveView_waveAmplitude, 0.15f);
            this.i = typedArray.getFloat(R$styleable.WaveView_wavePhaseShift, -0.05f);
            this.j = typedArray.getFloat(R$styleable.WaveView_waveDensity, 5.0f);
            this.k = typedArray.getFloat(R$styleable.WaveView_wavePrimaryLineWidth, 3.0f);
            this.l = typedArray.getFloat(R$styleable.WaveView_waveSecondaryLineWidth, 1.0f);
            this.m = typedArray.getColor(R$styleable.WaveView_waveBackgroundColor, -16777216);
            this.n = typedArray.getColor(R$styleable.WaveView_waveColor, -1);
            this.o = typedArray.getFloat(R$styleable.WaveView_waveXAxisPositionMultiplier, 0.5f);
            a();
        } else {
            this.e = 3;
            this.h = 2.0f;
            this.g = 0.15f;
            this.i = -0.05f;
            this.j = 5.0f;
            this.k = 3.0f;
            this.l = 1.0f;
            this.m = -16777216;
            this.n = -1;
            this.o = 0.5f;
        }
        b();
    }

    private void setUpWithBuilder(a aVar) {
        this.e = aVar.a;
        this.h = aVar.d;
        this.g = aVar.c;
        this.f = aVar.b;
        this.i = aVar.e;
        this.j = aVar.f;
        this.k = aVar.g;
        this.l = aVar.h;
        this.m = aVar.i;
        this.n = aVar.j;
        this.o = aVar.k;
        b();
    }

    public void c() {
        this.r.set(true);
    }

    public float getAmplitude() {
        return this.g;
    }

    public int getBackgroundColor() {
        return this.m;
    }

    public float getDensity() {
        return this.j;
    }

    public float getFrequency() {
        return this.h;
    }

    public int getNumberOfWaves() {
        return this.e;
    }

    public float getPhase() {
        return this.f;
    }

    public float getPhaseShift() {
        return this.i;
    }

    public float getPrimaryWaveLineWidth() {
        return this.k;
    }

    public float getSecondaryWaveLineWidth() {
        return this.l;
    }

    public int getWaveColor() {
        return this.n;
    }

    public float getWaveXAxisPositionMultiplier() {
        return this.o;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.drawColor(this.m);
        float height = ((float) canvas.getHeight()) * this.o;
        float width = (float) canvas.getWidth();
        float width2 = (float) (canvas.getWidth() / 2);
        int i2 = 0;
        while (i2 < this.e) {
            this.p.setStrokeWidth(i2 == 0 ? this.k : this.l);
            float f2 = (((1.0f - (((float) i2) / ((float) this.e))) * 1.5f) - 0.5f) * this.g;
            this.q.reset();
            float f3 = Utils.FLOAT_EPSILON;
            while (f3 < this.j + width) {
                float sin = (float) ((((double) (((float) ((-Math.pow((double) ((1.0f / width2) * (f3 - width2)), 2.0d)) + 1.0d)) * this.g * f2)) * Math.sin((((double) (f3 / width)) * 6.283185307179586d * ((double) this.h)) + ((double) (this.f * ((float) (i2 + 1)))))) + ((double) height));
                if (f3 == Utils.FLOAT_EPSILON) {
                    this.q.moveTo(f3, sin);
                } else {
                    this.q.lineTo(f3, sin);
                }
                f3 += this.j;
            }
            this.q.lineTo(f3, (float) canvas.getHeight());
            this.q.lineTo(Utils.FLOAT_EPSILON, (float) canvas.getHeight());
            this.q.close();
            Paint paint = this.p;
            int i3 = 255;
            if (i2 != 0) {
                i3 = 255 / (i2 + 1);
            }
            paint.setAlpha(i3);
            canvas.drawPath(this.q, this.p);
            i2++;
        }
        if (this.r.get()) {
            this.f += this.i;
        }
        invalidate();
    }

    public void setAmplitude(float f2) {
        this.g = f2;
    }

    public void setBackgroundColor(int i2) {
        this.m = i2;
    }

    public void setDensity(float f2) {
        this.j = f2;
    }

    public void setFrequency(float f2) {
        this.h = f2;
    }

    public void setNumberOfWaves(int i2) {
        this.e = i2;
    }

    public void setPhase(float f2) {
        this.f = f2;
    }

    public void setPhaseShift(float f2) {
        this.i = f2;
    }

    public void setPrimaryWaveLineWidth(float f2) {
        this.k = f2;
    }

    public void setSecondaryWaveLineWidth(float f2) {
        this.l = f2;
    }

    public void setWaveColor(int i2) {
        this.n = i2;
        this.p.setColor(i2);
    }

    public void setWaveXAxisPositionMultiplier(float f2) {
        this.o = f2;
        a();
    }
}
