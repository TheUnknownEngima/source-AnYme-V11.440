package com.google.firebase.crashlytics;

import android.os.Bundle;
import defpackage.eb1;

class a implements eb1.b {
    private ob1 a;
    private ob1 b;

    a() {
    }

    private static void b(ob1 ob1, String str, Bundle bundle) {
        if (ob1 != null) {
            ob1.J(str, bundle);
        }
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.a : this.b, str, bundle);
    }

    public void a(int i, Bundle bundle) {
        String string;
        jb1 f = jb1.f();
        f.b("Received Analytics message: " + i + " " + bundle);
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            c(string, bundle2);
        }
    }

    public void d(ob1 ob1) {
        this.b = ob1;
    }

    public void e(ob1 ob1) {
        this.a = ob1;
    }
}
