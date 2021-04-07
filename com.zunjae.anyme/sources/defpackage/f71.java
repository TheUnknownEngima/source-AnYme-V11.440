package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.j6;
import java.util.List;
import java.util.Map;

/* renamed from: f71  reason: default package */
public class f71 {
    private final uq0 a;

    /* renamed from: f71$a */
    public interface a extends j6 {
    }

    public f71(uq0 uq0) {
        this.a = uq0;
    }

    public void a(String str, String str2, Bundle bundle) {
        this.a.C(str, str2, bundle);
    }

    public List<Bundle> b(String str, String str2) {
        return this.a.z(str, str2);
    }

    public int c(String str) {
        return this.a.J(str);
    }

    public Map<String, Object> d(String str, String str2, boolean z) {
        return this.a.g(str, str2, z);
    }

    public void e(String str, String str2, Bundle bundle) {
        this.a.q(str, str2, bundle);
    }

    public void f(a aVar) {
        this.a.n(aVar);
    }

    public void g(Bundle bundle) {
        this.a.j(bundle);
    }

    public void h(String str, String str2, Object obj) {
        this.a.s(str, str2, obj);
    }

    public final void i(boolean z) {
        this.a.u(z);
    }
}
