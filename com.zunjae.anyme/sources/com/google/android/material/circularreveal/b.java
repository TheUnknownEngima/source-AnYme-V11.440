package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.circularreveal.c;

public class b {
    public static final int j;
    private final a a;
    private final View b;
    private final Path c = new Path();
    private final Paint d = new Paint(7);
    private final Paint e;
    private c.e f;
    private Drawable g;
    private boolean h;
    private boolean i;

    public interface a {
        void c(Canvas canvas);

        boolean d();
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        j = i2 >= 21 ? 2 : i2 >= 18 ? 1 : 0;
    }

    public b(a aVar) {
        this.a = aVar;
        View view = (View) aVar;
        this.b = view;
        view.setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(0);
    }

    private void d(Canvas canvas) {
        if (o()) {
            Rect bounds = this.g.getBounds();
            float width = this.f.a - (((float) bounds.width()) / 2.0f);
            float height = this.f.b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    private float g(c.e eVar) {
        return z91.b(eVar.a, eVar.b, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) this.b.getWidth(), (float) this.b.getHeight());
    }

    private void i() {
        if (j == 1) {
            this.c.rewind();
            c.e eVar = this.f;
            if (eVar != null) {
                this.c.addCircle(eVar.a, eVar.b, eVar.c, Path.Direction.CW);
            }
        }
        this.b.invalidate();
    }

    private boolean n() {
        c.e eVar = this.f;
        boolean z = eVar == null || eVar.a();
        return j == 0 ? !z && this.i : !z;
    }

    private boolean o() {
        return (this.h || this.g == null || this.f == null) ? false : true;
    }

    private boolean p() {
        return !this.h && Color.alpha(this.e.getColor()) != 0;
    }

    public void a() {
        if (j == 0) {
            this.h = true;
            this.i = false;
            this.b.buildDrawingCache();
            Bitmap drawingCache = this.b.getDrawingCache();
            if (!(drawingCache != null || this.b.getWidth() == 0 || this.b.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.b.getWidth(), this.b.getHeight(), Bitmap.Config.ARGB_8888);
                this.b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.h = false;
            this.i = true;
        }
    }

    public void b() {
        if (j == 0) {
            this.i = false;
            this.b.destroyDrawingCache();
            this.d.setShader((Shader) null);
            this.b.invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        if (p() != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (p() != false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.graphics.Canvas r9) {
        /*
            r8 = this;
            boolean r0 = r8.n()
            if (r0 == 0) goto L_0x0084
            int r0 = j
            if (r0 == 0) goto L_0x0063
            r1 = 1
            if (r0 == r1) goto L_0x0035
            r1 = 2
            if (r0 != r1) goto L_0x001c
            com.google.android.material.circularreveal.b$a r0 = r8.a
            r0.c(r9)
            boolean r0 = r8.p()
            if (r0 == 0) goto L_0x00a5
            goto L_0x008f
        L_0x001c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported strategy "
            r0.append(r1)
            int r1 = j
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x0035:
            int r0 = r9.save()
            android.graphics.Path r1 = r8.c
            r9.clipPath(r1)
            com.google.android.material.circularreveal.b$a r1 = r8.a
            r1.c(r9)
            boolean r1 = r8.p()
            if (r1 == 0) goto L_0x005f
            r3 = 0
            r4 = 0
            android.view.View r1 = r8.b
            int r1 = r1.getWidth()
            float r5 = (float) r1
            android.view.View r1 = r8.b
            int r1 = r1.getHeight()
            float r6 = (float) r1
            android.graphics.Paint r7 = r8.e
            r2 = r9
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x005f:
            r9.restoreToCount(r0)
            goto L_0x00a5
        L_0x0063:
            com.google.android.material.circularreveal.c$e r0 = r8.f
            float r1 = r0.a
            float r2 = r0.b
            float r0 = r0.c
            android.graphics.Paint r3 = r8.d
            r9.drawCircle(r1, r2, r0, r3)
            boolean r0 = r8.p()
            if (r0 == 0) goto L_0x00a5
            com.google.android.material.circularreveal.c$e r0 = r8.f
            float r1 = r0.a
            float r2 = r0.b
            float r0 = r0.c
            android.graphics.Paint r3 = r8.e
            r9.drawCircle(r1, r2, r0, r3)
            goto L_0x00a5
        L_0x0084:
            com.google.android.material.circularreveal.b$a r0 = r8.a
            r0.c(r9)
            boolean r0 = r8.p()
            if (r0 == 0) goto L_0x00a5
        L_0x008f:
            r2 = 0
            r3 = 0
            android.view.View r0 = r8.b
            int r0 = r0.getWidth()
            float r4 = (float) r0
            android.view.View r0 = r8.b
            int r0 = r0.getHeight()
            float r5 = (float) r0
            android.graphics.Paint r6 = r8.e
            r1 = r9
            r1.drawRect(r2, r3, r4, r5, r6)
        L_0x00a5:
            r8.d(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.b.c(android.graphics.Canvas):void");
    }

    public Drawable e() {
        return this.g;
    }

    public int f() {
        return this.e.getColor();
    }

    public c.e h() {
        c.e eVar = this.f;
        if (eVar == null) {
            return null;
        }
        c.e eVar2 = new c.e(eVar);
        if (eVar2.a()) {
            eVar2.c = g(eVar2);
        }
        return eVar2;
    }

    public boolean j() {
        return this.a.d() && !n();
    }

    public void k(Drawable drawable) {
        this.g = drawable;
        this.b.invalidate();
    }

    public void l(int i2) {
        this.e.setColor(i2);
        this.b.invalidate();
    }

    public void m(c.e eVar) {
        if (eVar == null) {
            this.f = null;
        } else {
            c.e eVar2 = this.f;
            if (eVar2 == null) {
                this.f = new c.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (z91.e(eVar.c, g(eVar), 1.0E-4f)) {
                this.f.c = Float.MAX_VALUE;
            }
        }
        i();
    }
}
