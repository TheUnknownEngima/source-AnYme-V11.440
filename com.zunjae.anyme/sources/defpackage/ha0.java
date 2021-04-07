package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;

/* renamed from: ha0  reason: default package */
final /* synthetic */ class ha0 implements a81 {
    private final ka0 a;
    private final ja0 b;

    ha0(ka0 ka0, ja0 ja0) {
        this.a = ka0;
        this.b = ja0;
    }

    public final void d(Exception exc) {
        ka0 ka0 = this.a;
        ja0 ja0 = this.b;
        Status status = new Status(8, "unknown error");
        if (exc instanceof b) {
            b bVar = (b) exc;
            status = new Status(bVar.a(), bVar.getMessage());
        }
        ka0.g(ja0.a(status));
    }
}
