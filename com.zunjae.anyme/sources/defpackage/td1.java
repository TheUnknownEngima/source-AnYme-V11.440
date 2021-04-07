package defpackage;

import defpackage.ge1;

/* renamed from: td1  reason: default package */
final class td1 extends ge1.d.c {
    private final int a;
    private final String b;
    private final int c;
    private final long d;
    private final long e;
    private final boolean f;
    private final int g;
    private final String h;
    private final String i;

    /* renamed from: td1$b */
    static final class b extends ge1.d.c.a {
        private Integer a;
        private String b;
        private Integer c;
        private Long d;
        private Long e;
        private Boolean f;
        private Integer g;
        private String h;
        private String i;

        b() {
        }

        public ge1.d.c a() {
            String str = "";
            if (this.a == null) {
                str = str + " arch";
            }
            if (this.b == null) {
                str = str + " model";
            }
            if (this.c == null) {
                str = str + " cores";
            }
            if (this.d == null) {
                str = str + " ram";
            }
            if (this.e == null) {
                str = str + " diskSpace";
            }
            if (this.f == null) {
                str = str + " simulator";
            }
            if (this.g == null) {
                str = str + " state";
            }
            if (this.h == null) {
                str = str + " manufacturer";
            }
            if (this.i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new td1(this.a.intValue(), this.b, this.c.intValue(), this.d.longValue(), this.e.longValue(), this.f.booleanValue(), this.g.intValue(), this.h, this.i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.d.c.a b(int i2) {
            this.a = Integer.valueOf(i2);
            return this;
        }

        public ge1.d.c.a c(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        public ge1.d.c.a d(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        public ge1.d.c.a e(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        public ge1.d.c.a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        public ge1.d.c.a g(String str) {
            if (str != null) {
                this.i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        public ge1.d.c.a h(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        public ge1.d.c.a i(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public ge1.d.c.a j(int i2) {
            this.g = Integer.valueOf(i2);
            return this;
        }
    }

    private td1(int i2, String str, int i3, long j, long j2, boolean z, int i4, String str2, String str3) {
        this.a = i2;
        this.b = str;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i4;
        this.h = str2;
        this.i = str3;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }

    public long d() {
        return this.e;
    }

    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ge1.d.c)) {
            return false;
        }
        ge1.d.c cVar = (ge1.d.c) obj;
        return this.a == cVar.b() && this.b.equals(cVar.f()) && this.c == cVar.c() && this.d == cVar.h() && this.e == cVar.d() && this.f == cVar.j() && this.g == cVar.i() && this.h.equals(cVar.e()) && this.i.equals(cVar.g());
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.i;
    }

    public long h() {
        return this.d;
    }

    public int hashCode() {
        long j = this.d;
        long j2 = this.e;
        return ((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public int i() {
        return this.g;
    }

    public boolean j() {
        return this.f;
    }

    public String toString() {
        return "Device{arch=" + this.a + ", model=" + this.b + ", cores=" + this.c + ", ram=" + this.d + ", diskSpace=" + this.e + ", simulator=" + this.f + ", state=" + this.g + ", manufacturer=" + this.h + ", modelClass=" + this.i + "}";
    }
}
