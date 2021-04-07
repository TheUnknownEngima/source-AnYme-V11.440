package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.core.content.a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class m extends d6 {
    private long c;
    private String d;
    private Boolean e;
    private AccountManager f;
    private Boolean g;
    private long h;

    m(h5 h5Var) {
        super(h5Var);
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        Calendar instance = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.d = sb.toString();
        return false;
    }

    public final boolean t(Context context) {
        if (this.e == null) {
            this.e = Boolean.FALSE;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.e = Boolean.TRUE;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.e.booleanValue();
    }

    public final long u() {
        m();
        return this.c;
    }

    public final String v() {
        m();
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final long w() {
        b();
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final void x() {
        b();
        this.g = null;
        this.h = 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean y() {
        b();
        long c2 = l().c();
        if (c2 - this.h > 86400000) {
            this.g = null;
        }
        Boolean bool = this.g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (a.a(n(), "android.permission.GET_ACCOUNTS") != 0) {
            h().I().a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f == null) {
                this.f = AccountManager.get(n());
            }
            try {
                Account[] result = this.f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result == null || result.length <= 0) {
                    Account[] result2 = this.f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.g = Boolean.TRUE;
                        this.h = c2;
                        return true;
                    }
                } else {
                    this.g = Boolean.TRUE;
                    this.h = c2;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
                h().F().b("Exception checking account types", e2);
            }
        }
        this.h = c2;
        this.g = Boolean.FALSE;
        return false;
    }
}
