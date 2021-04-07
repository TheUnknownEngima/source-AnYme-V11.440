package com.google.android.gms.cast.framework.media.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;

public final class b implements e {
    private final Context a;
    private final com.google.android.gms.cast.framework.media.b b;
    private Uri c;
    private d d;
    private Bitmap e;
    private boolean f;
    private a g;

    public b(Context context) {
        this(context, new com.google.android.gms.cast.framework.media.b(-1, 0, 0));
    }

    public b(Context context, com.google.android.gms.cast.framework.media.b bVar) {
        this.a = context;
        this.b = bVar;
        c();
    }

    private final void c() {
        d dVar = this.d;
        if (dVar != null) {
            dVar.cancel(true);
            this.d = null;
        }
        this.c = null;
        this.e = null;
        this.f = false;
    }

    public final void a(Bitmap bitmap) {
        this.e = bitmap;
        this.f = true;
        a aVar = this.g;
        if (aVar != null) {
            aVar.a(bitmap);
        }
        this.d = null;
    }

    public final void b() {
        c();
        this.g = null;
    }

    public final void d(a aVar) {
        this.g = aVar;
    }

    public final boolean e(Uri uri) {
        if (uri == null) {
            c();
            return true;
        } else if (uri.equals(this.c)) {
            return this.f;
        } else {
            c();
            this.c = uri;
            if (this.b.k() == 0 || this.b.i() == 0) {
                this.d = new d(this.a, this);
            } else {
                this.d = new d(this.a, this.b.k(), this.b.i(), false, this);
            }
            this.d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Uri[]{this.c});
            return false;
        }
    }
}
