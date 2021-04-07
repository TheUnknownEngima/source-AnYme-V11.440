package defpackage;

/* renamed from: v42  reason: default package */
public final class v42 implements k42<Object> {
    public static final v42 e = new v42();

    private v42() {
    }

    public void d(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public n42 e() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
