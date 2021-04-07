package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.source.dash.f;
import defpackage.p10;
import java.util.Collections;
import java.util.List;

/* renamed from: o10  reason: default package */
public abstract class o10 {
    public final f0 a;
    public final String b;
    public final long c;
    public final List<j10> d;
    private final n10 e;

    /* renamed from: o10$b */
    public static class b extends o10 implements f {
        private final p10.a f;

        public b(long j, f0 f0Var, String str, p10.a aVar, List<j10> list) {
            super(j, f0Var, str, aVar, list);
            this.f = aVar;
        }

        public long a(long j, long j2) {
            return this.f.e(j, j2);
        }

        public long b(long j) {
            return this.f.g(j);
        }

        public n10 c(long j) {
            return this.f.h(this, j);
        }

        public long d(long j, long j2) {
            return this.f.f(j, j2);
        }

        public boolean e() {
            return this.f.i();
        }

        public long f() {
            return this.f.c();
        }

        public int g(long j) {
            return this.f.d(j);
        }

        public String h() {
            return null;
        }

        public f i() {
            return this;
        }

        public n10 j() {
            return null;
        }
    }

    /* renamed from: o10$c */
    public static class c extends o10 {
        private final String f;
        private final n10 g;
        private final q10 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(long j, f0 f0Var, String str, p10.e eVar, List<j10> list, String str2, long j2) {
            super(j, f0Var, str, eVar, list);
            Uri.parse(str);
            n10 c = eVar.c();
            this.g = c;
            this.f = str2;
            this.h = c != null ? null : new q10(new n10((String) null, 0, j2));
        }

        public String h() {
            return this.f;
        }

        public f i() {
            return this.h;
        }

        public n10 j() {
            return this.g;
        }
    }

    private o10(long j, f0 f0Var, String str, p10 p10, List<j10> list) {
        this.a = f0Var;
        this.b = str;
        this.d = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.e = p10.a(this);
        this.c = p10.b();
    }

    public static o10 l(long j, f0 f0Var, String str, p10 p10, List<j10> list) {
        return m(j, f0Var, str, p10, list, (String) null);
    }

    public static o10 m(long j, f0 f0Var, String str, p10 p10, List<j10> list, String str2) {
        p10 p102 = p10;
        if (p102 instanceof p10.e) {
            return new c(j, f0Var, str, (p10.e) p102, list, str2, -1);
        } else if (p102 instanceof p10.a) {
            return new b(j, f0Var, str, (p10.a) p102, list);
        } else {
            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        }
    }

    public abstract String h();

    public abstract f i();

    public abstract n10 j();

    public n10 k() {
        return this.e;
    }
}
