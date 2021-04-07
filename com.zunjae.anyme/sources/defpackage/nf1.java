package defpackage;

import defpackage.of1;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* renamed from: nf1  reason: default package */
public class nf1 {
    private final of1.c a;

    public nf1(of1.c cVar) {
        this.a = cVar;
    }

    public boolean a() {
        File[] b = this.a.b();
        File[] a2 = this.a.a();
        if (b == null || b.length <= 0) {
            return a2 != null && a2.length > 0;
        }
        return true;
    }

    public void b(rf1 rf1) {
        rf1.remove();
    }

    public void c(List<rf1> list) {
        for (rf1 b : list) {
            b(b);
        }
    }

    public List<rf1> d() {
        jb1.f().b("Checking for crash reports...");
        File[] b = this.a.b();
        File[] a2 = this.a.a();
        LinkedList linkedList = new LinkedList();
        if (b != null) {
            for (File file : b) {
                jb1.f().b("Found crash report " + file.getPath());
                linkedList.add(new sf1(file));
            }
        }
        if (a2 != null) {
            for (File qf1 : a2) {
                linkedList.add(new qf1(qf1));
            }
        }
        if (linkedList.isEmpty()) {
            jb1.f().b("No reports found.");
        }
        return linkedList;
    }
}
