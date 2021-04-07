package defpackage;

import defpackage.hk1;
import java.util.Map;

/* renamed from: kk1  reason: default package */
class kk1 implements jk1 {
    kk1() {
    }

    private static <K, V> int i(int i, Object obj, Object obj2) {
        ik1 ik1 = (ik1) obj;
        hk1 hk1 = (hk1) obj2;
        int i2 = 0;
        if (ik1.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : ik1.entrySet()) {
            i2 += hk1.a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    private static <K, V> ik1<K, V> j(Object obj, Object obj2) {
        ik1<K, V> ik1 = (ik1) obj;
        ik1 ik12 = (ik1) obj2;
        if (!ik12.isEmpty()) {
            if (!ik1.n()) {
                ik1 = ik1.q();
            }
            ik1.p(ik12);
        }
        return ik1;
    }

    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    public Object b(Object obj) {
        ((ik1) obj).o();
        return obj;
    }

    public hk1.a<?, ?> c(Object obj) {
        return ((hk1) obj).c();
    }

    public Map<?, ?> d(Object obj) {
        return (ik1) obj;
    }

    public Object e(Object obj) {
        return ik1.e().q();
    }

    public int f(int i, Object obj, Object obj2) {
        return i(i, obj, obj2);
    }

    public boolean g(Object obj) {
        return !((ik1) obj).n();
    }

    public Map<?, ?> h(Object obj) {
        return (ik1) obj;
    }
}
