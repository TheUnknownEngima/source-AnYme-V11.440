package defpackage;

/* renamed from: k10  reason: default package */
public final class k10 {
    public final fy[] a;
    public final long[] b;
    public final String c;
    public final String d;

    public k10(String str, String str2, long j, long[] jArr, fy[] fyVarArr) {
        this.c = str;
        this.d = str2;
        this.b = jArr;
        this.a = fyVarArr;
    }

    public String a() {
        String str = this.c;
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }
}
