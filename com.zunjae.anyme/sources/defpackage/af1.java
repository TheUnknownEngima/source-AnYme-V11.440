package defpackage;

import java.io.File;
import java.io.FileFilter;

/* renamed from: af1  reason: default package */
final /* synthetic */ class af1 implements FileFilter {
    private final String a;

    private af1(String str) {
        this.a = str;
    }

    public static FileFilter a(String str) {
        return new af1(str);
    }

    public boolean accept(File file) {
        return ff1.t(this.a, file);
    }
}
