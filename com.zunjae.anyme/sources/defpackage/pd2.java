package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: pd2  reason: default package */
public interface pd2 extends de2, ReadableByteChannel {
    long A0(ce2 ce2);

    long H();

    void H0(long j);

    String I(long j);

    long J0(byte b);

    long K0();

    boolean S(long j, qd2 qd2);

    String T(Charset charset);

    nd2 d();

    void e(long j);

    InputStream f();

    boolean f0(long j);

    String l0();

    qd2 n(long j);

    int n0();

    byte[] o0(long j);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    short readShort();

    boolean v();

    short w0();
}
