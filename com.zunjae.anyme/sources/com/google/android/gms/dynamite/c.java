package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class c implements DynamiteModule.b {
    c() {
    }

    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.C0092b bVar) {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        int a = bVar.a(context, str);
        aVar.a = a;
        if (a != 0) {
            aVar.c = -1;
        } else {
            int b = bVar.b(context, str, true);
            aVar.b = b;
            if (b != 0) {
                aVar.c = 1;
            }
        }
        return aVar;
    }
}
