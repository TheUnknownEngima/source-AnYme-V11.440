package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: mt0  reason: default package */
final class mt0 extends ContentObserver {
    private final /* synthetic */ kt0 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    mt0(kt0 kt0, Handler handler) {
        super((Handler) null);
        this.a = kt0;
    }

    public final void onChange(boolean z) {
        this.a.c();
    }
}
