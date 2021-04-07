package defpackage;

import defpackage.w00;

/* renamed from: u00  reason: default package */
public final class u00 implements w00.b {
    private final int[] a;
    private final k00[] b;

    public u00(int[] iArr, k00[] k00Arr) {
        this.a = iArr;
        this.b = k00Arr;
    }

    public vt a(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i3 >= iArr.length) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(i2);
                b50.c("BaseMediaChunkOutput", sb.toString());
                return new gt();
            } else if (i2 == iArr[i3]) {
                return this.b[i3];
            } else {
                i3++;
            }
        }
    }

    public int[] b() {
        int[] iArr = new int[this.b.length];
        int i = 0;
        while (true) {
            k00[] k00Arr = this.b;
            if (i >= k00Arr.length) {
                return iArr;
            }
            if (k00Arr[i] != null) {
                iArr[i] = k00Arr[i].A();
            }
            i++;
        }
    }

    public void c(long j) {
        for (k00 k00 : this.b) {
            if (k00 != null) {
                k00.T(j);
            }
        }
    }
}
