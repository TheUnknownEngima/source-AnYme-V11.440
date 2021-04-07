package androidx.mediarouter.media;

import android.os.Bundle;

public final class c {
    private final Bundle a;
    private g b;

    private c(Bundle bundle) {
        this.a = bundle;
    }

    public c(g gVar, boolean z) {
        if (gVar != null) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            this.b = gVar;
            bundle.putBundle("selector", gVar.a());
            this.a.putBoolean("activeScan", z);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    private void b() {
        if (this.b == null) {
            g d = g.d(this.a.getBundle("selector"));
            this.b = d;
            if (d == null) {
                this.b = g.c;
            }
        }
    }

    public static c c(Bundle bundle) {
        if (bundle != null) {
            return new c(bundle);
        }
        return null;
    }

    public Bundle a() {
        return this.a;
    }

    public g d() {
        b();
        return this.b;
    }

    public boolean e() {
        return this.a.getBoolean("activeScan");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return d().equals(cVar.d()) && e() == cVar.e();
    }

    public boolean f() {
        b();
        return this.b.g();
    }

    public int hashCode() {
        return d().hashCode() ^ e() ? 1 : 0;
    }

    public String toString() {
        return "DiscoveryRequest{ selector=" + d() + ", activeScan=" + e() + ", isValid=" + f() + " }";
    }
}
