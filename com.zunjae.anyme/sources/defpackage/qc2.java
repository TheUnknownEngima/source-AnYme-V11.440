package defpackage;

import defpackage.mc2;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: qc2  reason: default package */
final class qc2 implements Closeable {
    static final Logger i = Logger.getLogger(nc2.class.getName());
    private final pd2 e;
    private final a f;
    private final boolean g;
    final mc2.a h;

    /* renamed from: qc2$a */
    static final class a implements de2 {
        private final pd2 e;
        int f;
        byte g;
        int h;
        int i;
        short j;

        a(pd2 pd2) {
            this.e = pd2;
        }

        private void a() {
            int i2 = this.h;
            int r = qc2.r(this.e);
            this.i = r;
            this.f = r;
            byte readByte = (byte) (this.e.readByte() & 255);
            this.g = (byte) (this.e.readByte() & 255);
            if (qc2.i.isLoggable(Level.FINE)) {
                qc2.i.fine(nc2.b(true, this.h, this.f, readByte, this.g));
            }
            int readInt = this.e.readInt() & Integer.MAX_VALUE;
            this.h = readInt;
            if (readByte != 9) {
                nc2.d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                throw null;
            } else if (readInt != i2) {
                nc2.d("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }

        public ee2 c() {
            return this.e.c();
        }

        public void close() {
        }

        public long y0(nd2 nd2, long j2) {
            while (true) {
                int i2 = this.i;
                if (i2 == 0) {
                    this.e.e((long) this.j);
                    this.j = 0;
                    if ((this.g & 4) != 0) {
                        return -1;
                    }
                    a();
                } else {
                    long y0 = this.e.y0(nd2, Math.min(j2, (long) i2));
                    if (y0 == -1) {
                        return -1;
                    }
                    this.i = (int) (((long) this.i) - y0);
                    return y0;
                }
            }
        }
    }

    /* renamed from: qc2$b */
    interface b {
        void a();

        void b(boolean z, vc2 vc2);

        void c(boolean z, int i, int i2, List<lc2> list);

        void d(int i, long j);

        void e(boolean z, int i, pd2 pd2, int i2);

        void f(boolean z, int i, int i2);

        void g(int i, int i2, int i3, boolean z);

        void h(int i, kc2 kc2);

        void i(int i, int i2, List<lc2> list);

        void j(int i, kc2 kc2, qd2 qd2);
    }

    qc2(pd2 pd2, boolean z) {
        this.e = pd2;
        this.g = z;
        a aVar = new a(pd2);
        this.f = aVar;
        this.h = new mc2.a(4096, aVar);
    }

    private void A(b bVar, int i2, byte b2, int i3) {
        if (i2 != 5) {
            nc2.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i2));
            throw null;
        } else if (i3 != 0) {
            z(bVar, i3);
        } else {
            nc2.d("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void B(b bVar, int i2, byte b2, int i3) {
        short s = 0;
        if (i3 != 0) {
            if ((b2 & 8) != 0) {
                s = (short) (this.e.readByte() & 255);
            }
            bVar.i(i3, this.e.readInt() & Integer.MAX_VALUE, l(a(i2 - 4, b2, s), s, b2, i3));
            return;
        }
        nc2.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    private void C(b bVar, int i2, byte b2, int i3) {
        if (i2 != 4) {
            nc2.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i2));
            throw null;
        } else if (i3 != 0) {
            int readInt = this.e.readInt();
            kc2 fromHttp2 = kc2.fromHttp2(readInt);
            if (fromHttp2 != null) {
                bVar.h(i3, fromHttp2);
                return;
            }
            nc2.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        } else {
            nc2.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void E(b bVar, int i2, byte b2, int i3) {
        if (i3 != 0) {
            nc2.d("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        } else if ((b2 & 1) != 0) {
            if (i2 == 0) {
                bVar.a();
            } else {
                nc2.d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        } else if (i2 % 6 == 0) {
            vc2 vc2 = new vc2();
            for (int i4 = 0; i4 < i2; i4 += 6) {
                short readShort = this.e.readShort() & 65535;
                int readInt = this.e.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort == 4) {
                        readShort = 7;
                        if (readInt < 0) {
                            nc2.d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                    } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                        nc2.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                        throw null;
                    }
                } else if (!(readInt == 0 || readInt == 1)) {
                    nc2.d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    throw null;
                }
                vc2.i(readShort, readInt);
            }
            bVar.b(false, vc2);
        } else {
            nc2.d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i2));
            throw null;
        }
    }

    private void F(b bVar, int i2, byte b2, int i3) {
        if (i2 == 4) {
            long readInt = ((long) this.e.readInt()) & 2147483647L;
            if (readInt != 0) {
                bVar.d(i3, readInt);
                return;
            }
            nc2.d("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        nc2.d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i2));
        throw null;
    }

    static int a(int i2, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        nc2.d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2));
        throw null;
    }

    private void i(b bVar, int i2, byte b2, int i3) {
        short s = 0;
        if (i3 != 0) {
            boolean z = true;
            boolean z2 = (b2 & 1) != 0;
            if ((b2 & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b2 & 8) != 0) {
                    s = (short) (this.e.readByte() & 255);
                }
                bVar.e(z2, i3, this.e, a(i2, b2, s));
                this.e.e((long) s);
                return;
            }
            nc2.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        nc2.d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        throw null;
    }

    private void k(b bVar, int i2, byte b2, int i3) {
        if (i2 < 8) {
            nc2.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 == 0) {
            int readInt = this.e.readInt();
            int readInt2 = this.e.readInt();
            int i4 = i2 - 8;
            kc2 fromHttp2 = kc2.fromHttp2(readInt2);
            if (fromHttp2 != null) {
                qd2 qd2 = qd2.i;
                if (i4 > 0) {
                    qd2 = this.e.n((long) i4);
                }
                bVar.j(readInt, fromHttp2, qd2);
                return;
            }
            nc2.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            nc2.d("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    private List<lc2> l(int i2, short s, byte b2, int i3) {
        a aVar = this.f;
        aVar.i = i2;
        aVar.f = i2;
        aVar.j = s;
        aVar.g = b2;
        aVar.h = i3;
        this.h.k();
        return this.h.e();
    }

    private void m(b bVar, int i2, byte b2, int i3) {
        short s = 0;
        if (i3 != 0) {
            boolean z = (b2 & 1) != 0;
            if ((b2 & 8) != 0) {
                s = (short) (this.e.readByte() & 255);
            }
            if ((b2 & 32) != 0) {
                z(bVar, i3);
                i2 -= 5;
            }
            bVar.c(z, i3, -1, l(a(i2, b2, s), s, b2, i3));
            return;
        }
        nc2.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    static int r(pd2 pd2) {
        return (pd2.readByte() & 255) | ((pd2.readByte() & 255) << 16) | ((pd2.readByte() & 255) << 8);
    }

    private void t(b bVar, int i2, byte b2, int i3) {
        boolean z = false;
        if (i2 != 8) {
            nc2.d("TYPE_PING length != 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 == 0) {
            int readInt = this.e.readInt();
            int readInt2 = this.e.readInt();
            if ((b2 & 1) != 0) {
                z = true;
            }
            bVar.f(z, readInt, readInt2);
        } else {
            nc2.d("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    private void z(b bVar, int i2) {
        int readInt = this.e.readInt();
        bVar.g(i2, readInt & Integer.MAX_VALUE, (this.e.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    public boolean b(boolean z, b bVar) {
        try {
            this.e.H0(9);
            int r = r(this.e);
            if (r < 0 || r > 16384) {
                nc2.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(r));
                throw null;
            }
            byte readByte = (byte) (this.e.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.e.readByte() & 255);
                int readInt = this.e.readInt() & Integer.MAX_VALUE;
                if (i.isLoggable(Level.FINE)) {
                    i.fine(nc2.b(true, readInt, r, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        i(bVar, r, readByte2, readInt);
                        break;
                    case 1:
                        m(bVar, r, readByte2, readInt);
                        break;
                    case 2:
                        A(bVar, r, readByte2, readInt);
                        break;
                    case 3:
                        C(bVar, r, readByte2, readInt);
                        break;
                    case 4:
                        E(bVar, r, readByte2, readInt);
                        break;
                    case 5:
                        B(bVar, r, readByte2, readInt);
                        break;
                    case 6:
                        t(bVar, r, readByte2, readInt);
                        break;
                    case 7:
                        k(bVar, r, readByte2, readInt);
                        break;
                    case 8:
                        F(bVar, r, readByte2, readInt);
                        break;
                    default:
                        this.e.e((long) r);
                        break;
                }
                return true;
            }
            nc2.d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            throw null;
        } catch (IOException unused) {
            return false;
        }
    }

    public void close() {
        this.e.close();
    }

    public void h(b bVar) {
        if (!this.g) {
            qd2 n = this.e.n((long) nc2.a.A());
            if (i.isLoggable(Level.FINE)) {
                i.fine(ib2.r("<< CONNECTION %s", n.r()));
            }
            if (!nc2.a.equals(n)) {
                nc2.d("Expected a connection header but was %s", n.G());
                throw null;
            }
        } else if (!b(true, bVar)) {
            nc2.d("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }
}
