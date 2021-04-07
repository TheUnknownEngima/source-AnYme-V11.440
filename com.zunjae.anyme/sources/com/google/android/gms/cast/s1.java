package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.cast.e;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.r;

final class s1 extends a.C0087a<z70, e.b> {
    s1() {
    }

    public final /* synthetic */ a.f a(Context context, Looper looper, d dVar, Object obj, f.a aVar, f.b bVar) {
        e.b bVar2 = (e.b) obj;
        r.k(bVar2, "Setting the API options is required.");
        return new z70(context, looper, dVar, bVar2.a, (long) bVar2.d, bVar2.b, bVar2.c, aVar, bVar);
    }
}
