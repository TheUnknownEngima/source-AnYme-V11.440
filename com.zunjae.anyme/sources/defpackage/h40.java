package defpackage;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.upstream.f;
import java.util.List;

/* renamed from: h40  reason: default package */
public interface h40 {

    /* renamed from: h40$a */
    public static final class a {
        public final o00 a;
        public final int[] b;
        public final int c;
        public final Object d;

        public a(o00 o00, int... iArr) {
            this(o00, iArr, 0, (Object) null);
        }

        public a(o00 o00, int[] iArr, int i, Object obj) {
            this.a = o00;
            this.b = iArr;
            this.c = i;
            this.d = obj;
        }
    }

    /* renamed from: h40$b */
    public interface b {
        h40[] a(a[] aVarArr, f fVar);
    }

    o00 a();

    int b();

    boolean c(int i, long j);

    f0 d(int i);

    void e();

    int f(int i);

    int g(long j, List<? extends d10> list);

    int h(f0 f0Var);

    void i();

    void j(long j, long j2, long j3, List<? extends d10> list, e10[] e10Arr);

    int k();

    f0 l();

    int length();

    int m();

    void n(float f);

    Object o();

    void p();

    int q(int i);
}
