package com.zunjae.anyme.abstracts;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.c;
import java.util.HashMap;

public abstract class b extends c {
    private HashMap o0;

    public void X1() {
        HashMap hashMap = this.o0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    public final void Y1() {
        try {
            Dialog N1 = N1();
            if (N1 != null && N1.getWindow() != null) {
                Window window = N1.getWindow();
                v62.c(window);
                window.setLayout(-1, -2);
            }
        } catch (Exception e) {
            uj2.d(e);
        }
    }

    public void h0(Bundle bundle) {
        Dialog N1 = N1();
        if (N1 != null) {
            N1.requestWindowFeature(1);
        }
        super.h0(bundle);
    }

    public /* synthetic */ void u0() {
        super.u0();
        X1();
    }
}
