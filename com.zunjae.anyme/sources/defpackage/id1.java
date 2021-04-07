package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* renamed from: id1  reason: default package */
public class id1 {
    private static final c d = new c();
    private final Context a;
    private final b b;
    private hd1 c;

    /* renamed from: id1$b */
    public interface b {
        File a();
    }

    /* renamed from: id1$c */
    private static final class c implements hd1 {
        private c() {
        }

        public void a() {
        }

        public String b() {
            return null;
        }

        public byte[] c() {
            return null;
        }

        public void d() {
        }

        public void e(long j, String str) {
        }
    }

    public id1(Context context, b bVar) {
        this(context, bVar, (String) null);
    }

    public id1(Context context, b bVar, String str) {
        this.a = context;
        this.b = bVar;
        this.c = d;
        g(str);
    }

    private String e(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".temp");
        return lastIndexOf == -1 ? name : name.substring(20, lastIndexOf);
    }

    private File f(String str) {
        return new File(this.b.a(), "crashlytics-userlog-" + str + ".temp");
    }

    public void a() {
        this.c.d();
    }

    public void b(Set<String> set) {
        File[] listFiles = this.b.a().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(e(file))) {
                    file.delete();
                }
            }
        }
    }

    public byte[] c() {
        return this.c.c();
    }

    public String d() {
        return this.c.b();
    }

    public final void g(String str) {
        this.c.a();
        this.c = d;
        if (str != null) {
            if (!dc1.l(this.a, "com.crashlytics.CollectCustomLogs", true)) {
                jb1.f().b("Preferences requested no custom logs. Aborting log file creation.");
            } else {
                h(f(str), 65536);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(File file, int i) {
        this.c = new kd1(file, i);
    }

    public void i(long j, String str) {
        this.c.e(j, str);
    }
}
