package defpackage;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.q;

/* renamed from: g71  reason: default package */
public final class g71 implements a.d {
    public static final g71 j = new g71(false, false, (String) null, false, (String) null, (String) null, false, (Long) null, (Long) null);
    private final boolean a = false;
    private final boolean b = false;
    private final String c = null;
    private final boolean d = false;
    private final String e = null;
    private final String f = null;
    private final boolean g = false;
    private final Long h = null;
    private final Long i = null;

    private g71(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2) {
    }

    public final Long b() {
        return this.h;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f;
    }

    public final Long e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g71)) {
            return false;
        }
        g71 g71 = (g71) obj;
        return this.a == g71.a && this.b == g71.b && q.a(this.c, g71.c) && this.d == g71.d && this.g == g71.g && q.a(this.e, g71.e) && q.a(this.f, g71.f) && q.a(this.h, g71.h) && q.a(this.i, g71.i);
    }

    public final String f() {
        return this.c;
    }

    public final boolean g() {
        return this.d;
    }

    public final boolean h() {
        return this.b;
    }

    public final int hashCode() {
        return q.b(Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.g), this.e, this.f, this.h, this.i);
    }

    public final boolean i() {
        return this.a;
    }

    public final boolean j() {
        return this.g;
    }
}
