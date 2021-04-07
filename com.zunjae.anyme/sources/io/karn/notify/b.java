package io.karn.notify;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import androidx.core.app.h;
import defpackage.a12;
import java.util.ArrayList;

public final class b {
    private c12 a = new c12((PendingIntent) null, (PendingIntent) null, false, (String) null, false, false, 0, (ArrayList) null, 255, (r62) null);
    private z02 b = a.c.a().a();
    private b12 c = b12.b(a.c.a().b(), 0, 0, (CharSequence) null, false, 15, (Object) null);
    private a12 d = new a12.c((CharSequence) null, (CharSequence) null, (Bitmap) null, 7, (r62) null);
    private ArrayList<h.a> e;
    private d12 f;
    private final a g;

    public b(a aVar) {
        v62.f(aVar, "notify");
        this.g = aVar;
    }

    public static /* synthetic */ int g(b bVar, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return bVar.f(num);
    }

    public final b a(z52<? super a12.a, u22> z52) {
        v62.f(z52, "init");
        a12.a aVar = new a12.a((CharSequence) null, (CharSequence) null, (Bitmap) null, (CharSequence) null, (Bitmap) null, 31, (r62) null);
        this.d = aVar;
        if (aVar != null) {
            z52.r(aVar);
            return this;
        }
        throw new r22("null cannot be cast to non-null type io.karn.notify.entities.Payload.Content.BigPicture");
    }

    public final b b(z52<? super a12.b, u22> z52) {
        v62.f(z52, "init");
        a12.b bVar = new a12.b((CharSequence) null, (CharSequence) null, (Bitmap) null, (CharSequence) null, (CharSequence) null, 31, (r62) null);
        this.d = bVar;
        if (bVar != null) {
            z52.r(bVar);
            return this;
        }
        throw new r22("null cannot be cast to non-null type io.karn.notify.entities.Payload.Content.BigText");
    }

    public final h.e c() {
        return this.g.b(new h12(this.a, this.b, this.c, this.d, this.f, this.e));
    }

    public final b d(z52<? super a12.c, u22> z52) {
        v62.f(z52, "init");
        a12.c cVar = new a12.c((CharSequence) null, (CharSequence) null, (Bitmap) null, 7, (r62) null);
        this.d = cVar;
        if (cVar != null) {
            z52.r(cVar);
            return this;
        }
        throw new r22("null cannot be cast to non-null type io.karn.notify.entities.Payload.Content.Default");
    }

    public final b e(z52<? super c12, u22> z52) {
        v62.f(z52, "init");
        z52.r(this.a);
        return this;
    }

    public final int f(Integer num) {
        return this.g.d(num, c());
    }
}
