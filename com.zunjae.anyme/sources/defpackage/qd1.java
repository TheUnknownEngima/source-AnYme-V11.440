package defpackage;

import defpackage.ge1;

/* renamed from: qd1  reason: default package */
final class qd1 extends ge1.d {
    private final String a;
    private final String b;
    private final long c;
    private final Long d;
    private final boolean e;
    private final ge1.d.a f;
    private final ge1.d.f g;
    private final ge1.d.e h;
    private final ge1.d.c i;
    private final he1<ge1.d.C0116d> j;
    private final int k;

    /* renamed from: qd1$b */
    static final class b extends ge1.d.b {
        private String a;
        private String b;
        private Long c;
        private Long d;
        private Boolean e;
        private ge1.d.a f;
        private ge1.d.f g;
        private ge1.d.e h;
        private ge1.d.c i;
        private he1<ge1.d.C0116d> j;
        private Integer k;

        b() {
        }

        private b(ge1.d dVar) {
            this.a = dVar.f();
            this.b = dVar.h();
            this.c = Long.valueOf(dVar.k());
            this.d = dVar.d();
            this.e = Boolean.valueOf(dVar.m());
            this.f = dVar.b();
            this.g = dVar.l();
            this.h = dVar.j();
            this.i = dVar.c();
            this.j = dVar.e();
            this.k = Integer.valueOf(dVar.g());
        }

        public ge1.d a() {
            String str = "";
            if (this.a == null) {
                str = str + " generator";
            }
            if (this.b == null) {
                str = str + " identifier";
            }
            if (this.c == null) {
                str = str + " startedAt";
            }
            if (this.e == null) {
                str = str + " crashed";
            }
            if (this.f == null) {
                str = str + " app";
            }
            if (this.k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new qd1(this.a, this.b, this.c.longValue(), this.d, this.e.booleanValue(), this.f, this.g, this.h, this.i, this.j, this.k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.d.b b(ge1.d.a aVar) {
            if (aVar != null) {
                this.f = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        public ge1.d.b c(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public ge1.d.b d(ge1.d.c cVar) {
            this.i = cVar;
            return this;
        }

        public ge1.d.b e(Long l) {
            this.d = l;
            return this;
        }

        public ge1.d.b f(he1<ge1.d.C0116d> he1) {
            this.j = he1;
            return this;
        }

        public ge1.d.b g(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        public ge1.d.b h(int i2) {
            this.k = Integer.valueOf(i2);
            return this;
        }

        public ge1.d.b i(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        public ge1.d.b k(ge1.d.e eVar) {
            this.h = eVar;
            return this;
        }

        public ge1.d.b l(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        public ge1.d.b m(ge1.d.f fVar) {
            this.g = fVar;
            return this;
        }
    }

    private qd1(String str, String str2, long j2, Long l, boolean z, ge1.d.a aVar, ge1.d.f fVar, ge1.d.e eVar, ge1.d.c cVar, he1<ge1.d.C0116d> he1, int i2) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = l;
        this.e = z;
        this.f = aVar;
        this.g = fVar;
        this.h = eVar;
        this.i = cVar;
        this.j = he1;
        this.k = i2;
    }

    public ge1.d.a b() {
        return this.f;
    }

    public ge1.d.c c() {
        return this.i;
    }

    public Long d() {
        return this.d;
    }

    public he1<ge1.d.C0116d> e() {
        return this.j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r1 = r7.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r7.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1 = r7.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r1 = r7.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r1 = r7.j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.ge1.d
            r2 = 0
            if (r1 == 0) goto L_0x00b5
            ge1$d r8 = (defpackage.ge1.d) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            long r3 = r7.c
            long r5 = r8.k()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b3
            java.lang.Long r1 = r7.d
            if (r1 != 0) goto L_0x0038
            java.lang.Long r1 = r8.d()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0042
        L_0x0038:
            java.lang.Long r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0042:
            boolean r1 = r7.e
            boolean r3 = r8.m()
            if (r1 != r3) goto L_0x00b3
            ge1$d$a r1 = r7.f
            ge1$d$a r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            ge1$d$f r1 = r7.g
            if (r1 != 0) goto L_0x0061
            ge1$d$f r1 = r8.l()
            if (r1 != 0) goto L_0x00b3
            goto L_0x006b
        L_0x0061:
            ge1$d$f r3 = r8.l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x006b:
            ge1$d$e r1 = r7.h
            if (r1 != 0) goto L_0x0076
            ge1$d$e r1 = r8.j()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0080
        L_0x0076:
            ge1$d$e r3 = r8.j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0080:
            ge1$d$c r1 = r7.i
            if (r1 != 0) goto L_0x008b
            ge1$d$c r1 = r8.c()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0095
        L_0x008b:
            ge1$d$c r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0095:
            he1<ge1$d$d> r1 = r7.j
            if (r1 != 0) goto L_0x00a0
            he1 r1 = r8.e()
            if (r1 != 0) goto L_0x00b3
            goto L_0x00aa
        L_0x00a0:
            he1 r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x00aa:
            int r1 = r7.k
            int r8 = r8.g()
            if (r1 != r8) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r0 = 0
        L_0x00b4:
            return r0
        L_0x00b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd1.equals(java.lang.Object):boolean");
    }

    public String f() {
        return this.a;
    }

    public int g() {
        return this.k;
    }

    public String h() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.c;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l = this.d;
        int i2 = 0;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode()) * 1000003;
        ge1.d.f fVar = this.g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        ge1.d.e eVar = this.h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        ge1.d.c cVar = this.i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        he1<ge1.d.C0116d> he1 = this.j;
        if (he1 != null) {
            i2 = he1.hashCode();
        }
        return ((hashCode5 ^ i2) * 1000003) ^ this.k;
    }

    public ge1.d.e j() {
        return this.h;
    }

    public long k() {
        return this.c;
    }

    public ge1.d.f l() {
        return this.g;
    }

    public boolean m() {
        return this.e;
    }

    public ge1.d.b n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.a + ", identifier=" + this.b + ", startedAt=" + this.c + ", endedAt=" + this.d + ", crashed=" + this.e + ", app=" + this.f + ", user=" + this.g + ", os=" + this.h + ", device=" + this.i + ", events=" + this.j + ", generatorType=" + this.k + "}";
    }
}
