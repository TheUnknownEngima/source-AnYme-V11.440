package defpackage;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: hr  reason: default package */
final class hr {
    private final a a;
    private int b;
    private long c;
    private long d;
    private long e;
    private long f;

    @TargetApi(19)
    /* renamed from: hr$a */
    private static final class a {
        private final AudioTrack a;
        private final AudioTimestamp b = new AudioTimestamp();
        private long c;
        private long d;
        private long e;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }

        public long a() {
            return this.e;
        }

        public long b() {
            return this.b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.a.getTimestamp(this.b);
            if (timestamp) {
                long j = this.b.framePosition;
                if (this.d > j) {
                    this.c++;
                }
                this.d = j;
                this.e = j + (this.c << 32);
            }
            return timestamp;
        }
    }

    public hr(AudioTrack audioTrack) {
        if (v50.a >= 19) {
            this.a = new a(audioTrack);
            g();
            return;
        }
        this.a = null;
        h(3);
    }

    private void h(int i) {
        this.b = i;
        long j = 10000;
        if (i == 0) {
            this.e = 0;
            this.f = -1;
            this.c = System.nanoTime() / 1000;
        } else if (i != 1) {
            if (i == 2 || i == 3) {
                j = 10000000;
            } else if (i == 4) {
                j = 500000;
            } else {
                throw new IllegalStateException();
            }
        }
        this.d = j;
    }

    public void a() {
        if (this.b == 4) {
            g();
        }
    }

    public long b() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1;
    }

    public long c() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.b == 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r0 != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r0 == false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(long r8) {
        /*
            r7 = this;
            hr$a r0 = r7.a
            r1 = 0
            if (r0 == 0) goto L_0x0071
            long r2 = r7.e
            long r2 = r8 - r2
            long r4 = r7.d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0010
            goto L_0x0071
        L_0x0010:
            r7.e = r8
            boolean r0 = r0.c()
            int r2 = r7.b
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L_0x0049
            r8 = 2
            if (r2 == r4) goto L_0x0033
            if (r2 == r8) goto L_0x0030
            if (r2 == r3) goto L_0x002d
            r8 = 4
            if (r2 != r8) goto L_0x0027
            goto L_0x0070
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x002d:
            if (r0 == 0) goto L_0x0070
            goto L_0x0045
        L_0x0030:
            if (r0 != 0) goto L_0x0070
            goto L_0x0045
        L_0x0033:
            if (r0 == 0) goto L_0x0045
            hr$a r9 = r7.a
            long r1 = r9.a()
            long r3 = r7.f
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x0070
            r7.h(r8)
            goto L_0x0070
        L_0x0045:
            r7.g()
            goto L_0x0070
        L_0x0049:
            if (r0 == 0) goto L_0x0063
            hr$a r8 = r7.a
            long r8 = r8.b()
            long r2 = r7.c
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0071
            hr$a r8 = r7.a
            long r8 = r8.a()
            r7.f = r8
            r7.h(r4)
            goto L_0x0070
        L_0x0063:
            long r1 = r7.c
            long r8 = r8 - r1
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0070
            r7.h(r3)
        L_0x0070:
            r1 = r0
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr.e(long):boolean");
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.a != null) {
            h(0);
        }
    }
}
