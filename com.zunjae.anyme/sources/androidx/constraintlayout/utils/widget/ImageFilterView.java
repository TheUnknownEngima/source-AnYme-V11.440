package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.R$styleable;
import com.github.mikephil.charting.utils.Utils;

public class ImageFilterView extends AppCompatImageView {
    private c g = new c();
    private boolean h = true;
    private float i = Utils.FLOAT_EPSILON;
    /* access modifiers changed from: private */
    public float j = Utils.FLOAT_EPSILON;
    /* access modifiers changed from: private */
    public float k = Float.NaN;
    private Path l;
    ViewOutlineProvider m;
    RectF n;
    Drawable[] o;
    LayerDrawable p;

    class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterView.this.j) / 2.0f);
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.k);
        }
    }

    static class c {
        float[] a = new float[20];
        ColorMatrix b = new ColorMatrix();
        ColorMatrix c = new ColorMatrix();
        float d = 1.0f;
        float e = 1.0f;
        float f = 1.0f;
        float g = 1.0f;

        c() {
        }

        private void a(float f2) {
            float[] fArr = this.a;
            fArr[0] = f2;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f2;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f2;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void b(float f2) {
            float f3 = 1.0f - f2;
            float f4 = 0.2999f * f3;
            float f5 = 0.587f * f3;
            float f6 = f3 * 0.114f;
            float[] fArr = this.a;
            fArr[0] = f4 + f2;
            fArr[1] = f5;
            fArr[2] = f6;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f4;
            fArr[6] = f5 + f2;
            fArr[7] = f6;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f4;
            fArr[11] = f5;
            fArr[12] = f6 + f2;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void d(float f2) {
            float f3;
            float f4;
            if (f2 <= Utils.FLOAT_EPSILON) {
                f2 = 0.01f;
            }
            float f5 = (5000.0f / f2) / 100.0f;
            if (f5 > 66.0f) {
                double d2 = (double) (f5 - 60.0f);
                f4 = ((float) Math.pow(d2, -0.13320475816726685d)) * 329.69873f;
                f3 = ((float) Math.pow(d2, 0.07551484555006027d)) * 288.12216f;
            } else {
                f3 = (((float) Math.log((double) f5)) * 99.4708f) - 161.11957f;
                f4 = 255.0f;
            }
            float log = f5 < 66.0f ? f5 > 19.0f ? (((float) Math.log((double) (f5 - 10.0f))) * 138.51773f) - 305.0448f : Utils.FLOAT_EPSILON : 255.0f;
            float min = Math.min(255.0f, Math.max(f4, Utils.FLOAT_EPSILON));
            float min2 = Math.min(255.0f, Math.max(f3, Utils.FLOAT_EPSILON));
            float min3 = Math.min(255.0f, Math.max(log, Utils.FLOAT_EPSILON));
            float min4 = Math.min(255.0f, Math.max(255.0f, Utils.FLOAT_EPSILON));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log((double) 50.0f)) * 99.4708f) - 161.11957f, Utils.FLOAT_EPSILON));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log((double) 40.0f)) * 138.51773f) - 305.0448f, Utils.FLOAT_EPSILON));
            float[] fArr = this.a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* access modifiers changed from: package-private */
        public void c(ImageView imageView) {
            boolean z;
            this.b.reset();
            float f2 = this.e;
            boolean z2 = true;
            if (f2 != 1.0f) {
                b(f2);
                this.b.set(this.a);
                z = true;
            } else {
                z = false;
            }
            float f3 = this.f;
            if (f3 != 1.0f) {
                this.c.setScale(f3, f3, f3, 1.0f);
                this.b.postConcat(this.c);
                z = true;
            }
            float f4 = this.g;
            if (f4 != 1.0f) {
                d(f4);
                this.c.set(this.a);
                this.b.postConcat(this.c);
                z = true;
            }
            float f5 = this.d;
            if (f5 != 1.0f) {
                a(f5);
                this.c.set(this.a);
                this.b.postConcat(this.c);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.b));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        e(context, attributeSet);
    }

    private void e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.ImageFilterView_altSrc);
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R$styleable.ImageFilterView_crossfade) {
                    this.i = obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON);
                } else if (index == R$styleable.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON));
                } else if (index == R$styleable.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON));
                } else if (index == R$styleable.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON));
                } else if (index == R$styleable.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, Utils.FLOAT_EPSILON));
                } else if (index == R$styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON));
                } else if (index == R$styleable.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.h));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.o = drawableArr;
                drawableArr[0] = getDrawable();
                this.o[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.o);
                this.p = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.i * 255.0f));
                super.setImageDrawable(this.p);
            }
        }
    }

    private void setOverlay(boolean z) {
        this.h = z;
    }

    public void draw(Canvas canvas) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21 || this.j == Utils.FLOAT_EPSILON || this.l == null) {
            z = false;
        } else {
            z = true;
            canvas.save();
            canvas.clipPath(this.l);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public float getBrightness() {
        return this.g.d;
    }

    public float getContrast() {
        return this.g.f;
    }

    public float getCrossfade() {
        return this.i;
    }

    public float getRound() {
        return this.k;
    }

    public float getRoundPercent() {
        return this.j;
    }

    public float getSaturation() {
        return this.g.e;
    }

    public float getWarmth() {
        return this.g.g;
    }

    public void setBrightness(float f) {
        c cVar = this.g;
        cVar.d = f;
        cVar.c(this);
    }

    public void setContrast(float f) {
        c cVar = this.g;
        cVar.f = f;
        cVar.c(this);
    }

    public void setCrossfade(float f) {
        this.i = f;
        if (this.o != null) {
            if (!this.h) {
                this.p.getDrawable(0).setAlpha((int) ((1.0f - this.i) * 255.0f));
            }
            this.p.getDrawable(1).setAlpha((int) (this.i * 255.0f));
            super.setImageDrawable(this.p);
        }
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.k = f;
            float f2 = this.j;
            this.j = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.k != f;
        this.k = f;
        if (f != Utils.FLOAT_EPSILON) {
            if (this.l == null) {
                this.l = new Path();
            }
            if (this.n == null) {
                this.n = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.m == null) {
                    b bVar = new b();
                    this.m = bVar;
                    setOutlineProvider(bVar);
                }
                setClipToOutline(true);
            }
            this.n.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) getWidth(), (float) getHeight());
            this.l.reset();
            Path path = this.l;
            RectF rectF = this.n;
            float f3 = this.k;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.j != f;
        this.j = f;
        if (f != Utils.FLOAT_EPSILON) {
            if (this.l == null) {
                this.l = new Path();
            }
            if (this.n == null) {
                this.n = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.m == null) {
                    a aVar = new a();
                    this.m = aVar;
                    setOutlineProvider(aVar);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.j) / 2.0f;
            this.n.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) width, (float) height);
            this.l.reset();
            this.l.addRoundRect(this.n, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        c cVar = this.g;
        cVar.e = f;
        cVar.c(this);
    }

    public void setWarmth(float f) {
        c cVar = this.g;
        cVar.g = f;
        cVar.c(this);
    }
}
