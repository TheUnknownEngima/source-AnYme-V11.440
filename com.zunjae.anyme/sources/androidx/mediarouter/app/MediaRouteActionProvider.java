package androidx.mediarouter.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.mediarouter.media.g;
import androidx.mediarouter.media.h;
import java.lang.ref.WeakReference;

public class MediaRouteActionProvider extends x3 {
    private final h d;
    private final a e;
    private g f = g.c;
    private e g = e.a();
    private MediaRouteButton h;
    private boolean i;
    private boolean j;

    private static final class a extends h.a {
        private final WeakReference<MediaRouteActionProvider> a;

        public a(MediaRouteActionProvider mediaRouteActionProvider) {
            this.a = new WeakReference<>(mediaRouteActionProvider);
        }

        private void l(h hVar) {
            MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) this.a.get();
            if (mediaRouteActionProvider != null) {
                mediaRouteActionProvider.o();
            } else {
                hVar.l(this);
            }
        }

        public void a(h hVar, h.e eVar) {
            l(hVar);
        }

        public void b(h hVar, h.e eVar) {
            l(hVar);
        }

        public void c(h hVar, h.e eVar) {
            l(hVar);
        }

        public void d(h hVar, h.f fVar) {
            l(hVar);
        }

        public void e(h hVar, h.f fVar) {
            l(hVar);
        }

        public void g(h hVar, h.f fVar) {
            l(hVar);
        }
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.d = h.g(context);
        this.e = new a(this);
    }

    public boolean c() {
        return this.j || this.d.k(this.f, 1);
    }

    public View d() {
        MediaRouteButton mediaRouteButton = this.h;
        MediaRouteButton n = n();
        this.h = n;
        n.setCheatSheetEnabled(true);
        this.h.setRouteSelector(this.f);
        if (this.i) {
            this.h.a();
        }
        this.h.setAlwaysVisible(this.j);
        this.h.setDialogFactory(this.g);
        this.h.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.h;
    }

    public boolean f() {
        MediaRouteButton mediaRouteButton = this.h;
        if (mediaRouteButton != null) {
            return mediaRouteButton.e();
        }
        return false;
    }

    public boolean h() {
        return true;
    }

    public MediaRouteButton n() {
        return new MediaRouteButton(a());
    }

    /* access modifiers changed from: package-private */
    public void o() {
        i();
    }

    public void p(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.f.equals(gVar)) {
            if (!this.f.f()) {
                this.d.l(this.e);
            }
            if (!gVar.f()) {
                this.d.a(gVar, this.e);
            }
            this.f = gVar;
            o();
            MediaRouteButton mediaRouteButton = this.h;
            if (mediaRouteButton != null) {
                mediaRouteButton.setRouteSelector(gVar);
            }
        }
    }
}
