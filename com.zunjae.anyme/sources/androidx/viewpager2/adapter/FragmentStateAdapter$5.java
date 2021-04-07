package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;

class FragmentStateAdapter$5 implements l {
    final /* synthetic */ Handler e;
    final /* synthetic */ Runnable f;

    public void c(n nVar, h.a aVar) {
        if (aVar == h.a.ON_DESTROY) {
            this.e.removeCallbacks(this.f);
            nVar.a().c(this);
        }
    }
}
