package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.r;

public abstract class i {
    private final Context a;
    private final String b;
    private final a c = new a();

    class a extends l {
        private a() {
        }

        public final String W2() {
            return i.this.b();
        }

        public final int a() {
            return 12451009;
        }

        public final boolean q2() {
            return i.this.d();
        }

        public final w80 x1(String str) {
            f a2 = i.this.a(str);
            if (a2 == null) {
                return null;
            }
            return a2.m();
        }
    }

    protected i(Context context, String str) {
        r.j(context);
        this.a = context.getApplicationContext();
        r.f(str);
        this.b = str;
    }

    public abstract f a(String str);

    public final String b() {
        return this.b;
    }

    public final Context c() {
        return this.a;
    }

    public abstract boolean d();

    public final IBinder e() {
        return this.c;
    }
}
