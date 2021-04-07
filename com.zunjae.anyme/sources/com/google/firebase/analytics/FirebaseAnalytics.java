package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.measurement.internal.l7;
import com.google.firebase.installations.f;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics b;
    private final uq0 a;

    private FirebaseAnalytics(uq0 uq0) {
        r.j(uq0);
        this.a = uq0;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (b == null) {
                    b = new FirebaseAnalytics(uq0.a(context));
                }
            }
        }
        return b;
    }

    @Keep
    public static l7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        uq0 b2 = uq0.b(context, (String) null, (String) null, (String) null, bundle);
        if (b2 == null) {
            return null;
        }
        return new a(b2);
    }

    public final void a(String str, String str2) {
        this.a.p(str, str2);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) h81.b(f.l().f(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Deprecated
    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.a.i(activity, str, str2);
    }
}
