package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    private final Runnable a;
    final ArrayDeque<b> b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements l, a {
        private final h e;
        private final b f;
        private a g;

        LifecycleOnBackPressedCancellable(h hVar, b bVar) {
            this.e = hVar;
            this.f = bVar;
            hVar.a(this);
        }

        public void c(n nVar, h.a aVar) {
            if (aVar == h.a.ON_START) {
                this.g = OnBackPressedDispatcher.this.b(this.f);
            } else if (aVar == h.a.ON_STOP) {
                a aVar2 = this.g;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == h.a.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.e.c(this);
            this.f.e(this);
            a aVar = this.g;
            if (aVar != null) {
                aVar.cancel();
                this.g = null;
            }
        }
    }

    private class a implements a {
        private final b e;

        a(b bVar) {
            this.e = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.e);
            this.e.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(n nVar, b bVar) {
        h a2 = nVar.a();
        if (a2.b() != h.b.DESTROYED) {
            bVar.a(new LifecycleOnBackPressedCancellable(a2, bVar));
        }
    }

    /* access modifiers changed from: package-private */
    public a b(b bVar) {
        this.b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
