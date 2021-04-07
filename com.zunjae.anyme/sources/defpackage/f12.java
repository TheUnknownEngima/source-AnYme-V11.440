package defpackage;

import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import androidx.core.app.h;
import defpackage.a12;
import defpackage.g12;
import io.karn.notify.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f12  reason: default package */
public final class f12 {
    public static final f12 a = new f12();

    private f12() {
    }

    private final h.i b(h.e eVar, a12 a12) {
        String str = null;
        if (a12 instanceof a12.c) {
            return null;
        }
        if (a12 instanceof a12.g) {
            h.g gVar = new h.g();
            for (CharSequence l : ((a12.g) a12).c()) {
                gVar.l(l);
            }
            return gVar;
        } else if (a12 instanceof a12.b) {
            i12 i12 = i12.a;
            a12.b bVar = (a12.b) a12;
            Object b = bVar.b();
            if (b == null) {
                b = "";
            }
            eVar.q(i12.a(b.toString()));
            StringBuilder sb = new StringBuilder();
            sb.append("<font color='#3D3D3D'>");
            CharSequence d = bVar.d();
            if (d == null) {
                d = bVar.getTitle();
            }
            sb.append(d);
            sb.append("</font><br>");
            CharSequence c = bVar.c();
            if (c != null) {
                str = new u82("\n").d(c, "<br>");
            }
            sb.append(str);
            Spanned fromHtml = Html.fromHtml(sb.toString());
            v62.b(fromHtml, "Html.fromHtml(\"<font col…(\"\\n\".toRegex(), \"<br>\"))");
            h.c cVar = new h.c();
            cVar.l(fromHtml);
            return cVar;
        } else if (a12 instanceof a12.a) {
            h.b bVar2 = new h.b();
            a12.a aVar = (a12.a) a12;
            CharSequence c2 = aVar.c();
            if (c2 == null) {
                c2 = aVar.b();
            }
            bVar2.n(c2);
            bVar2.m(aVar.d());
            bVar2.l((Bitmap) null);
            return bVar2;
        } else if (a12 instanceof a12.d) {
            a12.d dVar = (a12.d) a12;
            h.C0020h hVar = new h.C0020h(dVar.e());
            hVar.r(dVar.c());
            for (h.C0020h.a aVar2 : dVar.d()) {
                hVar.l(aVar2.f(), aVar2.g(), aVar2.e());
            }
            return hVar;
        } else {
            throw new j22();
        }
    }

    public final h.e a(a aVar, h12 h12) {
        v62.f(aVar, "notify");
        v62.f(h12, "payload");
        h.e eVar = new h.e(aVar.c(), h12.b().c());
        eVar.e(new g12());
        eVar.o(h12.d().c());
        eVar.C(h12.d().e());
        eVar.F(h12.d().d());
        eVar.B(h12.d().f());
        eVar.l(h12.e().a());
        eVar.p(h12.e().d());
        eVar.t(h12.e().c());
        eVar.m(h12.e().b());
        eVar.x(h12.e().f());
        eVar.z(h12.e().g());
        eVar.H(h12.e().h());
        ArrayList<String> e = h12.e().e();
        if (!(!e.isEmpty())) {
            e = null;
        }
        if (e != null) {
            for (String c : e) {
                eVar.c(c);
            }
        }
        if (h12.c() instanceof a12.e) {
            eVar.r(((a12.e) h12.c()).getTitle());
            eVar.q(((a12.e) h12.c()).b());
        }
        if (h12.c() instanceof a12.f) {
            eVar.v(((a12.f) h12.c()).a());
        }
        ArrayList<h.a> a2 = h12.a();
        if (a2 != null) {
            for (h.a b : a2) {
                eVar.b(b);
            }
        }
        z02 b2 = h12.b();
        e12.a.a(b2);
        eVar.J(b2.f());
        if (b2.e() != 0) {
            eVar.w(b2.e(), 500, 2000);
        }
        v62.b(eVar, "builder");
        eVar.A(b2.b());
        if (b2.b() >= 0) {
            List<Long> h = b2.h();
            if (!(!h.isEmpty())) {
                h = null;
            }
            if (h != null) {
                eVar.I(n32.b0(h));
            }
            eVar.D(b2.g());
        }
        d12 f = h12.f();
        if (f == null) {
            eVar.E(b(eVar, h12.c()));
            return eVar;
        }
        new g12();
        f.a();
        throw null;
    }

    public final int c(NotificationManager notificationManager, Integer num, h.e eVar) {
        v62.f(notificationManager, "notificationManager");
        v62.f(eVar, "notification");
        g12.a aVar = g12.f;
        Bundle g = eVar.g();
        v62.b(g, "notification.extras");
        CharSequence b = aVar.b(g);
        int intValue = num != null ? num.intValue() : i12.a.b();
        if (b != null) {
            int hashCode = b.hashCode();
            notificationManager.notify(b.toString(), hashCode, eVar.d());
            return hashCode;
        }
        notificationManager.notify(intValue, eVar.d());
        return intValue;
    }
}
