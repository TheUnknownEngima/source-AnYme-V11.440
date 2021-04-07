package defpackage;

import com.google.android.exoplayer2.o0;
import java.nio.ByteBuffer;

/* renamed from: gr  reason: default package */
public interface gr {

    /* renamed from: gr$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: gr$b */
    public static final class b extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(int r3, int r4, int r5, int r6) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 82
                r0.<init>(r1)
                java.lang.String r1 = "AudioTrack init failed: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = ", Config("
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = ", "
                r0.append(r3)
                r0.append(r5)
                r0.append(r3)
                r0.append(r6)
                java.lang.String r3 = ")"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gr.b.<init>(int, int, int, int):void");
        }
    }

    /* renamed from: gr$c */
    public interface c {
        void a(int i);

        void b(int i, long j, long j2);

        void c();
    }

    /* renamed from: gr$d */
    public static final class d extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 36
                r0.<init>(r1)
                java.lang.String r1 = "AudioTrack write failed: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gr.d.<init>(int):void");
        }
    }

    void D();

    void a();

    boolean c();

    o0 e();

    void flush();

    void g(o0 o0Var);

    boolean h(int i, int i2);

    void i(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6);

    void j();

    boolean k();

    long l(boolean z);

    void m();

    void n();

    void o(br brVar);

    void p();

    void q(float f);

    boolean r(ByteBuffer byteBuffer, long j);

    void s(int i);

    void t(c cVar);

    void u(jr jrVar);
}
