package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.util.o;

public final class e {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    private e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        r.n(!o.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static e a(Context context) {
        x xVar = new x(context);
        String a2 = xVar.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new e(a2, xVar.a("google_api_key"), xVar.a("firebase_database_url"), xVar.a("ga_trackingId"), xVar.a("gcm_defaultSenderId"), xVar.a("google_storage_bucket"), xVar.a("project_id"));
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return q.a(this.b, eVar.b) && q.a(this.a, eVar.a) && q.a(this.c, eVar.c) && q.a(this.d, eVar.d) && q.a(this.e, eVar.e) && q.a(this.f, eVar.f) && q.a(this.g, eVar.g);
    }

    public int hashCode() {
        return q.b(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        q.a c2 = q.c(this);
        c2.a("applicationId", this.b);
        c2.a("apiKey", this.a);
        c2.a("databaseUrl", this.c);
        c2.a("gcmSenderId", this.e);
        c2.a("storageBucket", this.f);
        c2.a("projectId", this.g);
        return c2.toString();
    }
}
