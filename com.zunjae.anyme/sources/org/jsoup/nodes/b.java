package org.jsoup.nodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jsoup.nodes.f;

public class b implements Iterable<a>, Cloneable {
    private LinkedHashMap<String, a> e = null;

    public void c(b bVar) {
        if (bVar.size() != 0) {
            if (this.e == null) {
                this.e = new LinkedHashMap<>(bVar.size());
            }
            this.e.putAll(bVar.e);
        }
    }

    public List<a> d() {
        if (this.e == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        for (Map.Entry<String, a> value : this.e.entrySet()) {
            arrayList.add(value.getValue());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        LinkedHashMap<String, a> linkedHashMap = this.e;
        LinkedHashMap<String, a> linkedHashMap2 = ((b) obj).e;
        if (linkedHashMap != null) {
            return linkedHashMap.equals(linkedHashMap2);
        }
        if (linkedHashMap2 == null) {
            return true;
        }
    }

    /* renamed from: g */
    public b clone() {
        if (this.e == null) {
            return new b();
        }
        try {
            b bVar = (b) super.clone();
            bVar.e = new LinkedHashMap<>(this.e.size());
            Iterator<a> it = iterator();
            while (it.hasNext()) {
                a next = it.next();
                bVar.e.put(next.getKey(), next.clone());
            }
            return bVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public int hashCode() {
        LinkedHashMap<String, a> linkedHashMap = this.e;
        if (linkedHashMap != null) {
            return linkedHashMap.hashCode();
        }
        return 0;
    }

    public Iterator<a> iterator() {
        LinkedHashMap<String, a> linkedHashMap = this.e;
        return (linkedHashMap == null || linkedHashMap.isEmpty()) ? Collections.emptyList().iterator() : this.e.values().iterator();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r3 = r0.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String j(java.lang.String r3) {
        /*
            r2 = this;
            defpackage.jf2.h(r3)
            java.util.LinkedHashMap<java.lang.String, org.jsoup.nodes.a> r0 = r2.e
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.Object r3 = r0.get(r3)
            org.jsoup.nodes.a r3 = (org.jsoup.nodes.a) r3
            if (r3 == 0) goto L_0x0016
            java.lang.String r1 = r3.getValue()
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.b.j(java.lang.String):java.lang.String");
    }

    public String n(String str) {
        jf2.h(str);
        LinkedHashMap<String, a> linkedHashMap = this.e;
        if (linkedHashMap == null) {
            return "";
        }
        for (String next : linkedHashMap.keySet()) {
            if (next.equalsIgnoreCase(str)) {
                return this.e.get(next).getValue();
            }
        }
        return "";
    }

    public boolean o(String str) {
        LinkedHashMap<String, a> linkedHashMap = this.e;
        return linkedHashMap != null && linkedHashMap.containsKey(str);
    }

    public boolean p(String str) {
        LinkedHashMap<String, a> linkedHashMap = this.e;
        if (linkedHashMap == null) {
            return false;
        }
        for (String equalsIgnoreCase : linkedHashMap.keySet()) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public String r() {
        StringBuilder sb = new StringBuilder();
        try {
            t(sb, new f("").I0());
            return sb.toString();
        } catch (IOException e2) {
            throw new ef2(e2);
        }
    }

    public int size() {
        LinkedHashMap<String, a> linkedHashMap = this.e;
        if (linkedHashMap == null) {
            return 0;
        }
        return linkedHashMap.size();
    }

    /* access modifiers changed from: package-private */
    public void t(Appendable appendable, f.a aVar) {
        LinkedHashMap<String, a> linkedHashMap = this.e;
        if (linkedHashMap != null) {
            for (Map.Entry<String, a> value : linkedHashMap.entrySet()) {
                appendable.append(" ");
                ((a) value.getValue()).f(appendable, aVar);
            }
        }
    }

    public String toString() {
        return r();
    }

    public void u(String str, String str2) {
        y(new a(str, str2));
    }

    public void y(a aVar) {
        jf2.j(aVar);
        if (this.e == null) {
            this.e = new LinkedHashMap<>(2);
        }
        this.e.put(aVar.getKey(), aVar);
    }
}
