package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class d implements DynamiteModule.b {
    d() {
    }

    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.C0092b bVar) {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        int a = bVar.a(context, str);
        aVar.a = a;
        aVar.b = a != 0 ? bVar.b(context, str, false) : bVar.b(context, str, true);
        if (aVar.a == 0 && aVar.b == 0) {
            aVar.c = 0;
        } else if (aVar.a >= aVar.b) {
            aVar.c = -1;
        } else {
            aVar.c = 1;
        }
        return aVar;
    }
}
