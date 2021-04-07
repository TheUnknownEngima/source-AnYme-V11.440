package androidx.work.impl;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.h;
import androidx.work.impl.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public class c implements a {
    private static final String n = h.f("Processor");
    private Context e;
    private b f;
    private s8 g;
    private WorkDatabase h;
    private Map<String, j> i = new HashMap();
    private List<d> j;
    private Set<String> k;
    private final List<a> l;
    private final Object m;

    private static class a implements Runnable {
        private a e;
        private String f;
        private db1<Boolean> g;

        a(a aVar, String str, db1<Boolean> db1) {
            this.e = aVar;
            this.f = str;
            this.g = db1;
        }

        public void run() {
            boolean z;
            try {
                z = this.g.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.e.c(this.f, z);
        }
    }

    public c(Context context, b bVar, s8 s8Var, WorkDatabase workDatabase, List<d> list) {
        this.e = context;
        this.f = bVar;
        this.g = s8Var;
        this.h = workDatabase;
        this.j = list;
        this.k = new HashSet();
        this.l = new ArrayList();
        this.m = new Object();
    }

    public void a(a aVar) {
        synchronized (this.m) {
            this.l.add(aVar);
        }
    }

    public boolean b(String str) {
        boolean contains;
        synchronized (this.m) {
            contains = this.k.contains(str);
        }
        return contains;
    }

    public void c(String str, boolean z) {
        synchronized (this.m) {
            this.i.remove(str);
            h.c().a(n, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            for (a c : this.l) {
                c.c(str, z);
            }
        }
    }

    public boolean d(String str) {
        boolean containsKey;
        synchronized (this.m) {
            containsKey = this.i.containsKey(str);
        }
        return containsKey;
    }

    public void e(a aVar) {
        synchronized (this.m) {
            this.l.remove(aVar);
        }
    }

    public boolean f(String str) {
        return g(str, (WorkerParameters.a) null);
    }

    public boolean g(String str, WorkerParameters.a aVar) {
        synchronized (this.m) {
            if (this.i.containsKey(str)) {
                h.c().a(n, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            j.c cVar = new j.c(this.e, this.f, this.g, this.h, str);
            cVar.c(this.j);
            cVar.b(aVar);
            j a2 = cVar.a();
            db1<Boolean> c = a2.c();
            c.a(new a(this, str, c), this.g.b());
            this.i.put(str, a2);
            this.g.d().execute(a2);
            h.c().a(n, String.format("%s: processing %s", new Object[]{c.class.getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    public boolean h(String str) {
        synchronized (this.m) {
            h.c().a(n, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.k.add(str);
            j remove = this.i.remove(str);
            if (remove != null) {
                remove.e(true);
                h.c().a(n, String.format("WorkerWrapper cancelled for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            h.c().a(n, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }

    public boolean i(String str) {
        synchronized (this.m) {
            h.c().a(n, String.format("Processor stopping %s", new Object[]{str}), new Throwable[0]);
            j remove = this.i.remove(str);
            if (remove != null) {
                remove.e(false);
                h.c().a(n, String.format("WorkerWrapper stopped for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            h.c().a(n, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }
}
