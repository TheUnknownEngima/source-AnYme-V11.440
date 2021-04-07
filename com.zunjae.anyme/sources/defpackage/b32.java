package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: b32  reason: default package */
class b32 extends a32 {

    /* renamed from: b32$a */
    public static final class a implements g82<T> {
        final /* synthetic */ Object[] a;

        public a(Object[] objArr) {
            this.a = objArr;
        }

        public Iterator<T> iterator() {
            return m62.a(this.a);
        }
    }

    public static <T> g82<T> f(T[] tArr) {
        v62.e(tArr, "$this$asSequence");
        return tArr.length == 0 ? k82.c() : new a(tArr);
    }

    public static <T> boolean g(T[] tArr, T t) {
        v62.e(tArr, "$this$contains");
        return h(tArr, t) >= 0;
    }

    public static final <T> int h(T[] tArr, T t) {
        v62.e(tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (v62.a(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A i(T[] tArr, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, z52<? super T, ? extends CharSequence> z52) {
        v62.e(tArr, "$this$joinTo");
        v62.e(a2, "buffer");
        v62.e(charSequence, "separator");
        v62.e(charSequence2, "prefix");
        v62.e(charSequence3, "postfix");
        v62.e(charSequence4, "truncated");
        a2.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            x82.a(a2, t, z52);
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <T> String j(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, z52<? super T, ? extends CharSequence> z52) {
        v62.e(tArr, "$this$joinToString");
        v62.e(charSequence, "separator");
        v62.e(charSequence2, "prefix");
        v62.e(charSequence3, "postfix");
        v62.e(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        i(tArr, sb, charSequence, charSequence2, charSequence3, i, charSequence4, z52);
        String sb2 = sb.toString();
        v62.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String k(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, z52 z52, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            z52 = null;
        }
        return j(objArr, charSequence, charSequence6, charSequence5, i3, charSequence7, z52);
    }

    public static char l(char[] cArr) {
        v62.e(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static <T> T m(T[] tArr) {
        v62.e(tArr, "$this$singleOrNull");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> T[] n(T[] tArr, Comparator<? super T> comparator) {
        v62.e(tArr, "$this$sortedArrayWith");
        v62.e(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        v62.d(copyOf, "java.util.Arrays.copyOf(this, size)");
        a32.e(copyOf, comparator);
        return copyOf;
    }

    public static <T> List<T> o(T[] tArr, Comparator<? super T> comparator) {
        v62.e(tArr, "$this$sortedWith");
        v62.e(comparator, "comparator");
        return a32.a(n(tArr, comparator));
    }

    public static final <T, C extends Collection<? super T>> C p(T[] tArr, C c) {
        v62.e(tArr, "$this$toCollection");
        v62.e(c, "destination");
        for (T add : tArr) {
            c.add(add);
        }
        return c;
    }

    public static <T> List<T> q(T[] tArr) {
        v62.e(tArr, "$this$toList");
        int length = tArr.length;
        return length != 0 ? length != 1 ? r(tArr) : e32.b(tArr[0]) : f32.f();
    }

    public static final <T> List<T> r(T[] tArr) {
        v62.e(tArr, "$this$toMutableList");
        return new ArrayList(f32.e(tArr));
    }

    public static <T> Set<T> s(T[] tArr) {
        v62.e(tArr, "$this$toSet");
        int length = tArr.length;
        if (length == 0) {
            return a42.b();
        }
        if (length == 1) {
            return z32.a(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(v32.a(tArr.length));
        p(tArr, linkedHashSet);
        return linkedHashSet;
    }
}
