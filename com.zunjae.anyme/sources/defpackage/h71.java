package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.s;

/* renamed from: h71  reason: default package */
public class h71 extends h<m71> implements v71 {
    private final d A;
    private final Bundle B;
    private Integer C;
    private final boolean z;

    private h71(Context context, Looper looper, boolean z2, d dVar, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.z = true;
        this.A = dVar;
        this.B = bundle;
        this.C = dVar.d();
    }

    public h71(Context context, Looper looper, boolean z2, d dVar, g71 g71, f.a aVar, f.b bVar) {
        this(context, looper, true, dVar, n0(dVar), aVar, bVar);
    }

    public static Bundle n0(d dVar) {
        g71 h = dVar.h();
        Integer d = dVar.d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (d != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", d.intValue());
        }
        if (h != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", h.i());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", h.h());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", h.f());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", h.g());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", h.c());
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", h.d());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", h.j());
            if (h.b() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", h.b().longValue());
            }
            if (h.e() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", h.e().longValue());
            }
        }
        return bundle;
    }

    public final void c(k71 k71) {
        r.k(k71, "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.A.b();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(b.name)) {
                googleSignInAccount = f60.a(x()).b();
            }
            ((m71) D()).b3(new q71(new s(b, this.C.intValue(), googleSignInAccount)), k71);
        } catch (RemoteException e) {
            try {
                k71.D0(new s71(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public final void g() {
        f(new c.d());
    }

    /* access modifiers changed from: protected */
    public String j() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ IInterface k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof m71 ? (m71) queryLocalInterface : new o71(iBinder);
    }

    public int m() {
        return i.a;
    }

    public boolean o() {
        return this.z;
    }

    /* access modifiers changed from: protected */
    public String p() {
        return "com.google.android.gms.signin.service.START";
    }

    /* access modifiers changed from: protected */
    public Bundle z() {
        if (!x().getPackageName().equals(this.A.f())) {
            this.B.putString("com.google.android.gms.signin.internal.realClientPackageName", this.A.f());
        }
        return this.B;
    }
}
