package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* renamed from: f60  reason: default package */
public class f60 {
    private static final Lock c = new ReentrantLock();
    @GuardedBy("sLk")
    private static f60 d;
    private final Lock a = new ReentrantLock();
    @GuardedBy("mLk")
    private final SharedPreferences b;

    private f60(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static f60 a(Context context) {
        r.j(context);
        c.lock();
        try {
            if (d == null) {
                d = new f60(context.getApplicationContext());
            }
            return d;
        } finally {
            c.unlock();
        }
    }

    private static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    private final GoogleSignInAccount d(String str) {
        String e;
        if (!TextUtils.isEmpty(str) && (e = e(c("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.z(e);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Nullable
    private final String e(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, (String) null);
        } finally {
            this.a.unlock();
        }
    }

    @Nullable
    public GoogleSignInAccount b() {
        return d(e("defaultGoogleSignInAccount"));
    }
}
