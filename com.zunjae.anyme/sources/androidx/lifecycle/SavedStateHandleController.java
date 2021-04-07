package androidx.lifecycle;

import androidx.lifecycle.h;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;

final class SavedStateHandleController implements l {
    private final String e;
    private boolean f;
    private final y g;

    static final class a implements SavedStateRegistry.a {
        a() {
        }

        public void a(b bVar) {
            if (bVar instanceof e0) {
                d0 h = ((e0) bVar).h();
                SavedStateRegistry j = bVar.j();
                for (String b : h.c()) {
                    SavedStateHandleController.h(h.b(b), j, bVar.a());
                }
                if (!h.c().isEmpty()) {
                    j.e(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    static void h(a0 a0Var, SavedStateRegistry savedStateRegistry, h hVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) a0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.j()) {
            savedStateHandleController.i(savedStateRegistry, hVar);
            k(savedStateRegistry, hVar);
        }
    }

    private static void k(final SavedStateRegistry savedStateRegistry, final h hVar) {
        h.b b = hVar.b();
        if (b == h.b.INITIALIZED || b.isAtLeast(h.b.STARTED)) {
            savedStateRegistry.e(a.class);
        } else {
            hVar.a(new l() {
                public void c(n nVar, h.a aVar) {
                    if (aVar == h.a.ON_START) {
                        hVar.c(this);
                        savedStateRegistry.e(a.class);
                    }
                }
            });
        }
    }

    public void c(n nVar, h.a aVar) {
        if (aVar == h.a.ON_DESTROY) {
            this.f = false;
            nVar.a().c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void i(SavedStateRegistry savedStateRegistry, h hVar) {
        if (!this.f) {
            this.f = true;
            hVar.a(this);
            savedStateRegistry.d(this.e, this.g.a());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.f;
    }
}
