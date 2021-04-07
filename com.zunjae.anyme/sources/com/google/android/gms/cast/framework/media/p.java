package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.i;
import org.json.JSONObject;

final class p extends i.h {
    private final /* synthetic */ JSONObject q;
    private final /* synthetic */ i r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    p(i iVar, JSONObject jSONObject) {
        super(iVar);
        this.r = iVar;
        this.q = jSONObject;
    }

    /* access modifiers changed from: protected */
    public final void n() {
        this.r.c.x(this.n, this.q);
    }
}
