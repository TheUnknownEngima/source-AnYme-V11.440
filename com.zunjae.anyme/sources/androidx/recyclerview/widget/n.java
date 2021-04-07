package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class n {
    protected final RecyclerView.o a;
    private int b;
    final Rect c;

    static class a extends n {
        a(RecyclerView.o oVar) {
            super(oVar, (a) null);
        }

        public int d(View view) {
            return this.a.d0(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
        }

        public int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.a.c0(view) + layoutParams.leftMargin + layoutParams.rightMargin;
        }

        public int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.a.b0(view) + layoutParams.topMargin + layoutParams.bottomMargin;
        }

        public int g(View view) {
            return this.a.a0(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
        }

        public int h() {
            return this.a.u0();
        }

        public int i() {
            return this.a.u0() - this.a.getPaddingRight();
        }

        public int j() {
            return this.a.getPaddingRight();
        }

        public int k() {
            return this.a.v0();
        }

        public int l() {
            return this.a.h0();
        }

        public int m() {
            return this.a.getPaddingLeft();
        }

        public int n() {
            return (this.a.u0() - this.a.getPaddingLeft()) - this.a.getPaddingRight();
        }

        public int p(View view) {
            this.a.t0(view, true, this.c);
            return this.c.right;
        }

        public int q(View view) {
            this.a.t0(view, true, this.c);
            return this.c.left;
        }

        public void r(int i) {
            this.a.J0(i);
        }
    }

    static class b extends n {
        b(RecyclerView.o oVar) {
            super(oVar, (a) null);
        }

        public int d(View view) {
            return this.a.Y(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
        }

        public int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.a.b0(view) + layoutParams.topMargin + layoutParams.bottomMargin;
        }

        public int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.a.c0(view) + layoutParams.leftMargin + layoutParams.rightMargin;
        }

        public int g(View view) {
            return this.a.e0(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
        }

        public int h() {
            return this.a.g0();
        }

        public int i() {
            return this.a.g0() - this.a.getPaddingBottom();
        }

        public int j() {
            return this.a.getPaddingBottom();
        }

        public int k() {
            return this.a.h0();
        }

        public int l() {
            return this.a.v0();
        }

        public int m() {
            return this.a.getPaddingTop();
        }

        public int n() {
            return (this.a.g0() - this.a.getPaddingTop()) - this.a.getPaddingBottom();
        }

        public int p(View view) {
            this.a.t0(view, true, this.c);
            return this.c.bottom;
        }

        public int q(View view) {
            this.a.t0(view, true, this.c);
            return this.c.top;
        }

        public void r(int i) {
            this.a.K0(i);
        }
    }

    private n(RecyclerView.o oVar) {
        this.b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.a = oVar;
    }

    /* synthetic */ n(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static n a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static n b(RecyclerView.o oVar, int i) {
        if (i == 0) {
            return a(oVar);
        }
        if (i == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static n c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return n() - this.b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s() {
        this.b = n();
    }
}
