package com.google.android.exoplayer2.ext.cast;

import android.content.Context;
import com.google.android.gms.cast.framework.b;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.i;
import java.util.Collections;
import java.util.List;

public final class DefaultCastOptionsProvider implements d {
    public List<i> a(Context context) {
        return Collections.emptyList();
    }

    public b b(Context context) {
        b.a aVar = new b.a();
        aVar.b("A12D4273");
        aVar.c(true);
        return aVar.a();
    }
}
