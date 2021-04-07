package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.y;

/* renamed from: f00  reason: default package */
public interface f00 {

    /* renamed from: f00$a */
    public static final class a {
        public final Object a;
        public final int b;
        public final int c;
        public final long d;
        public final int e;

        public a(Object obj) {
            this(obj, -1);
        }

        public a(Object obj, int i, int i2, long j) {
            this(obj, i, i2, j, -1);
        }

        private a(Object obj, int i, int i2, long j, int i3) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = j;
            this.e = i3;
        }

        public a(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public a(Object obj, long j, int i) {
            this(obj, -1, -1, j, i);
        }

        public boolean a() {
            return this.b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public int hashCode() {
            return ((((((((527 + this.a.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
        }
    }

    /* renamed from: f00$b */
    public interface b {
        void b(f00 f00, b1 b1Var);
    }

    e00 a(a aVar, e eVar, long j);

    void b(b bVar);

    void d(Handler handler, g00 g00);

    void e(g00 g00);

    void f(b bVar);

    void h();

    void i(e00 e00);

    void j(b bVar, y yVar);

    void k(b bVar);
}
