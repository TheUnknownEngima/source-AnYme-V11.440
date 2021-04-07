package defpackage;

import android.view.View;

/* renamed from: g9  reason: default package */
public final class g9 {
    /* access modifiers changed from: private */
    public static volatile boolean a = true;
    private static final Runnable b = a.e;
    public static final g9 c = new g9();

    /* renamed from: g9$a */
    static final class a implements Runnable {
        public static final a e = new a();

        a() {
        }

        public final void run() {
            g9.a = true;
        }
    }

    private g9() {
    }

    public final boolean b(View view) {
        v62.f(view, "view");
        if (!a) {
            return false;
        }
        a = false;
        view.post(b);
        return true;
    }
}
