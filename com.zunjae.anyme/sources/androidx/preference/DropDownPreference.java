package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropDownPreference extends ListPreference {
    private final Context e0;
    private final ArrayAdapter f0;
    private Spinner g0;
    private final AdapterView.OnItemSelectedListener h0;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.e1()[i].toString();
                if (!charSequence.equals(DropDownPreference.this.f1()) && DropDownPreference.this.e(charSequence)) {
                    DropDownPreference.this.h1(charSequence);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.dropdownPreferenceStyle);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.h0 = new a();
        this.e0 = context;
        this.f0 = i1();
        k1();
    }

    private int j1(String str) {
        CharSequence[] e1 = e1();
        if (str == null || e1 == null) {
            return -1;
        }
        for (int length = e1.length - 1; length >= 0; length--) {
            if (e1[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    private void k1() {
        this.f0.clear();
        if (c1() != null) {
            for (CharSequence charSequence : c1()) {
                this.f0.add(charSequence.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void V() {
        super.V();
        ArrayAdapter arrayAdapter = this.f0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    public void c0(l lVar) {
        Spinner spinner = (Spinner) lVar.e.findViewById(R$id.spinner);
        this.g0 = spinner;
        spinner.setAdapter(this.f0);
        this.g0.setOnItemSelectedListener(this.h0);
        this.g0.setSelection(j1(f1()));
        super.c0(lVar);
    }

    /* access modifiers changed from: protected */
    public void d0() {
        this.g0.performClick();
    }

    /* access modifiers changed from: protected */
    public ArrayAdapter i1() {
        return new ArrayAdapter(this.e0, 17367049);
    }
}
