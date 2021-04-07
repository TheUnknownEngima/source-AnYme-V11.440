package defpackage;

import defpackage.rf1;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sf1  reason: default package */
public class sf1 implements rf1 {
    private final File a;
    private final File[] b;
    private final Map<String, String> c;

    public sf1(File file) {
        this(file, Collections.emptyMap());
    }

    public sf1(File file, Map<String, String> map) {
        this.a = file;
        this.b = new File[]{file};
        this.c = new HashMap(map);
    }

    public String c() {
        String h = h();
        return h.substring(0, h.lastIndexOf(46));
    }

    public rf1.a d() {
        return rf1.a.JAVA;
    }

    public File[] e() {
        return this.b;
    }

    public Map<String, String> f() {
        return Collections.unmodifiableMap(this.c);
    }

    public File g() {
        return this.a;
    }

    public String h() {
        return g().getName();
    }

    public void remove() {
        jb1 f = jb1.f();
        f.b("Removing report at " + this.a.getPath());
        this.a.delete();
    }
}
