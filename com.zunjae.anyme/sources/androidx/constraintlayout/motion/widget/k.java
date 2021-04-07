package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R$styleable;
import com.github.mikephil.charting.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;

public class k extends c {
    /* access modifiers changed from: private */
    public String f;
    /* access modifiers changed from: private */
    public int g = -1;
    /* access modifiers changed from: private */
    public float h = Float.NaN;
    /* access modifiers changed from: private */
    public float i = Float.NaN;
    /* access modifiers changed from: private */
    public float j = Float.NaN;
    /* access modifiers changed from: private */
    public float k = Float.NaN;
    /* access modifiers changed from: private */
    public float l = Float.NaN;
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
    public int t = 0;
    /* access modifiers changed from: private */
    public float u = Float.NaN;
    /* access modifiers changed from: private */
    public float v = Utils.FLOAT_EPSILON;

    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(R$styleable.KeyTimeCycle_android_alpha, 1);
            a.append(R$styleable.KeyTimeCycle_android_elevation, 2);
            a.append(R$styleable.KeyTimeCycle_android_rotation, 4);
            a.append(R$styleable.KeyTimeCycle_android_rotationX, 5);
            a.append(R$styleable.KeyTimeCycle_android_rotationY, 6);
            a.append(R$styleable.KeyTimeCycle_android_scaleX, 7);
            a.append(R$styleable.KeyTimeCycle_transitionPathRotate, 8);
            a.append(R$styleable.KeyTimeCycle_transitionEasing, 9);
            a.append(R$styleable.KeyTimeCycle_motionTarget, 10);
            a.append(R$styleable.KeyTimeCycle_framePosition, 12);
            a.append(R$styleable.KeyTimeCycle_curveFit, 13);
            a.append(R$styleable.KeyTimeCycle_android_scaleY, 14);
            a.append(R$styleable.KeyTimeCycle_android_translationX, 15);
            a.append(R$styleable.KeyTimeCycle_android_translationY, 16);
            a.append(R$styleable.KeyTimeCycle_android_translationZ, 17);
            a.append(R$styleable.KeyTimeCycle_motionProgress, 18);
            a.append(R$styleable.KeyTimeCycle_wavePeriod, 20);
            a.append(R$styleable.KeyTimeCycle_waveOffset, 21);
            a.append(R$styleable.KeyTimeCycle_waveShape, 19);
        }

        public static void a(k kVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        float unused = kVar.h = typedArray.getFloat(index, kVar.h);
                        break;
                    case 2:
                        float unused2 = kVar.i = typedArray.getDimension(index, kVar.i);
                        break;
                    case 4:
                        float unused3 = kVar.j = typedArray.getFloat(index, kVar.j);
                        break;
                    case 5:
                        float unused4 = kVar.k = typedArray.getFloat(index, kVar.k);
                        break;
                    case 6:
                        float unused5 = kVar.l = typedArray.getFloat(index, kVar.l);
                        break;
                    case 7:
                        float unused6 = kVar.n = typedArray.getFloat(index, kVar.n);
                        break;
                    case 8:
                        float unused7 = kVar.m = typedArray.getFloat(index, kVar.m);
                        break;
                    case 9:
                        String unused8 = kVar.f = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.H0) {
                            if (typedArray.peekValue(index).type != 3) {
                                kVar.b = typedArray.getResourceId(index, kVar.b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, kVar.b);
                            kVar.b = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                        }
                        kVar.c = typedArray.getString(index);
                        break;
                    case 12:
                        kVar.a = typedArray.getInt(index, kVar.a);
                        break;
                    case 13:
                        int unused9 = kVar.g = typedArray.getInteger(index, kVar.g);
                        break;
                    case 14:
                        float unused10 = kVar.o = typedArray.getFloat(index, kVar.o);
                        break;
                    case 15:
                        float unused11 = kVar.p = typedArray.getDimension(index, kVar.p);
                        break;
                    case 16:
                        float unused12 = kVar.q = typedArray.getDimension(index, kVar.q);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            float unused13 = kVar.r = typedArray.getDimension(index, kVar.r);
                            break;
                        }
                    case 18:
                        float unused14 = kVar.s = typedArray.getFloat(index, kVar.s);
                        break;
                    case 19:
                        int unused15 = kVar.t = typedArray.getInt(index, kVar.t);
                        break;
                    case 20:
                        float unused16 = kVar.u = typedArray.getFloat(index, kVar.u);
                        break;
                    case 21:
                        float unused17 = kVar.v = typedArray.peekValue(index).type == 5 ? typedArray.getDimension(index, kVar.v) : typedArray.getFloat(index, kVar.v);
                        break;
                    default:
                        "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index);
                        break;
                }
            }
        }
    }

    public k() {
        this.d = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (r1.equals("scaleY") != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0183, code lost:
        r3.e(r4, r5, r10.u, r10.t, r10.v);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void M(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.s> r11) {
        /*
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x018e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            androidx.constraintlayout.motion.widget.s r3 = (androidx.constraintlayout.motion.widget.s) r3
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0042
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r10.d
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.a r6 = (androidx.constraintlayout.widget.a) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            androidx.constraintlayout.motion.widget.s$b r4 = (androidx.constraintlayout.motion.widget.s.b) r4
            int r5 = r10.a
            float r7 = r10.u
            int r8 = r10.t
            float r9 = r10.v
            r4.j(r5, r6, r7, r8, r9)
            goto L_0x0008
        L_0x0042:
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00bf;
                case -1249320805: goto L_0x00b5;
                case -1225497657: goto L_0x00aa;
                case -1225497656: goto L_0x009f;
                case -1225497655: goto L_0x0094;
                case -1001078227: goto L_0x0089;
                case -908189618: goto L_0x007f;
                case -908189617: goto L_0x0076;
                case -40300674: goto L_0x006c;
                case -4379043: goto L_0x0062;
                case 37232917: goto L_0x0057;
                case 92909918: goto L_0x004c;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x00c9
        L_0x004c:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 0
            goto L_0x00ca
        L_0x0057:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 5
            goto L_0x00ca
        L_0x0062:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 1
            goto L_0x00ca
        L_0x006c:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 2
            goto L_0x00ca
        L_0x0076:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00c9
            goto L_0x00ca
        L_0x007f:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 6
            goto L_0x00ca
        L_0x0089:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 11
            goto L_0x00ca
        L_0x0094:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 10
            goto L_0x00ca
        L_0x009f:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 9
            goto L_0x00ca
        L_0x00aa:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 8
            goto L_0x00ca
        L_0x00b5:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 4
            goto L_0x00ca
        L_0x00bf:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 3
            goto L_0x00ca
        L_0x00c9:
            r4 = -1
        L_0x00ca:
            switch(r4) {
                case 0: goto L_0x0177;
                case 1: goto L_0x016a;
                case 2: goto L_0x015d;
                case 3: goto L_0x0150;
                case 4: goto L_0x0143;
                case 5: goto L_0x0136;
                case 6: goto L_0x0129;
                case 7: goto L_0x011c;
                case 8: goto L_0x010e;
                case 9: goto L_0x0100;
                case 10: goto L_0x00f2;
                case 11: goto L_0x00e4;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            r2.toString()
            goto L_0x0008
        L_0x00e4:
            float r1 = r10.s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.a
            float r5 = r10.s
            goto L_0x0183
        L_0x00f2:
            float r1 = r10.r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.a
            float r5 = r10.r
            goto L_0x0183
        L_0x0100:
            float r1 = r10.q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.a
            float r5 = r10.q
            goto L_0x0183
        L_0x010e:
            float r1 = r10.p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.a
            float r5 = r10.p
            goto L_0x0183
        L_0x011c:
            float r1 = r10.o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.a
            float r5 = r10.o
            goto L_0x0183
        L_0x0129:
            float r1 = r10.n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.a
            float r5 = r10.n
            goto L_0x0183
        L_0x0136:
            float r1 = r10.m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.a
            float r5 = r10.m
            goto L_0x0183
        L_0x0143:
            float r1 = r10.l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.a
            float r5 = r10.l
            goto L_0x0183
        L_0x0150:
            float r1 = r10.k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.a
            float r5 = r10.k
            goto L_0x0183
        L_0x015d:
            float r1 = r10.j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.a
            float r5 = r10.j
            goto L_0x0183
        L_0x016a:
            float r1 = r10.i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.a
            float r5 = r10.i
            goto L_0x0183
        L_0x0177:
            float r1 = r10.h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.a
            float r5 = r10.h
        L_0x0183:
            float r6 = r10.u
            int r7 = r10.t
            float r8 = r10.v
            r3.e(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.k.M(java.util.HashMap):void");
    }

    public void a(HashMap<String, r> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    public void b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.h)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("progress");
        }
        if (this.d.size() > 0) {
            for (String str : this.d.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void c(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, R$styleable.KeyTimeCycle));
    }

    public void e(HashMap<String, Integer> hashMap) {
        if (this.g != -1) {
            if (!Float.isNaN(this.h)) {
                hashMap.put("alpha", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.i)) {
                hashMap.put("elevation", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.j)) {
                hashMap.put("rotation", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.k)) {
                hashMap.put("rotationX", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.l)) {
                hashMap.put("rotationY", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.p)) {
                hashMap.put("translationX", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.q)) {
                hashMap.put("translationY", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.r)) {
                hashMap.put("translationZ", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.m)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.n)) {
                hashMap.put("scaleX", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.n)) {
                hashMap.put("scaleY", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.s)) {
                hashMap.put("progress", Integer.valueOf(this.g));
            }
            if (this.d.size() > 0) {
                for (String str : this.d.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.g));
                }
            }
        }
    }
}
