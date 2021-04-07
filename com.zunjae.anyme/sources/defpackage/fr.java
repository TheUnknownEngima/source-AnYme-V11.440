package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.f0;

/* renamed from: fr  reason: default package */
public interface fr {

    /* renamed from: fr$a */
    public static final class a {
        private final Handler a;
        private final fr b;

        public a(Handler handler, fr frVar) {
            Handler handler2;
            if (frVar != null) {
                q40.e(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.a = handler2;
            this.b = frVar;
        }

        public void a(int i) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new wq(this, i));
            }
        }

        public void b(int i, long j, long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new yq(this, i, j, j2));
            }
        }

        public void c(String str, long j, long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new uq(this, str, j, j2));
            }
        }

        public void d(zr zrVar) {
            zrVar.a();
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new xq(this, zrVar));
            }
        }

        public void e(zr zrVar) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new vq(this, zrVar));
            }
        }

        public void f(f0 f0Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new tq(this, f0Var));
            }
        }

        public /* synthetic */ void g(int i) {
            ((fr) v50.g(this.b)).a(i);
        }

        public /* synthetic */ void h(int i, long j, long j2) {
            ((fr) v50.g(this.b)).K(i, j, j2);
        }

        public /* synthetic */ void i(String str, long j, long j2) {
            ((fr) v50.g(this.b)).t(str, j, j2);
        }

        public /* synthetic */ void j(zr zrVar) {
            zrVar.a();
            fr frVar = this.b;
            v50.g(frVar);
            frVar.g(zrVar);
        }

        public /* synthetic */ void k(zr zrVar) {
            ((fr) v50.g(this.b)).h(zrVar);
        }

        public /* synthetic */ void l(f0 f0Var) {
            ((fr) v50.g(this.b)).I(f0Var);
        }
    }

    void I(f0 f0Var);

    void K(int i, long j, long j2);

    void a(int i);

    void g(zr zrVar);

    void h(zr zrVar);

    void t(String str, long j, long j2);
}
