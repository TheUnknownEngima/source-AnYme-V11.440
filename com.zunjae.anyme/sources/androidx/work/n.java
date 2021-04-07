package androidx.work;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.impl.h;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public abstract class n {
    protected n() {
    }

    public static n c() {
        h i = h.i();
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public static void e(Context context, b bVar) {
        h.e(context, bVar);
    }

    public final l a(String str, f fVar, j jVar) {
        return b(str, fVar, Collections.singletonList(jVar));
    }

    public abstract l b(String str, f fVar, List<j> list);

    public abstract LiveData<m> d(UUID uuid);
}
