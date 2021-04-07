package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: cw1  reason: default package */
public final class cw1 extends pq1 {
    /* access modifiers changed from: private */
    public static cw1 j;
    public static final a k = new a((r62) null);
    private final Handler i;

    /* renamed from: cw1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final cw1 a() {
            if (cw1.j == null) {
                cw1.j = new cw1((r62) null);
            }
            cw1 m = cw1.j;
            v62.c(m);
            return m;
        }
    }

    /* renamed from: cw1$b */
    static final class b implements Runnable {
        final /* synthetic */ cw1 e;
        final /* synthetic */ Object f;

        b(cw1 cw1, Object obj) {
            this.e = cw1;
            this.f = obj;
        }

        public final void run() {
            cw1.super.i(this.f);
        }
    }

    private cw1() {
        this.i = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ cw1(r62 r62) {
        this();
    }

    public final void p(Object obj) {
        v62.e(obj, "event");
        if (v62.a(Looper.myLooper(), Looper.getMainLooper())) {
            super.i(obj);
        } else {
            this.i.post(new b(this, obj));
        }
    }
}
