package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.h;
import androidx.work.impl.a;
import androidx.work.impl.d;
import androidx.work.m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f7  reason: default package */
public class f7 implements d, i7, a {
    private static final String j = h.f("GreedyScheduler");
    private androidx.work.impl.h e;
    private j7 f;
    private List<i8> g = new ArrayList();
    private boolean h;
    private final Object i;

    public f7(Context context, androidx.work.impl.h hVar) {
        this.e = hVar;
        this.f = new j7(context, this);
        this.i = new Object();
    }

    private void f() {
        if (!this.h) {
            this.e.k().a(this);
            this.h = true;
        }
    }

    private void g(String str) {
        synchronized (this.i) {
            int size = this.g.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (this.g.get(i2).a.equals(str)) {
                    h.c().a(j, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.g.remove(i2);
                    this.f.d(this.g);
                    break;
                } else {
                    i2++;
                }
            }
        }
    }

    public void a(i8... i8VarArr) {
        f();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (i8 i8Var : i8VarArr) {
            if (i8Var.b == m.a.ENQUEUED && !i8Var.d() && i8Var.g == 0 && !i8Var.c()) {
                if (!i8Var.b()) {
                    h.c().a(j, String.format("Starting work for %s", new Object[]{i8Var.a}), new Throwable[0]);
                    this.e.s(i8Var.a);
                } else if (Build.VERSION.SDK_INT < 24 || !i8Var.j.e()) {
                    arrayList.add(i8Var);
                    arrayList2.add(i8Var.a);
                }
            }
        }
        synchronized (this.i) {
            if (!arrayList.isEmpty()) {
                h.c().a(j, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", arrayList2)}), new Throwable[0]);
                this.g.addAll(arrayList);
                this.f.d(this.g);
            }
        }
    }

    public void b(List<String> list) {
        for (String next : list) {
            h.c().a(j, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.e.u(next);
        }
    }

    public void c(String str, boolean z) {
        g(str);
    }

    public void d(String str) {
        f();
        h.c().a(j, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        this.e.u(str);
    }

    public void e(List<String> list) {
        for (String next : list) {
            h.c().a(j, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            this.e.s(next);
        }
    }
}
