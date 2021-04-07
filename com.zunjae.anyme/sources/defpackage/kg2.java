package defpackage;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.a0;
import androidx.lifecycle.e0;
import org.koin.androidx.viewmodel.a;
import org.koin.androidx.viewmodel.b;

/* renamed from: kg2  reason: default package */
public final class kg2 {
    public static final <T extends a0> T a(Fragment fragment, y72<T> y72, oh2 oh2, o52<? extends e0> o52, o52<mh2> o522) {
        v62.f(fragment, "$this$getSharedViewModel");
        v62.f(y72, "clazz");
        v62.f(o52, "from");
        return b.c(hg2.a(fragment), new a(y72, fragment, oh2, o52, o522));
    }
}
