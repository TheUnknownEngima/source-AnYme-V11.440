package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.framework.media.i;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

final class v implements o70 {
    private final /* synthetic */ i.h a;

    v(i.h hVar, i iVar) {
        this.a = hVar;
    }

    public final void a(long j) {
        try {
            this.a.g((i.c) this.a.c(new Status(2103)));
        } catch (IllegalStateException unused) {
        }
    }

    public final void b(long j, int i, Object obj) {
        MediaError mediaError = null;
        m70 m70 = obj instanceof m70 ? (m70) obj : null;
        try {
            i.h hVar = this.a;
            Status status = new Status(i);
            JSONObject jSONObject = m70 != null ? m70.a : null;
            if (m70 != null) {
                mediaError = m70.b;
            }
            hVar.g(new i.C0086i(status, jSONObject, mediaError));
        } catch (IllegalStateException unused) {
        }
    }
}
