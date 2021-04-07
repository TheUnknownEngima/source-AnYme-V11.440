package com.google.firebase.iid;

import android.os.Handler;
import android.os.Message;
import com.google.firebase.iid.y;

final /* synthetic */ class z implements Handler.Callback {
    private final y.b e;

    z(y.b bVar) {
        this.e = bVar;
    }

    public final boolean handleMessage(Message message) {
        return this.e.h(message);
    }
}
