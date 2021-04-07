package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.R$styleable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

public class l extends c {
    /* access modifiers changed from: private */
    public String f = null;
    /* access modifiers changed from: private */
    public int g;
    /* access modifiers changed from: private */
    public String h;
    /* access modifiers changed from: private */
    public String i;
    /* access modifiers changed from: private */
    public int j;
    /* access modifiers changed from: private */
    public int k;
    private View l;
    float m;
    private boolean n;
    private boolean o;
    private boolean p;
    /* access modifiers changed from: private */
    public float q;
    private Method r;
    private Method s;
    private Method t;
    private float u;
    /* access modifiers changed from: private */
    public boolean v;
    RectF w;
    RectF x;

    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(R$styleable.KeyTrigger_framePosition, 8);
            a.append(R$styleable.KeyTrigger_onCross, 4);
            a.append(R$styleable.KeyTrigger_onNegativeCross, 1);
            a.append(R$styleable.KeyTrigger_onPositiveCross, 2);
            a.append(R$styleable.KeyTrigger_motionTarget, 7);
            a.append(R$styleable.KeyTrigger_triggerId, 6);
            a.append(R$styleable.KeyTrigger_triggerSlack, 5);
            a.append(R$styleable.KeyTrigger_motion_triggerOnCollision, 9);
            a.append(R$styleable.KeyTrigger_motion_postLayoutCollision, 10);
            a.append(R$styleable.KeyTrigger_triggerReceiver, 11);
        }

        public static void a(l lVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        String unused = lVar.h = typedArray.getString(index);
                        continue;
                    case 2:
                        String unused2 = lVar.i = typedArray.getString(index);
                        continue;
                    case 4:
                        String unused3 = lVar.f = typedArray.getString(index);
                        continue;
                    case 5:
                        lVar.m = typedArray.getFloat(index, lVar.m);
                        continue;
                    case 6:
                        int unused4 = lVar.j = typedArray.getResourceId(index, lVar.j);
                        continue;
                    case 7:
                        if (!MotionLayout.H0) {
                            if (typedArray.peekValue(index).type != 3) {
                                lVar.b = typedArray.getResourceId(index, lVar.b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, lVar.b);
                            lVar.b = resourceId;
                            if (resourceId != -1) {
                                continue;
                            }
                        }
                        lVar.c = typedArray.getString(index);
                        break;
                    case 8:
                        int integer = typedArray.getInteger(index, lVar.a);
                        lVar.a = integer;
                        float unused5 = lVar.q = (((float) integer) + 0.5f) / 100.0f;
                        continue;
                    case 9:
                        int unused6 = lVar.k = typedArray.getResourceId(index, lVar.k);
                        continue;
                    case 10:
                        boolean unused7 = lVar.v = typedArray.getBoolean(index, lVar.v);
                        continue;
                    case 11:
                        int unused8 = lVar.g = typedArray.getResourceId(index, lVar.g);
                        break;
                }
                "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index);
            }
        }
    }

    public l() {
        int i2 = c.e;
        this.g = i2;
        this.h = null;
        this.i = null;
        this.j = i2;
        this.k = i2;
        this.l = null;
        this.m = 0.1f;
        this.n = true;
        this.o = true;
        this.p = true;
        this.q = Float.NaN;
        this.v = false;
        this.w = new RectF();
        this.x = new RectF();
        this.d = new HashMap<>();
    }

    private void s(RectF rectF, View view, boolean z) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    public void a(HashMap<String, r> hashMap) {
    }

    public void b(HashSet<String> hashSet) {
    }

    public void c(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, R$styleable.KeyTrigger), context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0118 A[SYNTHETIC, Splitter:B:73:0x0118] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0189 A[SYNTHETIC, Splitter:B:86:0x0189] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r(float r10, android.view.View r11) {
        /*
            r9 = this;
            int r0 = r9.k
            int r1 = androidx.constraintlayout.motion.widget.c.e
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0062
            android.view.View r0 = r9.l
            if (r0 != 0) goto L_0x001a
            android.view.ViewParent r0 = r11.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r9.k
            android.view.View r0 = r0.findViewById(r1)
            r9.l = r0
        L_0x001a:
            android.graphics.RectF r0 = r9.w
            android.view.View r1 = r9.l
            boolean r4 = r9.v
            r9.s(r0, r1, r4)
            android.graphics.RectF r0 = r9.x
            boolean r1 = r9.v
            r9.s(r0, r11, r1)
            android.graphics.RectF r0 = r9.w
            android.graphics.RectF r1 = r9.x
            boolean r0 = r0.intersect(r1)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r9.n
            if (r0 == 0) goto L_0x003c
            r9.n = r3
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            boolean r1 = r9.p
            if (r1 == 0) goto L_0x0045
            r9.p = r3
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            r9.o = r2
            r2 = r1
            r1 = 0
            goto L_0x00e0
        L_0x004c:
            boolean r0 = r9.n
            if (r0 != 0) goto L_0x0054
            r9.n = r2
            r0 = 1
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            boolean r1 = r9.o
            if (r1 == 0) goto L_0x005d
            r9.o = r3
            r1 = 1
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            r9.p = r2
            goto L_0x00df
        L_0x0062:
            boolean r0 = r9.n
            r1 = 0
            if (r0 == 0) goto L_0x0078
            float r0 = r9.q
            float r4 = r10 - r0
            float r5 = r9.u
            float r5 = r5 - r0
            float r4 = r4 * r5
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0088
            r9.n = r3
            r0 = 1
            goto L_0x0089
        L_0x0078:
            float r0 = r9.q
            float r0 = r10 - r0
            float r0 = java.lang.Math.abs(r0)
            float r4 = r9.m
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            r9.n = r2
        L_0x0088:
            r0 = 0
        L_0x0089:
            boolean r4 = r9.o
            if (r4 == 0) goto L_0x00a2
            float r4 = r9.q
            float r5 = r10 - r4
            float r6 = r9.u
            float r6 = r6 - r4
            float r6 = r6 * r5
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b2
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b2
            r9.o = r3
            r4 = 1
            goto L_0x00b3
        L_0x00a2:
            float r4 = r9.q
            float r4 = r10 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r9.m
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b2
            r9.o = r2
        L_0x00b2:
            r4 = 0
        L_0x00b3:
            boolean r5 = r9.p
            if (r5 == 0) goto L_0x00ce
            float r5 = r9.q
            float r6 = r10 - r5
            float r7 = r9.u
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x00cb
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cb
            r9.p = r3
            goto L_0x00cc
        L_0x00cb:
            r2 = 0
        L_0x00cc:
            r1 = r4
            goto L_0x00e0
        L_0x00ce:
            float r1 = r9.q
            float r1 = r10 - r1
            float r1 = java.lang.Math.abs(r1)
            float r5 = r9.m
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00de
            r9.p = r2
        L_0x00de:
            r1 = r4
        L_0x00df:
            r2 = 0
        L_0x00e0:
            r9.u = r10
            if (r1 != 0) goto L_0x00e8
            if (r0 != 0) goto L_0x00e8
            if (r2 == 0) goto L_0x00f3
        L_0x00e8:
            android.view.ViewParent r4 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r4 = (androidx.constraintlayout.motion.widget.MotionLayout) r4
            int r5 = r9.j
            r4.c0(r5, r2, r10)
        L_0x00f3:
            int r10 = r9.g
            int r4 = androidx.constraintlayout.motion.widget.c.e
            if (r10 != r4) goto L_0x00fa
            goto L_0x0106
        L_0x00fa:
            android.view.ViewParent r10 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
            int r11 = r9.g
            android.view.View r11 = r10.findViewById(r11)
        L_0x0106:
            java.lang.String r10 = "Could not find method \""
            java.lang.String r4 = "Exception in call \""
            java.lang.String r5 = " "
            java.lang.String r6 = "\"on class "
            if (r1 == 0) goto L_0x017f
            java.lang.String r1 = r9.h
            if (r1 == 0) goto L_0x017f
            java.lang.reflect.Method r1 = r9.s
            if (r1 != 0) goto L_0x014f
            java.lang.Class r1 = r11.getClass()     // Catch:{ NoSuchMethodException -> 0x0127 }
            java.lang.String r7 = r9.h     // Catch:{ NoSuchMethodException -> 0x0127 }
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0127 }
            java.lang.reflect.Method r1 = r1.getMethod(r7, r8)     // Catch:{ NoSuchMethodException -> 0x0127 }
            r9.s = r1     // Catch:{ NoSuchMethodException -> 0x0127 }
            goto L_0x014f
        L_0x0127:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r7 = r9.h
            r1.append(r7)
            r1.append(r6)
            java.lang.Class r7 = r11.getClass()
            java.lang.String r7 = r7.getSimpleName()
            r1.append(r7)
            r1.append(r5)
            java.lang.String r7 = androidx.constraintlayout.motion.widget.a.c(r11)
            r1.append(r7)
            r1.toString()
        L_0x014f:
            java.lang.reflect.Method r1 = r9.s     // Catch:{ Exception -> 0x0157 }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0157 }
            r1.invoke(r11, r7)     // Catch:{ Exception -> 0x0157 }
            goto L_0x017f
        L_0x0157:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r7 = r9.h
            r1.append(r7)
            r1.append(r6)
            java.lang.Class r7 = r11.getClass()
            java.lang.String r7 = r7.getSimpleName()
            r1.append(r7)
            r1.append(r5)
            java.lang.String r7 = androidx.constraintlayout.motion.widget.a.c(r11)
            r1.append(r7)
            r1.toString()
        L_0x017f:
            if (r2 == 0) goto L_0x01f0
            java.lang.String r1 = r9.i
            if (r1 == 0) goto L_0x01f0
            java.lang.reflect.Method r1 = r9.t
            if (r1 != 0) goto L_0x01c0
            java.lang.Class r1 = r11.getClass()     // Catch:{ NoSuchMethodException -> 0x0198 }
            java.lang.String r2 = r9.i     // Catch:{ NoSuchMethodException -> 0x0198 }
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0198 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r7)     // Catch:{ NoSuchMethodException -> 0x0198 }
            r9.t = r1     // Catch:{ NoSuchMethodException -> 0x0198 }
            goto L_0x01c0
        L_0x0198:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r2 = r9.i
            r1.append(r2)
            r1.append(r6)
            java.lang.Class r2 = r11.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = androidx.constraintlayout.motion.widget.a.c(r11)
            r1.append(r2)
            r1.toString()
        L_0x01c0:
            java.lang.reflect.Method r1 = r9.t     // Catch:{ Exception -> 0x01c8 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01c8 }
            r1.invoke(r11, r2)     // Catch:{ Exception -> 0x01c8 }
            goto L_0x01f0
        L_0x01c8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r9.i
            r1.append(r2)
            r1.append(r6)
            java.lang.Class r2 = r11.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = androidx.constraintlayout.motion.widget.a.c(r11)
            r1.append(r2)
            r1.toString()
        L_0x01f0:
            if (r0 == 0) goto L_0x0261
            java.lang.String r0 = r9.f
            if (r0 == 0) goto L_0x0261
            java.lang.reflect.Method r0 = r9.r
            if (r0 != 0) goto L_0x0231
            java.lang.Class r0 = r11.getClass()     // Catch:{ NoSuchMethodException -> 0x0209 }
            java.lang.String r1 = r9.f     // Catch:{ NoSuchMethodException -> 0x0209 }
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0209 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0209 }
            r9.r = r0     // Catch:{ NoSuchMethodException -> 0x0209 }
            goto L_0x0231
        L_0x0209:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = r9.f
            r0.append(r10)
            r0.append(r6)
            java.lang.Class r10 = r11.getClass()
            java.lang.String r10 = r10.getSimpleName()
            r0.append(r10)
            r0.append(r5)
            java.lang.String r10 = androidx.constraintlayout.motion.widget.a.c(r11)
            r0.append(r10)
            r0.toString()
        L_0x0231:
            java.lang.reflect.Method r10 = r9.r     // Catch:{ Exception -> 0x0239 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0239 }
            r10.invoke(r11, r0)     // Catch:{ Exception -> 0x0239 }
            goto L_0x0261
        L_0x0239:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            java.lang.String r0 = r9.f
            r10.append(r0)
            r10.append(r6)
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r10.append(r0)
            r10.append(r5)
            java.lang.String r11 = androidx.constraintlayout.motion.widget.a.c(r11)
            r10.append(r11)
            r10.toString()
        L_0x0261:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.l.r(float, android.view.View):void");
    }
}
