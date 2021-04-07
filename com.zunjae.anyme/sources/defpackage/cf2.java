package defpackage;

import java.io.IOException;

/* renamed from: cf2  reason: default package */
public class cf2 extends IOException {
    private int e;
    private String f;

    public cf2(String str, int i, String str2) {
        super(str);
        this.e = i;
        this.f = str2;
    }

    public int a() {
        return this.e;
    }

    public String toString() {
        return super.toString() + ". Status=" + this.e + ", URL=" + this.f;
    }
}
