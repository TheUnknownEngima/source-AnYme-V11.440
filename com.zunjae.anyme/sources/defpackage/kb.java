package defpackage;

import defpackage.fb;
import defpackage.wb;
import java.util.List;
import java.util.Map;

/* renamed from: kb  reason: default package */
public class kb {
    private static final String c = u9.class.getSimpleName();
    private final yb a;
    private final ha<vb> b = new ia();

    public kb(yb ybVar) {
        ra.a(ybVar, "BugfenderApiManager must be not null");
        this.a = ybVar;
    }

    private void f(Throwable th) {
        if (!(th instanceof ja) && !(th instanceof la)) {
            boolean z = th instanceof ma;
        }
    }

    public long a(jb jbVar) {
        try {
            String b2 = this.a.b("session", qb.a(jbVar));
            xb a2 = rb.a(b2);
            if (a2 != null) {
                return (long) a2.a();
            }
            throw new vb(2, "Unexpected response body from server: " + b2);
        } catch (vb e) {
            ka a3 = this.b.a(e);
            f(a3);
            throw a3;
        }
    }

    public fb b(String str, eb ebVar, Map<String, ?> map) {
        try {
            String b2 = this.a.b("app/device-status", nb.a(str, ebVar, map));
            wb a2 = ob.a(b2);
            if (a2 != null) {
                wb.a a3 = a2.a();
                if (a3 != null) {
                    int a4 = a3.a();
                    if (a4 == -1017) {
                        throw new vb(-1017, "Deleted app");
                    } else if (a4 == -1004) {
                        throw new vb(-1004, "Invalid app token");
                    }
                }
                fb.b bVar = new fb.b();
                bVar.d(a2.g());
                bVar.b(a2.h());
                bVar.a(a2.e().a());
                return bVar.c();
            }
            throw new vb(2, "Unexpected response body from server: " + b2);
        } catch (vb e) {
            ka a5 = this.b.a(e);
            f(a5);
            throw a5;
        }
    }

    public void c(long j, List<ib> list) {
        try {
            this.a.c("log/batch", tb.a(j, list), j);
        } catch (vb e) {
            ka a2 = this.b.a(e);
            f(a2);
            throw a2;
        }
    }

    public void d(gb gbVar) {
        try {
            this.a.b("issue", pb.a(gbVar));
        } catch (vb e) {
            ka a2 = this.b.a(e);
            f(a2);
            throw a2;
        }
    }

    public void e(String str, String str2, hb<?> hbVar) {
        try {
            this.a.b("device/keyvalue", sb.a(str, str2, hbVar));
        } catch (vb e) {
            ka a2 = this.b.a(e);
            f(a2);
            throw a2;
        }
    }
}
