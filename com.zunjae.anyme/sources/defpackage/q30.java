package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.github.mikephil.charting.utils.Utils;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: q30  reason: default package */
public final class q30 extends i20 {
    private final i50 n = new i50();
    private boolean o;
    private int p;
    private int q;
    private String r;
    private float s;
    private int t;

    public q30(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z = false;
        if (list != null && list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.p = bArr[24];
            this.q = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.r = "Serif".equals(v50.y(bArr, 43, bArr.length - 43)) ? "serif" : str;
            this.t = bArr[25] * 20;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.o = z;
            if (z) {
                float f = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) this.t);
                this.s = f;
                this.s = v50.n(f, Utils.FLOAT_EPSILON, 0.95f);
                return;
            }
        } else {
            this.p = 0;
            this.q = -1;
            this.r = str;
            this.o = false;
        }
        this.s = 0.85f;
    }

    private void C(i50 i50, SpannableStringBuilder spannableStringBuilder) {
        D(i50.a() >= 12);
        int F = i50.F();
        int F2 = i50.F();
        i50.N(2);
        int z = i50.z();
        i50.N(1);
        int k = i50.k();
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i = F;
        int i2 = F2;
        F(spannableStringBuilder2, z, this.p, i, i2, 0);
        E(spannableStringBuilder2, k, this.q, i, i2, 0);
    }

    private static void D(boolean z) {
        if (!z) {
            throw new m20("Unexpected subtitle format.");
        }
    }

    private static void E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void F(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L_0x004c
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x000c
            r10 = 1
            goto L_0x000d
        L_0x000c:
            r10 = 0
        L_0x000d:
            r2 = r6 & 2
            if (r2 == 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r10 == 0) goto L_0x0023
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L_0x001f
            r4 = 3
            r3.<init>(r4)
            goto L_0x002b
        L_0x001f:
            r3.<init>(r1)
            goto L_0x002b
        L_0x0023:
            if (r2 == 0) goto L_0x002e
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L_0x002b:
            r5.setSpan(r3, r8, r9, r7)
        L_0x002e:
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            if (r1 == 0) goto L_0x003e
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L_0x003e:
            if (r1 != 0) goto L_0x004c
            if (r10 != 0) goto L_0x004c
            if (r2 != 0) goto L_0x004c
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q30.F(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    private static void G(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2, int i3) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, i3 | 33);
        }
    }

    private static String H(i50 i50) {
        char e;
        D(i50.a() >= 2);
        int F = i50.F();
        if (F == 0) {
            return "";
        }
        return i50.x(F, Charset.forName((i50.a() < 2 || !((e = i50.e()) == 65279 || e == 65534)) ? "UTF-8" : "UTF-16"));
    }

    /* access modifiers changed from: protected */
    public k20 z(byte[] bArr, int i, boolean z) {
        this.n.K(bArr, i);
        String H = H(this.n);
        if (H.isEmpty()) {
            return r30.f;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(H);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        F(spannableStringBuilder2, this.p, 0, 0, spannableStringBuilder.length(), 16711680);
        E(spannableStringBuilder2, this.q, -1, 0, spannableStringBuilder.length(), 16711680);
        G(spannableStringBuilder2, this.r, "sans-serif", 0, spannableStringBuilder.length(), 16711680);
        float f = this.s;
        while (this.n.a() >= 8) {
            int c = this.n.c();
            int k = this.n.k();
            int k2 = this.n.k();
            boolean z2 = true;
            if (k2 == 1937013100) {
                if (this.n.a() < 2) {
                    z2 = false;
                }
                D(z2);
                int F = this.n.F();
                for (int i2 = 0; i2 < F; i2++) {
                    C(this.n, spannableStringBuilder);
                }
            } else if (k2 == 1952608120 && this.o) {
                if (this.n.a() < 2) {
                    z2 = false;
                }
                D(z2);
                f = v50.n(((float) this.n.F()) / ((float) this.t), Utils.FLOAT_EPSILON, 0.95f);
            }
            this.n.M(c + k);
        }
        return new r30(new h20(spannableStringBuilder, (Layout.Alignment) null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f));
    }
}
