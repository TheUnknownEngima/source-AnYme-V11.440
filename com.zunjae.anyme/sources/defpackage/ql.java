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

@Deprecated
/* renamed from: ql  reason: default package */
public abstract class ql<T extends View, Z> extends gl<Z> {
    private static int k = R$id.glide_custom_view_target_tag;
    protected final T f;
    private final a g;
    private View.OnAttachStateChangeListener h;
    private boolean i;
    private boolean j;

    /* renamed from: ql$a */
    static final class a {
        static Integer e;
        private final View a;
        private final List<ol> b = new ArrayList();
        boolean c;
        private C0136a d;

        /* renamed from: ql$a$a  reason: collision with other inner class name */
        private static final class C0136a implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<a> e;

            C0136a(a aVar) {
                this.e = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
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
            boolean isLoggable = Log.isLoggable("ViewTarget", 4);
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
                C0136a aVar = new C0136a(this);
                this.d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(ol olVar) {
            this.b.remove(olVar);
        }
    }

    public ql(T t) {
        jm.d(t);
        this.f = (View) t;
        this.g = new a(t);
    }

    private Object k() {
        return this.f.getTag(k);
    }

    private void l() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.h;
        if (onAttachStateChangeListener != null && !this.j) {
            this.f.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.j = true;
        }
    }

    private void m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.h;
        if (onAttachStateChangeListener != null && this.j) {
            this.f.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.j = false;
        }
    }

    private void o(Object obj) {
        this.f.setTag(k, obj);
    }

    public zk c() {
        Object k2 = k();
        if (k2 == null) {
            return null;
        }
        if (k2 instanceof zk) {
            return (zk) k2;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public void d(ol olVar) {
        this.g.k(olVar);
    }

    public void f(zk zkVar) {
        o(zkVar);
    }

    public void h(Drawable drawable) {
        super.h(drawable);
        l();
    }

    public void i(Drawable drawable) {
        super.i(drawable);
        this.g.b();
        if (!this.i) {
            m();
        }
    }

    public void j(ol olVar) {
        this.g.d(olVar);
    }

    public String toString() {
        return "Target for: " + this.f;
    }
}
