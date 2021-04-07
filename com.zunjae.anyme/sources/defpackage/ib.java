package defpackage;

import java.util.Date;

/* renamed from: ib  reason: default package */
public class ib {
    private int a;
    private int b;
    private long c;
    private Date d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    /* renamed from: ib$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                v9[] r0 = defpackage.v9.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                v9 r1 = defpackage.v9.Debug     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                v9 r1 = defpackage.v9.Warning     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v9 r1 = defpackage.v9.Error     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v9 r1 = defpackage.v9.Trace     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                v9 r1 = defpackage.v9.Info     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                v9 r1 = defpackage.v9.Fatal     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ib.a.<clinit>():void");
        }
    }

    /* renamed from: ib$b */
    public static class b {
        private int a;
        private int b;
        private long c;
        private Date d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;

        public b a(int i2) {
            this.b = i2;
            return this;
        }

        public b b(long j2) {
            this.c = j2;
            return this;
        }

        public b c(String str) {
            this.g = str;
            return this;
        }

        public b d(Date date) {
            this.d = date;
            return this;
        }

        public ib e() {
            return new ib(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (a) null);
        }

        public b f(int i2) {
            this.a = i2;
            return this;
        }

        public b g(String str) {
            this.f = str;
            return this;
        }

        public b h(String str) {
            this.e = str;
            return this;
        }

        public b i(String str) {
            this.h = str;
            return this;
        }

        public b j(String str) {
            this.j = str;
            return this;
        }

        public b k(String str) {
            this.i = str;
            return this;
        }
    }

    /* renamed from: ib$c */
    public enum c {
        D(0),
        W(1),
        E(2),
        T(3),
        I(4),
        F(5);
        
        private final int a;

        private c(int i) {
            this.a = i;
        }

        public static c a(v9 v9Var) {
            switch (a.a[v9Var.ordinal()]) {
                case 1:
                    return D;
                case 2:
                    return W;
                case 3:
                    return E;
                case 4:
                    return T;
                case 5:
                    return I;
                case 6:
                    return F;
                default:
                    return D;
            }
        }

        public int a() {
            return this.a;
        }
    }

    private ib(int i2, int i3, long j2, Date date, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = date;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
    }

    /* synthetic */ ib(int i2, int i3, long j2, Date date, String str, String str2, String str3, String str4, String str5, String str6, a aVar) {
        this(i2, i3, j2, date, str, str2, str3, str4, str5, str6);
    }

    public long a() {
        return this.c;
    }

    public Date b() {
        return this.d;
    }

    public String c() {
        return this.g;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.a;
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.e;
    }

    public String h() {
        return this.h;
    }

    public String i() {
        return this.j;
    }

    public String j() {
        return this.i;
    }
}
