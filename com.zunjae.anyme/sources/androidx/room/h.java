package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

class h {
    final Set<LiveData> a = Collections.newSetFromMap(new IdentityHashMap());
    private final l b;

    h(l lVar) {
        this.b = lVar;
    }

    /* access modifiers changed from: package-private */
    public <T> LiveData<T> a(String[] strArr, boolean z, Callable<T> callable) {
        return new p(this.b, this, z, callable, strArr);
    }

    /* access modifiers changed from: package-private */
    public void b(LiveData liveData) {
        this.a.add(liveData);
    }

    /* access modifiers changed from: package-private */
    public void c(LiveData liveData) {
        this.a.remove(liveData);
    }
}
