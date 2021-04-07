package defpackage;

import com.google.firebase.crashlytics.c;
import defpackage.uj2;

/* renamed from: uw1  reason: default package */
public final class uw1 extends uj2.b {
    /* access modifiers changed from: protected */
    public void k(int i, String str, String str2, Throwable th) {
        v62.e(str2, "message");
        if (i == 6 && th != null) {
            c.a().c(th);
        }
    }
}
