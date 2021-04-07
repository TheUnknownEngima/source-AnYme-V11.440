package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R$id;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.c;
import androidx.constraintlayout.widget.e;
import com.github.mikephil.charting.utils.Utils;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class q {
    /* access modifiers changed from: private */
    public final MotionLayout a;
    e b = null;
    b c = null;
    private boolean d = false;
    private ArrayList<b> e = new ArrayList<>();
    private b f = null;
    private ArrayList<b> g = new ArrayList<>();
    /* access modifiers changed from: private */
    public SparseArray<c> h = new SparseArray<>();
    private HashMap<String, Integer> i = new HashMap<>();
    private SparseIntArray j = new SparseIntArray();
    private boolean k = false;
    /* access modifiers changed from: private */
    public int l = 100;
    /* access modifiers changed from: private */
    public int m = 0;
    private MotionEvent n;
    private boolean o = false;
    private MotionLayout.e p;
    private boolean q;
    float r;
    float s;

    class a implements Interpolator {
        final /* synthetic */ l0 a;

        a(q qVar, l0 l0Var) {
            this.a = l0Var;
        }

        public float getInterpolation(float f) {
            return (float) this.a.a((double) f);
        }
    }

    public static class b {
        /* access modifiers changed from: private */
        public int a = -1;
        /* access modifiers changed from: private */
        public boolean b = false;
        /* access modifiers changed from: private */
        public int c = -1;
        /* access modifiers changed from: private */
        public int d = -1;
        /* access modifiers changed from: private */
        public int e = 0;
        /* access modifiers changed from: private */
        public String f = null;
        /* access modifiers changed from: private */
        public int g = -1;
        /* access modifiers changed from: private */
        public int h = 400;
        /* access modifiers changed from: private */
        public float i = Utils.FLOAT_EPSILON;
        /* access modifiers changed from: private */
        public final q j;
        /* access modifiers changed from: private */
        public ArrayList<h> k = new ArrayList<>();
        /* access modifiers changed from: private */
        public t l = null;
        /* access modifiers changed from: private */
        public ArrayList<a> m = new ArrayList<>();
        /* access modifiers changed from: private */
        public int n = 0;
        /* access modifiers changed from: private */
        public boolean o = false;
        /* access modifiers changed from: private */
        public int p = -1;
        private int q = 0;

        static class a implements View.OnClickListener {
            private final b e;
            int f = -1;
            int g = 17;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.e = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == R$styleable.OnClick_targetId) {
                        this.f = obtainStyledAttributes.getResourceId(index, this.f);
                    } else if (index == R$styleable.OnClick_clickAction) {
                        this.g = obtainStyledAttributes.getInt(index, this.g);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            public void a(MotionLayout motionLayout, int i, b bVar) {
                int i2 = this.f;
                View view = motionLayout;
                if (i2 != -1) {
                    view = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    "OnClick could not find id " + this.f;
                    return;
                }
                int c = bVar.d;
                int a = bVar.c;
                if (c == -1) {
                    view.setOnClickListener(this);
                    return;
                }
                boolean z = true;
                boolean z2 = ((this.g & 1) != 0 && i == c) | ((this.g & 1) != 0 && i == c) | ((this.g & 256) != 0 && i == c) | ((this.g & 16) != 0 && i == a);
                if ((this.g & 4096) == 0 || i != a) {
                    z = false;
                }
                if (z2 || z) {
                    view.setOnClickListener(this);
                }
            }

            /* access modifiers changed from: package-private */
            public boolean b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.e;
                if (bVar2 == bVar) {
                    return true;
                }
                int a = bVar2.c;
                int c = this.e.d;
                int i = motionLayout.B;
                return c == -1 ? i != a : i == c || i == a;
            }

            public void c(MotionLayout motionLayout) {
                View findViewById = motionLayout.findViewById(this.f);
                if (findViewById == null) {
                    " (*)  could not find id " + this.f;
                    return;
                }
                findViewById.setOnClickListener((View.OnClickListener) null);
            }

            public void onClick(View view) {
                float f2;
                MotionLayout c = this.e.j.a;
                if (c.i0()) {
                    if (this.e.d == -1) {
                        int currentState = c.getCurrentState();
                        if (currentState == -1) {
                            c.s0(this.e.c);
                            return;
                        }
                        b bVar = new b(this.e.j, this.e);
                        int unused = bVar.d = currentState;
                        int unused2 = bVar.c = this.e.c;
                        c.setTransition(bVar);
                        c.q0();
                        return;
                    }
                    b bVar2 = this.e.j.c;
                    int i = this.g;
                    boolean z = false;
                    boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                    int i2 = this.g;
                    boolean z3 = ((i2 & 16) == 0 && (i2 & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        b bVar3 = this.e.j.c;
                        b bVar4 = this.e;
                        if (bVar3 != bVar4) {
                            c.setTransition(bVar4);
                        }
                        if (c.getCurrentState() != c.getEndState() && c.getProgress() <= 0.5f) {
                            z = z2;
                            z3 = false;
                        }
                    } else {
                        z = z2;
                    }
                    if (!b(bVar2, c)) {
                        return;
                    }
                    if (z && (this.g & 1) != 0) {
                        c.setTransition(this.e);
                        c.q0();
                    } else if (!z3 || (this.g & 16) == 0) {
                        if (z && (this.g & 256) != 0) {
                            c.setTransition(this.e);
                            f2 = 1.0f;
                        } else if (z3 && (this.g & 4096) != 0) {
                            c.setTransition(this.e);
                            f2 = Utils.FLOAT_EPSILON;
                        } else {
                            return;
                        }
                        c.setProgress(f2);
                    } else {
                        c.setTransition(this.e);
                        c.r0();
                    }
                }
            }
        }

        b(q qVar, Context context, XmlPullParser xmlPullParser) {
            this.h = qVar.l;
            this.q = qVar.m;
            this.j = qVar;
            w(qVar, context, Xml.asAttributeSet(xmlPullParser));
        }

        b(q qVar, b bVar) {
            this.j = qVar;
            if (bVar != null) {
                this.p = bVar.p;
                this.e = bVar.e;
                this.f = bVar.f;
                this.g = bVar.g;
                this.h = bVar.h;
                this.k = bVar.k;
                this.i = bVar.i;
                this.q = bVar.q;
            }
        }

        private void v(q qVar, Context context, TypedArray typedArray) {
            c cVar;
            SparseArray b2;
            int i2;
            int indexCount = typedArray.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArray.getIndex(i3);
                if (index == R$styleable.Transition_constraintSetEnd) {
                    this.c = typedArray.getResourceId(index, this.c);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.c))) {
                        cVar = new c();
                        cVar.w(context, this.c);
                        b2 = qVar.h;
                        i2 = this.c;
                    }
                } else {
                    if (index == R$styleable.Transition_constraintSetStart) {
                        this.d = typedArray.getResourceId(index, this.d);
                        if ("layout".equals(context.getResources().getResourceTypeName(this.d))) {
                            cVar = new c();
                            cVar.w(context, this.d);
                            b2 = qVar.h;
                            i2 = this.d;
                        }
                    } else if (index == R$styleable.Transition_motionInterpolator) {
                        int i4 = typedArray.peekValue(index).type;
                        if (i4 == 1) {
                            int resourceId = typedArray.getResourceId(index, -1);
                            this.g = resourceId;
                            if (resourceId == -1) {
                            }
                        } else if (i4 == 3) {
                            String string = typedArray.getString(index);
                            this.f = string;
                            if (string.indexOf("/") > 0) {
                                this.g = typedArray.getResourceId(index, -1);
                            } else {
                                this.e = -1;
                            }
                        } else {
                            this.e = typedArray.getInteger(index, this.e);
                        }
                        this.e = -2;
                    } else if (index == R$styleable.Transition_duration) {
                        this.h = typedArray.getInt(index, this.h);
                    } else if (index == R$styleable.Transition_staggered) {
                        this.i = typedArray.getFloat(index, this.i);
                    } else if (index == R$styleable.Transition_autoTransition) {
                        this.n = typedArray.getInteger(index, this.n);
                    } else if (index == R$styleable.Transition_android_id) {
                        this.a = typedArray.getResourceId(index, this.a);
                    } else if (index == R$styleable.Transition_transitionDisable) {
                        this.o = typedArray.getBoolean(index, this.o);
                    } else if (index == R$styleable.Transition_pathMotionArc) {
                        this.p = typedArray.getInteger(index, -1);
                    } else if (index == R$styleable.Transition_layoutDuringTransition) {
                        this.q = typedArray.getInteger(index, 0);
                    }
                }
                b2.append(i2, cVar);
            }
            if (this.d == -1) {
                this.b = true;
            }
        }

        private void w(q qVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Transition);
            v(qVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public int A() {
            return this.d;
        }

        public t B() {
            return this.l;
        }

        public boolean C() {
            return !this.o;
        }

        public void D(int i2) {
            this.h = i2;
        }

        public void t(Context context, XmlPullParser xmlPullParser) {
            this.m.add(new a(context, this, xmlPullParser));
        }

        public String u(Context context) {
            String resourceEntryName = this.d == -1 ? "null" : context.getResources().getResourceEntryName(this.d);
            if (this.c == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.c);
        }

        public int x() {
            return this.h;
        }

        public int y() {
            return this.c;
        }

        public int z() {
            return this.q;
        }
    }

    q(Context context, MotionLayout motionLayout, int i2) {
        this.a = motionLayout;
        C(context, i2);
        this.h.put(R$id.motion_base, new c());
        this.i.put("motion_base", Integer.valueOf(R$id.motion_base));
    }

    private boolean A(int i2) {
        int i3 = this.j.get(i2);
        int size = this.j.size();
        while (i3 > 0) {
            if (i3 == i2) {
                return true;
            }
            int i4 = size - 1;
            if (size < 0) {
                return true;
            }
            i3 = this.j.get(i3);
            size = i4;
        }
        return false;
    }

    private boolean B() {
        return this.p != null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void C(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r0 = r0.getXml(r10)
            r1 = 0
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
        L_0x000d:
            r3 = 1
            if (r2 == r3) goto L_0x014b
            if (r2 == 0) goto L_0x0139
            r4 = 2
            if (r2 == r4) goto L_0x0017
            goto L_0x013c
        L_0x0017:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            boolean r5 = r8.k     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            if (r5 == 0) goto L_0x0035
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            java.lang.String r7 = "parsing = "
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            java.lang.String r6 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r5.println(r6)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
        L_0x0035:
            int r5 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r6 = -1
            switch(r5) {
                case -1349929691: goto L_0x0079;
                case -1239391468: goto L_0x006f;
                case 269306229: goto L_0x0066;
                case 312750793: goto L_0x005c;
                case 327855227: goto L_0x0052;
                case 793277014: goto L_0x0048;
                case 1382829617: goto L_0x003e;
                default: goto L_0x003d;
            }     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
        L_0x003d:
            goto L_0x0083
        L_0x003e:
            java.lang.String r3 = "StateSet"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            if (r3 == 0) goto L_0x0083
            r3 = 4
            goto L_0x0084
        L_0x0048:
            java.lang.String r3 = "MotionScene"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            if (r3 == 0) goto L_0x0083
            r3 = 0
            goto L_0x0084
        L_0x0052:
            java.lang.String r3 = "OnSwipe"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            if (r3 == 0) goto L_0x0083
            r3 = 2
            goto L_0x0084
        L_0x005c:
            java.lang.String r3 = "OnClick"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            if (r3 == 0) goto L_0x0083
            r3 = 3
            goto L_0x0084
        L_0x0066:
            java.lang.String r4 = "Transition"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            if (r4 == 0) goto L_0x0083
            goto L_0x0084
        L_0x006f:
            java.lang.String r3 = "KeyFrameSet"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            if (r3 == 0) goto L_0x0083
            r3 = 6
            goto L_0x0084
        L_0x0079:
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            if (r3 == 0) goto L_0x0083
            r3 = 5
            goto L_0x0084
        L_0x0083:
            r3 = -1
        L_0x0084:
            switch(r3) {
                case 0: goto L_0x0124;
                case 1: goto L_0x00e0;
                case 2: goto L_0x00aa;
                case 3: goto L_0x00a5;
                case 4: goto L_0x009c;
                case 5: goto L_0x0097;
                case 6: goto L_0x0089;
                default: goto L_0x0087;
            }     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
        L_0x0087:
            goto L_0x0128
        L_0x0089:
            androidx.constraintlayout.motion.widget.h r2 = new androidx.constraintlayout.motion.widget.h     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r2.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            java.util.ArrayList r3 = r1.k     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r3.add(r2)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            goto L_0x013c
        L_0x0097:
            r8.D(r9, r0)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            goto L_0x013c
        L_0x009c:
            androidx.constraintlayout.widget.e r2 = new androidx.constraintlayout.widget.e     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r2.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r8.b = r2     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            goto L_0x013c
        L_0x00a5:
            r1.t(r9, r0)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            goto L_0x013c
        L_0x00aa:
            if (r1 != 0) goto L_0x00d5
            android.content.res.Resources r2 = r9.getResources()     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            java.lang.String r2 = r2.getResourceEntryName(r10)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            int r3 = r0.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            java.lang.String r5 = " OnSwipe ("
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            java.lang.String r2 = ".xml:"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r4.append(r3)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            java.lang.String r2 = ")"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r4.toString()     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
        L_0x00d5:
            androidx.constraintlayout.motion.widget.t r2 = new androidx.constraintlayout.motion.widget.t     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r8.a     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r2.<init>(r9, r3, r0)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            androidx.constraintlayout.motion.widget.t unused = r1.l = r2     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            goto L_0x013c
        L_0x00e0:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r1 = r8.e     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            androidx.constraintlayout.motion.widget.q$b r2 = new androidx.constraintlayout.motion.widget.q$b     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r2.<init>(r8, r9, r0)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            androidx.constraintlayout.motion.widget.q$b r1 = r8.c     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            if (r1 != 0) goto L_0x0109
            boolean r1 = r2.b     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            if (r1 != 0) goto L_0x0109
            r8.c = r2     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            if (r2 == 0) goto L_0x0109
            androidx.constraintlayout.motion.widget.t r1 = r2.l     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            if (r1 == 0) goto L_0x0109
            androidx.constraintlayout.motion.widget.q$b r1 = r8.c     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            androidx.constraintlayout.motion.widget.t r1 = r1.l     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            boolean r3 = r8.q     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r1.p(r3)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
        L_0x0109:
            boolean r1 = r2.b     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            if (r1 == 0) goto L_0x0122
            int r1 = r2.c     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            if (r1 != r6) goto L_0x0118
            r8.f = r2     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            goto L_0x011d
        L_0x0118:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r1 = r8.g     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
        L_0x011d:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r1 = r8.e     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r1.remove(r2)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
        L_0x0122:
            r1 = r2
            goto L_0x013c
        L_0x0124:
            r8.E(r9, r0)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            goto L_0x013c
        L_0x0128:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            java.lang.String r4 = "WARNING UNKNOWN ATTRIBUTE "
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            r3.toString()     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            goto L_0x013c
        L_0x0139:
            r0.getName()     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
        L_0x013c:
            int r2 = r0.next()     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x0142 }
            goto L_0x000d
        L_0x0142:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x014b
        L_0x0147:
            r9 = move-exception
            r9.printStackTrace()
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.q.C(android.content.Context, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void D(android.content.Context r14, org.xmlpull.v1.XmlPullParser r15) {
        /*
            r13 = this;
            androidx.constraintlayout.widget.c r0 = new androidx.constraintlayout.widget.c
            r0.<init>()
            r1 = 0
            r0.C(r1)
            int r2 = r15.getAttributeCount()
            r3 = -1
            r4 = 0
            r5 = -1
            r6 = -1
        L_0x0011:
            r7 = 1
            if (r4 >= r2) goto L_0x0077
            java.lang.String r8 = r15.getAttributeName(r4)
            java.lang.String r9 = r15.getAttributeValue(r4)
            boolean r10 = r13.k
            if (r10 == 0) goto L_0x0036
            java.io.PrintStream r10 = java.lang.System.out
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "id string = "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            r10.println(r11)
        L_0x0036:
            int r10 = r8.hashCode()
            r11 = -1496482599(0xffffffffa6cd7cd9, float:-1.4258573E-15)
            if (r10 == r11) goto L_0x004e
            r11 = 3355(0xd1b, float:4.701E-42)
            if (r10 == r11) goto L_0x0044
            goto L_0x0058
        L_0x0044:
            java.lang.String r10 = "id"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0058
            r8 = 0
            goto L_0x0059
        L_0x004e:
            java.lang.String r10 = "deriveConstraintsFrom"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0058
            r8 = 1
            goto L_0x0059
        L_0x0058:
            r8 = -1
        L_0x0059:
            if (r8 == 0) goto L_0x0063
            if (r8 == r7) goto L_0x005e
            goto L_0x0074
        L_0x005e:
            int r6 = r13.o(r14, r9)
            goto L_0x0074
        L_0x0063:
            int r5 = r13.o(r14, r9)
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r13.i
            java.lang.String r8 = P(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.put(r8, r9)
        L_0x0074:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0077:
            if (r5 == r3) goto L_0x0091
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.a
            int r1 = r1.S
            if (r1 == 0) goto L_0x0082
            r0.D(r7)
        L_0x0082:
            r0.x(r14, r15)
            if (r6 == r3) goto L_0x008c
            android.util.SparseIntArray r14 = r13.j
            r14.put(r5, r6)
        L_0x008c:
            android.util.SparseArray<androidx.constraintlayout.widget.c> r14 = r13.h
            r14.put(r5, r0)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.q.D(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    private void E(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == R$styleable.MotionScene_defaultDuration) {
                this.l = obtainStyledAttributes.getInt(index, this.l);
            } else if (index == R$styleable.MotionScene_layoutDuringTransition) {
                this.m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void I(int i2) {
        int i3 = this.j.get(i2);
        if (i3 > 0) {
            I(this.j.get(i2));
            this.h.get(i2).B(this.h.get(i3));
            this.j.put(i2, -1);
        }
    }

    public static String P(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        return indexOf < 0 ? str : str.substring(indexOf + 1);
    }

    private int o(Context context, String str) {
        int i2;
        if (str.contains("/")) {
            i2 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.k) {
                PrintStream printStream = System.out;
                printStream.println("id getMap res = " + i2);
            }
        } else {
            i2 = -1;
        }
        return (i2 != -1 || str == null || str.length() <= 1) ? i2 : Integer.parseInt(str.substring(1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.c(r3, -1, -1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int v(int r3) {
        /*
            r2 = this;
            androidx.constraintlayout.widget.e r0 = r2.b
            if (r0 == 0) goto L_0x000c
            r1 = -1
            int r0 = r0.c(r3, r1, r1)
            if (r0 == r1) goto L_0x000c
            return r0
        L_0x000c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.q.v(int):int");
    }

    /* access modifiers changed from: package-private */
    public void F(float f2, float f3) {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            this.c.l.m(f2, f3);
        }
    }

    /* access modifiers changed from: package-private */
    public void G(float f2, float f3) {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            this.c.l.n(f2, f3);
        }
    }

    /* access modifiers changed from: package-private */
    public void H(MotionEvent motionEvent, int i2, MotionLayout motionLayout) {
        MotionLayout.e eVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.p == null) {
            this.p = this.a.j0();
        }
        this.p.b(motionEvent);
        if (i2 != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.r = motionEvent.getRawX();
                this.s = motionEvent.getRawY();
                this.n = motionEvent;
                if (this.c.l != null) {
                    RectF e2 = this.c.l.e(this.a, rectF);
                    if (e2 == null || e2.contains(this.n.getX(), this.n.getY())) {
                        RectF j2 = this.c.l.j(this.a, rectF);
                        if (j2 == null || j2.contains(this.n.getX(), this.n.getY())) {
                            this.o = false;
                        } else {
                            this.o = true;
                        }
                        this.c.l.o(this.r, this.s);
                        return;
                    }
                    this.n = null;
                    return;
                }
                return;
            } else if (action == 2) {
                float rawY = motionEvent.getRawY() - this.s;
                float rawX = motionEvent.getRawX() - this.r;
                if ((((double) rawX) != Utils.DOUBLE_EPSILON || ((double) rawY) != Utils.DOUBLE_EPSILON) && (motionEvent2 = this.n) != null) {
                    b g2 = g(i2, rawX, rawY, motionEvent2);
                    if (g2 != null) {
                        motionLayout.setTransition(g2);
                        RectF j3 = this.c.l.j(this.a, rectF);
                        if (j3 != null && !j3.contains(this.n.getX(), this.n.getY())) {
                            z = true;
                        }
                        this.o = z;
                        this.c.l.q(this.r, this.s);
                    }
                } else {
                    return;
                }
            }
        }
        b bVar = this.c;
        if (!(bVar == null || bVar.l == null || this.o)) {
            this.c.l.l(motionEvent, this.p, i2, this);
        }
        this.r = motionEvent.getRawX();
        this.s = motionEvent.getRawY();
        if (motionEvent.getAction() == 1 && (eVar = this.p) != null) {
            eVar.a();
            this.p = null;
            int i3 = motionLayout.B;
            if (i3 != -1) {
                f(motionLayout, i3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void J(MotionLayout motionLayout) {
        int i2 = 0;
        while (i2 < this.h.size()) {
            int keyAt = this.h.keyAt(i2);
            if (!A(keyAt)) {
                I(keyAt);
                i2++;
            } else {
                return;
            }
        }
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            this.h.valueAt(i3).A(motionLayout);
        }
    }

    public void K(int i2) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.D(i2);
        } else {
            this.l = i2;
        }
    }

    public void L(boolean z) {
        this.q = z;
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            this.c.l.p(this.q);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void M(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.e r0 = r6.b
            r1 = -1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.c(r7, r1, r1)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r7
        L_0x000d:
            androidx.constraintlayout.widget.e r2 = r6.b
            int r2 = r2.c(r8, r1, r1)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r7
        L_0x0017:
            r2 = r8
        L_0x0018:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r3 = r6.e
            java.util.Iterator r3 = r3.iterator()
        L_0x001e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0058
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.q$b r4 = (androidx.constraintlayout.motion.widget.q.b) r4
            int r5 = r4.c
            if (r5 != r2) goto L_0x0036
            int r5 = r4.d
            if (r5 == r0) goto L_0x0042
        L_0x0036:
            int r5 = r4.c
            if (r5 != r8) goto L_0x001e
            int r5 = r4.d
            if (r5 != r7) goto L_0x001e
        L_0x0042:
            r6.c = r4
            if (r4 == 0) goto L_0x0057
            androidx.constraintlayout.motion.widget.t r7 = r4.l
            if (r7 == 0) goto L_0x0057
            androidx.constraintlayout.motion.widget.q$b r7 = r6.c
            androidx.constraintlayout.motion.widget.t r7 = r7.l
            boolean r8 = r6.q
            r7.p(r8)
        L_0x0057:
            return
        L_0x0058:
            androidx.constraintlayout.motion.widget.q$b r7 = r6.f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r3 = r6.g
            java.util.Iterator r3 = r3.iterator()
        L_0x0060:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0074
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.q$b r4 = (androidx.constraintlayout.motion.widget.q.b) r4
            int r5 = r4.c
            if (r5 != r8) goto L_0x0060
            r7 = r4
            goto L_0x0060
        L_0x0074:
            androidx.constraintlayout.motion.widget.q$b r8 = new androidx.constraintlayout.motion.widget.q$b
            r8.<init>(r6, r7)
            int unused = r8.d = r0
            int unused = r8.c = r2
            if (r0 == r1) goto L_0x0086
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r7 = r6.e
            r7.add(r8)
        L_0x0086:
            r6.c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.q.M(int, int):void");
    }

    public void N(b bVar) {
        this.c = bVar;
        if (bVar != null && bVar.l != null) {
            this.c.l.p(this.q);
        }
    }

    /* access modifiers changed from: package-private */
    public void O() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            this.c.l.r();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Q() {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            if (it.next().l != null) {
                return true;
            }
        }
        b bVar = this.c;
        return (bVar == null || bVar.l == null) ? false : true;
    }

    public void e(MotionLayout motionLayout, int i2) {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.m.size() > 0) {
                Iterator it2 = next.m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it3 = this.g.iterator();
        while (it3.hasNext()) {
            b next2 = it3.next();
            if (next2.m.size() > 0) {
                Iterator it4 = next2.m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it5 = this.e.iterator();
        while (it5.hasNext()) {
            b next3 = it5.next();
            if (next3.m.size() > 0) {
                Iterator it6 = next3.m.iterator();
                while (it6.hasNext()) {
                    ((b.a) it6.next()).a(motionLayout, i2, next3);
                }
            }
        }
        Iterator<b> it7 = this.g.iterator();
        while (it7.hasNext()) {
            b next4 = it7.next();
            if (next4.m.size() > 0) {
                Iterator it8 = next4.m.iterator();
                while (it8.hasNext()) {
                    ((b.a) it8.next()).a(motionLayout, i2, next4);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean f(MotionLayout motionLayout, int i2) {
        if (B() || this.d) {
            return false;
        }
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.n != 0) {
                if (i2 == next.d && (next.n == 4 || next.n == 2)) {
                    motionLayout.setTransition(next);
                    if (next.n == 4) {
                        motionLayout.q0();
                    } else {
                        motionLayout.setProgress(1.0f);
                    }
                    return true;
                } else if (i2 == next.c && (next.n == 3 || next.n == 1)) {
                    motionLayout.setTransition(next);
                    if (next.n == 3) {
                        motionLayout.r0();
                    } else {
                        motionLayout.setProgress(Utils.FLOAT_EPSILON);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public b g(int i2, float f2, float f3, MotionEvent motionEvent) {
        RectF j2;
        if (i2 == -1) {
            return this.c;
        }
        List<b> z = z(i2);
        float f4 = Utils.FLOAT_EPSILON;
        b bVar = null;
        RectF rectF = new RectF();
        for (b next : z) {
            if (!next.o && next.l != null) {
                next.l.p(this.q);
                RectF j3 = next.l.j(this.a, rectF);
                if ((j3 == null || motionEvent == null || j3.contains(motionEvent.getX(), motionEvent.getY())) && ((j2 = next.l.j(this.a, rectF)) == null || motionEvent == null || j2.contains(motionEvent.getX(), motionEvent.getY()))) {
                    float a2 = next.l.a(f2, f3) * (next.c == i2 ? -1.0f : 1.1f);
                    if (a2 > f4) {
                        bVar = next;
                        f4 = a2;
                    }
                }
            }
        }
        return bVar;
    }

    public int h() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.p;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public c i(int i2) {
        return j(i2, -1, -1);
    }

    /* access modifiers changed from: package-private */
    public c j(int i2, int i3, int i4) {
        Object obj;
        int c2;
        if (this.k) {
            System.out.println("id " + i2);
            System.out.println("size " + this.h.size());
        }
        e eVar = this.b;
        if (!(eVar == null || (c2 = eVar.c(i2, i3, i4)) == -1)) {
            i2 = c2;
        }
        if (this.h.get(i2) == null) {
            "Warning could not find ConstraintSet id/" + a.b(this.a.getContext(), i2) + " In MotionScene";
            SparseArray sparseArray = this.h;
            obj = sparseArray.get(sparseArray.keyAt(0));
        } else {
            obj = this.h.get(i2);
        }
        return (c) obj;
    }

    public int[] k() {
        int size = this.h.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.h.keyAt(i2);
        }
        return iArr;
    }

    public ArrayList<b> l() {
        return this.e;
    }

    public int m() {
        b bVar = this.c;
        return bVar != null ? bVar.h : this.l;
    }

    /* access modifiers changed from: package-private */
    public int n() {
        b bVar = this.c;
        if (bVar == null) {
            return -1;
        }
        return bVar.c;
    }

    public Interpolator p() {
        int g2 = this.c.e;
        if (g2 == -2) {
            return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
        }
        if (g2 == -1) {
            return new a(this, l0.c(this.c.f));
        }
        if (g2 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (g2 == 1) {
            return new AccelerateInterpolator();
        }
        if (g2 == 2) {
            return new DecelerateInterpolator();
        }
        if (g2 == 4) {
            return new AnticipateInterpolator();
        }
        if (g2 != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    public void q(n nVar) {
        b bVar = this.c;
        if (bVar == null) {
            b bVar2 = this.f;
            if (bVar2 != null) {
                Iterator it = bVar2.k.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).a(nVar);
                }
                return;
            }
            return;
        }
        Iterator it2 = bVar.k.iterator();
        while (it2.hasNext()) {
            ((h) it2.next()).a(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    public float r() {
        b bVar = this.c;
        return (bVar == null || bVar.l == null) ? Utils.FLOAT_EPSILON : this.c.l.f();
    }

    /* access modifiers changed from: package-private */
    public float s() {
        b bVar = this.c;
        return (bVar == null || bVar.l == null) ? Utils.FLOAT_EPSILON : this.c.l.g();
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return false;
        }
        return this.c.l.h();
    }

    /* access modifiers changed from: package-private */
    public float u(float f2, float f3) {
        b bVar = this.c;
        return (bVar == null || bVar.l == null) ? Utils.FLOAT_EPSILON : this.c.l.i(f2, f3);
    }

    public float w() {
        b bVar = this.c;
        return bVar != null ? bVar.i : Utils.FLOAT_EPSILON;
    }

    /* access modifiers changed from: package-private */
    public int x() {
        b bVar = this.c;
        if (bVar == null) {
            return -1;
        }
        return bVar.d;
    }

    public b y(int i2) {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.a == i2) {
                return next;
            }
        }
        return null;
    }

    public List<b> z(int i2) {
        int v = v(i2);
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.d == v || next.c == v) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
