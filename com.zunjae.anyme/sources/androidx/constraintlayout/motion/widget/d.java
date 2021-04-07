package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R$styleable;
import java.util.HashMap;
import java.util.HashSet;

public class d extends c {
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

    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(R$styleable.KeyAttribute_android_alpha, 1);
            a.append(R$styleable.KeyAttribute_android_elevation, 2);
            a.append(R$styleable.KeyAttribute_android_rotation, 4);
            a.append(R$styleable.KeyAttribute_android_rotationX, 5);
            a.append(R$styleable.KeyAttribute_android_rotationY, 6);
            a.append(R$styleable.KeyAttribute_android_scaleX, 7);
            a.append(R$styleable.KeyAttribute_transitionPathRotate, 8);
            a.append(R$styleable.KeyAttribute_transitionEasing, 9);
            a.append(R$styleable.KeyAttribute_motionTarget, 10);
            a.append(R$styleable.KeyAttribute_framePosition, 12);
            a.append(R$styleable.KeyAttribute_curveFit, 13);
            a.append(R$styleable.KeyAttribute_android_scaleY, 14);
            a.append(R$styleable.KeyAttribute_android_translationX, 15);
            a.append(R$styleable.KeyAttribute_android_translationY, 16);
            a.append(R$styleable.KeyAttribute_android_translationZ, 17);
            a.append(R$styleable.KeyAttribute_motionProgress, 18);
        }

        public static void a(d dVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        float unused = dVar.h = typedArray.getFloat(index, dVar.h);
                        break;
                    case 2:
                        float unused2 = dVar.i = typedArray.getDimension(index, dVar.i);
                        break;
                    case 4:
                        float unused3 = dVar.j = typedArray.getFloat(index, dVar.j);
                        break;
                    case 5:
                        float unused4 = dVar.k = typedArray.getFloat(index, dVar.k);
                        break;
                    case 6:
                        float unused5 = dVar.l = typedArray.getFloat(index, dVar.l);
                        break;
                    case 7:
                        float unused6 = dVar.n = typedArray.getFloat(index, dVar.n);
                        break;
                    case 8:
                        float unused7 = dVar.m = typedArray.getFloat(index, dVar.m);
                        break;
                    case 9:
                        String unused8 = dVar.f = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.H0) {
                            if (typedArray.peekValue(index).type != 3) {
                                dVar.b = typedArray.getResourceId(index, dVar.b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, dVar.b);
                            dVar.b = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                        }
                        dVar.c = typedArray.getString(index);
                        break;
                    case 12:
                        dVar.a = typedArray.getInt(index, dVar.a);
                        break;
                    case 13:
                        int unused9 = dVar.g = typedArray.getInteger(index, dVar.g);
                        break;
                    case 14:
                        float unused10 = dVar.o = typedArray.getFloat(index, dVar.o);
                        break;
                    case 15:
                        float unused11 = dVar.p = typedArray.getDimension(index, dVar.p);
                        break;
                    case 16:
                        float unused12 = dVar.q = typedArray.getDimension(index, dVar.q);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            float unused13 = dVar.r = typedArray.getDimension(index, dVar.r);
                            break;
                        }
                    case 18:
                        float unused14 = dVar.s = typedArray.getFloat(index, dVar.s);
                        break;
                    default:
                        "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index);
                        break;
                }
            }
        }
    }

    public d() {
        this.d = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (r1.equals("scaleY") != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x017a, code lost:
        r2.e(r1, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x017f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            androidx.constraintlayout.motion.widget.r r2 = (androidx.constraintlayout.motion.widget.r) r2
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x0039
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r3 = r6.d
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.a r1 = (androidx.constraintlayout.widget.a) r1
            if (r1 == 0) goto L_0x0008
            androidx.constraintlayout.motion.widget.r$b r2 = (androidx.constraintlayout.motion.widget.r.b) r2
            int r3 = r6.a
            r2.i(r3, r1)
            goto L_0x0008
        L_0x0039:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00b6;
                case -1249320805: goto L_0x00ac;
                case -1225497657: goto L_0x00a1;
                case -1225497656: goto L_0x0096;
                case -1225497655: goto L_0x008b;
                case -1001078227: goto L_0x0080;
                case -908189618: goto L_0x0076;
                case -908189617: goto L_0x006d;
                case -40300674: goto L_0x0063;
                case -4379043: goto L_0x0059;
                case 37232917: goto L_0x004e;
                case 92909918: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x00c0
        L_0x0043:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 0
            goto L_0x00c1
        L_0x004e:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 5
            goto L_0x00c1
        L_0x0059:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 1
            goto L_0x00c1
        L_0x0063:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 2
            goto L_0x00c1
        L_0x006d:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00c0
            goto L_0x00c1
        L_0x0076:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 6
            goto L_0x00c1
        L_0x0080:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 11
            goto L_0x00c1
        L_0x008b:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 10
            goto L_0x00c1
        L_0x0096:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 9
            goto L_0x00c1
        L_0x00a1:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 8
            goto L_0x00c1
        L_0x00ac:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 4
            goto L_0x00c1
        L_0x00b6:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 3
            goto L_0x00c1
        L_0x00c0:
            r4 = -1
        L_0x00c1:
            switch(r4) {
                case 0: goto L_0x016e;
                case 1: goto L_0x0161;
                case 2: goto L_0x0154;
                case 3: goto L_0x0147;
                case 4: goto L_0x013a;
                case 5: goto L_0x012d;
                case 6: goto L_0x0120;
                case 7: goto L_0x0113;
                case 8: goto L_0x0105;
                case 9: goto L_0x00f7;
                case 10: goto L_0x00e9;
                case 11: goto L_0x00db;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            r2.toString()
            goto L_0x0008
        L_0x00db:
            float r1 = r6.s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.s
            goto L_0x017a
        L_0x00e9:
            float r1 = r6.r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.r
            goto L_0x017a
        L_0x00f7:
            float r1 = r6.q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.q
            goto L_0x017a
        L_0x0105:
            float r1 = r6.p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.p
            goto L_0x017a
        L_0x0113:
            float r1 = r6.o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.o
            goto L_0x017a
        L_0x0120:
            float r1 = r6.n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.n
            goto L_0x017a
        L_0x012d:
            float r1 = r6.m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.m
            goto L_0x017a
        L_0x013a:
            float r1 = r6.l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.l
            goto L_0x017a
        L_0x0147:
            float r1 = r6.k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.k
            goto L_0x017a
        L_0x0154:
            float r1 = r6.j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.j
            goto L_0x017a
        L_0x0161:
            float r1 = r6.i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.i
            goto L_0x017a
        L_0x016e:
            float r1 = r6.h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.h
        L_0x017a:
            r2.e(r1, r3)
            goto L_0x0008
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.d.a(java.util.HashMap):void");
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
        if (!Float.isNaN(this.n)) {
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
        a.a(this, context.obtainStyledAttributes(attributeSet, R$styleable.KeyAttribute));
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
            if (!Float.isNaN(this.o)) {
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
