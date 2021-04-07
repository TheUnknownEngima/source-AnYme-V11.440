package androidx.mediarouter.media;

import android.content.Context;
import android.os.Build;
import androidx.mediarouter.media.j;
import java.lang.ref.WeakReference;

abstract class p {
    protected final Object a;
    protected d b;

    static class a extends p {
        private final Object c;
        private final Object d;
        private final Object e;
        private boolean f;

        /* renamed from: androidx.mediarouter.media.p$a$a  reason: collision with other inner class name */
        private static final class C0039a implements j.g {
            private final WeakReference<a> a;

            public C0039a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            public void c(Object obj, int i) {
                d dVar;
                a aVar = (a) this.a.get();
                if (aVar != null && (dVar = aVar.b) != null) {
                    dVar.b(i);
                }
            }

            public void j(Object obj, int i) {
                d dVar;
                a aVar = (a) this.a.get();
                if (aVar != null && (dVar = aVar.b) != null) {
                    dVar.a(i);
                }
            }
        }

        public a(Context context, Object obj) {
            super(context, obj);
            Object g = j.g(context);
            this.c = g;
            Object d2 = j.d(g, "", false);
            this.d = d2;
            this.e = j.e(this.c, d2);
        }

        public void c(c cVar) {
            j.f.e(this.e, cVar.a);
            j.f.h(this.e, cVar.b);
            j.f.g(this.e, cVar.c);
            j.f.b(this.e, cVar.d);
            j.f.c(this.e, cVar.e);
            if (!this.f) {
                this.f = true;
                j.f.f(this.e, j.f(new C0039a(this)));
                j.f.d(this.e, this.a);
            }
        }
    }

    static class b extends p {
        public b(Context context, Object obj) {
            super(context, obj);
        }
    }

    public static final class c {
        public int a;
        public int b;
        public int c = 0;
        public int d = 3;
        public int e = 1;
    }

    public interface d {
        void a(int i);

        void b(int i);
    }

    protected p(Context context, Object obj) {
        this.a = obj;
    }

    public static p b(Context context, Object obj) {
        return Build.VERSION.SDK_INT >= 16 ? new a(context, obj) : new b(context, obj);
    }

    public Object a() {
        return this.a;
    }

    public void c(c cVar) {
    }

    public void d(d dVar) {
        this.b = dVar;
    }
}
