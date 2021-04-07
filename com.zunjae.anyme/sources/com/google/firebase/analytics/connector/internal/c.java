package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.b;
import com.google.android.gms.measurement.internal.e6;
import com.google.android.gms.measurement.internal.f6;
import com.google.android.gms.measurement.internal.h6;
import com.google.android.gms.measurement.internal.r7;
import defpackage.eb1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class c {
    private static final Set<String> a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));
    private static final List<String> b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});
    private static final List<String> c = Arrays.asList(new String[]{"auto", "app", "am"});
    private static final List<String> d = Arrays.asList(new String[]{"_r", "_dbg"});
    private static final List<String> e = Arrays.asList((String[]) b.a(h6.a, h6.b));
    private static final List<String> f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    public static eb1.c a(Bundle bundle) {
        Class cls = Long.class;
        Class cls2 = String.class;
        r.j(bundle);
        eb1.c cVar = new eb1.c();
        cVar.a = (String) f6.a(bundle, "origin", cls2, null);
        cVar.b = (String) f6.a(bundle, "name", cls2, null);
        cVar.c = f6.a(bundle, "value", Object.class, null);
        cVar.d = (String) f6.a(bundle, "trigger_event_name", cls2, null);
        cVar.e = ((Long) f6.a(bundle, "trigger_timeout", cls, 0L)).longValue();
        cVar.f = (String) f6.a(bundle, "timed_out_event_name", cls2, null);
        cVar.g = (Bundle) f6.a(bundle, "timed_out_event_params", Bundle.class, null);
        cVar.h = (String) f6.a(bundle, "triggered_event_name", cls2, null);
        cVar.i = (Bundle) f6.a(bundle, "triggered_event_params", Bundle.class, null);
        cVar.j = ((Long) f6.a(bundle, "time_to_live", cls, 0L)).longValue();
        cVar.k = (String) f6.a(bundle, "expired_event_name", cls2, null);
        cVar.l = (Bundle) f6.a(bundle, "expired_event_params", Bundle.class, null);
        cVar.n = ((Boolean) f6.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.m = ((Long) f6.a(bundle, "creation_timestamp", cls, 0L)).longValue();
        cVar.o = ((Long) f6.a(bundle, "triggered_timestamp", cls, 0L)).longValue();
        return cVar;
    }

    public static boolean b(eb1.c cVar) {
        String str;
        if (cVar == null || (str = cVar.a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.c;
        if ((obj != null && r7.a(obj) == null) || !c(str) || !e(str, cVar.b)) {
            return false;
        }
        String str2 = cVar.k;
        if (str2 != null && (!d(str2, cVar.l) || !f(str, cVar.k, cVar.l))) {
            return false;
        }
        String str3 = cVar.h;
        if (str3 != null && (!d(str3, cVar.i) || !f(str, cVar.h, cVar.i))) {
            return false;
        }
        String str4 = cVar.f;
        if (str4 != null) {
            return d(str4, cVar.g) && f(str, cVar.f, cVar.g);
        }
        return true;
    }

    public static boolean c(String str) {
        return !c.contains(str);
    }

    public static boolean d(String str, Bundle bundle) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String containsKey : d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (e.contains(str2)) {
            return false;
        }
        for (String matches : f) {
            if (str2.matches(matches)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(String str, String str2, Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!c(str) || bundle == null) {
            return false;
        }
        for (String containsKey : d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c2 = 2;
                }
            } else if (str.equals("fdl")) {
                c2 = 1;
            }
        } else if (str.equals("fcm")) {
            c2 = 0;
        }
        if (c2 == 0) {
            str3 = "fcm_integration";
        } else if (c2 == 1) {
            str3 = "fdl_integration";
        } else if (c2 != 2) {
            return false;
        } else {
            str3 = "fiam_integration";
        }
        bundle.putString("_cis", str3);
        return true;
    }

    public static Bundle g(eb1.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = cVar.b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = cVar.c;
        if (obj != null) {
            f6.b(bundle, obj);
        }
        String str3 = cVar.d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", cVar.e);
        String str4 = cVar.f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = cVar.g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = cVar.h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = cVar.i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", cVar.j);
        String str6 = cVar.k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = cVar.l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", cVar.m);
        bundle.putBoolean("active", cVar.n);
        bundle.putLong("triggered_timestamp", cVar.o);
        return bundle;
    }

    public static void h(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }

    public static boolean i(String str) {
        return !a.contains(str);
    }

    public static String j(String str) {
        String a2 = e6.a(str);
        return a2 != null ? a2 : str;
    }
}
