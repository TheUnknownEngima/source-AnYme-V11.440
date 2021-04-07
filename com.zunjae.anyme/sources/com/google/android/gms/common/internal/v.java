package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import defpackage.y80;

public final class v extends y80<p> {
    private static final v c = new v();

    private v() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i, int i2) {
        return c.e(context, i, i2);
    }

    private final View e(Context context, int i, int i2) {
        try {
            u uVar = new u(i, i2, (Scope[]) null);
            return (View) x80.r3(((p) b(context)).l1(x80.s3(context), uVar));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new y80.a(sb.toString(), e);
        }
    }

    /* renamed from: d */
    public final p a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof p ? (p) queryLocalInterface : new b0(iBinder);
    }
}
