package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.c;

public class c extends f {
    int w0;
    private CharSequence[] x0;
    private CharSequence[] y0;

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            c cVar = c.this;
            cVar.w0 = i;
            cVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    private ListPreference e2() {
        return (ListPreference) X1();
    }

    public static c f2(String str) {
        c cVar = new c();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        cVar.u1(bundle);
        return cVar;
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.w0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.x0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.y0);
    }

    public void b2(boolean z) {
        int i;
        if (z && (i = this.w0) >= 0) {
            String charSequence = this.y0[i].toString();
            ListPreference e2 = e2();
            if (e2.e(charSequence)) {
                e2.h1(charSequence);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c2(c.a aVar) {
        super.c2(aVar);
        aVar.l(this.x0, this.w0, new a());
        aVar.j((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public void n0(Bundle bundle) {
        super.n0(bundle);
        if (bundle == null) {
            ListPreference e2 = e2();
            if (e2.c1() == null || e2.e1() == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.w0 = e2.b1(e2.f1());
            this.x0 = e2.c1();
            this.y0 = e2.e1();
            return;
        }
        this.w0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.x0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.y0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }
}
