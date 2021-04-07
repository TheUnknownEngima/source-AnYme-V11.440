package com.google.firebase.installations;

final /* synthetic */ class e implements Runnable {
    private final f e;
    private final boolean f;

    private e(f fVar, boolean z) {
        this.e = fVar;
        this.f = z;
    }

    public static Runnable a(f fVar, boolean z) {
        return new e(fVar, z);
    }

    public void run() {
        this.e.e(this.f);
    }
}
