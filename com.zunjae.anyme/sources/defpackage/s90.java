package defpackage;

import android.content.Context;
import com.google.android.gms.cast.f;
import com.google.android.gms.cast.framework.b;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.i;
import com.google.android.gms.cast.framework.media.internal.l;

/* renamed from: s90  reason: default package */
public final class s90 extends i {
    private final b d;
    private final aa0 e;
    private final uo0 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s90(Context context, b bVar, aa0 aa0) {
        super(context, bVar.o().isEmpty() ? f.a(bVar.l()) : f.b(bVar.l(), bVar.o()));
        this.d = bVar;
        this.e = aa0;
        this.f = new r90();
    }

    public final com.google.android.gms.cast.framework.f a(String str) {
        return new c(c(), b(), str, this.d, this.f, new l(c(), this.d, this.e));
    }

    public final boolean d() {
        return this.d.m();
    }
}
