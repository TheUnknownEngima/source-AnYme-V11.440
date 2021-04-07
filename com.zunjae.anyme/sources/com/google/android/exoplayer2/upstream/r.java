package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;

public final /* synthetic */ class r {
    public static /* synthetic */ boolean a(String str) {
        String G0 = v50.G0(str);
        return !TextUtils.isEmpty(G0) && (!G0.contains("text") || G0.contains("text/vtt")) && !G0.contains("html") && !G0.contains("xml");
    }
}
