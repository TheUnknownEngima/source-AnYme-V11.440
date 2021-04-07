package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: l30  reason: default package */
final class l30 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final o30 f;
    private final String[] g;
    public final String h;
    public final String i;
    private final HashMap<String, Integer> j;
    private final HashMap<String, Integer> k;
    private List<l30> l;

    private l30(String str, String str2, long j2, long j3, o30 o30, String[] strArr, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = o30;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j2;
        this.e = j3;
        q40.e(str3);
        this.h = str3;
        this.j = new HashMap<>();
        this.k = new HashMap<>();
    }

    private void b(Map<String, o30> map, SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
        o30 d2 = n30.d(this.f, this.g, map);
        if (d2 != null) {
            n30.a(spannableStringBuilder, i2, i3, d2);
        }
    }

    public static l30 c(String str, long j2, long j3, o30 o30, String[] strArr, String str2, String str3) {
        return new l30(str, (String) null, j2, j3, o30, strArr, str2, str3);
    }

    public static l30 d(String str) {
        return new l30((String) null, n30.b(str), -9223372036854775807L, -9223372036854775807L, (o30) null, (String[]) null, "", (String) null);
    }

    private SpannableStringBuilder e(SpannableStringBuilder spannableStringBuilder) {
        int i2;
        int i3;
        int length = spannableStringBuilder.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (spannableStringBuilder.charAt(i5) == ' ') {
                int i6 = i5 + 1;
                int i7 = i6;
                while (i7 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i7) == ' ') {
                    i7++;
                }
                int i8 = i7 - i6;
                if (i8 > 0) {
                    spannableStringBuilder.delete(i5, i5 + i8);
                    length -= i8;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i9 = 0;
        while (true) {
            i2 = length - 1;
            if (i9 >= i2) {
                break;
            }
            if (spannableStringBuilder.charAt(i9) == 10) {
                int i10 = i9 + 1;
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    spannableStringBuilder.delete(i10, i9 + 2);
                    length--;
                }
            }
            i9++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i2) == ' ') {
            spannableStringBuilder.delete(i2, length);
            length--;
        }
        while (true) {
            i3 = length - 1;
            if (i4 >= i3) {
                break;
            }
            if (spannableStringBuilder.charAt(i4) == ' ') {
                int i11 = i4 + 1;
                if (spannableStringBuilder.charAt(i11) == 10) {
                    spannableStringBuilder.delete(i4, i11);
                    length--;
                }
            }
            i4++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i3) == 10) {
            spannableStringBuilder.delete(i3, length);
        }
        return spannableStringBuilder;
    }

    private void i(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.a);
        boolean equals2 = "div".equals(this.a);
        if (z || equals || (equals2 && this.i != null)) {
            long j2 = this.d;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.l != null) {
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                this.l.get(i2).i(treeSet, z || equals);
            }
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    private void m(long j2, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (!l(j2) || !"div".equals(this.a) || this.i == null) {
            for (int i2 = 0; i2 < g(); i2++) {
                f(i2).m(j2, str, list);
            }
            return;
        }
        list.add(new Pair(str, this.i));
    }

    private void n(long j2, Map<String, o30> map, Map<String, SpannableStringBuilder> map2) {
        int i2;
        if (l(j2)) {
            Iterator<Map.Entry<String, Integer>> it = this.k.entrySet().iterator();
            while (true) {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (this.j.containsKey(str)) {
                    i2 = this.j.get(str).intValue();
                }
                int intValue = ((Integer) next.getValue()).intValue();
                if (i2 != intValue) {
                    b(map, map2.get(str), i2, intValue);
                }
            }
            while (i2 < g()) {
                f(i2).n(j2, map, map2);
                i2++;
            }
        }
    }

    private void o(long j2, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.j.clear();
        this.k.clear();
        if (!"metadata".equals(this.a)) {
            if (!"".equals(this.h)) {
                str = this.h;
            }
            if (this.c && z) {
                k(str, map).append(this.b);
            } else if ("br".equals(this.a) && z) {
                k(str, map).append(10);
            } else if (l(j2)) {
                for (Map.Entry next : map.entrySet()) {
                    this.j.put((String) next.getKey(), Integer.valueOf(((SpannableStringBuilder) next.getValue()).length()));
                }
                boolean equals = "p".equals(this.a);
                for (int i2 = 0; i2 < g(); i2++) {
                    f(i2).o(j2, z || equals, str, map);
                }
                if (equals) {
                    n30.c(k(str, map));
                }
                for (Map.Entry next2 : map.entrySet()) {
                    this.k.put((String) next2.getKey(), Integer.valueOf(((SpannableStringBuilder) next2.getValue()).length()));
                }
            }
        }
    }

    public void a(l30 l30) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add(l30);
    }

    public l30 f(int i2) {
        List<l30> list = this.l;
        if (list != null) {
            return list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<l30> list = this.l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<h20> h(long j2, Map<String, o30> map, Map<String, m30> map2, Map<String, String> map3) {
        long j3 = j2;
        Map<String, m30> map4 = map2;
        ArrayList<Pair> arrayList = new ArrayList<>();
        m(j3, this.h, arrayList);
        TreeMap treeMap = new TreeMap();
        o(j2, false, this.h, treeMap);
        n(j3, map, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                m30 m30 = map4.get(pair.first);
                arrayList2.add(new h20(decodeByteArray, m30.b, 0, m30.c, m30.e, m30.f, m30.g));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            m30 m302 = map4.get(entry.getKey());
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) entry.getValue();
            e(spannableStringBuilder);
            arrayList2.add(new h20((CharSequence) spannableStringBuilder, (Layout.Alignment) null, m302.c, m302.d, m302.e, m302.b, Integer.MIN_VALUE, m302.f, m302.h, m302.i));
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i2 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public boolean l(long j2) {
        return (this.d == -9223372036854775807L && this.e == -9223372036854775807L) || (this.d <= j2 && this.e == -9223372036854775807L) || ((this.d == -9223372036854775807L && j2 < this.e) || (this.d <= j2 && j2 < this.e));
    }
}
