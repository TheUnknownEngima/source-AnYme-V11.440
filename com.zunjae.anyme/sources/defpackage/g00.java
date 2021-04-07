package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.v;
import defpackage.f00;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: g00  reason: default package */
public interface g00 {

    /* renamed from: g00$a */
    public static final class a {
        public final int a;
        public final f00.a b;
        private final CopyOnWriteArrayList<C0113a> c;
        private final long d;

        /* renamed from: g00$a$a  reason: collision with other inner class name */
        private static final class C0113a {
            public final Handler a;
            public final g00 b;

            public C0113a(Handler handler, g00 g00) {
                this.a = handler;
                this.b = g00;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (f00.a) null, 0);
        }

        private a(CopyOnWriteArrayList<C0113a> copyOnWriteArrayList, int i, f00.a aVar, long j) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = aVar;
            this.d = j;
        }

        private void B(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        private long b(long j) {
            long b2 = v.b(j);
            if (b2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.d + b2;
        }

        public void A() {
            f00.a aVar = this.b;
            q40.e(aVar);
            f00.a aVar2 = aVar;
            Iterator<C0113a> it = this.c.iterator();
            while (it.hasNext()) {
                C0113a next = it.next();
                B(next.a, new rz(this, next.b, aVar2));
            }
        }

        public void C() {
            f00.a aVar = this.b;
            q40.e(aVar);
            f00.a aVar2 = aVar;
            Iterator<C0113a> it = this.c.iterator();
            while (it.hasNext()) {
                C0113a next = it.next();
                B(next.a, new pz(this, next.b, aVar2));
            }
        }

        public void D(g00 g00) {
            Iterator<C0113a> it = this.c.iterator();
            while (it.hasNext()) {
                C0113a next = it.next();
                if (next.b == g00) {
                    this.c.remove(next);
                }
            }
        }

        public void E(int i, long j, long j2) {
            long j3 = j;
            F(new c(1, i, (f0) null, 3, (Object) null, b(j), b(j2)));
        }

        public void F(c cVar) {
            f00.a aVar = this.b;
            q40.e(aVar);
            f00.a aVar2 = aVar;
            Iterator<C0113a> it = this.c.iterator();
            while (it.hasNext()) {
                C0113a next = it.next();
                B(next.a, new lz(this, next.b, aVar2, cVar));
            }
        }

        public a G(int i, f00.a aVar, long j) {
            return new a(this.c, i, aVar, j);
        }

        public void a(Handler handler, g00 g00) {
            q40.a((handler == null || g00 == null) ? false : true);
            this.c.add(new C0113a(handler, g00));
        }

        public void c(int i, f0 f0Var, int i2, Object obj, long j) {
            d(new c(1, i, f0Var, i2, obj, b(j), -9223372036854775807L));
        }

        public void d(c cVar) {
            Iterator<C0113a> it = this.c.iterator();
            while (it.hasNext()) {
                C0113a next = it.next();
                B(next.a, new mz(this, next.b, cVar));
            }
        }

        public /* synthetic */ void e(g00 g00, c cVar) {
            g00.P(this.a, this.b, cVar);
        }

        public /* synthetic */ void f(g00 g00, b bVar, c cVar) {
            g00.p(this.a, this.b, bVar, cVar);
        }

        public /* synthetic */ void g(g00 g00, b bVar, c cVar) {
            g00.k(this.a, this.b, bVar, cVar);
        }

        public /* synthetic */ void h(g00 g00, b bVar, c cVar, IOException iOException, boolean z) {
            g00.C(this.a, this.b, bVar, cVar, iOException, z);
        }

        public /* synthetic */ void i(g00 g00, b bVar, c cVar) {
            g00.B(this.a, this.b, bVar, cVar);
        }

        public /* synthetic */ void j(g00 g00, f00.a aVar) {
            g00.J(this.a, aVar);
        }

        public /* synthetic */ void k(g00 g00, f00.a aVar) {
            g00.H(this.a, aVar);
        }

        public /* synthetic */ void l(g00 g00, f00.a aVar) {
            g00.o(this.a, aVar);
        }

        public /* synthetic */ void m(g00 g00, f00.a aVar, c cVar) {
            g00.y(this.a, aVar, cVar);
        }

        public void n(b bVar, c cVar) {
            Iterator<C0113a> it = this.c.iterator();
            while (it.hasNext()) {
                C0113a next = it.next();
                B(next.a, new kz(this, next.b, bVar, cVar));
            }
        }

        public void o(l lVar, Uri uri, Map<String, List<String>> map, int i, int i2, f0 f0Var, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            n(new b(lVar, uri, map, j3, j4, j5), new c(i, i2, f0Var, i3, obj, b(j), b(j2)));
        }

        public void p(l lVar, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            o(lVar, uri, map, i, -1, (f0) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        public void q(b bVar, c cVar) {
            Iterator<C0113a> it = this.c.iterator();
            while (it.hasNext()) {
                C0113a next = it.next();
                B(next.a, new nz(this, next.b, bVar, cVar));
            }
        }

        public void r(l lVar, Uri uri, Map<String, List<String>> map, int i, int i2, f0 f0Var, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            q(new b(lVar, uri, map, j3, j4, j5), new c(i, i2, f0Var, i3, obj, b(j), b(j2)));
        }

        public void s(l lVar, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            r(lVar, uri, map, i, -1, (f0) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        public void t(b bVar, c cVar, IOException iOException, boolean z) {
            Iterator<C0113a> it = this.c.iterator();
            while (it.hasNext()) {
                C0113a next = it.next();
                B(next.a, new jz(this, next.b, bVar, cVar, iOException, z));
            }
        }

        public void u(l lVar, Uri uri, Map<String, List<String>> map, int i, int i2, f0 f0Var, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            t(new b(lVar, uri, map, j3, j4, j5), new c(i, i2, f0Var, i3, obj, b(j), b(j2)), iOException, z);
        }

        public void v(l lVar, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            u(lVar, uri, map, i, -1, (f0) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
        }

        public void w(b bVar, c cVar) {
            Iterator<C0113a> it = this.c.iterator();
            while (it.hasNext()) {
                C0113a next = it.next();
                B(next.a, new qz(this, next.b, bVar, cVar));
            }
        }

        public void x(l lVar, int i, int i2, f0 f0Var, int i3, Object obj, long j, long j2, long j3) {
            l lVar2 = lVar;
            w(new b(lVar2, lVar2.a, Collections.emptyMap(), j3, 0, 0), new c(i, i2, f0Var, i3, obj, b(j), b(j2)));
        }

        public void y(l lVar, int i, long j) {
            x(lVar, i, -1, (f0) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j);
        }

        public void z() {
            f00.a aVar = this.b;
            q40.e(aVar);
            f00.a aVar2 = aVar;
            Iterator<C0113a> it = this.c.iterator();
            while (it.hasNext()) {
                C0113a next = it.next();
                B(next.a, new oz(this, next.b, aVar2));
            }
        }
    }

    /* renamed from: g00$b */
    public static final class b {
        public b(l lVar, Uri uri, Map<String, List<String>> map, long j, long j2, long j3) {
        }
    }

    /* renamed from: g00$c */
    public static final class c {
        public final int a;
        public final int b;
        public final f0 c;
        public final int d;
        public final Object e;
        public final long f;
        public final long g;

        public c(int i, int i2, f0 f0Var, int i3, Object obj, long j, long j2) {
            this.a = i;
            this.b = i2;
            this.c = f0Var;
            this.d = i3;
            this.e = obj;
            this.f = j;
            this.g = j2;
        }
    }

    void B(int i, f00.a aVar, b bVar, c cVar);

    void C(int i, f00.a aVar, b bVar, c cVar, IOException iOException, boolean z);

    void H(int i, f00.a aVar);

    void J(int i, f00.a aVar);

    void P(int i, f00.a aVar, c cVar);

    void k(int i, f00.a aVar, b bVar, c cVar);

    void o(int i, f00.a aVar);

    void p(int i, f00.a aVar, b bVar, c cVar);

    void y(int i, f00.a aVar, c cVar);
}
