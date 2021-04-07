package defpackage;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ac  reason: default package */
public interface ac {
    public static final Comparator<File> a = new a();
    public static final Pattern b = Pattern.compile("logs-([\\d]+)\\.json");

    /* renamed from: ac$a */
    static class a implements Comparator<File> {
        a() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            String name = file.getName();
            String name2 = file2.getName();
            Matcher matcher = ac.b.matcher(name);
            Matcher matcher2 = ac.b.matcher(name2);
            boolean matches = matcher.matches();
            boolean matches2 = matcher2.matches();
            if (matches && matches2) {
                return Long.valueOf(matcher.group(1)).compareTo(Long.valueOf(matcher2.group(1)));
            } else if (matches || matches2) {
                return name.equals("logs") ? 1 : -1;
            } else {
                throw new IllegalStateException("Log file doesn't comply to log-TIMESTAMP.json");
            }
        }
    }

    List<jb> a();

    bc<gb> b();

    bc<gb> c(jb jbVar);

    jb c();

    long d();

    List<jb> e();

    bc<ib> f();

    bc<ib> f(jb jbVar);

    bc<String> g(jb jbVar);

    void h(jb jbVar);

    boolean i(long j);

    List<File> j(long j, Comparator<File> comparator);

    boolean k(long j);

    void l(long j);

    void m(long j, long j2);
}
