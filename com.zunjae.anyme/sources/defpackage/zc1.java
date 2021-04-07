package defpackage;

/* renamed from: zc1  reason: default package */
public class zc1 {
    public static int a(int i) {
        if (i >= 200 && i <= 299) {
            return 0;
        }
        if (i < 300 || i > 399) {
            return (i < 400 || i > 499) ? 1 : 0;
        }
        return 1;
    }
}
