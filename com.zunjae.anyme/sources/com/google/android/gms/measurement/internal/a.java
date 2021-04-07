package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.r;
import java.util.Map;

public final class a extends d2 {
    private final Map<String, Long> b = new b0();
    private final Map<String, Integer> c = new b0();
    private long d;

    public a(h5 h5Var) {
        super(h5Var);
    }

    private final void A(String str, long j, u7 u7Var) {
        if (u7Var == null) {
            h().M().a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            h().M().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            t7.O(u7Var, bundle, true);
            p().X("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void B(long j) {
        for (String put : this.b.keySet()) {
            this.b.put(put, Long.valueOf(j));
        }
        if (!this.b.isEmpty()) {
            this.d = j;
        }
    }

    /* access modifiers changed from: private */
    public final void E(String str, long j) {
        b();
        r.f(str);
        if (this.c.isEmpty()) {
            this.d = j;
        }
        Integer num = this.c.get(str);
        if (num != null) {
            this.c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.c.size() >= 100) {
            h().H().a("Too many ads visible");
        } else {
            this.c.put(str, 1);
            this.b.put(str, Long.valueOf(j));
        }
    }

    /* access modifiers changed from: private */
    public final void F(String str, long j) {
        b();
        r.f(str);
        Integer num = this.c.get(str);
        if (num != null) {
            u7 D = s().D(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.c.remove(str);
                Long l = this.b.get(str);
                if (l == null) {
                    h().E().a("First ad unit exposure time was never set");
                } else {
                    this.b.remove(str);
                    A(str, j - l.longValue(), D);
                }
                if (this.c.isEmpty()) {
                    long j2 = this.d;
                    if (j2 == 0) {
                        h().E().a("First ad exposure time was never set");
                        return;
                    }
                    w(j - j2, D);
                    this.d = 0;
                    return;
                }
                return;
            }
            this.c.put(str, Integer.valueOf(intValue));
            return;
        }
        h().E().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void w(long j, u7 u7Var) {
        if (u7Var == null) {
            h().M().a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            h().M().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            t7.O(u7Var, bundle, true);
            p().X("am", "_xa", bundle);
        }
    }

    public final void D(String str, long j) {
        if (str == null || str.length() == 0) {
            h().E().a("Ad unit id must be a non-empty string");
        } else {
            f().y(new b0(this, str, j));
        }
    }

    public final void v(long j) {
        u7 D = s().D(false);
        for (String next : this.b.keySet()) {
            A(next, j - this.b.get(next).longValue(), D);
        }
        if (!this.b.isEmpty()) {
            w(j - this.d, D);
        }
        B(j);
    }

    public final void z(String str, long j) {
        if (str == null || str.length() == 0) {
            h().E().a("Ad unit id must be a non-empty string");
        } else {
            f().y(new c1(this, str, j));
        }
    }
}
