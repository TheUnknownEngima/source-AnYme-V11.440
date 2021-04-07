package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.h;
import androidx.work.impl.utils.b;
import androidx.work.k;
import androidx.work.l;
import androidx.work.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class f extends l {
    private static final String j = h.f("WorkContinuationImpl");
    private final h a;
    private final String b;
    private final androidx.work.f c;
    private final List<? extends o> d;
    private final List<String> e;
    private final List<String> f;
    private final List<f> g;
    private boolean h;
    private k i;

    f(h hVar, String str, androidx.work.f fVar, List<? extends o> list) {
        this(hVar, str, fVar, list, (List<f>) null);
    }

    f(h hVar, String str, androidx.work.f fVar, List<? extends o> list, List<f> list2) {
        this.a = hVar;
        this.b = str;
        this.c = fVar;
        this.d = list;
        this.g = list2;
        this.e = new ArrayList(this.d.size());
        this.f = new ArrayList();
        if (list2 != null) {
            for (f fVar2 : list2) {
                this.f.addAll(fVar2.f);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            String b2 = ((o) list.get(i2)).b();
            this.e.add(b2);
            this.f.add(b2);
        }
    }

    private static boolean i(f fVar, Set<String> set) {
        set.addAll(fVar.c());
        Set<String> l = l(fVar);
        for (String contains : set) {
            if (l.contains(contains)) {
                return true;
            }
        }
        List<f> e2 = fVar.e();
        if (e2 != null && !e2.isEmpty()) {
            for (f i2 : e2) {
                if (i(i2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(fVar.c());
        return false;
    }

    public static Set<String> l(f fVar) {
        HashSet hashSet = new HashSet();
        List<f> e2 = fVar.e();
        if (e2 != null && !e2.isEmpty()) {
            for (f c2 : e2) {
                hashSet.addAll(c2.c());
            }
        }
        return hashSet;
    }

    public k a() {
        if (!this.h) {
            b bVar = new b(this);
            this.a.n().c(bVar);
            this.i = bVar.d();
        } else {
            h.c().h(j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.e)}), new Throwable[0]);
        }
        return this.i;
    }

    public androidx.work.f b() {
        return this.c;
    }

    public List<String> c() {
        return this.e;
    }

    public String d() {
        return this.b;
    }

    public List<f> e() {
        return this.g;
    }

    public List<? extends o> f() {
        return this.d;
    }

    public h g() {
        return this.a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.h;
    }

    public void k() {
        this.h = true;
    }
}
