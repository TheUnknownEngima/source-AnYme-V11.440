package com.google.android.gms.cast.framework.media;

import android.app.Dialog;
import android.content.DialogInterface;

final class y implements DialogInterface.OnClickListener {
    private final /* synthetic */ j e;

    y(j jVar) {
        this.e = jVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.e.s0 != null) {
            this.e.s0.cancel();
            Dialog unused = this.e.s0 = null;
        }
    }
}
