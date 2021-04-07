package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R$styleable;
import androidx.core.widget.NestedScrollView;
import com.github.mikephil.charting.utils.Utils;
import org.xmlpull.v1.XmlPullParser;

class t {
    private static final float[][] u = {new float[]{0.5f, Utils.FLOAT_EPSILON}, new float[]{Utils.FLOAT_EPSILON, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{Utils.FLOAT_EPSILON, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] v = {new float[]{Utils.FLOAT_EPSILON, -1.0f}, new float[]{Utils.FLOAT_EPSILON, 1.0f}, new float[]{-1.0f, Utils.FLOAT_EPSILON}, new float[]{1.0f, Utils.FLOAT_EPSILON}, new float[]{-1.0f, Utils.FLOAT_EPSILON}, new float[]{1.0f, Utils.FLOAT_EPSILON}};
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private float g = 0.5f;
    private float h = 0.5f;
    private float i = Utils.FLOAT_EPSILON;
    private float j = 1.0f;
    private boolean k = false;
    private float[] l = new float[2];
    private float m;
    private float n;
    private final MotionLayout o;
    private float p = 4.0f;
    private float q = 1.2f;
    private boolean r = true;
    private float s = 1.0f;
    private int t = 0;

    class a implements View.OnTouchListener {
        a(t tVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    class b implements NestedScrollView.b {
        b(t tVar) {
        }

        public void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    t(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.o = motionLayout;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    private void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index == R$styleable.OnSwipe_touchAnchorId) {
                this.d = typedArray.getResourceId(index, this.d);
            } else if (index == R$styleable.OnSwipe_touchAnchorSide) {
                int i3 = typedArray.getInt(index, this.a);
                this.a = i3;
                float[][] fArr = u;
                this.h = fArr[i3][0];
                this.g = fArr[i3][1];
            } else if (index == R$styleable.OnSwipe_dragDirection) {
                int i4 = typedArray.getInt(index, this.b);
                this.b = i4;
                float[][] fArr2 = v;
                this.i = fArr2[i4][0];
                this.j = fArr2[i4][1];
            } else if (index == R$styleable.OnSwipe_maxVelocity) {
                this.p = typedArray.getFloat(index, this.p);
            } else if (index == R$styleable.OnSwipe_maxAcceleration) {
                this.q = typedArray.getFloat(index, this.q);
            } else if (index == R$styleable.OnSwipe_moveWhenScrollAtTop) {
                this.r = typedArray.getBoolean(index, this.r);
            } else if (index == R$styleable.OnSwipe_dragScale) {
                this.s = typedArray.getFloat(index, this.s);
            } else if (index == R$styleable.OnSwipe_touchRegionId) {
                this.e = typedArray.getResourceId(index, this.e);
            } else if (index == R$styleable.OnSwipe_onTouchUp) {
                this.c = typedArray.getInt(index, this.c);
            } else if (index == R$styleable.OnSwipe_nestedScrollFlags) {
                this.t = typedArray.getInteger(index, 0);
            } else if (index == R$styleable.OnSwipe_limitBoundsTo) {
                this.f = typedArray.getResourceId(index, 0);
            }
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.OnSwipe);
        b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    public float a(float f2, float f3) {
        return (f2 * this.i) + (f3 * this.j);
    }

    public int d() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public RectF e(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i2 = this.f;
        if (i2 == -1 || (findViewById = viewGroup.findViewById(i2)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.q;
    }

    public float g() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public float i(float f2, float f3) {
        this.o.d0(this.d, this.o.getProgress(), this.h, this.g, this.l);
        if (this.i != Utils.FLOAT_EPSILON) {
            float[] fArr = this.l;
            if (fArr[0] == Utils.FLOAT_EPSILON) {
                fArr[0] = 1.0E-7f;
            }
            return (f2 * this.i) / this.l[0];
        }
        float[] fArr2 = this.l;
        if (fArr2[1] == Utils.FLOAT_EPSILON) {
            fArr2[1] = 1.0E-7f;
        }
        return (f3 * this.j) / this.l[1];
    }

    /* access modifiers changed from: package-private */
    public RectF j(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i2 = this.e;
        if (i2 == -1 || (findViewById = viewGroup.findViewById(i2)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public void l(MotionEvent motionEvent, MotionLayout.e eVar, int i2, q qVar) {
        int i3;
        MotionLayout.e eVar2 = eVar;
        eVar2.b(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            float f2 = 1.0f;
            if (action == 1) {
                this.k = false;
                eVar2.e(1000);
                float d2 = eVar.d();
                float c2 = eVar.c();
                float progress = this.o.getProgress();
                int i4 = this.d;
                if (i4 != -1) {
                    this.o.d0(i4, progress, this.h, this.g, this.l);
                } else {
                    float min = (float) Math.min(this.o.getWidth(), this.o.getHeight());
                    float[] fArr = this.l;
                    fArr[1] = this.j * min;
                    fArr[0] = min * this.i;
                }
                float f3 = this.i;
                float[] fArr2 = this.l;
                float f4 = fArr2[0];
                float f5 = fArr2[1];
                float f6 = f3 != Utils.FLOAT_EPSILON ? d2 / fArr2[0] : c2 / fArr2[1];
                if (!Float.isNaN(f6)) {
                    progress += f6 / 3.0f;
                }
                if (progress != Utils.FLOAT_EPSILON && progress != 1.0f && (i3 = this.c) != 3) {
                    MotionLayout motionLayout = this.o;
                    if (((double) progress) < 0.5d) {
                        f2 = Utils.FLOAT_EPSILON;
                    }
                    motionLayout.p0(i3, f2, f6);
                }
            } else if (action == 2) {
                float rawY = motionEvent.getRawY() - this.n;
                float rawX = motionEvent.getRawX() - this.m;
                if (Math.abs((this.i * rawX) + (this.j * rawY)) > 10.0f || this.k) {
                    float progress2 = this.o.getProgress();
                    if (!this.k) {
                        this.k = true;
                        this.o.setProgress(progress2);
                    }
                    int i5 = this.d;
                    if (i5 != -1) {
                        this.o.d0(i5, progress2, this.h, this.g, this.l);
                    } else {
                        float min2 = (float) Math.min(this.o.getWidth(), this.o.getHeight());
                        float[] fArr3 = this.l;
                        fArr3[1] = this.j * min2;
                        fArr3[0] = min2 * this.i;
                    }
                    float f7 = this.i;
                    float[] fArr4 = this.l;
                    if (((double) Math.abs(((f7 * fArr4[0]) + (this.j * fArr4[1])) * this.s)) < 0.01d) {
                        float[] fArr5 = this.l;
                        fArr5[0] = 0.01f;
                        fArr5[1] = 0.01f;
                    }
                    float max = Math.max(Math.min(progress2 + (this.i != Utils.FLOAT_EPSILON ? rawX / this.l[0] : rawY / this.l[1]), 1.0f), Utils.FLOAT_EPSILON);
                    if (max != this.o.getProgress()) {
                        this.o.setProgress(max);
                        eVar2.e(1000);
                        this.o.z = this.i != Utils.FLOAT_EPSILON ? eVar.d() / this.l[0] : eVar.c() / this.l[1];
                    } else {
                        this.o.z = Utils.FLOAT_EPSILON;
                    }
                    this.m = motionEvent.getRawX();
                    this.n = motionEvent.getRawY();
                }
            }
        } else {
            this.m = motionEvent.getRawX();
            this.n = motionEvent.getRawY();
            this.k = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void m(float f2, float f3) {
        float progress = this.o.getProgress();
        if (!this.k) {
            this.k = true;
            this.o.setProgress(progress);
        }
        this.o.d0(this.d, progress, this.h, this.g, this.l);
        float f4 = this.i;
        float[] fArr = this.l;
        if (((double) Math.abs((f4 * fArr[0]) + (this.j * fArr[1]))) < 0.01d) {
            float[] fArr2 = this.l;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.i;
        float max = Math.max(Math.min(progress + (f5 != Utils.FLOAT_EPSILON ? (f2 * f5) / this.l[0] : (f3 * this.j) / this.l[1]), 1.0f), Utils.FLOAT_EPSILON);
        if (max != this.o.getProgress()) {
            this.o.setProgress(max);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(float f2, float f3) {
        boolean z = false;
        this.k = false;
        float progress = this.o.getProgress();
        this.o.d0(this.d, progress, this.h, this.g, this.l);
        float f4 = this.i;
        float[] fArr = this.l;
        float f5 = fArr[0];
        float f6 = this.j;
        float f7 = fArr[1];
        float f8 = Utils.FLOAT_EPSILON;
        float f9 = f4 != Utils.FLOAT_EPSILON ? (f2 * f4) / fArr[0] : (f3 * f6) / fArr[1];
        if (!Float.isNaN(f9)) {
            progress += f9 / 3.0f;
        }
        if (progress != Utils.FLOAT_EPSILON) {
            boolean z2 = progress != 1.0f;
            if (this.c != 3) {
                z = true;
            }
            if (z && z2) {
                MotionLayout motionLayout = this.o;
                int i2 = this.c;
                if (((double) progress) >= 0.5d) {
                    f8 = 1.0f;
                }
                motionLayout.p0(i2, f8, f9);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(float f2, float f3) {
        this.m = f2;
        this.n = f3;
    }

    public void p(boolean z) {
        if (z) {
            float[][] fArr = v;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = u;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = v;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = u;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = u;
        int i2 = this.a;
        this.h = fArr5[i2][0];
        this.g = fArr5[i2][1];
        float[][] fArr6 = v;
        int i3 = this.b;
        this.i = fArr6[i3][0];
        this.j = fArr6[i3][1];
    }

    /* access modifiers changed from: package-private */
    public void q(float f2, float f3) {
        this.m = f2;
        this.n = f3;
        this.k = false;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        View findViewById = this.o.findViewById(this.d);
        if (findViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) findViewById;
            nestedScrollView.setOnTouchListener(new a(this));
            nestedScrollView.setOnScrollChangeListener(new b(this));
        }
    }

    public String toString() {
        return this.i + " , " + this.j;
    }
}
