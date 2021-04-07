package defpackage;

import android.text.TextUtils;

/* renamed from: a80  reason: default package */
public class a80 {
    protected final u60 a;
    private final String b;
    private l70 c;

    protected a80(String str, String str2, String str3) {
        t60.d(str);
        this.b = str;
        this.a = new u60(str2);
        b((String) null);
    }

    public final String a() {
        return this.b;
    }

    public final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a.i(str);
        }
    }

    public final void c(l70 l70) {
        this.c = l70;
        if (l70 == null) {
            e();
        }
    }

    /* access modifiers changed from: protected */
    public final void d(String str, long j, String str2) {
        this.a.f("Sending text message: %s to: %s", str, null);
        l70 l70 = this.c;
        if (l70 == null) {
            this.a.c("Attempt to send text message without a sink", new Object[0]);
        } else {
            l70.f(this.b, str, j, (String) null);
        }
    }

    public abstract void e();

    /* access modifiers changed from: protected */
    public final long f() {
        l70 l70 = this.c;
        if (l70 != null) {
            return l70.e();
        }
        this.a.c("Attempt to generate requestId without a sink", new Object[0]);
        return 0;
    }
}
