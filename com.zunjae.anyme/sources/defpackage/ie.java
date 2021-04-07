package defpackage;

import java.io.File;

/* renamed from: ie  reason: default package */
class ie {
    ie() {
    }

    public boolean a(File file) {
        return file.exists();
    }

    public File b(String str) {
        return new File(str);
    }

    public long c(File file) {
        return file.length();
    }
}
