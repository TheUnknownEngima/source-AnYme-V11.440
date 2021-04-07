package com.google.android.gms.measurement.internal;

import defpackage.os0;
import defpackage.ps0;
import defpackage.ws0;
import defpackage.xs0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class oa {
    private String a;
    private boolean b;
    private ws0 c;
    /* access modifiers changed from: private */
    public BitSet d;
    private BitSet e;
    private Map<Integer, Long> f;
    private Map<Integer, List<Long>> g;
    private final /* synthetic */ ma h;

    private oa(ma maVar, String str) {
        this.h = maVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new b0();
        this.g = new b0();
    }

    /* synthetic */ oa(ma maVar, String str, pa paVar) {
        this(maVar, str);
    }

    private oa(ma maVar, String str, ws0 ws0, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.h = maVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new b0();
        if (map2 != null) {
            for (Integer next : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(next));
                this.g.put(next, arrayList);
            }
        }
        this.b = false;
        this.c = ws0;
    }

    /* synthetic */ oa(ma maVar, String str, ws0 ws0, BitSet bitSet, BitSet bitSet2, Map map, Map map2, pa paVar) {
        this(maVar, str, ws0, bitSet, bitSet2, map, map2);
    }

    /* access modifiers changed from: package-private */
    public final os0 a(int i) {
        ArrayList arrayList;
        List list;
        os0.a R = os0.R();
        R.w(i);
        R.A(this.b);
        ws0 ws0 = this.c;
        if (ws0 != null) {
            R.y(ws0);
        }
        ws0.a a0 = ws0.a0();
        a0.C(ba.E(this.d));
        a0.y(ba.E(this.e));
        if (this.f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f.size());
            for (Integer intValue : this.f.keySet()) {
                int intValue2 = intValue.intValue();
                ps0.a K = ps0.K();
                K.w(intValue2);
                K.x(this.f.get(Integer.valueOf(intValue2)).longValue());
                arrayList.add((ps0) ((sy0) K.k()));
            }
        }
        a0.D(arrayList);
        if (this.g == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(this.g.size());
            for (Integer next : this.g.keySet()) {
                xs0.a L = xs0.L();
                L.w(next.intValue());
                List list2 = this.g.get(next);
                if (list2 != null) {
                    Collections.sort(list2);
                    L.x(list2);
                }
                arrayList2.add((xs0) ((sy0) L.k()));
            }
            list = arrayList2;
        }
        a0.G(list);
        R.x(a0);
        return (os0) ((sy0) R.k());
    }

    /* access modifiers changed from: package-private */
    public final void c(ta taVar) {
        int a2 = taVar.a();
        Boolean bool = taVar.c;
        if (bool != null) {
            this.e.set(a2, bool.booleanValue());
        }
        Boolean bool2 = taVar.d;
        if (bool2 != null) {
            this.d.set(a2, bool2.booleanValue());
        }
        if (taVar.e != null) {
            Long l = this.f.get(Integer.valueOf(a2));
            long longValue = taVar.e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f.put(Integer.valueOf(a2), Long.valueOf(longValue));
            }
        }
        if (taVar.f != null) {
            List list = this.g.get(Integer.valueOf(a2));
            if (list == null) {
                list = new ArrayList();
                this.g.put(Integer.valueOf(a2), list);
            }
            if (taVar.i()) {
                list.clear();
            }
            if (t31.a() && this.h.j().z(this.a, u.d0) && taVar.j()) {
                list.clear();
            }
            if (!t31.a() || !this.h.j().z(this.a, u.d0)) {
                list.add(Long.valueOf(taVar.f.longValue() / 1000));
                return;
            }
            long longValue2 = taVar.f.longValue() / 1000;
            if (!list.contains(Long.valueOf(longValue2))) {
                list.add(Long.valueOf(longValue2));
            }
        }
    }
}
