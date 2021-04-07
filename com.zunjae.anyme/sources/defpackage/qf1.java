package defpackage;

import defpackage.rf1;
import java.io.File;
import java.util.Map;

/* renamed from: qf1  reason: default package */
public class qf1 implements rf1 {
    private final File a;

    public qf1(File file) {
        this.a = file;
    }

    public String c() {
        return this.a.getName();
    }

    public rf1.a d() {
        return rf1.a.NATIVE;
    }

    public File[] e() {
        return this.a.listFiles();
    }

    public Map<String, String> f() {
        return null;
    }

    public File g() {
        return null;
    }

    public String h() {
        return null;
    }

    public void remove() {
        for (File file : e()) {
            jb1.f().b("Removing native report file at " + file.getPath());
            file.delete();
        }
        jb1.f().b("Removing native report directory at " + this.a);
        this.a.delete();
    }
}
