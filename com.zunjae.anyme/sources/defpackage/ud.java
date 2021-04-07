package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.a;
import defpackage.wd;
import java.io.IOException;

/* renamed from: ud  reason: default package */
public abstract class ud<T> implements wd<T> {
    private final String e;
    private final AssetManager f;
    private T g;

    public ud(AssetManager assetManager, String str) {
        this.f = assetManager;
        this.e = str;
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

    public void e(g gVar, wd.a<? super T> aVar) {
        try {
            T f2 = f(this.f, this.e);
            this.g = f2;
            aVar.f(f2);
        } catch (IOException e2) {
            boolean isLoggable = Log.isLoggable("AssetPathFetcher", 3);
            aVar.c(e2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract T f(AssetManager assetManager, String str);
}
