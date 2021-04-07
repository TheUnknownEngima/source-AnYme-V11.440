package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.a;
import com.github.mikephil.charting.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;

public class f extends c {
    /* access modifiers changed from: private */
    public String f;
    /* access modifiers changed from: private */
    public int g = 0;
    /* access modifiers changed from: private */
    public int h = -1;
    /* access modifiers changed from: private */
    public float i = Float.NaN;
    /* access modifiers changed from: private */
    public float j = Utils.FLOAT_EPSILON;
    /* access modifiers changed from: private */
    public float k = Float.NaN;
    /* access modifiers changed from: private */
    public int l = -1;
    /* access modifiers changed from: private */
    public float m = Float.NaN;
    /* access modifiers changed from: private */
    public float n = Float.NaN;
    /* access modifiers changed from: private */
    public float o = Float.NaN;
    /* access modifiers changed from: private */
    public float p = Float.NaN;
    /* access modifiers changed from: private */
    public float q = Float.NaN;
    /* access modifiers changed from: private */
    public float r = Float.NaN;
    /* access modifiers changed from: private */
    public float s = Float.NaN;
    /* access modifiers changed from: private */
    public float t = Float.NaN;
    /* access modifiers changed from: private */
    public float u = Float.NaN;
    /* access modifiers changed from: private */
    public float v = Float.NaN;
    /* access modifiers changed from: private */
    public float w = Float.NaN;

    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(R$styleable.KeyCycle_motionTarget, 1);
            a.append(R$styleable.KeyCycle_framePosition, 2);
            a.append(R$styleable.KeyCycle_transitionEasing, 3);
            a.append(R$styleable.KeyCycle_curveFit, 4);
            a.append(R$styleable.KeyCycle_waveShape, 5);
            a.append(R$styleable.KeyCycle_wavePeriod, 6);
            a.append(R$styleable.KeyCycle_waveOffset, 7);
            a.append(R$styleable.KeyCycle_waveVariesBy, 8);
            a.append(R$styleable.KeyCycle_android_alpha, 9);
            a.append(R$styleable.KeyCycle_android_elevation, 10);
            a.append(R$styleable.KeyCycle_android_rotation, 11);
            a.append(R$styleable.KeyCycle_android_rotationX, 12);
            a.append(R$styleable.KeyCycle_android_rotationY, 13);
            a.append(R$styleable.KeyCycle_transitionPathRotate, 14);
            a.append(R$styleable.KeyCycle_android_scaleX, 15);
            a.append(R$styleable.KeyCycle_android_scaleY, 16);
            a.append(R$styleable.KeyCycle_android_translationX, 17);
            a.append(R$styleable.KeyCycle_android_translationY, 18);
            a.append(R$styleable.KeyCycle_android_translationZ, 19);
            a.append(R$styleable.KeyCycle_motionProgress, 20);
        }

        /* access modifiers changed from: private */
        public static void b(f fVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        if (!MotionLayout.H0) {
                            if (typedArray.peekValue(index).type != 3) {
                                fVar.b = typedArray.getResourceId(index, fVar.b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, fVar.b);
                            fVar.b = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                        }
                        fVar.c = typedArray.getString(index);
                        break;
                    case 2:
                        fVar.a = typedArray.getInt(index, fVar.a);
                        break;
                    case 3:
                        String unused = fVar.f = typedArray.getString(index);
                        break;
                    case 4:
                        int unused2 = fVar.g = typedArray.getInteger(index, fVar.g);
                        break;
                    case 5:
                        int unused3 = fVar.h = typedArray.getInt(index, fVar.h);
                        break;
                    case 6:
                        float unused4 = fVar.i = typedArray.getFloat(index, fVar.i);
                        break;
                    case 7:
                        float unused5 = fVar.j = typedArray.peekValue(index).type == 5 ? typedArray.getDimension(index, fVar.j) : typedArray.getFloat(index, fVar.j);
                        break;
                    case 8:
                        int unused6 = fVar.l = typedArray.getInt(index, fVar.l);
                        break;
                    case 9:
                        float unused7 = fVar.m = typedArray.getFloat(index, fVar.m);
                        break;
                    case 10:
                        float unused8 = fVar.n = typedArray.getDimension(index, fVar.n);
                        break;
                    case 11:
                        float unused9 = fVar.o = typedArray.getFloat(index, fVar.o);
                        break;
                    case 12:
                        float unused10 = fVar.q = typedArray.getFloat(index, fVar.q);
                        break;
                    case 13:
                        float unused11 = fVar.r = typedArray.getFloat(index, fVar.r);
                        break;
                    case 14:
                        float unused12 = fVar.p = typedArray.getFloat(index, fVar.p);
                        break;
                    case 15:
                        float unused13 = fVar.s = typedArray.getFloat(index, fVar.s);
                        break;
                    case 16:
                        float unused14 = fVar.t = typedArray.getFloat(index, fVar.t);
                        break;
                    case 17:
                        float unused15 = fVar.u = typedArray.getDimension(index, fVar.u);
                        break;
                    case 18:
                        float unused16 = fVar.v = typedArray.getDimension(index, fVar.v);
                        break;
                    case 19:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            float unused17 = fVar.w = typedArray.getDimension(index, fVar.w);
                            break;
                        }
                    case 20:
                        float unused18 = fVar.k = typedArray.getFloat(index, fVar.k);
                        break;
                    default:
                        "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index);
                        break;
                }
            }
        }
    }

    public f() {
        this.d = new HashMap<>();
    }

    public void O(HashMap<String, g> hashMap) {
        androidx.constraintlayout.widget.a aVar;
        HashMap<String, g> hashMap2 = hashMap;
        for (String next : hashMap.keySet()) {
            if (next.startsWith("CUSTOM") && (aVar = this.d.get(next.substring(7))) != null && aVar.c() == a.b.FLOAT_TYPE) {
                hashMap2.get(next).e(this.a, this.h, this.l, this.i, this.j, aVar.d(), aVar);
            }
            float P = P(next);
            if (!Float.isNaN(P)) {
                hashMap2.get(next).d(this.a, this.h, this.l, this.i, this.j, P);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float P(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x0089;
                case -1249320805: goto L_0x007f;
                case -1225497657: goto L_0x0074;
                case -1225497656: goto L_0x0069;
                case -1225497655: goto L_0x005e;
                case -1001078227: goto L_0x0053;
                case -908189618: goto L_0x0049;
                case -908189617: goto L_0x003f;
                case -40300674: goto L_0x0035;
                case -4379043: goto L_0x002b;
                case 37232917: goto L_0x0020;
                case 92909918: goto L_0x0015;
                case 156108012: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0093
        L_0x0009:
            java.lang.String r0 = "waveOffset"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 11
            goto L_0x0094
        L_0x0015:
            java.lang.String r0 = "alpha"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 0
            goto L_0x0094
        L_0x0020:
            java.lang.String r0 = "transitionPathRotate"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 5
            goto L_0x0094
        L_0x002b:
            java.lang.String r0 = "elevation"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 1
            goto L_0x0094
        L_0x0035:
            java.lang.String r0 = "rotation"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 2
            goto L_0x0094
        L_0x003f:
            java.lang.String r0 = "scaleY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 7
            goto L_0x0094
        L_0x0049:
            java.lang.String r0 = "scaleX"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 6
            goto L_0x0094
        L_0x0053:
            java.lang.String r0 = "progress"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 12
            goto L_0x0094
        L_0x005e:
            java.lang.String r0 = "translationZ"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 10
            goto L_0x0094
        L_0x0069:
            java.lang.String r0 = "translationY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 9
            goto L_0x0094
        L_0x0074:
            java.lang.String r0 = "translationX"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 8
            goto L_0x0094
        L_0x007f:
            java.lang.String r0 = "rotationY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 4
            goto L_0x0094
        L_0x0089:
            java.lang.String r0 = "rotationX"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 3
            goto L_0x0094
        L_0x0093:
            r0 = -1
        L_0x0094:
            switch(r0) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x00cb;
                case 2: goto L_0x00c8;
                case 3: goto L_0x00c5;
                case 4: goto L_0x00c2;
                case 5: goto L_0x00bf;
                case 6: goto L_0x00bc;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00b6;
                case 9: goto L_0x00b3;
                case 10: goto L_0x00b0;
                case 11: goto L_0x00ad;
                case 12: goto L_0x00aa;
                default: goto L_0x0097;
            }
        L_0x0097:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "  UNKNOWN  "
            r0.append(r1)
            r0.append(r3)
            r0.toString()
            r3 = 2143289344(0x7fc00000, float:NaN)
            return r3
        L_0x00aa:
            float r3 = r2.k
            return r3
        L_0x00ad:
            float r3 = r2.j
            return r3
        L_0x00b0:
            float r3 = r2.w
            return r3
        L_0x00b3:
            float r3 = r2.v
            return r3
        L_0x00b6:
            float r3 = r2.u
            return r3
        L_0x00b9:
            float r3 = r2.t
            return r3
        L_0x00bc:
            float r3 = r2.s
            return r3
        L_0x00bf:
            float r3 = r2.p
            return r3
        L_0x00c2:
            float r3 = r2.r
            return r3
        L_0x00c5:
            float r3 = r2.q
            return r3
        L_0x00c8:
            float r3 = r2.o
            return r3
        L_0x00cb:
            float r3 = r2.n
            return r3
        L_0x00ce:
            float r3 = r2.m
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.f.P(java.lang.String):float");
    }

    public void a(HashMap<String, r> hashMap) {
        float f2;
        int i2;
        a.e("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String next : hashMap.keySet()) {
            r rVar = hashMap.get(next);
            char c = 65535;
            switch (next.hashCode()) {
                case -1249320806:
                    if (next.equals("rotationX")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1249320805:
                    if (next.equals("rotationY")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1225497657:
                    if (next.equals("translationX")) {
                        c = 8;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals("translationY")) {
                        c = 9;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals("translationZ")) {
                        c = 10;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals("progress")) {
                        c = 12;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -40300674:
                    if (next.equals("rotation")) {
                        c = 2;
                        break;
                    }
                    break;
                case -4379043:
                    if (next.equals("elevation")) {
                        c = 1;
                        break;
                    }
                    break;
                case 37232917:
                    if (next.equals("transitionPathRotate")) {
                        c = 5;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c = 0;
                        break;
                    }
                    break;
                case 156108012:
                    if (next.equals("waveOffset")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i2 = this.a;
                    f2 = this.m;
                    break;
                case 1:
                    i2 = this.a;
                    f2 = this.n;
                    break;
                case 2:
                    i2 = this.a;
                    f2 = this.o;
                    break;
                case 3:
                    i2 = this.a;
                    f2 = this.q;
                    break;
                case 4:
                    i2 = this.a;
                    f2 = this.r;
                    break;
                case 5:
                    i2 = this.a;
                    f2 = this.p;
                    break;
                case 6:
                    i2 = this.a;
                    f2 = this.s;
                    break;
                case 7:
                    i2 = this.a;
                    f2 = this.t;
                    break;
                case 8:
                    i2 = this.a;
                    f2 = this.u;
                    break;
                case 9:
                    i2 = this.a;
                    f2 = this.v;
                    break;
                case 10:
                    i2 = this.a;
                    f2 = this.w;
                    break;
                case 11:
                    i2 = this.a;
                    f2 = this.j;
                    break;
                case 12:
                    i2 = this.a;
                    f2 = this.k;
                    break;
                default:
                    "  UNKNOWN  " + next;
                    continue;
            }
            rVar.e(i2, f2);
        }
    }

    public void b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add("translationZ");
        }
        if (this.d.size() > 0) {
            for (String str : this.d.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void c(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, R$styleable.KeyCycle));
    }
}
