package com.google.firebase.iid;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.iid.y0;

public class v0 extends Binder {
    private final a a;

    public interface a {
        e81<Void> a(Intent intent);
    }

    public v0(a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: package-private */
    public void b(y0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
            this.a.a(aVar.a).c(h.a(), new u0(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
