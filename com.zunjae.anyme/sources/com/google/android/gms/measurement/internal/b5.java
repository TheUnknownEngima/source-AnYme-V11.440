package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import defpackage.js0;
import defpackage.ks0;
import java.util.ArrayList;
import java.util.Map;

public final class b5 extends u9 implements b {
    private static int j = 65535;
    private static int k = 2;
    private final Map<String, Map<String, String>> d = new b0();
    private final Map<String, Map<String, Boolean>> e = new b0();
    private final Map<String, Map<String, Boolean>> f = new b0();
    private final Map<String, ks0> g = new b0();
    private final Map<String, Map<String, Integer>> h = new b0();
    private final Map<String, String> i = new b0();

    b5(x9 x9Var) {
        super(x9Var);
    }

    private final void J(String str) {
        r();
        b();
        r.f(str);
        if (this.g.get(str) == null) {
            byte[] q0 = m().q0(str);
            if (q0 == null) {
                this.d.put(str, (Object) null);
                this.e.put(str, (Object) null);
                this.f.put(str, (Object) null);
                this.g.put(str, (Object) null);
                this.i.put(str, (Object) null);
                this.h.put(str, (Object) null);
                return;
            }
            ks0.a aVar = (ks0.a) v(str, q0).w();
            x(str, aVar);
            this.d.put(str, w((ks0) ((sy0) aVar.k())));
            this.g.put(str, (ks0) ((sy0) aVar.k()));
            this.i.put(str, (Object) null);
        }
    }

    private final ks0 v(String str, byte[] bArr) {
        if (bArr == null) {
            return ks0.P();
        }
        try {
            ks0.a O = ks0.O();
            ba.z(O, bArr);
            ks0 ks0 = (ks0) ((sy0) O.k());
            e4 M = h().M();
            String str2 = null;
            Long valueOf = ks0.F() ? Long.valueOf(ks0.G()) : null;
            if (ks0.H()) {
                str2 = ks0.I();
            }
            M.c("Parsed config. version, gmp_app_id", valueOf, str2);
            return ks0;
        } catch (ez0 | RuntimeException e2) {
            h().H().c("Unable to merge remote config. appId", c4.w(str), e2);
            return ks0.P();
        }
    }

    private static Map<String, String> w(ks0 ks0) {
        b0 b0Var = new b0();
        if (ks0 != null) {
            for (ls0 next : ks0.K()) {
                b0Var.put(next.A(), next.B());
            }
        }
        return b0Var;
    }

    private final void x(String str, ks0.a aVar) {
        b0 b0Var = new b0();
        b0 b0Var2 = new b0();
        b0 b0Var3 = new b0();
        if (aVar != null) {
            for (int i2 = 0; i2 < aVar.w(); i2++) {
                js0.a aVar2 = (js0.a) aVar.x(i2).w();
                if (TextUtils.isEmpty(aVar2.x())) {
                    h().H().a("EventConfig contained null event name");
                } else {
                    String x = aVar2.x();
                    String b = e6.b(aVar2.x());
                    if (!TextUtils.isEmpty(b)) {
                        aVar2.w(b);
                        aVar.y(i2, aVar2);
                    }
                    if (!j21.a() || !j().s(u.U0)) {
                        x = aVar2.x();
                    }
                    b0Var.put(x, Boolean.valueOf(aVar2.y()));
                    b0Var2.put(aVar2.x(), Boolean.valueOf(aVar2.A()));
                    if (aVar2.B()) {
                        if (aVar2.C() < k || aVar2.C() > j) {
                            h().H().c("Invalid sampling rate. Event name, sample rate", aVar2.x(), Integer.valueOf(aVar2.C()));
                        } else {
                            b0Var3.put(aVar2.x(), Integer.valueOf(aVar2.C()));
                        }
                    }
                }
            }
        }
        this.e.put(str, b0Var);
        this.f.put(str, b0Var2);
        this.h.put(str, b0Var3);
    }

    /* access modifiers changed from: package-private */
    public final boolean A(String str, String str2) {
        Boolean bool;
        b();
        J(str);
        if (H(str) && fa.C0(str2)) {
            return true;
        }
        if (I(str) && fa.d0(str2)) {
            return true;
        }
        Map map = this.e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public final void B(String str) {
        b();
        this.i.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final boolean C(String str, String str2) {
        Boolean bool;
        b();
        J(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        if (i31.a() && j().s(u.D0) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map map = this.f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final int D(String str, String str2) {
        Integer num;
        b();
        J(str);
        Map map = this.h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public final void E(String str) {
        b();
        this.g.remove(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean F(String str) {
        b();
        ks0 u = u(str);
        if (u == null) {
            return false;
        }
        return u.N();
    }

    /* access modifiers changed from: package-private */
    public final long G(String str) {
        String e2 = e(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(e2)) {
            return 0;
        }
        try {
            return Long.parseLong(e2);
        } catch (NumberFormatException e3) {
            h().H().c("Unable to parse timezone offset. appId", c4.w(str), e3);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean H(String str) {
        return "1".equals(e(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean I(String str) {
        return "1".equals(e(str, "measurement.upload.blacklist_public"));
    }

    public final String e(String str, String str2) {
        b();
        J(str);
        Map map = this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final ks0 u(String str) {
        r();
        b();
        r.f(str);
        J(str);
        return this.g.get(str);
    }

    /* access modifiers changed from: protected */
    public final boolean y(String str, byte[] bArr, String str2) {
        r();
        b();
        r.f(str);
        ks0.a aVar = (ks0.a) v(str, bArr).w();
        if (aVar == null) {
            return false;
        }
        x(str, aVar);
        this.g.put(str, (ks0) ((sy0) aVar.k()));
        this.i.put(str, str2);
        this.d.put(str, w((ks0) ((sy0) aVar.k())));
        m().P(str, new ArrayList(aVar.A()));
        try {
            aVar.B();
            bArr = ((ks0) ((sy0) aVar.k())).h();
        } catch (RuntimeException e2) {
            h().H().c("Unable to serialize reduced-size config. Storing full config instead. appId", c4.w(str), e2);
        }
        d m = m();
        r.f(str);
        m.b();
        m.r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) m.v().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                m.h().E().b("Failed to update remote config (got 0). appId", c4.w(str));
            }
        } catch (SQLiteException e3) {
            m.h().E().c("Error storing remote config. appId", c4.w(str), e3);
        }
        this.g.put(str, (ks0) ((sy0) aVar.k()));
        return true;
    }

    /* access modifiers changed from: protected */
    public final String z(String str) {
        b();
        return this.i.get(str);
    }
}
