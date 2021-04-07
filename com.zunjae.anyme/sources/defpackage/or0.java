package defpackage;

import android.util.Pair;
import com.google.android.gms.measurement.internal.j6;
import defpackage.uq0;

/* renamed from: or0  reason: default package */
final class or0 extends uq0.a {
    private final /* synthetic */ j6 i;
    private final /* synthetic */ uq0 j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    or0(uq0 uq0, j6 j6Var) {
        super(uq0);
        this.j = uq0;
        this.i = j6Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        for (int i2 = 0; i2 < this.j.e.size(); i2++) {
            if (this.i.equals(((Pair) this.j.e.get(i2)).first)) {
                String unused = this.j.a;
                return;
            }
        }
        uq0.c cVar = new uq0.c(this.i);
        this.j.e.add(new Pair(this.i, cVar));
        this.j.h.registerOnMeasurementEventListener(cVar);
    }
}
