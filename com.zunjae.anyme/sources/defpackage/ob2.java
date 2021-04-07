package defpackage;

import java.io.IOException;

/* renamed from: ob2  reason: default package */
class ob2 extends rd2 {
    private boolean f;

    ob2(ce2 ce2) {
        super(ce2);
    }

    public void X(nd2 nd2, long j) {
        if (this.f) {
            nd2.e(j);
            return;
        }
        try {
            super.X(nd2, j);
        } catch (IOException e) {
            this.f = true;
            a(e);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(IOException iOException);

    public void close() {
        if (!this.f) {
            try {
                super.close();
            } catch (IOException e) {
                this.f = true;
                a(e);
            }
        }
    }

    public void flush() {
        if (!this.f) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f = true;
                a(e);
            }
        }
    }
}
