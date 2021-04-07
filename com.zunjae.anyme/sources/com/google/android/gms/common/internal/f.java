package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;

public abstract class f implements DialogInterface.OnClickListener {
    public static f a(Activity activity, Intent intent, int i) {
        return new y(intent, activity, i);
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            b();
        } catch (ActivityNotFoundException unused) {
        } finally {
            dialogInterface.dismiss();
        }
    }
}
