package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: k12  reason: default package */
public final class k12 {
    public static final q12 a(String str, Map<String, String> map, Map<String, String> map2, Object obj, Object obj2, r12 r12, Map<String, String> map3, double d, Boolean bool, boolean z, List<u12> list) {
        v62.f(str, "url");
        v62.f(map, "headers");
        Map<String, String> map4 = map2;
        v62.f(map4, "params");
        List<u12> list2 = list;
        v62.f(list2, "files");
        return c("POST", str, map, map4, obj, obj2, r12, map3, d, bool, z, list2);
    }

    public static /* synthetic */ q12 b(String str, Map map, Map map2, Object obj, Object obj2, r12 r12, Map map3, double d, Boolean bool, boolean z, List list, int i, Object obj3) {
        int i2 = i;
        Map e = (i2 & 2) != 0 ? w32.e() : map;
        Map e2 = (i2 & 4) != 0 ? w32.e() : map2;
        Boolean bool2 = null;
        Object obj4 = (i2 & 8) != 0 ? null : obj;
        Object obj5 = (i2 & 16) != 0 ? null : obj2;
        r12 r122 = (i2 & 32) != 0 ? null : r12;
        Map map4 = (i2 & 64) != 0 ? null : map3;
        double d2 = (i2 & 128) != 0 ? 30.0d : d;
        if ((i2 & 256) == 0) {
            bool2 = bool;
        }
        return a(str, e, e2, obj4, obj5, r122, map4, d2, bool2, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? f32.f() : list);
    }

    public static final q12 c(String str, String str2, Map<String, String> map, Map<String, String> map2, Object obj, Object obj2, r12 r12, Map<String, String> map3, double d, Boolean bool, boolean z, List<u12> list) {
        String str3 = str;
        v62.f(str3, "method");
        String str4 = str2;
        v62.f(str4, "url");
        Map<String, String> map4 = map;
        v62.f(map4, "headers");
        Map<String, String> map5 = map2;
        v62.f(map5, "params");
        List<u12> list2 = list;
        v62.f(list2, "files");
        p12 p12 = new p12(new n12(str3, str4, map5, map4, obj, obj2, r12, map3, d, bool, z, list2));
        p12.r();
        q12 q12 = (q12) n32.I(p12.q());
        p12.q().remove(q12);
        for (z52 r : l12.b.a()) {
            r.r(q12);
        }
        return q12;
    }
}
