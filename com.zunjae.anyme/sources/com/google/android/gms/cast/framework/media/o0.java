package com.google.android.gms.cast.framework.media;

import android.util.LruCache;
import com.google.android.gms.cast.o;

final class o0 extends LruCache<Integer, o> {
    private final /* synthetic */ d a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    o0(d dVar, int i) {
        super(i);
        this.a = dVar;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        o oVar = (o) obj2;
        o oVar2 = (o) obj3;
        if (z) {
            this.a.g.add(num);
        }
    }
}
