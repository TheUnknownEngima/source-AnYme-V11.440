package defpackage;

import defpackage.ab2;
import defpackage.qa2;
import defpackage.sa2;
import defpackage.ta2;
import defpackage.wa2;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: oi2  reason: default package */
final class oi2 {
    private static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    private final String a;
    private final ta2 b;
    @Nullable
    private String c;
    @Nullable
    private ta2.a d;
    private final ab2.a e = new ab2.a();
    private final sa2.a f;
    @Nullable
    private va2 g;
    private final boolean h;
    @Nullable
    private wa2.a i;
    @Nullable
    private qa2.a j;
    @Nullable
    private bb2 k;

    /* renamed from: oi2$a */
    private static class a extends bb2 {
        private final bb2 a;
        private final va2 b;

        a(bb2 bb2, va2 va2) {
            this.a = bb2;
            this.b = va2;
        }

        public long a() {
            return this.a.a();
        }

        public va2 b() {
            return this.b;
        }

        public void h(od2 od2) {
            this.a.h(od2);
        }
    }

    oi2(String str, ta2 ta2, @Nullable String str2, @Nullable sa2 sa2, @Nullable va2 va2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = ta2;
        this.c = str2;
        this.g = va2;
        this.h = z;
        this.f = sa2 != null ? sa2.f() : new sa2.a();
        if (z2) {
            this.j = new qa2.a();
        } else if (z3) {
            wa2.a aVar = new wa2.a();
            this.i = aVar;
            aVar.f(wa2.f);
        }
    }

    private static String g(String str, boolean z) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                nd2 nd2 = new nd2();
                nd2.Q0(str, 0, i2);
                h(nd2, str, i2, length, z);
                return nd2.c0();
            }
            i2 += Character.charCount(codePointAt);
        }
        return str;
    }

    private static void h(nd2 nd2, String str, int i2, int i3, boolean z) {
        nd2 nd22 = null;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (nd22 == null) {
                        nd22 = new nd2();
                    }
                    nd22.R0(codePointAt);
                    while (!nd22.v()) {
                        byte readByte = nd22.readByte() & 255;
                        nd2.F0(37);
                        nd2.F0(l[(readByte >> 4) & 15]);
                        nd2.F0(l[readByte & 15]);
                    }
                } else {
                    nd2.R0(codePointAt);
                }
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2, boolean z) {
        if (z) {
            this.j.b(str, str2);
        } else {
            this.j.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.g = va2.c(str2);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e2);
            }
        } else {
            this.f.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(sa2 sa2, bb2 bb2) {
        this.i.c(sa2, bb2);
    }

    /* access modifiers changed from: package-private */
    public void d(wa2.b bVar) {
        this.i.d(bVar);
    }

    /* access modifiers changed from: package-private */
    public void e(String str, String str2, boolean z) {
        if (this.c != null) {
            String g2 = g(str2, z);
            String str3 = this.c;
            String replace = str3.replace("{" + str + "}", g2);
            if (!m.matcher(replace).matches()) {
                this.c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public void f(String str, @Nullable String str2, boolean z) {
        String str3 = this.c;
        if (str3 != null) {
            ta2.a q = this.b.q(str3);
            this.d = q;
            if (q != null) {
                this.c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.c);
            }
        }
        if (z) {
            this.d.a(str, str2);
        } else {
            this.d.b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public ab2.a i() {
        ta2 ta2;
        ta2.a aVar = this.d;
        if (aVar != null) {
            ta2 = aVar.c();
        } else {
            ta2 = this.b.D(this.c);
            if (ta2 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.c);
            }
        }
        a aVar2 = this.k;
        if (aVar2 == null) {
            qa2.a aVar3 = this.j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                wa2.a aVar4 = this.i;
                if (aVar4 != null) {
                    aVar2 = aVar4.e();
                } else if (this.h) {
                    aVar2 = bb2.f((va2) null, new byte[0]);
                }
            }
        }
        va2 va2 = this.g;
        if (va2 != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, va2);
            } else {
                this.f.a("Content-Type", va2.toString());
            }
        }
        ab2.a aVar5 = this.e;
        aVar5.j(ta2);
        aVar5.e(this.f.d());
        aVar5.f(this.a, aVar2);
        return aVar5;
    }

    /* access modifiers changed from: package-private */
    public void j(bb2 bb2) {
        this.k = bb2;
    }
}
