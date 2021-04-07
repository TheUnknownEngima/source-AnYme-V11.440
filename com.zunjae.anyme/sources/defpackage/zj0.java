package defpackage;

import android.os.Bundle;
import defpackage.bj0;
import defpackage.ti0;
import defpackage.ui0;
import defpackage.yi0;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zj0  reason: default package */
public final class zj0 {
    private static final u60 d = new u60("ApplicationAnalyticsUtils");
    private static final String e = ga0.a();
    private final String a;
    private final Map<Integer, Integer> b;
    private final Map<Integer, Integer> c;

    public zj0(Bundle bundle, String str) {
        this.a = str;
        this.b = d(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.c = d(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    private static Map<Integer, Integer> d(Bundle bundle, String str) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return dc0.a();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((Integer) entry.getKey(), (Integer) entry.getValue());
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private static void e(yi0.a aVar, boolean z) {
        ui0.a u = ui0.u(aVar.y());
        u.w(z);
        aVar.t(u);
    }

    private final yi0.a h(zk0 zk0) {
        yi0.a K = yi0.K();
        K.A(zk0.c);
        int i = zk0.d;
        zk0.d = i + 1;
        K.u(i);
        String str = zk0.b;
        if (str != null) {
            K.w(str);
        }
        ti0.a y = ti0.y();
        y.t(e);
        y.s(this.a);
        K.x((ti0) ((cl0) y.N()));
        ui0.a D = ui0.D();
        if (zk0.a != null) {
            bj0.a w = bj0.w();
            w.s(zk0.a);
            D.s((bj0) ((cl0) w.N()));
        }
        D.w(false);
        String str2 = zk0.e;
        if (str2 != null) {
            D.v(i(str2));
        }
        K.t(D);
        return K;
    }

    private static long i(String str) {
        try {
            String replace = str.replace("-", "");
            return new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
        } catch (NumberFormatException e2) {
            d.g("receiverSessionId %s is not valid for hash: %s", str, e2.getMessage());
            return 0;
        }
    }

    public final yi0 a(zk0 zk0) {
        return (yi0) ((cl0) h(zk0).N());
    }

    public final yi0 b(zk0 zk0, int i) {
        yi0.a h = h(zk0);
        ui0.a u = ui0.u(h.y());
        Map<Integer, Integer> map = this.c;
        u.t((map == null || !map.containsKey(Integer.valueOf(i))) ? i + 10000 : this.c.get(Integer.valueOf(i)).intValue());
        h.t(u);
        return (yi0) ((cl0) h.N());
    }

    public final yi0 c(zk0 zk0, boolean z) {
        yi0.a h = h(zk0);
        e(h, z);
        return (yi0) ((cl0) h.N());
    }

    public final yi0 f(zk0 zk0) {
        yi0.a h = h(zk0);
        e(h, true);
        ui0.a u = ui0.u(h.y());
        u.t(rd0.APP_SESSION_RESUMED_FROM_SAVED_SESSION.zzgj());
        h.t(u);
        return (yi0) ((cl0) h.N());
    }

    public final yi0 g(zk0 zk0, int i) {
        yi0.a h = h(zk0);
        ui0.a u = ui0.u(h.y());
        u.t((i == 0 ? rd0.APP_SESSION_CASTING_STOPPED : rd0.APP_SESSION_REASON_ERROR).zzgj());
        Map<Integer, Integer> map = this.b;
        u.u((map == null || !map.containsKey(Integer.valueOf(i))) ? i + 10000 : this.b.get(Integer.valueOf(i)).intValue());
        h.t(u);
        return (yi0) ((cl0) h.N());
    }
}
