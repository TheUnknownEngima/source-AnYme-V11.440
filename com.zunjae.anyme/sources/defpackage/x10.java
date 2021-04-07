package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.offline.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: x10  reason: default package */
public final class x10 extends z10 {
    public static final x10 l = new x10("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (f0) null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public final List<Uri> d;
    public final List<b> e;
    public final List<a> f;
    public final List<a> g;
    public final f0 h;
    public final List<f0> i;
    public final Map<String, String> j;
    public final List<ns> k;

    /* renamed from: x10$a */
    public static final class a {
        public final Uri a;
        public final f0 b;
        public final String c;

        public a(Uri uri, f0 f0Var, String str, String str2) {
            this.a = uri;
            this.b = f0Var;
            this.c = str2;
        }
    }

    /* renamed from: x10$b */
    public static final class b {
        public final Uri a;
        public final f0 b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public b(Uri uri, f0 f0Var, String str, String str2, String str3, String str4) {
            this.a = uri;
            this.b = f0Var;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, f0.q("0", (String) null, "application/x-mpegURL", (String) null, (String) null, -1, 0, 0, (String) null), (String) null, (String) null, (String) null, (String) null);
        }

        public b a(f0 f0Var) {
            return new b(this.a, f0Var, this.c, this.d, this.e, this.f);
        }
    }

    public x10(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, f0 f0Var, List<f0> list7, boolean z, Map<String, String> map, List<ns> list8) {
        super(str, list, z);
        this.d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f = Collections.unmodifiableList(list4);
        this.g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.h = f0Var;
        this.i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.j = Collections.unmodifiableMap(map);
        this.k = Collections.unmodifiableList(list8);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Uri uri = list.get(i2).a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> d(List<T> list, int i2, List<h> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            T t = list.get(i3);
            int i4 = 0;
            while (true) {
                if (i4 >= list2.size()) {
                    break;
                }
                h hVar = list2.get(i4);
                if (hVar.f == i2 && hVar.g == i3) {
                    arrayList.add(t);
                    break;
                }
                i4++;
            }
        }
        return arrayList;
    }

    public static x10 e(String str) {
        return new x10("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (f0) null, (List<f0>) null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Uri uri = list.get(i2).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public x10 a(List<h> list) {
        return new x10(this.a, this.b, d(this.e, 0, list), Collections.emptyList(), d(this.f, 1, list), d(this.g, 2, list), Collections.emptyList(), this.h, this.i, this.c, this.j, this.k);
    }
}
