package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: y82  reason: default package */
class y82 extends x82 {

    /* renamed from: y82$a */
    static final class a extends w62 implements z52<String, String> {
        public static final a f = new a();

        a() {
            super(1);
        }

        public final String a(String str) {
            v62.e(str, "line");
            return str;
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            String str = (String) obj;
            a(str);
            return str;
        }
    }

    /* renamed from: y82$b */
    static final class b extends w62 implements z52<String, String> {
        final /* synthetic */ String f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f = str;
        }

        /* renamed from: a */
        public final String r(String str) {
            v62.e(str, "line");
            return this.f + str;
        }
    }

    private static final z52<String, String> b(String str) {
        return str.length() == 0 ? a.f : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!o82.c(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    public static final String d(String str, String str2) {
        String j0;
        v62.e(str, "$this$replaceIndent");
        v62.e(str2, "newIndent");
        List<String> M = g92.M(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (T next : M) {
            if (!f92.n((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(g32.l(arrayList, 10));
        for (String c : arrayList) {
            arrayList2.add(Integer.valueOf(c(c)));
        }
        Integer num = (Integer) n32.M(arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * M.size());
        z52<String, String> b2 = b(str2);
        int g = f32.g(M);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : M) {
            int i2 = i + 1;
            String str3 = null;
            if (i >= 0) {
                String str4 = (String) next2;
                if ((!(i == 0 || i == g) || !f92.n(str4)) && ((j0 = i92.j0(str4, intValue)) == null || (str3 = b2.r(j0)) == null)) {
                    str3 = str4;
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i = i2;
            } else {
                d32.k();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length);
        Appendable unused = n32.E(arrayList3, sb, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (z52) null, 124, (Object) null);
        String sb2 = sb.toString();
        v62.d(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    public static String e(String str) {
        v62.e(str, "$this$trimIndent");
        return d(str, "");
    }
}
