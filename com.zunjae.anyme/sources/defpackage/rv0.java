package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: rv0  reason: default package */
final class rv0 {
    static int a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    static int b(@NullableDecl Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
