package defpackage;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import defpackage.un;

@AutoValue
/* renamed from: eo  reason: default package */
public abstract class eo {

    @AutoValue.Builder
    /* renamed from: eo$a */
    public static abstract class a {
        public abstract eo a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(xm xmVar);
    }

    public static a a() {
        un.b bVar = new un.b();
        bVar.d(xm.DEFAULT);
        return bVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract xm d();

    public eo e(xm xmVar) {
        a a2 = a();
        a2.b(b());
        a2.d(xmVar);
        a2.c(c());
        return a2.a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
