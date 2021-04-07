package defpackage;

import com.google.android.gms.cast.e;

/* renamed from: f80  reason: default package */
final class f80 implements Runnable {
    private final /* synthetic */ z70 e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;

    f80(b80 b80, z70 z70, String str, String str2) {
        this.e = z70;
        this.f = str;
        this.g = str2;
    }

    public final void run() {
        e.d dVar;
        synchronized (this.e.C) {
            dVar = (e.d) this.e.C.get(this.f);
        }
        if (dVar != null) {
            dVar.a(this.e.A, this.f, this.g);
            return;
        }
        z70.U.a("Discarded message for unknown namespace '%s'", this.f);
    }
}
