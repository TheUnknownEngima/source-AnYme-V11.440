package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import defpackage.tp1;

/* renamed from: rp1  reason: default package */
public class rp1 {
    private vp1 a;
    private tp1 b;
    private up1 c = new up1();
    private sp1 d = new sp1(this.a);

    public rp1() {
        vp1 vp1 = new vp1();
        this.a = vp1;
        this.b = new tp1(vp1);
    }

    public void a(Canvas canvas) {
        this.b.a(canvas);
    }

    public vp1 b() {
        if (this.a == null) {
            this.a = new vp1();
        }
        return this.a;
    }

    public void c(Context context, AttributeSet attributeSet) {
        this.d.c(context, attributeSet);
    }

    public Pair<Integer, Integer> d(int i, int i2) {
        return this.c.a(this.a, i, i2);
    }

    public void e(tp1.b bVar) {
        this.b.e(bVar);
    }

    public void f(MotionEvent motionEvent) {
        this.b.f(motionEvent);
    }

    public void g(xo1 xo1) {
        this.b.g(xo1);
    }
}
