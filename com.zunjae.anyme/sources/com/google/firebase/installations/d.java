package com.google.firebase.installations;

final /* synthetic */ class d implements Runnable {
    private final f e;
    private final boolean f;

    private d(f fVar, boolean z) {
        this.e = fVar;
        this.f = z;
    }

    public static Runnable a(f fVar, boolean z) {
        return new d(fVar, z);
    }

    public void run() {
        this.e.g(this.f);
    }
}
