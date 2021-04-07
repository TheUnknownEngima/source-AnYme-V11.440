package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;

@DynamiteApi
public class AppMeasurementDynamiteService extends y61 {
    h5 a = null;
    private Map<Integer, j6> b = new b0();

    class a implements j6 {
        private pq0 a;

        a(pq0 pq0) {
            this.a = pq0;
        }

        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.V1(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.a.h().H().b("Event listener threw exception", e);
            }
        }
    }

    class b implements k6 {
        private pq0 a;

        b(pq0 pq0) {
            this.a = pq0;
        }

        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.V1(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.a.h().H().b("Event interceptor threw exception", e);
            }
        }
    }

    private final void q3() {
        if (this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void r3(a71 a71, String str) {
        this.a.G().R(a71, str);
    }

    public void beginAdUnitExposure(String str, long j) {
        q3();
        this.a.S().z(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        q3();
        this.a.F().y0(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) {
        q3();
        this.a.F().R((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j) {
        q3();
        this.a.S().D(str, j);
    }

    public void generateEventId(a71 a71) {
        q3();
        this.a.G().P(a71, this.a.G().E0());
    }

    public void getAppInstanceId(a71 a71) {
        q3();
        this.a.f().y(new g6(this, a71));
    }

    public void getCachedAppInstanceId(a71 a71) {
        q3();
        r3(a71, this.a.F().j0());
    }

    public void getConditionalUserProperties(String str, String str2, a71 a71) {
        q3();
        this.a.f().y(new ia(this, a71, str, str2));
    }

    public void getCurrentScreenClass(a71 a71) {
        q3();
        r3(a71, this.a.F().m0());
    }

    public void getCurrentScreenName(a71 a71) {
        q3();
        r3(a71, this.a.F().l0());
    }

    public void getGmpAppId(a71 a71) {
        q3();
        r3(a71, this.a.F().n0());
    }

    public void getMaxUserProperties(String str, a71 a71) {
        q3();
        this.a.F();
        r.f(str);
        this.a.G().O(a71, 25);
    }

    public void getTestFlag(a71 a71, int i) {
        q3();
        if (i == 0) {
            this.a.G().R(a71, this.a.F().f0());
        } else if (i == 1) {
            this.a.G().P(a71, this.a.F().g0().longValue());
        } else if (i == 2) {
            fa G = this.a.G();
            double doubleValue = this.a.F().i0().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                a71.p(bundle);
            } catch (RemoteException e) {
                G.a.h().H().b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.a.G().O(a71, this.a.F().h0().intValue());
        } else if (i == 4) {
            this.a.G().T(a71, this.a.F().e0().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, a71 a71) {
        q3();
        this.a.f().y(new g7(this, a71, str, str2, z));
    }

    public void initForTests(Map map) {
        q3();
    }

    public void initialize(w80 w80, sq0 sq0, long j) {
        Context context = (Context) x80.r3(w80);
        h5 h5Var = this.a;
        if (h5Var == null) {
            this.a = h5.a(context, sq0, Long.valueOf(j));
        } else {
            h5Var.h().H().a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(a71 a71) {
        q3();
        this.a.f().y(new h9(this, a71));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        q3();
        this.a.F().Y(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, a71 a71, long j) {
        Bundle bundle2;
        q3();
        r.f(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.a.f().y(new g8(this, a71, new s(str2, new n(bundle), "app", j), str));
    }

    public void logHealthData(int i, String str, w80 w80, w80 w802, w80 w803) {
        q3();
        Object obj = null;
        Object r3 = w80 == null ? null : x80.r3(w80);
        Object r32 = w802 == null ? null : x80.r3(w802);
        if (w803 != null) {
            obj = x80.r3(w803);
        }
        this.a.h().A(i, true, false, str, r3, r32, obj);
    }

    public void onActivityCreated(w80 w80, Bundle bundle, long j) {
        q3();
        j7 j7Var = this.a.F().c;
        if (j7Var != null) {
            this.a.F().d0();
            j7Var.onActivityCreated((Activity) x80.r3(w80), bundle);
        }
    }

    public void onActivityDestroyed(w80 w80, long j) {
        q3();
        j7 j7Var = this.a.F().c;
        if (j7Var != null) {
            this.a.F().d0();
            j7Var.onActivityDestroyed((Activity) x80.r3(w80));
        }
    }

    public void onActivityPaused(w80 w80, long j) {
        q3();
        j7 j7Var = this.a.F().c;
        if (j7Var != null) {
            this.a.F().d0();
            j7Var.onActivityPaused((Activity) x80.r3(w80));
        }
    }

    public void onActivityResumed(w80 w80, long j) {
        q3();
        j7 j7Var = this.a.F().c;
        if (j7Var != null) {
            this.a.F().d0();
            j7Var.onActivityResumed((Activity) x80.r3(w80));
        }
    }

    public void onActivitySaveInstanceState(w80 w80, a71 a71, long j) {
        q3();
        j7 j7Var = this.a.F().c;
        Bundle bundle = new Bundle();
        if (j7Var != null) {
            this.a.F().d0();
            j7Var.onActivitySaveInstanceState((Activity) x80.r3(w80), bundle);
        }
        try {
            a71.p(bundle);
        } catch (RemoteException e) {
            this.a.h().H().b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(w80 w80, long j) {
        q3();
        j7 j7Var = this.a.F().c;
        if (j7Var != null) {
            this.a.F().d0();
            j7Var.onActivityStarted((Activity) x80.r3(w80));
        }
    }

    public void onActivityStopped(w80 w80, long j) {
        q3();
        j7 j7Var = this.a.F().c;
        if (j7Var != null) {
            this.a.F().d0();
            j7Var.onActivityStopped((Activity) x80.r3(w80));
        }
    }

    public void performAction(Bundle bundle, a71 a71, long j) {
        q3();
        a71.p((Bundle) null);
    }

    public void registerOnMeasurementEventListener(pq0 pq0) {
        q3();
        j6 j6Var = this.b.get(Integer.valueOf(pq0.zza()));
        if (j6Var == null) {
            j6Var = new a(pq0);
            this.b.put(Integer.valueOf(pq0.zza()), j6Var);
        }
        this.a.F().L(j6Var);
    }

    public void resetAnalyticsData(long j) {
        q3();
        l6 F = this.a.F();
        F.T((String) null);
        F.f().y(new v6(F, j));
    }

    public void setConditionalUserProperty(Bundle bundle, long j) {
        q3();
        if (bundle == null) {
            this.a.h().E().a("Conditional user property must not be null");
        } else {
            this.a.F().H(bundle, j);
        }
    }

    public void setConsent(Bundle bundle, long j) {
        q3();
        l6 F = this.a.F();
        if (c31.a() && F.j().z((String) null, u.P0)) {
            F.w();
            String f = e.f(bundle);
            if (f != null) {
                F.h().J().b("Ignoring invalid consent setting", f);
                F.h().J().a("Valid consent values are 'granted', 'denied'");
            }
            F.J(e.j(bundle), 10, j);
        }
    }

    public void setCurrentScreen(w80 w80, String str, String str2, long j) {
        q3();
        this.a.O().I((Activity) x80.r3(w80), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) {
        q3();
        l6 F = this.a.F();
        F.w();
        F.f().y(new k7(F, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        q3();
        l6 F = this.a.F();
        F.f().y(new o6(F, bundle == null ? null : new Bundle(bundle)));
    }

    public void setEventInterceptor(pq0 pq0) {
        q3();
        l6 F = this.a.F();
        b bVar = new b(pq0);
        F.w();
        F.f().y(new x6(F, bVar));
    }

    public void setInstanceIdProvider(qq0 qq0) {
        q3();
    }

    public void setMeasurementEnabled(boolean z, long j) {
        q3();
        this.a.F().R(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) {
        q3();
        l6 F = this.a.F();
        F.f().y(new s6(F, j));
    }

    public void setSessionTimeoutDuration(long j) {
        q3();
        l6 F = this.a.F();
        F.f().y(new r6(F, j));
    }

    public void setUserId(String str, long j) {
        q3();
        this.a.F().b0((String) null, "_id", str, true, j);
    }

    public void setUserProperty(String str, String str2, w80 w80, boolean z, long j) {
        q3();
        this.a.F().b0(str, str2, x80.r3(w80), z, j);
    }

    public void unregisterOnMeasurementEventListener(pq0 pq0) {
        q3();
        j6 remove = this.b.remove(Integer.valueOf(pq0.zza()));
        if (remove == null) {
            remove = new a(pq0);
        }
        this.a.F().t0(remove);
    }
}
