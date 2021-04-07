package kotlinx.coroutines;

import kotlinx.coroutines.o1;

public abstract class v1<J extends o1> extends w implements w0, j1 {
    public final J h;

    public v1(J j) {
        v62.f(j, "job");
        this.h = j;
    }

    public a2 a() {
        return null;
    }

    public boolean b() {
        return true;
    }

    public void k() {
        J j = this.h;
        if (j != null) {
            ((w1) j).d0(this);
            return;
        }
        throw new r22("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
    }
}
