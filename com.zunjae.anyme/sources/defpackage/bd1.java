package defpackage;

import defpackage.ge1;
import java.util.Comparator;

/* renamed from: bd1  reason: default package */
final /* synthetic */ class bd1 implements Comparator {
    private static final bd1 e = new bd1();

    private bd1() {
    }

    public static Comparator a() {
        return e;
    }

    public int compare(Object obj, Object obj2) {
        return ((ge1.b) obj).b().compareTo(((ge1.b) obj2).b());
    }
}
