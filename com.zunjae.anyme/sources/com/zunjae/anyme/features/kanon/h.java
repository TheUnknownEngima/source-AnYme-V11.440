package com.zunjae.anyme.features.kanon;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class h {
    @SerializedName("RatingFrequency")
    private final String a;

    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(Integer.valueOf(((i) t).b()), Integer.valueOf(((i) t2).b()));
        }
    }

    public final List<i> a() {
        Object obj;
        Object obj2;
        boolean z;
        boolean z2;
        if (this.a == null) {
            return null;
        }
        Map f = w32.f(q22.a(1, new l22(1, 2)), q22.a(2, new l22(3, 4)), q22.a(3, new l22(5, 6)), q22.a(4, new l22(7, 8)), q22.a(5, new l22(9, 10)), q22.a(6, new l22(11, 12)), q22.a(7, new l22(13, 14)), q22.a(8, new l22(15, 16)), q22.a(9, new l22(17, 18)), q22.a(10, new l22(19, 20)));
        try {
            List<String> U = g92.U(this.a, new String[]{", "}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(g32.l(U, 10));
            for (String U2 : U) {
                List U3 = g92.U(U2, new String[]{":"}, false, 0, 6, (Object) null);
                arrayList.add(new i(Integer.parseInt((String) U3.get(0)), Integer.parseInt((String) U3.get(1))));
            }
            ArrayList arrayList2 = new ArrayList(f.size());
            for (Map.Entry entry : f.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                l22 l22 = (l22) entry.getValue();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((i) obj).b() == ((Number) l22.c()).intValue()) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                }
                i iVar = (i) obj;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (((i) obj2).b() == ((Number) l22.d()).intValue()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                i iVar2 = (i) obj2;
                arrayList2.add(new i(intValue, (iVar != null ? iVar.a() : 0) + (iVar2 != null ? iVar2.a() : 0)));
            }
            return n32.U(arrayList2, new a());
        } catch (Exception e) {
            uj2.d(e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof h) && v62.a(this.a, ((h) obj).a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "RatingFrequency(ratingFrequency=" + this.a + ")";
    }
}
