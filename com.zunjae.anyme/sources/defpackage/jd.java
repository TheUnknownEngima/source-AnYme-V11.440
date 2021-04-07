package defpackage;

import android.content.Context;
import defpackage.qa;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: jd  reason: default package */
public class jd implements ac {
    private final Context c;
    private final ga d;
    private final fa e;
    private final y9<ib, String> f;
    private final y9<File, List<ib>> g;
    private final y9<gb, String> h;
    private final y9<File, List<gb>> i;
    private final y9<String, String> j = new aa();
    private final y9<File, List<String>> k = new z9();
    private bc<ib> l;
    private bc<gb> m;
    private File n;
    private File o;

    /* renamed from: jd$a */
    class a implements FileFilter {
        a(jd jdVar) {
        }

        public boolean accept(File file) {
            return file.isDirectory() && file.getName().equalsIgnoreCase("logs");
        }
    }

    /* renamed from: jd$b */
    class b extends qa.a {
        b(jd jdVar, File[] fileArr) {
            super(fileArr);
        }

        public int b(File file, Long l, File file2, Long l2) {
            return l.compareTo(l2);
        }
    }

    /* renamed from: jd$c */
    class c extends qa.a {
        c(jd jdVar, File[] fileArr) {
            super(fileArr);
        }

        public int b(File file, Long l, File file2, Long l2) {
            return l.compareTo(l2);
        }
    }

    public jd(Context context, ga gaVar, fa faVar, ea eaVar, da daVar, ca caVar, ba baVar) {
        this.c = context;
        this.d = gaVar;
        this.e = faVar;
        this.f = eaVar;
        this.g = daVar;
        this.h = caVar;
        this.i = baVar;
    }

    private long n(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        long j2 = 0;
        for (File file2 : file.listFiles()) {
            j2 += file2.isFile() ? file2.length() : n(file2);
        }
        return j2;
    }

    private File o(File file, String str) {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory() && file2.getName().contains(str)) {
                return file2;
            }
        }
        throw new FileNotFoundException("The " + str + " folder inside the session folder: " + file.getName() + " couldn't be opened.");
    }

    private void p(File[] fileArr, Comparator<File> comparator) {
        if (comparator == null) {
            qa.b(fileArr, new b(this, fileArr));
        } else {
            Arrays.sort(fileArr, comparator);
        }
    }

    private File q(long j2) {
        File s = s();
        File file = new File(s, "session-" + j2);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    private File r(jb jbVar) {
        File q = q(jbVar.g());
        if (q != null && q.exists()) {
            return q;
        }
        throw new FileNotFoundException("The old session with local-sessionId: " + jbVar.g() + " couldn't be opened.");
    }

    private File s() {
        return this.c.getDir("bugfender", 0);
    }

    public List<jb> a() {
        File s = s();
        jb c2 = c();
        ArrayList arrayList = new ArrayList();
        File[] listFiles = s.listFiles();
        qa.b(listFiles, new c(this, listFiles));
        for (File file : listFiles) {
            if (file.isDirectory() && !file.getName().contains(String.valueOf(c2.g()))) {
                for (File file2 : file.listFiles()) {
                    if (file2.getName().equalsIgnoreCase("session.json")) {
                        jb c3 = this.e.b(file2);
                        if (c3 != null) {
                            arrayList.add(c3);
                        } else {
                            qa.c(file);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public bc<gb> b() {
        return this.m;
    }

    public bc<gb> c(jb jbVar) {
        try {
            return new bc<>(this.h, this.i, o(r(jbVar), "issues"), "issues");
        } catch (FileNotFoundException e2) {
            throw new cc(e2);
        }
    }

    public jb c() {
        if (this.o != null) {
            this.o = new File(this.n, "session.json");
        }
        return this.e.b(this.o);
    }

    public long d() {
        return n(s());
    }

    public List<jb> e() {
        jb c2 = c();
        List<jb> a2 = a();
        if (a2.isEmpty()) {
            return Collections.singletonList(c2);
        }
        a2.add(a2.size(), c2);
        return a2;
    }

    public bc<ib> f() {
        return this.l;
    }

    public bc<ib> f(jb jbVar) {
        try {
            return new bc<>(this.f, this.g, o(r(jbVar), "logs"), "logs");
        } catch (FileNotFoundException e2) {
            throw new cc(e2);
        }
    }

    public bc<String> g(jb jbVar) {
        try {
            return new bc<>(this.j, this.k, o(r(jbVar), "crashes"), "crashes");
        } catch (FileNotFoundException e2) {
            throw new cc(e2);
        }
    }

    public void h(jb jbVar) {
        File s = s();
        if (s.exists()) {
            String str = "session-" + jbVar.g();
            File file = new File(s, str);
            this.n = file;
            if (file.mkdir()) {
                this.o = new File(this.n, "session.json");
                qa.a(this.o, this.d.b(jbVar));
                File file2 = new File(this.n, "logs");
                if (file2.mkdir()) {
                    this.l = new bc<>(this.f, this.g, file2, "logs");
                    File file3 = new File(this.n, "issues");
                    if (file3.mkdir()) {
                        this.m = new bc<>(this.h, this.i, file3, "issues");
                        File file4 = new File(this.n, "crashes");
                        if (!file4.mkdir()) {
                            throw new oa("Crashes folder: " + file4.getName() + " couldn't create the crashes folder.");
                        }
                        return;
                    }
                    throw new oa("Session folder: " + this.n.getName() + " couldn't create the issue folder.");
                }
                throw new oa("Session folder: " + this.n.getName() + " couldn't create the log folder.");
            }
            throw new oa("Session with name: " + str + " couldn't create the session folder.");
        }
        throw new oa("Bugfender folder doesn't exist and it couldn't be created");
    }

    public boolean i(long j2) {
        return qa.c(q(j2));
    }

    public List<File> j(long j2, Comparator<File> comparator) {
        File[] listFiles = q(j2).listFiles(new a(this));
        if (listFiles.length <= 0) {
            return Collections.emptyList();
        }
        File[] listFiles2 = listFiles[0].listFiles();
        p(listFiles2, comparator);
        return Arrays.asList(listFiles2);
    }

    public boolean k(long j2) {
        return qa.e(new File(q(j2), "crashes"));
    }

    public void l(long j2) {
        jb c2 = c();
        c2.b(j2);
        qa.d(this.o, this.d.b(c2));
    }

    public void m(long j2, long j3) {
        File file = new File(q(j2), "session.json");
        jb c2 = this.e.b(file);
        c2.b(j3);
        qa.d(file, this.d.b(c2));
    }
}
