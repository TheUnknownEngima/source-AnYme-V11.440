package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.R$id;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: jl  reason: default package */
public abstract class jl<T extends View, Z> implements pl<Z> {
    private static final int j = R$id.glide_custom_view_target_tag;
    private final a e;
    protected final T f;
    private View.OnAttachStateChangeListener g;
    private boolean h;
    private boolean i;

    /* renamed from: jl$a */
    static final class a {
        static Integer e;
        private final View a;
        private final List<ol> b = new ArrayList();
        boolean c;
        private C0130a d;

        /* renamed from: jl$a$a  reason: collision with other inner class name */
        private static final class C0130a implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<a> e;

            C0130a(a aVar) {
                this.e = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    "OnGlobalLayoutListener called attachStateListener=" + this;
                }
                a aVar = (a) this.e.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.a = view;
        }

        private static int c(Context context) {
            if (e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                jm.d(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return e.intValue();
        }

        private int e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.c && this.a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            boolean isLoggable = Log.isLoggable("CustomViewTarget", 4);
            return c(this.a.getContext());
        }

        private int f() {
            int paddingTop = this.a.getPaddingTop() + this.a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return e(this.a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.a.getPaddingLeft() + this.a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return e(this.a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        private boolean i(int i, int i2) {
            return h(i) && h(i2);
        }

        private void j(int i, int i2) {
            Iterator it = new ArrayList(this.b).iterator();
            while (it.hasNext()) {
                ((ol) it.next()).e(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (!this.b.isEmpty()) {
                int g = g();
                int f = f();
                if (i(g, f)) {
                    j(g, f);
                    b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.d);
            }
            this.d = null;
            this.b.clear();
        }

        /* access modifiers changed from: package-private */
        public void d(ol olVar) {
            int g = g();
            int f = f();
            if (i(g, f)) {
                olVar.e(g, f);
                return;
            }
            if (!this.b.contains(olVar)) {
                this.b.add(olVar);
            }
            if (this.d == null) {
                ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
                C0130a aVar = new C0130a(this);
                this.d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(ol olVar) {
            this.b.remove(olVar);
        }
    }

    public jl(T t) {
        jm.d(t);
        this.f = (View) t;
        this.e = new a(t);
    }

    private Object a() {
        return this.f.getTag(j);
    }

    private void b() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.g;
        if (onAttachStateChangeListener != null && !this.i) {
            this.f.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.i = true;
        }
    }

    private void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.g;
        if (onAttachStateChangeListener != null && this.i) {
            this.f.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.i = false;
        }
    }

    private void o(Object obj) {
        this.f.setTag(j, obj);
    }

    public final zk c() {
        Object a2 = a();
        if (a2 == null) {
            return null;
        }
        if (a2 instanceof zk) {
            return (zk) a2;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    public final void d(ol olVar) {
        this.e.k(olVar);
    }

    public final void f(zk zkVar) {
        o(zkVar);
    }

    public final void h(Drawable drawable) {
        b();
        m(drawable);
    }

    public final void i(Drawable drawable) {
        this.e.b();
        l(drawable);
        if (!this.h) {
            k();
        }
    }

    public final void j(ol olVar) {
        this.e.d(olVar);
    }

    /* access modifiers changed from: protected */
    public abstract void l(Drawable drawable);

    /* access modifiers changed from: protected */
    public void m(Drawable drawable) {
    }

    public void n() {
    }

    public String toString() {
        return "Target for: " + this.f;
    }

    public void x() {
    }

    public void y() {
    }
}
