package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.c;
import com.github.mikephil.charting.utils.Utils;
import java.util.HashSet;
import java.util.LinkedHashMap;

class m implements Comparable<m> {
    private float e = 1.0f;
    int f = 0;
    int g;
    private float h = Utils.FLOAT_EPSILON;
    private float i = Utils.FLOAT_EPSILON;
    private float j = Utils.FLOAT_EPSILON;
    public float k = Utils.FLOAT_EPSILON;
    private float l = 1.0f;
    private float m = 1.0f;
    private float n = Utils.FLOAT_EPSILON;
    private float o = Utils.FLOAT_EPSILON;
    private float p = Utils.FLOAT_EPSILON;
    private float q;
    private float r = Float.NaN;
    private float s = Float.NaN;
    LinkedHashMap<String, a> t = new LinkedHashMap<>();

    private boolean i(float f2, float f3) {
        return (Float.isNaN(f2) || Float.isNaN(f3)) ? Float.isNaN(f2) != Float.isNaN(f3) : Math.abs(f2 - f3) > 1.0E-6f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x015e, code lost:
        r2.e(r9, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x016e, code lost:
        r2.e(r9, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r8, int r9) {
        /*
            r7 = this;
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01bb
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.get(r1)
            androidx.constraintlayout.motion.widget.r r2 = (androidx.constraintlayout.motion.widget.r) r2
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 1
            switch(r4) {
                case -1249320806: goto L_0x0099;
                case -1249320805: goto L_0x008f;
                case -1225497657: goto L_0x0084;
                case -1225497656: goto L_0x0079;
                case -1225497655: goto L_0x006e;
                case -1001078227: goto L_0x0064;
                case -908189618: goto L_0x005a;
                case -908189617: goto L_0x004f;
                case -40300674: goto L_0x0045;
                case -4379043: goto L_0x003b;
                case 37232917: goto L_0x0030;
                case 92909918: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x00a2
        L_0x0025:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00a2
            r3 = 0
            goto L_0x00a2
        L_0x0030:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00a2
            r3 = 5
            goto L_0x00a2
        L_0x003b:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00a2
            r3 = 1
            goto L_0x00a2
        L_0x0045:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00a2
            r3 = 2
            goto L_0x00a2
        L_0x004f:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00a2
            r3 = 8
            goto L_0x00a2
        L_0x005a:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00a2
            r3 = 7
            goto L_0x00a2
        L_0x0064:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00a2
            r3 = 6
            goto L_0x00a2
        L_0x006e:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00a2
            r3 = 11
            goto L_0x00a2
        L_0x0079:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00a2
            r3 = 10
            goto L_0x00a2
        L_0x0084:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00a2
            r3 = 9
            goto L_0x00a2
        L_0x008f:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00a2
            r3 = 4
            goto L_0x00a2
        L_0x0099:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00a2
            r3 = 3
        L_0x00a2:
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r3) {
                case 0: goto L_0x0163;
                case 1: goto L_0x0153;
                case 2: goto L_0x0147;
                case 3: goto L_0x013b;
                case 4: goto L_0x012f;
                case 5: goto L_0x0123;
                case 6: goto L_0x0117;
                case 7: goto L_0x010b;
                case 8: goto L_0x00fd;
                case 9: goto L_0x00ef;
                case 10: goto L_0x00e1;
                case 11: goto L_0x00d3;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x01a9
            java.lang.String r3 = ","
            java.lang.String[] r3 = r1.split(r3)
            r3 = r3[r5]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r4 = r7.t
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L_0x0197
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r4 = r7.t
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.widget.a r3 = (androidx.constraintlayout.widget.a) r3
            boolean r4 = r2 instanceof androidx.constraintlayout.motion.widget.r.b
            if (r4 == 0) goto L_0x0173
            androidx.constraintlayout.motion.widget.r$b r2 = (androidx.constraintlayout.motion.widget.r.b) r2
            r2.i(r9, r3)
            goto L_0x0008
        L_0x00d3:
            float r1 = r7.p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x00dd
            goto L_0x015e
        L_0x00dd:
            float r6 = r7.p
            goto L_0x015e
        L_0x00e1:
            float r1 = r7.o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x00eb
            goto L_0x015e
        L_0x00eb:
            float r6 = r7.o
            goto L_0x015e
        L_0x00ef:
            float r1 = r7.n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x00f9
            goto L_0x015e
        L_0x00f9:
            float r6 = r7.n
            goto L_0x015e
        L_0x00fd:
            float r1 = r7.m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0107
            goto L_0x016e
        L_0x0107:
            float r4 = r7.m
            goto L_0x016e
        L_0x010b:
            float r1 = r7.l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0114
            goto L_0x016e
        L_0x0114:
            float r4 = r7.l
            goto L_0x016e
        L_0x0117:
            float r1 = r7.s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0120
            goto L_0x015e
        L_0x0120:
            float r6 = r7.s
            goto L_0x015e
        L_0x0123:
            float r1 = r7.r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x012c
            goto L_0x015e
        L_0x012c:
            float r6 = r7.r
            goto L_0x015e
        L_0x012f:
            float r1 = r7.k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0138
            goto L_0x015e
        L_0x0138:
            float r6 = r7.k
            goto L_0x015e
        L_0x013b:
            float r1 = r7.j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0144
            goto L_0x015e
        L_0x0144:
            float r6 = r7.j
            goto L_0x015e
        L_0x0147:
            float r1 = r7.i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0150
            goto L_0x015e
        L_0x0150:
            float r6 = r7.i
            goto L_0x015e
        L_0x0153:
            float r1 = r7.h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x015c
            goto L_0x015e
        L_0x015c:
            float r6 = r7.h
        L_0x015e:
            r2.e(r9, r6)
            goto L_0x0008
        L_0x0163:
            float r1 = r7.e
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x016c
            goto L_0x016e
        L_0x016c:
            float r4 = r7.e
        L_0x016e:
            r2.e(r9, r4)
            goto L_0x0008
        L_0x0173:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " splineSet not a CustomSet frame = "
            r4.append(r1)
            r4.append(r9)
            java.lang.String r1 = ", value"
            r4.append(r1)
            float r1 = r3.d()
            r4.append(r1)
            r4.append(r2)
            r4.toString()
            goto L_0x0008
        L_0x0197:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "UNKNOWN customName "
            r1.append(r2)
            r1.append(r3)
            r1.toString()
            goto L_0x0008
        L_0x01a9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN spline "
            r2.append(r3)
            r2.append(r1)
            r2.toString()
            goto L_0x0008
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.m.a(java.util.HashMap, int):void");
    }

    public void e(View view) {
        this.g = view.getVisibility();
        this.e = view.getVisibility() != 0 ? Utils.FLOAT_EPSILON : view.getAlpha();
        if (Build.VERSION.SDK_INT >= 21) {
            this.h = view.getElevation();
        }
        this.i = view.getRotation();
        this.j = view.getRotationX();
        this.k = view.getRotationY();
        this.l = view.getScaleX();
        this.m = view.getScaleY();
        view.getPivotX();
        view.getPivotY();
        this.n = view.getTranslationX();
        this.o = view.getTranslationY();
        if (Build.VERSION.SDK_INT >= 21) {
            this.p = view.getTranslationZ();
        }
    }

    public void f(c.a aVar) {
        c.d dVar = aVar.b;
        int i2 = dVar.c;
        this.f = i2;
        int i3 = dVar.b;
        this.g = i3;
        this.e = (i3 == 0 || i2 != 0) ? aVar.b.d : Utils.FLOAT_EPSILON;
        c.e eVar = aVar.e;
        boolean z = eVar.l;
        this.h = eVar.m;
        this.i = eVar.b;
        this.j = eVar.c;
        this.k = eVar.d;
        this.l = eVar.e;
        this.m = eVar.f;
        float f2 = eVar.g;
        float f3 = eVar.h;
        this.n = eVar.i;
        this.o = eVar.j;
        this.p = eVar.k;
        l0.c(aVar.c.c);
        c.C0016c cVar = aVar.c;
        this.r = cVar.g;
        int i4 = cVar.e;
        this.s = aVar.b.e;
        for (String next : aVar.f.keySet()) {
            a aVar2 = aVar.f.get(next);
            if (aVar2.c() != a.b.STRING_TYPE) {
                this.t.put(next, aVar2);
            }
        }
    }

    /* renamed from: h */
    public int compareTo(m mVar) {
        return Float.compare(this.q, mVar.q);
    }

    /* access modifiers changed from: package-private */
    public void k(m mVar, HashSet<String> hashSet) {
        if (i(this.e, mVar.e)) {
            hashSet.add("alpha");
        }
        if (i(this.h, mVar.h)) {
            hashSet.add("elevation");
        }
        int i2 = this.g;
        int i3 = mVar.g;
        if (i2 != i3 && this.f == 0 && (i2 == 0 || i3 == 0)) {
            hashSet.add("alpha");
        }
        if (i(this.i, mVar.i)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.r) || !Float.isNaN(mVar.r)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.s) || !Float.isNaN(mVar.s)) {
            hashSet.add("progress");
        }
        if (i(this.j, mVar.j)) {
            hashSet.add("rotationX");
        }
        if (i(this.k, mVar.k)) {
            hashSet.add("rotationY");
        }
        if (i(this.l, mVar.l)) {
            hashSet.add("scaleX");
        }
        if (i(this.m, mVar.m)) {
            hashSet.add("scaleY");
        }
        if (i(this.n, mVar.n)) {
            hashSet.add("translationX");
        }
        if (i(this.o, mVar.o)) {
            hashSet.add("translationY");
        }
        if (i(this.p, mVar.p)) {
            hashSet.add("translationZ");
        }
    }

    /* access modifiers changed from: package-private */
    public void l(float f2, float f3, float f4, float f5) {
    }

    public void m(View view) {
        l(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        e(view);
    }

    public void q(e1 e1Var, c cVar, int i2) {
        l((float) e1Var.Q(), (float) e1Var.R(), (float) e1Var.P(), (float) e1Var.v());
        f(cVar.s(i2));
    }
}
