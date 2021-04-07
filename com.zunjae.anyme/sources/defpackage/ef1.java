package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: ef1  reason: default package */
final /* synthetic */ class ef1 implements FilenameFilter {
    private static final ef1 a = new ef1();

    private ef1() {
    }

    public static FilenameFilter a() {
        return a;
    }

    public boolean accept(File file, String str) {
        return str.startsWith("event");
    }
}
