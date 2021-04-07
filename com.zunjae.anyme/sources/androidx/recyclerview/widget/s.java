package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

public abstract class s extends RecyclerView.q {
    RecyclerView a;
    private Scroller b;
    private final RecyclerView.s c = new a();

    class a extends RecyclerView.s {
        boolean a = false;

        a() {
        }

        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            if (i == 0 && this.a) {
                this.a = false;
                s.this.l();
            }
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.a = true;
            }
        }
    }

    class b extends j {
        b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            s sVar = s.this;
            RecyclerView recyclerView = sVar.a;
            if (recyclerView != null) {
                int[] c = sVar.c(recyclerView.getLayoutManager(), view);
                int i = c[0];
                int i2 = c[1];
                int w = w(Math.max(Math.abs(i), Math.abs(i2)));
                if (w > 0) {
                    aVar.d(i, i2, w, this.j);
                }
            }
        }

        /* access modifiers changed from: protected */
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    private void g() {
        this.a.a1(this.c);
        this.a.setOnFlingListener((RecyclerView.q) null);
    }

    private void j() {
        if (this.a.getOnFlingListener() == null) {
            this.a.l(this.c);
            this.a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean k(RecyclerView.o oVar, int i, int i2) {
        RecyclerView.y e;
        int i3;
        if (!(oVar instanceof RecyclerView.y.b) || (e = e(oVar)) == null || (i3 = i(oVar, i, i2)) == -1) {
            return false;
        }
        e.p(i3);
        oVar.S1(e);
        return true;
    }

    public boolean a(int i, int i2) {
        RecyclerView.o layoutManager = this.a.getLayoutManager();
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && k(layoutManager, i, i2);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                g();
            }
            this.a = recyclerView;
            if (recyclerView != null) {
                j();
                this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
                l();
            }
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    public int[] d(int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    /* access modifiers changed from: protected */
    public RecyclerView.y e(RecyclerView.o oVar) {
        return f(oVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public j f(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.y.b)) {
            return null;
        }
        return new b(this.a.getContext());
    }

    public abstract View h(RecyclerView.o oVar);

    public abstract int i(RecyclerView.o oVar, int i, int i2);

    /* access modifiers changed from: package-private */
    public void l() {
        RecyclerView.o layoutManager;
        View h;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h = h(layoutManager)) != null) {
            int[] c2 = c(layoutManager, h);
            if (c2[0] != 0 || c2[1] != 0) {
                this.a.n1(c2[0], c2[1]);
            }
        }
    }
}
