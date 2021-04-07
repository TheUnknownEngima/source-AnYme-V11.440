package com.google.android.gms.cast.framework.media.internal;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.google.android.gms.cast.p;

final class p extends MediaSessionCompat.c {
    private final /* synthetic */ l e;

    p(l lVar) {
        this.e = lVar;
    }

    public final boolean g(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if (keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) {
            return true;
        }
        this.e.i.L();
        return true;
    }

    public final void h() {
        this.e.i.L();
    }

    public final void i() {
        this.e.i.L();
    }

    public final void s(long j) {
        p.a aVar = new p.a();
        aVar.d(j);
        this.e.i.I(aVar.a());
    }
}
