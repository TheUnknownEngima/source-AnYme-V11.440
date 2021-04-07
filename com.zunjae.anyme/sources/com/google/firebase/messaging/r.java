package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class r extends m80 {
    public static final Parcelable.Creator<r> CREATOR = new s();
    Bundle e;
    private b f;

    public static class b {
        private final String a;
        private final String b;

        private b(q qVar) {
            this.a = qVar.p("gcm.n.title");
            qVar.h("gcm.n.title");
            b(qVar, "gcm.n.title");
            this.b = qVar.p("gcm.n.body");
            qVar.h("gcm.n.body");
            b(qVar, "gcm.n.body");
            qVar.p("gcm.n.icon");
            qVar.o();
            qVar.p("gcm.n.tag");
            qVar.p("gcm.n.color");
            qVar.p("gcm.n.click_action");
            qVar.p("gcm.n.android_channel_id");
            qVar.f();
            qVar.p("gcm.n.image");
            qVar.p("gcm.n.ticker");
            qVar.b("gcm.n.notification_priority");
            qVar.b("gcm.n.visibility");
            qVar.b("gcm.n.notification_count");
            qVar.a("gcm.n.sticky");
            qVar.a("gcm.n.local_only");
            qVar.a("gcm.n.default_sound");
            qVar.a("gcm.n.default_vibrate_timings");
            qVar.a("gcm.n.default_light_settings");
            qVar.j("gcm.n.event_time");
            qVar.e();
            qVar.q();
        }

        private static String[] b(q qVar, String str) {
            Object[] g = qVar.g(str);
            if (g == null) {
                return null;
            }
            String[] strArr = new String[g.length];
            for (int i = 0; i < g.length; i++) {
                strArr[i] = String.valueOf(g[i]);
            }
            return strArr;
        }

        public String a() {
            return this.b;
        }

        public String c() {
            return this.a;
        }
    }

    public r(Bundle bundle) {
        this.e = bundle;
    }

    public final b i() {
        if (this.f == null && q.t(this.e)) {
            this.f = new b(new q(this.e));
        }
        return this.f;
    }

    public final Intent j() {
        Intent intent = new Intent();
        intent.putExtras(this.e);
        return intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        s.c(this, parcel, i);
    }
}
