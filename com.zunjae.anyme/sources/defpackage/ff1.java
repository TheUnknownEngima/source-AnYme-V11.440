package defpackage;

import defpackage.ge1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ff1  reason: default package */
public class ff1 {
    private static final Charset g = Charset.forName("UTF-8");
    private static final int h = 15;
    private static final pe1 i = new pe1();
    private static final Comparator<? super File> j = df1.a();
    private static final FilenameFilter k = ef1.a();
    private final AtomicInteger a = new AtomicInteger(0);
    private final File b;
    private final File c;
    private final File d;
    private final File e;
    private final eg1 f;

    public ff1(File file, eg1 eg1) {
        File file2 = new File(file, "report-persistence");
        this.b = new File(file2, "sessions");
        this.c = new File(file2, "priority-reports");
        this.d = new File(file2, "reports");
        this.e = new File(file2, "native-reports");
        this.f = eg1;
    }

    private static File C(File file) {
        if (y(file)) {
            return file;
        }
        throw new IOException("Could not create directory " + file);
    }

    private static String D(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), g);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable unused) {
            }
        }
        throw th;
    }

    private static void E(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                for (File E : file.listFiles()) {
                    E(E);
                }
            }
            file.delete();
        }
    }

    private static List<File> F(List<File>... listArr) {
        for (List<File> sort : listArr) {
            Collections.sort(sort, j);
        }
        return f(listArr);
    }

    private static void G(File file, File file2, ge1.c cVar, String str) {
        try {
            ge1 n = i.D(D(file)).n(cVar);
            C(file2);
            K(new File(file2, str), i.E(n));
        } catch (IOException e2) {
            jb1 f2 = jb1.f();
            f2.c("Could not synthesize final native report file for " + file, e2);
        }
    }

    private void H(File file, long j2) {
        boolean z;
        List<File> p = p(file, k);
        if (!p.isEmpty()) {
            Collections.sort(p);
            ArrayList arrayList = new ArrayList();
            Iterator<File> it = p.iterator();
            loop0:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    File next = it.next();
                    try {
                        arrayList.add(i.h(D(next)));
                        if (z || r(next.getName())) {
                            z = true;
                        }
                    } catch (IOException e2) {
                        jb1 f2 = jb1.f();
                        f2.c("Could not add event to report for " + next, e2);
                    }
                }
            }
            String str = null;
            File file2 = new File(file, "user");
            if (file2.isFile()) {
                try {
                    str = D(file2);
                } catch (IOException e3) {
                    jb1 f3 = jb1.f();
                    f3.c("Could not read user ID file in " + file.getName(), e3);
                }
            }
            I(new File(file, "report"), z ? this.c : this.d, arrayList, j2, z, str);
        }
    }

    private static void I(File file, File file2, List<ge1.d.C0116d> list, long j2, boolean z, String str) {
        try {
            ge1 m = i.D(D(file)).o(j2, z, str).m(he1.a(list));
            ge1.d j3 = m.j();
            if (j3 != null) {
                C(file2);
                K(new File(file2, j3.h()), i.E(m));
            }
        } catch (IOException e2) {
            jb1 f2 = jb1.f();
            f2.c("Could not synthesize final report file for " + file, e2);
        }
    }

    private static int J(File file, int i2) {
        List<File> p = p(file, bf1.a());
        Collections.sort(p, cf1.a());
        return d(p, i2);
    }

    private static void K(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), g);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    private List<File> c(String str) {
        List<File> o = o(this.b, af1.a(str));
        Collections.sort(o, j);
        if (o.size() <= 8) {
            return o;
        }
        for (File E : o.subList(8, o.size())) {
            E(E);
        }
        return o.subList(0, 8);
    }

    private static int d(List<File> list, int i2) {
        int size = list.size();
        for (File next : list) {
            if (size <= i2) {
                return size;
            }
            E(next);
            size--;
        }
        return size;
    }

    private void e() {
        int i2 = this.f.b().b().b;
        List<File> m = m();
        int size = m.size();
        if (size > i2) {
            for (File delete : m.subList(i2, size)) {
                delete.delete();
            }
        }
    }

    private static List<File> f(List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (List<File> size : listArr) {
            i2 += size.size();
        }
        arrayList.ensureCapacity(i2);
        for (List<File> addAll : listArr) {
            arrayList.addAll(addAll);
        }
        return arrayList;
    }

    private static String k(int i2, boolean z) {
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(i2)});
        String str = z ? "_" : "";
        return "event" + format + str;
    }

    private static List<File> l(File file) {
        return o(file, (FileFilter) null);
    }

    private List<File> m() {
        return F(f(l(this.c), l(this.e)), l(this.d));
    }

    private static String n(String str) {
        return str.substring(0, h);
    }

    private static List<File> o(File file, FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    private static List<File> p(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    private File q(String str) {
        return new File(this.b, str);
    }

    private static boolean r(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* access modifiers changed from: private */
    public static boolean s(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    static /* synthetic */ boolean t(String str, File file) {
        return file.isDirectory() && !file.getName().equals(str);
    }

    private static boolean y(File file) {
        return file.exists() || file.mkdirs();
    }

    /* access modifiers changed from: private */
    public static int z(File file, File file2) {
        return n(file.getName()).compareTo(n(file2.getName()));
    }

    public void A(ge1.d.C0116d dVar, String str, boolean z) {
        int i2 = this.f.b().b().a;
        File q = q(str);
        try {
            K(new File(q, k(this.a.getAndIncrement(), z)), i.i(dVar));
        } catch (IOException e2) {
            jb1 f2 = jb1.f();
            f2.c("Could not persist event for session " + str, e2);
        }
        J(q, i2);
    }

    public void B(ge1 ge1) {
        ge1.d j2 = ge1.j();
        if (j2 == null) {
            jb1.f().b("Could not get session for report");
            return;
        }
        String h2 = j2.h();
        try {
            File q = q(h2);
            C(q);
            K(new File(q, "report"), i.E(ge1));
        } catch (IOException e2) {
            jb1 f2 = jb1.f();
            f2.c("Could not persist report for session " + h2, e2);
        }
    }

    public void g() {
        for (File delete : m()) {
            delete.delete();
        }
    }

    public void h(String str) {
        FilenameFilter a2 = ze1.a(str);
        for (File delete : f(p(this.c, a2), p(this.e, a2), p(this.d, a2))) {
            delete.delete();
        }
    }

    public void i(String str, long j2) {
        for (File next : c(str)) {
            H(next, j2);
            E(next);
        }
        e();
    }

    public void j(String str, ge1.c cVar) {
        G(new File(q(str), "report"), this.e, cVar, str);
    }

    public List<lc1> x() {
        List<File> m = m();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(m.size());
        for (File next : m()) {
            try {
                arrayList.add(lc1.a(i.D(D(next)), next.getName()));
            } catch (IOException e2) {
                jb1 f2 = jb1.f();
                f2.c("Could not load report file " + next + "; deleting", e2);
                next.delete();
            }
        }
        return arrayList;
    }
}
