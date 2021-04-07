package defpackage;

import android.os.Process;

/* renamed from: zb1  reason: default package */
public abstract class zb1 implements Runnable {
    /* access modifiers changed from: protected */
    public abstract void a();

    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
