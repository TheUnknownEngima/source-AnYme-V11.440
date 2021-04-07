package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.u;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public final class w<T> implements u.e {
    public final l a;
    public final int b;
    private final x c;
    private final a<? extends T> d;
    private volatile T e;

    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    public w(i iVar, Uri uri, int i, a<? extends T> aVar) {
        this(iVar, new l(uri, 1), i, aVar);
    }

    public w(i iVar, l lVar, int i, a<? extends T> aVar) {
        this.c = new x(iVar);
        this.a = lVar;
        this.b = i;
        this.d = aVar;
    }

    public final void a() {
        this.c.i();
        k kVar = new k(this.c, this.a);
        try {
            kVar.b();
            Uri e2 = this.c.e();
            q40.e(e2);
            this.e = this.d.a(e2, kVar);
        } finally {
            v50.l(kVar);
        }
    }

    public long b() {
        return this.c.f();
    }

    public final void c() {
    }

    public Map<String, List<String>> d() {
        return this.c.h();
    }

    public final T e() {
        return this.e;
    }

    public Uri f() {
        return this.c.g();
    }
}
