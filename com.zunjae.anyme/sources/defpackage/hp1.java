package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import defpackage.wo1;

/* renamed from: hp1  reason: default package */
public abstract class hp1<T extends Animator> {
    protected long a = 350;
    protected wo1.a b;
    protected T c;

    public hp1(wo1.a aVar) {
        this.b = aVar;
        this.c = a();
    }

    public abstract T a();

    public hp1 b(long j) {
        this.a = j;
        T t = this.c;
        if (t instanceof ValueAnimator) {
            t.setDuration(j);
        }
        return this;
    }

    public void c() {
        T t = this.c;
        if (t != null && t.isStarted()) {
            this.c.end();
        }
    }

    public abstract hp1 d(float f);

    public void e() {
        T t = this.c;
        if (t != null && !t.isRunning()) {
            this.c.start();
        }
    }
}
