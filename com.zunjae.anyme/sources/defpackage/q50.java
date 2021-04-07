package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: q50  reason: default package */
final class q50 implements a50 {
    private final Handler a;

    public q50(Handler handler) {
        this.a = handler;
    }

    public Message a(int i, int i2, int i3) {
        return this.a.obtainMessage(i, i2, i3);
    }

    public boolean b(int i) {
        return this.a.sendEmptyMessage(i);
    }

    public Message c(int i, int i2, int i3, Object obj) {
        return this.a.obtainMessage(i, i2, i3, obj);
    }

    public boolean d(int i, long j) {
        return this.a.sendEmptyMessageAtTime(i, j);
    }

    public void e(int i) {
        this.a.removeMessages(i);
    }

    public Message f(int i, Object obj) {
        return this.a.obtainMessage(i, obj);
    }

    public Looper g() {
        return this.a.getLooper();
    }
}
