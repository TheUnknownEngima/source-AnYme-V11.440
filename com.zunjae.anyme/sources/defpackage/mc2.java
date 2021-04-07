package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: mc2  reason: default package */
final class mc2 {
    static final lc2[] a = {new lc2(lc2.i, ""), new lc2(lc2.f, "GET"), new lc2(lc2.f, "POST"), new lc2(lc2.g, "/"), new lc2(lc2.g, "/index.html"), new lc2(lc2.h, "http"), new lc2(lc2.h, "https"), new lc2(lc2.e, "200"), new lc2(lc2.e, "204"), new lc2(lc2.e, "206"), new lc2(lc2.e, "304"), new lc2(lc2.e, "400"), new lc2(lc2.e, "404"), new lc2(lc2.e, "500"), new lc2("accept-charset", ""), new lc2("accept-encoding", "gzip, deflate"), new lc2("accept-language", ""), new lc2("accept-ranges", ""), new lc2("accept", ""), new lc2("access-control-allow-origin", ""), new lc2("age", ""), new lc2("allow", ""), new lc2("authorization", ""), new lc2("cache-control", ""), new lc2("content-disposition", ""), new lc2("content-encoding", ""), new lc2("content-language", ""), new lc2("content-length", ""), new lc2("content-location", ""), new lc2("content-range", ""), new lc2("content-type", ""), new lc2("cookie", ""), new lc2("date", ""), new lc2("etag", ""), new lc2("expect", ""), new lc2("expires", ""), new lc2("from", ""), new lc2("host", ""), new lc2("if-match", ""), new lc2("if-modified-since", ""), new lc2("if-none-match", ""), new lc2("if-range", ""), new lc2("if-unmodified-since", ""), new lc2("last-modified", ""), new lc2("link", ""), new lc2("location", ""), new lc2("max-forwards", ""), new lc2("proxy-authenticate", ""), new lc2("proxy-authorization", ""), new lc2("range", ""), new lc2("referer", ""), new lc2("refresh", ""), new lc2("retry-after", ""), new lc2("server", ""), new lc2("set-cookie", ""), new lc2("strict-transport-security", ""), new lc2("transfer-encoding", ""), new lc2("user-agent", ""), new lc2("vary", ""), new lc2("via", ""), new lc2("www-authenticate", "")};
    static final Map<qd2, Integer> b = b();

    /* renamed from: mc2$a */
    static final class a {
        private final List<lc2> a;
        private final pd2 b;
        private final int c;
        private int d;
        lc2[] e;
        int f;
        int g;
        int h;

        a(int i, int i2, de2 de2) {
            this.a = new ArrayList();
            lc2[] lc2Arr = new lc2[8];
            this.e = lc2Arr;
            this.f = lc2Arr.length - 1;
            this.g = 0;
            this.h = 0;
            this.c = i;
            this.d = i2;
            this.b = wd2.d(de2);
        }

        a(int i, de2 de2) {
            this(i, i, de2);
        }

        private void a() {
            int i = this.d;
            int i2 = this.h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                b();
            } else {
                d(i2 - i);
            }
        }

        private void b() {
            Arrays.fill(this.e, (Object) null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        private int c(int i) {
            return this.f + 1 + i;
        }

        private int d(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    if (length < this.f || i <= 0) {
                        lc2[] lc2Arr = this.e;
                        int i3 = this.f;
                        System.arraycopy(lc2Arr, i3 + 1, lc2Arr, i3 + 1 + i2, this.g);
                        this.f += i2;
                    } else {
                        lc2[] lc2Arr2 = this.e;
                        i -= lc2Arr2[length].c;
                        this.h -= lc2Arr2[length].c;
                        this.g--;
                        i2++;
                    }
                }
                lc2[] lc2Arr3 = this.e;
                int i32 = this.f;
                System.arraycopy(lc2Arr3, i32 + 1, lc2Arr3, i32 + 1 + i2, this.g);
                this.f += i2;
            }
            return i2;
        }

        private qd2 f(int i) {
            lc2 lc2;
            if (h(i)) {
                lc2 = mc2.a[i];
            } else {
                int c2 = c(i - mc2.a.length);
                if (c2 >= 0) {
                    lc2[] lc2Arr = this.e;
                    if (c2 < lc2Arr.length) {
                        lc2 = lc2Arr[c2];
                    }
                }
                throw new IOException("Header index too large " + (i + 1));
            }
            return lc2.a;
        }

        private void g(int i, lc2 lc2) {
            this.a.add(lc2);
            int i2 = lc2.c;
            if (i != -1) {
                i2 -= this.e[c(i)].c;
            }
            int i3 = this.d;
            if (i2 > i3) {
                b();
                return;
            }
            int d2 = d((this.h + i2) - i3);
            if (i == -1) {
                int i4 = this.g + 1;
                lc2[] lc2Arr = this.e;
                if (i4 > lc2Arr.length) {
                    lc2[] lc2Arr2 = new lc2[(lc2Arr.length * 2)];
                    System.arraycopy(lc2Arr, 0, lc2Arr2, lc2Arr.length, lc2Arr.length);
                    this.f = this.e.length - 1;
                    this.e = lc2Arr2;
                }
                int i5 = this.f;
                this.f = i5 - 1;
                this.e[i5] = lc2;
                this.g++;
            } else {
                this.e[i + c(i) + d2] = lc2;
            }
            this.h += i2;
        }

        private boolean h(int i) {
            return i >= 0 && i <= mc2.a.length - 1;
        }

        private int i() {
            return this.b.readByte() & 255;
        }

        private void l(int i) {
            if (h(i)) {
                this.a.add(mc2.a[i]);
                return;
            }
            int c2 = c(i - mc2.a.length);
            if (c2 >= 0) {
                lc2[] lc2Arr = this.e;
                if (c2 < lc2Arr.length) {
                    this.a.add(lc2Arr[c2]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private void n(int i) {
            g(-1, new lc2(f(i), j()));
        }

        private void o() {
            qd2 j = j();
            mc2.a(j);
            g(-1, new lc2(j, j()));
        }

        private void p(int i) {
            this.a.add(new lc2(f(i), j()));
        }

        private void q() {
            qd2 j = j();
            mc2.a(j);
            this.a.add(new lc2(j, j()));
        }

        public List<lc2> e() {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        public qd2 j() {
            int i = i();
            boolean z = (i & 128) == 128;
            int m = m(i, 127);
            return z ? qd2.t(tc2.f().c(this.b.o0((long) m))) : this.b.n((long) m);
        }

        /* access modifiers changed from: package-private */
        public void k() {
            while (!this.b.v()) {
                byte readByte = this.b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    l(m(readByte, 127) - 1);
                } else if (readByte == 64) {
                    o();
                } else if ((readByte & 64) == 64) {
                    n(m(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m = m(readByte, 31);
                    this.d = m;
                    if (m < 0 || m > this.c) {
                        throw new IOException("Invalid dynamic table size update " + this.d);
                    }
                    a();
                } else if (readByte == 16 || readByte == 0) {
                    q();
                } else {
                    p(m(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int m(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: mc2$b */
    static final class b {
        private final nd2 a;
        private final boolean b;
        private int c;
        private boolean d;
        int e;
        lc2[] f;
        int g;
        int h;
        int i;

        b(int i2, boolean z, nd2 nd2) {
            this.c = Integer.MAX_VALUE;
            lc2[] lc2Arr = new lc2[8];
            this.f = lc2Arr;
            this.g = lc2Arr.length - 1;
            this.h = 0;
            this.i = 0;
            this.e = i2;
            this.b = z;
            this.a = nd2;
        }

        b(nd2 nd2) {
            this(4096, true, nd2);
        }

        private void a() {
            int i2 = this.e;
            int i3 = this.i;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                b();
            } else {
                c(i3 - i2);
            }
        }

        private void b() {
            Arrays.fill(this.f, (Object) null);
            this.g = this.f.length - 1;
            this.h = 0;
            this.i = 0;
        }

        private int c(int i2) {
            int i3 = 0;
            if (i2 > 0) {
                int length = this.f.length;
                while (true) {
                    length--;
                    if (length < this.g || i2 <= 0) {
                        lc2[] lc2Arr = this.f;
                        int i4 = this.g;
                        System.arraycopy(lc2Arr, i4 + 1, lc2Arr, i4 + 1 + i3, this.h);
                        lc2[] lc2Arr2 = this.f;
                        int i5 = this.g;
                        Arrays.fill(lc2Arr2, i5 + 1, i5 + 1 + i3, (Object) null);
                        this.g += i3;
                    } else {
                        lc2[] lc2Arr3 = this.f;
                        i2 -= lc2Arr3[length].c;
                        this.i -= lc2Arr3[length].c;
                        this.h--;
                        i3++;
                    }
                }
                lc2[] lc2Arr4 = this.f;
                int i42 = this.g;
                System.arraycopy(lc2Arr4, i42 + 1, lc2Arr4, i42 + 1 + i3, this.h);
                lc2[] lc2Arr22 = this.f;
                int i52 = this.g;
                Arrays.fill(lc2Arr22, i52 + 1, i52 + 1 + i3, (Object) null);
                this.g += i3;
            }
            return i3;
        }

        private void d(lc2 lc2) {
            int i2 = lc2.c;
            int i3 = this.e;
            if (i2 > i3) {
                b();
                return;
            }
            c((this.i + i2) - i3);
            int i4 = this.h + 1;
            lc2[] lc2Arr = this.f;
            if (i4 > lc2Arr.length) {
                lc2[] lc2Arr2 = new lc2[(lc2Arr.length * 2)];
                System.arraycopy(lc2Arr, 0, lc2Arr2, lc2Arr.length, lc2Arr.length);
                this.g = this.f.length - 1;
                this.f = lc2Arr2;
            }
            int i5 = this.g;
            this.g = i5 - 1;
            this.f[i5] = lc2;
            this.h++;
            this.i += i2;
        }

        /* access modifiers changed from: package-private */
        public void e(int i2) {
            int min = Math.min(i2, 16384);
            int i3 = this.e;
            if (i3 != min) {
                if (min < i3) {
                    this.c = Math.min(this.c, min);
                }
                this.d = true;
                this.e = min;
                a();
            }
        }

        /* access modifiers changed from: package-private */
        public void f(qd2 qd2) {
            int i2;
            int i3;
            if (!this.b || tc2.f().e(qd2) >= qd2.A()) {
                i3 = qd2.A();
                i2 = 0;
            } else {
                nd2 nd2 = new nd2();
                tc2.f().d(qd2, nd2);
                qd2 = nd2.V();
                i3 = qd2.A();
                i2 = 128;
            }
            h(i3, 127, i2);
            this.a.v0(qd2);
        }

        /* access modifiers changed from: package-private */
        public void g(List<lc2> list) {
            int i2;
            int i3;
            if (this.d) {
                int i4 = this.c;
                if (i4 < this.e) {
                    h(i4, 31, 32);
                }
                this.d = false;
                this.c = Integer.MAX_VALUE;
                h(this.e, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                lc2 lc2 = list.get(i5);
                qd2 E = lc2.a.E();
                qd2 qd2 = lc2.b;
                Integer num = mc2.b.get(E);
                if (num != null) {
                    i3 = num.intValue() + 1;
                    if (i3 > 1 && i3 < 8) {
                        if (ib2.q(mc2.a[i3 - 1].b, qd2)) {
                            i2 = i3;
                        } else if (ib2.q(mc2.a[i3].b, qd2)) {
                            i2 = i3;
                            i3++;
                        }
                    }
                    i2 = i3;
                    i3 = -1;
                } else {
                    i3 = -1;
                    i2 = -1;
                }
                if (i3 == -1) {
                    int i6 = this.g + 1;
                    int length = this.f.length;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        if (ib2.q(this.f[i6].a, E)) {
                            if (ib2.q(this.f[i6].b, qd2)) {
                                i3 = mc2.a.length + (i6 - this.g);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i6 - this.g) + mc2.a.length;
                            }
                        }
                        i6++;
                    }
                }
                if (i3 != -1) {
                    h(i3, 127, 128);
                } else {
                    if (i2 == -1) {
                        this.a.F0(64);
                        f(E);
                    } else if (!E.B(lc2.d) || lc2.i.equals(E)) {
                        h(i2, 63, 64);
                    } else {
                        h(i2, 15, 0);
                        f(qd2);
                    }
                    f(qd2);
                    d(lc2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i2, int i3, int i4) {
            int i5;
            nd2 nd2;
            if (i2 < i3) {
                nd2 = this.a;
                i5 = i2 | i4;
            } else {
                this.a.F0(i4 | i3);
                i5 = i2 - i3;
                while (i5 >= 128) {
                    this.a.F0(128 | (i5 & 127));
                    i5 >>>= 7;
                }
                nd2 = this.a;
            }
            nd2.F0(i5);
        }
    }

    static qd2 a(qd2 qd2) {
        int A = qd2.A();
        int i = 0;
        while (i < A) {
            byte q = qd2.q(i);
            if (q < 65 || q > 90) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + qd2.G());
            }
        }
        return qd2;
    }

    private static Map<qd2, Integer> b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        int i = 0;
        while (true) {
            lc2[] lc2Arr = a;
            if (i >= lc2Arr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(lc2Arr[i].a)) {
                linkedHashMap.put(a[i].a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
