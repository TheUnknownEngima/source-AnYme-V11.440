package defpackage;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* renamed from: kd2  reason: default package */
public final class kd2 implements ua2 {
    private static final Charset d = Charset.forName("UTF-8");
    private final b a;
    private volatile Set<String> b;
    private volatile a c;

    /* renamed from: kd2$a */
    public enum a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* renamed from: kd2$b */
    public interface b {
        public static final b a = new a();

        /* renamed from: kd2$b$a */
        class a implements b {
            a() {
            }

            public void a(String str) {
                dd2.j().q(4, str, (Throwable) null);
            }
        }

        void a(String str);
    }

    public kd2() {
        this(b.a);
    }

    public kd2(b bVar) {
        this.b = Collections.emptySet();
        this.c = a.NONE;
        this.a = bVar;
    }

    private static boolean b(sa2 sa2) {
        String c2 = sa2.c("Content-Encoding");
        return c2 != null && !c2.equalsIgnoreCase("identity") && !c2.equalsIgnoreCase("gzip");
    }

    static boolean c(nd2 nd2) {
        try {
            nd2 nd22 = new nd2();
            nd2.A(nd22, 0, nd2.k0() < 64 ? nd2.k0() : 64);
            for (int i = 0; i < 16; i++) {
                if (nd22.v()) {
                    return true;
                }
                int g0 = nd22.g0();
                if (Character.isISOControl(g0) && !Character.isWhitespace(g0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    private void d(sa2 sa2, int i) {
        String i2 = this.b.contains(sa2.e(i)) ? "██" : sa2.i(i);
        b bVar = this.a;
        bVar.a(sa2.e(i) + ": " + i2);
    }

    /* JADX WARNING: type inference failed for: r2v22, types: [java.lang.Long] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02d8  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.cb2 a(defpackage.ua2.a r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            kd2$a r2 = r1.c
            ab2 r3 = r20.i()
            kd2$a r4 = defpackage.kd2.a.NONE
            if (r2 != r4) goto L_0x0013
            cb2 r0 = r0.c(r3)
            return r0
        L_0x0013:
            kd2$a r4 = defpackage.kd2.a.BODY
            r5 = 1
            if (r2 != r4) goto L_0x001a
            r4 = 1
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            if (r4 != 0) goto L_0x0024
            kd2$a r7 = defpackage.kd2.a.HEADERS
            if (r2 != r7) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r2 = 0
            goto L_0x0025
        L_0x0024:
            r2 = 1
        L_0x0025:
            bb2 r7 = r3.a()
            if (r7 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r5 = 0
        L_0x002d:
            ia2 r8 = r20.d()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "--> "
            r9.append(r10)
            java.lang.String r10 = r3.g()
            r9.append(r10)
            r10 = 32
            r9.append(r10)
            ta2 r11 = r3.j()
            r9.append(r11)
            java.lang.String r11 = ""
            if (r8 == 0) goto L_0x0068
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = " "
            r12.append(r13)
            ya2 r8 = r8.a()
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            goto L_0x0069
        L_0x0068:
            r8 = r11
        L_0x0069:
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "-byte body)"
            java.lang.String r12 = " ("
            if (r2 != 0) goto L_0x0091
            if (r5 == 0) goto L_0x0091
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r13.append(r12)
            long r14 = r7.a()
            r13.append(r14)
            r13.append(r9)
            java.lang.String r8 = r13.toString()
        L_0x0091:
            kd2$b r13 = r1.a
            r13.a(r8)
            java.lang.String r8 = "-byte body omitted)"
            r13 = -1
            if (r2 == 0) goto L_0x01b2
            if (r5 == 0) goto L_0x00e0
            va2 r15 = r7.b()
            if (r15 == 0) goto L_0x00be
            kd2$b r15 = r1.a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "Content-Type: "
            r6.append(r10)
            va2 r10 = r7.b()
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r15.a(r6)
        L_0x00be:
            long r16 = r7.a()
            int r6 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x00e0
            kd2$b r6 = r1.a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r15 = "Content-Length: "
            r10.append(r15)
            long r13 = r7.a()
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            r6.a(r10)
        L_0x00e0:
            sa2 r6 = r3.e()
            int r10 = r6.h()
            r13 = 0
        L_0x00e9:
            if (r13 >= r10) goto L_0x0105
            java.lang.String r14 = r6.e(r13)
            java.lang.String r15 = "Content-Type"
            boolean r15 = r15.equalsIgnoreCase(r14)
            if (r15 != 0) goto L_0x0102
            java.lang.String r15 = "Content-Length"
            boolean r14 = r15.equalsIgnoreCase(r14)
            if (r14 != 0) goto L_0x0102
            r1.d(r6, r13)
        L_0x0102:
            int r13 = r13 + 1
            goto L_0x00e9
        L_0x0105:
            java.lang.String r6 = "--> END "
            if (r4 == 0) goto L_0x019a
            if (r5 != 0) goto L_0x010d
            goto L_0x019a
        L_0x010d:
            sa2 r5 = r3.e()
            boolean r5 = b(r5)
            if (r5 == 0) goto L_0x012c
            kd2$b r5 = r1.a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = r3.g()
            r7.append(r6)
            java.lang.String r6 = " (encoded body omitted)"
            goto L_0x01a8
        L_0x012c:
            nd2 r5 = new nd2
            r5.<init>()
            r7.h(r5)
            java.nio.charset.Charset r10 = d
            va2 r13 = r7.b()
            if (r13 == 0) goto L_0x0142
            java.nio.charset.Charset r10 = d
            java.nio.charset.Charset r10 = r13.b(r10)
        L_0x0142:
            kd2$b r13 = r1.a
            r13.a(r11)
            boolean r13 = c(r5)
            if (r13 == 0) goto L_0x0175
            kd2$b r13 = r1.a
            java.lang.String r5 = r5.T(r10)
            r13.a(r5)
            kd2$b r5 = r1.a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = r3.g()
            r10.append(r6)
            r10.append(r12)
            long r6 = r7.a()
            r10.append(r6)
            r10.append(r9)
            goto L_0x0195
        L_0x0175:
            kd2$b r5 = r1.a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = r3.g()
            r10.append(r6)
            java.lang.String r6 = " (binary "
            r10.append(r6)
            long r6 = r7.a()
            r10.append(r6)
            r10.append(r8)
        L_0x0195:
            java.lang.String r6 = r10.toString()
            goto L_0x01af
        L_0x019a:
            kd2$b r5 = r1.a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = r3.g()
        L_0x01a8:
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L_0x01af:
            r5.a(r6)
        L_0x01b2:
            long r5 = java.lang.System.nanoTime()
            cb2 r0 = r0.c(r3)     // Catch:{ Exception -> 0x0376 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r13 = java.lang.System.nanoTime()
            long r13 = r13 - r5
            long r5 = r3.toMillis(r13)
            db2 r3 = r0.a()
            long r13 = r3.h()
            r16 = -1
            int r7 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r7 == 0) goto L_0x01e5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r13)
            java.lang.String r10 = "-byte"
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            goto L_0x01e7
        L_0x01e5:
            java.lang.String r7 = "unknown-length"
        L_0x01e7:
            kd2$b r10 = r1.a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r16 = r9
            java.lang.String r9 = "<-- "
            r15.append(r9)
            int r9 = r0.h()
            r15.append(r9)
            java.lang.String r9 = r0.t()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x020c
            r9 = r11
            r17 = r13
            r13 = 32
            goto L_0x0223
        L_0x020c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r17 = r13
            r13 = 32
            r9.append(r13)
            java.lang.String r14 = r0.t()
            r9.append(r14)
            java.lang.String r9 = r9.toString()
        L_0x0223:
            r15.append(r9)
            r15.append(r13)
            ab2 r9 = r0.F()
            ta2 r9 = r9.j()
            r15.append(r9)
            r15.append(r12)
            r15.append(r5)
            java.lang.String r5 = "ms"
            r15.append(r5)
            if (r2 != 0) goto L_0x0258
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = ", "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = " body"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            goto L_0x0259
        L_0x0258:
            r5 = r11
        L_0x0259:
            r15.append(r5)
            r5 = 41
            r15.append(r5)
            java.lang.String r5 = r15.toString()
            r10.a(r5)
            if (r2 == 0) goto L_0x0375
            sa2 r2 = r0.m()
            int r5 = r2.h()
            r6 = 0
        L_0x0273:
            if (r6 >= r5) goto L_0x027b
            r1.d(r2, r6)
            int r6 = r6 + 1
            goto L_0x0273
        L_0x027b:
            if (r4 == 0) goto L_0x036e
            boolean r4 = defpackage.bc2.c(r0)
            if (r4 != 0) goto L_0x0285
            goto L_0x036e
        L_0x0285:
            sa2 r4 = r0.m()
            boolean r4 = b(r4)
            if (r4 == 0) goto L_0x0295
            kd2$b r2 = r1.a
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            goto L_0x0372
        L_0x0295:
            pd2 r4 = r3.m()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.f0(r5)
            nd2 r4 = r4.d()
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r2 = r2.c(r5)
            java.lang.String r5 = "gzip"
            boolean r2 = r5.equalsIgnoreCase(r2)
            r5 = 0
            if (r2 == 0) goto L_0x02dc
            long r6 = r4.k0()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            ud2 r6 = new ud2     // Catch:{ all -> 0x02d5 }
            nd2 r4 = r4.clone()     // Catch:{ all -> 0x02d5 }
            r6.<init>(r4)     // Catch:{ all -> 0x02d5 }
            nd2 r4 = new nd2     // Catch:{ all -> 0x02d2 }
            r4.<init>()     // Catch:{ all -> 0x02d2 }
            r4.a0(r6)     // Catch:{ all -> 0x02d2 }
            r6.close()
            r5 = r2
            goto L_0x02dc
        L_0x02d2:
            r0 = move-exception
            r5 = r6
            goto L_0x02d6
        L_0x02d5:
            r0 = move-exception
        L_0x02d6:
            if (r5 == 0) goto L_0x02db
            r5.close()
        L_0x02db:
            throw r0
        L_0x02dc:
            java.nio.charset.Charset r2 = d
            va2 r3 = r3.i()
            if (r3 == 0) goto L_0x02ea
            java.nio.charset.Charset r2 = d
            java.nio.charset.Charset r2 = r3.b(r2)
        L_0x02ea:
            boolean r3 = c(r4)
            if (r3 != 0) goto L_0x0313
            kd2$b r2 = r1.a
            r2.a(r11)
            kd2$b r2 = r1.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "<-- END HTTP (binary "
            r3.append(r5)
            long r4 = r4.k0()
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r2.a(r3)
            return r0
        L_0x0313:
            r6 = 0
            int r3 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x032b
            kd2$b r3 = r1.a
            r3.a(r11)
            kd2$b r3 = r1.a
            nd2 r6 = r4.clone()
            java.lang.String r2 = r6.T(r2)
            r3.a(r2)
        L_0x032b:
            java.lang.String r2 = "<-- END HTTP ("
            kd2$b r3 = r1.a
            if (r5 == 0) goto L_0x0352
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            long r7 = r4.k0()
            r6.append(r7)
            java.lang.String r2 = "-byte, "
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = "-gzipped-byte body)"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            goto L_0x036a
        L_0x0352:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            long r6 = r4.k0()
            r5.append(r6)
            r2 = r16
            r5.append(r2)
            java.lang.String r2 = r5.toString()
        L_0x036a:
            r3.a(r2)
            goto L_0x0375
        L_0x036e:
            kd2$b r2 = r1.a
            java.lang.String r3 = "<-- END HTTP"
        L_0x0372:
            r2.a(r3)
        L_0x0375:
            return r0
        L_0x0376:
            r0 = move-exception
            r2 = r0
            kd2$b r0 = r1.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.a(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd2.a(ua2$a):cb2");
    }

    public kd2 e(a aVar) {
        if (aVar != null) {
            this.c = aVar;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }
}
