package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.c;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.m;

public class p {
    private static final bh1 a;

    static {
        mh1 mh1 = new mh1();
        mh1.l(m.b.class, new m.c());
        mh1.l(m.class, new m.a());
        a = mh1.f();
    }

    public static boolean A(Intent intent) {
        if (intent == null || s(intent)) {
            return false;
        }
        return a();
    }

    public static boolean B(Intent intent) {
        if (intent == null || s(intent)) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a() {
        /*
            java.lang.String r0 = "delivery_metrics_exported_to_big_query_enabled"
            r1 = 0
            com.google.firebase.c.h()     // Catch:{ IllegalStateException -> 0x0046 }
            com.google.firebase.c r2 = com.google.firebase.c.h()
            android.content.Context r2 = r2.g()
            java.lang.String r3 = "com.google.firebase.messaging"
            android.content.SharedPreferences r3 = r2.getSharedPreferences(r3, r1)
            java.lang.String r4 = "export_to_big_query"
            boolean r5 = r3.contains(r4)
            if (r5 == 0) goto L_0x0021
            boolean r0 = r3.getBoolean(r4, r1)
            return r0
        L_0x0021:
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{  }
            if (r3 == 0) goto L_0x0046
            java.lang.String r2 = r2.getPackageName()     // Catch:{  }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch:{  }
            if (r2 == 0) goto L_0x0046
            android.os.Bundle r3 = r2.metaData     // Catch:{  }
            if (r3 == 0) goto L_0x0046
            android.os.Bundle r3 = r2.metaData     // Catch:{  }
            boolean r3 = r3.containsKey(r0)     // Catch:{  }
            if (r3 == 0) goto L_0x0046
            android.os.Bundle r2 = r2.metaData     // Catch:{  }
            boolean r0 = r2.getBoolean(r0, r1)     // Catch:{  }
            return r0
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.p.a():boolean");
    }

    static String b(Intent intent) {
        return intent.getStringExtra("collapse_key");
    }

    static String c(Intent intent) {
        return intent.getStringExtra("google.c.a.c_id");
    }

    static String d(Intent intent) {
        return intent.getStringExtra("google.c.a.c_l");
    }

    static String e() {
        return FirebaseInstanceId.getInstance(c.h()).j();
    }

    static String f(Intent intent) {
        return intent.getStringExtra("google.c.a.m_c");
    }

    static String g(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    static String h(Intent intent) {
        return intent.getStringExtra("google.c.a.m_l");
    }

    private static int i(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    static String j(Intent intent) {
        return intent.getStringExtra("google.c.a.ts");
    }

    static String k(Intent intent) {
        return (intent.getExtras() == null || !q.t(intent.getExtras())) ? "DATA_MESSAGE" : "DISPLAY_NOTIFICATION";
    }

    static String l(Intent intent) {
        return (intent.getExtras() == null || !q.t(intent.getExtras())) ? "data" : "display";
    }

    static String m() {
        return c.h().g().getPackageName();
    }

    static int n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if ("1".equals(intent.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = intent.getStringExtra("google.priority");
        }
        return i(stringExtra);
    }

    static String o() {
        c h = c.h();
        String d = h.j().d();
        if (d != null) {
            return d;
        }
        String c = h.j().c();
        if (!c.startsWith("1:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    static String p(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    static int q(Intent intent) {
        Object obj = intent.getExtras().get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(valueOf);
            sb.toString();
            return 0;
        }
    }

    static String r(Intent intent) {
        if (intent.hasExtra("google.c.a.udt")) {
            return intent.getStringExtra("google.c.a.udt");
        }
        return null;
    }

    private static boolean s(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static void t(Intent intent) {
        y("_nd", intent);
    }

    public static void u(Intent intent) {
        y("_nf", intent);
    }

    public static void v(Intent intent) {
        z(intent);
        y("_no", intent);
    }

    public static void w(Intent intent, zm<String> zmVar) {
        y("_nr", intent);
        if (zmVar != null) {
            x("MESSAGE_DELIVERED", intent, zmVar);
        }
    }

    private static void x(String str, Intent intent, zm<String> zmVar) {
        try {
            zmVar.a(wm.f(a.b(new m.b(new m(str, intent)))));
        } catch (ch1 unused) {
        }
    }

    static void y(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String c = c(intent);
        if (c != null) {
            bundle.putString("_nmid", c);
        }
        String d = d(intent);
        if (d != null) {
            bundle.putString("_nmn", d);
        }
        String h = h(intent);
        if (!TextUtils.isEmpty(h)) {
            bundle.putString("label", h);
        }
        String f = f(intent);
        if (!TextUtils.isEmpty(f)) {
            bundle.putString("message_channel", f);
        }
        String p = p(intent);
        if (p != null) {
            bundle.putString("_nt", p);
        }
        String j = j(intent);
        if (j != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(j));
            } catch (NumberFormatException unused) {
            }
        }
        String r = r(intent);
        if (r != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(r));
            } catch (NumberFormatException unused2) {
            }
        }
        String l = l(intent);
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", l);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(valueOf).length());
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(valueOf);
            sb.toString();
        }
        eb1 eb1 = (eb1) c.h().f(eb1.class);
        if (eb1 != null) {
            eb1.c("fcm", str, bundle);
        }
    }

    private static void z(Intent intent) {
        if (intent != null) {
            if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                eb1 eb1 = (eb1) c.h().f(eb1.class);
                boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
                if (eb1 != null) {
                    String stringExtra = intent.getStringExtra("google.c.a.c_id");
                    eb1.f("fcm", "_ln", stringExtra);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "Firebase");
                    bundle.putString("medium", "notification");
                    bundle.putString("campaign", stringExtra);
                    eb1.c("fcm", "_cmp", bundle);
                    return;
                }
                return;
            }
            boolean isLoggable2 = Log.isLoggable("FirebaseMessaging", 3);
        }
    }
}
