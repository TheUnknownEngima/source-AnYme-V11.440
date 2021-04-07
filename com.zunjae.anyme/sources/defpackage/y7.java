package defpackage;

import android.content.Context;

/* renamed from: y7  reason: default package */
public class y7 {
    private static y7 e;
    private s7 a;
    private t7 b;
    private w7 c;
    private x7 d;

    private y7(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = new s7(applicationContext);
        this.b = new t7(applicationContext);
        this.c = new w7(applicationContext);
        this.d = new x7(applicationContext);
    }

    public static synchronized y7 c(Context context) {
        y7 y7Var;
        synchronized (y7.class) {
            if (e == null) {
                e = new y7(context);
            }
            y7Var = e;
        }
        return y7Var;
    }

    public s7 a() {
        return this.a;
    }

    public t7 b() {
        return this.b;
    }

    public w7 d() {
        return this.c;
    }

    public x7 e() {
        return this.d;
    }
}
