package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.work.h;
import androidx.work.i;

/* renamed from: p7  reason: default package */
public class p7 extends m7<h7> {
    private static final String e = h.f("NetworkNotRoamingCtrlr");

    public p7(Context context) {
        super(y7.c(context).d());
    }

    /* access modifiers changed from: package-private */
    public boolean b(i8 i8Var) {
        return i8Var.j.b() == i.NOT_ROAMING;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean c(h7 h7Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            return !h7Var.a() || !h7Var.c();
        }
        h.c().a(e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !h7Var.a();
    }
}
