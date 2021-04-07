package defpackage;

/* renamed from: qa1  reason: default package */
public final class qa1 extends pa1 {
    private final float a;

    public qa1(float f) {
        this.a = f - 0.001f;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return true;
    }

    public void c(float f, float f2, float f3, ya1 ya1) {
        float sqrt = (float) ((((double) this.a) * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.a, 2.0d) - Math.pow((double) sqrt, 2.0d));
        ya1.n(f2 - sqrt, ((float) (-((((double) this.a) * Math.sqrt(2.0d)) - ((double) this.a)))) + sqrt2);
        ya1.m(f2, (float) (-((((double) this.a) * Math.sqrt(2.0d)) - ((double) this.a))));
        ya1.m(f2 + sqrt, ((float) (-((((double) this.a) * Math.sqrt(2.0d)) - ((double) this.a)))) + sqrt2);
    }
}
