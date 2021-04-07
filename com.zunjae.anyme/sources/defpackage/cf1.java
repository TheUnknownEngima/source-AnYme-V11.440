package defpackage;

import java.io.File;
import java.util.Comparator;

/* renamed from: cf1  reason: default package */
final /* synthetic */ class cf1 implements Comparator {
    private static final cf1 e = new cf1();

    private cf1() {
    }

    public static Comparator a() {
        return e;
    }

    public int compare(Object obj, Object obj2) {
        return ff1.z((File) obj, (File) obj2);
    }
}
