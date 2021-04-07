package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: bf1  reason: default package */
final /* synthetic */ class bf1 implements FilenameFilter {
    private static final bf1 a = new bf1();

    private bf1() {
    }

    public static FilenameFilter a() {
        return a;
    }

    public boolean accept(File file, String str) {
        return ff1.s(file, str);
    }
}
