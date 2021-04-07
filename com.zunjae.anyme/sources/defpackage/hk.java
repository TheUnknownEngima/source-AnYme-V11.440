package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.j;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: hk  reason: default package */
public class hk extends Fragment {
    private final xj e;
    private final jk f;
    private final Set<hk> g;
    private j h;
    private hk i;
    private Fragment j;

    /* renamed from: hk$a */
    private class a implements jk {
        a() {
        }

        public Set<j> a() {
            Set<hk> b = hk.this.b();
            HashSet hashSet = new HashSet(b.size());
            for (hk next : b) {
                if (next.e() != null) {
                    hashSet.add(next.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + hk.this + "}";
        }
    }

    public hk() {
        this(new xj());
    }

    @SuppressLint({"ValidFragment"})
    hk(xj xjVar) {
        this.f = new a();
        this.g = new HashSet();
        this.e = xjVar;
    }

    private void a(hk hkVar) {
        this.g.add(hkVar);
    }

    @TargetApi(17)
    private Fragment d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.j;
    }

    @TargetApi(17)
    private boolean g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void h(Activity activity) {
        l();
        hk i2 = c.d(activity).l().i(activity);
        this.i = i2;
        if (!equals(i2)) {
            this.i.a(this);
        }
    }

    private void i(hk hkVar) {
        this.g.remove(hkVar);
    }

    private void l() {
        hk hkVar = this.i;
        if (hkVar != null) {
            hkVar.i(this);
            this.i = null;
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(17)
    public Set<hk> b() {
        if (equals(this.i)) {
            return Collections.unmodifiableSet(this.g);
        }
        if (this.i == null || Build.VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (hk next : this.i.b()) {
            if (g(next.getParentFragment())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    public xj c() {
        return this.e;
    }

    public j e() {
        return this.h;
    }

    public jk f() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public void j(Fragment fragment) {
        this.j = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            h(fragment.getActivity());
        }
    }

    public void k(j jVar) {
        this.h = jVar;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException unused) {
            boolean isLoggable = Log.isLoggable("RMFragment", 5);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.e.c();
        l();
    }

    public void onDetach() {
        super.onDetach();
        l();
    }

    public void onStart() {
        super.onStart();
        this.e.d();
    }

    public void onStop() {
        super.onStop();
        this.e.e();
    }

    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }
}
