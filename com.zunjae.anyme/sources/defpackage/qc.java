package defpackage;

import defpackage.gb;
import defpackage.ib;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qc  reason: default package */
public class qc implements Callable<pc<Integer>> {
    private final ac a;
    private final kb b;
    private final String c;
    private final fb d;
    private final ua e;

    public qc(ac acVar, kb kbVar, String str, ua uaVar, fb fbVar) {
        this.a = acVar;
        this.b = kbVar;
        this.c = str;
        this.d = fbVar;
        this.e = uaVar;
    }

    public pc<Integer> a(jb jbVar, List<String> list) {
        int i = 0;
        if (list.size() > 0) {
            if (jbVar.l() <= 0) {
                try {
                    long a2 = this.b.a(jbVar);
                    jbVar.b(a2);
                    this.a.m(jbVar.g(), a2);
                } catch (ka unused) {
                    return new pc<>(0);
                }
            }
            for (String jSONObject : list) {
                try {
                    JSONObject jSONObject2 = new JSONObject(jSONObject);
                    String optString = jSONObject2.optString("title", "Crash Report");
                    String optString2 = jSONObject2.optString("raw", "{}");
                    String optString3 = jSONObject2.optString("message", "");
                    long optLong = jSONObject2.optLong("date", new Date().getTime());
                    UUID a3 = ta.a(this.e.a());
                    long l = jbVar.l();
                    ib.b bVar = new ib.b();
                    bVar.a(ib.c.D.a());
                    bVar.h("bf_issue");
                    bVar.i(a3.toString());
                    bVar.d(new Date(optLong));
                    this.b.c(l, Collections.singletonList(bVar.e()));
                    gb.b j = gb.j();
                    j.d(a3);
                    j.i(optString);
                    j.c(optString2);
                    j.g(optString3);
                    j.a(l);
                    j.b(new cb(this.c));
                    j.k("crash");
                    this.b.d(j.e());
                    i++;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                } catch (Throwable th) {
                    this.a.k(jbVar.g());
                    throw th;
                }
                this.a.k(jbVar.g());
            }
        }
        return new pc<>(Integer.valueOf(i));
    }

    /* renamed from: b */
    public pc<Integer> call() {
        int i = 0;
        if (this.d.b()) {
            for (jb next : this.a.a()) {
                try {
                    pc<Integer> a2 = a(next, this.a.g(next).h().a());
                    if (a2.a().intValue() > 0) {
                        new xc(this.b, this.a, this.c, (List<jb>) Collections.singletonList(next)).call();
                    }
                    i += a2.a().intValue();
                } catch (cc unused) {
                }
            }
        }
        return new pc<>(Integer.valueOf(i));
    }
}
