package defpackage;

import androidx.core.app.h;
import java.util.ArrayList;

/* renamed from: h12  reason: default package */
public final class h12 {
    private final c12 a;
    private final z02 b;
    private final b12 c;
    private final a12 d;
    private final d12 e;
    private final ArrayList<h.a> f;

    public h12(c12 c12, z02 z02, b12 b12, a12 a12, d12 d12, ArrayList<h.a> arrayList) {
        v62.f(c12, "meta");
        v62.f(z02, "alerting");
        v62.f(b12, "header");
        v62.f(a12, "content");
        this.a = c12;
        this.b = z02;
        this.c = b12;
        this.d = a12;
        this.e = d12;
        this.f = arrayList;
    }

    public final ArrayList<h.a> a() {
        return this.f;
    }

    public final z02 b() {
        return this.b;
    }

    public final a12 c() {
        return this.d;
    }

    public final b12 d() {
        return this.c;
    }

    public final c12 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h12)) {
            return false;
        }
        h12 h12 = (h12) obj;
        return v62.a(this.a, h12.a) && v62.a(this.b, h12.b) && v62.a(this.c, h12.c) && v62.a(this.d, h12.d) && v62.a(this.e, h12.e) && v62.a(this.f, h12.f);
    }

    public final d12 f() {
        return this.e;
    }

    public int hashCode() {
        c12 c12 = this.a;
        int i = 0;
        int hashCode = (c12 != null ? c12.hashCode() : 0) * 31;
        z02 z02 = this.b;
        int hashCode2 = (hashCode + (z02 != null ? z02.hashCode() : 0)) * 31;
        b12 b12 = this.c;
        int hashCode3 = (hashCode2 + (b12 != null ? b12.hashCode() : 0)) * 31;
        a12 a12 = this.d;
        int hashCode4 = (hashCode3 + (a12 != null ? a12.hashCode() : 0)) * 31;
        d12 d12 = this.e;
        int hashCode5 = (hashCode4 + (d12 != null ? d12.hashCode() : 0)) * 31;
        ArrayList<h.a> arrayList = this.f;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "RawNotification(meta=" + this.a + ", alerting=" + this.b + ", header=" + this.c + ", content=" + this.d + ", stackable=" + this.e + ", actions=" + this.f + ")";
    }
}
