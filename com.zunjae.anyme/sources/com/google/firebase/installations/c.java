package com.google.firebase.installations;

final /* synthetic */ class c implements Runnable {
    private final f e;

    private c(f fVar) {
        this.e = fVar;
    }

    public static Runnable a(f fVar) {
        return new c(fVar);
    }

    public void run() {
        this.e.g(false);
    }
}
