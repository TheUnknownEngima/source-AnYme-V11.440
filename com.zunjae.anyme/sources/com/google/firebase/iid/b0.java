package com.google.firebase.iid;

import android.os.IBinder;
import com.google.firebase.iid.y;

final /* synthetic */ class b0 implements Runnable {
    private final y.b e;
    private final IBinder f;

    b0(y.b bVar, IBinder iBinder) {
        this.e = bVar;
        this.f = iBinder;
    }

    public final void run() {
        this.e.d(this.f);
    }
}
