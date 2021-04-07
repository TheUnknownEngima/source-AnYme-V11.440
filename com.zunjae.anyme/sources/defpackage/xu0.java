package defpackage;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: xu0  reason: default package */
public final class xu0 {
    public static <T> yu0<T> a(yu0<T> yu0) {
        return ((yu0 instanceof zu0) || (yu0 instanceof av0)) ? yu0 : yu0 instanceof Serializable ? new av0(yu0) : new zu0(yu0);
    }

    public static <T> yu0<T> b(@NullableDecl T t) {
        return new cv0(t);
    }
}
