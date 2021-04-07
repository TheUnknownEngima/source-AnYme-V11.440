package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: c6  reason: default package */
public final class c6 {
    static final c f = new a();
    private final List<d> a;
    private final List<d6> b;
    private final Map<d6, d> c = new b0();
    private final SparseBooleanArray d = new SparseBooleanArray();
    private final d e = a();

    /* renamed from: c6$a */
    static class a implements c {
        a() {
        }

        private boolean b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        private boolean c(float[] fArr) {
            return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        private boolean d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        public boolean a(int i, float[] fArr) {
            return !d(fArr) && !b(fArr) && !c(fArr);
        }
    }

    /* renamed from: c6$b */
    public static final class b {
        private final List<d> a;
        private final Bitmap b;
        private final List<d6> c = new ArrayList();
        private int d = 16;
        private int e = 12544;
        private int f = -1;
        private final List<c> g = new ArrayList();
        private Rect h;

        public b(Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            this.g.add(c6.f);
            this.b = bitmap;
            this.a = null;
            this.c.add(d6.e);
            this.c.add(d6.f);
            this.c.add(d6.g);
            this.c.add(d6.h);
            this.c.add(d6.i);
            this.c.add(d6.j);
        }

        private int[] b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.h.height();
            int[] iArr2 = new int[(width2 * height2)];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        private Bitmap d(Bitmap bitmap) {
            int max;
            int i;
            double d2 = -1.0d;
            if (this.e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.e;
                if (width > i2) {
                    d2 = Math.sqrt(((double) i2) / ((double) width));
                }
            } else if (this.f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f)) {
                d2 = ((double) i) / ((double) max);
            }
            return d2 <= Utils.DOUBLE_EPSILON ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * d2), (int) Math.ceil(((double) bitmap.getHeight()) * d2), false);
        }

        public c6 a() {
            List<d> list;
            c[] cVarArr;
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                Bitmap d2 = d(bitmap);
                Rect rect = this.h;
                if (!(d2 == this.b || rect == null)) {
                    double width = ((double) d2.getWidth()) / ((double) this.b.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), d2.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), d2.getHeight());
                }
                int[] b2 = b(d2);
                int i = this.d;
                if (this.g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<c> list2 = this.g;
                    cVarArr = (c[]) list2.toArray(new c[list2.size()]);
                }
                b6 b6Var = new b6(b2, i, cVarArr);
                if (d2 != this.b) {
                    d2.recycle();
                }
                list = b6Var.d();
            } else {
                list = this.a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            c6 c6Var = new c6(list, this.c);
            c6Var.b();
            return c6Var;
        }

        public b c(int i) {
            this.d = i;
            return this;
        }
    }

    /* renamed from: c6$c */
    public interface c {
        boolean a(int i, float[] fArr);
    }

    /* renamed from: c6$d */
    public static final class d {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private boolean f;
        private int g;
        private int h;
        private float[] i;

        public d(int i2, int i3) {
            this.a = Color.red(i2);
            this.b = Color.green(i2);
            this.c = Color.blue(i2);
            this.d = i2;
            this.e = i3;
        }

        private void a() {
            int m;
            if (!this.f) {
                int e2 = j2.e(-1, this.d, 4.5f);
                int e3 = j2.e(-1, this.d, 3.0f);
                if (e2 == -1 || e3 == -1) {
                    int e4 = j2.e(-16777216, this.d, 4.5f);
                    int e5 = j2.e(-16777216, this.d, 3.0f);
                    if (e4 == -1 || e5 == -1) {
                        this.h = e2 != -1 ? j2.m(-1, e2) : j2.m(-16777216, e4);
                        this.g = e3 != -1 ? j2.m(-1, e3) : j2.m(-16777216, e5);
                        this.f = true;
                        return;
                    }
                    this.h = j2.m(-16777216, e4);
                    m = j2.m(-16777216, e5);
                } else {
                    this.h = j2.m(-1, e2);
                    m = j2.m(-1, e3);
                }
                this.g = m;
                this.f = true;
            }
        }

        public int b() {
            a();
            return this.h;
        }

        public float[] c() {
            if (this.i == null) {
                this.i = new float[3];
            }
            j2.a(this.a, this.b, this.c, this.i);
            return this.i;
        }

        public int d() {
            return this.e;
        }

        public int e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.e == dVar.e && this.d == dVar.d;
        }

        public int f() {
            a();
            return this.g;
        }

        public int hashCode() {
            return (this.d * 31) + this.e;
        }

        public String toString() {
            return d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + ']' + " [HSL: " + Arrays.toString(c()) + ']' + " [Population: " + this.e + ']' + " [Title Text: #" + Integer.toHexString(f()) + ']' + " [Body Text: #" + Integer.toHexString(b()) + ']';
        }
    }

    c6(List<d> list, List<d6> list2) {
        this.a = list;
        this.b = list2;
    }

    private d a() {
        int size = this.a.size();
        int i = Integer.MIN_VALUE;
        d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar2 = this.a.get(i2);
            if (dVar2.d() > i) {
                i = dVar2.d();
                dVar = dVar2;
            }
        }
        return dVar;
    }

    private float c(d dVar, d6 d6Var) {
        float[] c2 = dVar.c();
        d dVar2 = this.e;
        int d2 = dVar2 != null ? dVar2.d() : 1;
        float g = d6Var.g();
        float f2 = Utils.FLOAT_EPSILON;
        float g2 = g > Utils.FLOAT_EPSILON ? d6Var.g() * (1.0f - Math.abs(c2[1] - d6Var.i())) : Utils.FLOAT_EPSILON;
        float a2 = d6Var.a() > Utils.FLOAT_EPSILON ? d6Var.a() * (1.0f - Math.abs(c2[2] - d6Var.h())) : Utils.FLOAT_EPSILON;
        if (d6Var.f() > Utils.FLOAT_EPSILON) {
            f2 = d6Var.f() * (((float) dVar.d()) / ((float) d2));
        }
        return g2 + a2 + f2;
    }

    private d d(d6 d6Var) {
        d e2 = e(d6Var);
        if (e2 != null && d6Var.j()) {
            this.d.append(e2.e(), true);
        }
        return e2;
    }

    private d e(d6 d6Var) {
        int size = this.a.size();
        float f2 = Utils.FLOAT_EPSILON;
        d dVar = null;
        for (int i = 0; i < size; i++) {
            d dVar2 = this.a.get(i);
            if (g(dVar2, d6Var)) {
                float c2 = c(dVar2, d6Var);
                if (dVar == null || c2 > f2) {
                    dVar = dVar2;
                    f2 = c2;
                }
            }
        }
        return dVar;
    }

    private boolean g(d dVar, d6 d6Var) {
        float[] c2 = dVar.c();
        return c2[1] >= d6Var.e() && c2[1] <= d6Var.c() && c2[2] >= d6Var.d() && c2[2] <= d6Var.b() && !this.d.get(dVar.e());
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            d6 d6Var = this.b.get(i);
            d6Var.k();
            this.c.put(d6Var, d(d6Var));
        }
        this.d.clear();
    }

    public List<d> f() {
        return Collections.unmodifiableList(this.a);
    }
}
