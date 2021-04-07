package defpackage;

import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: x12  reason: default package */
public final class x12 implements Map<String, String>, j72 {
    private final /* synthetic */ Map e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x12(java.util.Map<java.lang.String, java.lang.String> r2) {
        /*
            r1 = this;
            java.lang.String r0 = "parameters"
            defpackage.v62.f(r2, r0)
            java.util.List r2 = defpackage.x32.o(r2)
            if (r2 == 0) goto L_0x0029
            r0 = 0
            l22[] r0 = new defpackage.l22[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            if (r2 == 0) goto L_0x0021
            l22[] r2 = (defpackage.l22[]) r2
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            l22[] r2 = (defpackage.l22[]) r2
            r1.<init>((defpackage.l22<java.lang.String, java.lang.String>[]) r2)
            return
        L_0x0021:
            r22 r2 = new r22
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r2.<init>(r0)
            throw r2
        L_0x0029:
            r22 r2 = new r22
            java.lang.String r0 = "null cannot be cast to non-null type java.util.Collection<T>"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x12.<init>(java.util.Map):void");
    }

    public x12(l22<String, String>... l22Arr) {
        v62.f(l22Arr, "parameters");
        this.e = w32.f((l22[]) Arrays.copyOf(l22Arr, l22Arr.length));
    }

    public boolean a(String str) {
        v62.f(str, "key");
        return this.e.containsKey(str);
    }

    public boolean b(String str) {
        v62.f(str, "value");
        return this.e.containsValue(str);
    }

    public String c(String str) {
        v62.f(str, "key");
        return (String) this.e.get(str);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return a((String) obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof String) {
            return b((String) obj);
        }
        return false;
    }

    public Set<Map.Entry<String, String>> d() {
        return this.e.entrySet();
    }

    public Set<String> e() {
        return this.e.keySet();
    }

    public final /* bridge */ Set<Map.Entry<String, String>> entrySet() {
        return d();
    }

    public int f() {
        return this.e.size();
    }

    public Collection<String> g() {
        return this.e.values();
    }

    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return c((String) obj);
        }
        return null;
    }

    public boolean isEmpty() {
        return this.e.isEmpty();
    }

    public final /* bridge */ Set<String> keySet() {
        return e();
    }

    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends String, ? extends String> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction<? super String, ? super String, ? extends String> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return f();
    }

    public String toString() {
        if (isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (sb.length() > 0) {
                sb.append("&");
            }
            StringBuilder unused = c92.f(sb, str, "=", URLEncoder.encode(str2, "UTF-8"));
        }
        String sb2 = sb.toString();
        v62.b(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final /* bridge */ Collection<String> values() {
        return g();
    }
}
