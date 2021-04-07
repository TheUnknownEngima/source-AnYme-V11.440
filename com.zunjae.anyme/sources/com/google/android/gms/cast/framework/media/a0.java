package com.google.android.gms.cast.framework.media;

import android.content.DialogInterface;

final class a0 implements DialogInterface.OnClickListener {
    private final /* synthetic */ z e;
    private final /* synthetic */ z f;
    private final /* synthetic */ j g;

    a0(j jVar, z zVar, z zVar2) {
        this.g = jVar;
        this.e = zVar;
        this.f = zVar2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.g.d2(this.e, this.f);
    }
}
