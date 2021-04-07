package defpackage;

/* renamed from: nf2  reason: default package */
public class nf2 {
    private int a;
    private String b;

    nf2(int i, String str) {
        this.a = i;
        this.b = str;
    }

    nf2(int i, String str, Object... objArr) {
        this.b = String.format(str, objArr);
        this.a = i;
    }

    public String toString() {
        return this.a + ": " + this.b;
    }
}
