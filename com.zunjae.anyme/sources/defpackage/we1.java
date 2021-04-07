package defpackage;

import defpackage.ab2;
import defpackage.da2;
import defpackage.ta2;
import defpackage.wa2;
import defpackage.xa2;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: we1  reason: default package */
public class we1 {
    private static final xa2 f;
    private final ve1 a;
    private final String b;
    private final Map<String, String> c;
    private final Map<String, String> d;
    private wa2.a e = null;

    static {
        xa2.b x = new xa2().x();
        x.d(10000, TimeUnit.MILLISECONDS);
        f = x.b();
    }

    public we1(ve1 ve1, String str, Map<String, String> map) {
        this.a = ve1;
        this.b = str;
        this.c = map;
        this.d = new HashMap();
    }

    private ab2 a() {
        ab2.a aVar = new ab2.a();
        da2.a aVar2 = new da2.a();
        aVar2.c();
        aVar.c(aVar2.a());
        ta2.a p = ta2.r(this.b).p();
        for (Map.Entry next : this.c.entrySet()) {
            p.a((String) next.getKey(), (String) next.getValue());
        }
        aVar.j(p.c());
        for (Map.Entry next2 : this.d.entrySet()) {
            aVar.d((String) next2.getKey(), (String) next2.getValue());
        }
        wa2.a aVar3 = this.e;
        aVar.f(this.a.name(), aVar3 == null ? null : aVar3.e());
        return aVar.b();
    }

    private wa2.a c() {
        if (this.e == null) {
            wa2.a aVar = new wa2.a();
            aVar.f(wa2.f);
            this.e = aVar;
        }
        return this.e;
    }

    public ye1 b() {
        return ye1.c(f.b(a()).h());
    }

    public we1 d(String str, String str2) {
        this.d.put(str, str2);
        return this;
    }

    public we1 e(Map.Entry<String, String> entry) {
        d(entry.getKey(), entry.getValue());
        return this;
    }

    public String f() {
        return this.a.name();
    }

    public we1 g(String str, String str2) {
        wa2.a c2 = c();
        c2.a(str, str2);
        this.e = c2;
        return this;
    }

    public we1 h(String str, String str2, String str3, File file) {
        bb2 c2 = bb2.c(va2.d(str3), file);
        wa2.a c3 = c();
        c3.b(str, str2, c2);
        this.e = c3;
        return this;
    }
}
