package defpackage;

/* renamed from: gq0  reason: default package */
final class gq0 extends fq0 {
    private final eq0 a = new eq0();

    gq0() {
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
