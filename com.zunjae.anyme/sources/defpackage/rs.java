package defpackage;

import android.os.Looper;
import defpackage.ps;
import defpackage.ts;

/* renamed from: rs  reason: default package */
public interface rs<T extends ts> {
    public static final rs<ts> a = new a();

    /* renamed from: rs$a */
    class a implements rs<ts> {
        a() {
        }

        public /* synthetic */ void a() {
            qs.c(this);
        }

        public Class<ts> b(ns nsVar) {
            return null;
        }

        public /* synthetic */ ps<T> c(Looper looper, int i) {
            return qs.a(this, looper, i);
        }

        public ps<ts> d(Looper looper, ns nsVar) {
            return new ss(new ps.a(new ys(1)));
        }

        public boolean e(ns nsVar) {
            return false;
        }

        public /* synthetic */ void t() {
            qs.b(this);
        }
    }

    void a();

    Class<? extends ts> b(ns nsVar);

    ps<T> c(Looper looper, int i);

    ps<T> d(Looper looper, ns nsVar);

    boolean e(ns nsVar);

    void t();
}
