package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.a;
import com.google.android.gms.cast.framework.b;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.g;

/* renamed from: jf0  reason: default package */
public final class jf0 {
    /* access modifiers changed from: private */
    public static final u60 g = new u60("ApplicationAnalytics");
    /* access modifiers changed from: private */
    public final ob0 a;
    /* access modifiers changed from: private */
    public final zj0 b;
    private final Runnable c = new ie0(this);
    private final Handler d = new mb0(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public final SharedPreferences e;
    /* access modifiers changed from: private */
    public zk0 f;

    public jf0(SharedPreferences sharedPreferences, ob0 ob0, Bundle bundle, String str) {
        this.e = sharedPreferences;
        this.a = ob0;
        this.b = new zj0(bundle, str);
    }

    private static String a() {
        b a2 = a.c().a();
        if (a2 == null) {
            return null;
        }
        return a2.l();
    }

    /* access modifiers changed from: private */
    public final void c(SharedPreferences sharedPreferences, String str) {
        if (x(str)) {
            g.a("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            return;
        }
        this.f = zk0.a(sharedPreferences);
        if (x(str)) {
            g.a("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
            zk0.g = this.f.c + 1;
            return;
        }
        g.a("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
        zk0 c2 = zk0.c();
        this.f = c2;
        c2.a = a();
        this.f.e = str;
    }

    /* access modifiers changed from: private */
    public final void h() {
        this.d.postDelayed(this.c, 300000);
    }

    /* access modifiers changed from: private */
    public final void i() {
        this.d.removeCallbacks(this.c);
    }

    private final boolean j() {
        String str;
        if (this.f == null) {
            g.a("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        String a2 = a();
        if (a2 != null && (str = this.f.a) != null && TextUtils.equals(str, a2)) {
            return true;
        }
        g.a("The analytics session doesn't match the application ID %s", a2);
        return false;
    }

    /* access modifiers changed from: private */
    public final void k() {
        this.f.b(this.e);
    }

    /* access modifiers changed from: private */
    public final void n(c cVar, int i) {
        v(cVar);
        this.a.b(this.b.g(this.f, i), kf0.APP_SESSION_END);
        i();
        this.f = null;
    }

    /* access modifiers changed from: private */
    public final void u(c cVar) {
        g.a("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        zk0 c2 = zk0.c();
        this.f = c2;
        c2.a = a();
        if (cVar != null && cVar.o() != null) {
            this.f.b = cVar.o().z();
        }
    }

    /* access modifiers changed from: private */
    public final void v(c cVar) {
        if (j()) {
            CastDevice o = cVar != null ? cVar.o() : null;
            if (o != null && !TextUtils.equals(this.f.b, o.z())) {
                this.f.b = o.z();
                return;
            }
            return;
        }
        g.g("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
        u(cVar);
    }

    private final boolean x(String str) {
        String str2;
        if (!j()) {
            return false;
        }
        if (str != null && (str2 = this.f.e) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        g.a("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }

    public final void d(g gVar) {
        gVar.a(new kg0(this), c.class);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p() {
        zk0 zk0 = this.f;
        if (zk0 != null) {
            this.a.b(this.b.a(zk0), kf0.APP_SESSION_PING);
        }
        h();
    }
}
