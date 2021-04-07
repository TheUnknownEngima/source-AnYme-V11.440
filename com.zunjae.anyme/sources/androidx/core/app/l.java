package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;

public final class l {
    private final String a;
    private final CharSequence b;
    private final CharSequence[] c;
    private final boolean d;
    private final int e;
    private final Bundle f;
    private final Set<String> g;

    static RemoteInput a(l lVar) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(lVar.i()).setLabel(lVar.h()).setChoices(lVar.e()).setAllowFreeFormInput(lVar.c()).addExtras(lVar.g());
        if (Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(lVar.f());
        }
        return addExtras.build();
    }

    static RemoteInput[] b(l[] lVarArr) {
        if (lVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[lVarArr.length];
        for (int i = 0; i < lVarArr.length; i++) {
            remoteInputArr[i] = a(lVarArr[i]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.d;
    }

    public Set<String> d() {
        return this.g;
    }

    public CharSequence[] e() {
        return this.c;
    }

    public int f() {
        return this.e;
    }

    public Bundle g() {
        return this.f;
    }

    public CharSequence h() {
        return this.b;
    }

    public String i() {
        return this.a;
    }

    public boolean j() {
        return !c() && (e() == null || e().length == 0) && d() != null && !d().isEmpty();
    }
}
