package defpackage;

/* renamed from: cb  reason: default package */
public class cb {
    private String a;

    public cb(String str) {
        b(str);
        this.a = str;
    }

    private void b(String str) {
        if (str == null) {
            throw new NullPointerException("Key must be not null");
        }
    }

    public String a() {
        return this.a;
    }
}
