package defpackage;

import java.io.IOException;

/* renamed from: vb  reason: default package */
public class vb extends IOException {
    private int e;
    private String f;

    public vb() {
    }

    public vb(int i, String str) {
        this.e = i;
        this.f = str;
    }

    public int a() {
        return this.e;
    }

    public String getMessage() {
        return this.f;
    }
}
