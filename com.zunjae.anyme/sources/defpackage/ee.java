package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.a;
import defpackage.wd;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: ee  reason: default package */
public abstract class ee<T> implements wd<T> {
    private final Uri e;
    private final ContentResolver f;
    private T g;

    public ee(ContentResolver contentResolver, Uri uri) {
        this.f = contentResolver;
        this.e = uri;
    }

    public void b() {
        T t = this.g;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c(T t);

    public void cancel() {
    }

    public a d() {
        return a.LOCAL;
    }

    public final void e(g gVar, wd.a<? super T> aVar) {
        try {
            T f2 = f(this.e, this.f);
            this.g = f2;
            aVar.f(f2);
        } catch (FileNotFoundException e2) {
            boolean isLoggable = Log.isLoggable("LocalUriFetcher", 3);
            aVar.c(e2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract T f(Uri uri, ContentResolver contentResolver);
}
