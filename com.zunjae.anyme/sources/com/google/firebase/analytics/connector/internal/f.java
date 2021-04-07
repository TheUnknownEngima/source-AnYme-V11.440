package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import defpackage.f71;

final class f implements f71.a {
    private final /* synthetic */ d a;

    public f(d dVar) {
        this.a = dVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j) {
        if (str != null && !str.equals("crash") && c.i(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            this.a.a.a(3, bundle2);
        }
    }
}
