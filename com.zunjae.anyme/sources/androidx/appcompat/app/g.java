package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$attr;
import defpackage.n;
import defpackage.z3;

public class g extends Dialog implements d {
    private e e;
    private final z3.a f = new a();

    class a implements z3.a {
        a() {
        }

        public boolean k(KeyEvent keyEvent) {
            return g.this.c(keyEvent);
        }
    }

    public g(Context context, int i) {
        super(context, b(context, i));
        e a2 = a();
        a2.E(b(context, i));
        a2.r((Bundle) null);
    }

    private static int b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public e a() {
        if (this.e == null) {
            this.e = e.f(this, this);
        }
        return this.e;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void d(n nVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return z3.e(this.f, getWindow().getDecorView(), this, keyEvent);
    }

    public boolean e(int i) {
        return a().z(i);
    }

    public void f(n nVar) {
    }

    public <T extends View> T findViewById(int i) {
        return a().g(i);
    }

    public n i(n.a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        a().n();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a().m();
        super.onCreate(bundle);
        a().r(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        a().x();
    }

    public void setContentView(int i) {
        a().A(i);
    }

    public void setContentView(View view) {
        a().B(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().C(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        a().F(getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().F(charSequence);
    }
}
