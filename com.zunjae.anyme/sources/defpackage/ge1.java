package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.ae1;
import defpackage.be1;
import defpackage.ce1;
import defpackage.de1;
import defpackage.ee1;
import defpackage.fe1;
import defpackage.md1;
import defpackage.nd1;
import defpackage.od1;
import defpackage.pd1;
import defpackage.qd1;
import defpackage.rd1;
import defpackage.td1;
import defpackage.ud1;
import defpackage.vd1;
import defpackage.wd1;
import defpackage.xd1;
import defpackage.yd1;
import defpackage.zd1;
import java.nio.charset.Charset;

@AutoValue
/* renamed from: ge1  reason: default package */
public abstract class ge1 {
    /* access modifiers changed from: private */
    public static final Charset a = Charset.forName("UTF-8");

    @AutoValue.Builder
    /* renamed from: ge1$a */
    public static abstract class a {
        public abstract ge1 a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(c cVar);

        public abstract a g(int i);

        public abstract a h(String str);

        public abstract a i(d dVar);
    }

    @AutoValue
    /* renamed from: ge1$b */
    public static abstract class b {

        @AutoValue.Builder
        /* renamed from: ge1$b$a */
        public static abstract class a {
            public abstract b a();

            public abstract a b(String str);

            public abstract a c(String str);
        }

        public static a a() {
            return new nd1.b();
        }

        public abstract String b();

        public abstract String c();
    }

    @AutoValue
    /* renamed from: ge1$c */
    public static abstract class c {

        @AutoValue.Builder
        /* renamed from: ge1$c$a */
        public static abstract class a {
            public abstract c a();

            public abstract a b(he1<b> he1);

            public abstract a c(String str);
        }

        @AutoValue
        /* renamed from: ge1$c$b */
        public static abstract class b {

            @AutoValue.Builder
            /* renamed from: ge1$c$b$a */
            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] bArr);

                public abstract a c(String str);
            }

            public static a a() {
                return new pd1.b();
            }

            public abstract byte[] b();

            public abstract String c();
        }

        public static a a() {
            return new od1.b();
        }

        public abstract he1<b> b();

        public abstract String c();
    }

    @AutoValue
    /* renamed from: ge1$d */
    public static abstract class d {

        @AutoValue
        /* renamed from: ge1$d$a */
        public static abstract class a {

            @AutoValue.Builder
            /* renamed from: ge1$d$a$a  reason: collision with other inner class name */
            public static abstract class C0115a {
                public abstract a a();

                public abstract C0115a b(String str);

                public abstract C0115a c(String str);

                public abstract C0115a d(String str);

                public abstract C0115a e(String str);
            }

            @AutoValue
            /* renamed from: ge1$d$a$b */
            public static abstract class b {
                public abstract String a();
            }

            public static C0115a a() {
                return new rd1.b();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public abstract b e();

            public abstract String f();
        }

        @AutoValue.Builder
        /* renamed from: ge1$d$b */
        public static abstract class b {
            public abstract d a();

            public abstract b b(a aVar);

            public abstract b c(boolean z);

            public abstract b d(c cVar);

            public abstract b e(Long l);

            public abstract b f(he1<C0116d> he1);

            public abstract b g(String str);

            public abstract b h(int i);

            public abstract b i(String str);

            public b j(byte[] bArr) {
                i(new String(bArr, ge1.a));
                return this;
            }

            public abstract b k(e eVar);

            public abstract b l(long j);

            public abstract b m(f fVar);
        }

        @AutoValue
        /* renamed from: ge1$d$c */
        public static abstract class c {

            @AutoValue.Builder
            /* renamed from: ge1$d$c$a */
            public static abstract class a {
                public abstract c a();

                public abstract a b(int i);

                public abstract a c(int i);

                public abstract a d(long j);

                public abstract a e(String str);

                public abstract a f(String str);

                public abstract a g(String str);

                public abstract a h(long j);

                public abstract a i(boolean z);

                public abstract a j(int i);
            }

            public static a a() {
                return new td1.b();
            }

            public abstract int b();

            public abstract int c();

            public abstract long d();

            public abstract String e();

            public abstract String f();

            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();
        }

        @AutoValue
        /* renamed from: ge1$d$d  reason: collision with other inner class name */
        public static abstract class C0116d {

            @AutoValue
            /* renamed from: ge1$d$d$a */
            public static abstract class a {

                @AutoValue.Builder
                /* renamed from: ge1$d$d$a$a  reason: collision with other inner class name */
                public static abstract class C0117a {
                    public abstract a a();

                    public abstract C0117a b(Boolean bool);

                    public abstract C0117a c(he1<b> he1);

                    public abstract C0117a d(b bVar);

                    public abstract C0117a e(int i);
                }

                @AutoValue
                /* renamed from: ge1$d$d$a$b */
                public static abstract class b {

                    @AutoValue
                    /* renamed from: ge1$d$d$a$b$a  reason: collision with other inner class name */
                    public static abstract class C0118a {

                        @AutoValue.Builder
                        /* renamed from: ge1$d$d$a$b$a$a  reason: collision with other inner class name */
                        public static abstract class C0119a {
                            public abstract C0118a a();

                            public abstract C0119a b(long j);

                            public abstract C0119a c(String str);

                            public abstract C0119a d(long j);

                            public abstract C0119a e(String str);

                            public C0119a f(byte[] bArr) {
                                e(new String(bArr, ge1.a));
                                return this;
                            }
                        }

                        public static C0119a a() {
                            return new xd1.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract long d();

                        public abstract String e();

                        public byte[] f() {
                            String e = e();
                            if (e != null) {
                                return e.getBytes(ge1.a);
                            }
                            return null;
                        }
                    }

                    @AutoValue.Builder
                    /* renamed from: ge1$d$d$a$b$b  reason: collision with other inner class name */
                    public static abstract class C0120b {
                        public abstract b a();

                        public abstract C0120b b(he1<C0118a> he1);

                        public abstract C0120b c(c cVar);

                        public abstract C0120b d(C0122d dVar);

                        public abstract C0120b e(he1<e> he1);
                    }

                    @AutoValue
                    /* renamed from: ge1$d$d$a$b$c */
                    public static abstract class c {

                        @AutoValue.Builder
                        /* renamed from: ge1$d$d$a$b$c$a  reason: collision with other inner class name */
                        public static abstract class C0121a {
                            public abstract c a();

                            public abstract C0121a b(c cVar);

                            public abstract C0121a c(he1<e.C0125b> he1);

                            public abstract C0121a d(int i);

                            public abstract C0121a e(String str);

                            public abstract C0121a f(String str);
                        }

                        public static C0121a a() {
                            return new yd1.b();
                        }

                        public abstract c b();

                        public abstract he1<e.C0125b> c();

                        public abstract int d();

                        public abstract String e();

                        public abstract String f();
                    }

                    @AutoValue
                    /* renamed from: ge1$d$d$a$b$d  reason: collision with other inner class name */
                    public static abstract class C0122d {

                        @AutoValue.Builder
                        /* renamed from: ge1$d$d$a$b$d$a  reason: collision with other inner class name */
                        public static abstract class C0123a {
                            public abstract C0122d a();

                            public abstract C0123a b(long j);

                            public abstract C0123a c(String str);

                            public abstract C0123a d(String str);
                        }

                        public static C0123a a() {
                            return new zd1.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract String d();
                    }

                    @AutoValue
                    /* renamed from: ge1$d$d$a$b$e */
                    public static abstract class e {

                        @AutoValue.Builder
                        /* renamed from: ge1$d$d$a$b$e$a  reason: collision with other inner class name */
                        public static abstract class C0124a {
                            public abstract e a();

                            public abstract C0124a b(he1<C0125b> he1);

                            public abstract C0124a c(int i);

                            public abstract C0124a d(String str);
                        }

                        @AutoValue
                        /* renamed from: ge1$d$d$a$b$e$b  reason: collision with other inner class name */
                        public static abstract class C0125b {

                            @AutoValue.Builder
                            /* renamed from: ge1$d$d$a$b$e$b$a  reason: collision with other inner class name */
                            public static abstract class C0126a {
                                public abstract C0125b a();

                                public abstract C0126a b(String str);

                                public abstract C0126a c(int i);

                                public abstract C0126a d(long j);

                                public abstract C0126a e(long j);

                                public abstract C0126a f(String str);
                            }

                            public static C0126a a() {
                                return new be1.b();
                            }

                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            public abstract String f();
                        }

                        public static C0124a a() {
                            return new ae1.b();
                        }

                        public abstract he1<C0125b> b();

                        public abstract int c();

                        public abstract String d();
                    }

                    public static C0120b a() {
                        return new wd1.b();
                    }

                    public abstract he1<C0118a> b();

                    public abstract c c();

                    public abstract C0122d d();

                    public abstract he1<e> e();
                }

                public static C0117a a() {
                    return new vd1.b();
                }

                public abstract Boolean b();

                public abstract he1<b> c();

                public abstract b d();

                public abstract int e();

                public abstract C0117a f();
            }

            @AutoValue.Builder
            /* renamed from: ge1$d$d$b */
            public static abstract class b {
                public abstract C0116d a();

                public abstract b b(a aVar);

                public abstract b c(c cVar);

                public abstract b d(C0127d dVar);

                public abstract b e(long j);

                public abstract b f(String str);
            }

            @AutoValue
            /* renamed from: ge1$d$d$c */
            public static abstract class c {

                @AutoValue.Builder
                /* renamed from: ge1$d$d$c$a */
                public static abstract class a {
                    public abstract c a();

                    public abstract a b(Double d);

                    public abstract a c(int i);

                    public abstract a d(long j);

                    public abstract a e(int i);

                    public abstract a f(boolean z);

                    public abstract a g(long j);
                }

                public static a a() {
                    return new ce1.b();
                }

                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();
            }

            @AutoValue
            /* renamed from: ge1$d$d$d  reason: collision with other inner class name */
            public static abstract class C0127d {

                @AutoValue.Builder
                /* renamed from: ge1$d$d$d$a */
                public static abstract class a {
                    public abstract C0127d a();

                    public abstract a b(String str);
                }

                public static a a() {
                    return new de1.b();
                }

                public abstract String b();
            }

            public static b a() {
                return new ud1.b();
            }

            public abstract a b();

            public abstract c c();

            public abstract C0127d d();

            public abstract long e();

            public abstract String f();

            public abstract b g();
        }

        @AutoValue
        /* renamed from: ge1$d$e */
        public static abstract class e {

            @AutoValue.Builder
            /* renamed from: ge1$d$e$a */
            public static abstract class a {
                public abstract e a();

                public abstract a b(String str);

                public abstract a c(boolean z);

                public abstract a d(int i);

                public abstract a e(String str);
            }

            public static a a() {
                return new ee1.b();
            }

            public abstract String b();

            public abstract int c();

            public abstract String d();

            public abstract boolean e();
        }

        @AutoValue
        /* renamed from: ge1$d$f */
        public static abstract class f {

            @AutoValue.Builder
            /* renamed from: ge1$d$f$a */
            public static abstract class a {
                public abstract f a();

                public abstract a b(String str);
            }

            public static a a() {
                return new fe1.b();
            }

            public abstract String b();
        }

        public static b a() {
            qd1.b bVar = new qd1.b();
            bVar.c(false);
            return bVar;
        }

        public abstract a b();

        public abstract c c();

        public abstract Long d();

        public abstract he1<C0116d> e();

        public abstract String f();

        public abstract int g();

        public abstract String h();

        public byte[] i() {
            return h().getBytes(ge1.a);
        }

        public abstract e j();

        public abstract long k();

        public abstract f l();

        public abstract boolean m();

        public abstract b n();

        /* access modifiers changed from: package-private */
        public d o(he1<C0116d> he1) {
            b n = n();
            n.f(he1);
            return n.a();
        }

        /* access modifiers changed from: package-private */
        public d p(long j, boolean z, String str) {
            b n = n();
            n.e(Long.valueOf(j));
            n.c(z);
            if (str != null) {
                f.a a2 = f.a();
                a2.b(str);
                n.m(a2.a());
                n.a();
            }
            return n.a();
        }
    }

    /* renamed from: ge1$e */
    public enum e {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    public static a b() {
        return new md1.b();
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract c g();

    public abstract int h();

    public abstract String i();

    public abstract d j();

    public e k() {
        return j() != null ? e.JAVA : g() != null ? e.NATIVE : e.INCOMPLETE;
    }

    /* access modifiers changed from: protected */
    public abstract a l();

    public ge1 m(he1<d.C0116d> he1) {
        if (j() != null) {
            a l = l();
            l.i(j().o(he1));
            return l.a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    public ge1 n(c cVar) {
        a l = l();
        l.i((d) null);
        l.f(cVar);
        return l.a();
    }

    public ge1 o(long j, boolean z, String str) {
        a l = l();
        if (j() != null) {
            l.i(j().p(j, z, str));
        }
        return l.a();
    }
}
