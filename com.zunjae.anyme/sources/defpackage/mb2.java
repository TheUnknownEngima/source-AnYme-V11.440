package defpackage;

import defpackage.ab2;
import defpackage.cb2;
import defpackage.sa2;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: mb2  reason: default package */
public final class mb2 {
    @Nullable
    public final ab2 a;
    @Nullable
    public final cb2 b;

    /* renamed from: mb2$a */
    public static class a {
        final long a;
        final ab2 b;
        final cb2 c;
        private Date d;
        private String e;
        private Date f;
        private String g;
        private Date h;
        private long i;
        private long j;
        private String k;
        private int l = -1;

        public a(long j2, ab2 ab2, cb2 cb2) {
            this.a = j2;
            this.b = ab2;
            this.c = cb2;
            if (cb2 != null) {
                this.i = cb2.G();
                this.j = cb2.E();
                sa2 m = cb2.m();
                int h2 = m.h();
                for (int i2 = 0; i2 < h2; i2++) {
                    String e2 = m.e(i2);
                    String i3 = m.i(i2);
                    if ("Date".equalsIgnoreCase(e2)) {
                        this.d = ac2.b(i3);
                        this.e = i3;
                    } else if ("Expires".equalsIgnoreCase(e2)) {
                        this.h = ac2.b(i3);
                    } else if ("Last-Modified".equalsIgnoreCase(e2)) {
                        this.f = ac2.b(i3);
                        this.g = i3;
                    } else if ("ETag".equalsIgnoreCase(e2)) {
                        this.k = i3;
                    } else if ("Age".equalsIgnoreCase(e2)) {
                        this.l = bc2.f(i3, -1);
                    }
                }
            }
        }

        private long a() {
            Date date = this.d;
            long j2 = 0;
            if (date != null) {
                j2 = Math.max(0, this.j - date.getTime());
            }
            int i2 = this.l;
            if (i2 != -1) {
                j2 = Math.max(j2, TimeUnit.SECONDS.toMillis((long) i2));
            }
            long j3 = this.j;
            return j2 + (j3 - this.i) + (this.a - j3);
        }

        private long b() {
            da2 b2 = this.c.b();
            if (b2.d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) b2.d());
            }
            if (this.h != null) {
                Date date = this.d;
                long time = this.h.getTime() - (date != null ? date.getTime() : this.j);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f == null || this.c.F().j().A() != null) {
                return 0;
            } else {
                Date date2 = this.d;
                long time2 = (date2 != null ? date2.getTime() : this.i) - this.f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        private mb2 d() {
            if (this.c == null) {
                return new mb2(this.b, (cb2) null);
            }
            if (this.b.f() && this.c.i() == null) {
                return new mb2(this.b, (cb2) null);
            }
            if (!mb2.a(this.c, this.b)) {
                return new mb2(this.b, (cb2) null);
            }
            da2 b2 = this.b.b();
            if (b2.h() || e(this.b)) {
                return new mb2(this.b, (cb2) null);
            }
            da2 b3 = this.c.b();
            long a2 = a();
            long b4 = b();
            if (b2.d() != -1) {
                b4 = Math.min(b4, TimeUnit.SECONDS.toMillis((long) b2.d()));
            }
            long j2 = 0;
            long millis = b2.f() != -1 ? TimeUnit.SECONDS.toMillis((long) b2.f()) : 0;
            if (!b3.g() && b2.e() != -1) {
                j2 = TimeUnit.SECONDS.toMillis((long) b2.e());
            }
            if (!b3.h()) {
                long j3 = millis + a2;
                if (j3 < j2 + b4) {
                    cb2.a A = this.c.A();
                    if (j3 >= b4) {
                        A.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a2 > 86400000 && f()) {
                        A.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new mb2((ab2) null, A.c());
                }
            }
            String str = this.k;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f != null) {
                str = this.g;
            } else if (this.d == null) {
                return new mb2(this.b, (cb2) null);
            } else {
                str = this.e;
            }
            sa2.a f2 = this.b.e().f();
            gb2.a.b(f2, str2, str);
            ab2.a h2 = this.b.h();
            h2.e(f2.d());
            return new mb2(h2.b(), this.c);
        }

        private static boolean e(ab2 ab2) {
            return (ab2.c("If-Modified-Since") == null && ab2.c("If-None-Match") == null) ? false : true;
        }

        private boolean f() {
            return this.c.b().d() == -1 && this.h == null;
        }

        public mb2 c() {
            mb2 d2 = d();
            return (d2.a == null || !this.b.b().j()) ? d2 : new mb2((ab2) null, (cb2) null);
        }
    }

    mb2(ab2 ab2, cb2 cb2) {
        this.a = ab2;
        this.b = cb2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.b().b() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.cb2 r3, defpackage.ab2 r4) {
        /*
            int r0 = r3.h()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.k(r0)
            if (r0 != 0) goto L_0x005a
            da2 r0 = r3.b()
            int r0 = r0.d()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            da2 r0 = r3.b()
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x005a
            da2 r0 = r3.b()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            da2 r3 = r3.b()
            boolean r3 = r3.i()
            if (r3 != 0) goto L_0x006f
            da2 r3 = r4.b()
            boolean r3 = r3.i()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb2.a(cb2, ab2):boolean");
    }
}
