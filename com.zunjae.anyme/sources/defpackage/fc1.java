package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: fc1  reason: default package */
final /* synthetic */ class fc1 implements FilenameFilter {
    private static final fc1 a = new fc1();

    private fc1() {
    }

    public static FilenameFilter a() {
        return a;
    }

    public boolean accept(File file, String str) {
        return str.startsWith(".ae");
    }
}
