package com.google.android.gms.measurement.internal;

import android.net.Uri;

final class m7 implements Runnable {
    private final /* synthetic */ boolean e;
    private final /* synthetic */ Uri f;
    private final /* synthetic */ String g;
    private final /* synthetic */ String h;
    private final /* synthetic */ j7 i;

    m7(j7 j7Var, boolean z, Uri uri, String str, String str2) {
        this.i = j7Var;
        this.e = z;
        this.f = uri;
        this.g = str;
        this.h = str2;
    }

    public final void run() {
        this.i.b(this.e, this.f, this.g, this.h);
    }
}
