package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: m82  reason: default package */
class m82 extends l82 {

    /* renamed from: m82$a */
    public static final class a implements Iterable<T>, j72 {
        final /* synthetic */ g82 e;

        public a(g82 g82) {
            this.e = g82;
        }

        public Iterator<T> iterator() {
            return this.e.iterator();
        }
    }

    public static <T> Iterable<T> d(g82<? extends T> g82) {
        v62.e(g82, "$this$asIterable");
        return new a(g82);
    }

    public static final <T, A extends Appendable> A e(g82<? extends T> g82, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, z52<? super T, ? extends CharSequence> z52) {
        v62.e(g82, "$this$joinTo");
        v62.e(a2, "buffer");
        v62.e(charSequence, "separator");
        v62.e(charSequence2, "prefix");
        v62.e(charSequence3, "postfix");
        v62.e(charSequence4, "truncated");
        a2.append(charSequence2);
        int i2 = 0;
        for (Object next : g82) {
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

    public static final <T> String f(g82<? extends T> g82, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, z52<? super T, ? extends CharSequence> z52) {
        v62.e(g82, "$this$joinToString");
        v62.e(charSequence, "separator");
        v62.e(charSequence2, "prefix");
        v62.e(charSequence3, "postfix");
        v62.e(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        e(g82, sb, charSequence, charSequence2, charSequence3, i, charSequence4, z52);
        String sb2 = sb.toString();
        v62.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String g(g82 g82, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, z52 z52, int i2, Object obj) {
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
        return f(g82, charSequence, charSequence6, charSequence5, i3, charSequence7, z52);
    }

    public static <T, R> g82<R> h(g82<? extends T> g82, z52<? super T, ? extends R> z52) {
        v62.e(g82, "$this$map");
        v62.e(z52, "transform");
        return new n82(g82, z52);
    }

    public static final <T, C extends Collection<? super T>> C i(g82<? extends T> g82, C c) {
        v62.e(g82, "$this$toCollection");
        v62.e(c, "destination");
        for (Object add : g82) {
            c.add(add);
        }
        return c;
    }

    public static <T> List<T> j(g82<? extends T> g82) {
        v62.e(g82, "$this$toList");
        return f32.j(k(g82));
    }

    public static final <T> List<T> k(g82<? extends T> g82) {
        v62.e(g82, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        i(g82, arrayList);
        return arrayList;
    }
}
