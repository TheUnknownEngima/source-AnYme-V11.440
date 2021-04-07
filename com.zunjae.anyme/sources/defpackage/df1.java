package defpackage;

import java.io.File;
import java.util.Comparator;

/* renamed from: df1  reason: default package */
final /* synthetic */ class df1 implements Comparator {
    private static final df1 e = new df1();

    private df1() {
    }

    public static Comparator a() {
        return e;
    }

    public int compare(Object obj, Object obj2) {
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
