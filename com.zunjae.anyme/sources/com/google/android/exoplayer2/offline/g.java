package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.f;
import com.google.android.exoplayer2.upstream.w;
import java.io.InputStream;
import java.util.List;

public final class g<T extends f<T>> implements w.a<T> {
    private final w.a<? extends T> a;
    private final List<h> b;

    public g(w.a<? extends T> aVar, List<h> list) {
        this.a = aVar;
        this.b = list;
    }

    /* renamed from: b */
    public T a(Uri uri, InputStream inputStream) {
        T t = (f) this.a.a(uri, inputStream);
        List<h> list = this.b;
        return (list == null || list.isEmpty()) ? t : (f) t.a(this.b);
    }
}
