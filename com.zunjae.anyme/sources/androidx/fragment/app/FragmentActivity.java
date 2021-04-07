package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.c;
import androidx.core.app.a;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FragmentActivity extends ComponentActivity implements a.b, a.d {
    final f k = f.b(new a());
    final o l = new o(this);
    boolean m;
    boolean n;
    boolean o = true;
    boolean p;
    boolean q;
    boolean r;
    int s;
    i0<String> t;

    class a extends h<FragmentActivity> implements e0, c {
        public a() {
            super(FragmentActivity.this);
        }

        public h a() {
            return FragmentActivity.this.l;
        }

        public OnBackPressedDispatcher c() {
            return FragmentActivity.this.c();
        }

        public View d(int i2) {
            return FragmentActivity.this.findViewById(i2);
        }

        public boolean e() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public d0 h() {
            return FragmentActivity.this.h();
        }

        public void k(Fragment fragment) {
            FragmentActivity.this.t(fragment);
        }

        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        public LayoutInflater n() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        public void o(Fragment fragment, String[] strArr, int i2) {
            FragmentActivity.this.w(fragment, strArr, i2);
        }

        public boolean p(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        public void q(Fragment fragment, Intent intent, int i2, Bundle bundle) {
            FragmentActivity.this.x(fragment, intent, i2, bundle);
        }

        public void r() {
            FragmentActivity.this.y();
        }

        /* renamed from: s */
        public FragmentActivity m() {
            return FragmentActivity.this;
        }
    }

    private int n(Fragment fragment) {
        if (this.t.r() < 65534) {
            while (this.t.j(this.s) >= 0) {
                this.s = (this.s + 1) % 65534;
            }
            int i = this.s;
            this.t.p(i, fragment.i);
            this.s = (this.s + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    static void o(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void r() {
        do {
        } while (s(q(), h.b.CREATED));
    }

    private static boolean s(k kVar, h.b bVar) {
        boolean z = false;
        for (Fragment next : kVar.i0()) {
            if (next != null) {
                if (next.A() != null) {
                    z |= s(next.t(), bVar);
                }
                w wVar = next.V;
                if (wVar != null && wVar.a().b().isAtLeast(h.b.STARTED)) {
                    next.V.f(bVar);
                    z = true;
                }
                if (next.U.b().isAtLeast(h.b.STARTED)) {
                    next.U.p(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public final void b(int i) {
        if (!this.p && i != -1) {
            o(i);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.m);
        printWriter.print(" mResumed=");
        printWriter.print(this.n);
        printWriter.print(" mStopped=");
        printWriter.print(this.o);
        if (getApplication() != null) {
            x5.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.k.u().N(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.k.v();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String f = this.t.f(i4);
            this.t.q(i4);
            if (f != null) {
                Fragment t2 = this.k.t(f);
                if (t2 == null) {
                    "Activity result no fragment exists for who: " + f;
                    return;
                }
                t2.i0(i & 65535, i2, intent);
                return;
            }
            return;
        }
        a.c m2 = androidx.core.app.a.m();
        if (m2 == null || !m2.a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.k.v();
        this.k.d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.k.a((Fragment) null);
        if (bundle != null) {
            this.k.x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.s = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (!(intArray == null || stringArray == null || intArray.length != stringArray.length)) {
                    this.t = new i0<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.t.p(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.t == null) {
            this.t = new i0<>();
            this.s = 0;
        }
        super.onCreate(bundle);
        this.l.i(h.a.ON_CREATE);
        this.k.f();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.k.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View p2 = p(view, str, context, attributeSet);
        return p2 == null ? super.onCreateView(view, str, context, attributeSet) : p2;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View p2 = p((View) null, str, context, attributeSet);
        return p2 == null ? super.onCreateView(str, context, attributeSet) : p2;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.k.h();
        this.l.i(h.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.k.i();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.k.k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.k.e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.k.j(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.k.v();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.k.l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.n = false;
        this.k.m();
        this.l.i(h.a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.k.n(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        v();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? u(view, menu) | this.k.o(menu) : super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.k.v();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String f = this.t.f(i3);
            this.t.q(i3);
            if (f != null) {
                Fragment t2 = this.k.t(f);
                if (t2 == null) {
                    "Activity result no fragment exists for who: " + f;
                    return;
                }
                t2.H0(i & 65535, strArr, iArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.n = true;
        this.k.v();
        this.k.s();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        r();
        this.l.i(h.a.ON_STOP);
        Parcelable y = this.k.y();
        if (y != null) {
            bundle.putParcelable("android:support:fragments", y);
        }
        if (this.t.r() > 0) {
            bundle.putInt("android:support:next_request_index", this.s);
            int[] iArr = new int[this.t.r()];
            String[] strArr = new String[this.t.r()];
            for (int i = 0; i < this.t.r(); i++) {
                iArr[i] = this.t.o(i);
                strArr[i] = this.t.s(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.o = false;
        if (!this.m) {
            this.m = true;
            this.k.c();
        }
        this.k.v();
        this.k.s();
        this.l.i(h.a.ON_START);
        this.k.q();
    }

    public void onStateNotSaved() {
        this.k.v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.o = true;
        r();
        this.k.r();
        this.l.i(h.a.ON_STOP);
    }

    /* access modifiers changed from: package-private */
    public final View p(View view, String str, Context context, AttributeSet attributeSet) {
        return this.k.w(view, str, context, attributeSet);
    }

    public k q() {
        return this.k.u();
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.r && i != -1) {
            o(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.r && i != -1) {
            o(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.q && i != -1) {
            o(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.q && i != -1) {
            o(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void t(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean u(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* access modifiers changed from: protected */
    public void v() {
        this.l.i(h.a.ON_RESUME);
        this.k.p();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void w(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            androidx.core.app.a.o(this, strArr, i);
            return;
        }
        o(i);
        try {
            this.p = true;
            androidx.core.app.a.o(this, strArr, ((n(fragment) + 1) << 16) + (i & 65535));
            this.p = false;
        } catch (Throwable th) {
            this.p = false;
            throw th;
        }
    }

    public void x(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.r = true;
        if (i == -1) {
            try {
                androidx.core.app.a.q(this, intent, -1, bundle);
            } finally {
                this.r = false;
            }
        } else {
            o(i);
            androidx.core.app.a.q(this, intent, ((n(fragment) + 1) << 16) + (i & 65535), bundle);
            this.r = false;
        }
    }

    @Deprecated
    public void y() {
        invalidateOptionsMenu();
    }
}
