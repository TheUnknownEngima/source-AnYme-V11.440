package com.google.firebase.components;

import java.util.Map;

final /* synthetic */ class q implements Runnable {
    private final Map.Entry e;
    private final oh1 f;

    private q(Map.Entry entry, oh1 oh1) {
        this.e = entry;
        this.f = oh1;
    }

    public static Runnable a(Map.Entry entry, oh1 oh1) {
        return new q(entry, oh1);
    }

    public void run() {
        ((ph1) this.e.getKey()).a(this.f);
    }
}
