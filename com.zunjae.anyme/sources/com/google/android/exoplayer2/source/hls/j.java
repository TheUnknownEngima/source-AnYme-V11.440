package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.f0;
import java.util.List;
import java.util.Map;

public interface j {
    public static final j a = new f();

    public static final class a {
        public final ht a;
        public final boolean b;
        public final boolean c;

        public a(ht htVar, boolean z, boolean z2) {
            this.a = htVar;
            this.b = z;
            this.c = z2;
        }
    }

    a a(ht htVar, Uri uri, f0 f0Var, List<f0> list, s50 s50, Map<String, List<String>> map, it itVar);
}
