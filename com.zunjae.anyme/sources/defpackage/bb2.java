package defpackage;

import java.io.File;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* renamed from: bb2  reason: default package */
public abstract class bb2 {

    /* renamed from: bb2$a */
    class a extends bb2 {
        final /* synthetic */ va2 a;
        final /* synthetic */ qd2 b;

        a(va2 va2, qd2 qd2) {
            this.a = va2;
            this.b = qd2;
        }

        public long a() {
            return (long) this.b.A();
        }

        @Nullable
        public va2 b() {
            return this.a;
        }

        public void h(od2 od2) {
            od2.t0(this.b);
        }
    }

    /* renamed from: bb2$b */
    class b extends bb2 {
        final /* synthetic */ va2 a;
        final /* synthetic */ int b;
        final /* synthetic */ byte[] c;
        final /* synthetic */ int d;

        b(va2 va2, int i, byte[] bArr, int i2) {
            this.a = va2;
            this.b = i;
            this.c = bArr;
            this.d = i2;
        }

        public long a() {
            return (long) this.b;
        }

        @Nullable
        public va2 b() {
            return this.a;
        }

        public void h(od2 od2) {
            od2.W(this.c, this.d, this.b);
        }
    }

    /* renamed from: bb2$c */
    class c extends bb2 {
        final /* synthetic */ va2 a;
        final /* synthetic */ File b;

        c(va2 va2, File file) {
            this.a = va2;
            this.b = file;
        }

        public long a() {
            return this.b.length();
        }

        @Nullable
        public va2 b() {
            return this.a;
        }

        public void h(od2 od2) {
            de2 de2 = null;
            try {
                de2 = wd2.j(this.b);
                od2.a0(de2);
            } finally {
                ib2.g(de2);
            }
        }
    }

    public static bb2 c(@Nullable va2 va2, File file) {
        if (file != null) {
            return new c(va2, file);
        }
        throw new NullPointerException("file == null");
    }

    public static bb2 d(@Nullable va2 va2, String str) {
        Charset charset = ib2.i;
        if (va2 != null && (charset = va2.a()) == null) {
            charset = ib2.i;
            va2 = va2.d(va2 + "; charset=utf-8");
        }
        return f(va2, str.getBytes(charset));
    }

    public static bb2 e(@Nullable va2 va2, qd2 qd2) {
        return new a(va2, qd2);
    }

    public static bb2 f(@Nullable va2 va2, byte[] bArr) {
        return g(va2, bArr, 0, bArr.length);
    }

    public static bb2 g(@Nullable va2 va2, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            ib2.f((long) bArr.length, (long) i, (long) i2);
            return new b(va2, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }

    public long a() {
        return -1;
    }

    @Nullable
    public abstract va2 b();

    public abstract void h(od2 od2);
}
