package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.mediarouter.media.g;
import androidx.mediarouter.media.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: aa0  reason: default package */
public final class aa0 extends w90 {
    private final h a;
    private final Map<g, Set<h.a>> b = new HashMap();

    public aa0(h hVar) {
        this.a = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public final void t3(g gVar) {
        for (h.a l : this.b.get(gVar)) {
            this.a.l(l);
        }
    }

    private final void s3(g gVar, int i) {
        for (h.a b2 : this.b.get(gVar)) {
            this.a.b(gVar, b2, i);
        }
    }

    public final void A0(Bundle bundle) {
        g d = g.d(bundle);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            t3(d);
        } else {
            new mb0(Looper.getMainLooper()).post(new ca0(this, d));
        }
    }

    public final boolean L(Bundle bundle, int i) {
        return this.a.k(g.d(bundle), i);
    }

    public final void T2(Bundle bundle, z90 z90) {
        g d = g.d(bundle);
        if (!this.b.containsKey(d)) {
            this.b.put(d, new HashSet());
        }
        this.b.get(d).add(new ba0(z90));
    }

    public final boolean X1() {
        return this.a.j().l().equals(this.a.f().l());
    }

    public final int a() {
        return 12451009;
    }

    public final void d1() {
        for (Set<h.a> it : this.b.values()) {
            for (h.a l : it) {
                this.a.l(l);
            }
        }
        this.b.clear();
    }

    public final void h3() {
        h hVar = this.a;
        hVar.n(hVar.f());
    }

    public final void j0(Bundle bundle, int i) {
        g d = g.d(bundle);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            s3(d, i);
        } else {
            new mb0(Looper.getMainLooper()).post(new da0(this, d, i));
        }
    }

    public final String p2() {
        return this.a.j().l();
    }

    public final void q3(MediaSessionCompat mediaSessionCompat) {
        this.a.o(mediaSessionCompat);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void u3(g gVar, int i) {
        synchronized (this.b) {
            s3(gVar, i);
        }
    }

    public final Bundle x0(String str) {
        for (h.f next : this.a.i()) {
            if (next.l().equals(str)) {
                return next.j();
            }
        }
        return null;
    }

    public final void y2(String str) {
        for (h.f next : this.a.i()) {
            if (next.l().equals(str)) {
                this.a.n(next);
                return;
            }
        }
    }
}
