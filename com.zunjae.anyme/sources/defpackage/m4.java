package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: m4  reason: default package */
public final class m4 {
    private Object a;

    private m4(Object obj) {
        this.a = obj;
    }

    public static m4 b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? new m4(PointerIcon.getSystemIcon(context, i)) : new m4((Object) null);
    }

    public Object a() {
        return this.a;
    }
}
