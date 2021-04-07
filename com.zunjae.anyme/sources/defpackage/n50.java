package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: n50  reason: default package */
public class n50 {
    private static final Comparator<b> h = n40.e;
    private static final Comparator<b> i = o40.e;
    private final int a;
    private final ArrayList<b> b = new ArrayList<>();
    private final b[] c = new b[5];
    private int d = -1;
    private int e;
    private int f;
    private int g;

    /* renamed from: n50$b */
    private static class b {
        public int a;
        public int b;
        public float c;

        private b() {
        }
    }

    public n50(int i2) {
        this.a = i2;
    }

    private void b() {
        if (this.d != 1) {
            Collections.sort(this.b, h);
            this.d = 1;
        }
    }

    private void c() {
        if (this.d != 0) {
            Collections.sort(this.b, i);
            this.d = 0;
        }
    }

    static /* synthetic */ int e(b bVar, b bVar2) {
        return bVar.a - bVar2.a;
    }

    public void a(int i2, float f2) {
        b bVar;
        int i3;
        b bVar2;
        int i4;
        b();
        int i5 = this.g;
        if (i5 > 0) {
            b[] bVarArr = this.c;
            int i6 = i5 - 1;
            this.g = i6;
            bVar = bVarArr[i6];
        } else {
            bVar = new b();
        }
        int i7 = this.e;
        this.e = i7 + 1;
        bVar.a = i7;
        bVar.b = i2;
        bVar.c = f2;
        this.b.add(bVar);
        int i8 = this.f + i2;
        while (true) {
            this.f = i8;
            while (true) {
                int i9 = this.f;
                int i10 = this.a;
                if (i9 > i10) {
                    i3 = i9 - i10;
                    bVar2 = this.b.get(0);
                    i4 = bVar2.b;
                    if (i4 > i3) {
                        break;
                    }
                    this.f -= i4;
                    this.b.remove(0);
                    int i11 = this.g;
                    if (i11 < 5) {
                        b[] bVarArr2 = this.c;
                        this.g = i11 + 1;
                        bVarArr2[i11] = bVar2;
                    }
                } else {
                    return;
                }
            }
            bVar2.b = i4 - i3;
            i8 = this.f - i3;
        }
    }

    public float d(float f2) {
        c();
        float f3 = f2 * ((float) this.f);
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            b bVar = this.b.get(i3);
            i2 += bVar.b;
            if (((float) i2) >= f3) {
                return bVar.c;
            }
        }
        if (this.b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.b;
        return arrayList.get(arrayList.size() - 1).c;
    }

    public void g() {
        this.b.clear();
        this.d = -1;
        this.e = 0;
        this.f = 0;
    }
}
