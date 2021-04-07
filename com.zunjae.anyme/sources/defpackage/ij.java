package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.c;
import com.bumptech.glide.load.m;
import defpackage.mj;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: ij  reason: default package */
public class ij extends Drawable implements mj.b, Animatable {
    private final a e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private boolean l;
    private Paint m;
    private Rect n;
    private List<x6> o;

    /* renamed from: ij$a */
    static final class a extends Drawable.ConstantState {
        final mj a;

        a(mj mjVar) {
            this.a = mjVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new ij(this);
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public ij(Context context, od odVar, m<Bitmap> mVar, int i2, int i3, Bitmap bitmap) {
        this(new a(new mj(c.d(context), odVar, i2, i3, mVar, bitmap)));
    }

    ij(a aVar) {
        this.i = true;
        this.k = -1;
        jm.d(aVar);
        this.e = aVar;
    }

    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.n == null) {
            this.n = new Rect();
        }
        return this.n;
    }

    private Paint h() {
        if (this.m == null) {
            this.m = new Paint(2);
        }
        return this.m;
    }

    private void j() {
        List<x6> list = this.o;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.o.get(i2).a(this);
            }
        }
    }

    private void l() {
        this.j = 0;
    }

    private void n() {
        jm.a(!this.h, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.e.a.f() != 1) {
            if (!this.f) {
                this.f = true;
                this.e.a.r(this);
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    private void o() {
        this.f = false;
        this.e.a.s(this);
    }

    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.j++;
        }
        int i2 = this.k;
        if (i2 != -1 && this.j >= i2) {
            j();
            stop();
        }
    }

    public ByteBuffer c() {
        return this.e.a.b();
    }

    public void draw(Canvas canvas) {
        if (!this.h) {
            if (this.l) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
                this.l = false;
            }
            canvas.drawBitmap(this.e.a.c(), (Rect) null, d(), h());
        }
    }

    public Bitmap e() {
        return this.e.a.e();
    }

    public int f() {
        return this.e.a.f();
    }

    public int g() {
        return this.e.a.d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.e;
    }

    public int getIntrinsicHeight() {
        return this.e.a.h();
    }

    public int getIntrinsicWidth() {
        return this.e.a.k();
    }

    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.e.a.j();
    }

    public boolean isRunning() {
        return this.f;
    }

    public void k() {
        this.h = true;
        this.e.a.a();
    }

    public void m(m<Bitmap> mVar, Bitmap bitmap) {
        this.e.a.o(mVar, bitmap);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.l = true;
    }

    public void setAlpha(int i2) {
        h().setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        jm.a(!this.h, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.i = z;
        if (!z) {
            o();
        } else if (this.g) {
            n();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.g = true;
        l();
        if (this.i) {
            n();
        }
    }

    public void stop() {
        this.g = false;
        o();
    }
}
