package defpackage;

import android.util.Log;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.g;
import defpackage.ah;
import defpackage.se;
import defpackage.wd;
import java.util.Collections;
import java.util.List;

/* renamed from: mf  reason: default package */
class mf implements se, se.a {
    private final te<?> e;
    private final se.a f;
    private int g;
    private pe h;
    private Object i;
    private volatile ah.a<?> j;
    private qe k;

    /* renamed from: mf$a */
    class a implements wd.a<Object> {
        final /* synthetic */ ah.a e;

        a(ah.a aVar) {
            this.e = aVar;
        }

        public void c(Exception exc) {
            if (mf.this.g(this.e)) {
                mf.this.i(this.e, exc);
            }
        }

        public void f(Object obj) {
            if (mf.this.g(this.e)) {
                mf.this.h(this.e, obj);
            }
        }
    }

    mf(te<?> teVar, se.a aVar) {
        this.e = teVar;
        this.f = aVar;
    }

    /* JADX INFO: finally extract failed */
    private void c(Object obj) {
        long b = fm.b();
        try {
            d<X> p = this.e.p(obj);
            re reVar = new re(p, obj, this.e.k());
            this.k = new qe(this.j.a, this.e.o());
            this.e.d().a(this.k, reVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                "Finished encoding source to cache, key: " + this.k + ", data: " + obj + ", encoder: " + p + ", duration: " + fm.a(b);
            }
            this.j.c.b();
            this.h = new pe(Collections.singletonList(this.j.a), this.e, this);
        } catch (Throwable th) {
            this.j.c.b();
            throw th;
        }
    }

    private boolean d() {
        return this.g < this.e.g().size();
    }

    private void j(ah.a<?> aVar) {
        this.j.c.e(this.e.l(), new a(aVar));
    }

    public void a(g gVar, Exception exc, wd<?> wdVar, com.bumptech.glide.load.a aVar) {
        this.f.a(gVar, exc, wdVar, this.j.c.d());
    }

    public boolean b() {
        Object obj = this.i;
        if (obj != null) {
            this.i = null;
            c(obj);
        }
        pe peVar = this.h;
        if (peVar != null && peVar.b()) {
            return true;
        }
        this.h = null;
        this.j = null;
        boolean z = false;
        while (!z && d()) {
            List<ah.a<?>> g2 = this.e.g();
            int i2 = this.g;
            this.g = i2 + 1;
            this.j = g2.get(i2);
            if (this.j != null && (this.e.e().c(this.j.c.d()) || this.e.t(this.j.c.a()))) {
                j(this.j);
                z = true;
            }
        }
        return z;
    }

    public void cancel() {
        ah.a<?> aVar = this.j;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    public void e() {
        throw new UnsupportedOperationException();
    }

    public void f(g gVar, Object obj, wd<?> wdVar, com.bumptech.glide.load.a aVar, g gVar2) {
        this.f.f(gVar, obj, wdVar, this.j.c.d(), gVar);
    }

    /* access modifiers changed from: package-private */
    public boolean g(ah.a<?> aVar) {
        ah.a<?> aVar2 = this.j;
        return aVar2 != null && aVar2 == aVar;
    }

    /* access modifiers changed from: package-private */
    public void h(ah.a<?> aVar, Object obj) {
        we e2 = this.e.e();
        if (obj == null || !e2.c(aVar.c.d())) {
            se.a aVar2 = this.f;
            g gVar = aVar.a;
            wd<Data> wdVar = aVar.c;
            aVar2.f(gVar, obj, wdVar, wdVar.d(), this.k);
            return;
        }
        this.i = obj;
        this.f.e();
    }

    /* access modifiers changed from: package-private */
    public void i(ah.a<?> aVar, Exception exc) {
        se.a aVar2 = this.f;
        qe qeVar = this.k;
        wd<Data> wdVar = aVar.c;
        aVar2.a(qeVar, exc, wdVar, wdVar.d());
    }
}
