package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.h;

public final class a {
    private final b a;
    private final SavedStateRegistry b = new SavedStateRegistry();

    private a(b bVar) {
        this.a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry b() {
        return this.b;
    }

    public void c(Bundle bundle) {
        h a2 = this.a.a();
        if (a2.b() == h.b.INITIALIZED) {
            a2.a(new Recreator(this.a));
            this.b.b(a2, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void d(Bundle bundle) {
        this.b.c(bundle);
    }
}
