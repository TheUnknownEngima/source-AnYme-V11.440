package androidx.constraintlayout.motion.widget;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.c;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class n {
    private int A = c.e;
    View a;
    int b;
    private int c = -1;
    private p d = new p();
    private p e = new p();
    private m f = new m();
    private m g = new m();
    private k0[] h;
    private k0 i;
    float j = Float.NaN;
    float k = Utils.FLOAT_EPSILON;
    float l = 1.0f;
    private int[] m;
    private double[] n;
    private double[] o;
    private String[] p;
    private int[] q;
    private int r = 4;
    private float[] s = new float[4];
    private ArrayList<p> t = new ArrayList<>();
    private float[] u = new float[1];
    private ArrayList<c> v = new ArrayList<>();
    private HashMap<String, s> w;
    private HashMap<String, r> x;
    private HashMap<String, g> y;
    private l[] z;

    n(View view) {
        u(view);
    }

    private float f(float f2, float[] fArr) {
        float f3 = Utils.FLOAT_EPSILON;
        float f4 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else if (((double) this.l) != 1.0d) {
            if (f2 < this.k) {
                f2 = Utils.FLOAT_EPSILON;
            }
            float f5 = this.k;
            if (f2 > f5 && ((double) f2) < 1.0d) {
                f2 = (f2 - f5) * this.l;
            }
        }
        l0 l0Var = this.d.e;
        float f6 = Float.NaN;
        Iterator<p> it = this.t.iterator();
        while (it.hasNext()) {
            p next = it.next();
            l0 l0Var2 = next.e;
            if (l0Var2 != null) {
                float f7 = next.g;
                if (f7 < f2) {
                    l0Var = l0Var2;
                    f3 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.g;
                }
            }
        }
        if (l0Var != null) {
            if (!Float.isNaN(f6)) {
                f4 = f6;
            }
            float f8 = f4 - f3;
            double d2 = (double) ((f2 - f3) / f8);
            f2 = (((float) l0Var.a(d2)) * f8) + f3;
            if (fArr != null) {
                fArr[0] = (float) l0Var.b(d2);
            }
        }
        return f2;
    }

    private float m() {
        float[] fArr = new float[2];
        float f2 = 1.0f / ((float) 99);
        double d2 = Utils.DOUBLE_EPSILON;
        double d3 = 0.0d;
        int i2 = 0;
        float f3 = Utils.FLOAT_EPSILON;
        while (i2 < 100) {
            float f4 = ((float) i2) * f2;
            double d4 = (double) f4;
            l0 l0Var = this.d.e;
            float f5 = Float.NaN;
            Iterator<p> it = this.t.iterator();
            float f6 = Utils.FLOAT_EPSILON;
            while (it.hasNext()) {
                p next = it.next();
                l0 l0Var2 = next.e;
                float f7 = f2;
                if (l0Var2 != null) {
                    float f8 = next.g;
                    if (f8 < f4) {
                        f6 = f8;
                        l0Var = l0Var2;
                    } else if (Float.isNaN(f5)) {
                        f5 = next.g;
                    }
                }
                f2 = f7;
            }
            float f9 = f2;
            if (l0Var != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                float f10 = f5 - f6;
                d4 = (double) ((((float) l0Var.a((double) ((f4 - f6) / f10))) * f10) + f6);
            }
            this.h[0].d(d4, this.n);
            this.d.k(this.m, this.n, fArr, 0);
            if (i2 > 0) {
                f3 = (float) (((double) f3) + Math.hypot(d3 - ((double) fArr[1]), d2 - ((double) fArr[0])));
            }
            d2 = (double) fArr[0];
            d3 = (double) fArr[1];
            i2++;
            f2 = f9;
        }
        return f3;
    }

    private void n(p pVar) {
        int binarySearch = Collections.binarySearch(this.t, pVar);
        if (binarySearch == 0) {
            " KeyPath positon \"" + pVar.h + "\" outside of range";
        }
        this.t.add((-binarySearch) - 1, pVar);
    }

    private void p(p pVar) {
        pVar.w((float) ((int) this.a.getX()), (float) ((int) this.a.getY()), (float) this.a.getWidth(), (float) this.a.getHeight());
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        this.v.add(cVar);
    }

    /* access modifiers changed from: package-private */
    public void b(ArrayList<c> arrayList) {
        this.v.addAll(arrayList);
    }

    /* access modifiers changed from: package-private */
    public int c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h2 = this.h[0].h();
        if (iArr != null) {
            Iterator<p> it = this.t.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                iArr[i2] = it.next().r;
                i2++;
            }
        }
        int i3 = 0;
        for (double d2 : h2) {
            this.h[0].d(d2, this.n);
            this.d.k(this.m, this.n, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    /* access modifiers changed from: package-private */
    public void d(float[] fArr, int i2) {
        float[] fArr2 = fArr;
        int i3 = i2;
        float f2 = 1.0f;
        float f3 = 1.0f / ((float) (i3 - 1));
        HashMap<String, r> hashMap = this.x;
        g gVar = null;
        r rVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, r> hashMap2 = this.x;
        r rVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, g> hashMap3 = this.y;
        g gVar2 = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, g> hashMap4 = this.y;
        if (hashMap4 != null) {
            gVar = hashMap4.get("translationY");
        }
        int i4 = 0;
        while (i4 < i3) {
            float f4 = ((float) i4) * f3;
            float f5 = this.l;
            float f6 = Utils.FLOAT_EPSILON;
            if (f5 != f2) {
                if (f4 < this.k) {
                    f4 = Utils.FLOAT_EPSILON;
                }
                float f7 = this.k;
                if (f4 > f7 && ((double) f4) < 1.0d) {
                    f4 = (f4 - f7) * this.l;
                }
            }
            double d2 = (double) f4;
            l0 l0Var = this.d.e;
            float f8 = Float.NaN;
            Iterator<p> it = this.t.iterator();
            while (it.hasNext()) {
                p next = it.next();
                l0 l0Var2 = next.e;
                if (l0Var2 != null) {
                    l0 l0Var3 = l0Var2;
                    float f9 = next.g;
                    if (f9 < f4) {
                        f6 = f9;
                        l0Var = l0Var3;
                    } else if (Float.isNaN(f8)) {
                        f8 = next.g;
                    }
                }
                int i5 = i2;
            }
            if (l0Var != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                float f10 = f8 - f6;
                d2 = (double) ((((float) l0Var.a((double) ((f4 - f6) / f10))) * f10) + f6);
            }
            this.h[0].d(d2, this.n);
            k0 k0Var = this.i;
            if (k0Var != null) {
                double[] dArr = this.n;
                if (dArr.length > 0) {
                    k0Var.d(d2, dArr);
                }
            }
            int i6 = i4 * 2;
            this.d.k(this.m, this.n, fArr2, i6);
            if (gVar2 != null) {
                fArr2[i6] = fArr2[i6] + gVar2.a(f4);
            } else if (rVar != null) {
                fArr2[i6] = fArr2[i6] + rVar.a(f4);
            }
            if (gVar != null) {
                int i7 = i6 + 1;
                fArr2[i7] = fArr2[i7] + gVar.a(f4);
            } else if (rVar2 != null) {
                int i8 = i6 + 1;
                fArr2[i8] = fArr2[i8] + rVar2.a(f4);
            }
            i4++;
            i3 = i2;
            f2 = 1.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public void e(float f2, float[] fArr, int i2) {
        this.h[0].d((double) f(f2, (float[]) null), this.n);
        this.d.q(this.m, this.n, fArr, i2);
    }

    /* access modifiers changed from: package-private */
    public void g(float f2, float f3, float f4, float[] fArr) {
        double[] dArr;
        float f5 = f(f2, this.u);
        k0[] k0VarArr = this.h;
        int i2 = 0;
        if (k0VarArr != null) {
            double d2 = (double) f5;
            k0VarArr[0].g(d2, this.o);
            this.h[0].d(d2, this.n);
            float f6 = this.u[0];
            while (true) {
                dArr = this.o;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] * ((double) f6);
                i2++;
            }
            k0 k0Var = this.i;
            if (k0Var != null) {
                double[] dArr2 = this.n;
                if (dArr2.length > 0) {
                    k0Var.d(d2, dArr2);
                    this.i.g(d2, this.o);
                    this.d.x(f3, f4, fArr, this.m, this.o, this.n);
                    return;
                }
                return;
            }
            this.d.x(f3, f4, fArr, this.m, dArr, this.n);
            return;
        }
        p pVar = this.e;
        float f7 = pVar.i;
        p pVar2 = this.d;
        float f8 = f7 - pVar2.i;
        float f9 = pVar.j - pVar2.j;
        float f10 = (pVar.k - pVar2.k) + f8;
        float f11 = (pVar.l - pVar2.l) + f9;
        fArr[0] = (f8 * (1.0f - f3)) + (f10 * f3);
        fArr[1] = (f9 * (1.0f - f4)) + (f11 * f4);
    }

    public int h() {
        int i2 = this.d.f;
        Iterator<p> it = this.t.iterator();
        while (it.hasNext()) {
            i2 = Math.max(i2, it.next().f);
        }
        return Math.max(i2, this.e.f);
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.e.i;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.e.j;
    }

    /* access modifiers changed from: package-private */
    public p k(int i2) {
        return this.t.get(i2);
    }

    /* access modifiers changed from: package-private */
    public void l(float f2, int i2, int i3, float f3, float f4, float[] fArr) {
        float f5 = f(f2, this.u);
        HashMap<String, r> hashMap = this.x;
        g gVar = null;
        r rVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, r> hashMap2 = this.x;
        r rVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, r> hashMap3 = this.x;
        r rVar3 = hashMap3 == null ? null : hashMap3.get("rotation");
        HashMap<String, r> hashMap4 = this.x;
        r rVar4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, r> hashMap5 = this.x;
        r rVar5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, g> hashMap6 = this.y;
        g gVar2 = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, g> hashMap7 = this.y;
        g gVar3 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, g> hashMap8 = this.y;
        g gVar4 = hashMap8 == null ? null : hashMap8.get("rotation");
        HashMap<String, g> hashMap9 = this.y;
        g gVar5 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, g> hashMap10 = this.y;
        if (hashMap10 != null) {
            gVar = hashMap10.get("scaleY");
        }
        q0 q0Var = new q0();
        q0Var.b();
        q0Var.d(rVar3, f5);
        q0Var.h(rVar, rVar2, f5);
        q0Var.f(rVar4, rVar5, f5);
        q0Var.c(gVar4, f5);
        q0Var.g(gVar2, gVar3, f5);
        q0Var.e(gVar5, gVar, f5);
        k0 k0Var = this.i;
        if (k0Var != null) {
            double[] dArr = this.n;
            if (dArr.length > 0) {
                double d2 = (double) f5;
                k0Var.d(d2, dArr);
                this.i.g(d2, this.o);
                this.d.x(f3, f4, fArr, this.m, this.o, this.n);
            }
            q0Var.a(f3, f4, i2, i3, fArr);
            return;
        }
        int i4 = 0;
        if (this.h != null) {
            double f6 = (double) f(f5, this.u);
            this.h[0].g(f6, this.o);
            this.h[0].d(f6, this.n);
            float f7 = this.u[0];
            while (true) {
                double[] dArr2 = this.o;
                if (i4 < dArr2.length) {
                    dArr2[i4] = dArr2[i4] * ((double) f7);
                    i4++;
                } else {
                    float f8 = f3;
                    float f9 = f4;
                    this.d.x(f8, f9, fArr, this.m, dArr2, this.n);
                    q0Var.a(f8, f9, i2, i3, fArr);
                    return;
                }
            }
        } else {
            p pVar = this.e;
            float f10 = pVar.i;
            p pVar2 = this.d;
            float f11 = f10 - pVar2.i;
            float f12 = pVar.j - pVar2.j;
            g gVar6 = gVar5;
            float f13 = (pVar.l - pVar2.l) + f12;
            fArr[0] = (f11 * (1.0f - f3)) + (((pVar.k - pVar2.k) + f11) * f3);
            fArr[1] = (f12 * (1.0f - f4)) + (f13 * f4);
            q0Var.b();
            q0Var.d(rVar3, f5);
            q0Var.h(rVar, rVar2, f5);
            q0Var.f(rVar4, rVar5, f5);
            q0Var.c(gVar4, f5);
            q0Var.g(gVar2, gVar3, f5);
            q0Var.e(gVar6, gVar, f5);
            q0Var.a(f3, f4, i2, i3, fArr);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: androidx.constraintlayout.motion.widget.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: androidx.constraintlayout.motion.widget.s$d} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean o(android.view.View r23, float r24, long r25, androidx.constraintlayout.motion.widget.e r27) {
        /*
            r22 = this;
            r0 = r22
            r11 = r23
            r1 = 0
            r2 = r24
            float r12 = r0.f(r2, r1)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r2 = r0.x
            if (r2 == 0) goto L_0x0027
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0017:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0027
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.r r3 = (androidx.constraintlayout.motion.widget.r) r3
            r3.f(r11, r12)
            goto L_0x0017
        L_0x0027:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.s> r2 = r0.w
            r13 = 0
            if (r2 == 0) goto L_0x0059
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = 0
        L_0x0036:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r7.next()
            androidx.constraintlayout.motion.widget.s r1 = (androidx.constraintlayout.motion.widget.s) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.s.d
            if (r2 == 0) goto L_0x004a
            r8 = r1
            androidx.constraintlayout.motion.widget.s$d r8 = (androidx.constraintlayout.motion.widget.s.d) r8
            goto L_0x0036
        L_0x004a:
            r2 = r23
            r3 = r12
            r4 = r25
            r6 = r27
            boolean r1 = r1.f(r2, r3, r4, r6)
            r9 = r9 | r1
            goto L_0x0036
        L_0x0057:
            r14 = r9
            goto L_0x005b
        L_0x0059:
            r8 = r1
            r14 = 0
        L_0x005b:
            k0[] r1 = r0.h
            r15 = 1
            if (r1 == 0) goto L_0x013a
            r1 = r1[r13]
            double r9 = (double) r12
            double[] r2 = r0.n
            r1.d(r9, r2)
            k0[] r1 = r0.h
            r1 = r1[r13]
            double[] r2 = r0.o
            r1.g(r9, r2)
            k0 r1 = r0.i
            if (r1 == 0) goto L_0x0084
            double[] r2 = r0.n
            int r3 = r2.length
            if (r3 <= 0) goto L_0x0084
            r1.d(r9, r2)
            k0 r1 = r0.i
            double[] r2 = r0.o
            r1.g(r9, r2)
        L_0x0084:
            androidx.constraintlayout.motion.widget.p r1 = r0.d
            int[] r3 = r0.m
            double[] r4 = r0.n
            double[] r5 = r0.o
            r6 = 0
            r2 = r23
            r1.z(r2, r3, r4, r5, r6)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r1 = r0.x
            if (r1 == 0) goto L_0x00bd
            java.util.Collection r1 = r1.values()
            java.util.Iterator r16 = r1.iterator()
        L_0x009e:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x00bd
            java.lang.Object r1 = r16.next()
            androidx.constraintlayout.motion.widget.r r1 = (androidx.constraintlayout.motion.widget.r) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.r.d
            if (r2 == 0) goto L_0x009e
            androidx.constraintlayout.motion.widget.r$d r1 = (androidx.constraintlayout.motion.widget.r.d) r1
            double[] r2 = r0.o
            r4 = r2[r13]
            r6 = r2[r15]
            r2 = r23
            r3 = r12
            r1.i(r2, r3, r4, r6)
            goto L_0x009e
        L_0x00bd:
            if (r8 == 0) goto L_0x00da
            double[] r1 = r0.o
            r16 = r1[r13]
            r18 = r1[r15]
            r1 = r8
            r2 = r23
            r3 = r27
            r4 = r12
            r5 = r25
            r7 = r16
            r20 = r9
            r9 = r18
            boolean r1 = r1.j(r2, r3, r4, r5, r7, r9)
            r1 = r1 | r14
            r14 = r1
            goto L_0x00dc
        L_0x00da:
            r20 = r9
        L_0x00dc:
            r1 = 1
        L_0x00dd:
            k0[] r2 = r0.h
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0103
            r2 = r2[r1]
            float[] r3 = r0.s
            r4 = r20
            r2.e(r4, r3)
            androidx.constraintlayout.motion.widget.p r2 = r0.d
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r2.q
            java.lang.String[] r3 = r0.p
            int r6 = r1 + -1
            r3 = r3[r6]
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.widget.a r2 = (androidx.constraintlayout.widget.a) r2
            float[] r3 = r0.s
            r2.i(r11, r3)
            int r1 = r1 + 1
            goto L_0x00dd
        L_0x0103:
            androidx.constraintlayout.motion.widget.m r1 = r0.f
            int r2 = r1.f
            if (r2 != 0) goto L_0x0128
            r2 = 0
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0114
        L_0x010e:
            int r1 = r1.g
            r11.setVisibility(r1)
            goto L_0x0128
        L_0x0114:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x011d
            androidx.constraintlayout.motion.widget.m r1 = r0.g
            goto L_0x010e
        L_0x011d:
            androidx.constraintlayout.motion.widget.m r2 = r0.g
            int r2 = r2.g
            int r1 = r1.g
            if (r2 == r1) goto L_0x0128
            r11.setVisibility(r13)
        L_0x0128:
            androidx.constraintlayout.motion.widget.l[] r1 = r0.z
            if (r1 == 0) goto L_0x0186
            r1 = 0
        L_0x012d:
            androidx.constraintlayout.motion.widget.l[] r2 = r0.z
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0186
            r2 = r2[r1]
            r2.r(r12, r11)
            int r1 = r1 + 1
            goto L_0x012d
        L_0x013a:
            androidx.constraintlayout.motion.widget.p r1 = r0.d
            float r2 = r1.i
            androidx.constraintlayout.motion.widget.p r3 = r0.e
            float r4 = r3.i
            float r4 = r4 - r2
            float r4 = r4 * r12
            float r2 = r2 + r4
            float r4 = r1.j
            float r5 = r3.j
            float r5 = r5 - r4
            float r5 = r5 * r12
            float r4 = r4 + r5
            float r5 = r1.k
            float r6 = r3.k
            float r7 = r6 - r5
            float r7 = r7 * r12
            float r7 = r7 + r5
            float r1 = r1.l
            float r3 = r3.l
            float r8 = r3 - r1
            float r8 = r8 * r12
            float r8 = r8 + r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r10 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r10
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0176
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0183
        L_0x0176:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r11.measure(r3, r1)
        L_0x0183:
            r11.layout(r10, r9, r2, r4)
        L_0x0186:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.g> r1 = r0.y
            if (r1 == 0) goto L_0x01b5
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x0192:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x01b5
            java.lang.Object r1 = r8.next()
            androidx.constraintlayout.motion.widget.g r1 = (androidx.constraintlayout.motion.widget.g) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.g.f
            if (r2 == 0) goto L_0x01b1
            androidx.constraintlayout.motion.widget.g$f r1 = (androidx.constraintlayout.motion.widget.g.f) r1
            double[] r2 = r0.o
            r4 = r2[r13]
            r6 = r2[r15]
            r2 = r23
            r3 = r12
            r1.j(r2, r3, r4, r6)
            goto L_0x0192
        L_0x01b1:
            r1.f(r11, r12)
            goto L_0x0192
        L_0x01b5:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.n.o(android.view.View, float, long, androidx.constraintlayout.motion.widget.e):boolean");
    }

    /* access modifiers changed from: package-private */
    public void q(e1 e1Var, c cVar) {
        p pVar = this.e;
        pVar.g = 1.0f;
        pVar.h = 1.0f;
        p(pVar);
        this.e.w((float) e1Var.Q(), (float) e1Var.R(), (float) e1Var.P(), (float) e1Var.v());
        this.e.a(cVar.s(this.b));
        this.g.q(e1Var, cVar, this.b);
    }

    public void r(int i2) {
        this.A = i2;
    }

    /* access modifiers changed from: package-private */
    public void s(View view) {
        p pVar = this.d;
        pVar.g = Utils.FLOAT_EPSILON;
        pVar.h = Utils.FLOAT_EPSILON;
        pVar.w(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f.m(view);
    }

    /* access modifiers changed from: package-private */
    public void t(e1 e1Var, c cVar) {
        p pVar = this.d;
        pVar.g = Utils.FLOAT_EPSILON;
        pVar.h = Utils.FLOAT_EPSILON;
        p(pVar);
        this.d.w((float) e1Var.Q(), (float) e1Var.R(), (float) e1Var.P(), (float) e1Var.v());
        c.a s2 = cVar.s(this.b);
        this.d.a(s2);
        this.j = s2.c.f;
        this.f.q(e1Var, cVar, this.b);
    }

    public String toString() {
        return " start: x: " + this.d.i + " y: " + this.d.j + " end: x: " + this.e.i + " y: " + this.e.j;
    }

    public void u(View view) {
        this.a = view;
        this.b = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).a();
        }
    }

    public void v(int i2, int i3, float f2, long j2) {
        ArrayList arrayList;
        s sVar;
        a aVar;
        r rVar;
        a aVar2;
        Class<double> cls = double.class;
        new HashSet();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashMap hashMap = new HashMap();
        int i4 = this.A;
        if (i4 != c.e) {
            this.d.n = i4;
        }
        this.f.k(this.g, hashSet2);
        ArrayList<c> arrayList2 = this.v;
        if (arrayList2 != null) {
            Iterator<c> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                c next = it.next();
                if (next instanceof i) {
                    i iVar = (i) next;
                    n(new p(i2, i3, iVar, this.d, this.e));
                    int i5 = iVar.f;
                    if (i5 != c.e) {
                        this.c = i5;
                    }
                } else if (next instanceof f) {
                    next.b(hashSet3);
                } else if (next instanceof k) {
                    next.b(hashSet);
                } else if (next instanceof l) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((l) next);
                } else {
                    next.e(hashMap);
                    next.b(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        char c2 = 0;
        if (arrayList != null) {
            this.z = (l[]) arrayList.toArray(new l[0]);
        }
        char c3 = 1;
        if (!hashSet2.isEmpty()) {
            this.x = new HashMap<>();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[c3];
                    Iterator<c> it3 = this.v.iterator();
                    while (it3.hasNext()) {
                        c next2 = it3.next();
                        HashMap<String, a> hashMap2 = next2.d;
                        if (!(hashMap2 == null || (aVar2 = hashMap2.get(str2)) == null)) {
                            sparseArray.append(next2.a, aVar2);
                        }
                    }
                    rVar = r.c(str, sparseArray);
                } else {
                    rVar = r.d(str);
                }
                if (rVar != null) {
                    rVar.g(str);
                    this.x.put(str, rVar);
                }
                c3 = 1;
            }
            ArrayList<c> arrayList3 = this.v;
            if (arrayList3 != null) {
                Iterator<c> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    c next3 = it4.next();
                    if (next3 instanceof d) {
                        next3.a(this.x);
                    }
                }
            }
            this.f.a(this.x, 0);
            this.g.a(this.x, 100);
            for (String next4 : this.x.keySet()) {
                this.x.get(next4).h(hashMap.containsKey(next4) ? ((Integer) hashMap.get(next4)).intValue() : 0);
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.w == null) {
                this.w = new HashMap<>();
            }
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String str3 = (String) it5.next();
                if (!this.w.containsKey(str3)) {
                    if (str3.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str4 = str3.split(",")[1];
                        Iterator<c> it6 = this.v.iterator();
                        while (it6.hasNext()) {
                            c next5 = it6.next();
                            HashMap<String, a> hashMap3 = next5.d;
                            if (!(hashMap3 == null || (aVar = hashMap3.get(str4)) == null)) {
                                sparseArray2.append(next5.a, aVar);
                            }
                        }
                        sVar = s.c(str3, sparseArray2);
                        long j3 = j2;
                    } else {
                        sVar = s.d(str3, j2);
                    }
                    if (sVar != null) {
                        sVar.h(str3);
                        this.w.put(str3, sVar);
                    }
                }
            }
            ArrayList<c> arrayList4 = this.v;
            if (arrayList4 != null) {
                Iterator<c> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    c next6 = it7.next();
                    if (next6 instanceof k) {
                        ((k) next6).M(this.w);
                    }
                }
            }
            for (String next7 : this.w.keySet()) {
                this.w.get(next7).i(hashMap.containsKey(next7) ? ((Integer) hashMap.get(next7)).intValue() : 0);
            }
        }
        int i6 = 2;
        int size = this.t.size() + 2;
        p[] pVarArr = new p[size];
        pVarArr[0] = this.d;
        pVarArr[size - 1] = this.e;
        if (this.t.size() > 0 && this.c == -1) {
            this.c = 0;
        }
        Iterator<p> it8 = this.t.iterator();
        int i7 = 1;
        while (it8.hasNext()) {
            pVarArr[i7] = it8.next();
            i7++;
        }
        HashSet hashSet4 = new HashSet();
        for (String next8 : this.e.q.keySet()) {
            if (this.d.q.containsKey(next8)) {
                if (!hashSet2.contains("CUSTOM," + next8)) {
                    hashSet4.add(next8);
                }
            }
        }
        String[] strArr = (String[]) hashSet4.toArray(new String[0]);
        this.p = strArr;
        this.q = new int[strArr.length];
        int i8 = 0;
        while (true) {
            String[] strArr2 = this.p;
            if (i8 >= strArr2.length) {
                break;
            }
            String str5 = strArr2[i8];
            this.q[i8] = 0;
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                } else if (pVarArr[i9].q.containsKey(str5)) {
                    int[] iArr = this.q;
                    iArr[i8] = iArr[i8] + pVarArr[i9].q.get(str5).f();
                    break;
                } else {
                    i9++;
                }
            }
            i8++;
        }
        boolean z2 = pVarArr[0].n != c.e;
        int length = 18 + this.p.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 1; i10 < size; i10++) {
            pVarArr[i10].h(pVarArr[i10 - 1], zArr, this.p, z2);
        }
        int i11 = 0;
        for (int i12 = 1; i12 < length; i12++) {
            if (zArr[i12]) {
                i11++;
            }
        }
        int[] iArr2 = new int[i11];
        this.m = iArr2;
        this.n = new double[iArr2.length];
        this.o = new double[iArr2.length];
        int i13 = 0;
        for (int i14 = 1; i14 < length; i14++) {
            if (zArr[i14]) {
                this.m[i13] = i14;
                i13++;
            }
        }
        int[] iArr3 = new int[2];
        iArr3[1] = this.m.length;
        iArr3[0] = size;
        double[][] dArr = (double[][]) Array.newInstance(cls, iArr3);
        double[] dArr2 = new double[size];
        for (int i15 = 0; i15 < size; i15++) {
            pVarArr[i15].i(dArr[i15], this.m);
            dArr2[i15] = (double) pVarArr[i15].g;
        }
        int i16 = 0;
        while (true) {
            int[] iArr4 = this.m;
            if (i16 >= iArr4.length) {
                break;
            }
            if (iArr4[i16] < p.u.length) {
                String str6 = p.u[this.m[i16]] + " [";
                for (int i17 = 0; i17 < size; i17++) {
                    str6 = str6 + dArr[i17][i16];
                }
            }
            i16++;
        }
        this.h = new k0[(this.p.length + 1)];
        int i18 = 0;
        while (true) {
            String[] strArr3 = this.p;
            if (i18 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i18];
            int i19 = 0;
            double[] dArr3 = null;
            int i20 = 0;
            double[][] dArr4 = null;
            while (i19 < size) {
                if (pVarArr[i19].r(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr5 = new int[i6];
                        iArr5[1] = pVarArr[i19].m(str7);
                        iArr5[c2] = size;
                        dArr4 = (double[][]) Array.newInstance(cls, iArr5);
                    }
                    dArr3[i20] = (double) pVarArr[i19].g;
                    pVarArr[i19].l(str7, dArr4[i20], 0);
                    i20++;
                }
                i19++;
                i6 = 2;
                c2 = 0;
            }
            i18++;
            this.h[i18] = k0.a(this.c, Arrays.copyOf(dArr3, i20), (double[][]) Arrays.copyOf(dArr4, i20));
            i6 = 2;
            c2 = 0;
        }
        this.h[0] = k0.a(this.c, dArr2, dArr);
        if (pVarArr[0].n != c.e) {
            int[] iArr6 = new int[size];
            double[] dArr5 = new double[size];
            int[] iArr7 = new int[2];
            iArr7[1] = 2;
            iArr7[0] = size;
            double[][] dArr6 = (double[][]) Array.newInstance(cls, iArr7);
            for (int i21 = 0; i21 < size; i21++) {
                iArr6[i21] = pVarArr[i21].n;
                dArr5[i21] = (double) pVarArr[i21].g;
                dArr6[i21][0] = (double) pVarArr[i21].i;
                dArr6[i21][1] = (double) pVarArr[i21].j;
            }
            this.i = k0.b(iArr6, dArr5, dArr6);
        }
        float f3 = Float.NaN;
        this.y = new HashMap<>();
        if (this.v != null) {
            Iterator it9 = hashSet3.iterator();
            while (it9.hasNext()) {
                String str8 = (String) it9.next();
                g c4 = g.c(str8);
                if (c4 != null) {
                    if (c4.i() && Float.isNaN(f3)) {
                        f3 = m();
                    }
                    c4.g(str8);
                    this.y.put(str8, c4);
                }
            }
            Iterator<c> it10 = this.v.iterator();
            while (it10.hasNext()) {
                c next9 = it10.next();
                if (next9 instanceof f) {
                    ((f) next9).O(this.y);
                }
            }
            for (g h2 : this.y.values()) {
                h2.h(f3);
            }
        }
    }
}
