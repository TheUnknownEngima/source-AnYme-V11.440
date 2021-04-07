package defpackage;

/* renamed from: ne2  reason: default package */
public class ne2 extends se2 {
    public ne2(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    public static ne2 h(int i, int i2) {
        return new ne2(i, i2, false);
    }

    /* access modifiers changed from: protected */
    public String g(int i) {
        char[] chars = Character.toChars(i);
        return "\\u" + ke2.a(chars[0]) + "\\u" + ke2.a(chars[1]);
    }
}
