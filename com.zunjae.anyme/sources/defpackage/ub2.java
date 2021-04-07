package defpackage;

import java.io.IOException;

/* renamed from: ub2  reason: default package */
public final class ub2 extends RuntimeException {
    private IOException e;
    private IOException f;

    public ub2(IOException iOException) {
        super(iOException);
        this.e = iOException;
        this.f = iOException;
    }

    public void a(IOException iOException) {
        ib2.a(this.e, iOException);
        this.f = iOException;
    }

    public IOException b() {
        return this.e;
    }

    public IOException c() {
        return this.f;
    }
}
