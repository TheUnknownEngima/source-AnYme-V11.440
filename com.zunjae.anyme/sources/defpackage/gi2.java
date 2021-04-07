package defpackage;

/* renamed from: gi2  reason: default package */
public class gi2 extends RuntimeException {
    public gi2(qi2<?> qi2) {
        super(a(qi2));
        qi2.b();
        qi2.e();
    }

    private static String a(qi2<?> qi2) {
        vi2.b(qi2, "response == null");
        return "HTTP " + qi2.b() + " " + qi2.e();
    }
}
