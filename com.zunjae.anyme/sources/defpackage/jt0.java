package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: jt0  reason: default package */
final class jt0 extends ContentObserver {
    jt0(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        gt0.e.set(true);
    }
}
