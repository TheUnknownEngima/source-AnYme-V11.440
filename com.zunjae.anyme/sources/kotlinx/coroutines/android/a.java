package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import kotlinx.coroutines.i;
import kotlinx.coroutines.o0;

public final class a extends b implements o0 {
    private volatile a _immediate;
    private final a e;
    /* access modifiers changed from: private */
    public final Handler f;
    private final String g;
    private final boolean h;

    /* renamed from: kotlinx.coroutines.android.a$a  reason: collision with other inner class name */
    public static final class C0246a implements Runnable {
        final /* synthetic */ a e;
        final /* synthetic */ i f;

        public C0246a(a aVar, i iVar) {
            this.e = aVar;
            this.f = iVar;
        }

        public final void run() {
            this.f.j(this.e, u22.a);
        }
    }

    static final class b extends w62 implements z52<Throwable, u22> {
        final /* synthetic */ a f;
        final /* synthetic */ Runnable g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, Runnable runnable) {
            super(1);
            this.f = aVar;
            this.g = runnable;
        }

        public final void a(Throwable th) {
            this.f.f.removeCallbacks(this.g);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((Throwable) obj);
            return u22.a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(Handler handler, String str) {
        this(handler, str, false);
        v62.f(handler, "handler");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Handler handler, String str, boolean z) {
        super((r62) null);
        a aVar = null;
        this.f = handler;
        this.g = str;
        this.h = z;
        this._immediate = z ? this : aVar;
        a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new a(this.f, this.g, true);
            this._immediate = aVar2;
        }
        this.e = aVar2;
    }

    public void N(n42 n42, Runnable runnable) {
        v62.f(n42, "context");
        v62.f(runnable, "block");
        this.f.post(runnable);
    }

    public boolean Q(n42 n42) {
        v62.f(n42, "context");
        return !this.h || (v62.a(Looper.myLooper(), this.f.getLooper()) ^ true);
    }

    /* renamed from: Y */
    public a U() {
        return this.e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f == this.f;
    }

    public int hashCode() {
        return System.identityHashCode(this.f);
    }

    public void k(long j, i<? super u22> iVar) {
        v62.f(iVar, "continuation");
        C0246a aVar = new C0246a(this, iVar);
        this.f.postDelayed(aVar, w72.f(j, 4611686018427387903L));
        iVar.f(new b(this, aVar));
    }

    public String toString() {
        String str = this.g;
        if (str == null) {
            String handler = this.f.toString();
            v62.b(handler, "handler.toString()");
            return handler;
        } else if (!this.h) {
            return str;
        } else {
            return this.g + " [immediate]";
        }
    }
}
