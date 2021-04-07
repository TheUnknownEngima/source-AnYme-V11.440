package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.wo1;
import java.util.Iterator;

/* renamed from: jp1  reason: default package */
public class jp1 extends hp1<AnimatorSet> {
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private zo1 i = new zo1();

    /* renamed from: jp1$a */
    class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ c e;

        a(c cVar) {
            this.e = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            jp1.this.k(valueAnimator, this.e);
        }
    }

    /* renamed from: jp1$b */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                jp1$c[] r0 = defpackage.jp1.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                jp1$c r1 = defpackage.jp1.c.Width     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                jp1$c r1 = defpackage.jp1.c.Height     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                jp1$c r1 = defpackage.jp1.c.Radius     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jp1.b.<clinit>():void");
        }
    }

    /* renamed from: jp1$c */
    private enum c {
        Width,
        Height,
        Radius
    }

    public jp1(wo1.a aVar) {
        super(aVar);
    }

    private ValueAnimator h(int i2, int i3, long j, c cVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i2, i3});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new a(cVar));
        return ofInt;
    }

    private boolean j(int i2, int i3, int i4, int i5, int i6) {
        return (this.d == i2 && this.e == i3 && this.f == i4 && this.g == i5 && this.h == i6) ? false : true;
    }

    /* access modifiers changed from: private */
    public void k(ValueAnimator valueAnimator, c cVar) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i2 = b.a[cVar.ordinal()];
        if (i2 == 1) {
            this.i.f(intValue);
        } else if (i2 == 2) {
            this.i.d(intValue);
        } else if (i2 == 3) {
            this.i.e(intValue);
        }
        wo1.a aVar = this.b;
        if (aVar != null) {
            aVar.a(this.i);
        }
    }

    public /* bridge */ /* synthetic */ hp1 b(long j) {
        i(j);
        return this;
    }

    public /* bridge */ /* synthetic */ hp1 d(float f2) {
        l(f2);
        return this;
    }

    /* renamed from: g */
    public AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public jp1 i(long j) {
        super.b(j);
        return this;
    }

    public jp1 l(float f2) {
        T t = this.c;
        if (t != null) {
            long j = (long) (f2 * ((float) this.a));
            boolean z = false;
            Iterator<Animator> it = ((AnimatorSet) t).getChildAnimations().iterator();
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it.next();
                long duration = valueAnimator.getDuration();
                long j2 = z ? j - duration : j;
                if (j2 >= 0) {
                    if (j2 >= duration) {
                        j2 = duration;
                    }
                    if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                        valueAnimator.setCurrentPlayTime(j2);
                    }
                    if (!z && duration >= this.a) {
                        z = true;
                    }
                }
            }
        }
        return this;
    }

    public jp1 m(int i2, int i3, int i4, int i5, int i6) {
        int i7 = i6;
        if (j(i2, i3, i4, i5, i6)) {
            this.c = a();
            int i8 = i2;
            this.d = i8;
            int i9 = i3;
            this.e = i9;
            this.f = i4;
            this.g = i5;
            this.h = i7;
            int i10 = (int) (((double) i7) / 1.5d);
            long j = this.a;
            ValueAnimator h2 = h(i8, i9, j, c.Width);
            long j2 = j / 2;
            ValueAnimator h3 = h(i4, i5, j2, c.Height);
            ValueAnimator h4 = h(i6, i10, j2, c.Radius);
            ValueAnimator h5 = h(i5, i4, j2, c.Height);
            ((AnimatorSet) this.c).play(h3).with(h4).with(h2).before(h5).before(h(i10, i6, j2, c.Radius));
        }
        return this;
    }
}
