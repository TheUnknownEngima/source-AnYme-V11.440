package defpackage;

import java.io.File;
import java.io.IOException;

/* renamed from: jc1  reason: default package */
class jc1 {
    private final String a;
    private final gf1 b;

    public jc1(String str, gf1 gf1) {
        this.a = str;
        this.b = gf1;
    }

    private File b() {
        return new File(this.b.b(), this.a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e) {
            jb1 f = jb1.f();
            f.e("Error creating marker: " + this.a, e);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
