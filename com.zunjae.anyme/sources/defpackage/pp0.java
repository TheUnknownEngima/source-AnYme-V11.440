package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: pp0  reason: default package */
public class pp0 extends Handler {
    private static rp0 a;

    public pp0(Looper looper) {
        super(looper);
    }

    public pp0(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    private void b(Message message, long j) {
        rp0 rp0 = a;
        if (rp0 != null) {
            rp0.d(this, message, j);
        }
    }

    /* access modifiers changed from: protected */
    public void a(Message message) {
        super.dispatchMessage(message);
    }

    public final void dispatchMessage(Message message) {
        rp0 rp0 = a;
        if (rp0 == null) {
            a(message);
            return;
        }
        Object b = rp0.b(this, message);
        try {
            a(message);
            rp0.c(this, message, b);
        } catch (Throwable th) {
            rp0.c(this, message, b);
            throw th;
        }
    }

    public boolean sendMessageAtTime(Message message, long j) {
        b(message, j);
        return super.sendMessageAtTime(message, j);
    }
}
