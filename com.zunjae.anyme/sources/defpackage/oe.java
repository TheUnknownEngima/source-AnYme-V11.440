package defpackage;

/* renamed from: oe  reason: default package */
final class oe extends RuntimeException {
    oe(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
