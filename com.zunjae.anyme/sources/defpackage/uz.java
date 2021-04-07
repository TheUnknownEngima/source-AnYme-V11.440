package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.upstream.y;
import defpackage.f00;
import defpackage.g00;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: uz  reason: default package */
public abstract class uz implements f00 {
    private final ArrayList<f00.b> e = new ArrayList<>(1);
    private final HashSet<f00.b> f = new HashSet<>(1);
    private final g00.a g = new g00.a();
    private Looper h;
    private b1 i;

    public final void b(f00.b bVar) {
        this.e.remove(bVar);
        if (this.e.isEmpty()) {
            this.h = null;
            this.i = null;
            this.f.clear();
            w();
            return;
        }
        f(bVar);
    }

    public final void d(Handler handler, g00 g00) {
        this.g.a(handler, g00);
    }

    public final void e(g00 g00) {
        this.g.D(g00);
    }

    public final void f(f00.b bVar) {
        boolean z = !this.f.isEmpty();
        this.f.remove(bVar);
        if (z && this.f.isEmpty()) {
            q();
        }
    }

    public final void j(f00.b bVar, y yVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.h;
        q40.a(looper == null || looper == myLooper);
        b1 b1Var = this.i;
        this.e.add(bVar);
        if (this.h == null) {
            this.h = myLooper;
            this.f.add(bVar);
            u(yVar);
        } else if (b1Var != null) {
            k(bVar);
            bVar.b(this, b1Var);
        }
    }

    public final void k(f00.b bVar) {
        q40.e(this.h);
        boolean isEmpty = this.f.isEmpty();
        this.f.add(bVar);
        if (isEmpty) {
            r();
        }
    }

    /* access modifiers changed from: protected */
    public final g00.a n(int i2, f00.a aVar, long j) {
        return this.g.G(i2, aVar, j);
    }

    /* access modifiers changed from: protected */
    public final g00.a o(f00.a aVar) {
        return this.g.G(0, aVar, 0);
    }

    /* access modifiers changed from: protected */
    public final g00.a p(f00.a aVar, long j) {
        q40.a(aVar != null);
        return this.g.G(0, aVar, j);
    }

    /* access modifiers changed from: protected */
    public void q() {
    }

    /* access modifiers changed from: protected */
    public void r() {
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return !this.f.isEmpty();
    }

    /* access modifiers changed from: protected */
    public abstract void u(y yVar);

    /* access modifiers changed from: protected */
    public final void v(b1 b1Var) {
        this.i = b1Var;
        Iterator<f00.b> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().b(this, b1Var);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void w();
}
