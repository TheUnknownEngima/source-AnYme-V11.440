package defpackage;

import defpackage.ib;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: fc  reason: default package */
public class fc implements Callable<Boolean> {
    public static final Pattern e = Pattern.compile("\\{\"bf_start_date\":(\\d+),\"bf_end_date\":(\\d+)\\}");
    private final ac a;
    private final long b;
    private final ea c = new ea();
    private final AtomicLong d;

    public fc(ac acVar, long j, AtomicLong atomicLong) {
        this.a = acVar;
        this.b = j;
        this.d = atomicLong;
    }

    private void a(File file, String str, Long l) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String readLine = bufferedReader.readLine();
        bufferedReader.close();
        if (l == null) {
            l = Long.valueOf(this.c.a(readLine).b().getTime());
        }
        long time = this.c.a(str).b().getTime();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bf_start_date", l);
        jSONObject.put("bf_end_date", time);
        Date date = new Date();
        ib.b bVar = new ib.b();
        bVar.b(this.d.getAndIncrement());
        bVar.d(date);
        bVar.a(ib.c.D.a());
        bVar.f(0);
        bVar.j("");
        bVar.k("");
        bVar.h("bf_gap_log");
        bVar.c("");
        bVar.i(jSONObject.toString());
        String d2 = this.c.b(bVar.e());
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(d2);
        printWriter.close();
    }

    private boolean b() {
        return this.a.d() >= this.b;
    }

    private boolean c(jb jbVar, List<jb> list) {
        for (jb g : list) {
            long g2 = g.g();
            List<File> j = this.a.j(g2, ac.a);
            if (!j.isEmpty()) {
                File file = j.get(0);
                va vaVar = new va(file, wa.a);
                String h = vaVar.h();
                vaVar.close();
                if (h != null) {
                    String str = "";
                    if (!h.equals(str)) {
                        ib c2 = this.c.a(h);
                        if (c2 == null) {
                            return file.delete();
                        }
                        if (c2.h() != null) {
                            str = c2.h();
                        }
                        Matcher matcher = e.matcher(str);
                        if (!matcher.matches()) {
                            a(file, h, (Long) null);
                            return true;
                        } else if (j.size() > 1) {
                            a(j.get(1), h, Long.valueOf(new Date(Long.valueOf(matcher.group(1)).longValue()).getTime()));
                            return file.delete();
                        }
                    }
                }
                return file.delete();
            } else if (g2 != jbVar.g()) {
                this.a.i(g2);
            }
        }
        return true;
    }

    /* renamed from: d */
    public Boolean call() {
        while (b()) {
            c(this.a.c(), this.a.e());
        }
        return Boolean.TRUE;
    }
}
