package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public abstract class Transition implements Cloneable {
    private static final int[] K = {2, 1, 3, 4};
    private static final PathMotion L = new a();
    private static ThreadLocal<b0<Animator, d>> M = new ThreadLocal<>();
    ArrayList<Animator> A = new ArrayList<>();
    private int B = 0;
    private boolean C = false;
    private boolean D = false;
    private ArrayList<f> E = null;
    private ArrayList<Animator> F = new ArrayList<>();
    v G;
    private e H;
    private b0<String, String> I;
    private PathMotion J = L;
    private String e = getClass().getName();
    private long f = -1;
    long g = -1;
    private TimeInterpolator h = null;
    ArrayList<Integer> i = new ArrayList<>();
    ArrayList<View> j = new ArrayList<>();
    private ArrayList<String> k = null;
    private ArrayList<Class<?>> l = null;
    private ArrayList<Integer> m = null;
    private ArrayList<View> n = null;
    private ArrayList<Class<?>> o = null;
    private ArrayList<String> p = null;
    private ArrayList<Integer> q = null;
    private ArrayList<View> r = null;
    private ArrayList<Class<?>> s = null;
    private y t = new y();
    private y u = new y();
    TransitionSet v = null;
    private int[] w = K;
    private ArrayList<x> x;
    private ArrayList<x> y;
    boolean z = false;

    static class a extends PathMotion {
        a() {
        }

        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {
        final /* synthetic */ b0 e;

        b(b0 b0Var) {
            this.e = b0Var;
        }

        public void onAnimationEnd(Animator animator) {
            this.e.remove(animator);
            Transition.this.A.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            Transition.this.A.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            Transition.this.v();
            animator.removeListener(this);
        }
    }

    private static class d {
        View a;
        String b;
        x c;
        s0 d;
        Transition e;

        d(View view, String str, Transition transition, s0 s0Var, x xVar) {
            this.a = view;
            this.b = str;
            this.c = xVar;
            this.d = s0Var;
            this.e = transition;
        }
    }

    public static abstract class e {
        public abstract Rect a(Transition transition);
    }

    public interface f {
        void a(Transition transition);

        void b(Transition transition);

        void c(Transition transition);

        void d(Transition transition);

        void e(Transition transition);
    }

    public Transition() {
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long k2 = (long) i2.k(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (k2 >= 0) {
            o0(k2);
        }
        long k3 = (long) i2.k(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (k3 > 0) {
            u0(k3);
        }
        int l2 = i2.l(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (l2 > 0) {
            q0(AnimationUtils.loadInterpolator(context, l2));
        }
        String m2 = i2.m(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m2 != null) {
            r0(e0(m2));
        }
        obtainStyledAttributes.recycle();
    }

    private static b0<Animator, d> H() {
        b0<Animator, d> b0Var = M.get();
        if (b0Var != null) {
            return b0Var;
        }
        b0<Animator, d> b0Var2 = new b0<>();
        M.set(b0Var2);
        return b0Var2;
    }

    private static boolean U(int i2) {
        return i2 >= 1 && i2 <= 4;
    }

    private static boolean W(x xVar, x xVar2, String str) {
        Object obj = xVar.a.get(str);
        Object obj2 = xVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void X(b0<View, x> b0Var, b0<View, x> b0Var2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View valueAt = sparseArray.valueAt(i2);
            if (valueAt != null && V(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && V(view)) {
                x xVar = b0Var.get(valueAt);
                x xVar2 = b0Var2.get(view);
                if (!(xVar == null || xVar2 == null)) {
                    this.x.add(xVar);
                    this.y.add(xVar2);
                    b0Var.remove(valueAt);
                    b0Var2.remove(view);
                }
            }
        }
    }

    private void Z(b0<View, x> b0Var, b0<View, x> b0Var2) {
        x remove;
        for (int size = b0Var.size() - 1; size >= 0; size--) {
            View i2 = b0Var.i(size);
            if (i2 != null && V(i2) && (remove = b0Var2.remove(i2)) != null && V(remove.b)) {
                this.x.add(b0Var.k(size));
                this.y.add(remove);
            }
        }
    }

    private void a0(b0<View, x> b0Var, b0<View, x> b0Var2, e0<View> e0Var, e0<View> e0Var2) {
        View g2;
        int s2 = e0Var.s();
        for (int i2 = 0; i2 < s2; i2++) {
            View t2 = e0Var.t(i2);
            if (t2 != null && V(t2) && (g2 = e0Var2.g(e0Var.o(i2))) != null && V(g2)) {
                x xVar = b0Var.get(t2);
                x xVar2 = b0Var2.get(g2);
                if (!(xVar == null || xVar2 == null)) {
                    this.x.add(xVar);
                    this.y.add(xVar2);
                    b0Var.remove(t2);
                    b0Var2.remove(g2);
                }
            }
        }
    }

    private void b0(b0<View, x> b0Var, b0<View, x> b0Var2, b0<String, View> b0Var3, b0<String, View> b0Var4) {
        View view;
        int size = b0Var3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View m2 = b0Var3.m(i2);
            if (m2 != null && V(m2) && (view = b0Var4.get(b0Var3.i(i2))) != null && V(view)) {
                x xVar = b0Var.get(m2);
                x xVar2 = b0Var2.get(view);
                if (!(xVar == null || xVar2 == null)) {
                    this.x.add(xVar);
                    this.y.add(xVar2);
                    b0Var.remove(m2);
                    b0Var2.remove(view);
                }
            }
        }
    }

    private void c0(y yVar, y yVar2) {
        b0 b0Var = new b0((h0) yVar.a);
        b0 b0Var2 = new b0((h0) yVar2.a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.w;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 == 1) {
                    Z(b0Var, b0Var2);
                } else if (i3 == 2) {
                    b0(b0Var, b0Var2, yVar.d, yVar2.d);
                } else if (i3 == 3) {
                    X(b0Var, b0Var2, yVar.b, yVar2.b);
                } else if (i3 == 4) {
                    a0(b0Var, b0Var2, yVar.c, yVar2.c);
                }
                i2++;
            } else {
                d(b0Var, b0Var2);
                return;
            }
        }
    }

    private void d(b0<View, x> b0Var, b0<View, x> b0Var2) {
        for (int i2 = 0; i2 < b0Var.size(); i2++) {
            x m2 = b0Var.m(i2);
            if (V(m2.b)) {
                this.x.add(m2);
                this.y.add((Object) null);
            }
        }
        for (int i3 = 0; i3 < b0Var2.size(); i3++) {
            x m3 = b0Var2.m(i3);
            if (V(m3.b)) {
                this.y.add(m3);
                this.x.add((Object) null);
            }
        }
    }

    private static void e(y yVar, View view, x xVar) {
        yVar.a.put(view, xVar);
        int id = view.getId();
        if (id >= 0) {
            if (yVar.b.indexOfKey(id) >= 0) {
                yVar.b.put(id, (Object) null);
            } else {
                yVar.b.put(id, view);
            }
        }
        String F2 = o4.F(view);
        if (F2 != null) {
            if (yVar.d.containsKey(F2)) {
                yVar.d.put(F2, null);
            } else {
                yVar.d.put(F2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (yVar.c.n(itemIdAtPosition) >= 0) {
                    View g2 = yVar.c.g(itemIdAtPosition);
                    if (g2 != null) {
                        o4.r0(g2, false);
                        yVar.c.p(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                o4.r0(view, true);
                yVar.c.p(itemIdAtPosition, view);
            }
        }
    }

    private static int[] e0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i2] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i2] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i2] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i2] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                i2--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i2++;
        }
        return iArr;
    }

    private static boolean f(int[] iArr, int i2) {
        int i3 = iArr[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            if (iArr[i4] == i3) {
                return true;
            }
        }
        return false;
    }

    private void l0(Animator animator, b0<Animator, d> b0Var) {
        if (animator != null) {
            animator.addListener(new b(b0Var));
            g(animator);
        }
    }

    private void n(View view, boolean z2) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.m;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.n;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.o;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            if (!this.o.get(i2).isInstance(view)) {
                                i2++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        x xVar = new x(view);
                        if (z2) {
                            p(xVar);
                        } else {
                            j(xVar);
                        }
                        xVar.c.add(this);
                        o(xVar);
                        e(z2 ? this.t : this.u, view, xVar);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.q;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.r;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.s;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i3 = 0;
                                    while (i3 < size2) {
                                        if (!this.s.get(i3).isInstance(view)) {
                                            i3++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                    n(viewGroup.getChildAt(i4), z2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public TimeInterpolator A() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public x B(View view, boolean z2) {
        TransitionSet transitionSet = this.v;
        if (transitionSet != null) {
            return transitionSet.B(view, z2);
        }
        ArrayList<x> arrayList = z2 ? this.x : this.y;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            x xVar = arrayList.get(i3);
            if (xVar == null) {
                return null;
            }
            if (xVar.b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 < 0) {
            return null;
        }
        return (z2 ? this.y : this.x).get(i2);
    }

    public String C() {
        return this.e;
    }

    public PathMotion D() {
        return this.J;
    }

    public v G() {
        return this.G;
    }

    public long I() {
        return this.f;
    }

    public List<Integer> K() {
        return this.i;
    }

    public List<String> L() {
        return this.k;
    }

    public List<Class<?>> O() {
        return this.l;
    }

    public List<View> P() {
        return this.j;
    }

    public String[] R() {
        return null;
    }

    public x S(View view, boolean z2) {
        TransitionSet transitionSet = this.v;
        if (transitionSet != null) {
            return transitionSet.S(view, z2);
        }
        return (z2 ? this.t : this.u).a.get(view);
    }

    public boolean T(x xVar, x xVar2) {
        if (xVar == null || xVar2 == null) {
            return false;
        }
        String[] R = R();
        if (R != null) {
            int length = R.length;
            int i2 = 0;
            while (i2 < length) {
                if (!W(xVar, xVar2, R[i2])) {
                    i2++;
                }
            }
            return false;
        }
        for (String W : xVar.a.keySet()) {
            if (W(xVar, xVar2, W)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean V(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.m;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.n;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.o;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.o.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.p != null && o4.F(view) != null && this.p.contains(o4.F(view))) {
            return false;
        }
        if ((this.i.size() == 0 && this.j.size() == 0 && (((arrayList = this.l) == null || arrayList.isEmpty()) && ((arrayList2 = this.k) == null || arrayList2.isEmpty()))) || this.i.contains(Integer.valueOf(id)) || this.j.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.k;
        if (arrayList6 != null && arrayList6.contains(o4.F(view))) {
            return true;
        }
        if (this.l != null) {
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                if (this.l.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Transition b(f fVar) {
        if (this.E == null) {
            this.E = new ArrayList<>();
        }
        this.E.add(fVar);
        return this;
    }

    public Transition c(View view) {
        this.j.add(view);
        return this;
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.A.size() - 1; size >= 0; size--) {
            this.A.get(size).cancel();
        }
        ArrayList<f> arrayList = this.E;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.E.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((f) arrayList2.get(i2)).d(this);
            }
        }
    }

    public void f0(View view) {
        if (!this.D) {
            b0<Animator, d> H2 = H();
            int size = H2.size();
            s0 d2 = i0.d(view);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d m2 = H2.m(i2);
                if (m2.a != null && d2.equals(m2.d)) {
                    a.b(H2.i(i2));
                }
            }
            ArrayList<f> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((f) arrayList2.get(i3)).b(this);
                }
            }
            this.C = true;
        }
    }

    /* access modifiers changed from: protected */
    public void g(Animator animator) {
        if (animator == null) {
            v();
            return;
        }
        if (w() >= 0) {
            animator.setDuration(w());
        }
        if (I() >= 0) {
            animator.setStartDelay(I() + animator.getStartDelay());
        }
        if (A() != null) {
            animator.setInterpolator(A());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* access modifiers changed from: package-private */
    public void g0(ViewGroup viewGroup) {
        d dVar;
        this.x = new ArrayList<>();
        this.y = new ArrayList<>();
        c0(this.t, this.u);
        b0<Animator, d> H2 = H();
        int size = H2.size();
        s0 d2 = i0.d(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator i3 = H2.i(i2);
            if (!(i3 == null || (dVar = H2.get(i3)) == null || dVar.a == null || !d2.equals(dVar.d))) {
                x xVar = dVar.c;
                View view = dVar.a;
                x S = S(view, true);
                x B2 = B(view, true);
                if (S == null && B2 == null) {
                    B2 = this.u.a.get(view);
                }
                if (!(S == null && B2 == null) && dVar.e.T(xVar, B2)) {
                    if (i3.isRunning() || i3.isStarted()) {
                        i3.cancel();
                    } else {
                        H2.remove(i3);
                    }
                }
            }
        }
        u(viewGroup, this.t, this.u, this.x, this.y);
        n0();
    }

    public Transition h0(f fVar) {
        ArrayList<f> arrayList = this.E;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.E.size() == 0) {
            this.E = null;
        }
        return this;
    }

    public Transition i0(View view) {
        this.j.remove(view);
        return this;
    }

    public abstract void j(x xVar);

    public void k0(View view) {
        if (this.C) {
            if (!this.D) {
                b0<Animator, d> H2 = H();
                int size = H2.size();
                s0 d2 = i0.d(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    d m2 = H2.m(i2);
                    if (m2.a != null && d2.equals(m2.d)) {
                        a.c(H2.i(i2));
                    }
                }
                ArrayList<f> arrayList = this.E;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.E.clone();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((f) arrayList2.get(i3)).e(this);
                    }
                }
            }
            this.C = false;
        }
    }

    /* access modifiers changed from: protected */
    public void n0() {
        v0();
        b0<Animator, d> H2 = H();
        Iterator<Animator> it = this.F.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (H2.containsKey(next)) {
                v0();
                l0(next, H2);
            }
        }
        this.F.clear();
        v();
    }

    /* access modifiers changed from: package-private */
    public void o(x xVar) {
        String[] b2;
        if (this.G != null && !xVar.a.isEmpty() && (b2 = this.G.b()) != null) {
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= b2.length) {
                    z2 = true;
                    break;
                } else if (!xVar.a.containsKey(b2[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z2) {
                this.G.a(xVar);
            }
        }
    }

    public Transition o0(long j2) {
        this.g = j2;
        return this;
    }

    public abstract void p(x xVar);

    public void p0(e eVar) {
        this.H = eVar;
    }

    /* access modifiers changed from: package-private */
    public void q(ViewGroup viewGroup, boolean z2) {
        b0<String, String> b0Var;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        r(z2);
        if ((this.i.size() > 0 || this.j.size() > 0) && (((arrayList = this.k) == null || arrayList.isEmpty()) && ((arrayList2 = this.l) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.i.get(i2).intValue());
                if (findViewById != null) {
                    x xVar = new x(findViewById);
                    if (z2) {
                        p(xVar);
                    } else {
                        j(xVar);
                    }
                    xVar.c.add(this);
                    o(xVar);
                    e(z2 ? this.t : this.u, findViewById, xVar);
                }
            }
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                View view = this.j.get(i3);
                x xVar2 = new x(view);
                if (z2) {
                    p(xVar2);
                } else {
                    j(xVar2);
                }
                xVar2.c.add(this);
                o(xVar2);
                e(z2 ? this.t : this.u, view, xVar2);
            }
        } else {
            n(viewGroup, z2);
        }
        if (!z2 && (b0Var = this.I) != null) {
            int size = b0Var.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList3.add(this.t.d.remove(this.I.i(i4)));
            }
            for (int i5 = 0; i5 < size; i5++) {
                View view2 = (View) arrayList3.get(i5);
                if (view2 != null) {
                    this.t.d.put(this.I.m(i5), view2);
                }
            }
        }
    }

    public Transition q0(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z2) {
        y yVar;
        if (z2) {
            this.t.a.clear();
            this.t.b.clear();
            yVar = this.t;
        } else {
            this.u.a.clear();
            this.u.b.clear();
            yVar = this.u;
        }
        yVar.c.c();
    }

    public void r0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.w = K;
            return;
        }
        int i2 = 0;
        while (i2 < iArr.length) {
            if (!U(iArr[i2])) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (!f(iArr, i2)) {
                i2++;
            } else {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.w = (int[]) iArr.clone();
    }

    /* renamed from: s */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.F = new ArrayList<>();
            transition.t = new y();
            transition.u = new y();
            transition.x = null;
            transition.y = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void s0(PathMotion pathMotion) {
        if (pathMotion == null) {
            pathMotion = L;
        }
        this.J = pathMotion;
    }

    public Animator t(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    public void t0(v vVar) {
        this.G = vVar;
    }

    public String toString() {
        return w0("");
    }

    /* access modifiers changed from: protected */
    public void u(ViewGroup viewGroup, y yVar, y yVar2, ArrayList<x> arrayList, ArrayList<x> arrayList2) {
        int i2;
        int i3;
        Animator t2;
        View view;
        Animator animator;
        x xVar;
        x xVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        b0<Animator, d> H2 = H();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            x xVar3 = arrayList.get(i4);
            x xVar4 = arrayList2.get(i4);
            if (xVar3 != null && !xVar3.c.contains(this)) {
                xVar3 = null;
            }
            if (xVar4 != null && !xVar4.c.contains(this)) {
                xVar4 = null;
            }
            if (!(xVar3 == null && xVar4 == null)) {
                if ((xVar3 == null || xVar4 == null || T(xVar3, xVar4)) && (t2 = t(viewGroup2, xVar3, xVar4)) != null) {
                    if (xVar4 != null) {
                        view = xVar4.b;
                        String[] R = R();
                        if (R != null && R.length > 0) {
                            xVar2 = new x(view);
                            Animator animator3 = t2;
                            i3 = size;
                            x xVar5 = yVar2.a.get(view);
                            if (xVar5 != null) {
                                int i5 = 0;
                                while (i5 < R.length) {
                                    xVar2.a.put(R[i5], xVar5.a.get(R[i5]));
                                    i5++;
                                    ArrayList<x> arrayList3 = arrayList2;
                                    i4 = i4;
                                    xVar5 = xVar5;
                                }
                            }
                            i2 = i4;
                            int size2 = H2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                d dVar = H2.get(H2.i(i6));
                                if (dVar.c != null && dVar.a == view && dVar.b.equals(C()) && dVar.c.equals(xVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i3 = size;
                            i2 = i4;
                            animator2 = t2;
                            xVar2 = null;
                        }
                        animator = animator2;
                        xVar = xVar2;
                    } else {
                        i3 = size;
                        i2 = i4;
                        view = xVar3.b;
                        animator = t2;
                        xVar = null;
                    }
                    if (animator != null) {
                        v vVar = this.G;
                        if (vVar != null) {
                            long c2 = vVar.c(viewGroup2, this, xVar3, xVar4);
                            sparseIntArray.put(this.F.size(), (int) c2);
                            j2 = Math.min(c2, j2);
                        }
                        H2.put(animator, new d(view, C(), this, i0.d(viewGroup), xVar));
                        this.F.add(animator);
                        j2 = j2;
                    }
                    i4 = i2 + 1;
                    size = i3;
                }
            }
            i3 = size;
            i2 = i4;
            i4 = i2 + 1;
            size = i3;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator4 = this.F.get(sparseIntArray.keyAt(i7));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i7)) - j2) + animator4.getStartDelay());
            }
        }
    }

    public Transition u0(long j2) {
        this.f = j2;
        return this;
    }

    /* access modifiers changed from: protected */
    public void v() {
        int i2 = this.B - 1;
        this.B = i2;
        if (i2 == 0) {
            ArrayList<f> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((f) arrayList2.get(i3)).c(this);
                }
            }
            for (int i4 = 0; i4 < this.t.c.s(); i4++) {
                View t2 = this.t.c.t(i4);
                if (t2 != null) {
                    o4.r0(t2, false);
                }
            }
            for (int i5 = 0; i5 < this.u.c.s(); i5++) {
                View t3 = this.u.c.t(i5);
                if (t3 != null) {
                    o4.r0(t3, false);
                }
            }
            this.D = true;
        }
    }

    /* access modifiers changed from: protected */
    public void v0() {
        if (this.B == 0) {
            ArrayList<f> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).a(this);
                }
            }
            this.D = false;
        }
        this.B++;
    }

    public long w() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public String w0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.g != -1) {
            str2 = str2 + "dur(" + this.g + ") ";
        }
        if (this.f != -1) {
            str2 = str2 + "dly(" + this.f + ") ";
        }
        if (this.h != null) {
            str2 = str2 + "interp(" + this.h + ") ";
        }
        if (this.i.size() <= 0 && this.j.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.i.size() > 0) {
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.i.get(i2);
            }
        }
        if (this.j.size() > 0) {
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.j.get(i3);
            }
        }
        return str3 + ")";
    }

    public Rect x() {
        e eVar = this.H;
        if (eVar == null) {
            return null;
        }
        return eVar.a(this);
    }

    public e y() {
        return this.H;
    }
}
