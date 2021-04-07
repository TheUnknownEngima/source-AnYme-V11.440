package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.api.internal.b;
import java.util.ArrayList;

public class c extends Exception {
    private final b0<b<?>, com.google.android.gms.common.b> e;

    public c(b0<b<?>, com.google.android.gms.common.b> b0Var) {
        this.e = b0Var;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (b next : this.e.keySet()) {
            com.google.android.gms.common.b bVar = this.e.get(next);
            if (bVar.m()) {
                z = false;
            }
            String a = next.a();
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
