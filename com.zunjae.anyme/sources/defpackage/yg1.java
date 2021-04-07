package defpackage;

/* renamed from: yg1  reason: default package */
public class yg1 {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final yg1 d;

    public yg1(Throwable th, xg1 xg1) {
        this.a = th.getLocalizedMessage();
        this.b = th.getClass().getName();
        this.c = xg1.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.d = cause != null ? new yg1(cause, xg1) : null;
    }
}
