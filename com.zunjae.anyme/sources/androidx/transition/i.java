package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

@SuppressLint({"ViewConstructor"})
class i extends ViewGroup implements f {
    ViewGroup e;
    View f;
    final View g;
    int h;
    private Matrix i;
    private final ViewTreeObserver.OnPreDrawListener j = new a();

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        public boolean onPreDraw() {
            View view;
            o4.Z(i.this);
            i iVar = i.this;
            ViewGroup viewGroup = iVar.e;
            if (viewGroup == null || (view = iVar.f) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            o4.Z(i.this.e);
            i iVar2 = i.this;
            iVar2.e = null;
            iVar2.f = null;
            return true;
        }
    }

    i(View view) {
        super(view.getContext());
        this.g = view;
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
    }

    static i b(View view, ViewGroup viewGroup, Matrix matrix) {
        g gVar;
        if (view.getParent() instanceof ViewGroup) {
            g b = g.b(viewGroup);
            i e2 = e(view);
            int i2 = 0;
            if (!(e2 == null || (gVar = (g) e2.getParent()) == b)) {
                i2 = e2.h;
                gVar.removeView(e2);
                e2 = null;
            }
            if (e2 == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    c(view, viewGroup, matrix);
                }
                e2 = new i(view);
                e2.h(matrix);
                if (b == null) {
                    b = new g(viewGroup);
                } else {
                    b.g();
                }
                d(viewGroup, b);
                d(viewGroup, e2);
                b.a(e2);
                e2.h = i2;
            } else if (matrix != null) {
                e2.h(matrix);
            }
            e2.h++;
            return e2;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        i0.j(viewGroup2, matrix);
        matrix.preTranslate((float) (-viewGroup2.getScrollX()), (float) (-viewGroup2.getScrollY()));
        i0.k(viewGroup, matrix);
    }

    static void d(View view, View view2) {
        i0.g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    static i e(View view) {
        return (i) view.getTag(R$id.ghost_view);
    }

    static void f(View view) {
        i e2 = e(view);
        if (e2 != null) {
            int i2 = e2.h - 1;
            e2.h = i2;
            if (i2 <= 0) {
                ((g) e2.getParent()).removeView(e2);
            }
        }
    }

    static void g(View view, i iVar) {
        view.setTag(R$id.ghost_view, iVar);
    }

    public void a(ViewGroup viewGroup, View view) {
        this.e = viewGroup;
        this.f = view;
    }

    /* access modifiers changed from: package-private */
    public void h(Matrix matrix) {
        this.i = matrix;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.g, this);
        this.g.getViewTreeObserver().addOnPreDrawListener(this.j);
        i0.i(this.g, 4);
        if (this.g.getParent() != null) {
            ((View) this.g.getParent()).invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.g.getViewTreeObserver().removeOnPreDrawListener(this.j);
        i0.i(this.g, 0);
        g(this.g, (i) null);
        if (this.g.getParent() != null) {
            ((View) this.g.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        b.a(canvas, true);
        canvas.setMatrix(this.i);
        i0.i(this.g, 0);
        this.g.invalidate();
        i0.i(this.g, 4);
        drawChild(canvas, this.g, getDrawingTime());
        b.a(canvas, false);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (e(this.g) == this) {
            i0.i(this.g, i2 == 0 ? 4 : 0);
        }
    }
}
