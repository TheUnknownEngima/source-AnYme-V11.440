package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: p62  reason: default package */
public final class p62 implements y72<Object>, o62 {
    private static final Map<Class<? extends a22<?>>, Integer> b;
    private static final HashMap<String, String> c;
    private static final HashMap<String, String> d;
    private static final HashMap<String, String> e;
    private final Class<?> a;

    static {
        int i = 0;
        List h = f32.h(o52.class, z52.class, d62.class, e62.class, f62.class, g62.class, h62.class, i62.class, j62.class, k62.class, p52.class, q52.class, r52.class, s52.class, t52.class, u52.class, v52.class, w52.class, x52.class, y52.class, a62.class, b62.class, c62.class);
        ArrayList arrayList = new ArrayList(g32.l(h, 10));
        for (Object next : h) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(q22.a((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                d32.k();
                throw null;
            }
        }
        b = w32.k(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        c = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        d = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(c);
        hashMap3.putAll(d);
        Collection<String> values = c.values();
        v62.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            v62.d(str, "kotlinName");
            sb.append(g92.d0(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            l22 a2 = q22.a(sb2, str + ".Companion");
            hashMap3.put(a2.c(), a2.d());
        }
        for (Map.Entry next2 : b.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        e = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(v32.a(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), g92.d0((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
    }

    public p62(Class<?> cls) {
        v62.e(cls, "jClass");
        this.a = cls;
    }

    public Class<?> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof p62) && v62.a(m52.b(this), m52.b((y72) obj));
    }

    public int hashCode() {
        return m52.b(this).hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
