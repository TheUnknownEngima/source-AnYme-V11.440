package androidx.room;

import defpackage.n6;
import java.io.File;

class r implements n6.c {
    private final String a;
    private final File b;
    private final n6.c c;

    r(String str, File file, n6.c cVar) {
        this.a = str;
        this.b = file;
        this.c = cVar;
    }

    public n6 a(n6.b bVar) {
        return new q(bVar.a, this.a, this.b, bVar.c.a, this.c.a(bVar));
    }
}
