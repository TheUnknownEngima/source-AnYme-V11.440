package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.R$styleable;
import com.github.mikephil.charting.utils.Utils;

public class ImageFilterButton extends AppCompatImageButton {
    private ImageFilterView.c g = new ImageFilterView.c();
    private float h = Utils.FLOAT_EPSILON;
    /* access modifiers changed from: private */
    public float i = Utils.FLOAT_EPSILON;
    /* access modifiers changed from: private */
    public float j = Float.NaN;
    private Path k;
    ViewOutlineProvider l;
    RectF m;
    Drawable[] n;
    LayerDrawable o;
    private boolean p = true;

    class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterButton.this.i) / 2.0f);
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.j);
        }
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c(context, attributeSet);
    }

    private void c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.ImageFilterView_altSrc);
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R$styleable.ImageFilterView_crossfade) {
                    this.h = obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON);
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
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.p));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.n = drawableArr;
                drawableArr[0] = getDrawable();
                this.n[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.n);
                this.o = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.h * 255.0f));
                super.setImageDrawable(this.o);
            }
        }
    }

    private void setOverlay(boolean z) {
        this.p = z;
    }

    public void draw(Canvas canvas) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21 || this.j == Utils.FLOAT_EPSILON || this.k == null) {
            z = false;
        } else {
            z = true;
            canvas.save();
            canvas.clipPath(this.k);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public float getContrast() {
        return this.g.f;
    }

    public float getCrossfade() {
        return this.h;
    }

    public float getRound() {
        return this.j;
    }

    public float getRoundPercent() {
        return this.i;
    }

    public float getSaturation() {
        return this.g.e;
    }

    public float getWarmth() {
        return this.g.g;
    }

    public void setBrightness(float f) {
        ImageFilterView.c cVar = this.g;
        cVar.d = f;
        cVar.c(this);
    }

    public void setContrast(float f) {
        ImageFilterView.c cVar = this.g;
        cVar.f = f;
        cVar.c(this);
    }

    public void setCrossfade(float f) {
        this.h = f;
        if (this.n != null) {
            if (!this.p) {
                this.o.getDrawable(0).setAlpha((int) ((1.0f - this.h) * 255.0f));
            }
            this.o.getDrawable(1).setAlpha((int) (this.h * 255.0f));
            super.setImageDrawable(this.o);
        }
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.j = f;
            float f2 = this.i;
            this.i = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.j != f;
        this.j = f;
        if (f != Utils.FLOAT_EPSILON) {
            if (this.k == null) {
                this.k = new Path();
            }
            if (this.m == null) {
                this.m = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.l == null) {
                    b bVar = new b();
                    this.l = bVar;
                    setOutlineProvider(bVar);
                }
                setClipToOutline(true);
            }
            this.m.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) getWidth(), (float) getHeight());
            this.k.reset();
            Path path = this.k;
            RectF rectF = this.m;
            float f3 = this.j;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.i != f;
        this.i = f;
        if (f != Utils.FLOAT_EPSILON) {
            if (this.k == null) {
                this.k = new Path();
            }
            if (this.m == null) {
                this.m = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.l == null) {
                    a aVar = new a();
                    this.l = aVar;
                    setOutlineProvider(aVar);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.i) / 2.0f;
            this.m.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) width, (float) height);
            this.k.reset();
            this.k.addRoundRect(this.m, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.c cVar = this.g;
        cVar.e = f;
        cVar.c(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.c cVar = this.g;
        cVar.g = f;
        cVar.c(this);
    }
}
