package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.f0;

public interface t {

    public static final class a {
        private final Handler a;
        private final t b;

        public a(Handler handler, t tVar) {
            Handler handler2;
            if (tVar != null) {
                q40.e(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.a = handler2;
            this.b = tVar;
        }

        public void a(String str, long j, long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new d(this, str, j, j2));
            }
        }

        public void b(zr zrVar) {
            zrVar.a();
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new f(this, zrVar));
            }
        }

        public void c(int i, long j) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new g(this, i, j));
            }
        }

        public void d(zr zrVar) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new e(this, zrVar));
            }
        }

        public void e(f0 f0Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new a(this, f0Var));
            }
        }

        public /* synthetic */ void f(String str, long j, long j2) {
            ((t) v50.g(this.b)).i(str, j, j2);
        }

        public /* synthetic */ void g(zr zrVar) {
            zrVar.a();
            t tVar = this.b;
            v50.g(tVar);
            tVar.M(zrVar);
        }

        public /* synthetic */ void h(int i, long j) {
            ((t) v50.g(this.b)).x(i, j);
        }

        public /* synthetic */ void i(zr zrVar) {
            ((t) v50.g(this.b)).G(zrVar);
        }

        public /* synthetic */ void j(f0 f0Var) {
            ((t) v50.g(this.b)).F(f0Var);
        }

        public /* synthetic */ void k(Surface surface) {
            ((t) v50.g(this.b)).r(surface);
        }

        public /* synthetic */ void l(int i, int i2, int i3, float f) {
            ((t) v50.g(this.b)).b(i, i2, i3, f);
        }

        public void m(Surface surface) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new b(this, surface));
            }
        }

        public void n(int i, int i2, int i3, float f) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new c(this, i, i2, i3, f));
            }
        }
    }

    void F(f0 f0Var);

    void G(zr zrVar);

    void M(zr zrVar);

    void b(int i, int i2, int i3, float f);

    void i(String str, long j, long j2);

    void r(Surface surface);

    void x(int i, long j);
}
