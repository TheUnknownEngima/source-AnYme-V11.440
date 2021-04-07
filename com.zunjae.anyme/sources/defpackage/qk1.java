package defpackage;

import com.github.mikephil.charting.utils.Utils;
import defpackage.vj1;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: qk1  reason: default package */
final class qk1 {
    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static boolean b(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == Utils.FLOAT_EPSILON;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == Utils.DOUBLE_EPSILON;
        }
        if (obj instanceof String) {
            obj2 = "";
        } else if (!(obj instanceof ej1)) {
            return obj instanceof ok1 ? obj == ((ok1) obj).c() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
        } else {
            obj2 = ej1.f;
        }
        return obj.equals(obj2);
    }

    static final void c(StringBuilder sb, int i, String str, Object obj) {
        String a;
        if (obj instanceof List) {
            for (Object c : (List) obj) {
                c(sb, i, str, c);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry c2 : ((Map) obj).entrySet()) {
                c(sb, i, str, c2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                a = jl1.c((String) obj);
            } else if (obj instanceof ej1) {
                sb.append(": \"");
                a = jl1.a((ej1) obj);
            } else {
                if (obj instanceof vj1) {
                    sb.append(" {");
                    d((vj1) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    c(sb, i4, "key", entry.getKey());
                    c(sb, i4, "value", entry.getValue());
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    sb.append(": ");
                    sb.append(obj.toString());
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(a);
            sb.append('\"');
        }
    }

    private static void d(ok1 ok1, StringBuilder sb, int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : ok1.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            boolean z = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i, a(str2), vj1.w(method2, ok1, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i, a(str3), vj1.w(method3, ok1, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + substring)) != null) {
                if (substring.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                Method method4 = (Method) hashMap.get("get" + substring);
                Method method5 = (Method) hashMap.get("has" + substring);
                if (method4 != null) {
                    Object w = vj1.w(method4, ok1, new Object[0]);
                    if (method5 != null) {
                        z = ((Boolean) vj1.w(method5, ok1, new Object[0])).booleanValue();
                    } else if (b(w)) {
                        z = false;
                    }
                    if (z) {
                        c(sb, i, a(str4), w);
                    }
                }
            }
        }
        if (ok1 instanceof vj1.c) {
            Iterator<Map.Entry<vj1.d, Object>> s = ((vj1.c) ok1).i.s();
            while (s.hasNext()) {
                Map.Entry next = s.next();
                c(sb, i, "[" + ((vj1.d) next.getKey()).j() + "]", next.getValue());
            }
        }
        ml1 ml1 = ((vj1) ok1).f;
        if (ml1 != null) {
            ml1.m(sb, i);
        }
    }

    static String e(ok1 ok1, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(ok1, sb, 0);
        return sb.toString();
    }
}
