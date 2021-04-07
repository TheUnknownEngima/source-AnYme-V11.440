package defpackage;

import android.content.Context;
import android.content.Intent;
import com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser;
import com.zunjae.anyme.features.browsers.abstracts.DynamicBrowser;
import com.zunjae.anyme.features.browsers.native_streaming.NativeStreamingShowPicker;
import com.zunjae.anyme.features.browsers.nsfw.GenericNSFWBrowser;
import com.zunjae.dynsourcegen.b;
import com.zunjae.dynsourcegen.c;
import com.zunjae.dynsourcegen.e;

/* renamed from: sr1  reason: default package */
public final class sr1 {
    public static final Intent a(e eVar, Context context, sy1 sy1, boolean z, boolean z2) {
        v62.e(eVar, "$this$toIntent");
        v62.e(context, "context");
        v62.e(sy1, "anime");
        int i = rr1.a[eVar.h().ordinal()];
        if (i == 1) {
            c d = c.i.d(eVar.c());
            if (d != null) {
                return GenericNSFWBrowser.V.a(context, d);
            }
            return null;
        } else if (i == 2) {
            pr1 b = pr1.Companion.b(eVar.c());
            if (b == null) {
                return null;
            }
            return AbstractAnimeBrowser.d0.a(context, sy1, b.getBrowser(), z, z2);
        } else if (i == 3) {
            b d2 = b.x.d(eVar.c());
            if (d2 != null) {
                return DynamicBrowser.g0.a(context, d2, sy1, z, z2);
            }
            return null;
        } else if (i == 4) {
            jz1 d3 = jz1.Companion.d(eVar.c());
            if (d3 == null) {
                return null;
            }
            String y = sy1.y();
            return NativeStreamingShowPicker.P.a(context, d3, y, z, z2, sy1.p(), sy1.u(), sy1.i());
        } else if (i != 5) {
            throw new j22();
        } else {
            throw new k22((String) null, 1, (r62) null);
        }
    }
}
