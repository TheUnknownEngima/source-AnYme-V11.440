package defpackage;

import defpackage.bg;
import java.io.File;

/* renamed from: eg  reason: default package */
public class eg implements bg.a {
    private final long a;
    private final a b;

    /* renamed from: eg$a */
    public interface a {
        File a();
    }

    public eg(a aVar, long j) {
        this.a = j;
        this.b = aVar;
    }

    public bg a() {
        File a2 = this.b.a();
        if (a2 == null) {
            return null;
        }
        if (a2.mkdirs() || (a2.exists() && a2.isDirectory())) {
            return fg.c(a2, this.a);
        }
        return null;
    }
}
