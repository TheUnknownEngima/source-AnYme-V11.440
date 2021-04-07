package defpackage;

import com.google.android.exoplayer2.f0;
import defpackage.hx;
import java.util.List;

/* renamed from: cx  reason: default package */
public final class cx {
    private final List<f0> a;
    private final vt[] b;

    public cx(List<f0> list) {
        this.a = list;
        this.b = new vt[list.size()];
    }

    public void a(long j, i50 i50) {
        y20.a(j, i50, this.b);
    }

    public void b(jt jtVar, hx.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            vt a2 = jtVar.a(dVar.c(), 3);
            f0 f0Var = this.a.get(i);
            String str = f0Var.m;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            q40.b(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            String str2 = f0Var.e;
            if (str2 == null) {
                str2 = dVar.b();
            }
            a2.d(f0.D(str2, str, (String) null, -1, f0Var.g, f0Var.E, f0Var.F, (ns) null, Long.MAX_VALUE, f0Var.o));
            this.b[i] = a2;
        }
    }
}
