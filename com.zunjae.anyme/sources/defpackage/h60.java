package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.s;
import com.google.android.gms.cast.framework.a;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.cast.framework.g;
import com.google.android.gms.cast.framework.h;
import com.google.android.gms.cast.framework.media.b;
import com.google.android.gms.cast.framework.media.i;
import com.google.android.gms.cast.framework.media.j;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import com.google.android.gms.cast.p;
import com.google.android.gms.common.internal.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: h60  reason: default package */
public class h60 implements h<c>, i.b {
    private static final u60 h = new u60("UIMediaController");
    private final Activity a;
    private final g b;
    private final Map<View, List<g60>> c = new HashMap();
    private final Set<xa0> d = new HashSet();
    i60 e = i60.e();
    private i.b f;
    private i g;

    public h60(Activity activity) {
        this.a = activity;
        a e2 = a.e(activity);
        bn0.c(vh0.UI_MEDIA_CONTROLLER);
        g b2 = e2 != null ? e2.b() : null;
        this.b = b2;
        if (b2 != null) {
            g b3 = a.d(activity).b();
            b3.a(this, c.class);
            W(b3.c());
        }
    }

    private final void U(int i, boolean z) {
        if (z) {
            for (xa0 h2 : this.d) {
                h2.h(((long) i) + this.e.k());
            }
        }
    }

    private final void V(View view, g60 g60) {
        if (this.b != null) {
            List list = this.c.get(view);
            if (list == null) {
                list = new ArrayList();
                this.c.put(view, list);
            }
            list.add(g60);
            if (C()) {
                g60.e(this.b.c());
                e0();
            }
        }
    }

    private final void W(f fVar) {
        if (!C() && (fVar instanceof c) && fVar.c()) {
            c cVar = (c) fVar;
            i p = cVar.p();
            this.g = p;
            if (p != null) {
                p.b(this);
                this.e.a = cVar != null ? cVar.p() : null;
                for (List<g60> it : this.c.values()) {
                    for (g60 e2 : it) {
                        e2.e(cVar);
                    }
                }
                e0();
            }
        }
    }

    private final void b0() {
        for (xa0 i : this.d) {
            i.i(false);
        }
    }

    private final void d0() {
        if (C()) {
            this.e.a = null;
            for (List<g60> it : this.c.values()) {
                for (g60 f2 : it) {
                    f2.f();
                }
            }
            this.g.D(this);
            this.g = null;
        }
    }

    private final void e0() {
        for (List<g60> it : this.c.values()) {
            for (g60 c2 : it) {
                c2.c();
            }
        }
    }

    private final void f0(int i) {
        boolean z;
        Iterator<xa0> it = this.d.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            it.next().i(true);
        }
        i B = B();
        if (B != null && B.o()) {
            long k = ((long) i) + this.e.k();
            p.a aVar = new p.a();
            aVar.d(k);
            if (!B.q() || !this.e.c(k)) {
                z = false;
            }
            aVar.c(z);
            B.I(aVar.a());
        }
    }

    public void A() {
        r.e("Must be called from the main thread.");
        d0();
        this.c.clear();
        g gVar = this.b;
        if (gVar != null) {
            gVar.e(this, c.class);
        }
        this.f = null;
    }

    public i B() {
        r.e("Must be called from the main thread.");
        return this.g;
    }

    public boolean C() {
        r.e("Must be called from the main thread.");
        return this.g != null;
    }

    /* access modifiers changed from: protected */
    public void D(View view) {
        i B = B();
        if (B != null && B.o() && (this.a instanceof FragmentActivity)) {
            j X1 = j.X1();
            FragmentActivity fragmentActivity = (FragmentActivity) this.a;
            s j = fragmentActivity.q().j();
            Fragment Z = fragmentActivity.q().Z("TRACKS_CHOOSER_DIALOG_TAG");
            if (Z != null) {
                j.p(Z);
            }
            X1.V1(j, "TRACKS_CHOOSER_DIALOG_TAG");
        }
    }

    /* access modifiers changed from: protected */
    public void E(View view, long j) {
        i B = B();
        if (B != null && B.o()) {
            if (B() == null || !B().o() || !B().v()) {
                B.G(B.g() + j);
                return;
            }
            long g2 = B.g() + j;
            i60 i60 = this.e;
            B.G(Math.min(g2, ((long) i60.j()) + i60.k()));
        }
    }

    /* access modifiers changed from: protected */
    public void F(ImageView imageView) {
        c c2 = a.d(this.a.getApplicationContext()).b().c();
        if (c2 != null && c2.c()) {
            try {
                c2.s(!c2.q());
            } catch (IOException | IllegalArgumentException e2) {
                h.c("Unable to call CastSession.setMute(boolean).", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void G(ImageView imageView) {
        i B = B();
        if (B != null && B.o()) {
            B.L();
        }
    }

    /* access modifiers changed from: protected */
    public void H(View view, long j) {
        i B = B();
        if (B != null && B.o()) {
            if (B() == null || !B().o() || !B().v()) {
                B.G(B.g() - j);
                return;
            }
            long g2 = B.g() - j;
            i60 i60 = this.e;
            B.G(Math.max(g2, ((long) i60.i()) + i60.k()));
        }
    }

    /* renamed from: I */
    public void i(c cVar, int i) {
        d0();
    }

    /* renamed from: J */
    public void o(c cVar) {
    }

    /* renamed from: K */
    public void m(c cVar, int i) {
        d0();
    }

    /* renamed from: L */
    public void l(c cVar, boolean z) {
        W(cVar);
    }

    /* renamed from: M */
    public void h(c cVar, String str) {
    }

    /* renamed from: N */
    public void k(c cVar, int i) {
        d0();
    }

    /* renamed from: O */
    public void j(c cVar, String str) {
        W(cVar);
    }

    /* renamed from: P */
    public void n(c cVar) {
    }

    /* renamed from: Q */
    public void g(c cVar, int i) {
    }

    /* access modifiers changed from: protected */
    public void R(View view) {
        i B = B();
        if (B != null && B.o()) {
            B.A((JSONObject) null);
        }
    }

    /* access modifiers changed from: protected */
    public void S(View view) {
        i B = B();
        if (B != null && B.o()) {
            B.B((JSONObject) null);
        }
    }

    public void T(i.b bVar) {
        r.e("Must be called from the main thread.");
        this.f = bVar;
    }

    /* access modifiers changed from: protected */
    public final void X(CastSeekBar castSeekBar) {
        f0(castSeekBar.getProgress());
    }

    /* access modifiers changed from: protected */
    public final void Y(CastSeekBar castSeekBar, int i, boolean z) {
        U(i, z);
    }

    public final void Z(xa0 xa0) {
        this.d.add(xa0);
    }

    public void a() {
        e0();
        i.b bVar = this.f;
        if (bVar != null) {
            bVar.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void a0(CastSeekBar castSeekBar) {
        b0();
    }

    public void b() {
        e0();
        i.b bVar = this.f;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void c() {
        e0();
        i.b bVar = this.f;
        if (bVar != null) {
            bVar.c();
        }
    }

    public final i60 c0() {
        return this.e;
    }

    public void d() {
        e0();
        i.b bVar = this.f;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void e() {
        e0();
        i.b bVar = this.f;
        if (bVar != null) {
            bVar.e();
        }
    }

    public void f() {
        for (List<g60> it : this.c.values()) {
            for (g60 d2 : it) {
                d2.d();
            }
        }
        i.b bVar = this.f;
        if (bVar != null) {
            bVar.f();
        }
    }

    public void p(ImageView imageView, b bVar, View view) {
        r.e("Must be called from the main thread.");
        V(imageView, new oa0(imageView, this.a, bVar, 0, view));
    }

    public void q(ImageView imageView) {
        r.e("Must be called from the main thread.");
        imageView.setOnClickListener(new l60(this));
        V(imageView, new ra0(imageView, this.a));
    }

    public void r(ImageView imageView, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z) {
        r.e("Must be called from the main thread.");
        bn0.c(vh0.PAUSE_CONTROLLER);
        imageView.setOnClickListener(new m60(this));
        V(imageView, new sa0(imageView, this.a, drawable, drawable2, drawable3, view, z));
    }

    public void s(CastSeekBar castSeekBar, long j) {
        r.e("Must be called from the main thread.");
        bn0.c(vh0.SEEK_CONTROLLER);
        castSeekBar.i = new r60(this);
        V(castSeekBar, new ma0(castSeekBar, j, this.e));
    }

    public void t(View view) {
        r.e("Must be called from the main thread.");
        view.setOnClickListener(new s60(this));
        V(view, new la0(view, this.a));
    }

    public void u(View view, long j) {
        r.e("Must be called from the main thread.");
        view.setOnClickListener(new q60(this, j));
        V(view, new na0(view, this.e));
    }

    public void v(View view) {
        r.e("Must be called from the main thread.");
        V(view, new qa0(view));
    }

    public void w(View view, long j) {
        r.e("Must be called from the main thread.");
        view.setOnClickListener(new p60(this, j));
        V(view, new ua0(view, this.e));
    }

    public void x(View view, int i) {
        r.e("Must be called from the main thread.");
        view.setOnClickListener(new o60(this));
        V(view, new wa0(view, i));
    }

    public void y(View view, int i) {
        r.e("Must be called from the main thread.");
        view.setOnClickListener(new n60(this));
        V(view, new va0(view, i));
    }

    public void z(View view, g60 g60) {
        r.e("Must be called from the main thread.");
        V(view, g60);
    }
}
