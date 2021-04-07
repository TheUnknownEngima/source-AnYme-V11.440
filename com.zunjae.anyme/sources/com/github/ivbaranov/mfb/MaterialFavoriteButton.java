package com.github.ivbaranov.mfb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

public class MaterialFavoriteButton extends ImageView {
    private static final int A = R$drawable.ic_favorite_border_white_24dp;
    private static final AccelerateInterpolator B = new AccelerateInterpolator();
    private static final OvershootInterpolator C = new OvershootInterpolator(4.0f);
    private static final int t = R$drawable.ic_star_black_24dp;
    private static final int u = R$drawable.ic_star_border_black_24dp;
    private static final int v = R$drawable.ic_star_white_24dp;
    private static final int w = R$drawable.ic_star_border_white_24dp;
    private static final int x = R$drawable.ic_favorite_black_24dp;
    private static final int y = R$drawable.ic_favorite_border_black_24dp;
    private static final int z = R$drawable.ic_favorite_white_24dp;
    private int e;
    private int f;
    /* access modifiers changed from: private */
    public boolean g;
    private boolean h;
    private boolean i;
    /* access modifiers changed from: private */
    public int j;
    /* access modifiers changed from: private */
    public int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private e q;
    /* access modifiers changed from: private */
    public d r;
    private boolean s;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            MaterialFavoriteButton.this.k();
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationStart(Animator animator) {
            MaterialFavoriteButton materialFavoriteButton;
            int i;
            if (MaterialFavoriteButton.this.g) {
                materialFavoriteButton = MaterialFavoriteButton.this;
                i = materialFavoriteButton.j;
            } else {
                materialFavoriteButton = MaterialFavoriteButton.this;
                i = materialFavoriteButton.k;
            }
            materialFavoriteButton.setImageResource(i);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            if (MaterialFavoriteButton.this.r != null) {
                d d = MaterialFavoriteButton.this.r;
                MaterialFavoriteButton materialFavoriteButton = MaterialFavoriteButton.this;
                d.a(materialFavoriteButton, materialFavoriteButton.g);
            }
        }
    }

    public interface d {
        void a(MaterialFavoriteButton materialFavoriteButton, boolean z);
    }

    public interface e {
        void a(MaterialFavoriteButton materialFavoriteButton, boolean z);
    }

    public MaterialFavoriteButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g(context, attributeSet);
    }

    public MaterialFavoriteButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        g(context, attributeSet);
    }

    private void e(boolean z2) {
        int i2;
        float f2;
        if (z2) {
            i2 = this.m;
            f2 = 0.2f;
        } else {
            i2 = -this.m;
            f2 = 1.3f;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rotation", new float[]{0.0f, (float) i2});
        ofFloat.setDuration((long) this.l);
        ofFloat.setInterpolator(B);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleX", new float[]{f2, 1.0f});
        ofFloat2.setDuration((long) this.n);
        ofFloat2.setInterpolator(C);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "scaleY", new float[]{f2, 1.0f});
        ofFloat3.setDuration((long) this.n);
        ofFloat3.setInterpolator(C);
        ofFloat3.addListener(new b());
        animatorSet.play(ofFloat);
        animatorSet.play(ofFloat2).with(ofFloat3).after(ofFloat);
        animatorSet.addListener(new c());
        animatorSet.start();
    }

    private TypedArray f(Context context, AttributeSet attributeSet, int[] iArr) {
        return context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private void g(Context context, AttributeSet attributeSet) {
        this.e = a.a(48.0f, getResources());
        this.f = a.a(12.0f, getResources());
        this.g = false;
        this.h = true;
        this.i = false;
        this.j = t;
        this.k = u;
        this.l = 400;
        this.m = 360;
        this.n = 300;
        this.o = 0;
        this.p = 0;
        if (!isInEditMode()) {
            if (attributeSet != null) {
                h(context, attributeSet);
            }
            setOnClickListener(new a());
        }
        setImageResource(this.g ? this.j : this.k);
        int i2 = this.f;
        setPadding(i2, i2, i2, i2);
    }

    private void h(Context context, AttributeSet attributeSet) {
        TypedArray f2 = f(context, attributeSet, R$styleable.MaterialFavoriteButton);
        if (f2 != null) {
            try {
                this.e = a.a((float) f2.getInt(R$styleable.MaterialFavoriteButton_mfb_size, 48), getResources());
                this.h = f2.getBoolean(R$styleable.MaterialFavoriteButton_mfb_animate_favorite, this.h);
                this.i = f2.getBoolean(R$styleable.MaterialFavoriteButton_mfb_animate_unfavorite, this.i);
                this.f = a.a((float) f2.getInt(R$styleable.MaterialFavoriteButton_mfb_padding, 12), getResources());
                if (f2.getResourceId(R$styleable.MaterialFavoriteButton_mfb_favorite_image, 0) == 0 || f2.getResourceId(R$styleable.MaterialFavoriteButton_mfb_not_favorite_image, 0) == 0) {
                    j(f2.getInt(R$styleable.MaterialFavoriteButton_mfb_color, 0), f2.getInt(R$styleable.MaterialFavoriteButton_mfb_type, 0));
                } else {
                    this.j = f2.getResourceId(R$styleable.MaterialFavoriteButton_mfb_favorite_image, t);
                    this.k = f2.getResourceId(R$styleable.MaterialFavoriteButton_mfb_not_favorite_image, u);
                }
                this.l = f2.getInt(R$styleable.MaterialFavoriteButton_mfb_rotation_duration, this.l);
                this.m = f2.getInt(R$styleable.MaterialFavoriteButton_mfb_rotation_angle, this.m);
                this.n = f2.getInt(R$styleable.MaterialFavoriteButton_mfb_bounce_duration, this.n);
            } finally {
                f2.recycle();
            }
        }
    }

    private void j(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            if (i3 == 0) {
                this.j = t;
                i4 = u;
            } else {
                this.j = x;
                i4 = y;
            }
        } else if (i3 == 0) {
            this.j = v;
            i4 = w;
        } else {
            this.j = z;
            i4 = A;
        }
        this.k = i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r2 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r2 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r2.a(r1, r1.g);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l(boolean r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.g
            if (r0 == r2) goto L_0x003d
            r1.g = r2
            boolean r0 = r1.s
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            r0 = 1
            r1.s = r0
            com.github.ivbaranov.mfb.MaterialFavoriteButton$e r0 = r1.q
            if (r0 == 0) goto L_0x0017
            if (r4 != 0) goto L_0x0017
            r0.a(r1, r2)
        L_0x0017:
            if (r2 == 0) goto L_0x0026
            if (r3 == 0) goto L_0x001c
            goto L_0x0028
        L_0x001c:
            int r2 = r1.j
            super.setImageResource(r2)
            com.github.ivbaranov.mfb.MaterialFavoriteButton$d r2 = r1.r
            if (r2 == 0) goto L_0x003a
            goto L_0x0035
        L_0x0026:
            if (r3 == 0) goto L_0x002c
        L_0x0028:
            r1.e(r2)
            goto L_0x003a
        L_0x002c:
            int r2 = r1.k
            super.setImageResource(r2)
            com.github.ivbaranov.mfb.MaterialFavoriteButton$d r2 = r1.r
            if (r2 == 0) goto L_0x003a
        L_0x0035:
            boolean r3 = r1.g
            r2.a(r1, r3)
        L_0x003a:
            r2 = 0
            r1.s = r2
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.ivbaranov.mfb.MaterialFavoriteButton.l(boolean, boolean, boolean):void");
    }

    public boolean i() {
        return this.g;
    }

    public void k() {
        setFavorite(!this.g);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.e;
        setMeasuredDimension(i4, i4);
    }

    public void setAnimateFavorite(boolean z2) {
        this.h = z2;
    }

    public void setAnimateUnfavorite(boolean z2) {
        this.i = z2;
    }

    public void setBounceDuration(int i2) {
        this.n = i2;
    }

    public void setColor(int i2) {
        this.o = i2;
        j(i2, this.p);
    }

    public void setFavorite(boolean z2) {
        l(z2, false, false);
    }

    public void setFavoriteAnimated(boolean z2) {
        l(z2, true, false);
    }

    public void setFavoriteResource(int i2) {
        this.j = i2;
    }

    public void setFavoriteSuppressListener(boolean z2) {
        l(z2, this.h, true);
    }

    public void setNotFavoriteResource(int i2) {
        this.k = i2;
    }

    public void setOnFavoriteAnimationEndListener(d dVar) {
        this.r = dVar;
    }

    public void setOnFavoriteChangeListener(e eVar) {
        this.q = eVar;
    }

    public void setPadding(int i2) {
        int a2 = a.a((float) i2, getResources());
        this.f = a2;
        setPadding(a2, a2, a2, a2);
    }

    public void setRotationAngle(int i2) {
        this.m = i2;
    }

    public void setRotationDuration(int i2) {
        this.l = i2;
    }

    public void setSize(int i2) {
        this.e = a.a((float) i2, getResources());
    }

    public void setType(int i2) {
        this.p = i2;
        j(this.o, i2);
    }
}
