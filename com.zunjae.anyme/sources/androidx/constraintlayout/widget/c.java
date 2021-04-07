package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

public class c {
    /* access modifiers changed from: private */
    public static final int[] d = {0, 4, 8};
    private static SparseIntArray e;
    private HashMap<String, a> a = new HashMap<>();
    private boolean b = true;
    private HashMap<Integer, a> c = new HashMap<>();

    public static class a {
        int a;
        public final d b = new d();
        public final C0016c c = new C0016c();
        public final b d = new b();
        public final e e = new e();
        public HashMap<String, a> f = new HashMap<>();

        /* access modifiers changed from: private */
        public void f(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.a = i;
            b bVar = this.d;
            bVar.h = layoutParams.d;
            bVar.i = layoutParams.e;
            bVar.j = layoutParams.f;
            bVar.k = layoutParams.g;
            bVar.l = layoutParams.h;
            bVar.m = layoutParams.i;
            bVar.n = layoutParams.j;
            bVar.o = layoutParams.k;
            bVar.p = layoutParams.l;
            bVar.q = layoutParams.p;
            bVar.r = layoutParams.q;
            bVar.s = layoutParams.r;
            bVar.t = layoutParams.s;
            bVar.u = layoutParams.z;
            bVar.v = layoutParams.A;
            bVar.w = layoutParams.B;
            bVar.x = layoutParams.m;
            bVar.y = layoutParams.n;
            bVar.z = layoutParams.o;
            bVar.A = layoutParams.P;
            bVar.B = layoutParams.Q;
            bVar.C = layoutParams.R;
            bVar.g = layoutParams.c;
            bVar.e = layoutParams.a;
            bVar.f = layoutParams.b;
            bVar.c = layoutParams.width;
            bVar.d = layoutParams.height;
            bVar.D = layoutParams.leftMargin;
            bVar.E = layoutParams.rightMargin;
            bVar.F = layoutParams.topMargin;
            bVar.G = layoutParams.bottomMargin;
            bVar.P = layoutParams.E;
            bVar.Q = layoutParams.D;
            bVar.S = layoutParams.G;
            bVar.R = layoutParams.F;
            bVar.h0 = layoutParams.S;
            bVar.i0 = layoutParams.T;
            bVar.T = layoutParams.H;
            bVar.U = layoutParams.I;
            bVar.V = layoutParams.L;
            bVar.W = layoutParams.M;
            bVar.X = layoutParams.J;
            bVar.Y = layoutParams.K;
            bVar.Z = layoutParams.N;
            bVar.a0 = layoutParams.O;
            bVar.g0 = layoutParams.U;
            bVar.K = layoutParams.u;
            bVar.M = layoutParams.w;
            bVar.J = layoutParams.t;
            bVar.L = layoutParams.v;
            bVar.O = layoutParams.x;
            bVar.N = layoutParams.y;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.H = layoutParams.getMarginEnd();
                this.d.I = layoutParams.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        public void g(int i, Constraints.LayoutParams layoutParams) {
            f(i, layoutParams);
            this.b.d = layoutParams.o0;
            e eVar = this.e;
            eVar.b = layoutParams.r0;
            eVar.c = layoutParams.s0;
            eVar.d = layoutParams.t0;
            eVar.e = layoutParams.u0;
            eVar.f = layoutParams.v0;
            eVar.g = layoutParams.w0;
            eVar.h = layoutParams.x0;
            eVar.i = layoutParams.y0;
            eVar.j = layoutParams.z0;
            eVar.k = layoutParams.A0;
            eVar.m = layoutParams.q0;
            eVar.l = layoutParams.p0;
        }

        /* access modifiers changed from: private */
        public void h(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            g(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                b bVar = this.d;
                bVar.d0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.b0 = barrier.getType();
                this.d.e0 = barrier.getReferencedIds();
                this.d.c0 = barrier.getMargin();
            }
        }

        public void d(ConstraintLayout.LayoutParams layoutParams) {
            b bVar = this.d;
            layoutParams.d = bVar.h;
            layoutParams.e = bVar.i;
            layoutParams.f = bVar.j;
            layoutParams.g = bVar.k;
            layoutParams.h = bVar.l;
            layoutParams.i = bVar.m;
            layoutParams.j = bVar.n;
            layoutParams.k = bVar.o;
            layoutParams.l = bVar.p;
            layoutParams.p = bVar.q;
            layoutParams.q = bVar.r;
            layoutParams.r = bVar.s;
            layoutParams.s = bVar.t;
            layoutParams.leftMargin = bVar.D;
            layoutParams.rightMargin = bVar.E;
            layoutParams.topMargin = bVar.F;
            layoutParams.bottomMargin = bVar.G;
            layoutParams.x = bVar.O;
            layoutParams.y = bVar.N;
            layoutParams.u = bVar.K;
            layoutParams.w = bVar.M;
            layoutParams.z = bVar.u;
            layoutParams.A = bVar.v;
            layoutParams.m = bVar.x;
            layoutParams.n = bVar.y;
            layoutParams.o = bVar.z;
            layoutParams.B = bVar.w;
            layoutParams.P = bVar.A;
            layoutParams.Q = bVar.B;
            layoutParams.E = bVar.P;
            layoutParams.D = bVar.Q;
            layoutParams.G = bVar.S;
            layoutParams.F = bVar.R;
            layoutParams.S = bVar.h0;
            layoutParams.T = bVar.i0;
            layoutParams.H = bVar.T;
            layoutParams.I = bVar.U;
            layoutParams.L = bVar.V;
            layoutParams.M = bVar.W;
            layoutParams.J = bVar.X;
            layoutParams.K = bVar.Y;
            layoutParams.N = bVar.Z;
            layoutParams.O = bVar.a0;
            layoutParams.R = bVar.C;
            layoutParams.c = bVar.g;
            layoutParams.a = bVar.e;
            layoutParams.b = bVar.f;
            layoutParams.width = bVar.c;
            layoutParams.height = bVar.d;
            String str = bVar.g0;
            if (str != null) {
                layoutParams.U = str;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.d.I);
                layoutParams.setMarginEnd(this.d.H);
            }
            layoutParams.c();
        }

        /* renamed from: e */
        public a clone() {
            a aVar = new a();
            aVar.d.a(this.d);
            aVar.c.a(this.c);
            aVar.b.a(this.b);
            aVar.e.a(this.e);
            aVar.a = this.a;
            return aVar;
        }
    }

    public static class b {
        private static SparseIntArray k0;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;
        public boolean a = false;
        public float a0 = 1.0f;
        public boolean b = false;
        public int b0 = -1;
        public int c;
        public int c0 = 0;
        public int d;
        public int d0 = -1;
        public int e = -1;
        public int[] e0;
        public int f = -1;
        public String f0;
        public float g = -1.0f;
        public String g0;
        public int h = -1;
        public boolean h0 = false;
        public int i = -1;
        public boolean i0 = false;
        public int j = -1;
        public boolean j0 = true;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public float u = 0.5f;
        public float v = 0.5f;
        public String w = null;
        public int x = -1;
        public int y = 0;
        public float z = Utils.FLOAT_EPSILON;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            k0 = sparseIntArray;
            sparseIntArray.append(R$styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            k0.append(R$styleable.Layout_layout_constraintLeft_toRightOf, 25);
            k0.append(R$styleable.Layout_layout_constraintRight_toLeftOf, 28);
            k0.append(R$styleable.Layout_layout_constraintRight_toRightOf, 29);
            k0.append(R$styleable.Layout_layout_constraintTop_toTopOf, 35);
            k0.append(R$styleable.Layout_layout_constraintTop_toBottomOf, 34);
            k0.append(R$styleable.Layout_layout_constraintBottom_toTopOf, 4);
            k0.append(R$styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            k0.append(R$styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            k0.append(R$styleable.Layout_layout_editor_absoluteX, 6);
            k0.append(R$styleable.Layout_layout_editor_absoluteY, 7);
            k0.append(R$styleable.Layout_layout_constraintGuide_begin, 17);
            k0.append(R$styleable.Layout_layout_constraintGuide_end, 18);
            k0.append(R$styleable.Layout_layout_constraintGuide_percent, 19);
            k0.append(R$styleable.Layout_android_orientation, 26);
            k0.append(R$styleable.Layout_layout_constraintStart_toEndOf, 31);
            k0.append(R$styleable.Layout_layout_constraintStart_toStartOf, 32);
            k0.append(R$styleable.Layout_layout_constraintEnd_toStartOf, 10);
            k0.append(R$styleable.Layout_layout_constraintEnd_toEndOf, 9);
            k0.append(R$styleable.Layout_layout_goneMarginLeft, 13);
            k0.append(R$styleable.Layout_layout_goneMarginTop, 16);
            k0.append(R$styleable.Layout_layout_goneMarginRight, 14);
            k0.append(R$styleable.Layout_layout_goneMarginBottom, 11);
            k0.append(R$styleable.Layout_layout_goneMarginStart, 15);
            k0.append(R$styleable.Layout_layout_goneMarginEnd, 12);
            k0.append(R$styleable.Layout_layout_constraintVertical_weight, 38);
            k0.append(R$styleable.Layout_layout_constraintHorizontal_weight, 37);
            k0.append(R$styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            k0.append(R$styleable.Layout_layout_constraintVertical_chainStyle, 40);
            k0.append(R$styleable.Layout_layout_constraintHorizontal_bias, 20);
            k0.append(R$styleable.Layout_layout_constraintVertical_bias, 36);
            k0.append(R$styleable.Layout_layout_constraintDimensionRatio, 5);
            k0.append(R$styleable.Layout_layout_constraintLeft_creator, 76);
            k0.append(R$styleable.Layout_layout_constraintTop_creator, 76);
            k0.append(R$styleable.Layout_layout_constraintRight_creator, 76);
            k0.append(R$styleable.Layout_layout_constraintBottom_creator, 76);
            k0.append(R$styleable.Layout_layout_constraintBaseline_creator, 76);
            k0.append(R$styleable.Layout_android_layout_marginLeft, 23);
            k0.append(R$styleable.Layout_android_layout_marginRight, 27);
            k0.append(R$styleable.Layout_android_layout_marginStart, 30);
            k0.append(R$styleable.Layout_android_layout_marginEnd, 8);
            k0.append(R$styleable.Layout_android_layout_marginTop, 33);
            k0.append(R$styleable.Layout_android_layout_marginBottom, 2);
            k0.append(R$styleable.Layout_android_layout_width, 22);
            k0.append(R$styleable.Layout_android_layout_height, 21);
            k0.append(R$styleable.Layout_layout_constraintCircle, 61);
            k0.append(R$styleable.Layout_layout_constraintCircleRadius, 62);
            k0.append(R$styleable.Layout_layout_constraintCircleAngle, 63);
            k0.append(R$styleable.Layout_layout_constraintWidth_percent, 69);
            k0.append(R$styleable.Layout_layout_constraintHeight_percent, 70);
            k0.append(R$styleable.Layout_chainUseRtl, 71);
            k0.append(R$styleable.Layout_barrierDirection, 72);
            k0.append(R$styleable.Layout_barrierMargin, 73);
            k0.append(R$styleable.Layout_constraint_referenced_ids, 74);
            k0.append(R$styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        public void a(b bVar) {
            this.a = bVar.a;
            this.c = bVar.c;
            this.b = bVar.b;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.g0 = bVar.g0;
            int[] iArr = bVar.e0;
            if (iArr != null) {
                this.e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.e0 = null;
            }
            this.f0 = bVar.f0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Layout);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = k0.get(index);
                if (i3 == 80) {
                    this.h0 = obtainStyledAttributes.getBoolean(index, this.h0);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            this.p = c.y(obtainStyledAttributes, index, this.p);
                            break;
                        case 2:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 3:
                            this.o = c.y(obtainStyledAttributes, index, this.o);
                            break;
                        case 4:
                            this.n = c.y(obtainStyledAttributes, index, this.n);
                            break;
                        case 5:
                            this.w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            break;
                        case 7:
                            this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 8:
                            this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 9:
                            this.t = c.y(obtainStyledAttributes, index, this.t);
                            break;
                        case 10:
                            this.s = c.y(obtainStyledAttributes, index, this.s);
                            break;
                        case 11:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 12:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 13:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 14:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 15:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 16:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 17:
                            this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                            break;
                        case 18:
                            this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                            break;
                        case 19:
                            this.g = obtainStyledAttributes.getFloat(index, this.g);
                            break;
                        case 20:
                            this.u = obtainStyledAttributes.getFloat(index, this.u);
                            break;
                        case 21:
                            this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                            break;
                        case 22:
                            this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                            break;
                        case 23:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 24:
                            this.h = c.y(obtainStyledAttributes, index, this.h);
                            break;
                        case 25:
                            this.i = c.y(obtainStyledAttributes, index, this.i);
                            break;
                        case 26:
                            this.C = obtainStyledAttributes.getInt(index, this.C);
                            break;
                        case 27:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 28:
                            this.j = c.y(obtainStyledAttributes, index, this.j);
                            break;
                        case 29:
                            this.k = c.y(obtainStyledAttributes, index, this.k);
                            break;
                        case 30:
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case 31:
                            this.q = c.y(obtainStyledAttributes, index, this.q);
                            break;
                        case 32:
                            this.r = c.y(obtainStyledAttributes, index, this.r);
                            break;
                        case 33:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 34:
                            this.m = c.y(obtainStyledAttributes, index, this.m);
                            break;
                        case 35:
                            this.l = c.y(obtainStyledAttributes, index, this.l);
                            break;
                        case 36:
                            this.v = obtainStyledAttributes.getFloat(index, this.v);
                            break;
                        case 37:
                            this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                            break;
                        case 38:
                            this.P = obtainStyledAttributes.getFloat(index, this.P);
                            break;
                        case 39:
                            this.R = obtainStyledAttributes.getInt(index, this.R);
                            break;
                        case 40:
                            this.S = obtainStyledAttributes.getInt(index, this.S);
                            break;
                        default:
                            switch (i3) {
                                case 54:
                                    this.T = obtainStyledAttributes.getInt(index, this.T);
                                    break;
                                case 55:
                                    this.U = obtainStyledAttributes.getInt(index, this.U);
                                    break;
                                case 56:
                                    this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    break;
                                case 57:
                                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 58:
                                    this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case 59:
                                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                default:
                                    switch (i3) {
                                        case 61:
                                            this.x = c.y(obtainStyledAttributes, index, this.x);
                                            break;
                                        case 62:
                                            this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                                            break;
                                        case 63:
                                            this.z = obtainStyledAttributes.getFloat(index, this.z);
                                            break;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    break;
                                                case 72:
                                                    this.b0 = obtainStyledAttributes.getInt(index, this.b0);
                                                    continue;
                                                case 73:
                                                    this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                                    continue;
                                                case 74:
                                                    this.f0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.j0 = obtainStyledAttributes.getBoolean(index, this.j0);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.g0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(k0.get(index));
                                            sb.toString();
                                            break;
                                    }
                            }
                    }
                } else {
                    this.i0 = obtainStyledAttributes.getBoolean(index, this.i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c  reason: collision with other inner class name */
    public static class C0016c {
        private static SparseIntArray h;
        public boolean a = false;
        public int b = -1;
        public String c = null;
        public int d = -1;
        public int e = 0;
        public float f = Float.NaN;
        public float g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            h = sparseIntArray;
            sparseIntArray.append(R$styleable.Motion_motionPathRotate, 1);
            h.append(R$styleable.Motion_pathMotionArc, 2);
            h.append(R$styleable.Motion_transitionEasing, 3);
            h.append(R$styleable.Motion_drawPath, 4);
            h.append(R$styleable.Motion_animate_relativeTo, 5);
            h.append(R$styleable.Motion_motionStagger, 6);
        }

        public void a(C0016c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.g = cVar.g;
            this.f = cVar.f;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Motion);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (h.get(index)) {
                    case 1:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 2:
                        this.d = obtainStyledAttributes.getInt(index, this.d);
                        break;
                    case 3:
                        this.c = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : l0.c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = c.y(obtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.d = dVar.d;
            this.e = dVar.e;
            this.c = dVar.c;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PropertySet);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.PropertySet_android_alpha) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == R$styleable.PropertySet_android_visibility) {
                    this.b = obtainStyledAttributes.getInt(index, this.b);
                    this.b = c.d[this.b];
                } else if (index == R$styleable.PropertySet_visibilityMode) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == R$styleable.PropertySet_motionProgress) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {
        private static SparseIntArray n;
        public boolean a = false;
        public float b = Utils.FLOAT_EPSILON;
        public float c = Utils.FLOAT_EPSILON;
        public float d = Utils.FLOAT_EPSILON;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public float i = Utils.FLOAT_EPSILON;
        public float j = Utils.FLOAT_EPSILON;
        public float k = Utils.FLOAT_EPSILON;
        public boolean l = false;
        public float m = Utils.FLOAT_EPSILON;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(R$styleable.Transform_android_rotation, 1);
            n.append(R$styleable.Transform_android_rotationX, 2);
            n.append(R$styleable.Transform_android_rotationY, 3);
            n.append(R$styleable.Transform_android_scaleX, 4);
            n.append(R$styleable.Transform_android_scaleY, 5);
            n.append(R$styleable.Transform_android_transformPivotX, 6);
            n.append(R$styleable.Transform_android_transformPivotY, 7);
            n.append(R$styleable.Transform_android_translationX, 8);
            n.append(R$styleable.Transform_android_translationY, 9);
            n.append(R$styleable.Transform_android_translationZ, 10);
            n.append(R$styleable.Transform_android_elevation, 11);
        }

        public void a(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Transform);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (n.get(index)) {
                    case 1:
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 7:
                        this.h = obtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 8:
                        this.i = obtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 9:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.k = obtainStyledAttributes.getDimension(index, this.k);
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.l = true;
                            this.m = obtainStyledAttributes.getDimension(index, this.m);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.append(R$styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        e.append(R$styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        e.append(R$styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        e.append(R$styleable.Constraint_layout_constraintRight_toRightOf, 30);
        e.append(R$styleable.Constraint_layout_constraintTop_toTopOf, 36);
        e.append(R$styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        e.append(R$styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        e.append(R$styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        e.append(R$styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        e.append(R$styleable.Constraint_layout_editor_absoluteX, 6);
        e.append(R$styleable.Constraint_layout_editor_absoluteY, 7);
        e.append(R$styleable.Constraint_layout_constraintGuide_begin, 17);
        e.append(R$styleable.Constraint_layout_constraintGuide_end, 18);
        e.append(R$styleable.Constraint_layout_constraintGuide_percent, 19);
        e.append(R$styleable.Constraint_android_orientation, 27);
        e.append(R$styleable.Constraint_layout_constraintStart_toEndOf, 32);
        e.append(R$styleable.Constraint_layout_constraintStart_toStartOf, 33);
        e.append(R$styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        e.append(R$styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        e.append(R$styleable.Constraint_layout_goneMarginLeft, 13);
        e.append(R$styleable.Constraint_layout_goneMarginTop, 16);
        e.append(R$styleable.Constraint_layout_goneMarginRight, 14);
        e.append(R$styleable.Constraint_layout_goneMarginBottom, 11);
        e.append(R$styleable.Constraint_layout_goneMarginStart, 15);
        e.append(R$styleable.Constraint_layout_goneMarginEnd, 12);
        e.append(R$styleable.Constraint_layout_constraintVertical_weight, 40);
        e.append(R$styleable.Constraint_layout_constraintHorizontal_weight, 39);
        e.append(R$styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        e.append(R$styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        e.append(R$styleable.Constraint_layout_constraintHorizontal_bias, 20);
        e.append(R$styleable.Constraint_layout_constraintVertical_bias, 37);
        e.append(R$styleable.Constraint_layout_constraintDimensionRatio, 5);
        e.append(R$styleable.Constraint_layout_constraintLeft_creator, 82);
        e.append(R$styleable.Constraint_layout_constraintTop_creator, 82);
        e.append(R$styleable.Constraint_layout_constraintRight_creator, 82);
        e.append(R$styleable.Constraint_layout_constraintBottom_creator, 82);
        e.append(R$styleable.Constraint_layout_constraintBaseline_creator, 82);
        e.append(R$styleable.Constraint_android_layout_marginLeft, 24);
        e.append(R$styleable.Constraint_android_layout_marginRight, 28);
        e.append(R$styleable.Constraint_android_layout_marginStart, 31);
        e.append(R$styleable.Constraint_android_layout_marginEnd, 8);
        e.append(R$styleable.Constraint_android_layout_marginTop, 34);
        e.append(R$styleable.Constraint_android_layout_marginBottom, 2);
        e.append(R$styleable.Constraint_android_layout_width, 23);
        e.append(R$styleable.Constraint_android_layout_height, 21);
        e.append(R$styleable.Constraint_android_visibility, 22);
        e.append(R$styleable.Constraint_android_alpha, 43);
        e.append(R$styleable.Constraint_android_elevation, 44);
        e.append(R$styleable.Constraint_android_rotationX, 45);
        e.append(R$styleable.Constraint_android_rotationY, 46);
        e.append(R$styleable.Constraint_android_rotation, 60);
        e.append(R$styleable.Constraint_android_scaleX, 47);
        e.append(R$styleable.Constraint_android_scaleY, 48);
        e.append(R$styleable.Constraint_android_transformPivotX, 49);
        e.append(R$styleable.Constraint_android_transformPivotY, 50);
        e.append(R$styleable.Constraint_android_translationX, 51);
        e.append(R$styleable.Constraint_android_translationY, 52);
        e.append(R$styleable.Constraint_android_translationZ, 53);
        e.append(R$styleable.Constraint_layout_constraintWidth_default, 54);
        e.append(R$styleable.Constraint_layout_constraintHeight_default, 55);
        e.append(R$styleable.Constraint_layout_constraintWidth_max, 56);
        e.append(R$styleable.Constraint_layout_constraintHeight_max, 57);
        e.append(R$styleable.Constraint_layout_constraintWidth_min, 58);
        e.append(R$styleable.Constraint_layout_constraintHeight_min, 59);
        e.append(R$styleable.Constraint_layout_constraintCircle, 61);
        e.append(R$styleable.Constraint_layout_constraintCircleRadius, 62);
        e.append(R$styleable.Constraint_layout_constraintCircleAngle, 63);
        e.append(R$styleable.Constraint_animate_relativeTo, 64);
        e.append(R$styleable.Constraint_transitionEasing, 65);
        e.append(R$styleable.Constraint_drawPath, 66);
        e.append(R$styleable.Constraint_transitionPathRotate, 67);
        e.append(R$styleable.Constraint_motionStagger, 79);
        e.append(R$styleable.Constraint_android_id, 38);
        e.append(R$styleable.Constraint_progress, 68);
        e.append(R$styleable.Constraint_layout_constraintWidth_percent, 69);
        e.append(R$styleable.Constraint_layout_constraintHeight_percent, 70);
        e.append(R$styleable.Constraint_chainUseRtl, 71);
        e.append(R$styleable.Constraint_barrierDirection, 72);
        e.append(R$styleable.Constraint_barrierMargin, 73);
        e.append(R$styleable.Constraint_constraint_referenced_ids, 74);
        e.append(R$styleable.Constraint_barrierAllowsGoneWidgets, 75);
        e.append(R$styleable.Constraint_pathMotionArc, 76);
        e.append(R$styleable.Constraint_layout_constraintTag, 77);
        e.append(R$styleable.Constraint_visibilityMode, 78);
        e.append(R$styleable.Constraint_layout_constrainedWidth, 80);
        e.append(R$styleable.Constraint_layout_constrainedHeight, 81);
    }

    private int[] m(View view, String str) {
        int i;
        Object j;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = R$id.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (j = ((ConstraintLayout) view.getParent()).j(0, trim)) != null && (j instanceof Integer)) {
                i = ((Integer) j).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private a n(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Constraint);
        z(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a o(int i) {
        if (!this.c.containsKey(Integer.valueOf(i))) {
            this.c.put(Integer.valueOf(i), new a());
        }
        return this.c.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    public static int y(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private void z(Context context, a aVar, TypedArray typedArray) {
        C0016c cVar;
        String str;
        String str2;
        StringBuilder sb;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != R$styleable.Constraint_android_id) {
                aVar.c.a = true;
                aVar.d.b = true;
                aVar.b.a = true;
                aVar.e.a = true;
            }
            switch (e.get(index)) {
                case 1:
                    b bVar = aVar.d;
                    bVar.p = y(typedArray, index, bVar.p);
                    continue;
                case 2:
                    b bVar2 = aVar.d;
                    bVar2.G = typedArray.getDimensionPixelSize(index, bVar2.G);
                    continue;
                case 3:
                    b bVar3 = aVar.d;
                    bVar3.o = y(typedArray, index, bVar3.o);
                    continue;
                case 4:
                    b bVar4 = aVar.d;
                    bVar4.n = y(typedArray, index, bVar4.n);
                    continue;
                case 5:
                    aVar.d.w = typedArray.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.d;
                    bVar5.A = typedArray.getDimensionPixelOffset(index, bVar5.A);
                    continue;
                case 7:
                    b bVar6 = aVar.d;
                    bVar6.B = typedArray.getDimensionPixelOffset(index, bVar6.B);
                    continue;
                case 8:
                    b bVar7 = aVar.d;
                    bVar7.H = typedArray.getDimensionPixelSize(index, bVar7.H);
                    continue;
                case 9:
                    b bVar8 = aVar.d;
                    bVar8.t = y(typedArray, index, bVar8.t);
                    continue;
                case 10:
                    b bVar9 = aVar.d;
                    bVar9.s = y(typedArray, index, bVar9.s);
                    continue;
                case 11:
                    b bVar10 = aVar.d;
                    bVar10.M = typedArray.getDimensionPixelSize(index, bVar10.M);
                    continue;
                case 12:
                    b bVar11 = aVar.d;
                    bVar11.N = typedArray.getDimensionPixelSize(index, bVar11.N);
                    continue;
                case 13:
                    b bVar12 = aVar.d;
                    bVar12.J = typedArray.getDimensionPixelSize(index, bVar12.J);
                    continue;
                case 14:
                    b bVar13 = aVar.d;
                    bVar13.L = typedArray.getDimensionPixelSize(index, bVar13.L);
                    continue;
                case 15:
                    b bVar14 = aVar.d;
                    bVar14.O = typedArray.getDimensionPixelSize(index, bVar14.O);
                    continue;
                case 16:
                    b bVar15 = aVar.d;
                    bVar15.K = typedArray.getDimensionPixelSize(index, bVar15.K);
                    continue;
                case 17:
                    b bVar16 = aVar.d;
                    bVar16.e = typedArray.getDimensionPixelOffset(index, bVar16.e);
                    continue;
                case 18:
                    b bVar17 = aVar.d;
                    bVar17.f = typedArray.getDimensionPixelOffset(index, bVar17.f);
                    continue;
                case 19:
                    b bVar18 = aVar.d;
                    bVar18.g = typedArray.getFloat(index, bVar18.g);
                    continue;
                case 20:
                    b bVar19 = aVar.d;
                    bVar19.u = typedArray.getFloat(index, bVar19.u);
                    continue;
                case 21:
                    b bVar20 = aVar.d;
                    bVar20.d = typedArray.getLayoutDimension(index, bVar20.d);
                    continue;
                case 22:
                    d dVar = aVar.b;
                    dVar.b = typedArray.getInt(index, dVar.b);
                    d dVar2 = aVar.b;
                    dVar2.b = d[dVar2.b];
                    continue;
                case 23:
                    b bVar21 = aVar.d;
                    bVar21.c = typedArray.getLayoutDimension(index, bVar21.c);
                    continue;
                case 24:
                    b bVar22 = aVar.d;
                    bVar22.D = typedArray.getDimensionPixelSize(index, bVar22.D);
                    continue;
                case 25:
                    b bVar23 = aVar.d;
                    bVar23.h = y(typedArray, index, bVar23.h);
                    continue;
                case 26:
                    b bVar24 = aVar.d;
                    bVar24.i = y(typedArray, index, bVar24.i);
                    continue;
                case 27:
                    b bVar25 = aVar.d;
                    bVar25.C = typedArray.getInt(index, bVar25.C);
                    continue;
                case 28:
                    b bVar26 = aVar.d;
                    bVar26.E = typedArray.getDimensionPixelSize(index, bVar26.E);
                    continue;
                case 29:
                    b bVar27 = aVar.d;
                    bVar27.j = y(typedArray, index, bVar27.j);
                    continue;
                case 30:
                    b bVar28 = aVar.d;
                    bVar28.k = y(typedArray, index, bVar28.k);
                    continue;
                case 31:
                    b bVar29 = aVar.d;
                    bVar29.I = typedArray.getDimensionPixelSize(index, bVar29.I);
                    continue;
                case 32:
                    b bVar30 = aVar.d;
                    bVar30.q = y(typedArray, index, bVar30.q);
                    continue;
                case 33:
                    b bVar31 = aVar.d;
                    bVar31.r = y(typedArray, index, bVar31.r);
                    continue;
                case 34:
                    b bVar32 = aVar.d;
                    bVar32.F = typedArray.getDimensionPixelSize(index, bVar32.F);
                    continue;
                case 35:
                    b bVar33 = aVar.d;
                    bVar33.m = y(typedArray, index, bVar33.m);
                    continue;
                case 36:
                    b bVar34 = aVar.d;
                    bVar34.l = y(typedArray, index, bVar34.l);
                    continue;
                case 37:
                    b bVar35 = aVar.d;
                    bVar35.v = typedArray.getFloat(index, bVar35.v);
                    continue;
                case 38:
                    aVar.a = typedArray.getResourceId(index, aVar.a);
                    continue;
                case 39:
                    b bVar36 = aVar.d;
                    bVar36.Q = typedArray.getFloat(index, bVar36.Q);
                    continue;
                case 40:
                    b bVar37 = aVar.d;
                    bVar37.P = typedArray.getFloat(index, bVar37.P);
                    continue;
                case 41:
                    b bVar38 = aVar.d;
                    bVar38.R = typedArray.getInt(index, bVar38.R);
                    continue;
                case 42:
                    b bVar39 = aVar.d;
                    bVar39.S = typedArray.getInt(index, bVar39.S);
                    continue;
                case 43:
                    d dVar3 = aVar.b;
                    dVar3.d = typedArray.getFloat(index, dVar3.d);
                    continue;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar = aVar.e;
                        eVar.l = true;
                        eVar.m = typedArray.getDimension(index, eVar.m);
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    e eVar2 = aVar.e;
                    eVar2.c = typedArray.getFloat(index, eVar2.c);
                    continue;
                case 46:
                    e eVar3 = aVar.e;
                    eVar3.d = typedArray.getFloat(index, eVar3.d);
                    continue;
                case 47:
                    e eVar4 = aVar.e;
                    eVar4.e = typedArray.getFloat(index, eVar4.e);
                    continue;
                case 48:
                    e eVar5 = aVar.e;
                    eVar5.f = typedArray.getFloat(index, eVar5.f);
                    continue;
                case 49:
                    e eVar6 = aVar.e;
                    eVar6.g = typedArray.getFloat(index, eVar6.g);
                    continue;
                case 50:
                    e eVar7 = aVar.e;
                    eVar7.h = typedArray.getFloat(index, eVar7.h);
                    continue;
                case 51:
                    e eVar8 = aVar.e;
                    eVar8.i = typedArray.getDimension(index, eVar8.i);
                    continue;
                case 52:
                    e eVar9 = aVar.e;
                    eVar9.j = typedArray.getDimension(index, eVar9.j);
                    continue;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar10 = aVar.e;
                        eVar10.k = typedArray.getDimension(index, eVar10.k);
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    b bVar40 = aVar.d;
                    bVar40.T = typedArray.getInt(index, bVar40.T);
                    continue;
                case 55:
                    b bVar41 = aVar.d;
                    bVar41.U = typedArray.getInt(index, bVar41.U);
                    continue;
                case 56:
                    b bVar42 = aVar.d;
                    bVar42.V = typedArray.getDimensionPixelSize(index, bVar42.V);
                    continue;
                case 57:
                    b bVar43 = aVar.d;
                    bVar43.W = typedArray.getDimensionPixelSize(index, bVar43.W);
                    continue;
                case 58:
                    b bVar44 = aVar.d;
                    bVar44.X = typedArray.getDimensionPixelSize(index, bVar44.X);
                    continue;
                case 59:
                    b bVar45 = aVar.d;
                    bVar45.Y = typedArray.getDimensionPixelSize(index, bVar45.Y);
                    continue;
                case 60:
                    e eVar11 = aVar.e;
                    eVar11.b = typedArray.getFloat(index, eVar11.b);
                    continue;
                case 61:
                    b bVar46 = aVar.d;
                    bVar46.x = y(typedArray, index, bVar46.x);
                    continue;
                case 62:
                    b bVar47 = aVar.d;
                    bVar47.y = typedArray.getDimensionPixelSize(index, bVar47.y);
                    continue;
                case 63:
                    b bVar48 = aVar.d;
                    bVar48.z = typedArray.getFloat(index, bVar48.z);
                    continue;
                case 64:
                    C0016c cVar2 = aVar.c;
                    cVar2.b = y(typedArray, index, cVar2.b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.c;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.c;
                        str = l0.c[typedArray.getInteger(index, 0)];
                    }
                    cVar.c = str;
                    continue;
                case 66:
                    aVar.c.e = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    C0016c cVar3 = aVar.c;
                    cVar3.g = typedArray.getFloat(index, cVar3.g);
                    continue;
                case 68:
                    d dVar4 = aVar.b;
                    dVar4.e = typedArray.getFloat(index, dVar4.e);
                    continue;
                case 69:
                    aVar.d.Z = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.d.a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    break;
                case 72:
                    b bVar49 = aVar.d;
                    bVar49.b0 = typedArray.getInt(index, bVar49.b0);
                    continue;
                case 73:
                    b bVar50 = aVar.d;
                    bVar50.c0 = typedArray.getDimensionPixelSize(index, bVar50.c0);
                    continue;
                case 74:
                    aVar.d.f0 = typedArray.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.d;
                    bVar51.j0 = typedArray.getBoolean(index, bVar51.j0);
                    continue;
                case 76:
                    C0016c cVar4 = aVar.c;
                    cVar4.d = typedArray.getInt(index, cVar4.d);
                    continue;
                case 77:
                    aVar.d.g0 = typedArray.getString(index);
                    continue;
                case 78:
                    d dVar5 = aVar.b;
                    dVar5.c = typedArray.getInt(index, dVar5.c);
                    continue;
                case 79:
                    C0016c cVar5 = aVar.c;
                    cVar5.f = typedArray.getFloat(index, cVar5.f);
                    continue;
                case 80:
                    b bVar52 = aVar.d;
                    bVar52.h0 = typedArray.getBoolean(index, bVar52.h0);
                    continue;
                case 81:
                    b bVar53 = aVar.d;
                    bVar53.i0 = typedArray.getBoolean(index, bVar53.i0);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(e.get(index));
            sb.toString();
        }
    }

    public void A(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.b || id != -1) {
                if (!this.c.containsKey(Integer.valueOf(id))) {
                    this.c.put(Integer.valueOf(id), new a());
                }
                a aVar = this.c.get(Integer.valueOf(id));
                if (!aVar.d.b) {
                    aVar.f(id, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        aVar.d.e0 = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.d.j0 = barrier.u();
                            aVar.d.b0 = barrier.getType();
                            aVar.d.c0 = barrier.getMargin();
                        }
                    }
                    aVar.d.b = true;
                }
                d dVar = aVar.b;
                if (!dVar.a) {
                    dVar.b = childAt.getVisibility();
                    aVar.b.d = childAt.getAlpha();
                    aVar.b.a = true;
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    e eVar = aVar.e;
                    if (!eVar.a) {
                        eVar.a = true;
                        eVar.b = childAt.getRotation();
                        aVar.e.c = childAt.getRotationX();
                        aVar.e.d = childAt.getRotationY();
                        aVar.e.e = childAt.getScaleX();
                        aVar.e.f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (!(((double) pivotX) == Utils.DOUBLE_EPSILON && ((double) pivotY) == Utils.DOUBLE_EPSILON)) {
                            e eVar2 = aVar.e;
                            eVar2.g = pivotX;
                            eVar2.h = pivotY;
                        }
                        aVar.e.i = childAt.getTranslationX();
                        aVar.e.j = childAt.getTranslationY();
                        if (Build.VERSION.SDK_INT >= 21) {
                            aVar.e.k = childAt.getTranslationZ();
                            e eVar3 = aVar.e;
                            if (eVar3.l) {
                                eVar3.m = childAt.getElevation();
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void B(c cVar) {
        for (Integer next : cVar.c.keySet()) {
            int intValue = next.intValue();
            a aVar = cVar.c.get(next);
            if (!this.c.containsKey(Integer.valueOf(intValue))) {
                this.c.put(Integer.valueOf(intValue), new a());
            }
            a aVar2 = this.c.get(Integer.valueOf(intValue));
            b bVar = aVar2.d;
            if (!bVar.b) {
                bVar.a(aVar.d);
            }
            d dVar = aVar2.b;
            if (!dVar.a) {
                dVar.a(aVar.b);
            }
            e eVar = aVar2.e;
            if (!eVar.a) {
                eVar.a(aVar.e);
            }
            C0016c cVar2 = aVar2.c;
            if (!cVar2.a) {
                cVar2.a(aVar.c);
            }
            for (String next2 : aVar.f.keySet()) {
                if (!aVar2.f.containsKey(next2)) {
                    aVar2.f.put(next2, aVar.f.get(next2));
                }
            }
        }
    }

    public void C(boolean z) {
        this.b = z;
    }

    public void D(boolean z) {
    }

    public void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.c.containsKey(Integer.valueOf(id))) {
                "id unknown " + androidx.constraintlayout.motion.widget.a.c(childAt);
            } else if (this.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.c.containsKey(Integer.valueOf(id))) {
                a.h(childAt, this.c.get(Integer.valueOf(id)).f);
            }
        }
    }

    public void d(ConstraintLayout constraintLayout) {
        f(constraintLayout, true);
        constraintLayout.setConstraintSet((c) null);
        constraintLayout.requestLayout();
    }

    public void e(ConstraintHelper constraintHelper, e1 e1Var, ConstraintLayout.LayoutParams layoutParams, SparseArray<e1> sparseArray) {
        int id = constraintHelper.getId();
        if (this.c.containsKey(Integer.valueOf(id))) {
            a aVar = this.c.get(Integer.valueOf(id));
            if (e1Var instanceof j1) {
                constraintHelper.m(aVar, (j1) e1Var, layoutParams, sparseArray);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(ConstraintLayout constraintLayout, boolean z) {
        StringBuilder sb;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.c.containsKey(Integer.valueOf(id))) {
                sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(androidx.constraintlayout.motion.widget.a.c(childAt));
            } else if (!this.b || id != -1) {
                if (id != -1) {
                    if (this.c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.c.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.d.d0 = 1;
                        }
                        int i2 = aVar.d.d0;
                        if (i2 != -1 && i2 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.d.b0);
                            barrier.setMargin(aVar.d.c0);
                            barrier.setAllowsGoneWidget(aVar.d.j0);
                            b bVar = aVar.d;
                            int[] iArr = bVar.e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f0;
                                if (str != null) {
                                    bVar.e0 = m(barrier, str);
                                    barrier.setReferencedIds(aVar.d.e0);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.c();
                        aVar.d(layoutParams);
                        if (z) {
                            a.h(childAt, aVar.f);
                        }
                        childAt.setLayoutParams(layoutParams);
                        d dVar = aVar.b;
                        if (dVar.c == 0) {
                            childAt.setVisibility(dVar.b);
                        }
                        if (Build.VERSION.SDK_INT >= 17) {
                            childAt.setAlpha(aVar.b.d);
                            childAt.setRotation(aVar.e.b);
                            childAt.setRotationX(aVar.e.c);
                            childAt.setRotationY(aVar.e.d);
                            childAt.setScaleX(aVar.e.e);
                            childAt.setScaleY(aVar.e.f);
                            if (!Float.isNaN(aVar.e.g)) {
                                childAt.setPivotX(aVar.e.g);
                            }
                            if (!Float.isNaN(aVar.e.h)) {
                                childAt.setPivotY(aVar.e.h);
                            }
                            childAt.setTranslationX(aVar.e.i);
                            childAt.setTranslationY(aVar.e.j);
                            if (Build.VERSION.SDK_INT >= 21) {
                                childAt.setTranslationZ(aVar.e.k);
                                e eVar = aVar.e;
                                if (eVar.l) {
                                    childAt.setElevation(eVar.m);
                                }
                            }
                        }
                    } else {
                        sb = new StringBuilder();
                        sb.append("WARNING NO CONSTRAINTS for view ");
                        sb.append(id);
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            sb.toString();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.c.get(num);
            int i3 = aVar2.d.d0;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar2 = aVar2.d;
                int[] iArr2 = bVar2.e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f0;
                    if (str2 != null) {
                        bVar2.e0 = m(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.d.e0);
                    }
                }
                barrier2.setType(aVar2.d.b0);
                barrier2.setMargin(aVar2.d.c0);
                ConstraintLayout.LayoutParams h = constraintLayout.generateDefaultLayoutParams();
                barrier2.t();
                aVar2.d(h);
                constraintLayout.addView(barrier2, h);
            }
            if (aVar2.d.a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams h2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.d(h2);
                constraintLayout.addView(guideline, h2);
            }
        }
    }

    public void g(int i, ConstraintLayout.LayoutParams layoutParams) {
        if (this.c.containsKey(Integer.valueOf(i))) {
            this.c.get(Integer.valueOf(i)).d(layoutParams);
        }
    }

    public void h(int i, int i2) {
        if (this.c.containsKey(Integer.valueOf(i))) {
            a aVar = this.c.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    b bVar = aVar.d;
                    bVar.i = -1;
                    bVar.h = -1;
                    bVar.D = -1;
                    bVar.J = -1;
                    return;
                case 2:
                    b bVar2 = aVar.d;
                    bVar2.k = -1;
                    bVar2.j = -1;
                    bVar2.E = -1;
                    bVar2.L = -1;
                    return;
                case 3:
                    b bVar3 = aVar.d;
                    bVar3.m = -1;
                    bVar3.l = -1;
                    bVar3.F = -1;
                    bVar3.K = -1;
                    return;
                case 4:
                    b bVar4 = aVar.d;
                    bVar4.n = -1;
                    bVar4.o = -1;
                    bVar4.G = -1;
                    bVar4.M = -1;
                    return;
                case 5:
                    aVar.d.p = -1;
                    return;
                case 6:
                    b bVar5 = aVar.d;
                    bVar5.q = -1;
                    bVar5.r = -1;
                    bVar5.I = -1;
                    bVar5.O = -1;
                    return;
                case 7:
                    b bVar6 = aVar.d;
                    bVar6.s = -1;
                    bVar6.t = -1;
                    bVar6.H = -1;
                    bVar6.N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void i(Context context, int i) {
        j((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public void j(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.b || id != -1) {
                if (!this.c.containsKey(Integer.valueOf(id))) {
                    this.c.put(Integer.valueOf(id), new a());
                }
                a aVar = this.c.get(Integer.valueOf(id));
                aVar.f = a.b(this.a, childAt);
                aVar.f(id, layoutParams);
                aVar.b.b = childAt.getVisibility();
                if (Build.VERSION.SDK_INT >= 17) {
                    aVar.b.d = childAt.getAlpha();
                    aVar.e.b = childAt.getRotation();
                    aVar.e.c = childAt.getRotationX();
                    aVar.e.d = childAt.getRotationY();
                    aVar.e.e = childAt.getScaleX();
                    aVar.e.f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == Utils.DOUBLE_EPSILON && ((double) pivotY) == Utils.DOUBLE_EPSILON)) {
                        e eVar = aVar.e;
                        eVar.g = pivotX;
                        eVar.h = pivotY;
                    }
                    aVar.e.i = childAt.getTranslationX();
                    aVar.e.j = childAt.getTranslationY();
                    if (Build.VERSION.SDK_INT >= 21) {
                        aVar.e.k = childAt.getTranslationZ();
                        e eVar2 = aVar.e;
                        if (eVar2.l) {
                            eVar2.m = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.d.j0 = barrier.u();
                    aVar.d.e0 = barrier.getReferencedIds();
                    aVar.d.b0 = barrier.getType();
                    aVar.d.c0 = barrier.getMargin();
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void k(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.b || id != -1) {
                if (!this.c.containsKey(Integer.valueOf(id))) {
                    this.c.put(Integer.valueOf(id), new a());
                }
                a aVar = this.c.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    aVar.h((ConstraintHelper) childAt, id, layoutParams);
                }
                aVar.g(id, layoutParams);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void l(int i, int i2, int i3, float f) {
        b bVar = o(i).d;
        bVar.x = i2;
        bVar.y = i3;
        bVar.z = f;
    }

    public a p(int i) {
        if (this.c.containsKey(Integer.valueOf(i))) {
            return this.c.get(Integer.valueOf(i));
        }
        return null;
    }

    public int q(int i) {
        return o(i).d.d;
    }

    public int[] r() {
        Integer[] numArr = (Integer[]) this.c.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public a s(int i) {
        return o(i);
    }

    public int t(int i) {
        return o(i).b.b;
    }

    public int u(int i) {
        return o(i).b.c;
    }

    public int v(int i) {
        return o(i).d.c;
    }

    public void w(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a n = n(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        n.d.a = true;
                    }
                    this.c.put(Integer.valueOf(n.a), n);
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017b, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x018a
            if (r0 == 0) goto L_0x0178
            java.lang.String r4 = "Constraint"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0036
            if (r0 == r5) goto L_0x0015
            goto L_0x017b
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x017b
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.c$a> r0 = r9.c     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r3 = r2.a     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2 = r1
            goto L_0x017b
        L_0x0036:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r7 = -1
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            switch(r8) {
                case -2025855158: goto L_0x0086;
                case -1984451626: goto L_0x007c;
                case -1269513683: goto L_0x0073;
                case -1238332596: goto L_0x0069;
                case -71750448: goto L_0x005f;
                case 1331510167: goto L_0x0055;
                case 1791837707: goto L_0x004b;
                case 1803088381: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0042:
            goto L_0x0090
        L_0x0043:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 0
            goto L_0x0091
        L_0x004b:
            java.lang.String r4 = "CustomAttribute"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 7
            goto L_0x0091
        L_0x0055:
            java.lang.String r4 = "Barrier"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 2
            goto L_0x0091
        L_0x005f:
            java.lang.String r4 = "Guideline"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 1
            goto L_0x0091
        L_0x0069:
            java.lang.String r4 = "Transform"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 4
            goto L_0x0091
        L_0x0073:
            java.lang.String r4 = "PropertySet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x007c:
            java.lang.String r4 = "Motion"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 6
            goto L_0x0091
        L_0x0086:
            java.lang.String r4 = "Layout"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 5
            goto L_0x0091
        L_0x0090:
            r5 = -1
        L_0x0091:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r5) {
                case 0: goto L_0x016e;
                case 1: goto L_0x015d;
                case 2: goto L_0x0150;
                case 3: goto L_0x012b;
                case 4: goto L_0x0106;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00ba;
                case 7: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x017b
        L_0x0098:
            if (r2 == 0) goto L_0x00a1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r0 = r2.f     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.a.g(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00a1:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x00ba:
            if (r2 == 0) goto L_0x00c7
            androidx.constraintlayout.widget.c$c r0 = r2.c     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00c7:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x00e0:
            if (r2 == 0) goto L_0x00ed
            androidx.constraintlayout.widget.c$b r0 = r2.d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00ed:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0106:
            if (r2 == 0) goto L_0x0112
            androidx.constraintlayout.widget.c$e r0 = r2.e     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x0112:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x012b:
            if (r2 == 0) goto L_0x0137
            androidx.constraintlayout.widget.c$d r0 = r2.b     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x0137:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0150:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.c$a r0 = r9.n(r10, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.c$b r2 = r0.d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2.d0 = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x0176
        L_0x015d:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.c$a r0 = r9.n(r10, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.c$b r2 = r0.d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2.a = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.c$b r2 = r0.d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2.b = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x0176
        L_0x016e:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.c$a r0 = r9.n(r10, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0176:
            r2 = r0
            goto L_0x017b
        L_0x0178:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x017b:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x0006
        L_0x0181:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x018a
        L_0x0186:
            r10 = move-exception
            r10.printStackTrace()
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.x(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
