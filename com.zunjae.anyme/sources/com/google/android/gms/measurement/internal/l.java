package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import java.util.Iterator;

public final class l {
    final String a;
    final String b;
    private final String c;
    final long d;
    final long e;
    final n f;

    l(h5 h5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        n nVar;
        r.f(str2);
        r.f(str3);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            h5Var.h().H().b("Event created with reverse previous/current timestamps. appId", c4.w(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            nVar = new n(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    h5Var.h().E().a("Param name can't be null");
                } else {
                    Object G = h5Var.G().G(str4, bundle2.get(str4));
                    if (G == null) {
                        h5Var.h().H().b("Param value can't be null", h5Var.H().y(str4));
                    } else {
                        h5Var.G().N(bundle2, str4, G);
                    }
                }
                it.remove();
            }
            nVar = new n(bundle2);
        }
        this.f = nVar;
    }

    private l(h5 h5Var, String str, String str2, String str3, long j, long j2, n nVar) {
        r.f(str2);
        r.f(str3);
        r.j(nVar);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            h5Var.h().H().c("Event created with reverse previous/current timestamps. appId, name", c4.w(str2), c4.w(str3));
        }
        this.f = nVar;
    }

    /* access modifiers changed from: package-private */
    public final l a(h5 h5Var, long j) {
        return new l(h5Var, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
