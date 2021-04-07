package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* renamed from: eb2  reason: default package */
public final class eb2 {
    final aa2 a;
    final Proxy b;
    final InetSocketAddress c;

    public eb2(aa2 aa2, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aa2 == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.a = aa2;
            this.b = proxy;
            this.c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public aa2 a() {
        return this.a;
    }

    public Proxy b() {
        return this.b;
    }

    public boolean c() {
        return this.a.i != null && this.b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof eb2) {
            eb2 eb2 = (eb2) obj;
            return eb2.a.equals(this.a) && eb2.b.equals(this.b) && eb2.c.equals(this.c);
        }
    }

    public int hashCode() {
        return ((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Route{" + this.c + "}";
    }
}
