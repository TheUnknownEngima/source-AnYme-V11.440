package com.afollestad.assent.internal;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.afollestad.assent.b;
import com.afollestad.assent.i;
import com.afollestad.assent.rationale.c;

public final class h {
    public static final void a(Fragment fragment, String[] strArr, int[] iArr) {
        v62.f(fragment, "$this$onPermissionsResponse");
        v62.f(strArr, "permissions");
        v62.f(iArr, "grantResults");
        FragmentActivity n = fragment.n();
        if (n != null) {
            v62.b(n, "activity ?: error(\"Fragm… is not attached: $this\")");
            b bVar = new b(b.f(strArr), iArr, new c(n, new i(n)));
            e.a(fragment, "onPermissionsResponse(): %s", bVar);
            f d = a.f.d().d();
            if (d == null) {
                e.b(fragment, "onPermissionsResponse() called but there's no current pending request.", new Object[0]);
            } else if (b.d(d.b(), strArr)) {
                b.e(d.a(), bVar);
                a.f.d().g((f) null);
                if (a.f.d().f().a()) {
                    f c = a.f.d().f().c();
                    a.f.d().g(c);
                    e.a(fragment, "Executing next request in the queue: %s", c);
                    a.f.b(fragment).K1(c);
                    return;
                }
                e.a(fragment, "Nothing more in the queue to execute, forgetting the PermissionFragment.", new Object[0]);
                a.f.c();
            } else {
                e.b(fragment, "onPermissionsResponse() called with a result that doesn't match the current pending request.", new Object[0]);
            }
        } else {
            throw new IllegalStateException(("Fragment is not attached: " + fragment).toString());
        }
    }
}
