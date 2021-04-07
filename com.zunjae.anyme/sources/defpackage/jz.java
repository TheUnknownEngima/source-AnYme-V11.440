package defpackage;

import defpackage.g00;
import java.io.IOException;

/* renamed from: jz  reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class jz implements Runnable {
    public final /* synthetic */ g00.a e;
    public final /* synthetic */ g00 f;
    public final /* synthetic */ g00.b g;
    public final /* synthetic */ g00.c h;
    public final /* synthetic */ IOException i;
    public final /* synthetic */ boolean j;

    public /* synthetic */ jz(g00.a aVar, g00 g00, g00.b bVar, g00.c cVar, IOException iOException, boolean z) {
        this.e = aVar;
        this.f = g00;
        this.g = bVar;
        this.h = cVar;
        this.i = iOException;
        this.j = z;
    }

    public final void run() {
        this.e.h(this.f, this.g, this.h, this.i, this.j);
    }
}
