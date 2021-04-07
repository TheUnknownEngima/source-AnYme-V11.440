package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.c;
import com.google.firebase.installations.g;
import com.google.firebase.installations.l;
import defpackage.uh1;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

public class s {
    private final c a;
    private final f0 b;
    private final p0 c;
    private final pi1 d;
    private final uh1 e;
    private final g f;

    s(c cVar, f0 f0Var, p0 p0Var, pi1 pi1, uh1 uh1, g gVar) {
        this.a = cVar;
        this.b = f0Var;
        this.c = p0Var;
        this.d = pi1;
        this.e = uh1;
        this.f = gVar;
    }

    public s(c cVar, f0 f0Var, pi1 pi1, uh1 uh1, g gVar) {
        this(cVar, f0Var, new p0(cVar.g(), f0Var), pi1, uh1, gVar);
    }

    private static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private e81<String> b(e81<Bundle> e81) {
        return e81.i(h.a(), new r(this));
    }

    private String c() {
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(this.a.i().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String e(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                sb.toString();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    static boolean f(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private Bundle h(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.a.j().c());
        bundle.putString("gmsv", Integer.toString(this.b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        bundle.putString("app_ver_name", this.b.b());
        bundle.putString("firebase-app-name-hash", c());
        try {
            String b2 = ((l) h81.a(this.f.a(false))).b();
            if (!TextUtils.isEmpty(b2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b2);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString("cliv", "20.2.3".length() != 0 ? "fiid-".concat("20.2.3") : new String("fiid-"));
        uh1.a a2 = this.e.a("fire-iid");
        if (a2 != uh1.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a2.getCode()));
            bundle.putString("Firebase-Client", this.d.a());
        }
        return bundle;
    }

    private e81<Bundle> i(String str, String str2, String str3, Bundle bundle) {
        h(str, str2, str3, bundle);
        return this.c.l(bundle);
    }

    public e81<String> d(String str, String str2, String str3) {
        return b(i(str, str2, str3, new Bundle()));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String g(e81 e81) {
        return e((Bundle) e81.n(IOException.class));
    }

    public e81<?> j(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return b(i(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }

    public e81<?> k(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return b(i(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }
}
