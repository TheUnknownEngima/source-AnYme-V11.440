package defpackage;

/* renamed from: s10  reason: default package */
public final class s10 {
    public final String a;
    public final String b;

    public s10(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        return sb.toString();
    }
}
