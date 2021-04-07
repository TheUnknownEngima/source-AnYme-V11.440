package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: yh2  reason: default package */
public final class yh2 {
    private static final Map<y72<?>, String> a = new ConcurrentHashMap();

    public static final String a(y72<?> y72) {
        v62.f(y72, "$this$getFullName");
        String str = a.get(y72);
        return str != null ? str : b(y72);
    }

    private static final String b(y72<?> y72) {
        String name = m52.a(y72).getName();
        Map<y72<?>, String> map = a;
        v62.b(name, "name");
        map.put(y72, name);
        return name;
    }
}
