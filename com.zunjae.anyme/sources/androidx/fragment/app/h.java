package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class h<E> extends e {
    private final Activity e;
    private final Context f;
    private final Handler g;
    final k h;

    h(Activity activity, Context context, Handler handler, int i) {
        this.h = new l();
        this.e = activity;
        u3.d(context, "context == null");
        this.f = context;
        u3.d(handler, "handler == null");
        this.g = handler;
    }

    h(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    public View d(int i) {
        return null;
    }

    public boolean e() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Activity f() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public Context g() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public Handler i() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public void k(Fragment fragment) {
    }

    public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E m();

    public LayoutInflater n() {
        return LayoutInflater.from(this.f);
    }

    public void o(Fragment fragment, String[] strArr, int i) {
    }

    public boolean p(Fragment fragment) {
        return true;
    }

    public void q(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void r() {
    }
}
