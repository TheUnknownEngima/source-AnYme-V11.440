package defpackage;

/* renamed from: dn  reason: default package */
public final class dn implements hh1 {
    public static final hh1 a = new dn();

    /* renamed from: dn$a */
    private static final class a implements dh1<cn> {
        static final a a = new a();

        private a() {
        }

        public void a(Object obj, Object obj2) {
            cn cnVar = (cn) obj;
            eh1 eh1 = (eh1) obj2;
            eh1.f("sdkVersion", cnVar.i());
            eh1.f("model", cnVar.f());
            eh1.f("hardware", cnVar.d());
            eh1.f("device", cnVar.b());
            eh1.f("product", cnVar.h());
            eh1.f("osBuild", cnVar.g());
            eh1.f("manufacturer", cnVar.e());
            eh1.f("fingerprint", cnVar.c());
        }
    }

    /* renamed from: dn$b */
    private static final class b implements dh1<ln> {
        static final b a = new b();

        private b() {
        }

        public void a(Object obj, Object obj2) {
            ((eh1) obj2).f("logRequest", ((ln) obj).b());
        }
    }

    /* renamed from: dn$c */
    private static final class c implements dh1<mn> {
        static final c a = new c();

        private c() {
        }

        public void a(Object obj, Object obj2) {
            mn mnVar = (mn) obj;
            eh1 eh1 = (eh1) obj2;
            eh1.f("clientType", mnVar.c());
            eh1.f("androidClientInfo", mnVar.b());
        }
    }

    /* renamed from: dn$d */
    private static final class d implements dh1<nn> {
        static final d a = new d();

        private d() {
        }

        public void a(Object obj, Object obj2) {
            nn nnVar = (nn) obj;
            eh1 eh1 = (eh1) obj2;
            eh1.b("eventTimeMs", nnVar.d());
            eh1.f("eventCode", nnVar.c());
            eh1.b("eventUptimeMs", nnVar.e());
            eh1.f("sourceExtension", nnVar.g());
            eh1.f("sourceExtensionJsonProto3", nnVar.h());
            eh1.b("timezoneOffsetSeconds", nnVar.i());
            eh1.f("networkConnectionInfo", nnVar.f());
        }
    }

    /* renamed from: dn$e */
    private static final class e implements dh1<on> {
        static final e a = new e();

        private e() {
        }

        public void a(Object obj, Object obj2) {
            on onVar = (on) obj;
            eh1 eh1 = (eh1) obj2;
            eh1.b("requestTimeMs", onVar.g());
            eh1.b("requestUptimeMs", onVar.h());
            eh1.f("clientInfo", onVar.b());
            eh1.f("logSource", onVar.d());
            eh1.f("logSourceName", onVar.e());
            eh1.f("logEvent", onVar.c());
            eh1.f("qosTier", onVar.f());
        }
    }

    /* renamed from: dn$f */
    private static final class f implements dh1<qn> {
        static final f a = new f();

        private f() {
        }

        public void a(Object obj, Object obj2) {
            qn qnVar = (qn) obj;
            eh1 eh1 = (eh1) obj2;
            eh1.f("networkType", qnVar.c());
            eh1.f("mobileSubtype", qnVar.b());
        }
    }

    private dn() {
    }

    public void a(ih1<?> ih1) {
        ih1.a(ln.class, b.a);
        ih1.a(fn.class, b.a);
        ih1.a(on.class, e.a);
        ih1.a(in.class, e.a);
        ih1.a(mn.class, c.a);
        ih1.a(gn.class, c.a);
        ih1.a(cn.class, a.a);
        ih1.a(en.class, a.a);
        ih1.a(nn.class, d.a);
        ih1.a(hn.class, d.a);
        ih1.a(qn.class, f.a);
        ih1.a(kn.class, f.a);
    }
}
