package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import defpackage.a5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    private int A;
    private int B;
    private final i C;
    boolean D = false;
    boolean E = false;
    private BitSet F;
    int G = -1;
    int H = Integer.MIN_VALUE;
    c I = new c();
    private int J = 2;
    private boolean K;
    private boolean L;
    private d M;
    private int N;
    private final Rect O = new Rect();
    private final b P = new b();
    private boolean Q = false;
    private boolean R = true;
    private int[] S;
    private final Runnable T = new a();
    private int w = -1;
    e[] x;
    n y;
    n z;

    public static class LayoutParams extends RecyclerView.LayoutParams {
        e i;
        boolean j;

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public final int e() {
            e eVar = this.i;
            if (eVar == null) {
                return -1;
            }
            return eVar.e;
        }

        public boolean f() {
            return this.j;
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.b2();
        }
    }

    class b {
        int a;
        int b;
        boolean c;
        boolean d;
        boolean e;
        int[] f;

        b() {
            c();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.b = this.c ? StaggeredGridLayoutManager.this.y.i() : StaggeredGridLayoutManager.this.y.m();
        }

        /* access modifiers changed from: package-private */
        public void b(int i) {
            this.b = this.c ? StaggeredGridLayoutManager.this.y.i() - i : StaggeredGridLayoutManager.this.y.m() + i;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(e[] eVarArr) {
            int length = eVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.x.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = eVarArr[i].p(Integer.MIN_VALUE);
            }
        }
    }

    static class c {
        int[] a;
        List<a> b;

        @SuppressLint({"BanParcelableUsage"})
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0047a();
            int e;
            int f;
            int[] g;
            boolean h;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a$a  reason: collision with other inner class name */
            static class C0047a implements Parcelable.Creator<a> {
                C0047a() {
                }

                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* renamed from: b */
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            a() {
            }

            a(Parcel parcel) {
                this.e = parcel.readInt();
                this.f = parcel.readInt();
                this.h = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.g = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            public int a(int i) {
                int[] iArr = this.g;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.e + ", mGapDir=" + this.f + ", mHasUnwantedGapAfter=" + this.h + ", mGapPerSpan=" + Arrays.toString(this.g) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.e);
                parcel.writeInt(this.f);
                parcel.writeInt(this.h ? 1 : 0);
                int[] iArr = this.g;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.g);
            }
        }

        c() {
        }

        private int i(int i) {
            if (this.b == null) {
                return -1;
            }
            a f = f(i);
            if (f != null) {
                this.b.remove(f);
            }
            int size = this.b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.b.get(i2).e >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.b.remove(i2);
            return this.b.get(i2).e;
        }

        private void l(int i, int i2) {
            List<a> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.b.get(size);
                    int i3 = aVar.e;
                    if (i3 >= i) {
                        aVar.e = i3 + i2;
                    }
                }
            }
        }

        private void m(int i, int i2) {
            List<a> list = this.b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.b.get(size);
                    int i4 = aVar.e;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.b.remove(size);
                        } else {
                            aVar.e = i4 - i2;
                        }
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = this.b.get(i);
                if (aVar2.e == aVar.e) {
                    this.b.remove(i);
                }
                if (aVar2.e >= aVar.e) {
                    this.b.add(i, aVar);
                    return;
                }
            }
            this.b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        /* access modifiers changed from: package-private */
        public void c(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[o(i)];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public int d(int i) {
            List<a> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.b.get(size).e >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return h(i);
        }

        public a e(int i, int i2, int i3, boolean z) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = this.b.get(i4);
                int i5 = aVar.e;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f == i3 || (z && aVar.h))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.b.get(size);
                if (aVar.e == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int g(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        public int h(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = i(i);
            if (i2 == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.a.length;
            }
            int i3 = i2 + 1;
            Arrays.fill(this.a, i, i3, -1);
            return i3;
        }

        /* access modifiers changed from: package-private */
        public void j(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                c(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.a, i, i3, -1);
                l(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                c(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void n(int i, e eVar) {
            c(i);
            this.a[i] = eVar.e;
        }

        /* access modifiers changed from: package-private */
        public int o(int i) {
            int length = this.a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        int e;
        int f;
        int g;
        int[] h;
        int i;
        int[] j;
        List<c.a> k;
        boolean l;
        boolean m;
        boolean n;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            int readInt = parcel.readInt();
            this.g = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.h = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.i = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.j = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.l = parcel.readInt() == 1;
            this.m = parcel.readInt() == 1;
            this.n = parcel.readInt() == 1 ? true : z;
            this.k = parcel.readArrayList(c.a.class.getClassLoader());
        }

        public d(d dVar) {
            this.g = dVar.g;
            this.e = dVar.e;
            this.f = dVar.f;
            this.h = dVar.h;
            this.i = dVar.i;
            this.j = dVar.j;
            this.l = dVar.l;
            this.m = dVar.m;
            this.n = dVar.n;
            this.k = dVar.k;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.h = null;
            this.g = 0;
            this.e = -1;
            this.f = -1;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.h = null;
            this.g = 0;
            this.i = 0;
            this.j = null;
            this.k = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            if (this.g > 0) {
                parcel.writeIntArray(this.h);
            }
            parcel.writeInt(this.i);
            if (this.i > 0) {
                parcel.writeIntArray(this.j);
            }
            parcel.writeInt(this.l ? 1 : 0);
            parcel.writeInt(this.m ? 1 : 0);
            parcel.writeInt(this.n ? 1 : 0);
            parcel.writeList(this.k);
        }
    }

    class e {
        ArrayList<View> a = new ArrayList<>();
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        int d = 0;
        final int e;

        e(int i) {
            this.e = i;
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            LayoutParams n = n(view);
            n.i = this;
            this.a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.d += StaggeredGridLayoutManager.this.y.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z, int i) {
            int l = z ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (l != Integer.MIN_VALUE) {
                if (z && l < StaggeredGridLayoutManager.this.y.i()) {
                    return;
                }
                if (z || l <= StaggeredGridLayoutManager.this.y.m()) {
                    if (i != Integer.MIN_VALUE) {
                        l += i;
                    }
                    this.c = l;
                    this.b = l;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            c.a f2;
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams n = n(view);
            this.c = StaggeredGridLayoutManager.this.y.d(view);
            if (n.j && (f2 = StaggeredGridLayoutManager.this.I.f(n.a())) != null && f2.f == 1) {
                this.c += f2.a(this.e);
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            c.a f2;
            View view = this.a.get(0);
            LayoutParams n = n(view);
            this.b = StaggeredGridLayoutManager.this.y.g(view);
            if (n.j && (f2 = StaggeredGridLayoutManager.this.I.f(n.a())) != null && f2.f == -1) {
                this.b -= f2.a(this.e);
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.a.clear();
            q();
            this.d = 0;
        }

        public int f() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.D) {
                i2 = this.a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.a.size();
            }
            return i(i2, i, true);
        }

        public int g() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.D) {
                i2 = 0;
                i = this.a.size();
            } else {
                i2 = this.a.size() - 1;
                i = -1;
            }
            return i(i2, i, true);
        }

        /* access modifiers changed from: package-private */
        public int h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.y.m();
            int i3 = StaggeredGridLayoutManager.this.y.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int g = StaggeredGridLayoutManager.this.y.g(view);
                int d2 = StaggeredGridLayoutManager.this.y.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g < i3 : g <= i3;
                if (!z3 ? d2 > m : d2 >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && g >= m && d2 <= i3) {
                        }
                    } else if (g >= m && d2 <= i3) {
                    }
                    return StaggeredGridLayoutManager.this.n0(view);
                }
                i += i4;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int i(int i, int i2, boolean z) {
            return h(i, i2, false, false, z);
        }

        public int j() {
            return this.d;
        }

        /* access modifiers changed from: package-private */
        public int k() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public int l(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            c();
            return this.c;
        }

        public View m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.D && staggeredGridLayoutManager.n0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.D && staggeredGridLayoutManager2.n0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.D && staggeredGridLayoutManager3.n0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.D && staggeredGridLayoutManager4.n0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        public LayoutParams n(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        public int o() {
            int i = this.b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public int p(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            d();
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public void q() {
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void r(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2 + i;
            }
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                this.c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            LayoutParams n = n(remove);
            n.i = null;
            if (n.c() || n.b()) {
                this.d -= StaggeredGridLayoutManager.this.y.e(remove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void t() {
            View remove = this.a.remove(0);
            LayoutParams n = n(remove);
            n.i = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.d -= StaggeredGridLayoutManager.this.y.e(remove);
            }
            this.b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void u(View view) {
            LayoutParams n = n(view);
            n.i = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.d += StaggeredGridLayoutManager.this.y.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i) {
            this.b = i;
            this.c = i;
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.A = i2;
        S2(i);
        this.C = new i();
        j2();
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.o.d o0 = RecyclerView.o.o0(context, attributeSet, i, i2);
        Q2(o0.a);
        S2(o0.b);
        R2(o0.c);
        this.C = new i();
        j2();
    }

    private void D2(View view, int i, int i2, boolean z2) {
        t(view, this.O);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin;
        Rect rect = this.O;
        int a3 = a3(i, i3 + rect.left, layoutParams.rightMargin + rect.right);
        int i4 = layoutParams.topMargin;
        Rect rect2 = this.O;
        int a32 = a3(i2, i4 + rect2.top, layoutParams.bottomMargin + rect2.bottom);
        if (z2 ? Q1(view, a3, a32, layoutParams) : O1(view, a3, a32, layoutParams)) {
            view.measure(a3, a32);
        }
    }

    private void E2(View view, LayoutParams layoutParams, boolean z2) {
        int i;
        int i2;
        if (layoutParams.j) {
            if (this.A == 1) {
                i2 = this.N;
            } else {
                D2(view, RecyclerView.o.U(u0(), v0(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true), this.N, z2);
                return;
            }
        } else if (this.A == 1) {
            i2 = RecyclerView.o.U(this.B, v0(), 0, layoutParams.width, false);
        } else {
            i2 = RecyclerView.o.U(u0(), v0(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true);
            i = RecyclerView.o.U(this.B, h0(), 0, layoutParams.height, false);
            D2(view, i2, i, z2);
        }
        i = RecyclerView.o.U(g0(), h0(), getPaddingTop() + getPaddingBottom(), layoutParams.height, true);
        D2(view, i2, i, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (b2() != false) goto L_0x014f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void F2(androidx.recyclerview.widget.RecyclerView.u r9, androidx.recyclerview.widget.RecyclerView.z r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.P
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r8.M
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.G
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.b()
            if (r1 != 0) goto L_0x0018
            r8.s1(r9)
            r0.c()
            return
        L_0x0018:
            boolean r1 = r0.e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.G
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r8.M
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.M
            if (r5 == 0) goto L_0x0037
            r8.W1(r0)
            goto L_0x003e
        L_0x0037:
            r8.N2()
            boolean r5 = r8.E
            r0.c = r5
        L_0x003e:
            r8.W2(r10, r0)
            r0.e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.M
            if (r5 != 0) goto L_0x0060
            int r5 = r8.G
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.c
            boolean r6 = r8.K
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.C2()
            boolean r6 = r8.L
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r5 = r8.I
            r5.b()
            r0.d = r4
        L_0x0060:
            int r5 = r8.T()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.M
            if (r5 == 0) goto L_0x006e
            int r5 = r5.g
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.w
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r5 = r8.x
            r5 = r5[r1]
            r5.e()
            int r5 = r0.b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r6 = r8.x
            r6 = r6[r1]
            r6.v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.P
            int[] r1 = r1.f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.w
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r5 = r8.x
            r5 = r5[r1]
            r5.e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.P
            int[] r6 = r6.f
            r6 = r6[r1]
            r5.v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.w
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r5 = r8.x
            r5 = r5[r1]
            boolean r6 = r8.E
            int r7 = r0.b
            r5.b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.P
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r5 = r8.x
            r1.d(r5)
        L_0x00c9:
            r8.G(r9)
            androidx.recyclerview.widget.i r1 = r8.C
            r1.a = r3
            r8.Q = r3
            androidx.recyclerview.widget.n r1 = r8.z
            int r1 = r1.n()
            r8.Y2(r1)
            int r1 = r0.a
            r8.X2(r1, r10)
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x00f0
            r8.P2(r2)
            androidx.recyclerview.widget.i r1 = r8.C
            r8.k2(r9, r1, r10)
            r8.P2(r4)
            goto L_0x00fb
        L_0x00f0:
            r8.P2(r4)
            androidx.recyclerview.widget.i r1 = r8.C
            r8.k2(r9, r1, r10)
            r8.P2(r2)
        L_0x00fb:
            androidx.recyclerview.widget.i r1 = r8.C
            int r2 = r0.a
            int r5 = r1.d
            int r2 = r2 + r5
            r1.c = r2
            r8.k2(r9, r1, r10)
            r8.M2()
            int r1 = r8.T()
            if (r1 <= 0) goto L_0x0121
            boolean r1 = r8.E
            if (r1 == 0) goto L_0x011b
            r8.q2(r9, r10, r4)
            r8.r2(r9, r10, r3)
            goto L_0x0121
        L_0x011b:
            r8.r2(r9, r10, r4)
            r8.q2(r9, r10, r3)
        L_0x0121:
            if (r11 == 0) goto L_0x014e
            boolean r11 = r10.e()
            if (r11 != 0) goto L_0x014e
            int r11 = r8.J
            if (r11 == 0) goto L_0x013f
            int r11 = r8.T()
            if (r11 <= 0) goto L_0x013f
            boolean r11 = r8.Q
            if (r11 != 0) goto L_0x013d
            android.view.View r11 = r8.A2()
            if (r11 == 0) goto L_0x013f
        L_0x013d:
            r11 = 1
            goto L_0x0140
        L_0x013f:
            r11 = 0
        L_0x0140:
            if (r11 == 0) goto L_0x014e
            java.lang.Runnable r11 = r8.T
            r8.w1(r11)
            boolean r11 = r8.b2()
            if (r11 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r4 = 0
        L_0x014f:
            boolean r11 = r10.e()
            if (r11 == 0) goto L_0x015a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.P
            r11.c()
        L_0x015a:
            boolean r11 = r0.c
            r8.K = r11
            boolean r11 = r8.C2()
            r8.L = r11
            if (r4 == 0) goto L_0x016e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.P
            r11.c()
            r8.F2(r9, r10, r3)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.F2(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    private boolean G2(int i) {
        if (this.A == 0) {
            return (i == -1) != this.E;
        }
        return ((i == -1) == this.E) == C2();
    }

    private void I2(View view) {
        for (int i = this.w - 1; i >= 0; i--) {
            this.x[i].u(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.e == -1) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void J2(androidx.recyclerview.widget.RecyclerView.u r3, androidx.recyclerview.widget.i r4) {
        /*
            r2 = this;
            boolean r0 = r4.a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.i
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.g
        L_0x0014:
            r2.K2(r3, r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f
        L_0x001a:
            r2.L2(r3, r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.e
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f
            int r1 = r2.v2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.g
            int r4 = r4.b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.g
            int r0 = r2.w2(r0)
            int r1 = r4.g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f
            int r4 = r4.b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.J2(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.i):void");
    }

    private void K2(RecyclerView.u uVar, int i) {
        int T2 = T() - 1;
        while (T2 >= 0) {
            View S2 = S(T2);
            if (this.y.g(S2) >= i && this.y.q(S2) >= i) {
                LayoutParams layoutParams = (LayoutParams) S2.getLayoutParams();
                if (layoutParams.j) {
                    int i2 = 0;
                    while (i2 < this.w) {
                        if (this.x[i2].a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.w; i3++) {
                        this.x[i3].s();
                    }
                } else if (layoutParams.i.a.size() != 1) {
                    layoutParams.i.s();
                } else {
                    return;
                }
                u1(S2, uVar);
                T2--;
            } else {
                return;
            }
        }
    }

    private void L2(RecyclerView.u uVar, int i) {
        while (T() > 0) {
            View S2 = S(0);
            if (this.y.d(S2) <= i && this.y.p(S2) <= i) {
                LayoutParams layoutParams = (LayoutParams) S2.getLayoutParams();
                if (layoutParams.j) {
                    int i2 = 0;
                    while (i2 < this.w) {
                        if (this.x[i2].a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.w; i3++) {
                        this.x[i3].t();
                    }
                } else if (layoutParams.i.a.size() != 1) {
                    layoutParams.i.t();
                } else {
                    return;
                }
                u1(S2, uVar);
            } else {
                return;
            }
        }
    }

    private void M2() {
        if (this.z.k() != 1073741824) {
            float f = Utils.FLOAT_EPSILON;
            int T2 = T();
            for (int i = 0; i < T2; i++) {
                View S2 = S(i);
                float e2 = (float) this.z.e(S2);
                if (e2 >= f) {
                    if (((LayoutParams) S2.getLayoutParams()).f()) {
                        e2 = (e2 * 1.0f) / ((float) this.w);
                    }
                    f = Math.max(f, e2);
                }
            }
            int i2 = this.B;
            int round = Math.round(f * ((float) this.w));
            if (this.z.k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.z.n());
            }
            Y2(round);
            if (this.B != i2) {
                for (int i3 = 0; i3 < T2; i3++) {
                    View S3 = S(i3);
                    LayoutParams layoutParams = (LayoutParams) S3.getLayoutParams();
                    if (!layoutParams.j) {
                        if (!C2() || this.A != 1) {
                            int i4 = layoutParams.i.e;
                            int i5 = this.A;
                            int i6 = (this.B * i4) - (i4 * i2);
                            if (i5 == 1) {
                                S3.offsetLeftAndRight(i6);
                            } else {
                                S3.offsetTopAndBottom(i6);
                            }
                        } else {
                            int i7 = this.w;
                            int i8 = layoutParams.i.e;
                            S3.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.B) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    private void N2() {
        this.E = (this.A == 1 || !C2()) ? this.D : !this.D;
    }

    private void P2(int i) {
        i iVar = this.C;
        iVar.e = i;
        int i2 = 1;
        if (this.E != (i == -1)) {
            i2 = -1;
        }
        iVar.d = i2;
    }

    private void T2(int i, int i2) {
        for (int i3 = 0; i3 < this.w; i3++) {
            if (!this.x[i3].a.isEmpty()) {
                Z2(this.x[i3], i, i2);
            }
        }
    }

    private boolean U2(RecyclerView.z zVar, b bVar) {
        boolean z2 = this.K;
        int b2 = zVar.b();
        bVar.a = z2 ? p2(b2) : l2(b2);
        bVar.b = Integer.MIN_VALUE;
        return true;
    }

    private void V1(View view) {
        for (int i = this.w - 1; i >= 0; i--) {
            this.x[i].a(view);
        }
    }

    private void W1(b bVar) {
        boolean z2;
        d dVar = this.M;
        int i = dVar.g;
        if (i > 0) {
            if (i == this.w) {
                for (int i2 = 0; i2 < this.w; i2++) {
                    this.x[i2].e();
                    d dVar2 = this.M;
                    int i3 = dVar2.h[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += dVar2.m ? this.y.i() : this.y.m();
                    }
                    this.x[i2].v(i3);
                }
            } else {
                dVar.b();
                d dVar3 = this.M;
                dVar3.e = dVar3.f;
            }
        }
        d dVar4 = this.M;
        this.L = dVar4.n;
        R2(dVar4.l);
        N2();
        d dVar5 = this.M;
        int i4 = dVar5.e;
        if (i4 != -1) {
            this.G = i4;
            z2 = dVar5.m;
        } else {
            z2 = this.E;
        }
        bVar.c = z2;
        d dVar6 = this.M;
        if (dVar6.i > 1) {
            c cVar = this.I;
            cVar.a = dVar6.j;
            cVar.b = dVar6.k;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void X2(int r5, androidx.recyclerview.widget.RecyclerView.z r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.i r0 = r4.C
            r1 = 0
            r0.b = r1
            r0.c = r5
            boolean r0 = r4.E0()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.E
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.n r5 = r4.y
            int r5 = r5.n()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.n r5 = r4.y
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.W()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.i r0 = r4.C
            androidx.recyclerview.widget.n r3 = r4.y
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f = r3
            androidx.recyclerview.widget.i r6 = r4.C
            androidx.recyclerview.widget.n r0 = r4.y
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.i r0 = r4.C
            androidx.recyclerview.widget.n r3 = r4.y
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.g = r3
            androidx.recyclerview.widget.i r5 = r4.C
            int r6 = -r6
            r5.f = r6
        L_0x005d:
            androidx.recyclerview.widget.i r5 = r4.C
            r5.h = r1
            r5.a = r2
            androidx.recyclerview.widget.n r6 = r4.y
            int r6 = r6.k()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.n r6 = r4.y
            int r6 = r6.h()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X2(int, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    private void Z1(View view, LayoutParams layoutParams, i iVar) {
        if (iVar.e == 1) {
            if (layoutParams.j) {
                V1(view);
            } else {
                layoutParams.i.a(view);
            }
        } else if (layoutParams.j) {
            I2(view);
        } else {
            layoutParams.i.u(view);
        }
    }

    private void Z2(e eVar, int i, int i2) {
        int j = eVar.j();
        if (i == -1) {
            if (eVar.o() + j > i2) {
                return;
            }
        } else if (eVar.k() - j < i2) {
            return;
        }
        this.F.set(eVar.e, false);
    }

    private int a2(int i) {
        if (T() == 0) {
            return this.E ? 1 : -1;
        }
        return (i < s2()) != this.E ? -1 : 1;
    }

    private int a3(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    private boolean c2(e eVar) {
        if (this.E) {
            if (eVar.k() < this.y.i()) {
                ArrayList<View> arrayList = eVar.a;
                return !eVar.n(arrayList.get(arrayList.size() - 1)).j;
            }
        } else if (eVar.o() > this.y.m()) {
            return !eVar.n(eVar.a.get(0)).j;
        }
        return false;
    }

    private int d2(RecyclerView.z zVar) {
        if (T() == 0) {
            return 0;
        }
        return q.a(zVar, this.y, n2(!this.R), m2(!this.R), this, this.R);
    }

    private int e2(RecyclerView.z zVar) {
        if (T() == 0) {
            return 0;
        }
        return q.b(zVar, this.y, n2(!this.R), m2(!this.R), this, this.R, this.E);
    }

    private int f2(RecyclerView.z zVar) {
        if (T() == 0) {
            return 0;
        }
        return q.c(zVar, this.y, n2(!this.R), m2(!this.R), this, this.R);
    }

    private int g2(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.A == 1) ? 1 : Integer.MIN_VALUE : this.A == 0 ? 1 : Integer.MIN_VALUE : this.A == 1 ? -1 : Integer.MIN_VALUE : this.A == 0 ? -1 : Integer.MIN_VALUE : (this.A != 1 && C2()) ? -1 : 1 : (this.A != 1 && C2()) ? 1 : -1;
    }

    private c.a h2(int i) {
        c.a aVar = new c.a();
        aVar.g = new int[this.w];
        for (int i2 = 0; i2 < this.w; i2++) {
            aVar.g[i2] = i - this.x[i2].l(i);
        }
        return aVar;
    }

    private c.a i2(int i) {
        c.a aVar = new c.a();
        aVar.g = new int[this.w];
        for (int i2 = 0; i2 < this.w; i2++) {
            aVar.g[i2] = this.x[i2].p(i) - i;
        }
        return aVar;
    }

    private void j2() {
        this.y = n.b(this, this.A);
        this.z = n.b(this, 1 - this.A);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    private int k2(RecyclerView.u uVar, i iVar, RecyclerView.z zVar) {
        int i;
        e eVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        RecyclerView.u uVar2 = uVar;
        i iVar2 = iVar;
        ? r9 = 0;
        this.F.set(0, this.w, true);
        if (this.C.i) {
            i = iVar2.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = iVar2.e == 1 ? iVar2.g + iVar2.b : iVar2.f - iVar2.b;
        }
        T2(iVar2.e, i);
        int i8 = this.E ? this.y.i() : this.y.m();
        boolean z2 = false;
        while (iVar.a(zVar) && (this.C.i || !this.F.isEmpty())) {
            View b2 = iVar2.b(uVar2);
            LayoutParams layoutParams = (LayoutParams) b2.getLayoutParams();
            int a2 = layoutParams.a();
            int g = this.I.g(a2);
            boolean z3 = g == -1;
            if (z3) {
                eVar = layoutParams.j ? this.x[r9] : y2(iVar2);
                this.I.n(a2, eVar);
            } else {
                eVar = this.x[g];
            }
            e eVar2 = eVar;
            layoutParams.i = eVar2;
            if (iVar2.e == 1) {
                n(b2);
            } else {
                o(b2, r9);
            }
            E2(b2, layoutParams, r9);
            if (iVar2.e == 1) {
                int u2 = layoutParams.j ? u2(i8) : eVar2.l(i8);
                int e2 = this.y.e(b2) + u2;
                if (z3 && layoutParams.j) {
                    c.a h2 = h2(u2);
                    h2.f = -1;
                    h2.e = a2;
                    this.I.a(h2);
                }
                i2 = e2;
                i3 = u2;
            } else {
                int x2 = layoutParams.j ? x2(i8) : eVar2.p(i8);
                i3 = x2 - this.y.e(b2);
                if (z3 && layoutParams.j) {
                    c.a i22 = i2(x2);
                    i22.f = 1;
                    i22.e = a2;
                    this.I.a(i22);
                }
                i2 = x2;
            }
            if (layoutParams.j && iVar2.d == -1) {
                if (!z3) {
                    if (!(iVar2.e == 1 ? X1() : Y1())) {
                        c.a f = this.I.f(a2);
                        if (f != null) {
                            f.h = true;
                        }
                    }
                }
                this.Q = true;
            }
            Z1(b2, layoutParams, iVar2);
            if (!C2() || this.A != 1) {
                int m = layoutParams.j ? this.z.m() : (eVar2.e * this.B) + this.z.m();
                i5 = m;
                i4 = this.z.e(b2) + m;
            } else {
                int i9 = layoutParams.j ? this.z.i() : this.z.i() - (((this.w - 1) - eVar2.e) * this.B);
                i4 = i9;
                i5 = i9 - this.z.e(b2);
            }
            if (this.A == 1) {
                staggeredGridLayoutManager = this;
                view = b2;
                i7 = i5;
                i5 = i3;
                i6 = i4;
            } else {
                staggeredGridLayoutManager = this;
                view = b2;
                i7 = i3;
                i6 = i2;
                i2 = i4;
            }
            staggeredGridLayoutManager.G0(view, i7, i5, i6, i2);
            if (layoutParams.j) {
                T2(this.C.e, i);
            } else {
                Z2(eVar2, this.C.e, i);
            }
            J2(uVar2, this.C);
            if (this.C.h && b2.hasFocusable()) {
                if (layoutParams.j) {
                    this.F.clear();
                } else {
                    this.F.set(eVar2.e, false);
                    z2 = true;
                    r9 = 0;
                }
            }
            z2 = true;
            r9 = 0;
        }
        if (!z2) {
            J2(uVar2, this.C);
        }
        int m2 = this.C.e == -1 ? this.y.m() - x2(this.y.m()) : u2(this.y.i()) - this.y.i();
        if (m2 > 0) {
            return Math.min(iVar2.b, m2);
        }
        return 0;
    }

    private int l2(int i) {
        int T2 = T();
        for (int i2 = 0; i2 < T2; i2++) {
            int n0 = n0(S(i2));
            if (n0 >= 0 && n0 < i) {
                return n0;
            }
        }
        return 0;
    }

    private int p2(int i) {
        for (int T2 = T() - 1; T2 >= 0; T2--) {
            int n0 = n0(S(T2));
            if (n0 >= 0 && n0 < i) {
                return n0;
            }
        }
        return 0;
    }

    private void q2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z2) {
        int i;
        int u2 = u2(Integer.MIN_VALUE);
        if (u2 != Integer.MIN_VALUE && (i = this.y.i() - u2) > 0) {
            int i2 = i - (-O2(-i, uVar, zVar));
            if (z2 && i2 > 0) {
                this.y.r(i2);
            }
        }
    }

    private void r2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z2) {
        int m;
        int x2 = x2(Integer.MAX_VALUE);
        if (x2 != Integer.MAX_VALUE && (m = x2 - this.y.m()) > 0) {
            int O2 = m - O2(m, uVar, zVar);
            if (z2 && O2 > 0) {
                this.y.r(-O2);
            }
        }
    }

    private int u2(int i) {
        int l = this.x[0].l(i);
        for (int i2 = 1; i2 < this.w; i2++) {
            int l2 = this.x[i2].l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    private int v2(int i) {
        int p = this.x[0].p(i);
        for (int i2 = 1; i2 < this.w; i2++) {
            int p2 = this.x[i2].p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    private int w2(int i) {
        int l = this.x[0].l(i);
        for (int i2 = 1; i2 < this.w; i2++) {
            int l2 = this.x[i2].l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    private int x2(int i) {
        int p = this.x[0].p(i);
        for (int i2 = 1; i2 < this.w; i2++) {
            int p2 = this.x[i2].p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    private e y2(i iVar) {
        int i;
        int i2;
        int i3 = -1;
        if (G2(iVar.e)) {
            i2 = this.w - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.w;
            i = 1;
        }
        e eVar = null;
        if (iVar.e == 1) {
            int i4 = Integer.MAX_VALUE;
            int m = this.y.m();
            while (i2 != i3) {
                e eVar2 = this.x[i2];
                int l = eVar2.l(m);
                if (l < i4) {
                    eVar = eVar2;
                    i4 = l;
                }
                i2 += i;
            }
            return eVar;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = this.y.i();
        while (i2 != i3) {
            e eVar3 = this.x[i2];
            int p = eVar3.p(i6);
            if (p > i5) {
                eVar = eVar3;
                i5 = p;
            }
            i2 += i;
        }
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void z2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.E
            if (r0 == 0) goto L_0x0009
            int r0 = r6.t2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.s2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r4 = r6.I
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.I
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = r6.I
            r7.j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.I
            r9.k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.I
            r9.j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.E
            if (r7 == 0) goto L_0x004d
            int r7 = r6.s2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.t2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.B1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.z2(int, int, int):void");
    }

    public int A(RecyclerView.z zVar) {
        return d2(zVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A2() {
        /*
            r12 = this;
            int r0 = r12.T()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.w
            r2.<init>(r3)
            int r3 = r12.w
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.A
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.C2()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.E
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.S(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r9 = r8.i
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r9 = r8.i
            boolean r9 = r12.c2(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r9 = r8.i
            int r9 = r9.e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.j
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.S(r9)
            boolean r10 = r12.E
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.n r10 = r12.y
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.n r11 = r12.y
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.n r10 = r12.y
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.n r11 = r12.y
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r8 = r8.i
            int r8 = r8.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r9 = r9.i
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A2():android.view.View");
    }

    public int B(RecyclerView.z zVar) {
        return e2(zVar);
    }

    public void B2() {
        this.I.b();
        B1();
    }

    public int C(RecyclerView.z zVar) {
        return f2(zVar);
    }

    /* access modifiers changed from: package-private */
    public boolean C2() {
        return j0() == 1;
    }

    public int D(RecyclerView.z zVar) {
        return d2(zVar);
    }

    public int E(RecyclerView.z zVar) {
        return e2(zVar);
    }

    public int E1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        return O2(i, uVar, zVar);
    }

    public int F(RecyclerView.z zVar) {
        return f2(zVar);
    }

    public void F1(int i) {
        d dVar = this.M;
        if (!(dVar == null || dVar.e == i)) {
            dVar.a();
        }
        this.G = i;
        this.H = Integer.MIN_VALUE;
        B1();
    }

    public int G1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        return O2(i, uVar, zVar);
    }

    /* access modifiers changed from: package-private */
    public void H2(int i, RecyclerView.z zVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = t2();
            i2 = 1;
        } else {
            i3 = s2();
            i2 = -1;
        }
        this.C.a = true;
        X2(i3, zVar);
        P2(i2);
        i iVar = this.C;
        iVar.c = i3 + iVar.d;
        iVar.b = Math.abs(i);
    }

    public void J0(int i) {
        super.J0(i);
        for (int i2 = 0; i2 < this.w; i2++) {
            this.x[i2].r(i);
        }
    }

    public void K0(int i) {
        super.K0(i);
        for (int i2 = 0; i2 < this.w; i2++) {
            this.x[i2].r(i);
        }
    }

    public void L1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A == 1) {
            i4 = RecyclerView.o.x(i2, rect.height() + paddingTop, l0());
            i3 = RecyclerView.o.x(i, (this.B * this.w) + paddingLeft, m0());
        } else {
            i3 = RecyclerView.o.x(i, rect.width() + paddingLeft, m0());
            i4 = RecyclerView.o.x(i2, (this.B * this.w) + paddingTop, l0());
        }
        K1(i3, i4);
    }

    public RecyclerView.LayoutParams N() {
        return this.A == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    public RecyclerView.LayoutParams O(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    public int O2(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (T() == 0 || i == 0) {
            return 0;
        }
        H2(i, zVar);
        int k2 = k2(uVar, this.C, zVar);
        if (this.C.b >= k2) {
            i = i < 0 ? -k2 : k2;
        }
        this.y.r(-i);
        this.K = this.E;
        i iVar = this.C;
        iVar.b = 0;
        J2(uVar, iVar);
        return i;
    }

    public RecyclerView.LayoutParams P(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public void P0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.P0(recyclerView, uVar);
        w1(this.T);
        for (int i = 0; i < this.w; i++) {
            this.x[i].e();
        }
        recyclerView.requestLayout();
    }

    public View Q0(View view, int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        View L2;
        View m;
        if (T() == 0 || (L2 = L(view)) == null) {
            return null;
        }
        N2();
        int g2 = g2(i);
        if (g2 == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) L2.getLayoutParams();
        boolean z2 = layoutParams.j;
        e eVar = layoutParams.i;
        int t2 = g2 == 1 ? t2() : s2();
        X2(t2, zVar);
        P2(g2);
        i iVar = this.C;
        iVar.c = iVar.d + t2;
        iVar.b = (int) (((float) this.y.n()) * 0.33333334f);
        i iVar2 = this.C;
        iVar2.h = true;
        iVar2.a = false;
        k2(uVar, iVar2, zVar);
        this.K = this.E;
        if (!z2 && (m = eVar.m(t2, g2)) != null && m != L2) {
            return m;
        }
        if (G2(g2)) {
            for (int i2 = this.w - 1; i2 >= 0; i2--) {
                View m2 = this.x[i2].m(t2, g2);
                if (m2 != null && m2 != L2) {
                    return m2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.w; i3++) {
                View m3 = this.x[i3].m(t2, g2);
                if (m3 != null && m3 != L2) {
                    return m3;
                }
            }
        }
        boolean z3 = (this.D ^ true) == (g2 == -1);
        if (!z2) {
            View M2 = M(z3 ? eVar.f() : eVar.g());
            if (!(M2 == null || M2 == L2)) {
                return M2;
            }
        }
        if (G2(g2)) {
            for (int i4 = this.w - 1; i4 >= 0; i4--) {
                if (i4 != eVar.e) {
                    e[] eVarArr = this.x;
                    View M3 = M(z3 ? eVarArr[i4].f() : eVarArr[i4].g());
                    if (!(M3 == null || M3 == L2)) {
                        return M3;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.w; i5++) {
                e[] eVarArr2 = this.x;
                View M4 = M(z3 ? eVarArr2[i5].f() : eVarArr2[i5].g());
                if (M4 != null && M4 != L2) {
                    return M4;
                }
            }
        }
        return null;
    }

    public void Q2(int i) {
        if (i == 0 || i == 1) {
            q((String) null);
            if (i != this.A) {
                this.A = i;
                n nVar = this.y;
                this.y = this.z;
                this.z = nVar;
                B1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void R0(AccessibilityEvent accessibilityEvent) {
        super.R0(accessibilityEvent);
        if (T() > 0) {
            View n2 = n2(false);
            View m2 = m2(false);
            if (n2 != null && m2 != null) {
                int n0 = n0(n2);
                int n02 = n0(m2);
                if (n0 < n02) {
                    accessibilityEvent.setFromIndex(n0);
                    accessibilityEvent.setToIndex(n02);
                    return;
                }
                accessibilityEvent.setFromIndex(n02);
                accessibilityEvent.setToIndex(n0);
            }
        }
    }

    public void R1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        j jVar = new j(recyclerView.getContext());
        jVar.p(i);
        S1(jVar);
    }

    public void R2(boolean z2) {
        q((String) null);
        d dVar = this.M;
        if (!(dVar == null || dVar.l == z2)) {
            dVar.l = z2;
        }
        this.D = z2;
        B1();
    }

    public void S2(int i) {
        q((String) null);
        if (i != this.w) {
            B2();
            this.w = i;
            this.F = new BitSet(this.w);
            this.x = new e[this.w];
            for (int i2 = 0; i2 < this.w; i2++) {
                this.x[i2] = new e(i2);
            }
            B1();
        }
    }

    public boolean U1() {
        return this.M == null;
    }

    /* access modifiers changed from: package-private */
    public boolean V2(RecyclerView.z zVar, b bVar) {
        int i;
        int i2;
        int i3;
        boolean z2 = false;
        if (!zVar.e() && (i = this.G) != -1) {
            if (i < 0 || i >= zVar.b()) {
                this.G = -1;
                this.H = Integer.MIN_VALUE;
            } else {
                d dVar = this.M;
                if (dVar == null || dVar.e == -1 || dVar.g < 1) {
                    View M2 = M(this.G);
                    if (M2 != null) {
                        bVar.a = this.E ? t2() : s2();
                        if (this.H != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                i3 = this.y.i() - this.H;
                                i2 = this.y.d(M2);
                            } else {
                                i3 = this.y.m() + this.H;
                                i2 = this.y.g(M2);
                            }
                            bVar.b = i3 - i2;
                            return true;
                        } else if (this.y.e(M2) > this.y.n()) {
                            bVar.b = bVar.c ? this.y.i() : this.y.m();
                            return true;
                        } else {
                            int g = this.y.g(M2) - this.y.m();
                            if (g < 0) {
                                bVar.b = -g;
                                return true;
                            }
                            int i4 = this.y.i() - this.y.d(M2);
                            if (i4 < 0) {
                                bVar.b = i4;
                                return true;
                            }
                            bVar.b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i5 = this.G;
                        bVar.a = i5;
                        int i6 = this.H;
                        if (i6 == Integer.MIN_VALUE) {
                            if (a2(i5) == 1) {
                                z2 = true;
                            }
                            bVar.c = z2;
                            bVar.a();
                        } else {
                            bVar.b(i6);
                        }
                        bVar.d = true;
                    }
                } else {
                    bVar.b = Integer.MIN_VALUE;
                    bVar.a = this.G;
                }
                return true;
            }
        }
        return false;
    }

    public void W0(RecyclerView.u uVar, RecyclerView.z zVar, View view, a5 a5Var) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.V0(view, a5Var);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (this.A == 0) {
            i4 = layoutParams2.e();
            i3 = layoutParams2.j ? this.w : 1;
            i2 = -1;
            i = -1;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = layoutParams2.e();
            i = layoutParams2.j ? this.w : 1;
        }
        a5Var.g0(a5.c.f(i4, i3, i2, i, false, false));
    }

    /* access modifiers changed from: package-private */
    public void W2(RecyclerView.z zVar, b bVar) {
        if (!V2(zVar, bVar) && !U2(zVar, bVar)) {
            bVar.a();
            bVar.a = 0;
        }
    }

    public int X(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.A == 1 ? this.w : super.X(uVar, zVar);
    }

    /* access modifiers changed from: package-private */
    public boolean X1() {
        int l = this.x[0].l(Integer.MIN_VALUE);
        for (int i = 1; i < this.w; i++) {
            if (this.x[i].l(Integer.MIN_VALUE) != l) {
                return false;
            }
        }
        return true;
    }

    public void Y0(RecyclerView recyclerView, int i, int i2) {
        z2(i, i2, 1);
    }

    /* access modifiers changed from: package-private */
    public boolean Y1() {
        int p = this.x[0].p(Integer.MIN_VALUE);
        for (int i = 1; i < this.w; i++) {
            if (this.x[i].p(Integer.MIN_VALUE) != p) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void Y2(int i) {
        this.B = i / this.w;
        this.N = View.MeasureSpec.makeMeasureSpec(i, this.z.k());
    }

    public void Z0(RecyclerView recyclerView) {
        this.I.b();
        B1();
    }

    public PointF a(int i) {
        int a2 = a2(i);
        PointF pointF = new PointF();
        if (a2 == 0) {
            return null;
        }
        if (this.A == 0) {
            pointF.x = (float) a2;
            pointF.y = Utils.FLOAT_EPSILON;
        } else {
            pointF.x = Utils.FLOAT_EPSILON;
            pointF.y = (float) a2;
        }
        return pointF;
    }

    public void a1(RecyclerView recyclerView, int i, int i2, int i3) {
        z2(i, i2, 8);
    }

    public void b1(RecyclerView recyclerView, int i, int i2) {
        z2(i, i2, 2);
    }

    /* access modifiers changed from: package-private */
    public boolean b2() {
        int i;
        int i2;
        if (T() == 0 || this.J == 0 || !x0()) {
            return false;
        }
        if (this.E) {
            i2 = t2();
            i = s2();
        } else {
            i2 = s2();
            i = t2();
        }
        if (i2 == 0 && A2() != null) {
            this.I.b();
        } else if (!this.Q) {
            return false;
        } else {
            int i3 = this.E ? -1 : 1;
            int i4 = i + 1;
            c.a e2 = this.I.e(i2, i4, i3, true);
            if (e2 == null) {
                this.Q = false;
                this.I.d(i4);
                return false;
            }
            c.a e3 = this.I.e(i2, e2.e, i3 * -1, true);
            if (e3 == null) {
                this.I.d(e2.e);
            } else {
                this.I.d(e3.e + 1);
            }
        }
        C1();
        B1();
        return true;
    }

    public void d1(RecyclerView recyclerView, int i, int i2, Object obj) {
        z2(i, i2, 4);
    }

    public void e1(RecyclerView.u uVar, RecyclerView.z zVar) {
        F2(uVar, zVar, true);
    }

    public void f1(RecyclerView.z zVar) {
        super.f1(zVar);
        this.G = -1;
        this.H = Integer.MIN_VALUE;
        this.M = null;
        this.P.c();
    }

    public void j1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.M = (d) parcelable;
            B1();
        }
    }

    public Parcelable k1() {
        int i;
        int i2;
        int[] iArr;
        if (this.M != null) {
            return new d(this.M);
        }
        d dVar = new d();
        dVar.l = this.D;
        dVar.m = this.K;
        dVar.n = this.L;
        c cVar = this.I;
        if (cVar == null || (iArr = cVar.a) == null) {
            dVar.i = 0;
        } else {
            dVar.j = iArr;
            dVar.i = iArr.length;
            dVar.k = cVar.b;
        }
        if (T() > 0) {
            dVar.e = this.K ? t2() : s2();
            dVar.f = o2();
            int i3 = this.w;
            dVar.g = i3;
            dVar.h = new int[i3];
            for (int i4 = 0; i4 < this.w; i4++) {
                if (this.K) {
                    i = this.x[i4].l(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.y.i();
                    } else {
                        dVar.h[i4] = i;
                    }
                } else {
                    i = this.x[i4].p(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.y.m();
                    } else {
                        dVar.h[i4] = i;
                    }
                }
                i -= i2;
                dVar.h[i4] = i;
            }
        } else {
            dVar.e = -1;
            dVar.f = -1;
            dVar.g = 0;
        }
        return dVar;
    }

    public void l1(int i) {
        if (i == 0) {
            b2();
        }
    }

    /* access modifiers changed from: package-private */
    public View m2(boolean z2) {
        int m = this.y.m();
        int i = this.y.i();
        View view = null;
        for (int T2 = T() - 1; T2 >= 0; T2--) {
            View S2 = S(T2);
            int g = this.y.g(S2);
            int d2 = this.y.d(S2);
            if (d2 > m && g < i) {
                if (d2 <= i || !z2) {
                    return S2;
                }
                if (view == null) {
                    view = S2;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public View n2(boolean z2) {
        int m = this.y.m();
        int i = this.y.i();
        int T2 = T();
        View view = null;
        for (int i2 = 0; i2 < T2; i2++) {
            View S2 = S(i2);
            int g = this.y.g(S2);
            if (this.y.d(S2) > m && g < i) {
                if (g >= m || !z2) {
                    return S2;
                }
                if (view == null) {
                    view = S2;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public int o2() {
        View m2 = this.E ? m2(true) : n2(true);
        if (m2 == null) {
            return -1;
        }
        return n0(m2);
    }

    public void q(String str) {
        if (this.M == null) {
            super.q(str);
        }
    }

    public int q0(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.A == 0 ? this.w : super.q0(uVar, zVar);
    }

    /* access modifiers changed from: package-private */
    public int s2() {
        if (T() == 0) {
            return 0;
        }
        return n0(S(0));
    }

    /* access modifiers changed from: package-private */
    public int t2() {
        int T2 = T();
        if (T2 == 0) {
            return 0;
        }
        return n0(S(T2 - 1));
    }

    public boolean u() {
        return this.A == 0;
    }

    public boolean v() {
        return this.A == 1;
    }

    public boolean w(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void y(int i, int i2, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        int i3;
        int i4;
        if (this.A != 0) {
            i = i2;
        }
        if (T() != 0 && i != 0) {
            H2(i, zVar);
            int[] iArr = this.S;
            if (iArr == null || iArr.length < this.w) {
                this.S = new int[this.w];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.w; i6++) {
                i iVar = this.C;
                if (iVar.d == -1) {
                    i4 = iVar.f;
                    i3 = this.x[i6].p(i4);
                } else {
                    i4 = this.x[i6].l(iVar.g);
                    i3 = this.C.g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.S[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.S, 0, i5);
            for (int i8 = 0; i8 < i5 && this.C.a(zVar); i8++) {
                cVar.a(this.C.c, this.S[i8]);
                i iVar2 = this.C;
                iVar2.c += iVar2.d;
            }
        }
    }

    public boolean y0() {
        return this.J != 0;
    }
}
