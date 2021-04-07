package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.wo1;
import java.util.Iterator;

/* renamed from: qp1  reason: default package */
public class qp1 extends hp1<AnimatorSet> {
    int d;
    int e;
    int f;
    boolean g;
    int h;
    int i;
    private fp1 j = new fp1();

    /* renamed from: qp1$a */
    class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ fp1 e;
        final /* synthetic */ boolean f;

        a(fp1 fp1, boolean z) {
            this.e = fp1;
            this.f = z;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            qp1.this.l(this.e, valueAnimator, this.f);
        }
    }

    /* renamed from: qp1$b */
    class b {
        final int a;
        final int b;
        final int c;
        final int d;

        b(qp1 qp1, int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    public qp1(wo1.a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: private */
    public void l(fp1 fp1, ValueAnimator valueAnimator, boolean z) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (!this.g ? z : !z) {
            fp1.c(intValue);
        } else {
            fp1.d(intValue);
        }
        wo1.a aVar = this.b;
        if (aVar != null) {
            aVar.a(fp1);
        }
    }

    /* renamed from: g */
    public AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    public b h(boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (z) {
            int i6 = this.d;
            int i7 = this.f;
            i5 = i6 + i7;
            int i8 = this.e;
            i3 = i8 + i7;
            i2 = i6 - i7;
            i4 = i8 - i7;
        } else {
            int i9 = this.d;
            int i10 = this.f;
            i5 = i9 - i10;
            int i11 = this.e;
            i3 = i11 - i10;
            i2 = i9 + i10;
            i4 = i11 + i10;
        }
        return new b(this, i5, i3, i2, i4);
    }

    /* access modifiers changed from: package-private */
    public ValueAnimator i(int i2, int i3, long j2, boolean z, fp1 fp1) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i2, i3});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j2);
        ofInt.addUpdateListener(new a(fp1, z));
        return ofInt;
    }

    /* renamed from: j */
    public qp1 b(long j2) {
        super.b(j2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean k(int i2, int i3, int i4, boolean z) {
        return (this.d == i2 && this.e == i3 && this.f == i4 && this.g == z) ? false : true;
    }

    /* renamed from: m */
    public qp1 d(float f2) {
        T t = this.c;
        if (t == null) {
            return this;
        }
        long j2 = (long) (f2 * ((float) this.a));
        Iterator<Animator> it = ((AnimatorSet) t).getChildAnimations().iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) it.next();
            long duration = valueAnimator.getDuration();
            if (j2 <= duration) {
                duration = j2;
            }
            valueAnimator.setCurrentPlayTime(duration);
            j2 -= duration;
        }
        return this;
    }

    public qp1 n(int i2, int i3, int i4, boolean z) {
        if (k(i2, i3, i4, z)) {
            this.c = a();
            this.d = i2;
            this.e = i3;
            this.f = i4;
            this.g = z;
            int i5 = i2 - i4;
            this.h = i5;
            this.i = i2 + i4;
            this.j.d(i5);
            this.j.c(this.i);
            b h2 = h(z);
            long j2 = this.a / 2;
            ((AnimatorSet) this.c).playSequentially(new Animator[]{i(h2.a, h2.b, j2, false, this.j), i(h2.c, h2.d, j2, true, this.j)});
        }
        return this;
    }
}
