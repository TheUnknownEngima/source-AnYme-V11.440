package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: ow1  reason: default package */
public final class ow1 {

    /* renamed from: ow1$a */
    static final class a implements Runnable {
        final /* synthetic */ z52 e;
        final /* synthetic */ Fragment f;

        a(z52 z52, Fragment fragment) {
            this.e = z52;
            this.f = fragment;
        }

        public final void run() {
            this.e.r(this.f);
        }
    }

    public static final <T extends Fragment> boolean a(ve2<T> ve2, z52<? super T, u22> z52) {
        FragmentActivity n;
        v62.e(ve2, "$this$fragmentUiThread");
        v62.e(z52, "f");
        Fragment fragment = (Fragment) ve2.a().get();
        if (fragment != null) {
            v62.d(fragment, "weakRef.get() ?: return false");
            if (!fragment.W() && (n = fragment.n()) != null) {
                v62.d(n, "fragment.activity ?: return false");
                n.runOnUiThread(new a(z52, fragment));
                return true;
            }
        }
        return false;
    }
}
