package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e extends r {
    private static TimeInterpolator s;
    private ArrayList<RecyclerView.c0> h = new ArrayList<>();
    private ArrayList<RecyclerView.c0> i = new ArrayList<>();
    private ArrayList<j> j = new ArrayList<>();
    private ArrayList<i> k = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.c0>> l = new ArrayList<>();
    ArrayList<ArrayList<j>> m = new ArrayList<>();
    ArrayList<ArrayList<i>> n = new ArrayList<>();
    ArrayList<RecyclerView.c0> o = new ArrayList<>();
    ArrayList<RecyclerView.c0> p = new ArrayList<>();
    ArrayList<RecyclerView.c0> q = new ArrayList<>();
    ArrayList<RecyclerView.c0> r = new ArrayList<>();

    class a implements Runnable {
        final /* synthetic */ ArrayList e;

        a(ArrayList arrayList) {
            this.e = arrayList;
        }

        public void run() {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                e.this.S(jVar.a, jVar.b, jVar.c, jVar.d, jVar.e);
            }
            this.e.clear();
            e.this.m.remove(this.e);
        }
    }

    class b implements Runnable {
        final /* synthetic */ ArrayList e;

        b(ArrayList arrayList) {
            this.e = arrayList;
        }

        public void run() {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                e.this.R((i) it.next());
            }
            this.e.clear();
            e.this.n.remove(this.e);
        }
    }

    class c implements Runnable {
        final /* synthetic */ ArrayList e;

        c(ArrayList arrayList) {
            this.e = arrayList;
        }

        public void run() {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                e.this.Q((RecyclerView.c0) it.next());
            }
            this.e.clear();
            e.this.l.remove(this.e);
        }
    }

    class d extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.c0 e;
        final /* synthetic */ ViewPropertyAnimator f;
        final /* synthetic */ View g;

        d(RecyclerView.c0 c0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.e = c0Var;
            this.f = viewPropertyAnimator;
            this.g = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f.setListener((Animator.AnimatorListener) null);
            this.g.setAlpha(1.0f);
            e.this.G(this.e);
            e.this.q.remove(this.e);
            e.this.V();
        }

        public void onAnimationStart(Animator animator) {
            e.this.H(this.e);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$e  reason: collision with other inner class name */
    class C0049e extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.c0 e;
        final /* synthetic */ View f;
        final /* synthetic */ ViewPropertyAnimator g;

        C0049e(RecyclerView.c0 c0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.e = c0Var;
            this.f = view;
            this.g = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.g.setListener((Animator.AnimatorListener) null);
            e.this.A(this.e);
            e.this.o.remove(this.e);
            e.this.V();
        }

        public void onAnimationStart(Animator animator) {
            e.this.B(this.e);
        }
    }

    class f extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.c0 e;
        final /* synthetic */ int f;
        final /* synthetic */ View g;
        final /* synthetic */ int h;
        final /* synthetic */ ViewPropertyAnimator i;

        f(RecyclerView.c0 c0Var, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
            this.e = c0Var;
            this.f = i2;
            this.g = view;
            this.h = i3;
            this.i = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f != 0) {
                this.g.setTranslationX(Utils.FLOAT_EPSILON);
            }
            if (this.h != 0) {
                this.g.setTranslationY(Utils.FLOAT_EPSILON);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.i.setListener((Animator.AnimatorListener) null);
            e.this.E(this.e);
            e.this.p.remove(this.e);
            e.this.V();
        }

        public void onAnimationStart(Animator animator) {
            e.this.F(this.e);
        }
    }

    class g extends AnimatorListenerAdapter {
        final /* synthetic */ i e;
        final /* synthetic */ ViewPropertyAnimator f;
        final /* synthetic */ View g;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.e = iVar;
            this.f = viewPropertyAnimator;
            this.g = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f.setListener((Animator.AnimatorListener) null);
            this.g.setAlpha(1.0f);
            this.g.setTranslationX(Utils.FLOAT_EPSILON);
            this.g.setTranslationY(Utils.FLOAT_EPSILON);
            e.this.C(this.e.a, true);
            e.this.r.remove(this.e.a);
            e.this.V();
        }

        public void onAnimationStart(Animator animator) {
            e.this.D(this.e.a, true);
        }
    }

    class h extends AnimatorListenerAdapter {
        final /* synthetic */ i e;
        final /* synthetic */ ViewPropertyAnimator f;
        final /* synthetic */ View g;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.e = iVar;
            this.f = viewPropertyAnimator;
            this.g = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f.setListener((Animator.AnimatorListener) null);
            this.g.setAlpha(1.0f);
            this.g.setTranslationX(Utils.FLOAT_EPSILON);
            this.g.setTranslationY(Utils.FLOAT_EPSILON);
            e.this.C(this.e.b, false);
            e.this.r.remove(this.e.b);
            e.this.V();
        }

        public void onAnimationStart(Animator animator) {
            e.this.D(this.e.b, false);
        }
    }

    private static class i {
        public RecyclerView.c0 a;
        public RecyclerView.c0 b;
        public int c;
        public int d;
        public int e;
        public int f;

        private i(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
            this.a = c0Var;
            this.b = c0Var2;
        }

        i(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i, int i2, int i3, int i4) {
            this(c0Var, c0Var2);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
        }
    }

    private static class j {
        public RecyclerView.c0 a;
        public int b;
        public int c;
        public int d;
        public int e;

        j(RecyclerView.c0 c0Var, int i, int i2, int i3, int i4) {
            this.a = c0Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    private void T(RecyclerView.c0 c0Var) {
        View view = c0Var.e;
        ViewPropertyAnimator animate = view.animate();
        this.q.add(c0Var);
        animate.setDuration(o()).alpha(Utils.FLOAT_EPSILON).setListener(new d(c0Var, animate, view)).start();
    }

    private void W(List<i> list, RecyclerView.c0 c0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, c0Var) && iVar.a == null && iVar.b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.c0 c0Var = iVar.a;
        if (c0Var != null) {
            Y(iVar, c0Var);
        }
        RecyclerView.c0 c0Var2 = iVar.b;
        if (c0Var2 != null) {
            Y(iVar, c0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.c0 c0Var) {
        boolean z = false;
        if (iVar.b == c0Var) {
            iVar.b = null;
        } else if (iVar.a != c0Var) {
            return false;
        } else {
            iVar.a = null;
            z = true;
        }
        c0Var.e.setAlpha(1.0f);
        c0Var.e.setTranslationX(Utils.FLOAT_EPSILON);
        c0Var.e.setTranslationY(Utils.FLOAT_EPSILON);
        C(c0Var, z);
        return true;
    }

    private void Z(RecyclerView.c0 c0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        c0Var.e.animate().setInterpolator(s);
        j(c0Var);
    }

    /* access modifiers changed from: package-private */
    public void Q(RecyclerView.c0 c0Var) {
        View view = c0Var.e;
        ViewPropertyAnimator animate = view.animate();
        this.o.add(c0Var);
        animate.alpha(1.0f).setDuration(l()).setListener(new C0049e(c0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void R(i iVar) {
        RecyclerView.c0 c0Var = iVar.a;
        View view = null;
        View view2 = c0Var == null ? null : c0Var.e;
        RecyclerView.c0 c0Var2 = iVar.b;
        if (c0Var2 != null) {
            view = c0Var2.e;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(m());
            this.r.add(iVar.a);
            duration.translationX((float) (iVar.e - iVar.c));
            duration.translationY((float) (iVar.f - iVar.d));
            duration.alpha(Utils.FLOAT_EPSILON).setListener(new g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.r.add(iVar.b);
            animate.translationX(Utils.FLOAT_EPSILON).translationY(Utils.FLOAT_EPSILON).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view)).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void S(RecyclerView.c0 c0Var, int i2, int i3, int i4, int i5) {
        View view = c0Var.e;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(Utils.FLOAT_EPSILON);
        }
        if (i7 != 0) {
            view.animate().translationY(Utils.FLOAT_EPSILON);
        }
        ViewPropertyAnimator animate = view.animate();
        this.p.add(c0Var);
        animate.setDuration(n()).setListener(new f(c0Var, i6, view, i7, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void U(List<RecyclerView.c0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).e.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void V() {
        if (!p()) {
            i();
        }
    }

    public boolean g(RecyclerView.c0 c0Var, List<Object> list) {
        return !list.isEmpty() || super.g(c0Var, list);
    }

    public void j(RecyclerView.c0 c0Var) {
        View view = c0Var.e;
        view.animate().cancel();
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.j.get(size).a == c0Var) {
                view.setTranslationY(Utils.FLOAT_EPSILON);
                view.setTranslationX(Utils.FLOAT_EPSILON);
                E(c0Var);
                this.j.remove(size);
            }
        }
        W(this.k, c0Var);
        if (this.h.remove(c0Var)) {
            view.setAlpha(1.0f);
            G(c0Var);
        }
        if (this.i.remove(c0Var)) {
            view.setAlpha(1.0f);
            A(c0Var);
        }
        for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.n.get(size2);
            W(arrayList, c0Var);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        for (int size3 = this.m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList2.get(size4)).a == c0Var) {
                    view.setTranslationY(Utils.FLOAT_EPSILON);
                    view.setTranslationX(Utils.FLOAT_EPSILON);
                    E(c0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.l.get(size5);
            if (arrayList3.remove(c0Var)) {
                view.setAlpha(1.0f);
                A(c0Var);
                if (arrayList3.isEmpty()) {
                    this.l.remove(size5);
                }
            }
        }
        this.q.remove(c0Var);
        this.o.remove(c0Var);
        this.r.remove(c0Var);
        this.p.remove(c0Var);
        V();
    }

    public void k() {
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.j.get(size);
            View view = jVar.a.e;
            view.setTranslationY(Utils.FLOAT_EPSILON);
            view.setTranslationX(Utils.FLOAT_EPSILON);
            E(jVar.a);
            this.j.remove(size);
        }
        for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
            G(this.h.get(size2));
            this.h.remove(size2);
        }
        int size3 = this.i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.c0 c0Var = this.i.get(size3);
            c0Var.e.setAlpha(1.0f);
            A(c0Var);
            this.i.remove(size3);
        }
        for (int size4 = this.k.size() - 1; size4 >= 0; size4--) {
            X(this.k.get(size4));
        }
        this.k.clear();
        if (p()) {
            for (int size5 = this.m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.a.e;
                    view2.setTranslationY(Utils.FLOAT_EPSILON);
                    view2.setTranslationX(Utils.FLOAT_EPSILON);
                    E(jVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.c0 c0Var2 = (RecyclerView.c0) arrayList2.get(size8);
                    c0Var2.e.setAlpha(1.0f);
                    A(c0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.n.remove(arrayList3);
                    }
                }
            }
            U(this.q);
            U(this.p);
            U(this.o);
            U(this.r);
            i();
        }
    }

    public boolean p() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    public void u() {
        boolean z = !this.h.isEmpty();
        boolean z2 = !this.j.isEmpty();
        boolean z3 = !this.k.isEmpty();
        boolean z4 = !this.i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.c0> it = this.h.iterator();
            while (it.hasNext()) {
                T(it.next());
            }
            this.h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.j);
                this.m.add(arrayList);
                this.j.clear();
                a aVar = new a(arrayList);
                if (z) {
                    o4.c0(((j) arrayList.get(0)).a.e, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.k);
                this.n.add(arrayList2);
                this.k.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    o4.c0(((i) arrayList2.get(0)).a.e, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.i);
                this.l.add(arrayList3);
                this.i.clear();
                c cVar = new c(arrayList3);
                if (z || z2 || z3) {
                    long j2 = 0;
                    long o2 = z ? o() : 0;
                    long n2 = z2 ? n() : 0;
                    if (z3) {
                        j2 = m();
                    }
                    o4.c0(((RecyclerView.c0) arrayList3.get(0)).e, cVar, o2 + Math.max(n2, j2));
                    return;
                }
                cVar.run();
            }
        }
    }

    public boolean w(RecyclerView.c0 c0Var) {
        Z(c0Var);
        c0Var.e.setAlpha(Utils.FLOAT_EPSILON);
        this.i.add(c0Var);
        return true;
    }

    public boolean x(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i2, int i3, int i4, int i5) {
        if (c0Var == c0Var2) {
            return y(c0Var, i2, i3, i4, i5);
        }
        float translationX = c0Var.e.getTranslationX();
        float translationY = c0Var.e.getTranslationY();
        float alpha = c0Var.e.getAlpha();
        Z(c0Var);
        int i6 = (int) (((float) (i4 - i2)) - translationX);
        int i7 = (int) (((float) (i5 - i3)) - translationY);
        c0Var.e.setTranslationX(translationX);
        c0Var.e.setTranslationY(translationY);
        c0Var.e.setAlpha(alpha);
        if (c0Var2 != null) {
            Z(c0Var2);
            c0Var2.e.setTranslationX((float) (-i6));
            c0Var2.e.setTranslationY((float) (-i7));
            c0Var2.e.setAlpha(Utils.FLOAT_EPSILON);
        }
        this.k.add(new i(c0Var, c0Var2, i2, i3, i4, i5));
        return true;
    }

    public boolean y(RecyclerView.c0 c0Var, int i2, int i3, int i4, int i5) {
        View view = c0Var.e;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) c0Var.e.getTranslationY());
        Z(c0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            E(c0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        this.j.add(new j(c0Var, translationX, translationY, i4, i5));
        return true;
    }

    public boolean z(RecyclerView.c0 c0Var) {
        Z(c0Var);
        this.h.add(c0Var);
        return true;
    }
}
