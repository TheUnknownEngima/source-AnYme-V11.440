package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.z1;

public final class n {
    public static final z1 a(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        v62.f(mainDispatcherFactory, "$this$tryCreateDispatcher");
        v62.f(list, "factories");
        try {
            return mainDispatcherFactory.b(list);
        } catch (Throwable th) {
            return new o(th, mainDispatcherFactory.a());
        }
    }
}
