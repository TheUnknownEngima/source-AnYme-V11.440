package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: n32  reason: default package */
class n32 extends m32 {

    /* renamed from: n32$a */
    public static final class a implements g82<T> {
        final /* synthetic */ Iterable a;

        public a(Iterable iterable) {
            this.a = iterable;
        }

        public Iterator<T> iterator() {
            return this.a.iterator();
        }
    }

    /* renamed from: n32$b */
    static final class b extends w62 implements z52<Integer, T> {
        final /* synthetic */ int f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i) {
            super(1);
            this.f = i;
        }

        public final T a(int i) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f + '.');
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a(((Number) obj).intValue());
            throw null;
        }
    }

    public static <T> T A(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$firstOrNull");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static <T> T B(List<? extends T> list) {
        v62.e(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> T C(List<? extends T> list, int i) {
        v62.e(list, "$this$getOrNull");
        if (i < 0 || i > f32.g(list)) {
            return null;
        }
        return list.get(i);
    }

    public static final <T, A extends Appendable> A D(Iterable<? extends T> iterable, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, z52<? super T, ? extends CharSequence> z52) {
        v62.e(iterable, "$this$joinTo");
        v62.e(a2, "buffer");
        v62.e(charSequence, "separator");
        v62.e(charSequence2, "prefix");
        v62.e(charSequence3, "postfix");
        v62.e(charSequence4, "truncated");
        a2.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            x82.a(a2, next, z52);
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static /* synthetic */ Appendable E(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, z52 z52, int i2, Object obj) {
        String str = (i2 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        D(iterable, appendable, str, charSequence6, charSequence5, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : z52);
        return appendable;
    }

    public static final <T> String F(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, z52<? super T, ? extends CharSequence> z52) {
        v62.e(iterable, "$this$joinToString");
        v62.e(charSequence, "separator");
        v62.e(charSequence2, "prefix");
        v62.e(charSequence3, "postfix");
        v62.e(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        D(iterable, sb, charSequence, charSequence2, charSequence3, i, charSequence4, z52);
        String sb2 = sb.toString();
        v62.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String G(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, z52 z52, int i2, Object obj) {
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
        return F(iterable, charSequence, charSequence6, charSequence5, i3, charSequence7, z52);
    }

    public static final <T> T H(Iterable<? extends T> iterable) {
        T next;
        v62.e(iterable, "$this$last");
        if (iterable instanceof List) {
            return I((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T I(List<? extends T> list) {
        v62.e(list, "$this$last");
        if (!list.isEmpty()) {
            return list.get(f32.g(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T J(List<? extends T> list) {
        v62.e(list, "$this$lastOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T extends Comparable<? super T>> T K(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$max");
        return L(iterable);
    }

    public static final <T extends Comparable<? super T>> T L(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$maxOrNull");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    public static <T extends Comparable<? super T>> T M(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$minOrNull");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    public static <T> List<T> N(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        v62.e(iterable, "$this$minus");
        v62.e(iterable2, "elements");
        Collection<? extends T> m = g32.m(iterable2, iterable);
        if (m.isEmpty()) {
            return a0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!m.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static <T> List<T> O(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        v62.e(collection, "$this$plus");
        v62.e(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        boolean unused = k32.q(arrayList2, iterable);
        return arrayList2;
    }

    public static <T> List<T> P(Collection<? extends T> collection, T t) {
        v62.e(collection, "$this$plus");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static <T> List<T> Q(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$reversed");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return a0(iterable);
        }
        List<T> c0 = c0(iterable);
        m32.s(c0);
        return c0;
    }

    public static <T> T R(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$single");
        if (iterable instanceof List) {
            return S((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T S(List<? extends T> list) {
        v62.e(list, "$this$single");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static <T extends Comparable<? super T>> List<T> T(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$sorted");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return a0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (array != null) {
                Comparable[] comparableArr = (Comparable[]) array;
                if (comparableArr != null) {
                    a32.d(comparableArr);
                    return a32.a(comparableArr);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            List<T> c0 = c0(iterable);
            j32.o(c0);
            return c0;
        }
    }

    public static <T> List<T> U(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        v62.e(iterable, "$this$sortedWith");
        v62.e(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return a0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (array != null) {
                a32.e(array, comparator);
                return a32.a(array);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            List<T> c0 = c0(iterable);
            j32.p(c0, comparator);
            return c0;
        }
    }

    public static <T> Set<T> V(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        v62.e(iterable, "$this$subtract");
        v62.e(iterable2, "other");
        Set<T> e0 = e0(iterable);
        k32.r(e0, iterable2);
        return e0;
    }

    public static int W(Iterable<Integer> iterable) {
        v62.e(iterable, "$this$sum");
        int i = 0;
        for (Integer intValue : iterable) {
            i += intValue.intValue();
        }
        return i;
    }

    public static <T> List<T> X(Iterable<? extends T> iterable, int i) {
        v62.e(iterable, "$this$take");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return f32.f();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return a0(iterable);
                }
                if (i == 1) {
                    return e32.b(y(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object add : iterable) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return f32.j(arrayList);
        }
    }

    public static final <T, C extends Collection<? super T>> C Y(Iterable<? extends T> iterable, C c) {
        v62.e(iterable, "$this$toCollection");
        v62.e(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    public static final <T> HashSet<T> Z(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$toHashSet");
        HashSet<T> hashSet = new HashSet<>(v32.a(g32.l(iterable, 12)));
        Y(iterable, hashSet);
        return hashSet;
    }

    public static <T> List<T> a0(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return f32.j(c0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return f32.f();
        }
        if (size != 1) {
            return d0(collection);
        }
        return e32.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static long[] b0(Collection<Long> collection) {
        v62.e(collection, "$this$toLongArray");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Long longValue : collection) {
            jArr[i] = longValue.longValue();
            i++;
        }
        return jArr;
    }

    public static final <T> List<T> c0(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$toMutableList");
        if (iterable instanceof Collection) {
            return d0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Y(iterable, arrayList);
        return arrayList;
    }

    public static <T> List<T> d0(Collection<? extends T> collection) {
        v62.e(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    public static <T> Set<T> e0(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$toMutableSet");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Y(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> Set<T> f0(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$toSet");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return a42.b();
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(v32.a(collection.size()));
                Y(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return z32.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Y(iterable, linkedHashSet2);
        return a42.c(linkedHashSet2);
    }

    public static <T> boolean t(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$any");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static <T> g82<T> u(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$asSequence");
        return new a(iterable);
    }

    public static <T> List<T> v(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        v62.e(iterable, "$this$drop");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return a0(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    return f32.f();
                }
                if (size == 1) {
                    return e32.b(H(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i < size2) {
                            arrayList.add(((List) iterable).get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object next : iterable) {
                if (i2 >= i) {
                    arrayList.add(next);
                } else {
                    i2++;
                }
            }
            return f32.j(arrayList);
        }
    }

    public static <T> T w(Iterable<? extends T> iterable, int i) {
        v62.e(iterable, "$this$elementAt");
        return iterable instanceof List ? ((List) iterable).get(i) : x(iterable, i, new b(i));
    }

    public static final <T> T x(Iterable<? extends T> iterable, int i, z52<? super Integer, ? extends T> z52) {
        v62.e(iterable, "$this$elementAtOrElse");
        v62.e(z52, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i < 0 || i > f32.g(list)) ? z52.r(Integer.valueOf(i)) : list.get(i);
        }
        if (i >= 0) {
            int i2 = 0;
            for (T next : iterable) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return next;
                }
                i2 = i3;
            }
        }
        return z52.r(Integer.valueOf(i));
    }

    public static final <T> T y(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$first");
        if (iterable instanceof List) {
            return z((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T z(List<? extends T> list) {
        v62.e(list, "$this$first");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }
}
