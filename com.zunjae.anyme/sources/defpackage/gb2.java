package defpackage;

import defpackage.cb2;
import defpackage.sa2;
import java.io.IOException;
import java.net.Socket;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* renamed from: gb2  reason: default package */
public abstract class gb2 {
    public static gb2 a;

    public abstract void a(sa2.a aVar, String str);

    public abstract void b(sa2.a aVar, String str, String str2);

    public abstract void c(ka2 ka2, SSLSocket sSLSocket, boolean z);

    public abstract int d(cb2.a aVar);

    public abstract boolean e(ja2 ja2, sb2 sb2);

    public abstract Socket f(ja2 ja2, aa2 aa2, wb2 wb2);

    public abstract boolean g(aa2 aa2, aa2 aa22);

    public abstract sb2 h(ja2 ja2, aa2 aa2, wb2 wb2, eb2 eb2);

    public abstract void i(ja2 ja2, sb2 sb2);

    public abstract tb2 j(ja2 ja2);

    @Nullable
    public abstract IOException k(ea2 ea2, @Nullable IOException iOException);
}
