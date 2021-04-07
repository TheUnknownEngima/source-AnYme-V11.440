package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.work.i;

/* renamed from: n7  reason: default package */
public class n7 extends m7<h7> {
    public n7(Context context) {
        super(y7.c(context).d());
    }

    /* access modifiers changed from: package-private */
    public boolean b(i8 i8Var) {
        return i8Var.j.b() == i.CONNECTED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean c(h7 h7Var) {
        return Build.VERSION.SDK_INT >= 26 ? !h7Var.a() || !h7Var.d() : !h7Var.a();
    }
}
