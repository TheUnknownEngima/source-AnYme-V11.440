package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.c;
import com.google.android.gms.common.internal.r;

public class k extends c {
    private Dialog o0 = null;
    private DialogInterface.OnCancelListener p0 = null;

    public static k X1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        k kVar = new k();
        r.k(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        kVar.o0 = dialog2;
        if (onCancelListener != null) {
            kVar.p0 = onCancelListener;
        }
        return kVar;
    }

    public Dialog P1(Bundle bundle) {
        if (this.o0 == null) {
            S1(false);
        }
        return this.o0;
    }

    public void W1(androidx.fragment.app.k kVar, String str) {
        super.W1(kVar, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.p0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
