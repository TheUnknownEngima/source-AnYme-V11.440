package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.video.n;
import com.google.android.exoplayer2.video.p;
import com.google.android.exoplayer2.video.s;

public interface r0 {

    public interface a {
        void A(int i);

        @Deprecated
        void D(b1 b1Var, Object obj, int i);

        void L(p00 p00, i40 i40);

        void R(boolean z);

        void c(o0 o0Var);

        void d(int i);

        void e(boolean z);

        void f(int i);

        void j(b0 b0Var);

        void l();

        void n(b1 b1Var, int i);

        void u(boolean z);

        void z(boolean z, int i);
    }

    public interface b {
        void J(q20 q20);

        void u(q20 q20);
    }

    public interface c {
        void D(p pVar);

        void I(SurfaceView surfaceView);

        void R(TextureView textureView);

        void U(s sVar);

        void a(Surface surface);

        void b(x50 x50);

        void c(p pVar);

        void d(Surface surface);

        void m(x50 x50);

        void p(TextureView textureView);

        void r(n nVar);

        void t(SurfaceView surfaceView);

        void x(s sVar);
    }

    long A();

    int B();

    boolean C();

    void E(int i);

    int F();

    int G();

    int H();

    int K();

    p00 L();

    long M();

    b1 N();

    Looper O();

    boolean P();

    long Q();

    i40 S();

    int T(int i);

    long V();

    b W();

    o0 e();

    boolean f();

    long g();

    int h();

    boolean hasNext();

    boolean hasPrevious();

    void i(int i, long j);

    boolean j();

    void k(boolean z);

    b0 l();

    int n();

    boolean o();

    void q(a aVar);

    int s();

    void v(a aVar);

    int w();

    void y(boolean z);

    c z();
}
