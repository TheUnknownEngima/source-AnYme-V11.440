package defpackage;

/* renamed from: c92  reason: default package */
class c92 extends b92 {
    public static StringBuilder f(StringBuilder sb, String... strArr) {
        v62.e(sb, "$this$append");
        v62.e(strArr, "value");
        for (String append : strArr) {
            sb.append(append);
        }
        return sb;
    }
}
