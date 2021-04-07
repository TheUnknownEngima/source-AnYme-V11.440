package defpackage;

import java.util.Map;

/* renamed from: gy1  reason: default package */
public final class gy1 {
    private static final int e = 150;
    private static final int f = 5;
    private static final int g = 10;
    private static final int h = 4;
    private static final int i = 4;
    /* access modifiers changed from: private */
    public static final Map<Integer, String> j = w32.f(q22.a(2, "Newb"), q22.a(10, "Kawaii"), q22.a(25, "Baka"), q22.a(50, "Moe"), q22.a(69, "Kouhai"), q22.a(75, "Senpai"), q22.a(100, "Weeb"), q22.a(Integer.valueOf(e), "Tsundere"), q22.a(200, "Otaku"), q22.a(275, "Anime God"), q22.a(350, "Heavenly God"));
    public static final a k = new a((r62) null);
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    /* renamed from: gy1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final Map<Integer, String> a() {
            return gy1.j;
        }
    }

    public gy1(int i2, int i3, int i4, int i5) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
    }

    private final int c() {
        return (this.a * f) + 0 + (this.b * h) + (this.c * i) + (this.d * g);
    }

    public final fy1 b() {
        int c2 = c();
        int i2 = c2 <= 0 ? 0 : c2 / e;
        int i3 = e;
        return new fy1(i2, i3 - (c2 % i3), i3);
    }

    public final int d() {
        return this.a;
    }

    public final String e() {
        fy1 b2 = b();
        for (Map.Entry next : j.entrySet()) {
            if (b2.a() < ((Number) next.getKey()).intValue()) {
                return (String) next.getValue();
            }
        }
        return "Are you ok?";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy1)) {
            return false;
        }
        gy1 gy1 = (gy1) obj;
        return this.a == gy1.a && this.b == gy1.b && this.c == gy1.c && this.d == gy1.d;
    }

    public final String f() {
        fy1 b2 = b();
        return "Level: " + b2.a();
    }

    public final String g() {
        int c2 = c() % e;
        return '(' + c2 + '/' + e + " XP)";
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return "UserStats(watchedEpisode=" + this.a + ", waifusAdded=" + this.b + ", notesWritten=" + this.c + ", completedShows=" + this.d + ")";
    }
}
