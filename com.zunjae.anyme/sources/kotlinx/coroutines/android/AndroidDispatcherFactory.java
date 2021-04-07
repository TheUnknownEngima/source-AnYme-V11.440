package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;

public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public int c() {
        return 1073741823;
    }

    /* renamed from: d */
    public a b(List<? extends MainDispatcherFactory> list) {
        v62.f(list, "allFactories");
        Looper mainLooper = Looper.getMainLooper();
        v62.b(mainLooper, "Looper.getMainLooper()");
        return new a(c.a(mainLooper, true), "Main");
    }
}
