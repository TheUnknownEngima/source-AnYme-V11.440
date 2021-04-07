package com.afollestad.assent.internal;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.k;
import androidx.fragment.app.s;

public final class c {
    public static final void a(Fragment fragment, d62<? super s, ? super Context, u22> d62) {
        v62.f(fragment, "$this$transact");
        v62.f(d62, "action");
        s j = fragment.t().j();
        FragmentActivity n = fragment.n();
        if (n != null) {
            d62.G(j, n);
            j.i();
            fragment.t().V();
            return;
        }
        throw new IllegalStateException("Fragment's activity is null.".toString());
    }

    public static final boolean b(FragmentActivity fragmentActivity, d62<? super s, ? super Context, u22> d62) {
        v62.f(fragmentActivity, "$this$transact");
        v62.f(d62, "action");
        k q = fragmentActivity.q();
        s j = q.j();
        d62.G(j, fragmentActivity);
        j.i();
        return q.V();
    }
}
