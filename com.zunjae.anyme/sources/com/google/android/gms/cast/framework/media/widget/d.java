package com.google.android.gms.cast.framework.media.widget;

import android.os.Looper;
import com.google.android.gms.cast.framework.media.i;
import java.util.TimerTask;

final class d extends TimerTask {
    final /* synthetic */ i e;
    final /* synthetic */ ExpandedControllerActivity f;

    d(ExpandedControllerActivity expandedControllerActivity, i iVar) {
        this.f = expandedControllerActivity;
        this.e = iVar;
    }

    public final void run() {
        new mb0(Looper.getMainLooper()).post(new f(this));
    }
}
