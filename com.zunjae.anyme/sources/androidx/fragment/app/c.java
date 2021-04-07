package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler a0;
    private Runnable b0 = new a();
    private DialogInterface.OnCancelListener c0 = new b();
    /* access modifiers changed from: private */
    public DialogInterface.OnDismissListener d0 = new C0024c();
    private int e0 = 0;
    private int f0 = 0;
    private boolean g0 = true;
    private boolean h0 = true;
    private int i0 = -1;
    private boolean j0;
    /* access modifiers changed from: private */
    public Dialog k0;
    private boolean l0;
    private boolean m0;
    private boolean n0;

    class a implements Runnable {
        a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            c.this.d0.onDismiss(c.this.k0);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (c.this.k0 != null) {
                c cVar = c.this;
                cVar.onCancel(cVar.k0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    class C0024c implements DialogInterface.OnDismissListener {
        C0024c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (c.this.k0 != null) {
                c cVar = c.this;
                cVar.onDismiss(cVar.k0);
            }
        }
    }

    private void M1(boolean z, boolean z2) {
        if (!this.m0) {
            this.m0 = true;
            this.n0 = false;
            Dialog dialog = this.k0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.k0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.a0.getLooper()) {
                        onDismiss(this.k0);
                    } else {
                        this.a0.post(this.b0);
                    }
                }
            }
            this.l0 = true;
            if (this.i0 >= 0) {
                G().H0(this.i0, 1);
                this.i0 = -1;
                return;
            }
            s j = G().j();
            j.p(this);
            if (z) {
                j.j();
            } else {
                j.i();
            }
        }
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        Dialog dialog = this.k0;
        if (dialog != null) {
            bundle.putBundle("android:savedDialogState", dialog.onSaveInstanceState());
        }
        int i = this.e0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.g0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.h0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.i0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void K0() {
        super.K0();
        Dialog dialog = this.k0;
        if (dialog != null) {
            this.l0 = false;
            dialog.show();
        }
    }

    public void L0() {
        super.L0();
        Dialog dialog = this.k0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void L1() {
        M1(false, false);
    }

    public Dialog N1() {
        return this.k0;
    }

    public int O1() {
        return this.f0;
    }

    public Dialog P1(Bundle bundle) {
        return new Dialog(o1(), O1());
    }

    public final Dialog Q1() {
        Dialog N1 = N1();
        if (N1 != null) {
            return N1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void R1(boolean z) {
        this.g0 = z;
        Dialog dialog = this.k0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void S1(boolean z) {
        this.h0 = z;
    }

    public void T1(int i, int i2) {
        this.e0 = i;
        if (i == 2 || i == 3) {
            this.f0 = 16973913;
        }
        if (i2 != 0) {
            this.f0 = i2;
        }
    }

    public void U1(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int V1(s sVar, String str) {
        this.m0 = false;
        this.n0 = true;
        sVar.e(this, str);
        this.l0 = false;
        int i = sVar.i();
        this.i0 = i;
        return i;
    }

    public void W1(k kVar, String str) {
        this.m0 = false;
        this.n0 = true;
        s j = kVar.j();
        j.e(this, str);
        j.i();
    }

    public void h0(Bundle bundle) {
        Bundle bundle2;
        super.h0(bundle);
        if (this.h0) {
            View Q = Q();
            if (this.k0 != null) {
                if (Q != null) {
                    if (Q.getParent() == null) {
                        this.k0.setContentView(Q);
                    } else {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                }
                FragmentActivity n = n();
                if (n != null) {
                    this.k0.setOwnerActivity(n);
                }
                this.k0.setCancelable(this.g0);
                this.k0.setOnCancelListener(this.c0);
                this.k0.setOnDismissListener(this.d0);
                if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                    this.k0.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    public void k0(Context context) {
        super.k0(context);
        if (!this.n0) {
            this.m0 = false;
        }
    }

    public void n0(Bundle bundle) {
        super.n0(bundle);
        this.a0 = new Handler();
        this.h0 = this.A == 0;
        if (bundle != null) {
            this.e0 = bundle.getInt("android:style", 0);
            this.f0 = bundle.getInt("android:theme", 0);
            this.g0 = bundle.getBoolean("android:cancelable", true);
            this.h0 = bundle.getBoolean("android:showsDialog", this.h0);
            this.i0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.l0) {
            M1(true, true);
        }
    }

    public void u0() {
        super.u0();
        Dialog dialog = this.k0;
        if (dialog != null) {
            this.l0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.k0.dismiss();
            if (!this.m0) {
                onDismiss(this.k0);
            }
            this.k0 = null;
        }
    }

    public void v0() {
        super.v0();
        if (!this.n0 && !this.m0) {
            this.m0 = true;
        }
    }

    /* JADX INFO: finally extract failed */
    public LayoutInflater w0(Bundle bundle) {
        LayoutInflater w0 = super.w0(bundle);
        if (!this.h0 || this.j0) {
            return w0;
        }
        try {
            this.j0 = true;
            Dialog P1 = P1(bundle);
            this.k0 = P1;
            U1(P1, this.e0);
            this.j0 = false;
            return w0.cloneInContext(Q1().getContext());
        } catch (Throwable th) {
            this.j0 = false;
            throw th;
        }
    }
}
