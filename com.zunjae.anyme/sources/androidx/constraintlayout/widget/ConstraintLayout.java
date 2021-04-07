package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;
import defpackage.o1;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    SparseArray<View> e = new SparseArray<>();
    /* access modifiers changed from: private */
    public ArrayList<ConstraintHelper> f = new ArrayList<>(4);
    /* access modifiers changed from: protected */
    public f1 g = new f1();
    private int h = 0;
    private int i = 0;
    private int j = Integer.MAX_VALUE;
    private int k = Integer.MAX_VALUE;
    protected boolean l = true;
    private int m = 7;
    private c n = null;
    protected b o = null;
    private int p = -1;
    private HashMap<String, Integer> q = new HashMap<>();
    private int r = -1;
    private int s = -1;
    private SparseArray<e1> t = new SparseArray<>();
    b u = new b(this, this);
    /* access modifiers changed from: private */
    public int v = 0;
    /* access modifiers changed from: private */
    public int w = 0;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public float A = 0.5f;
        public String B = null;
        int C = 1;
        public float D = -1.0f;
        public float E = -1.0f;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public float N = 1.0f;
        public float O = 1.0f;
        public int P = -1;
        public int Q = -1;
        public int R = -1;
        public boolean S = false;
        public boolean T = false;
        public String U = null;
        boolean V = true;
        boolean W = true;
        boolean X = false;
        boolean Y = false;
        boolean Z = false;
        public int a = -1;
        boolean a0 = false;
        public int b = -1;
        boolean b0 = false;
        public float c = -1.0f;
        int c0 = -1;
        public int d = -1;
        int d0 = -1;
        public int e = -1;
        int e0 = -1;
        public int f = -1;
        int f0 = -1;
        public int g = -1;
        int g0 = -1;
        public int h = -1;
        int h0 = -1;
        public int i = -1;
        float i0 = 0.5f;
        public int j = -1;
        int j0;
        public int k = -1;
        int k0;
        public int l = -1;
        float l0;
        public int m = -1;
        e1 m0 = new e1();
        public int n = 0;
        public boolean n0;
        public float o = Utils.FLOAT_EPSILON;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public int y = -1;
        public float z = 0.5f;

        private static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                a.append(R$styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                a.append(R$styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                a.append(R$styleable.ConstraintLayout_Layout_android_orientation, 1);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                a.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                a.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                a.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                a.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                a.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                a.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                a.append(R$styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i2;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = a.a.get(index);
                switch (i4) {
                    case 1:
                        this.R = obtainStyledAttributes.getInt(index, this.R);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        break;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        this.o = f2;
                        if (f2 >= Utils.FLOAT_EPSILON) {
                            break;
                        } else {
                            this.o = (360.0f - f2) % 360.0f;
                            break;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.d);
                        this.d = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        break;
                    case 22:
                        this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        break;
                    case 23:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case 24:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 25:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 26:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 27:
                        this.S = obtainStyledAttributes.getBoolean(index, this.S);
                        break;
                    case 28:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 29:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        this.H = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.I = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.J) != -2) {
                                break;
                            } else {
                                this.J = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.L) != -2) {
                                break;
                            } else {
                                this.L = -2;
                                break;
                            }
                        }
                    case 35:
                        this.N = Math.max(Utils.FLOAT_EPSILON, obtainStyledAttributes.getFloat(index, this.N));
                        this.H = 2;
                        break;
                    case 36:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.K) != -2) {
                                break;
                            } else {
                                this.K = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.M) != -2) {
                                break;
                            } else {
                                this.M = -2;
                                break;
                            }
                        }
                    case 38:
                        this.O = Math.max(Utils.FLOAT_EPSILON, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        break;
                    default:
                        switch (i4) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.C = 1;
                                        }
                                        i2 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i2, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > Utils.FLOAT_EPSILON && parseFloat2 > Utils.FLOAT_EPSILON) {
                                                    if (this.C != 1) {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i2);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            Float.parseFloat(substring4);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                break;
                            case 46:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 47:
                                this.F = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.P = obtainStyledAttributes.getDimensionPixelOffset(index, this.P);
                                break;
                            case 50:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case 51:
                                this.U = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            c();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public String a() {
            return this.U;
        }

        public e1 b() {
            return this.m0;
        }

        public void c() {
            this.Y = false;
            this.V = true;
            this.W = true;
            if (this.width == -2 && this.S) {
                this.V = false;
                if (this.H == 0) {
                    this.H = 1;
                }
            }
            if (this.height == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i2 = this.width;
            if (i2 == 0 || i2 == -1) {
                this.V = false;
                if (this.width == 0 && this.H == 1) {
                    this.width = -2;
                    this.S = true;
                }
            }
            int i3 = this.height;
            if (i3 == 0 || i3 == -1) {
                this.W = false;
                if (this.height == 0 && this.I == 1) {
                    this.height = -2;
                    this.T = true;
                }
            }
            if (this.c != -1.0f || this.a != -1 || this.b != -1) {
                this.Y = true;
                this.V = true;
                this.W = true;
                if (!(this.m0 instanceof h1)) {
                    this.m0 = new h1();
                }
                ((h1) this.m0).P0(this.R);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:74:0x00dc, code lost:
            if (r1 > 0) goto L_0x00de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x00eb, code lost:
            if (r1 > 0) goto L_0x00de;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x00f2  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x00fd  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 0
                r4 = 1
                r5 = 17
                if (r2 < r5) goto L_0x0017
                super.resolveLayoutDirection(r7)
                int r7 = r6.getLayoutDirection()
                if (r4 != r7) goto L_0x0017
                r7 = 1
                goto L_0x0018
            L_0x0017:
                r7 = 0
            L_0x0018:
                r2 = -1
                r6.e0 = r2
                r6.f0 = r2
                r6.c0 = r2
                r6.d0 = r2
                r6.g0 = r2
                r6.h0 = r2
                int r5 = r6.t
                r6.g0 = r5
                int r5 = r6.v
                r6.h0 = r5
                float r5 = r6.z
                r6.i0 = r5
                int r5 = r6.a
                r6.j0 = r5
                int r5 = r6.b
                r6.k0 = r5
                float r5 = r6.c
                r6.l0 = r5
                if (r7 == 0) goto L_0x009e
                int r7 = r6.p
                if (r7 == r2) goto L_0x0047
                r6.e0 = r7
            L_0x0045:
                r3 = 1
                goto L_0x004e
            L_0x0047:
                int r7 = r6.q
                if (r7 == r2) goto L_0x004e
                r6.f0 = r7
                goto L_0x0045
            L_0x004e:
                int r7 = r6.r
                if (r7 == r2) goto L_0x0055
                r6.d0 = r7
                r3 = 1
            L_0x0055:
                int r7 = r6.s
                if (r7 == r2) goto L_0x005c
                r6.c0 = r7
                r3 = 1
            L_0x005c:
                int r7 = r6.x
                if (r7 == r2) goto L_0x0062
                r6.h0 = r7
            L_0x0062:
                int r7 = r6.y
                if (r7 == r2) goto L_0x0068
                r6.g0 = r7
            L_0x0068:
                r7 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0072
                float r3 = r6.z
                float r3 = r7 - r3
                r6.i0 = r3
            L_0x0072:
                boolean r3 = r6.Y
                if (r3 == 0) goto L_0x00c2
                int r3 = r6.R
                if (r3 != r4) goto L_0x00c2
                float r3 = r6.c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x008a
                float r7 = r7 - r3
                r6.l0 = r7
                r6.j0 = r2
                r6.k0 = r2
                goto L_0x00c2
            L_0x008a:
                int r7 = r6.a
                if (r7 == r2) goto L_0x0095
                r6.k0 = r7
                r6.j0 = r2
            L_0x0092:
                r6.l0 = r4
                goto L_0x00c2
            L_0x0095:
                int r7 = r6.b
                if (r7 == r2) goto L_0x00c2
                r6.j0 = r7
                r6.k0 = r2
                goto L_0x0092
            L_0x009e:
                int r7 = r6.p
                if (r7 == r2) goto L_0x00a4
                r6.d0 = r7
            L_0x00a4:
                int r7 = r6.q
                if (r7 == r2) goto L_0x00aa
                r6.c0 = r7
            L_0x00aa:
                int r7 = r6.r
                if (r7 == r2) goto L_0x00b0
                r6.e0 = r7
            L_0x00b0:
                int r7 = r6.s
                if (r7 == r2) goto L_0x00b6
                r6.f0 = r7
            L_0x00b6:
                int r7 = r6.x
                if (r7 == r2) goto L_0x00bc
                r6.g0 = r7
            L_0x00bc:
                int r7 = r6.y
                if (r7 == r2) goto L_0x00c2
                r6.h0 = r7
            L_0x00c2:
                int r7 = r6.r
                if (r7 != r2) goto L_0x010a
                int r7 = r6.s
                if (r7 != r2) goto L_0x010a
                int r7 = r6.q
                if (r7 != r2) goto L_0x010a
                int r7 = r6.p
                if (r7 != r2) goto L_0x010a
                int r7 = r6.f
                if (r7 == r2) goto L_0x00e1
                r6.e0 = r7
                int r7 = r6.rightMargin
                if (r7 > 0) goto L_0x00ee
                if (r1 <= 0) goto L_0x00ee
            L_0x00de:
                r6.rightMargin = r1
                goto L_0x00ee
            L_0x00e1:
                int r7 = r6.g
                if (r7 == r2) goto L_0x00ee
                r6.f0 = r7
                int r7 = r6.rightMargin
                if (r7 > 0) goto L_0x00ee
                if (r1 <= 0) goto L_0x00ee
                goto L_0x00de
            L_0x00ee:
                int r7 = r6.d
                if (r7 == r2) goto L_0x00fd
                r6.c0 = r7
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x010a
                if (r0 <= 0) goto L_0x010a
            L_0x00fa:
                r6.leftMargin = r0
                goto L_0x010a
            L_0x00fd:
                int r7 = r6.e
                if (r7 == r2) goto L_0x010a
                r6.d0 = r7
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x010a
                if (r0 <= 0) goto L_0x010a
                goto L_0x00fa
            L_0x010a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                e1$b[] r0 = defpackage.e1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                e1$b r1 = defpackage.e1.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                e1$b r1 = defpackage.e1.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e1$b r1 = defpackage.e1.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e1$b r1 = defpackage.e1.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<clinit>():void");
        }
    }

    class b implements o1.b {
        ConstraintLayout a;

        public b(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
            this.a = constraintLayout2;
        }

        public final void a() {
            int childCount = this.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.a.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).b(this.a);
                }
            }
            int size = this.a.f.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) this.a.f.get(i2)).p(this.a);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0185  */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x0189  */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x0192  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x0197  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x019c  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x01a4  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x01a9  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01ae  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x01b6 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x01db  */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x01f1  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x01f3  */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x01fd  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x01ff  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x0206  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00fb  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00fd  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0104  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0110  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x011c  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0126  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0128  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0131  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0133  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0146 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0163  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x016d  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x017e  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(defpackage.e1 r18, defpackage.o1.a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r18.O()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x0019
                r2.e = r5
                r2.f = r5
                r2.g = r5
                return
            L_0x0019:
                e1$b r3 = r2.a
                e1$b r4 = r2.b
                int r6 = r2.c
                int r7 = r2.d
                androidx.constraintlayout.widget.ConstraintLayout r8 = r0.a
                int r8 = r8.getPaddingTop()
                androidx.constraintlayout.widget.ConstraintLayout r9 = r0.a
                int r9 = r9.getPaddingBottom()
                int r8 = r8 + r9
                androidx.constraintlayout.widget.ConstraintLayout r9 = r0.a
                int r9 = r9.getPaddingWidth()
                int[] r10 = androidx.constraintlayout.widget.ConstraintLayout.a.a
                int r11 = r3.ordinal()
                r10 = r10[r11]
                r11 = 4
                r12 = 3
                r13 = 2
                r15 = -2
                r14 = 1
                if (r10 == r14) goto L_0x0091
                if (r10 == r13) goto L_0x0085
                if (r10 == r12) goto L_0x0074
                if (r10 == r11) goto L_0x004c
                r6 = 0
            L_0x004a:
                r9 = 0
                goto L_0x0098
            L_0x004c:
                androidx.constraintlayout.widget.ConstraintLayout r6 = r0.a
                int r6 = r6.v
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r15)
                int r9 = r1.j
                if (r9 != r14) goto L_0x005c
                r9 = 1
                goto L_0x005d
            L_0x005c:
                r9 = 0
            L_0x005d:
                boolean r10 = r2.j
                if (r10 == 0) goto L_0x008f
                if (r9 == 0) goto L_0x006f
                if (r9 == 0) goto L_0x008f
                int[] r9 = r1.g
                r9 = r9[r5]
                int r10 = r18.P()
                if (r9 == r10) goto L_0x008f
            L_0x006f:
                int r6 = r18.P()
                goto L_0x0091
            L_0x0074:
                androidx.constraintlayout.widget.ConstraintLayout r6 = r0.a
                int r6 = r6.v
                int r10 = r18.z()
                int r9 = r9 + r10
                r10 = -1
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r10)
                goto L_0x004a
            L_0x0085:
                androidx.constraintlayout.widget.ConstraintLayout r6 = r0.a
                int r6 = r6.v
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r15)
            L_0x008f:
                r9 = 1
                goto L_0x0098
            L_0x0091:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                goto L_0x004a
            L_0x0098:
                int[] r10 = androidx.constraintlayout.widget.ConstraintLayout.a.a
                int r16 = r4.ordinal()
                r10 = r10[r16]
                if (r10 == r14) goto L_0x00f0
                if (r10 == r13) goto L_0x00e4
                if (r10 == r12) goto L_0x00d3
                if (r10 == r11) goto L_0x00ab
                r7 = 0
            L_0x00a9:
                r8 = 0
                goto L_0x00f7
            L_0x00ab:
                androidx.constraintlayout.widget.ConstraintLayout r7 = r0.a
                int r7 = r7.w
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r15)
                int r8 = r1.k
                if (r8 != r14) goto L_0x00bb
                r8 = 1
                goto L_0x00bc
            L_0x00bb:
                r8 = 0
            L_0x00bc:
                boolean r10 = r2.j
                if (r10 == 0) goto L_0x00ee
                if (r8 == 0) goto L_0x00ce
                if (r8 == 0) goto L_0x00ee
                int[] r8 = r1.g
                r8 = r8[r14]
                int r10 = r18.v()
                if (r8 == r10) goto L_0x00ee
            L_0x00ce:
                int r7 = r18.v()
                goto L_0x00f0
            L_0x00d3:
                androidx.constraintlayout.widget.ConstraintLayout r7 = r0.a
                int r7 = r7.w
                int r10 = r18.N()
                int r8 = r8 + r10
                r10 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r10)
                goto L_0x00a9
            L_0x00e4:
                androidx.constraintlayout.widget.ConstraintLayout r7 = r0.a
                int r7 = r7.w
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r15)
            L_0x00ee:
                r8 = 1
                goto L_0x00f7
            L_0x00f0:
                r8 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
                goto L_0x00a9
            L_0x00f7:
                e1$b r10 = defpackage.e1.b.MATCH_CONSTRAINT
                if (r3 != r10) goto L_0x00fd
                r10 = 1
                goto L_0x00fe
            L_0x00fd:
                r10 = 0
            L_0x00fe:
                e1$b r11 = defpackage.e1.b.MATCH_CONSTRAINT
                if (r4 != r11) goto L_0x0104
                r11 = 1
                goto L_0x0105
            L_0x0104:
                r11 = 0
            L_0x0105:
                e1$b r12 = defpackage.e1.b.MATCH_PARENT
                if (r4 == r12) goto L_0x0110
                e1$b r12 = defpackage.e1.b.FIXED
                if (r4 != r12) goto L_0x010e
                goto L_0x0110
            L_0x010e:
                r4 = 0
                goto L_0x0111
            L_0x0110:
                r4 = 1
            L_0x0111:
                e1$b r12 = defpackage.e1.b.MATCH_PARENT
                if (r3 == r12) goto L_0x011c
                e1$b r12 = defpackage.e1.b.FIXED
                if (r3 != r12) goto L_0x011a
                goto L_0x011c
            L_0x011a:
                r3 = 0
                goto L_0x011d
            L_0x011c:
                r3 = 1
            L_0x011d:
                r12 = 0
                if (r10 == 0) goto L_0x0128
                float r13 = r1.O
                int r13 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
                if (r13 <= 0) goto L_0x0128
                r13 = 1
                goto L_0x0129
            L_0x0128:
                r13 = 0
            L_0x0129:
                if (r11 == 0) goto L_0x0133
                float r15 = r1.O
                int r12 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
                if (r12 <= 0) goto L_0x0133
                r12 = 1
                goto L_0x0134
            L_0x0133:
                r12 = 0
            L_0x0134:
                java.lang.Object r15 = r18.q()
                android.view.View r15 = (android.view.View) r15
                android.view.ViewGroup$LayoutParams r16 = r15.getLayoutParams()
                r14 = r16
                androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r14 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r14
                boolean r5 = r2.j
                if (r5 != 0) goto L_0x015b
                if (r10 == 0) goto L_0x015b
                int r5 = r1.j
                if (r5 != 0) goto L_0x015b
                if (r11 == 0) goto L_0x015b
                int r5 = r1.k
                if (r5 == 0) goto L_0x0153
                goto L_0x015b
            L_0x0153:
                r0 = -1
                r8 = 0
                r9 = 0
                r11 = 0
                r16 = 0
                goto L_0x01ef
            L_0x015b:
                boolean r5 = r15 instanceof androidx.constraintlayout.widget.VirtualLayout
                if (r5 == 0) goto L_0x016d
                boolean r5 = r1 instanceof defpackage.l1
                if (r5 == 0) goto L_0x016d
                r5 = r1
                l1 r5 = (defpackage.l1) r5
                r10 = r15
                androidx.constraintlayout.widget.VirtualLayout r10 = (androidx.constraintlayout.widget.VirtualLayout) r10
                r10.u(r5, r6, r7)
                goto L_0x0170
            L_0x016d:
                r15.measure(r6, r7)
            L_0x0170:
                int r5 = r15.getMeasuredWidth()
                int r10 = r15.getMeasuredHeight()
                int r11 = r15.getBaseline()
                if (r9 == 0) goto L_0x0185
                int[] r9 = r1.g
                r16 = 0
                r9[r16] = r5
                goto L_0x0187
            L_0x0185:
                r16 = 0
            L_0x0187:
                if (r8 == 0) goto L_0x018e
                int[] r8 = r1.g
                r9 = 1
                r8[r9] = r10
            L_0x018e:
                int r8 = r1.m
                if (r8 <= 0) goto L_0x0197
                int r8 = java.lang.Math.max(r8, r5)
                goto L_0x0198
            L_0x0197:
                r8 = r5
            L_0x0198:
                int r9 = r1.n
                if (r9 <= 0) goto L_0x01a0
                int r8 = java.lang.Math.min(r9, r8)
            L_0x01a0:
                int r9 = r1.p
                if (r9 <= 0) goto L_0x01a9
                int r9 = java.lang.Math.max(r9, r10)
                goto L_0x01aa
            L_0x01a9:
                r9 = r10
            L_0x01aa:
                int r0 = r1.q
                if (r0 <= 0) goto L_0x01b2
                int r9 = java.lang.Math.min(r0, r9)
            L_0x01b2:
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r13 == 0) goto L_0x01c0
                if (r4 == 0) goto L_0x01c0
                float r3 = r1.O
                float r4 = (float) r9
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r8 = (int) r4
                goto L_0x01ca
            L_0x01c0:
                if (r12 == 0) goto L_0x01ca
                if (r3 == 0) goto L_0x01ca
                float r3 = r1.O
                float r4 = (float) r8
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r9 = (int) r4
            L_0x01ca:
                if (r5 != r8) goto L_0x01d1
                if (r10 == r9) goto L_0x01cf
                goto L_0x01d1
            L_0x01cf:
                r0 = -1
                goto L_0x01ef
            L_0x01d1:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r5 == r8) goto L_0x01d9
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L_0x01d9:
                if (r10 == r9) goto L_0x01df
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r0)
            L_0x01df:
                r15.measure(r6, r7)
                int r8 = r15.getMeasuredWidth()
                int r9 = r15.getMeasuredHeight()
                int r11 = r15.getBaseline()
                goto L_0x01cf
            L_0x01ef:
                if (r11 == r0) goto L_0x01f3
                r0 = 1
                goto L_0x01f4
            L_0x01f3:
                r0 = 0
            L_0x01f4:
                int r3 = r2.c
                if (r8 != r3) goto L_0x01ff
                int r3 = r2.d
                if (r9 == r3) goto L_0x01fd
                goto L_0x01ff
            L_0x01fd:
                r5 = 0
                goto L_0x0200
            L_0x01ff:
                r5 = 1
            L_0x0200:
                r2.i = r5
                boolean r3 = r14.X
                if (r3 == 0) goto L_0x0207
                r0 = 1
            L_0x0207:
                if (r0 == 0) goto L_0x0215
                r3 = -1
                if (r11 == r3) goto L_0x0215
                int r1 = r18.n()
                if (r1 == r11) goto L_0x0215
                r1 = 1
                r2.i = r1
            L_0x0215:
                r2.e = r8
                r2.f = r9
                r2.h = r0
                r2.g = r11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.b(e1, o1$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        s(attributeSet, i2, 0);
    }

    private boolean B() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            } else if (getChildAt(i2).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            y();
        }
        return z;
    }

    /* access modifiers changed from: private */
    public int getPaddingWidth() {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingStart = Build.VERSION.SDK_INT >= 17 ? getPaddingStart() + getPaddingEnd() : 0;
        return paddingStart > 0 ? paddingStart : paddingLeft;
    }

    private final e1 p(int i2) {
        if (i2 == 0) {
            return this.g;
        }
        View view = this.e.get(i2);
        if (view == null && (view = findViewById(i2)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.g;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).m0;
    }

    private void s(AttributeSet attributeSet, int i2, int i3) {
        this.g.b0(this);
        this.g.e1(this.u);
        this.e.put(getId(), this);
        this.n = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout, i2, i3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == R$styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.j = obtainStyledAttributes.getDimensionPixelOffset(index, this.j);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.k = obtainStyledAttributes.getDimensionPixelOffset(index, this.k);
                } else if (index == R$styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.m = obtainStyledAttributes.getInt(index, this.m);
                } else if (index == R$styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            v(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.o = null;
                        }
                    }
                } else if (index == R$styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar = new c();
                        this.n = cVar;
                        cVar.w(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.n = null;
                    }
                    this.p = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.g.f1(this.m);
    }

    private void u() {
        this.l = true;
        this.r = -1;
        this.s = -1;
    }

    private void y() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            e1 r2 = r(getChildAt(i2));
            if (r2 != null) {
                r2.X();
            }
        }
        if (isInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    z(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    p(childAt.getId()).c0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.p != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2.getId() == this.p && (childAt2 instanceof Constraints)) {
                    this.n = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        c cVar = this.n;
        if (cVar != null) {
            cVar.f(this, true);
        }
        this.g.L0();
        int size = this.f.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.f.get(i5).s(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt3 = getChildAt(i6);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).c(this);
            }
        }
        this.t.clear();
        this.t.put(0, this.g);
        this.t.put(getId(), this.g);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            this.t.put(childAt4.getId(), r(childAt4));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt5 = getChildAt(i8);
            e1 r3 = r(childAt5);
            if (r3 != null) {
                this.g.a(r3);
                g(isInEditMode, childAt5, r3, (LayoutParams) childAt5.getLayoutParams(), this.t);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r3 == 0) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r3 == 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r3 == 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r3 == 0) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A(defpackage.f1 r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            int r0 = r7.getPaddingTop()
            int r1 = r7.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = r7.getPaddingWidth()
            e1$b r2 = defpackage.e1.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L_0x002f
            if (r9 == 0) goto L_0x002a
            if (r9 == r4) goto L_0x0021
            r9 = r2
        L_0x001f:
            r10 = 0
            goto L_0x0039
        L_0x0021:
            int r9 = r7.j
            int r9 = r9 - r1
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L_0x0039
        L_0x002a:
            e1$b r9 = defpackage.e1.b.WRAP_CONTENT
            if (r3 != 0) goto L_0x001f
            goto L_0x0033
        L_0x002f:
            e1$b r9 = defpackage.e1.b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0039
        L_0x0033:
            int r10 = r7.h
            int r10 = java.lang.Math.max(r6, r10)
        L_0x0039:
            if (r11 == r5) goto L_0x004e
            if (r11 == 0) goto L_0x0049
            if (r11 == r4) goto L_0x0041
        L_0x003f:
            r12 = 0
            goto L_0x0058
        L_0x0041:
            int r11 = r7.k
            int r11 = r11 - r0
            int r12 = java.lang.Math.min(r11, r12)
            goto L_0x0058
        L_0x0049:
            e1$b r2 = defpackage.e1.b.WRAP_CONTENT
            if (r3 != 0) goto L_0x003f
            goto L_0x0052
        L_0x004e:
            e1$b r2 = defpackage.e1.b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0058
        L_0x0052:
            int r11 = r7.i
            int r12 = java.lang.Math.max(r6, r11)
        L_0x0058:
            int r11 = r8.P()
            if (r10 != r11) goto L_0x0064
            int r11 = r8.v()
            if (r12 == r11) goto L_0x0067
        L_0x0064:
            r8.X0()
        L_0x0067:
            r8.D0(r6)
            r8.E0(r6)
            int r11 = r7.j
            int r11 = r11 - r1
            r8.q0(r11)
            int r11 = r7.k
            int r11 = r11 - r0
            r8.p0(r11)
            r8.s0(r6)
            r8.r0(r6)
            r8.k0(r9)
            r8.C0(r10)
            r8.y0(r2)
            r8.g0(r12)
            int r9 = r7.h
            int r9 = r9 - r1
            r8.s0(r9)
            int r9 = r7.i
            int r9 = r9 - r0
            r8.r0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.A(f1, int, int, int, int):void");
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f.get(i2).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i5 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = (float) i4;
                        float f3 = (float) (i4 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f4 = (float) i5;
                        float f5 = f2;
                        float f6 = f2;
                        float f7 = f4;
                        Paint paint2 = paint;
                        float f8 = f3;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f5, f7, f8, f4, paint3);
                        float parseInt4 = (float) (i5 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f9 = f3;
                        float f10 = parseInt4;
                        canvas2.drawLine(f9, f7, f8, f10, paint3);
                        float f11 = parseInt4;
                        float f12 = f6;
                        canvas2.drawLine(f9, f11, f12, f10, paint3);
                        float f13 = f6;
                        canvas2.drawLine(f13, f11, f12, f4, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f14 = f3;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f13, f4, f14, parseInt4, paint6);
                        canvas2.drawLine(f13, parseInt4, f14, f4, paint6);
                    }
                }
            }
        }
    }

    public void forceLayout() {
        u();
        super.forceLayout();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(boolean r20, android.view.View r21, defpackage.e1 r22, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r23, android.util.SparseArray<defpackage.e1> r24) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r23.c()
            r10 = 0
            r8.n0 = r10
            int r2 = r21.getVisibility()
            r7.B0(r2)
            boolean r2 = r8.a0
            r11 = 1
            if (r2 == 0) goto L_0x0024
            r7.n0(r11)
            r2 = 8
            r7.B0(r2)
        L_0x0024:
            r7.b0(r1)
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r2 == 0) goto L_0x0036
            androidx.constraintlayout.widget.ConstraintHelper r1 = (androidx.constraintlayout.widget.ConstraintHelper) r1
            f1 r2 = r0.g
            boolean r2 = r2.Z0()
            r1.n(r7, r2)
        L_0x0036:
            boolean r1 = r8.Y
            r2 = 17
            r12 = -1
            if (r1 == 0) goto L_0x0069
            r1 = r7
            h1 r1 = (defpackage.h1) r1
            int r3 = r8.j0
            int r4 = r8.k0
            float r5 = r8.l0
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 >= r2) goto L_0x0050
            int r3 = r8.a
            int r4 = r8.b
            float r5 = r8.c
        L_0x0050:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x005b
            r1.O0(r5)
            goto L_0x02c0
        L_0x005b:
            if (r3 == r12) goto L_0x0062
            r1.M0(r3)
            goto L_0x02c0
        L_0x0062:
            if (r4 == r12) goto L_0x02c0
            r1.N0(r4)
            goto L_0x02c0
        L_0x0069:
            int r1 = r8.c0
            int r3 = r8.d0
            int r4 = r8.e0
            int r5 = r8.f0
            int r6 = r8.g0
            int r13 = r8.h0
            float r14 = r8.i0
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 >= r2) goto L_0x00b1
            int r1 = r8.d
            int r2 = r8.e
            int r4 = r8.f
            int r5 = r8.g
            int r3 = r8.t
            int r6 = r8.v
            float r14 = r8.z
            if (r1 != r12) goto L_0x0098
            if (r2 != r12) goto L_0x0098
            int r13 = r8.q
            if (r13 == r12) goto L_0x0093
            r1 = r13
            goto L_0x0098
        L_0x0093:
            int r13 = r8.p
            if (r13 == r12) goto L_0x0098
            r2 = r13
        L_0x0098:
            if (r4 != r12) goto L_0x00ac
            if (r5 != r12) goto L_0x00ac
            int r13 = r8.r
            if (r13 == r12) goto L_0x00a1
            goto L_0x00ad
        L_0x00a1:
            int r13 = r8.s
            if (r13 == r12) goto L_0x00ac
            r15 = r6
            r5 = r14
            r6 = r3
            r14 = r13
            r3 = r2
            r13 = r4
            goto L_0x00b8
        L_0x00ac:
            r13 = r4
        L_0x00ad:
            r15 = r6
            r6 = r3
            r3 = r2
            goto L_0x00b3
        L_0x00b1:
            r15 = r13
            r13 = r4
        L_0x00b3:
            r18 = r14
            r14 = r5
            r5 = r18
        L_0x00b8:
            int r2 = r8.m
            if (r2 == r12) goto L_0x00cd
            java.lang.Object r1 = r9.get(r2)
            e1 r1 = (defpackage.e1) r1
            if (r1 == 0) goto L_0x01f3
            float r2 = r8.o
            int r3 = r8.n
            r7.j(r1, r2, r3)
            goto L_0x01f3
        L_0x00cd:
            if (r1 == r12) goto L_0x00e9
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            e1 r3 = (defpackage.e1) r3
            if (r3 == 0) goto L_0x00e6
            d1$b r4 = defpackage.d1.b.LEFT
            int r2 = r8.leftMargin
            r1 = r22
            r16 = r2
            r2 = r4
            r17 = r5
            r5 = r16
            goto L_0x00fe
        L_0x00e6:
            r17 = r5
            goto L_0x0101
        L_0x00e9:
            r17 = r5
            if (r3 == r12) goto L_0x0101
            java.lang.Object r1 = r9.get(r3)
            r3 = r1
            e1 r3 = (defpackage.e1) r3
            if (r3 == 0) goto L_0x0101
            d1$b r2 = defpackage.d1.b.LEFT
            d1$b r4 = defpackage.d1.b.RIGHT
            int r5 = r8.leftMargin
            r1 = r22
        L_0x00fe:
            r1.T(r2, r3, r4, r5, r6)
        L_0x0101:
            if (r13 == r12) goto L_0x0115
            java.lang.Object r1 = r9.get(r13)
            r3 = r1
            e1 r3 = (defpackage.e1) r3
            if (r3 == 0) goto L_0x012b
            d1$b r2 = defpackage.d1.b.RIGHT
            d1$b r4 = defpackage.d1.b.LEFT
            int r5 = r8.rightMargin
            r1 = r22
            goto L_0x0127
        L_0x0115:
            if (r14 == r12) goto L_0x012b
            java.lang.Object r1 = r9.get(r14)
            r3 = r1
            e1 r3 = (defpackage.e1) r3
            if (r3 == 0) goto L_0x012b
            d1$b r4 = defpackage.d1.b.RIGHT
            int r5 = r8.rightMargin
            r1 = r22
            r2 = r4
        L_0x0127:
            r6 = r15
            r1.T(r2, r3, r4, r5, r6)
        L_0x012b:
            int r1 = r8.h
            if (r1 == r12) goto L_0x0142
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            e1 r3 = (defpackage.e1) r3
            if (r3 == 0) goto L_0x015c
            d1$b r4 = defpackage.d1.b.TOP
            int r5 = r8.topMargin
            int r6 = r8.u
            r1 = r22
            r2 = r4
            goto L_0x0159
        L_0x0142:
            int r1 = r8.i
            if (r1 == r12) goto L_0x015c
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            e1 r3 = (defpackage.e1) r3
            if (r3 == 0) goto L_0x015c
            d1$b r2 = defpackage.d1.b.TOP
            d1$b r4 = defpackage.d1.b.BOTTOM
            int r5 = r8.topMargin
            int r6 = r8.u
            r1 = r22
        L_0x0159:
            r1.T(r2, r3, r4, r5, r6)
        L_0x015c:
            int r1 = r8.j
            if (r1 == r12) goto L_0x0174
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            e1 r3 = (defpackage.e1) r3
            if (r3 == 0) goto L_0x018d
            d1$b r2 = defpackage.d1.b.BOTTOM
            d1$b r4 = defpackage.d1.b.TOP
            int r5 = r8.bottomMargin
            int r6 = r8.w
            r1 = r22
            goto L_0x018a
        L_0x0174:
            int r1 = r8.k
            if (r1 == r12) goto L_0x018d
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            e1 r3 = (defpackage.e1) r3
            if (r3 == 0) goto L_0x018d
            d1$b r4 = defpackage.d1.b.BOTTOM
            int r5 = r8.bottomMargin
            int r6 = r8.w
            r1 = r22
            r2 = r4
        L_0x018a:
            r1.T(r2, r3, r4, r5, r6)
        L_0x018d:
            int r1 = r8.l
            if (r1 == r12) goto L_0x01e0
            android.util.SparseArray<android.view.View> r2 = r0.e
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r8.l
            java.lang.Object r2 = r9.get(r2)
            e1 r2 = (defpackage.e1) r2
            if (r2 == 0) goto L_0x01e0
            if (r1 == 0) goto L_0x01e0
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r3 == 0) goto L_0x01e0
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            r8.X = r11
            r1.X = r11
            d1$b r3 = defpackage.d1.b.BASELINE
            d1 r3 = r7.m(r3)
            d1$b r4 = defpackage.d1.b.BASELINE
            d1 r2 = r2.m(r4)
            r3.b(r2, r10, r12, r11)
            r7.f0(r11)
            e1 r1 = r1.m0
            r1.f0(r11)
            d1$b r1 = defpackage.d1.b.TOP
            d1 r1 = r7.m(r1)
            r1.k()
            d1$b r1 = defpackage.d1.b.BOTTOM
            d1 r1 = r7.m(r1)
            r1.k()
        L_0x01e0:
            r1 = 0
            r14 = r17
            int r2 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x01ea
            r7.h0(r14)
        L_0x01ea:
            float r2 = r8.A
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x01f3
            r7.v0(r2)
        L_0x01f3:
            if (r20 == 0) goto L_0x0204
            int r1 = r8.P
            if (r1 != r12) goto L_0x01fd
            int r1 = r8.Q
            if (r1 == r12) goto L_0x0204
        L_0x01fd:
            int r1 = r8.P
            int r2 = r8.Q
            r7.t0(r1, r2)
        L_0x0204:
            boolean r1 = r8.V
            r2 = -2
            if (r1 != 0) goto L_0x0237
            int r1 = r8.width
            if (r1 != r12) goto L_0x022e
            boolean r1 = r8.S
            if (r1 == 0) goto L_0x0214
            e1$b r1 = defpackage.e1.b.MATCH_CONSTRAINT
            goto L_0x0216
        L_0x0214:
            e1$b r1 = defpackage.e1.b.MATCH_PARENT
        L_0x0216:
            r7.k0(r1)
            d1$b r1 = defpackage.d1.b.LEFT
            d1 r1 = r7.m(r1)
            int r3 = r8.leftMargin
            r1.d = r3
            d1$b r1 = defpackage.d1.b.RIGHT
            d1 r1 = r7.m(r1)
            int r3 = r8.rightMargin
            r1.d = r3
            goto L_0x024a
        L_0x022e:
            e1$b r1 = defpackage.e1.b.MATCH_CONSTRAINT
            r7.k0(r1)
            r7.C0(r10)
            goto L_0x024a
        L_0x0237:
            e1$b r1 = defpackage.e1.b.FIXED
            r7.k0(r1)
            int r1 = r8.width
            r7.C0(r1)
            int r1 = r8.width
            if (r1 != r2) goto L_0x024a
            e1$b r1 = defpackage.e1.b.WRAP_CONTENT
            r7.k0(r1)
        L_0x024a:
            boolean r1 = r8.W
            if (r1 != 0) goto L_0x027c
            int r1 = r8.height
            if (r1 != r12) goto L_0x0273
            boolean r1 = r8.T
            if (r1 == 0) goto L_0x0259
            e1$b r1 = defpackage.e1.b.MATCH_CONSTRAINT
            goto L_0x025b
        L_0x0259:
            e1$b r1 = defpackage.e1.b.MATCH_PARENT
        L_0x025b:
            r7.y0(r1)
            d1$b r1 = defpackage.d1.b.TOP
            d1 r1 = r7.m(r1)
            int r2 = r8.topMargin
            r1.d = r2
            d1$b r1 = defpackage.d1.b.BOTTOM
            d1 r1 = r7.m(r1)
            int r2 = r8.bottomMargin
            r1.d = r2
            goto L_0x028f
        L_0x0273:
            e1$b r1 = defpackage.e1.b.MATCH_CONSTRAINT
            r7.y0(r1)
            r7.g0(r10)
            goto L_0x028f
        L_0x027c:
            e1$b r1 = defpackage.e1.b.FIXED
            r7.y0(r1)
            int r1 = r8.height
            r7.g0(r1)
            int r1 = r8.height
            if (r1 != r2) goto L_0x028f
            e1$b r1 = defpackage.e1.b.WRAP_CONTENT
            r7.y0(r1)
        L_0x028f:
            java.lang.String r1 = r8.B
            if (r1 == 0) goto L_0x0296
            r7.d0(r1)
        L_0x0296:
            float r1 = r8.D
            r7.m0(r1)
            float r1 = r8.E
            r7.A0(r1)
            int r1 = r8.F
            r7.i0(r1)
            int r1 = r8.G
            r7.w0(r1)
            int r1 = r8.H
            int r2 = r8.J
            int r3 = r8.L
            float r4 = r8.N
            r7.l0(r1, r2, r3, r4)
            int r1 = r8.I
            int r2 = r8.K
            int r3 = r8.M
            float r4 = r8.O
            r7.z0(r1, r2, r3, r4)
        L_0x02c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.g(boolean, android.view.View, e1, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getMaxHeight() {
        return this.k;
    }

    public int getMaxWidth() {
        return this.j;
    }

    public int getMinHeight() {
        return this.i;
    }

    public int getMinWidth() {
        return this.h;
    }

    public int getOptimizationLevel() {
        return this.g.U0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: i */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public Object j(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.q;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.q.get(str);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            e1 e1Var = layoutParams.m0;
            if ((childAt.getVisibility() != 8 || layoutParams.Y || layoutParams.Z || layoutParams.b0 || isInEditMode) && !layoutParams.a0) {
                int Q = e1Var.Q();
                int R = e1Var.R();
                int P = e1Var.P() + Q;
                int v2 = e1Var.v() + R;
                childAt.layout(Q, R, P, v2);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(Q, R, P, v2);
                }
            }
        }
        int size = this.f.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f.get(i7).o(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        this.v = i2;
        this.w = i3;
        this.g.g1(t());
        if (this.l) {
            this.l = false;
            if (B()) {
                this.g.i1();
            }
        }
        x(this.g, this.m, i2, i3);
        w(i2, i3, this.g.P(), this.g.v(), this.g.a1(), this.g.Y0());
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        e1 r2 = r(view);
        if ((view instanceof Guideline) && !(r2 instanceof h1)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            h1 h1Var = new h1();
            layoutParams.m0 = h1Var;
            layoutParams.Y = true;
            h1Var.P0(layoutParams.R);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.t();
            ((LayoutParams) view.getLayoutParams()).Z = true;
            if (!this.f.contains(constraintHelper)) {
                this.f.add(constraintHelper);
            }
        }
        this.e.put(view.getId(), view);
        this.l = true;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.e.remove(view.getId());
        this.g.K0(r(view));
        this.f.remove(view);
        this.l = true;
    }

    public View q(int i2) {
        return this.e.get(i2);
    }

    public final e1 r(View view) {
        if (view == this) {
            return this.g;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).m0;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        u();
        super.requestLayout();
    }

    public void setConstraintSet(c cVar) {
        this.n = cVar;
    }

    public void setId(int i2) {
        this.e.remove(getId());
        super.setId(i2);
        this.e.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 != this.k) {
            this.k = i2;
            requestLayout();
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 != this.j) {
            this.j = i2;
            requestLayout();
        }
    }

    public void setMinHeight(int i2) {
        if (i2 != this.i) {
            this.i = i2;
            requestLayout();
        }
    }

    public void setMinWidth(int i2) {
        if (i2 != this.h) {
            this.h = i2;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(d dVar) {
        b bVar = this.o;
        if (bVar != null) {
            bVar.c(dVar);
        }
    }

    public void setOptimizationLevel(int i2) {
        this.m = i2;
        this.g.f1(i2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean t() {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    /* access modifiers changed from: protected */
    public void v(int i2) {
        this.o = new b(getContext(), this, i2);
    }

    /* access modifiers changed from: protected */
    public void w(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingWidth = i4 + getPaddingWidth();
        int i6 = i5 + paddingTop;
        if (Build.VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = ViewGroup.resolveSizeAndState(paddingWidth, i2, 0);
            int min = Math.min(this.j, resolveSizeAndState & 16777215);
            int min2 = Math.min(this.k, ViewGroup.resolveSizeAndState(i6, i3, 0) & 16777215);
            if (z) {
                min |= 16777216;
            }
            if (z2) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            this.r = min;
            this.s = min2;
            return;
        }
        setMeasuredDimension(paddingWidth, i6);
        this.r = paddingWidth;
        this.s = i6;
    }

    /* access modifiers changed from: protected */
    public void x(f1 f1Var, int i2, int i3, int i4) {
        int i5;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int paddingTop = getPaddingTop();
        int paddingBottom = paddingTop + getPaddingBottom();
        int paddingWidth = getPaddingWidth();
        if (Build.VERSION.SDK_INT >= 17) {
            i5 = getPaddingStart();
            int paddingEnd = getPaddingEnd();
            if (i5 > 0 || paddingEnd > 0) {
                if (t()) {
                    i5 = paddingEnd;
                }
                int i6 = size - paddingWidth;
                int i7 = size2 - paddingBottom;
                A(f1Var, mode, i6, mode2, i7);
                f1 f1Var2 = f1Var;
                int i8 = i2;
                f1Var2.b1(i8, mode, i6, mode2, i7, this.r, this.s, i5, paddingTop);
            }
        }
        i5 = getPaddingLeft();
        int i62 = size - paddingWidth;
        int i72 = size2 - paddingBottom;
        A(f1Var, mode, i62, mode2, i72);
        f1 f1Var22 = f1Var;
        int i82 = i2;
        f1Var22.b1(i82, mode, i62, mode2, i72, this.r, this.s, i5, paddingTop);
    }

    public void z(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.q == null) {
                this.q = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.q.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }
}
