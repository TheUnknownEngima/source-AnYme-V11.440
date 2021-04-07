package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.h;
import androidx.viewpager.widget.a;
import java.util.ArrayList;

public abstract class q extends a {
    private final k c;
    private final int d;
    private s e = null;
    private ArrayList<Fragment.f> f = new ArrayList<>();
    private ArrayList<Fragment> g = new ArrayList<>();
    private Fragment h = null;
    private boolean i;

    public q(k kVar, int i2) {
        this.c = kVar;
        this.d = i2;
    }

    public void b(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.e == null) {
            this.e = this.c.j();
        }
        while (this.f.size() <= i2) {
            this.f.add((Object) null);
        }
        this.f.set(i2, fragment.V() ? this.c.V0(fragment) : null);
        this.g.set(i2, (Object) null);
        this.e.p(fragment);
        if (fragment.equals(this.h)) {
            this.h = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void d(ViewGroup viewGroup) {
        s sVar = this.e;
        if (sVar != null) {
            if (!this.i) {
                try {
                    this.i = true;
                    sVar.l();
                    this.i = false;
                } catch (Throwable th) {
                    this.i = false;
                    throw th;
                }
            }
            this.e = null;
        }
    }

    public Object j(ViewGroup viewGroup, int i2) {
        Fragment.f fVar;
        Fragment fragment;
        if (this.g.size() > i2 && (fragment = this.g.get(i2)) != null) {
            return fragment;
        }
        if (this.e == null) {
            this.e = this.c.j();
        }
        Fragment v = v(i2);
        if (this.f.size() > i2 && (fVar = this.f.get(i2)) != null) {
            v.w1(fVar);
        }
        while (this.g.size() <= i2) {
            this.g.add((Object) null);
        }
        v.x1(false);
        if (this.d == 0) {
            v.D1(false);
        }
        this.g.set(i2, v);
        this.e.b(viewGroup.getId(), v);
        if (this.d == 1) {
            this.e.u(v, h.b.STARTED);
        }
        return v;
    }

    public boolean k(View view, Object obj) {
        return ((Fragment) obj).Q() == view;
    }

    public void n(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f.clear();
            this.g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f.add((Fragment.f) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment f0 = this.c.f0(bundle, str);
                    if (f0 != null) {
                        while (this.g.size() <= parseInt) {
                            this.g.add((Object) null);
                        }
                        f0.x1(false);
                        this.g.set(parseInt, f0);
                    } else {
                        "Bad fragment at key " + str;
                    }
                }
            }
        }
    }

    public Parcelable o() {
        Bundle bundle;
        if (this.f.size() > 0) {
            bundle = new Bundle();
            Fragment.f[] fVarArr = new Fragment.f[this.f.size()];
            this.f.toArray(fVarArr);
            bundle.putParcelableArray("states", fVarArr);
        } else {
            bundle = null;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null && fragment.V()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.c.M0(bundle, "f" + i2, fragment);
            }
        }
        return bundle;
    }

    public void q(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.x1(false);
                if (this.d == 1) {
                    if (this.e == null) {
                        this.e = this.c.j();
                    }
                    this.e.u(this.h, h.b.STARTED);
                } else {
                    this.h.D1(false);
                }
            }
            fragment.x1(true);
            if (this.d == 1) {
                if (this.e == null) {
                    this.e = this.c.j();
                }
                this.e.u(fragment, h.b.RESUMED);
            } else {
                fragment.D1(true);
            }
            this.h = fragment;
        }
    }

    public void t(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public abstract Fragment v(int i2);
}
