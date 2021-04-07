package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: lf  reason: default package */
class lf {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: lf$a */
    private static final class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((Cif) message.obj).a();
            return true;
        }
    }

    lf() {
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(Cif<?> ifVar, boolean z) {
        if (!this.a) {
            if (!z) {
                this.a = true;
                ifVar.a();
                this.a = false;
            }
        }
        this.b.obtainMessage(1, ifVar).sendToTarget();
    }
}
