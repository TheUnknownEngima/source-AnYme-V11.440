package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: wg2  reason: default package */
public final class wg2 {
    private final Map<String, Object> a;

    public wg2() {
        this((Map) null, 1, (r62) null);
    }

    public wg2(Map<String, Object> map) {
        v62.f(map, "data");
        this.a = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg2(Map map, int i, r62 r62) {
        this((i & 1) != 0 ? new ConcurrentHashMap() : map);
    }

    public final <T> void a(String str, T t) {
        v62.f(str, "key");
        Map<String, Object> map = this.a;
        if (t != null) {
            map.put(str, t);
            return;
        }
        throw new r22("null cannot be cast to non-null type kotlin.Any");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof wg2) && v62.a(this.a, ((wg2) obj).a);
        }
        return true;
    }

    public int hashCode() {
        Map<String, Object> map = this.a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Properties(data=" + this.a + ")";
    }
}
