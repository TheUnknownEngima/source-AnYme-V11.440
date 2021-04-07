package defpackage;

/* renamed from: ta1  reason: default package */
public final class ta1 extends pa1 {
    private final pa1 a;
    private final float b;

    public ta1(pa1 pa1, float f) {
        this.a = pa1;
        this.b = f;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.a.b();
    }

    public void c(float f, float f2, float f3, ya1 ya1) {
        this.a.c(f, f2 - this.b, f3, ya1);
    }
}
