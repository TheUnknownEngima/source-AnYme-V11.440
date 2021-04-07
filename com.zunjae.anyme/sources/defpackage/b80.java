package defpackage;

import android.os.Handler;
import com.google.android.gms.cast.d;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b80  reason: default package */
final class b80 extends c70 {
    private final AtomicReference<z70> a;
    private final Handler b;

    public b80(z70 z70) {
        this.a = new AtomicReference<>(z70);
        this.b = new mb0(z70.B());
    }

    public final void A2(String str, String str2) {
        z70 z70 = this.a.get();
        if (z70 != null) {
            z70.U.a("Receive (type=text, ns=%s) %s", str, str2);
            this.b.post(new f80(this, z70, str, str2));
        }
    }

    public final void E2(j80 j80) {
        z70 z70 = this.a.get();
        if (z70 != null) {
            z70.U.a("onDeviceStatusChanged", new Object[0]);
            this.b.post(new d80(this, z70, j80));
        }
    }

    public final void H0(int i) {
    }

    public final void K(int i) {
        z70 z70 = this.a.get();
        if (z70 != null) {
            z70.x0(i);
        }
    }

    public final void Q2(int i) {
    }

    public final void U(String str, double d, boolean z) {
        z70.U.a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    public final void U0(String str, long j, int i) {
        z70 z70 = this.a.get();
        if (z70 != null) {
            z70.q0(j, i);
        }
    }

    public final void U1(int i) {
        z70 z70 = this.a.get();
        if (z70 != null) {
            z70.D0(i);
        }
    }

    public final void U2(int i) {
        z70 z70 = this.a.get();
        if (z70 != null) {
            String unused = z70.O = null;
            String unused2 = z70.P = null;
            z70.D0(i);
            if (z70.B != null) {
                this.b.post(new e80(this, z70, i));
            }
        }
    }

    public final void Y1(String str, byte[] bArr) {
        if (this.a.get() != null) {
            z70.U.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
        }
    }

    public final void Z(x60 x60) {
        z70 z70 = this.a.get();
        if (z70 != null) {
            z70.U.a("onApplicationStatusChanged", new Object[0]);
            this.b.post(new g80(this, z70, x60));
        }
    }

    public final void d3(String str, long j) {
        z70 z70 = this.a.get();
        if (z70 != null) {
            z70.q0(j, 0);
        }
    }

    public final void e(int i) {
        z70 q3 = q3();
        if (q3 != null) {
            z70.U.a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
            if (i != 0) {
                q3.M(2);
            }
        }
    }

    public final void m2(int i) {
        z70 z70 = this.a.get();
        if (z70 != null) {
            z70.D0(i);
        }
    }

    public final z70 q3() {
        z70 andSet = this.a.getAndSet((Object) null);
        if (andSet == null) {
            return null;
        }
        andSet.F0();
        return andSet;
    }

    public final void w(d dVar, String str, String str2, boolean z) {
        z70 z70 = this.a.get();
        if (z70 != null) {
            d unused = z70.z = dVar;
            String unused2 = z70.O = dVar.i();
            String unused3 = z70.P = str2;
            String unused4 = z70.G = str;
            synchronized (z70.V) {
                if (z70.S != null) {
                    z70.S.a(new c80(new Status(0), dVar, str, str2, z));
                    com.google.android.gms.common.api.internal.d unused5 = z70.S = null;
                }
            }
        }
    }
}
