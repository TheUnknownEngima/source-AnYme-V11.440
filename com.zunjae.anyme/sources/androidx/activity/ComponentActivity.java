package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.x;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements n, e0, androidx.savedstate.b, c {
    private final o f = new o(this);
    private final androidx.savedstate.a g = androidx.savedstate.a.a(this);
    private d0 h;
    private final OnBackPressedDispatcher i = new OnBackPressedDispatcher(new a());
    private int j;

    class a implements Runnable {
        a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    static final class b {
        Object a;
        d0 b;

        b() {
        }
    }

    public ComponentActivity() {
        if (a() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                a().a(new l() {
                    public void c(n nVar, h.a aVar) {
                        if (aVar == h.a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            a().a(new l() {
                public void c(n nVar, h.a aVar) {
                    if (aVar == h.a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.h().a();
                    }
                }
            });
            int i2 = Build.VERSION.SDK_INT;
            if (19 <= i2 && i2 <= 23) {
                a().a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public h a() {
        return this.f;
    }

    public final OnBackPressedDispatcher c() {
        return this.i;
    }

    public d0 h() {
        if (getApplication() != null) {
            if (this.h == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.h = bVar.b;
                }
                if (this.h == null) {
                    this.h = new d0();
                }
            }
            return this.h;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final SavedStateRegistry j() {
        return this.g.b();
    }

    @Deprecated
    public Object m() {
        return null;
    }

    public void onBackPressed() {
        this.i.c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g.c(bundle);
        x.g(this);
        int i2 = this.j;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object m = m();
        d0 d0Var = this.h;
        if (d0Var == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            d0Var = bVar.b;
        }
        if (d0Var == null && m == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.a = m;
        bVar2.b = d0Var;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        h a2 = a();
        if (a2 instanceof o) {
            ((o) a2).p(h.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.g.d(bundle);
    }
}
