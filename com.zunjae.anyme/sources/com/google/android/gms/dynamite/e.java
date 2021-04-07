package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class e implements DynamiteModule.b {
    e() {
    }

    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.C0092b bVar) {
        int i;
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        aVar.a = bVar.a(context, str);
        int b = bVar.b(context, str, true);
        aVar.b = b;
        if (aVar.a == 0 && b == 0) {
            i = 0;
        } else if (aVar.b >= aVar.a) {
            aVar.c = 1;
            return aVar;
        } else {
            i = -1;
        }
        aVar.c = i;
        return aVar;
    }
}
