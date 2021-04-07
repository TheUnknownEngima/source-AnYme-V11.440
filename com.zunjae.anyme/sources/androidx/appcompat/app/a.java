package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.github.mikephil.charting.utils.Utils;

public class a implements DrawerLayout.d {
    private final b a;
    private final DrawerLayout b;
    private j c;
    private boolean d;
    boolean e;
    private final int f;
    private final int g;
    View.OnClickListener h;
    private boolean i;

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    class C0006a implements View.OnClickListener {
        C0006a() {
        }

        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.e) {
                aVar.l();
                return;
            }
            View.OnClickListener onClickListener = aVar.h;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public interface b {
        boolean a();

        Context b();

        void c(Drawable drawable, int i);

        Drawable d();

        void e(int i);
    }

    public interface c {
        b e();
    }

    private static class d implements b {
        private final Activity a;
        private b.a b;

        d(Activity activity) {
            this.a = activity;
        }

        public boolean a() {
            ActionBar actionBar = this.a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        public Context b() {
            ActionBar actionBar = this.a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.a;
        }

        public void c(Drawable drawable, int i) {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
                return;
            }
            actionBar.setDisplayShowHomeEnabled(true);
            this.b = b.c(this.a, drawable, i);
            actionBar.setDisplayShowHomeEnabled(false);
        }

        public Drawable d() {
            if (Build.VERSION.SDK_INT < 18) {
                return b.a(this.a);
            }
            TypedArray obtainStyledAttributes = b().obtainStyledAttributes((AttributeSet) null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        public void e(int i) {
            if (Build.VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                return;
            }
            this.b = b.b(this.b, this.a, i);
        }
    }

    static class e implements b {
        final Toolbar a;
        final Drawable b;
        final CharSequence c;

        e(Toolbar toolbar) {
            this.a = toolbar;
            this.b = toolbar.getNavigationIcon();
            this.c = toolbar.getNavigationContentDescription();
        }

        public boolean a() {
            return true;
        }

        public Context b() {
            return this.a.getContext();
        }

        public void c(Drawable drawable, int i) {
            this.a.setNavigationIcon(drawable);
            e(i);
        }

        public Drawable d() {
            return this.b;
        }

        public void e(int i) {
            if (i == 0) {
                this.a.setNavigationContentDescription(this.c);
            } else {
                this.a.setNavigationContentDescription(i);
            }
        }
    }

    a(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, j jVar, int i2, int i3) {
        this.d = true;
        this.e = true;
        this.i = false;
        if (toolbar != null) {
            this.a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new C0006a());
        } else if (activity instanceof c) {
            this.a = ((c) activity).e();
        } else {
            this.a = new d(activity);
        }
        this.b = drawerLayout;
        this.f = i2;
        this.g = i3;
        if (jVar == null) {
            this.c = new j(this.a.b());
        } else {
            this.c = jVar;
        }
        e();
    }

    public a(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i2, int i3) {
        this(activity, toolbar, drawerLayout, (j) null, i2, i3);
    }

    private void i(float f2) {
        j jVar;
        boolean z;
        if (f2 == 1.0f) {
            jVar = this.c;
            z = true;
        } else {
            if (f2 == Utils.FLOAT_EPSILON) {
                jVar = this.c;
                z = false;
            }
            this.c.e(f2);
        }
        jVar.g(z);
        this.c.e(f2);
    }

    public void a(View view) {
        i(1.0f);
        if (this.e) {
            g(this.g);
        }
    }

    public void b(View view) {
        i(Utils.FLOAT_EPSILON);
        if (this.e) {
            g(this.f);
        }
    }

    public void c(View view, float f2) {
        if (this.d) {
            i(Math.min(1.0f, Math.max(Utils.FLOAT_EPSILON, f2)));
        } else {
            i(Utils.FLOAT_EPSILON);
        }
    }

    public void d(int i2) {
    }

    /* access modifiers changed from: package-private */
    public Drawable e() {
        return this.a.d();
    }

    public boolean f() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public void g(int i2) {
        this.a.e(i2);
    }

    /* access modifiers changed from: package-private */
    public void h(Drawable drawable, int i2) {
        if (!this.i && !this.a.a()) {
            this.i = true;
        }
        this.a.c(drawable, i2);
    }

    public void j(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public void k() {
        i(this.b.C(8388611) ? 1.0f : Utils.FLOAT_EPSILON);
        if (this.e) {
            h(this.c, this.b.C(8388611) ? this.g : this.f);
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        int q = this.b.q(8388611);
        if (this.b.F(8388611) && q != 2) {
            this.b.d(8388611);
        } else if (q != 1) {
            this.b.K(8388611);
        }
    }
}
