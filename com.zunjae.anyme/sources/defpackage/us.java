package defpackage;

import defpackage.ns;
import defpackage.ts;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: us  reason: default package */
public interface us<T extends ts> {

    /* renamed from: us$a */
    public static final class a {
    }

    /* renamed from: us$b */
    public interface b<T extends ts> {
    }

    /* renamed from: us$c */
    public interface c<T extends ts> {
        us<T> a(UUID uuid);
    }

    /* renamed from: us$d */
    public static final class d {
    }

    void a();

    Class<T> b();

    Map<String, String> c(byte[] bArr);

    T d(byte[] bArr);

    d e();

    byte[] f();

    void g(byte[] bArr, byte[] bArr2);

    void h(byte[] bArr);

    void i(b<? super T> bVar);

    byte[] j(byte[] bArr, byte[] bArr2);

    void k(byte[] bArr);

    a l(byte[] bArr, List<ns.b> list, int i, HashMap<String, String> hashMap);
}
