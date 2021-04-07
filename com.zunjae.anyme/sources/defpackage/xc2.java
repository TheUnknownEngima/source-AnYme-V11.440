package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: xc2  reason: default package */
public interface xc2 {
    public static final xc2 a = new a();

    /* renamed from: xc2$a */
    class a implements xc2 {
        a() {
        }

        public de2 a(File file) {
            return wd2.j(file);
        }

        public ce2 b(File file) {
            try {
                return wd2.f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return wd2.f(file);
            }
        }

        public void c(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        c(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        public boolean d(File file) {
            return file.exists();
        }

        public void e(File file, File file2) {
            f(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }

        public void f(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        public ce2 g(File file) {
            try {
                return wd2.a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return wd2.a(file);
            }
        }

        public long h(File file) {
            return file.length();
        }
    }

    de2 a(File file);

    ce2 b(File file);

    void c(File file);

    boolean d(File file);

    void e(File file, File file2);

    void f(File file);

    ce2 g(File file);

    long h(File file);
}
