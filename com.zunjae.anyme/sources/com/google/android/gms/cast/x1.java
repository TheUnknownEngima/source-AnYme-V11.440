package com.google.android.gms.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.cast.g;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;

final class x1 extends a.C0087a<fb0, g.a> {
    x1() {
    }

    public final /* synthetic */ a.f a(Context context, Looper looper, d dVar, Object obj, f.a aVar, f.b bVar) {
        g.a aVar2 = (g.a) obj;
        Bundle bundle = new Bundle();
        bundle.putInt("configuration", aVar2.c);
        return new fb0(context, looper, dVar, aVar2.a, bundle, aVar2.b, aVar, bVar);
    }
}
