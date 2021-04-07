package defpackage;

/* renamed from: u40  reason: default package */
public final class u40 {
    private boolean a;

    public u40() {
        this(r40.a);
    }

    public u40(r40 r40) {
    }

    public synchronized void a() {
        while (!this.a) {
            wait();
        }
    }

    public synchronized boolean b() {
        boolean z;
        z = this.a;
        this.a = false;
        return z;
    }

    public synchronized boolean c() {
        return this.a;
    }

    public synchronized boolean d() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }
}
