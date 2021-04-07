package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: ze1  reason: default package */
final /* synthetic */ class ze1 implements FilenameFilter {
    private final String a;

    private ze1(String str) {
        this.a = str;
    }

    public static FilenameFilter a(String str) {
        return new ze1(str);
    }

    public boolean accept(File file, String str) {
        return str.startsWith(this.a);
    }
}
