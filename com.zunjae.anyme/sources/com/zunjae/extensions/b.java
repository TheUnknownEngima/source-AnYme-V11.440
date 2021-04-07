package com.zunjae.extensions;

import android.content.Context;
import defpackage.kd2;
import defpackage.xa2;
import java.util.concurrent.TimeUnit;

public final class b {
    public static final b a = new b();

    private b() {
    }

    public static /* synthetic */ xa2.b b(b bVar, Context context, boolean z, long j, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = 5;
        }
        return bVar.a(context, z, j, (i2 & 8) != 0 ? 10 : i);
    }

    public final xa2.b a(Context context, boolean z, long j, int i) {
        v62.e(context, "context");
        xa2.b bVar = new xa2.b();
        bVar.f(j, TimeUnit.SECONDS);
        bVar.e(j, TimeUnit.SECONDS);
        if (z) {
            kd2 kd2 = new kd2();
            kd2.e(kd2.a.BODY);
            bVar.a(kd2);
        }
        if (i > 0) {
            bVar.c(new ca2(context.getCacheDir(), (long) (i * 1024 * 1024)));
        }
        v62.d(bVar, "builder");
        return bVar;
    }

    public final xa2.b c(Context context, boolean z, long j) {
        v62.e(context, "context");
        return a(context, z, j, 0);
    }
}
