package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: s70  reason: default package */
public class s70 extends a80 {
    private final List<n70> d = Collections.synchronizedList(new ArrayList());

    public s70(String str, String str2, String str3) {
        super(str, str2, (String) null);
    }

    public void e() {
        synchronized (this.d) {
            for (n70 e : this.d) {
                e.e(2002);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void g(n70 n70) {
        this.d.add(n70);
    }

    /* access modifiers changed from: protected */
    public final List<n70> h() {
        return this.d;
    }
}
