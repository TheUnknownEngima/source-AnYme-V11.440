package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.e;
import com.google.android.gms.cast.y;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: z70  reason: default package */
public final class z70 extends h<b70> {
    /* access modifiers changed from: private */
    public static final u60 U = new u60("CastClientImpl");
    /* access modifiers changed from: private */
    public static final Object V = new Object();
    private static final Object W = new Object();
    /* access modifiers changed from: private */
    public final CastDevice A;
    /* access modifiers changed from: private */
    public final e.c B;
    /* access modifiers changed from: private */
    public final Map<String, e.d> C = new HashMap();
    private final long D;
    private final Bundle E;
    private b80 F;
    /* access modifiers changed from: private */
    public String G;
    private boolean H;
    private boolean I;
    private boolean J;
    private double K;
    private y L;
    private int M;
    private int N;
    /* access modifiers changed from: private */
    public String O;
    /* access modifiers changed from: private */
    public String P;
    private Bundle Q;
    private final Map<Long, d<Status>> R;
    /* access modifiers changed from: private */
    public d<e.a> S;
    private d<Status> T;
    /* access modifiers changed from: private */
    public com.google.android.gms.cast.d z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z70(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, CastDevice castDevice, long j, e.c cVar, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 10, dVar, aVar, bVar);
        this.A = castDevice;
        this.B = cVar;
        this.D = j;
        this.E = bundle;
        new AtomicLong(0);
        this.R = new HashMap();
        F0();
        K0();
    }

    /* access modifiers changed from: private */
    public final void D0(int i) {
        synchronized (W) {
            if (this.T != null) {
                this.T.a(new Status(i));
                this.T = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void F0() {
        this.M = -1;
        this.N = -1;
        this.z = null;
        this.G = null;
        this.K = Utils.DOUBLE_EPSILON;
        K0();
        this.H = false;
        this.L = null;
    }

    private final void J0() {
        U.a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.C) {
            this.C.clear();
        }
    }

    private final double K0() {
        if (this.A.p(2048)) {
            return 0.02d;
        }
        return (!this.A.p(4) || this.A.p(1) || "Chromecast Audio".equals(this.A.n())) ? 0.05d : 0.02d;
    }

    /* access modifiers changed from: private */
    public final void q0(long j, int i) {
        d remove;
        synchronized (this.R) {
            remove = this.R.remove(Long.valueOf(j));
        }
        if (remove != null) {
            remove.a(new Status(i));
        }
    }

    /* access modifiers changed from: private */
    public final void r0(x60 x60) {
        boolean z2;
        String i = x60.i();
        if (!t60.f(i, this.G)) {
            this.G = i;
            z2 = true;
        } else {
            z2 = false;
        }
        U.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(this.I));
        if (this.B != null && (z2 || this.I)) {
            this.B.d();
        }
        this.I = false;
    }

    /* access modifiers changed from: private */
    public final void w0(j80 j80) {
        boolean z2;
        boolean z3;
        boolean z4;
        com.google.android.gms.cast.d d = j80.d();
        if (!t60.f(d, this.z)) {
            this.z = d;
            this.B.c(d);
        }
        double k = j80.k();
        if (Double.isNaN(k) || Math.abs(k - this.K) <= 1.0E-7d) {
            z2 = false;
        } else {
            this.K = k;
            z2 = true;
        }
        boolean l = j80.l();
        if (l != this.H) {
            this.H = l;
            z2 = true;
        }
        boolean isNaN = Double.isNaN(j80.n());
        U.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(this.J));
        if (this.B != null && (z2 || this.J)) {
            this.B.f();
        }
        int i = j80.i();
        if (i != this.M) {
            this.M = i;
            z3 = true;
        } else {
            z3 = false;
        }
        U.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(this.J));
        if (this.B != null && (z3 || this.J)) {
            this.B.a(this.M);
        }
        int j = j80.j();
        if (j != this.N) {
            this.N = j;
            z4 = true;
        } else {
            z4 = false;
        }
        U.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z4), Boolean.valueOf(this.J));
        if (this.B != null && (z4 || this.J)) {
            this.B.e(this.N);
        }
        if (!t60.f(this.L, j80.m())) {
            this.L = j80.m();
        }
        this.J = false;
    }

    public final void H(b bVar) {
        super.H(bVar);
        J0();
    }

    /* access modifiers changed from: protected */
    public final void J(int i, IBinder iBinder, Bundle bundle, int i2) {
        U.a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 2300) {
            this.I = true;
            this.J = true;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.Q = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.J(i, iBinder, bundle, i2);
    }

    public final void d() {
        U.a("disconnect(); ServiceListener=%s, isConnected=%b", this.F, Boolean.valueOf(y()));
        b80 b80 = this.F;
        this.F = null;
        if (b80 == null || b80.q3() == null) {
            U.a("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        J0();
        try {
            ((b70) D()).d();
        } catch (RemoteException | IllegalStateException e) {
            U.b(e, "Error while disconnecting the controller interface: %s", e.getMessage());
        } finally {
            super.d();
        }
    }

    /* access modifiers changed from: protected */
    public final String j() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof b70 ? (b70) queryLocalInterface : new a70(iBinder);
    }

    public final int m() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    public final String p() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public final Bundle w() {
        Bundle bundle = this.Q;
        if (bundle == null) {
            return super.w();
        }
        this.Q = null;
        return bundle;
    }

    public final void x0(int i) {
        synchronized (V) {
            if (this.S != null) {
                this.S.a(new c80(new Status(i)));
                this.S = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Bundle z() {
        Bundle bundle = new Bundle();
        U.a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.O, this.P);
        this.A.u(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.D);
        Bundle bundle2 = this.E;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.F = new b80(this);
        b80 b80 = this.F;
        b80.asBinder();
        bundle.putParcelable("listener", new BinderWrapper((IBinder) b80));
        String str = this.O;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.P;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }
}
