package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.i;
import java.util.TimerTask;

final class x extends TimerTask {
    private final /* synthetic */ i.j e;

    x(i.j jVar, i iVar) {
        this.e = jVar;
    }

    public final void run() {
        i.j jVar = this.e;
        i.this.S(jVar.a);
        i.this.b.postDelayed(this, this.e.b);
    }
}
