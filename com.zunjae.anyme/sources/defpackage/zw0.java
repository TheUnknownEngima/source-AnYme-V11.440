package defpackage;

/* renamed from: zw0  reason: default package */
final class zw0 extends xw0 {
    private final ww0 a = new ww0();

    zw0() {
    }

    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.a.a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
