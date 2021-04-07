package defpackage;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;

/* renamed from: u71  reason: default package */
public final class u71 {
    private static final a.g<h71> a = new a.g<>();
    private static final a.g<h71> b = new a.g<>();
    public static final a.C0087a<h71, g71> c = new t71();
    private static final a.C0087a<h71, Object> d = new w71();

    static {
        new Scope("profile");
        new Scope("email");
        new a("SignIn.API", c, a);
        new a("SignIn.INTERNAL_API", d, b);
    }
}
