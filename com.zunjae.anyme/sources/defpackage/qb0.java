package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: qb0  reason: default package */
public final class qb0 extends rb0 {
    public static boolean a(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
