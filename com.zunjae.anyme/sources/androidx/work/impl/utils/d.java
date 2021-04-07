package androidx.work.impl.utils;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.r;
import androidx.lifecycle.u;

public class d {

    static class a implements u<In> {
        Out a = null;
        final /* synthetic */ s8 b;
        final /* synthetic */ Object c;
        final /* synthetic */ a0 d;
        final /* synthetic */ r e;

        /* renamed from: androidx.work.impl.utils.d$a$a  reason: collision with other inner class name */
        class C0066a implements Runnable {
            final /* synthetic */ Object e;

            C0066a(Object obj) {
                this.e = obj;
            }

            public void run() {
                r rVar;
                synchronized (a.this.c) {
                    Out a = a.this.d.a(this.e);
                    if (a.this.a == null && a != null) {
                        a.this.a = a;
                        rVar = a.this.e;
                    } else if (a.this.a != null && !a.this.a.equals(a)) {
                        a.this.a = a;
                        rVar = a.this.e;
                    }
                    rVar.k(a);
                }
            }
        }

        a(s8 s8Var, Object obj, a0 a0Var, r rVar) {
            this.b = s8Var;
            this.c = obj;
            this.d = a0Var;
            this.e = rVar;
        }

        public void a(In in) {
            this.b.c(new C0066a(in));
        }
    }

    public static <In, Out> LiveData<Out> a(LiveData<In> liveData, a0<In, Out> a0Var, s8 s8Var) {
        Object obj = new Object();
        r rVar = new r();
        rVar.n(liveData, new a(s8Var, obj, a0Var, rVar));
        return rVar;
    }
}
