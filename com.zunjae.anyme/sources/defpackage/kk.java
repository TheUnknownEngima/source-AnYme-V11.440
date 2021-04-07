package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: kk  reason: default package */
public class kk {
    private final Set<zk> a = Collections.newSetFromMap(new WeakHashMap());
    private final List<zk> b = new ArrayList();
    private boolean c;

    public boolean a(zk zkVar) {
        boolean z = true;
        if (zkVar == null) {
            return true;
        }
        boolean remove = this.a.remove(zkVar);
        if (!this.b.remove(zkVar) && !remove) {
            z = false;
        }
        if (z) {
            zkVar.clear();
        }
        return z;
    }

    public void b() {
        for (T a2 : km.j(this.a)) {
            a(a2);
        }
        this.b.clear();
    }

    public void c() {
        this.c = true;
        for (T t : km.j(this.a)) {
            if (t.isRunning() || t.j()) {
                t.clear();
                this.b.add(t);
            }
        }
    }

    public void d() {
        this.c = true;
        for (T t : km.j(this.a)) {
            if (t.isRunning()) {
                t.n();
                this.b.add(t);
            }
        }
    }

    public void e() {
        for (T t : km.j(this.a)) {
            if (!t.j() && !t.f()) {
                t.clear();
                if (!this.c) {
                    t.h();
                } else {
                    this.b.add(t);
                }
            }
        }
    }

    public void f() {
        this.c = false;
        for (T t : km.j(this.a)) {
            if (!t.j() && !t.isRunning()) {
                t.h();
            }
        }
        this.b.clear();
    }

    public void g(zk zkVar) {
        this.a.add(zkVar);
        if (!this.c) {
            zkVar.h();
            return;
        }
        zkVar.clear();
        boolean isLoggable = Log.isLoggable("RequestTracker", 2);
        this.b.add(zkVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
    }
}
