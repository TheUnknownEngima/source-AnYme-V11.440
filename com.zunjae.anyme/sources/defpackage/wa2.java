package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

/* renamed from: wa2  reason: default package */
public final class wa2 extends bb2 {
    public static final va2 e = va2.c("multipart/mixed");
    public static final va2 f = va2.c("multipart/form-data");
    private static final byte[] g = {58, 32};
    private static final byte[] h = {13, 10};
    private static final byte[] i = {45, 45};
    private final qd2 a;
    private final va2 b;
    private final List<b> c;
    private long d = -1;

    /* renamed from: wa2$a */
    public static final class a {
        private final qd2 a;
        private va2 b;
        private final List<b> c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        public a(String str) {
            this.b = wa2.e;
            this.c = new ArrayList();
            this.a = qd2.m(str);
        }

        public a a(String str, String str2) {
            d(b.b(str, str2));
            return this;
        }

        public a b(String str, @Nullable String str2, bb2 bb2) {
            d(b.c(str, str2, bb2));
            return this;
        }

        public a c(@Nullable sa2 sa2, bb2 bb2) {
            d(b.a(sa2, bb2));
            return this;
        }

        public a d(b bVar) {
            if (bVar != null) {
                this.c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        public wa2 e() {
            if (!this.c.isEmpty()) {
                return new wa2(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public a f(va2 va2) {
            if (va2 == null) {
                throw new NullPointerException("type == null");
            } else if (va2.e().equals("multipart")) {
                this.b = va2;
                return this;
            } else {
                throw new IllegalArgumentException("multipart != " + va2);
            }
        }
    }

    /* renamed from: wa2$b */
    public static final class b {
        @Nullable
        final sa2 a;
        final bb2 b;

        private b(@Nullable sa2 sa2, bb2 bb2) {
            this.a = sa2;
            this.b = bb2;
        }

        public static b a(@Nullable sa2 sa2, bb2 bb2) {
            if (bb2 == null) {
                throw new NullPointerException("body == null");
            } else if (sa2 != null && sa2.c("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (sa2 == null || sa2.c("Content-Length") == null) {
                return new b(sa2, bb2);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        public static b b(String str, String str2) {
            return c(str, (String) null, bb2.d((va2) null, str2));
        }

        public static b c(String str, @Nullable String str2, bb2 bb2) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                wa2.i(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    wa2.i(sb, str2);
                }
                return a(sa2.g("Content-Disposition", sb.toString()), bb2);
            }
            throw new NullPointerException("name == null");
        }
    }

    static {
        va2.c("multipart/alternative");
        va2.c("multipart/digest");
        va2.c("multipart/parallel");
    }

    wa2(qd2 qd2, va2 va2, List<b> list) {
        this.a = qd2;
        this.b = va2.c(va2 + "; boundary=" + qd2.G());
        this.c = ib2.t(list);
    }

    static StringBuilder i(StringBuilder sb, String str) {
        String str2;
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == 10) {
                str2 = "%0A";
            } else if (charAt == 13) {
                str2 = "%0D";
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                str2 = "%22";
            }
            sb.append(str2);
        }
        sb.append('\"');
        return sb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: od2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: nd2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: nd2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: od2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: nd2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long j(@javax.annotation.Nullable defpackage.od2 r13, boolean r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            nd2 r13 = new nd2
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<wa2$b> r1 = r12.c
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0014:
            if (r5 >= r1) goto L_0x00a6
            java.util.List<wa2$b> r6 = r12.c
            java.lang.Object r6 = r6.get(r5)
            wa2$b r6 = (defpackage.wa2.b) r6
            sa2 r7 = r6.a
            bb2 r6 = r6.b
            byte[] r8 = i
            r13.r0(r8)
            qd2 r8 = r12.a
            r13.t0(r8)
            byte[] r8 = h
            r13.r0(r8)
            if (r7 == 0) goto L_0x0058
            int r8 = r7.h()
            r9 = 0
        L_0x0038:
            if (r9 >= r8) goto L_0x0058
            java.lang.String r10 = r7.e(r9)
            od2 r10 = r13.O(r10)
            byte[] r11 = g
            od2 r10 = r10.r0(r11)
            java.lang.String r11 = r7.i(r9)
            od2 r10 = r10.O(r11)
            byte[] r11 = h
            r10.r0(r11)
            int r9 = r9 + 1
            goto L_0x0038
        L_0x0058:
            va2 r7 = r6.b()
            if (r7 == 0) goto L_0x0071
            java.lang.String r8 = "Content-Type: "
            od2 r8 = r13.O(r8)
            java.lang.String r7 = r7.toString()
            od2 r7 = r8.O(r7)
            byte[] r8 = h
            r7.r0(r8)
        L_0x0071:
            long r7 = r6.a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008b
            java.lang.String r9 = "Content-Length: "
            od2 r9 = r13.O(r9)
            od2 r9 = r9.I0(r7)
            byte[] r10 = h
            r9.r0(r10)
            goto L_0x0091
        L_0x008b:
            if (r14 == 0) goto L_0x0091
            r0.b()
            return r9
        L_0x0091:
            byte[] r9 = h
            r13.r0(r9)
            if (r14 == 0) goto L_0x009a
            long r3 = r3 + r7
            goto L_0x009d
        L_0x009a:
            r6.h(r13)
        L_0x009d:
            byte[] r6 = h
            r13.r0(r6)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00a6:
            byte[] r1 = i
            r13.r0(r1)
            qd2 r1 = r12.a
            r13.t0(r1)
            byte[] r1 = i
            r13.r0(r1)
            byte[] r1 = h
            r13.r0(r1)
            if (r14 == 0) goto L_0x00c4
            long r13 = r0.k0()
            long r3 = r3 + r13
            r0.b()
        L_0x00c4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa2.j(od2, boolean):long");
    }

    public long a() {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        long j2 = j((od2) null, true);
        this.d = j2;
        return j2;
    }

    public va2 b() {
        return this.b;
    }

    public void h(od2 od2) {
        j(od2, false);
    }
}
