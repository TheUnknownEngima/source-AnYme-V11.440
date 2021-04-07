package defpackage;

/* renamed from: hc  reason: default package */
public class hc implements Runnable {
    private kb e;
    private eb f;
    private final ab<String> g;
    private w9<fb> h;

    public hc(kb kbVar, eb ebVar, ab<String> abVar, w9<fb> w9Var) {
        this.e = kbVar;
        this.f = ebVar;
        this.g = abVar;
        this.h = w9Var;
    }

    public void run() {
        try {
            fb b = this.e.b(this.f.a(), this.f, this.g.e(true));
            if (this.h != null) {
                this.h.a(b);
            }
        } catch (ka e2) {
            w9<fb> w9Var = this.h;
            if (w9Var != null) {
                w9Var.b(e2);
            }
        }
    }
}
