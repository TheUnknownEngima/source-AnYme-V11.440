package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

public abstract class h {

    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean isAtLeast(b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public h() {
        new AtomicReference();
    }

    public abstract void a(m mVar);

    public abstract b b();

    public abstract void c(m mVar);
}
