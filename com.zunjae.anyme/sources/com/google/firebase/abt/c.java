package com.google.firebase.abt;

import android.content.Context;
import android.os.Bundle;
import defpackage.eb1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c {
    private final eb1 a;
    private final String b;
    private Integer c = null;

    public c(Context context, eb1 eb1, String str) {
        this.a = eb1;
        this.b = str;
    }

    private void a(eb1.c cVar) {
        this.a.b(cVar);
    }

    private void b(List<b> list) {
        ArrayDeque arrayDeque = new ArrayDeque(d());
        int g = g();
        for (b next : list) {
            while (arrayDeque.size() >= g) {
                i(((eb1.c) arrayDeque.pollFirst()).b);
            }
            eb1.c d = next.d(this.b);
            a(d);
            arrayDeque.offer(d);
        }
    }

    private static List<b> c(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> a2 : list) {
            arrayList.add(b.a(a2));
        }
        return arrayList;
    }

    private List<eb1.c> d() {
        return this.a.e(this.b, "");
    }

    private ArrayList<b> e(List<b> list, Set<String> set) {
        ArrayList<b> arrayList = new ArrayList<>();
        for (b next : list) {
            if (!set.contains(next.b())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private ArrayList<eb1.c> f(List<eb1.c> list, Set<String> set) {
        ArrayList<eb1.c> arrayList = new ArrayList<>();
        for (eb1.c next : list) {
            if (!set.contains(next.b)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private int g() {
        if (this.c == null) {
            this.c = Integer.valueOf(this.a.d(this.b));
        }
        return this.c.intValue();
    }

    private void i(String str) {
        this.a.clearConditionalUserProperty(str, (String) null, (Bundle) null);
    }

    private void j(Collection<eb1.c> collection) {
        for (eb1.c cVar : collection) {
            i(cVar.b);
        }
    }

    private void l(List<b> list) {
        if (list.isEmpty()) {
            h();
            return;
        }
        HashSet hashSet = new HashSet();
        for (b b2 : list) {
            hashSet.add(b2.b());
        }
        List<eb1.c> d = d();
        HashSet hashSet2 = new HashSet();
        for (eb1.c cVar : d) {
            hashSet2.add(cVar.b);
        }
        j(f(d, hashSet));
        b(e(list, hashSet2));
    }

    private void m() {
        if (this.a == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public void h() {
        m();
        j(d());
    }

    public void k(List<Map<String, String>> list) {
        m();
        if (list != null) {
            l(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
}
