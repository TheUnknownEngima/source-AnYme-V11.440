package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* renamed from: gb  reason: default package */
public class gb {
    private UUID a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Long f;
    private cb g;

    /* renamed from: gb$b */
    public static final class b {
        /* access modifiers changed from: private */
        public UUID a;
        /* access modifiers changed from: private */
        public String b;
        /* access modifiers changed from: private */
        public String c;
        /* access modifiers changed from: private */
        public String d;
        /* access modifiers changed from: private */
        public String e;
        /* access modifiers changed from: private */
        public long f;
        /* access modifiers changed from: private */
        public cb g;

        private b() {
        }

        public b a(long j) {
            this.f = j;
            return this;
        }

        public b b(cb cbVar) {
            this.g = cbVar;
            return this;
        }

        public b c(String str) {
            this.e = str;
            return this;
        }

        public b d(UUID uuid) {
            this.a = uuid;
            return this;
        }

        public gb e() {
            return new gb(this);
        }

        public b g(String str) {
            this.d = str;
            return this;
        }

        public b i(String str) {
            this.c = str;
            return this;
        }

        public b k(String str) {
            this.b = str;
            return this;
        }
    }

    private gb(b bVar) {
        this.a = bVar.a;
        this.b = TextUtils.isEmpty(bVar.b) ? "issue" : bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = Long.valueOf(bVar.f);
        this.g = bVar.g;
    }

    public static b j() {
        return new b();
    }

    public cb a() {
        return this.g;
    }

    public void b(long j) {
        this.f = Long.valueOf(j);
    }

    public void c(cb cbVar) {
        this.g = cbVar;
    }

    public String d() {
        return this.e;
    }

    public Long e() {
        return this.f;
    }

    public String f() {
        return this.d;
    }

    public String g() {
        return this.c;
    }

    public String h() {
        return this.b;
    }

    public UUID i() {
        return this.a;
    }
}
