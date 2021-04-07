package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class d extends f {
    Set<String> w0 = new HashSet();
    boolean x0;
    CharSequence[] y0;
    CharSequence[] z0;

    class a implements DialogInterface.OnMultiChoiceClickListener {
        a() {
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            boolean z2;
            boolean z3;
            d dVar = d.this;
            if (z) {
                z2 = dVar.x0;
                z3 = dVar.w0.add(dVar.z0[i].toString());
            } else {
                z2 = dVar.x0;
                z3 = dVar.w0.remove(dVar.z0[i].toString());
            }
            dVar.x0 = z3 | z2;
        }
    }

    private MultiSelectListPreference e2() {
        return (MultiSelectListPreference) X1();
    }

    public static d f2(String str) {
        d dVar = new d();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        dVar.u1(bundle);
        return dVar;
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.w0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.x0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.y0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.z0);
    }

    public void b2(boolean z) {
        if (z && this.x0) {
            MultiSelectListPreference e2 = e2();
            if (e2.e(this.w0)) {
                e2.e1(this.w0);
            }
        }
        this.x0 = false;
    }

    /* access modifiers changed from: protected */
    public void c2(c.a aVar) {
        super.c2(aVar);
        int length = this.z0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.w0.contains(this.z0[i].toString());
        }
        aVar.g(this.y0, zArr, new a());
    }

    public void n0(Bundle bundle) {
        super.n0(bundle);
        if (bundle == null) {
            MultiSelectListPreference e2 = e2();
            if (e2.b1() == null || e2.c1() == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.w0.clear();
            this.w0.addAll(e2.d1());
            this.x0 = false;
            this.y0 = e2.b1();
            this.z0 = e2.c1();
            return;
        }
        this.w0.clear();
        this.w0.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.x0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.y0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.z0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }
}
