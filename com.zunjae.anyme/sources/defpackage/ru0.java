package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: ru0  reason: default package */
public final class ru0 extends pu0 {
    public static boolean a(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
