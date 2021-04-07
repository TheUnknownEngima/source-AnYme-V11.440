package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.v;
import java.lang.reflect.Method;

/* renamed from: ir  reason: default package */
final class ir {
    private long A;
    private boolean B;
    private long C;
    private long D;
    private final a a;
    private final long[] b;
    private AudioTrack c;
    private int d;
    private int e;
    private hr f;
    private int g;
    private boolean h;
    private long i;
    private long j;
    private long k;
    private Method l;
    private long m;
    private boolean n;
    private boolean o;
    private long p;
    private long q;
    private long r;
    private long s;
    private int t;
    private int u;
    private long v;
    private long w;
    private long x;
    private long y;
    private long z;

    /* renamed from: ir$a */
    public interface a {
        void a(int i, long j);

        void b(long j);

        void c(long j, long j2, long j3, long j4);

        void d(long j, long j2, long j3, long j4);
    }

    public ir(a aVar) {
        q40.e(aVar);
        this.a = aVar;
        if (v50.a >= 18) {
            try {
                this.l = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    private boolean a() {
        if (this.h) {
            AudioTrack audioTrack = this.c;
            q40.e(audioTrack);
            return audioTrack.getPlayState() == 2 && e() == 0;
        }
    }

    private long b(long j2) {
        return (j2 * 1000000) / ((long) this.g);
    }

    private long e() {
        AudioTrack audioTrack = this.c;
        q40.e(audioTrack);
        AudioTrack audioTrack2 = audioTrack;
        if (this.v != -9223372036854775807L) {
            return Math.min(this.y, this.x + ((((SystemClock.elapsedRealtime() * 1000) - this.v) * ((long) this.g)) / 1000000));
        }
        int playState = audioTrack2.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack2.getPlaybackHeadPosition());
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.s = this.q;
            }
            playbackHeadPosition += this.s;
        }
        if (v50.a <= 29) {
            if (playbackHeadPosition == 0 && this.q > 0 && playState == 3) {
                if (this.w == -9223372036854775807L) {
                    this.w = SystemClock.elapsedRealtime();
                }
                return this.q;
            }
            this.w = -9223372036854775807L;
        }
        if (this.q > playbackHeadPosition) {
            this.r++;
        }
        this.q = playbackHeadPosition;
        return playbackHeadPosition + (this.r << 32);
    }

    private long f() {
        return b(e());
    }

    private void l(long j2, long j3) {
        hr hrVar = this.f;
        q40.e(hrVar);
        hr hrVar2 = hrVar;
        if (hrVar2.e(j2)) {
            long c2 = hrVar2.c();
            long b2 = hrVar2.b();
            if (Math.abs(c2 - j2) > 5000000) {
                this.a.d(b2, c2, j2, j3);
            } else if (Math.abs(b(b2) - j3) > 5000000) {
                this.a.c(b2, c2, j2, j3);
            } else {
                hrVar2.a();
                return;
            }
            hrVar2.f();
        }
    }

    private void m() {
        long f2 = f();
        if (f2 != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.k >= 30000) {
                long[] jArr = this.b;
                int i2 = this.t;
                jArr[i2] = f2 - nanoTime;
                this.t = (i2 + 1) % 10;
                int i3 = this.u;
                if (i3 < 10) {
                    this.u = i3 + 1;
                }
                this.k = nanoTime;
                this.j = 0;
                int i4 = 0;
                while (true) {
                    int i5 = this.u;
                    if (i4 >= i5) {
                        break;
                    }
                    this.j += this.b[i4] / ((long) i5);
                    i4++;
                }
            }
            if (!this.h) {
                l(nanoTime, f2);
                n(nanoTime);
            }
        }
    }

    private void n(long j2) {
        Method method;
        if (this.o && (method = this.l) != null && j2 - this.p >= 500000) {
            try {
                AudioTrack audioTrack = this.c;
                q40.e(audioTrack);
                Integer num = (Integer) method.invoke(audioTrack, new Object[0]);
                v50.g(num);
                long intValue = (((long) num.intValue()) * 1000) - this.i;
                this.m = intValue;
                long max = Math.max(intValue, 0);
                this.m = max;
                if (max > 5000000) {
                    this.a.b(max);
                    this.m = 0;
                }
            } catch (Exception unused) {
                this.l = null;
            }
            this.p = j2;
        }
    }

    private static boolean o(int i2) {
        return v50.a < 23 && (i2 == 5 || i2 == 6);
    }

    private void r() {
        this.j = 0;
        this.u = 0;
        this.t = 0;
        this.k = 0;
        this.A = 0;
        this.D = 0;
    }

    public int c(long j2) {
        return this.e - ((int) (j2 - (e() * ((long) this.d))));
    }

    public long d(boolean z2) {
        long j2;
        AudioTrack audioTrack = this.c;
        q40.e(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            m();
        }
        long nanoTime = System.nanoTime() / 1000;
        hr hrVar = this.f;
        q40.e(hrVar);
        hr hrVar2 = hrVar;
        boolean d2 = hrVar2.d();
        if (d2) {
            j2 = b(hrVar2.b()) + (nanoTime - hrVar2.c());
        } else {
            j2 = this.u == 0 ? f() : this.j + nanoTime;
            if (!z2) {
                j2 = Math.max(0, j2 - this.m);
            }
        }
        if (this.B != d2) {
            this.D = this.A;
            this.C = this.z;
        }
        long j3 = nanoTime - this.D;
        if (j3 < 1000000) {
            long j4 = this.C + j3;
            long j5 = (j3 * 1000) / 1000000;
            j2 = ((j2 * j5) + ((1000 - j5) * j4)) / 1000;
        }
        this.A = nanoTime;
        this.z = j2;
        this.B = d2;
        return j2;
    }

    public void g(long j2) {
        this.x = e();
        this.v = SystemClock.elapsedRealtime() * 1000;
        this.y = j2;
    }

    public boolean h(long j2) {
        return j2 > e() || a();
    }

    public boolean i() {
        AudioTrack audioTrack = this.c;
        q40.e(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public boolean j(long j2) {
        return this.w != -9223372036854775807L && j2 > 0 && SystemClock.elapsedRealtime() - this.w >= 200;
    }

    public boolean k(long j2) {
        a aVar;
        AudioTrack audioTrack = this.c;
        q40.e(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.n = false;
                return false;
            } else if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z2 = this.n;
        boolean h2 = h(j2);
        this.n = h2;
        if (z2 && !h2 && playState != 1 && (aVar = this.a) != null) {
            aVar.a(this.e, v.b(this.i));
        }
        return true;
    }

    public boolean p() {
        r();
        if (this.v != -9223372036854775807L) {
            return false;
        }
        hr hrVar = this.f;
        q40.e(hrVar);
        hrVar.g();
        return true;
    }

    public void q() {
        r();
        this.c = null;
        this.f = null;
    }

    public void s(AudioTrack audioTrack, int i2, int i3, int i4) {
        this.c = audioTrack;
        this.d = i3;
        this.e = i4;
        this.f = new hr(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.h = o(i2);
        boolean f0 = v50.f0(i2);
        this.o = f0;
        this.i = f0 ? b((long) (i4 / i3)) : -9223372036854775807L;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.n = false;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.p = 0;
        this.m = 0;
    }

    public void t() {
        hr hrVar = this.f;
        q40.e(hrVar);
        hrVar.g();
    }
}
