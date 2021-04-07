package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;

public class TransitionSet extends Transition {
    private ArrayList<Transition> N = new ArrayList<>();
    private boolean O = true;
    int P;
    boolean Q = false;
    private int R = 0;

    class a extends t {
        final /* synthetic */ Transition e;

        a(TransitionSet transitionSet, Transition transition) {
            this.e = transition;
        }

        public void c(Transition transition) {
            this.e.n0();
            transition.h0(this);
        }
    }

    static class b extends t {
        TransitionSet e;

        b(TransitionSet transitionSet) {
            this.e = transitionSet;
        }

        public void a(Transition transition) {
            TransitionSet transitionSet = this.e;
            if (!transitionSet.Q) {
                transitionSet.v0();
                this.e.Q = true;
            }
        }

        public void c(Transition transition) {
            TransitionSet transitionSet = this.e;
            int i = transitionSet.P - 1;
            transitionSet.P = i;
            if (i == 0) {
                transitionSet.Q = false;
                transitionSet.v();
            }
            transition.h0(this);
        }
    }

    public TransitionSet() {
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.g);
        I0(i2.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    private void A0(Transition transition) {
        this.N.add(transition);
        transition.v = this;
    }

    private void K0() {
        b bVar = new b(this);
        Iterator<Transition> it = this.N.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
        this.P = this.N.size();
    }

    public Transition C0(int i) {
        if (i < 0 || i >= this.N.size()) {
            return null;
        }
        return this.N.get(i);
    }

    public int D0() {
        return this.N.size();
    }

    /* renamed from: E0 */
    public TransitionSet h0(Transition.f fVar) {
        super.h0(fVar);
        return this;
    }

    /* renamed from: F0 */
    public TransitionSet i0(View view) {
        for (int i = 0; i < this.N.size(); i++) {
            this.N.get(i).i0(view);
        }
        super.i0(view);
        return this;
    }

    public TransitionSet G0(long j) {
        ArrayList<Transition> arrayList;
        super.o0(j);
        if (this.g >= 0 && (arrayList = this.N) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.N.get(i).o0(j);
            }
        }
        return this;
    }

    /* renamed from: H0 */
    public TransitionSet q0(TimeInterpolator timeInterpolator) {
        this.R |= 1;
        ArrayList<Transition> arrayList = this.N;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.N.get(i).q0(timeInterpolator);
            }
        }
        super.q0(timeInterpolator);
        return this;
    }

    public TransitionSet I0(int i) {
        if (i == 0) {
            this.O = true;
        } else if (i == 1) {
            this.O = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: J0 */
    public TransitionSet u0(long j) {
        super.u0(j);
        return this;
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        super.cancel();
        int size = this.N.size();
        for (int i = 0; i < size; i++) {
            this.N.get(i).cancel();
        }
    }

    public void f0(View view) {
        super.f0(view);
        int size = this.N.size();
        for (int i = 0; i < size; i++) {
            this.N.get(i).f0(view);
        }
    }

    public void j(x xVar) {
        if (V(xVar.b)) {
            Iterator<Transition> it = this.N.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.V(xVar.b)) {
                    next.j(xVar);
                    xVar.c.add(next);
                }
            }
        }
    }

    public void k0(View view) {
        super.k0(view);
        int size = this.N.size();
        for (int i = 0; i < size; i++) {
            this.N.get(i).k0(view);
        }
    }

    /* access modifiers changed from: protected */
    public void n0() {
        if (this.N.isEmpty()) {
            v0();
            v();
            return;
        }
        K0();
        if (!this.O) {
            for (int i = 1; i < this.N.size(); i++) {
                this.N.get(i - 1).b(new a(this, this.N.get(i)));
            }
            Transition transition = this.N.get(0);
            if (transition != null) {
                transition.n0();
                return;
            }
            return;
        }
        Iterator<Transition> it = this.N.iterator();
        while (it.hasNext()) {
            it.next().n0();
        }
    }

    /* access modifiers changed from: package-private */
    public void o(x xVar) {
        super.o(xVar);
        int size = this.N.size();
        for (int i = 0; i < size; i++) {
            this.N.get(i).o(xVar);
        }
    }

    public /* bridge */ /* synthetic */ Transition o0(long j) {
        G0(j);
        return this;
    }

    public void p(x xVar) {
        if (V(xVar.b)) {
            Iterator<Transition> it = this.N.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.V(xVar.b)) {
                    next.p(xVar);
                    xVar.c.add(next);
                }
            }
        }
    }

    public void p0(Transition.e eVar) {
        super.p0(eVar);
        this.R |= 8;
        int size = this.N.size();
        for (int i = 0; i < size; i++) {
            this.N.get(i).p0(eVar);
        }
    }

    /* renamed from: s */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.N = new ArrayList<>();
        int size = this.N.size();
        for (int i = 0; i < size; i++) {
            transitionSet.A0(this.N.get(i).clone());
        }
        return transitionSet;
    }

    public void s0(PathMotion pathMotion) {
        super.s0(pathMotion);
        this.R |= 4;
        if (this.N != null) {
            for (int i = 0; i < this.N.size(); i++) {
                this.N.get(i).s0(pathMotion);
            }
        }
    }

    public void t0(v vVar) {
        super.t0(vVar);
        this.R |= 2;
        int size = this.N.size();
        for (int i = 0; i < size; i++) {
            this.N.get(i).t0(vVar);
        }
    }

    /* access modifiers changed from: protected */
    public void u(ViewGroup viewGroup, y yVar, y yVar2, ArrayList<x> arrayList, ArrayList<x> arrayList2) {
        long I = I();
        int size = this.N.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.N.get(i);
            if (I > 0 && (this.O || i == 0)) {
                long I2 = transition.I();
                if (I2 > 0) {
                    transition.u0(I2 + I);
                } else {
                    transition.u0(I);
                }
            }
            transition.u(viewGroup, yVar, yVar2, arrayList, arrayList2);
        }
    }

    /* access modifiers changed from: package-private */
    public String w0(String str) {
        String w0 = super.w0(str);
        for (int i = 0; i < this.N.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(w0);
            sb.append("\n");
            sb.append(this.N.get(i).w0(str + "  "));
            w0 = sb.toString();
        }
        return w0;
    }

    /* renamed from: x0 */
    public TransitionSet b(Transition.f fVar) {
        super.b(fVar);
        return this;
    }

    /* renamed from: y0 */
    public TransitionSet c(View view) {
        for (int i = 0; i < this.N.size(); i++) {
            this.N.get(i).c(view);
        }
        super.c(view);
        return this;
    }

    public TransitionSet z0(Transition transition) {
        A0(transition);
        long j = this.g;
        if (j >= 0) {
            transition.o0(j);
        }
        if ((this.R & 1) != 0) {
            transition.q0(A());
        }
        if ((this.R & 2) != 0) {
            transition.t0(G());
        }
        if ((this.R & 4) != 0) {
            transition.s0(D());
        }
        if ((this.R & 8) != 0) {
            transition.p0(y());
        }
        return this;
    }
}
