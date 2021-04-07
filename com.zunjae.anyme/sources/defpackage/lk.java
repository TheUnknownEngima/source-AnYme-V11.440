package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import com.bumptech.glide.c;
import com.bumptech.glide.j;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: lk  reason: default package */
public class lk extends Fragment {
    private final xj a0;
    private final jk b0;
    private final Set<lk> c0;
    private lk d0;
    private j e0;
    private Fragment f0;

    /* renamed from: lk$a */
    private class a implements jk {
        a() {
        }

        public Set<j> a() {
            Set<lk> K1 = lk.this.K1();
            HashSet hashSet = new HashSet(K1.size());
            for (lk next : K1) {
                if (next.N1() != null) {
                    hashSet.add(next.N1());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + lk.this + "}";
        }
    }

    public lk() {
        this(new xj());
    }

    @SuppressLint({"ValidFragment"})
    public lk(xj xjVar) {
        this.b0 = new a();
        this.c0 = new HashSet();
        this.a0 = xjVar;
    }

    private void J1(lk lkVar) {
        this.c0.add(lkVar);
    }

    private Fragment M1() {
        Fragment F = F();
        return F != null ? F : this.f0;
    }

    private static k P1(Fragment fragment) {
        while (fragment.F() != null) {
            fragment = fragment.F();
        }
        return fragment.z();
    }

    private boolean Q1(Fragment fragment) {
        Fragment M1 = M1();
        while (true) {
            Fragment F = fragment.F();
            if (F == null) {
                return false;
            }
            if (F.equals(M1)) {
                return true;
            }
            fragment = fragment.F();
        }
    }

    private void R1(Context context, k kVar) {
        V1();
        lk k = c.d(context).l().k(context, kVar);
        this.d0 = k;
        if (!equals(k)) {
            this.d0.J1(this);
        }
    }

    private void S1(lk lkVar) {
        this.c0.remove(lkVar);
    }

    private void V1() {
        lk lkVar = this.d0;
        if (lkVar != null) {
            lkVar.S1(this);
            this.d0 = null;
        }
    }

    public void K0() {
        super.K0();
        this.a0.d();
    }

    /* access modifiers changed from: package-private */
    public Set<lk> K1() {
        lk lkVar = this.d0;
        if (lkVar == null) {
            return Collections.emptySet();
        }
        if (equals(lkVar)) {
            return Collections.unmodifiableSet(this.c0);
        }
        HashSet hashSet = new HashSet();
        for (lk next : this.d0.K1()) {
            if (Q1(next.M1())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void L0() {
        super.L0();
        this.a0.e();
    }

    /* access modifiers changed from: package-private */
    public xj L1() {
        return this.a0;
    }

    public j N1() {
        return this.e0;
    }

    public jk O1() {
        return this.b0;
    }

    /* access modifiers changed from: package-private */
    public void T1(Fragment fragment) {
        k P1;
        this.f0 = fragment;
        if (fragment != null && fragment.u() != null && (P1 = P1(fragment)) != null) {
            R1(fragment.u(), P1);
        }
    }

    public void U1(j jVar) {
        this.e0 = jVar;
    }

    public void k0(Context context) {
        super.k0(context);
        k P1 = P1(this);
        if (P1 == null) {
            boolean isLoggable = Log.isLoggable("SupportRMFragment", 5);
            return;
        }
        try {
            R1(u(), P1);
        } catch (IllegalStateException unused) {
            boolean isLoggable2 = Log.isLoggable("SupportRMFragment", 5);
        }
    }

    public void s0() {
        super.s0();
        this.a0.c();
        V1();
    }

    public String toString() {
        return super.toString() + "{parent=" + M1() + "}";
    }

    public void v0() {
        super.v0();
        this.f0 = null;
        V1();
    }
}
