package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

public final class p1 extends CancellationException implements y<p1> {
    public final o1 e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p1(String str, Throwable th, o1 o1Var) {
        super(str);
        v62.f(str, "message");
        v62.f(o1Var, "job");
        this.e = o1Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* renamed from: b */
    public p1 a() {
        if (!k0.c()) {
            return null;
        }
        String message = getMessage();
        if (message != null) {
            return new p1(message, this, this.e);
        }
        v62.l();
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof p1) {
                p1 p1Var = (p1) obj;
                if (!v62.a(p1Var.getMessage(), getMessage()) || !v62.a(p1Var.e, this.e) || !v62.a(p1Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        if (!k0.c()) {
            return this;
        }
        Throwable fillInStackTrace = super.fillInStackTrace();
        v62.b(fillInStackTrace, "super.fillInStackTrace()");
        return fillInStackTrace;
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            int hashCode = ((message.hashCode() * 31) + this.e.hashCode()) * 31;
            Throwable cause = getCause();
            return hashCode + (cause != null ? cause.hashCode() : 0);
        }
        v62.l();
        throw null;
    }

    public String toString() {
        return super.toString() + "; job=" + this.e;
    }
}
