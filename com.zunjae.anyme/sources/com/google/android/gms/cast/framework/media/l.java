package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.i;
import com.google.android.gms.cast.o;
import org.json.JSONObject;

final class l extends i.h {
    private final /* synthetic */ JSONObject q;
    private final /* synthetic */ i r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    l(i iVar, JSONObject jSONObject) {
        super(iVar);
        this.r = iVar;
        this.q = jSONObject;
    }

    /* access modifiers changed from: protected */
    public final void n() {
        this.r.c.v(this.n, 0, -1, (o[]) null, 1, (Integer) null, this.q);
    }
}
