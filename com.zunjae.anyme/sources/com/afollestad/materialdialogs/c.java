package com.afollestad.materialdialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.afollestad.materialdialogs.internal.MDRootLayout;

class c extends Dialog implements DialogInterface.OnShowListener {
    protected MDRootLayout e;
    private DialogInterface.OnShowListener f;

    c(Context context, int i) {
        super(context, i);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        super.setOnShowListener(this);
    }

    /* access modifiers changed from: package-private */
    public final void c(View view) {
        super.setContentView(view);
    }

    public View findViewById(int i) {
        return this.e.findViewById(i);
    }

    public void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.f;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Deprecated
    public void setContentView(int i) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Deprecated
    public void setContentView(View view) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Deprecated
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f = onShowListener;
    }
}
