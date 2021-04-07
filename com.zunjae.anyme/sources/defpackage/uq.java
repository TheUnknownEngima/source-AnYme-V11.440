package defpackage;

import defpackage.fr;

/* renamed from: uq  reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class uq implements Runnable {
    public final /* synthetic */ fr.a e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;

    public /* synthetic */ uq(fr.a aVar, String str, long j, long j2) {
        this.e = aVar;
        this.f = str;
        this.g = j;
        this.h = j2;
    }

    public final void run() {
        this.e.i(this.f, this.g, this.h);
    }
}
