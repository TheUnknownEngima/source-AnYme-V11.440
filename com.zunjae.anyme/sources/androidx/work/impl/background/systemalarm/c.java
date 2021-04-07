package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.h;
import androidx.work.impl.background.systemalarm.e;
import java.util.ArrayList;
import java.util.List;

class c {
    private static final String e = h.f("ConstraintsCmdHandler");
    private final Context a;
    private final int b;
    private final e c;
    private final j7 d = new j7(this.a, (i7) null);

    c(Context context, int i, e eVar) {
        this.a = context;
        this.b = i;
        this.c = eVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        List<i8> g = this.c.f().m().D().g();
        ConstraintProxy.a(this.a, g);
        this.d.d(g);
        ArrayList<i8> arrayList = new ArrayList<>(g.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (i8 next : g) {
            String str = next.a;
            if (currentTimeMillis >= next.a() && (!next.b() || this.d.c(str))) {
                arrayList.add(next);
            }
        }
        for (i8 i8Var : arrayList) {
            String str2 = i8Var.a;
            Intent b2 = b.b(this.a, str2);
            h.c().a(e, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
            e eVar = this.c;
            eVar.j(new e.b(eVar, b2, this.b));
        }
        this.d.e();
    }
}
