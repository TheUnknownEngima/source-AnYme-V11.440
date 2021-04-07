package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: vb2  reason: default package */
public final class vb2 {
    private final aa2 a;
    private final tb2 b;
    private final ea2 c;
    private final pa2 d;
    private List<Proxy> e = Collections.emptyList();
    private int f;
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<eb2> h = new ArrayList();

    /* renamed from: vb2$a */
    public static final class a {
        private final List<eb2> a;
        private int b = 0;

        a(List<eb2> list) {
            this.a = list;
        }

        public List<eb2> a() {
            return new ArrayList(this.a);
        }

        public boolean b() {
            return this.b < this.a.size();
        }

        public eb2 c() {
            if (b()) {
                List<eb2> list = this.a;
                int i = this.b;
                this.b = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public vb2(aa2 aa2, tb2 tb2, ea2 ea2, pa2 pa2) {
        this.a = aa2;
        this.b = tb2;
        this.c = ea2;
        this.d = pa2;
        h(aa2.l(), aa2.g());
    }

    static String b(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    private boolean d() {
        return this.f < this.e.size();
    }

    private Proxy f() {
        if (d()) {
            List<Proxy> list = this.e;
            int i = this.f;
            this.f = i + 1;
            Proxy proxy = list.get(i);
            g(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.a.l().m() + "; exhausted proxy configurations: " + this.e);
    }

    private void g(Proxy proxy) {
        String str;
        int i;
        this.g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.a.l().m();
            i = this.a.l().z();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = b(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i < 1 || i > 65535) {
            throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.d.j(this.c, str);
            List<InetAddress> a2 = this.a.c().a(str);
            if (!a2.isEmpty()) {
                this.d.i(this.c, str, a2);
                int size = a2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.g.add(new InetSocketAddress(a2.get(i2), i));
                }
                return;
            }
            throw new UnknownHostException(this.a.c() + " returned no addresses for " + str);
        }
    }

    private void h(ta2 ta2, Proxy proxy) {
        List<Proxy> u;
        if (proxy != null) {
            u = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.a.i().select(ta2.F());
            if (select == null || select.isEmpty()) {
                u = ib2.u(Proxy.NO_PROXY);
            } else {
                u = ib2.t(select);
            }
        }
        this.e = u;
        this.f = 0;
    }

    public void a(eb2 eb2, IOException iOException) {
        if (!(eb2.b().type() == Proxy.Type.DIRECT || this.a.i() == null)) {
            this.a.i().connectFailed(this.a.l().F(), eb2.b().address(), iOException);
        }
        this.b.b(eb2);
    }

    public boolean c() {
        return d() || !this.h.isEmpty();
    }

    public a e() {
        if (c()) {
            ArrayList arrayList = new ArrayList();
            while (d()) {
                Proxy f2 = f();
                int size = this.g.size();
                for (int i = 0; i < size; i++) {
                    eb2 eb2 = new eb2(this.a, f2, this.g.get(i));
                    if (this.b.c(eb2)) {
                        this.h.add(eb2);
                    } else {
                        arrayList.add(eb2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.h);
                this.h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
