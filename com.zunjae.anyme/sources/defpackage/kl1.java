package defpackage;

/* renamed from: kl1  reason: default package */
public class kl1 extends RuntimeException {
    public kl1(ok1 ok1) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public yj1 a() {
        return new yj1(getMessage());
    }
}
