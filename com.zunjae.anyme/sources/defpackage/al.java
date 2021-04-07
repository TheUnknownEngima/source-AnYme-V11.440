package defpackage;

/* renamed from: al  reason: default package */
public interface al {

    /* renamed from: al$a */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        private a(boolean z) {
            this.isComplete = z;
        }

        /* access modifiers changed from: package-private */
        public boolean isComplete() {
            return this.isComplete;
        }
    }

    void a(zk zkVar);

    boolean b();

    al c();

    boolean e(zk zkVar);

    boolean g(zk zkVar);

    void i(zk zkVar);

    boolean k(zk zkVar);
}
