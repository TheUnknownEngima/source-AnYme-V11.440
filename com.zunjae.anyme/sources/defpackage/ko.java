package defpackage;

import android.content.Context;
import java.io.Closeable;

/* renamed from: ko  reason: default package */
abstract class ko implements Closeable {

    /* renamed from: ko$a */
    interface a {
        ko a();

        a b(Context context);
    }

    ko() {
    }

    /* access modifiers changed from: package-private */
    public abstract bp a();

    /* access modifiers changed from: package-private */
    public abstract jo b();

    public void close() {
        a().close();
    }
}
