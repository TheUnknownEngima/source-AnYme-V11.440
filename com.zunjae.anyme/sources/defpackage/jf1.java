package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/* renamed from: jf1  reason: default package */
public class jf1 extends FileOutputStream {
    public static final FilenameFilter h = new a();
    private final String e;
    private File f;
    private boolean g = false;

    /* renamed from: jf1$a */
    class a implements FilenameFilter {
        a() {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    }

    public jf1(File file, String str) {
        super(new File(file, str + ".cls_temp"));
        this.e = file + File.separator + str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append(".cls_temp");
        this.f = new File(sb.toString());
    }

    public void a() {
        if (!this.g) {
            this.g = true;
            super.flush();
            super.close();
        }
    }

    public synchronized void close() {
        if (!this.g) {
            this.g = true;
            super.flush();
            super.close();
            File file = new File(this.e + ".cls");
            if (this.f.renameTo(file)) {
                this.f = null;
                return;
            }
            String str = "";
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.f.exists()) {
                str = " (source does not exist)";
            }
            throw new IOException("Could not rename temp file: " + this.f + " -> " + file + str);
        }
    }
}
