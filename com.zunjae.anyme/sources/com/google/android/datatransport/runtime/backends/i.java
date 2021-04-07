package com.google.android.datatransport.runtime.backends;

import android.content.Context;

class i {
    private final Context a;
    private final kq b;
    private final kq c;

    i(Context context, kq kqVar, kq kqVar2) {
        this.a = context;
        this.b = kqVar;
        this.c = kqVar2;
    }

    /* access modifiers changed from: package-private */
    public h a(String str) {
        return h.a(this.a, this.b, this.c, str);
    }
}
