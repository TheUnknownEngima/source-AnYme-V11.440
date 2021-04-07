package com.google.android.gms.cast.framework.media;

import android.annotation.TargetApi;
import android.net.Uri;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.l;
import com.google.android.gms.common.util.m;
import java.util.Locale;

public class e {
    public static Uri a(MediaInfo mediaInfo, int i) {
        l p;
        if (mediaInfo == null || (p = mediaInfo.p()) == null || p.k() == null || p.k().size() <= i) {
            return null;
        }
        return p.k().get(i).i();
    }

    @TargetApi(21)
    public static Locale b(MediaTrack mediaTrack) {
        if (mediaTrack.l() == null) {
            return null;
        }
        boolean h = m.h();
        String l = mediaTrack.l();
        if (h) {
            return Locale.forLanguageTag(l);
        }
        String[] split = l.split("-");
        return split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
    }
}
