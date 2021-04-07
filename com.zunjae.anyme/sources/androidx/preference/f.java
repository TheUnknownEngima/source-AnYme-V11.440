package androidx.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.preference.DialogPreference;

public abstract class f extends c implements DialogInterface.OnClickListener {
    private DialogPreference o0;
    private CharSequence p0;
    private CharSequence q0;
    private CharSequence r0;
    private CharSequence s0;
    private int t0;
    private BitmapDrawable u0;
    private int v0;

    private void d2(Dialog dialog) {
        dialog.getWindow().setSoftInputMode(5);
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.p0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.q0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.r0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.s0);
        bundle.putInt("PreferenceDialogFragment.layout", this.t0);
        BitmapDrawable bitmapDrawable = this.u0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public Dialog P1(Bundle bundle) {
        FragmentActivity n = n();
        this.v0 = -2;
        c.a aVar = new c.a(n);
        aVar.m(this.p0);
        aVar.e(this.u0);
        aVar.j(this.q0, this);
        aVar.h(this.r0, this);
        View a2 = a2(n);
        if (a2 != null) {
            Z1(a2);
            aVar.n(a2);
        } else {
            aVar.f(this.s0);
        }
        c2(aVar);
        androidx.appcompat.app.c a = aVar.a();
        if (Y1()) {
            d2(a);
        }
        return a;
    }

    public DialogPreference X1() {
        if (this.o0 == null) {
            this.o0 = (DialogPreference) ((DialogPreference.a) P()).b(s().getString("key"));
        }
        return this.o0;
    }

    /* access modifiers changed from: protected */
    public boolean Y1() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void Z1(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.s0;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public View a2(Context context) {
        int i = this.t0;
        if (i == 0) {
            return null;
        }
        return B().inflate(i, (ViewGroup) null);
    }

    public abstract void b2(boolean z);

    /* access modifiers changed from: protected */
    public void c2(c.a aVar) {
    }

    public void n0(Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        super.n0(bundle);
        Fragment P = P();
        if (P instanceof DialogPreference.a) {
            DialogPreference.a aVar = (DialogPreference.a) P;
            String string = s().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) aVar.b(string);
                this.o0 = dialogPreference;
                this.p0 = dialogPreference.Y0();
                this.q0 = this.o0.a1();
                this.r0 = this.o0.Z0();
                this.s0 = this.o0.X0();
                this.t0 = this.o0.W0();
                Drawable V0 = this.o0.V0();
                if (V0 == null || (V0 instanceof BitmapDrawable)) {
                    bitmapDrawable = (BitmapDrawable) V0;
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(V0.getIntrinsicWidth(), V0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    V0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    V0.draw(canvas);
                    bitmapDrawable = new BitmapDrawable(I(), createBitmap);
                }
                this.u0 = bitmapDrawable;
                return;
            }
            this.p0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.q0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.r0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.s0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.t0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.u0 = new BitmapDrawable(I(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.v0 = i;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        b2(this.v0 == -1);
    }
}
