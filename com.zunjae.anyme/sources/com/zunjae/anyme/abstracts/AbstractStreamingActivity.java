package com.zunjae.anyme.abstracts;

import android.content.ComponentCallbacks;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import androidx.lifecycle.n;
import com.zunjae.downloader.f;
import com.zunjae.downloader.g;
import com.zunjae.downloader.h;
import com.zunjae.downloader.i;
import java.util.Map;

public abstract class AbstractStreamingActivity extends AbstractActivity {
    private final d22 D = g22.b(new c(this, (oh2) null, (o52) null));
    private final d22 E = g22.b(new a(this, (oh2) null, (o52) null));
    private final d22 F = g22.b(new b(this, (oh2) null, (o52) null));
    private boolean G;
    private boolean H;
    private com.zunjae.anyme.features.casting.a I;

    public static final class a extends w62 implements o52<f> {
        final /* synthetic */ ComponentCallbacks f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, oh2 oh2, o52 o52) {
            super(0);
            this.f = componentCallbacks;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.zunjae.downloader.f, java.lang.Object] */
        public final f invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(f.class), this.g, this.h);
        }
    }

    public static final class b extends w62 implements o52<g> {
        final /* synthetic */ ComponentCallbacks f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, oh2 oh2, o52 o52) {
            super(0);
            this.f = componentCallbacks;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.zunjae.downloader.g, java.lang.Object] */
        public final g invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(g.class), this.g, this.h);
        }
    }

    public static final class c extends w62 implements o52<com.zunjae.anyme.features.download.c> {
        final /* synthetic */ n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(n nVar, oh2 oh2, o52 o52) {
            super(0);
            this.f = nVar;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.zunjae.anyme.features.download.c, androidx.lifecycle.a0] */
        /* renamed from: a */
        public final com.zunjae.anyme.features.download.c invoke() {
            return lg2.b(this.f, f72.b(com.zunjae.anyme.features.download.c.class), this.g, this.h);
        }
    }

    static final class d extends w62 implements z52<com.afollestad.assent.rationale.b, u22> {
        public static final d f = new d();

        d() {
            super(1);
        }

        public final void a(com.afollestad.assent.rationale.b bVar) {
            v62.e(bVar, "$receiver");
            bVar.o(com.afollestad.assent.g.WRITE_EXTERNAL_STORAGE, "Grant this permission so AnYme can download videos");
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.assent.rationale.b) obj);
            return u22.a;
        }
    }

    static final class e extends w62 implements z52<com.afollestad.assent.b, u22> {
        final /* synthetic */ AbstractStreamingActivity f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AbstractStreamingActivity abstractStreamingActivity) {
            super(1);
            this.f = abstractStreamingActivity;
        }

        public final void a(com.afollestad.assent.b bVar) {
            AbstractStreamingActivity abstractStreamingActivity;
            String str;
            v62.e(bVar, "result");
            this.f.s0(bVar.b(com.afollestad.assent.g.WRITE_EXTERNAL_STORAGE));
            if (this.f.n0()) {
                abstractStreamingActivity = this.f;
                str = "Downloader Mode Enabled!";
            } else {
                abstractStreamingActivity = this.f;
                str = "Unable to enable Downloader Mode";
            }
            Toast makeText = Toast.makeText(abstractStreamingActivity, str, 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            this.f.invalidateOptionsMenu();
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.assent.b) obj);
            return u22.a;
        }
    }

    private final com.zunjae.anyme.features.download.c m0() {
        return (com.zunjae.anyme.features.download.c) this.D.getValue();
    }

    private final f o0() {
        return (f) this.E.getValue();
    }

    private final g p0() {
        return (g) this.F.getValue();
    }

    /* access modifiers changed from: protected */
    public final boolean l0() {
        return this.H;
    }

    /* access modifiers changed from: protected */
    public final boolean n0() {
        return this.G;
    }

    public final void q0(i iVar) {
        String str;
        v62.e(iVar, "type");
        if (iVar instanceof i.b) {
            com.zunjae.anyme.features.casting.a aVar = this.I;
            if (aVar != null) {
                v62.c(aVar);
                if (aVar.f0()) {
                    return;
                }
            }
            i.b bVar = (i.b) iVar;
            com.zunjae.anyme.features.casting.a c2 = com.zunjae.anyme.features.casting.a.v0.c(bVar.b(), bVar.c(), bVar.a());
            this.I = c2;
            if (c2 != null) {
                c2.W1(q(), "CastDialog");
            }
        } else if (iVar instanceof i.d) {
            i.d dVar = (i.d) iVar;
            h b2 = o0().b(dVar.c(), dVar.a(), dVar.d(), (Map<String, String>) null);
            if (b2 instanceof h.c) {
                Toast makeText = Toast.makeText(this, "Download started", 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                m0().l(new com.zunjae.downloader.b(((h.c) b2).a(), dVar.b(), dVar.c(), dVar.a(), (sy1) null, 16, (r62) null));
                return;
            }
            if (b2 instanceof h.b) {
                str = "Unable to queue download";
            } else if (b2 instanceof h.a) {
                uj2.d(((h.a) b2).a());
                str = "An error occurred";
            } else {
                return;
            }
            Toast makeText2 = Toast.makeText(this, str, 0);
            makeText2.show();
            v62.b(makeText2, "Toast\n        .makeText(…         show()\n        }");
        } else if (iVar instanceof i.e) {
            i.e eVar = (i.e) iVar;
            xr1.a.l(this, eVar.b(), eVar.a());
        } else if (iVar instanceof i.a) {
            i.a aVar2 = (i.a) iVar;
            xr1.a.j(this, aVar2.b(), aVar2.c(), aVar2.d(), Integer.valueOf(aVar2.a()));
        }
    }

    /* access modifiers changed from: protected */
    public final void r0(boolean z) {
        this.H = z;
    }

    /* access modifiers changed from: protected */
    public final void s0(boolean z) {
        this.G = z;
    }

    /* access modifiers changed from: protected */
    public final void t0() {
        this.G = false;
        boolean z = !this.H;
        this.H = z;
        Toast makeText = Toast.makeText(this, z ? "Cast Mode Enabled!" : "Cast Mode Disabled!", 0);
        makeText.show();
        v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    public final void u0() {
        this.H = false;
        boolean z = !this.G;
        this.G = z;
        if (!z) {
            Toast makeText = Toast.makeText(this, "Downloader Mode Disabled!", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            invalidateOptionsMenu();
            return;
        }
        int i = c.a[p0().c().ordinal()];
        if (i == 1) {
            com.afollestad.assent.g[] gVarArr = {com.afollestad.assent.g.WRITE_EXTERNAL_STORAGE};
            Window window = getWindow();
            v62.d(window, "window");
            View decorView = window.getDecorView();
            v62.d(decorView, "window.decorView");
            View rootView = decorView.getRootView();
            v62.d(rootView, "window.decorView.rootView");
            com.afollestad.assent.a.b(this, gVarArr, 0, com.afollestad.assent.rationale.f.a(this, rootView, d.f), new e(this), 2, (Object) null);
        } else if (i == 2) {
            if (com.zunjae.downloader.a.c.b(this)) {
                Toast makeText2 = Toast.makeText(this, "Downloader Mode Enabled!", 0);
                makeText2.show();
                v62.b(makeText2, "Toast\n        .makeText(…         show()\n        }");
                invalidateOptionsMenu();
                return;
            }
            this.G = false;
            Toast makeText3 = Toast.makeText(this, "Please download ADM to download videos", 0);
            makeText3.show();
            v62.b(makeText3, "Toast\n        .makeText(…         show()\n        }");
            com.zunjae.downloader.a.c.c(this);
        }
    }
}
