package defpackage;

/* renamed from: kt  reason: default package */
final class kt {
    public static int a(it itVar, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int h = itVar.h(bArr, i + i3, i2 - i3);
            if (h == -1) {
                break;
            }
            i3 += h;
        }
        return i3;
    }
}
