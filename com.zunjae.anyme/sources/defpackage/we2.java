package defpackage;

import android.app.Activity;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.Future;

/* renamed from: we2  reason: default package */
public final class we2 {
    private static final z52<Throwable, u22> a = b.f;

    /* renamed from: we2$a */
    static final class a implements Runnable {
        final /* synthetic */ z52 e;
        final /* synthetic */ Activity f;

        a(z52 z52, Activity activity) {
            this.e = z52;
            this.f = activity;
        }

        public final void run() {
            z52 z52 = this.e;
            Activity activity = this.f;
            v62.b(activity, "activity");
            z52.r(activity);
        }
    }

    /* renamed from: we2$b */
    static final class b extends w62 implements z52<Throwable, u22> {
        public static final b f = new b();

        b() {
            super(1);
        }

        public final void a(Throwable th) {
            v62.f(th, "throwable");
            th.printStackTrace();
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((Throwable) obj);
            return u22.a;
        }
    }

    /* renamed from: we2$c */
    static final class c extends w62 implements o52<u22> {
        final /* synthetic */ z52 f;
        final /* synthetic */ ve2 g;
        final /* synthetic */ z52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(z52 z52, ve2 ve2, z52 z522) {
            super(0);
            this.f = z52;
            this.g = ve2;
            this.h = z522;
        }

        public final void a() {
            try {
                u22 u22 = (u22) this.f.r(this.g);
            } catch (Throwable th) {
                z52 z52 = this.h;
                if ((z52 != null ? (u22) z52.r(th) : null) == null) {
                    u22 u222 = u22.a;
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return u22.a;
        }
    }

    /* renamed from: we2$d */
    static final class d implements Runnable {
        final /* synthetic */ z52 e;
        final /* synthetic */ Object f;

        d(z52 z52, Object obj) {
            this.e = z52;
            this.f = obj;
        }

        public final void run() {
            this.e.r(this.f);
        }
    }

    public static final <T extends Activity> boolean a(ve2<T> ve2, z52<? super T, u22> z52) {
        v62.f(ve2, "$receiver");
        v62.f(z52, "f");
        Activity activity = (Activity) ve2.a().get();
        if (activity == null) {
            return false;
        }
        v62.b(activity, "activity");
        if (activity.isFinishing()) {
            return false;
        }
        activity.runOnUiThread(new a(z52, activity));
        return true;
    }

    public static final <T> Future<u22> b(T t, z52<? super Throwable, u22> z52, z52<? super ve2<T>, u22> z522) {
        v62.f(z522, "task");
        return ye2.b.a(new c(z522, new ve2(new WeakReference(t)), z52));
    }

    public static /* bridge */ /* synthetic */ Future c(Object obj, z52<Throwable, u22> z52, z52 z522, int i, Object obj2) {
        if ((i & 1) != 0) {
            z52 = a;
        }
        return b(obj, z52, z522);
    }

    public static final <T> boolean d(ve2<T> ve2, z52<? super T, u22> z52) {
        v62.f(ve2, "$receiver");
        v62.f(z52, "f");
        Object obj = ve2.a().get();
        if (obj == null) {
            return false;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z52.r(obj);
            return true;
        }
        ze2.b.a().post(new d(z52, obj));
        return true;
    }
}
