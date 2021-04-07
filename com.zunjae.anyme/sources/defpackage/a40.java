package defpackage;

import android.text.SpannableStringBuilder;
import defpackage.w30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: a40  reason: default package */
final class a40 implements k20 {
    private final List<w30> e;
    private final int f;
    private final long[] g;
    private final long[] h;

    public a40(List<w30> list) {
        this.e = list;
        int size = list.size();
        this.f = size;
        this.g = new long[(size * 2)];
        for (int i = 0; i < this.f; i++) {
            w30 w30 = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.g;
            jArr[i2] = w30.t;
            jArr[i2 + 1] = w30.u;
        }
        long[] jArr2 = this.g;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.h = copyOf;
        Arrays.sort(copyOf);
    }

    public int a(long j) {
        int d = v50.d(this.h, j, false, false);
        if (d < this.h.length) {
            return d;
        }
        return -1;
    }

    public long e(int i) {
        boolean z = true;
        q40.a(i >= 0);
        if (i >= this.h.length) {
            z = false;
        }
        q40.a(z);
        return this.h[i];
    }

    public List<h20> f(long j) {
        SpannableStringBuilder append;
        ArrayList arrayList = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = null;
        w30 w30 = null;
        for (int i = 0; i < this.f; i++) {
            long[] jArr = this.g;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                w30 w302 = this.e.get(i);
                if (!w302.a()) {
                    arrayList.add(w302);
                } else if (w30 == null) {
                    w30 = w302;
                } else {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        CharSequence charSequence = w30.e;
                        q40.e(charSequence);
                        append = spannableStringBuilder.append(charSequence).append("\n");
                    } else {
                        append = spannableStringBuilder.append("\n");
                    }
                    CharSequence charSequence2 = w302.e;
                    q40.e(charSequence2);
                    append.append(charSequence2);
                }
            }
        }
        if (spannableStringBuilder != null) {
            w30.b bVar = new w30.b();
            bVar.o(spannableStringBuilder);
            arrayList.add(bVar.a());
        } else if (w30 != null) {
            arrayList.add(w30);
        }
        return arrayList;
    }

    public int h() {
        return this.h.length;
    }
}
