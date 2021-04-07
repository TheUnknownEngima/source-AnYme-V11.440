package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.source.hls.j;
import defpackage.yx;
import java.io.EOFException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class f implements j {
    private final int b;
    private final boolean c;

    public f() {
        this(0, true);
    }

    public f(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    private static j.a b(ht htVar) {
        return new j.a(htVar, (htVar instanceof jw) || (htVar instanceof fw) || (htVar instanceof hw) || (htVar instanceof vu), h(htVar));
    }

    private static j.a c(ht htVar, f0 f0Var, s50 s50) {
        ht vuVar;
        if (htVar instanceof s) {
            vuVar = new s(f0Var.E, s50);
        } else if (htVar instanceof jw) {
            vuVar = new jw();
        } else if (htVar instanceof fw) {
            vuVar = new fw();
        } else if (htVar instanceof hw) {
            vuVar = new hw();
        } else if (!(htVar instanceof vu)) {
            return null;
        } else {
            vuVar = new vu();
        }
        return b(vuVar);
    }

    private ht d(Uri uri, f0 f0Var, List<f0> list, s50 s50) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return ("text/vtt".equals(f0Var.m) || lastPathSegment.endsWith(".webvtt") || lastPathSegment.endsWith(".vtt")) ? new s(f0Var.E, s50) : lastPathSegment.endsWith(".aac") ? new jw() : (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) ? new fw() : lastPathSegment.endsWith(".ac4") ? new hw() : lastPathSegment.endsWith(".mp3") ? new vu(0, 0) : (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() + -4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() + -5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() + -5)) ? e(s50, f0Var, list) : f(this.b, this.c, f0Var, list, s50);
    }

    private static fv e(s50 s50, f0 f0Var, List<f0> list) {
        int i = g(f0Var) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new fv(i, s50, (lv) null, list);
    }

    private static gx f(int i, boolean z, f0 f0Var, List<f0> list, s50 s50) {
        int i2 = i | 16;
        if (list != null) {
            i2 |= 32;
        } else {
            list = z ? Collections.singletonList(f0.y((String) null, "application/cea-608", 0, (String) null)) : Collections.emptyList();
        }
        String str = f0Var.j;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(e50.b(str))) {
                i2 |= 2;
            }
            if (!"video/avc".equals(e50.k(str))) {
                i2 |= 4;
            }
        }
        return new gx(2, s50, new lw(i2, list));
    }

    private static boolean g(f0 f0Var) {
        yx yxVar = f0Var.k;
        if (yxVar == null) {
            return false;
        }
        for (int i = 0; i < yxVar.d(); i++) {
            yx.b c2 = yxVar.c(i);
            if (c2 instanceof p) {
                return !((p) c2).g.isEmpty();
            }
        }
        return false;
    }

    private static boolean h(ht htVar) {
        return (htVar instanceof gx) || (htVar instanceof fv);
    }

    /* JADX INFO: finally extract failed */
    private static boolean i(ht htVar, it itVar) {
        try {
            boolean d = htVar.d(itVar);
            itVar.i();
            return d;
        } catch (EOFException unused) {
            itVar.i();
            return false;
        } catch (Throwable th) {
            itVar.i();
            throw th;
        }
    }

    public j.a a(ht htVar, Uri uri, f0 f0Var, List<f0> list, s50 s50, Map<String, List<String>> map, it itVar) {
        if (htVar != null) {
            if (h(htVar)) {
                return b(htVar);
            }
            if (c(htVar, f0Var, s50) == null) {
                String valueOf = String.valueOf(htVar.getClass().getSimpleName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unexpected previousExtractor type: ".concat(valueOf) : new String("Unexpected previousExtractor type: "));
            }
        }
        ht d = d(uri, f0Var, list, s50);
        itVar.i();
        if (i(d, itVar)) {
            return b(d);
        }
        if (!(d instanceof s)) {
            s sVar = new s(f0Var.E, s50);
            if (i(sVar, itVar)) {
                return b(sVar);
            }
        }
        if (!(d instanceof jw)) {
            jw jwVar = new jw();
            if (i(jwVar, itVar)) {
                return b(jwVar);
            }
        }
        if (!(d instanceof fw)) {
            fw fwVar = new fw();
            if (i(fwVar, itVar)) {
                return b(fwVar);
            }
        }
        if (!(d instanceof hw)) {
            hw hwVar = new hw();
            if (i(hwVar, itVar)) {
                return b(hwVar);
            }
        }
        if (!(d instanceof vu)) {
            vu vuVar = new vu(0, 0);
            if (i(vuVar, itVar)) {
                return b(vuVar);
            }
        }
        if (!(d instanceof fv)) {
            fv e = e(s50, f0Var, list);
            if (i(e, itVar)) {
                return b(e);
            }
        }
        if (!(d instanceof gx)) {
            gx f = f(this.b, this.c, f0Var, list, s50);
            if (i(f, itVar)) {
                return b(f);
            }
        }
        return b(d);
    }
}
