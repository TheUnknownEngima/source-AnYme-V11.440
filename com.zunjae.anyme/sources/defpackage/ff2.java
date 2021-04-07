package defpackage;

import java.io.IOException;

/* renamed from: ff2  reason: default package */
public class ff2 extends IOException {
    private String e;
    private String f;

    public ff2(String str, String str2, String str3) {
        super(str);
        this.e = str2;
        this.f = str3;
    }

    public String toString() {
        return super.toString() + ". Mimetype=" + this.e + ", URL=" + this.f;
    }
}
