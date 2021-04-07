package defpackage;

/* renamed from: h52  reason: default package */
public class h52 extends e52 {
    public void a(Throwable th, Throwable th2) {
        v62.e(th, "cause");
        v62.e(th2, "exception");
        th.addSuppressed(th2);
    }
}
