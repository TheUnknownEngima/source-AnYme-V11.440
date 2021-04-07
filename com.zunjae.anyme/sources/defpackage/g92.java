package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: g92  reason: default package */
class g92 extends f92 {

    /* renamed from: g92$a */
    static final class a extends w62 implements d62<CharSequence, Integer, l22<? extends Integer, ? extends Integer>> {
        final /* synthetic */ List f;
        final /* synthetic */ boolean g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List list, boolean z) {
            super(2);
            this.f = list;
            this.g = z;
        }

        public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }

        public final l22<Integer, Integer> a(CharSequence charSequence, int i) {
            v62.e(charSequence, "$receiver");
            l22 t = g92.w(charSequence, this.f, i, this.g, false);
            if (t != null) {
                return q22.a(t.c(), Integer.valueOf(((String) t.d()).length()));
            }
            return null;
        }
    }

    /* renamed from: g92$b */
    static final class b extends w62 implements z52<t72, String> {
        final /* synthetic */ CharSequence f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence) {
            super(1);
            this.f = charSequence;
        }

        /* renamed from: a */
        public final String r(t72 t72) {
            v62.e(t72, "it");
            return g92.Z(this.f, t72);
        }
    }

    public static final int A(CharSequence charSequence, String str, int i, boolean z) {
        v62.e(charSequence, "$this$indexOf");
        v62.e(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return C(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    private static final int B(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        r72 t72 = !z2 ? new t72(w72.b(i, 0), w72.e(i2, charSequence.length())) : w72.h(w72.e(i, y(charSequence)), w72.b(i2, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a2 = t72.a();
            int c = t72.c();
            int d = t72.d();
            if (d >= 0) {
                if (a2 > c) {
                    return -1;
                }
            } else if (a2 < c) {
                return -1;
            }
            while (true) {
                if (R(charSequence2, 0, charSequence, a2, charSequence2.length(), z)) {
                    return a2;
                }
                if (a2 == c) {
                    return -1;
                }
                a2 += d;
            }
        } else {
            int a3 = t72.a();
            int c2 = t72.c();
            int d2 = t72.d();
            if (d2 >= 0) {
                if (a3 > c2) {
                    return -1;
                }
            } else if (a3 < c2) {
                return -1;
            }
            while (true) {
                if (f92.o((String) charSequence2, 0, (String) charSequence, a3, charSequence2.length(), z)) {
                    return a3;
                }
                if (a3 == c2) {
                    return -1;
                }
                a3 += d2;
            }
        }
    }

    static /* synthetic */ int C(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return B(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    public static /* synthetic */ int D(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return z(charSequence, c, i, z);
    }

    public static /* synthetic */ int E(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return A(charSequence, str, i, z);
    }

    public static final int F(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        v62.e(charSequence, "$this$indexOfAny");
        v62.e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int b2 = w72.b(i, 0);
            int y = y(charSequence);
            if (b2 > y) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(b2);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    } else if (p82.d(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return b2;
                }
                if (b2 == y) {
                    return -1;
                }
                b2++;
            }
        } else {
            return ((String) charSequence).indexOf(b32.l(cArr), i);
        }
    }

    public static final int G(CharSequence charSequence, char c, int i, boolean z) {
        v62.e(charSequence, "$this$lastIndexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return K(charSequence, new char[]{c}, i, z);
    }

    public static final int H(CharSequence charSequence, String str, int i, boolean z) {
        v62.e(charSequence, "$this$lastIndexOf");
        v62.e(str, "string");
        return (z || !(charSequence instanceof String)) ? B(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    public static /* synthetic */ int I(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = y(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return G(charSequence, c, i, z);
    }

    public static /* synthetic */ int J(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = y(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return H(charSequence, str, i, z);
    }

    public static final int K(CharSequence charSequence, char[] cArr, int i, boolean z) {
        v62.e(charSequence, "$this$lastIndexOfAny");
        v62.e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int e = w72.e(i, y(charSequence)); e >= 0; e--) {
                char charAt = charSequence.charAt(e);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (p82.d(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return e;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(b32.l(cArr), i);
    }

    public static final g82<String> L(CharSequence charSequence) {
        v62.e(charSequence, "$this$lineSequence");
        return W(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static final List<String> M(CharSequence charSequence) {
        v62.e(charSequence, "$this$lines");
        return m82.j(L(charSequence));
    }

    public static final CharSequence N(CharSequence charSequence, int i, char c) {
        v62.e(charSequence, "$this$padStart");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - charSequence.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append(charSequence);
            return sb;
        }
    }

    public static String O(String str, int i, char c) {
        v62.e(str, "$this$padStart");
        return N(str, i, c).toString();
    }

    private static final g82<t72> P(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new r82(charSequence, i, i2, new a(a32.a(strArr), z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    static /* synthetic */ g82 Q(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return P(charSequence, strArr, i, z, i2);
    }

    public static final boolean R(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        v62.e(charSequence, "$this$regionMatchesImpl");
        v62.e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!p82.d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final List<String> S(CharSequence charSequence, String[] strArr, boolean z, int i) {
        v62.e(charSequence, "$this$split");
        v62.e(strArr, "delimiters");
        boolean z2 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return T(charSequence, str, z, i);
            }
        }
        Iterable<t72> d = m82.d(Q(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(g32.l(d, 10));
        for (t72 Z : d) {
            arrayList.add(Z(charSequence, Z));
        }
        return arrayList;
    }

    private static final List<String> T(CharSequence charSequence, String str, boolean z, int i) {
        int i2 = 0;
        if (i >= 0) {
            int A = A(charSequence, str, 0, z);
            if (A == -1 || i == 1) {
                return e32.b(charSequence.toString());
            }
            boolean z2 = i > 0;
            int i3 = 10;
            if (z2) {
                i3 = w72.e(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, A).toString());
                i2 = str.length() + A;
                if ((z2 && arrayList.size() == i - 1) || (A = A(charSequence, str, i2, z)) == -1) {
                    arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                }
                arrayList.add(charSequence.subSequence(i2, A).toString());
                i2 = str.length() + A;
                break;
            } while ((A = A(charSequence, str, i2, z)) == -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    public static /* synthetic */ List U(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return S(charSequence, strArr, z, i);
    }

    public static final g82<String> V(CharSequence charSequence, String[] strArr, boolean z, int i) {
        v62.e(charSequence, "$this$splitToSequence");
        v62.e(strArr, "delimiters");
        return m82.h(Q(charSequence, strArr, 0, z, i, 2, (Object) null), new b(charSequence));
    }

    public static /* synthetic */ g82 W(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return V(charSequence, strArr, z, i);
    }

    public static final boolean X(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        v62.e(charSequence, "$this$startsWith");
        v62.e(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return f92.s((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return R(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean Y(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return X(charSequence, charSequence2, z);
    }

    public static final String Z(CharSequence charSequence, t72 t72) {
        v62.e(charSequence, "$this$substring");
        v62.e(t72, "range");
        return charSequence.subSequence(t72.j().intValue(), t72.i().intValue() + 1).toString();
    }

    public static final String a0(String str, String str2, String str3) {
        v62.e(str, "$this$substringAfter");
        v62.e(str2, "delimiter");
        v62.e(str3, "missingDelimiterValue");
        int E = E(str, str2, 0, false, 6, (Object) null);
        if (E == -1) {
            return str3;
        }
        String substring = str.substring(E + str2.length(), str.length());
        v62.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String b0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return a0(str, str2, str3);
    }

    public static final String c0(String str, char c, String str2) {
        v62.e(str, "$this$substringAfterLast");
        v62.e(str2, "missingDelimiterValue");
        int I = I(str, c, 0, false, 6, (Object) null);
        if (I == -1) {
            return str2;
        }
        String substring = str.substring(I + 1, str.length());
        v62.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String d0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return c0(str, c, str2);
    }

    public static final String e0(String str, char c, String str2) {
        v62.e(str, "$this$substringBefore");
        v62.e(str2, "missingDelimiterValue");
        int D = D(str, c, 0, false, 6, (Object) null);
        if (D == -1) {
            return str2;
        }
        String substring = str.substring(0, D);
        v62.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String f0(String str, String str2, String str3) {
        v62.e(str, "$this$substringBefore");
        v62.e(str2, "delimiter");
        v62.e(str3, "missingDelimiterValue");
        int E = E(str, str2, 0, false, 6, (Object) null);
        if (E == -1) {
            return str3;
        }
        String substring = str.substring(0, E);
        v62.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String g0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return e0(str, c, str2);
    }

    public static /* synthetic */ String h0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return f0(str, str2, str3);
    }

    public static CharSequence i0(CharSequence charSequence) {
        v62.e(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean c = o82.c(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final boolean u(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        v62.e(charSequence, "$this$contains");
        v62.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (E(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (C(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean v(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return u(charSequence, charSequence2, z);
    }

    /* access modifiers changed from: private */
    public static final l22<Integer, String> w(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        int i2;
        T t;
        String str;
        T t2;
        if (z || collection.size() != 1) {
            r72 t72 = !z2 ? new t72(w72.b(i, 0), charSequence.length()) : w72.h(w72.e(i, y(charSequence)), 0);
            if (charSequence instanceof String) {
                i2 = t72.a();
                int c = t72.c();
                int d = t72.d();
                if (d < 0 ? i2 >= c : i2 <= c) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            String str2 = (String) t2;
                            if (f92.o(str2, 0, (String) charSequence, i2, str2.length(), z)) {
                                break;
                            }
                        }
                        str = (String) t2;
                        if (str == null) {
                            if (i2 == c) {
                                break;
                            }
                            i2 += d;
                        } else {
                            break;
                        }
                    }
                }
                return null;
            }
            int a2 = t72.a();
            int c2 = t72.c();
            int d2 = t72.d();
            if (d2 < 0 ? a2 >= c2 : a2 <= c2) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it2.next();
                        String str3 = (String) t;
                        if (R(str3, 0, charSequence, i2, str3.length(), z)) {
                            break;
                        }
                    }
                    str = (String) t;
                    if (str == null) {
                        if (i2 == c2) {
                            break;
                        }
                        a2 = i2 + d2;
                    } else {
                        break;
                    }
                }
            }
            return null;
            return q22.a(Integer.valueOf(i2), str);
        }
        String str4 = (String) n32.R(collection);
        CharSequence charSequence2 = charSequence;
        String str5 = str4;
        int i3 = i;
        int E = !z2 ? E(charSequence2, str5, i3, false, 4, (Object) null) : J(charSequence2, str5, i3, false, 4, (Object) null);
        if (E < 0) {
            return null;
        }
        return q22.a(Integer.valueOf(E), str4);
    }

    public static final t72 x(CharSequence charSequence) {
        v62.e(charSequence, "$this$indices");
        return new t72(0, charSequence.length() - 1);
    }

    public static final int y(CharSequence charSequence) {
        v62.e(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    public static final int z(CharSequence charSequence, char c, int i, boolean z) {
        v62.e(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return F(charSequence, new char[]{c}, i, z);
    }
}
