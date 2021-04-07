package defpackage;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.g;
import defpackage.ig;

/* renamed from: hg  reason: default package */
public class hg extends gm<g, Cif<?>> implements ig {
    private ig.a d;

    public hg(long j) {
        super(j);
    }

    @SuppressLint({"InlinedApi"})
    public void a(int i) {
        if (i >= 40) {
            b();
        } else if (i >= 20 || i == 15) {
            m(h() / 2);
        }
    }

    public /* bridge */ /* synthetic */ Cif c(g gVar, Cif ifVar) {
        return (Cif) super.k(gVar, ifVar);
    }

    public /* bridge */ /* synthetic */ Cif d(g gVar) {
        return (Cif) super.l(gVar);
    }

    public void e(ig.a aVar) {
        this.d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int i(Cif<?> ifVar) {
        return ifVar == null ? super.i(null) : ifVar.c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void j(g gVar, Cif<?> ifVar) {
        ig.a aVar = this.d;
        if (aVar != null && ifVar != null) {
            aVar.a(ifVar);
        }
    }
}
