package defpackage;

import defpackage.fr;

/* renamed from: yq  reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class yq implements Runnable {
    public final /* synthetic */ fr.a e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;

    public /* synthetic */ yq(fr.a aVar, int i, long j, long j2) {
        this.e = aVar;
        this.f = i;
        this.g = j;
        this.h = j2;
    }

    public final void run() {
        this.e.h(this.f, this.g, this.h);
    }
}
