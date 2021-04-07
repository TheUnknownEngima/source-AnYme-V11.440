package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.work.h;
import androidx.work.i;

/* renamed from: o7  reason: default package */
public class o7 extends m7<h7> {
    private static final String e = h.f("NetworkMeteredCtrlr");

    public o7(Context context) {
        super(y7.c(context).d());
    }

    /* access modifiers changed from: package-private */
    public boolean b(i8 i8Var) {
        return i8Var.j.b() == i.METERED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean c(h7 h7Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            return !h7Var.a() || !h7Var.b();
        }
        h.c().a(e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !h7Var.a();
    }
}
