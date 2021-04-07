package com.zunjae.downloader;

import android.content.Context;
import com.zunjae.downloader.d;
import java.util.List;

public final class o implements g {
    public o(Context context) {
        v62.e(context, "context");
    }

    public List<c> a() {
        if (!l02.e("key_download_over_mobile_data", false)) {
            return e32.b(c.Wifi);
        }
        return f32.h(c.Wifi, c.MobileData);
    }

    public boolean b() {
        return l02.e("preference_key_alternative_downloader2", false);
    }

    public d c() {
        String l = l02.l("key_download_type", d.AnYme.getCode());
        d.a aVar = d.Companion;
        v62.d(l, "value");
        return aVar.a(l);
    }
}
