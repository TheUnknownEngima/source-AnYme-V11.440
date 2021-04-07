package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import defpackage.f71;

final class e implements f71.a {
    private final /* synthetic */ b a;

    public e(b bVar) {
        this.a = bVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j) {
        if (this.a.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", c.j(str2));
            this.a.b.a(2, bundle2);
        }
    }
}
