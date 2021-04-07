package com.google.android.exoplayer2.source.hls;

import android.util.SparseArray;

public final class r {
    private final SparseArray<s50> a = new SparseArray<>();

    public s50 a(int i) {
        s50 s50 = this.a.get(i);
        if (s50 != null) {
            return s50;
        }
        s50 s502 = new s50(Long.MAX_VALUE);
        this.a.put(i, s502);
        return s502;
    }

    public void b() {
        this.a.clear();
    }
}
