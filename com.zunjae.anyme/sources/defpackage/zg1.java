package defpackage;

import android.content.Context;

/* renamed from: zg1  reason: default package */
public class zg1 implements ah1 {
    private final Context a;
    private boolean b = false;
    private String c;

    public zg1(Context context) {
        this.a = context;
    }

    public String a() {
        if (!this.b) {
            this.c = dc1.G(this.a);
            this.b = true;
        }
        String str = this.c;
        if (str != null) {
            return str;
        }
        return null;
    }
}
