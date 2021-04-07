package defpackage;

import android.content.Context;
import androidx.work.h;
import defpackage.m7;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j7  reason: default package */
public class j7 implements m7.a {
    private static final String d = h.f("WorkConstraintsTracker");
    private final i7 a;
    private final m7[] b;
    private final Object c = new Object();

    public j7(Context context, i7 i7Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = i7Var;
        this.b = new m7[]{new k7(applicationContext), new l7(applicationContext), new r7(applicationContext), new n7(applicationContext), new q7(applicationContext), new p7(applicationContext), new o7(applicationContext)};
    }

    public void a(List<String> list) {
        synchronized (this.c) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (c(next)) {
                    h.c().a(d, String.format("Constraints met for %s", new Object[]{next}), new Throwable[0]);
                    arrayList.add(next);
                }
            }
            if (this.a != null) {
                this.a.e(arrayList);
            }
        }
    }

    public void b(List<String> list) {
        synchronized (this.c) {
            if (this.a != null) {
                this.a.b(list);
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.c) {
            for (m7 m7Var : this.b) {
                if (m7Var.d(str)) {
                    h.c().a(d, String.format("Work %s constrained by %s", new Object[]{str, m7Var.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(List<i8> list) {
        synchronized (this.c) {
            for (m7 g : this.b) {
                g.g((m7.a) null);
            }
            for (m7 e : this.b) {
                e.e(list);
            }
            for (m7 g2 : this.b) {
                g2.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.c) {
            for (m7 f : this.b) {
                f.f();
            }
        }
    }
}
