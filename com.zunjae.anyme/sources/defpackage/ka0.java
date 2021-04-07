package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.j;

/* renamed from: ka0  reason: default package */
final class ka0<R extends j> extends BasePendingResult<R> {
    private final ja0<R, Status> n;

    ka0(ja0<R, Status> ja0) {
        super((f) null);
        this.n = ja0;
    }

    /* access modifiers changed from: protected */
    public final R c(Status status) {
        return this.n.a(status);
    }
}
