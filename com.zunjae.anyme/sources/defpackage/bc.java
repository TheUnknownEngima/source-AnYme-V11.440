package defpackage;

import defpackage.qa;
import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

/* renamed from: bc  reason: default package */
public class bc<T> {
    public static int h = 65536;
    private File a;
    private String b;
    private File c;
    private PrintWriter d;
    private final y9<T, String> e;
    private final y9<File, List<T>> f;
    private int g = 0;

    /* renamed from: bc$a */
    class a implements FilenameFilter {
        final /* synthetic */ String a;

        a(bc bcVar, String str) {
            this.a = str;
        }

        public boolean accept(File file, String str) {
            return str.startsWith(this.a);
        }
    }

    /* renamed from: bc$b */
    private static class b extends qa.a {
        public b(File[] fileArr) {
            super(fileArr);
        }

        public int b(File file, Long l, File file2, Long l2) {
            return l.compareTo(l2);
        }
    }

    public bc(y9<T, String> y9Var, y9<File, List<T>> y9Var2, File file, String str) {
        this.e = y9Var;
        this.f = y9Var2;
        this.a = file;
        this.b = str;
    }

    private zb<T> b(File file, String str, int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        if (file != null) {
            File[] listFiles = file.listFiles(new a(this, str));
            qa.b(listFiles, new b(listFiles));
            if (i == 0) {
                i = Integer.MAX_VALUE;
            }
            int i2 = 0;
            while (i2 < listFiles.length && i2 < i) {
                File file2 = listFiles[i2];
                linkedList2.add(file2);
                linkedList.addAll(this.f.b(file2));
                i2++;
            }
        }
        return new zb<>(linkedList, linkedList2);
    }

    private boolean d(String str, File file) {
        return file.length() + ((long) str.getBytes().length) <= ((long) h);
    }

    private boolean f(boolean z) {
        boolean z2 = !z;
        if (!z2 || this.g <= 0) {
            int i = this.g;
            if (i > 1) {
                return true;
            }
            if (z) {
                this.g = i + 1;
            }
            return z2;
        }
        this.g = 0;
        return true;
    }

    public zb<T> a(int i) {
        return b(this.a, this.b, i);
    }

    public boolean c(T t) {
        try {
            String b2 = this.e.b(t);
            if (this.c != null && !d(b2, this.c)) {
                j();
            }
            if (this.c == null) {
                this.c = new File(this.a, this.b);
            }
            if (this.d == null) {
                this.d = new PrintWriter(this.c);
            }
            this.d.println(b2);
            this.d.flush();
            return f(this.d.checkError());
        } catch (Exception unused) {
            return f(true);
        }
    }

    public boolean e(List<File> list) {
        boolean z = true;
        for (File delete : list) {
            z &= delete.delete();
        }
        return z;
    }

    public zb<T> g(int i) {
        return b(this.a, this.b + "-", i);
    }

    public zb<T> h() {
        return a(0);
    }

    public zb<T> i() {
        return g(0);
    }

    public boolean j() {
        PrintWriter printWriter = this.d;
        if (printWriter != null) {
            printWriter.close();
        }
        if (this.c == null) {
            return false;
        }
        File file = this.a;
        File file2 = new File(file, this.b + "-" + System.currentTimeMillis() + ".json");
        boolean renameTo = this.c.renameTo(file2);
        if (renameTo) {
            this.c = null;
            this.d = null;
            if (file2.length() == 0) {
                file2.delete();
            }
        }
        return renameTo;
    }
}
