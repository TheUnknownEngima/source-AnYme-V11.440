package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class a extends f {
    private EditText w0;
    private CharSequence x0;

    private EditTextPreference e2() {
        return (EditTextPreference) X1();
    }

    public static a f2(String str) {
        a aVar = new a();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        aVar.u1(bundle);
        return aVar;
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.x0);
    }

    /* access modifiers changed from: protected */
    public boolean Y1() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void Z1(View view) {
        super.Z1(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.w0 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.w0.setText(this.x0);
            EditText editText2 = this.w0;
            editText2.setSelection(editText2.getText().length());
            if (e2().b1() != null) {
                e2().b1().a(this.w0);
                return;
            }
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    public void b2(boolean z) {
        if (z) {
            String obj = this.w0.getText().toString();
            EditTextPreference e2 = e2();
            if (e2.e(obj)) {
                e2.d1(obj);
            }
        }
    }

    public void n0(Bundle bundle) {
        super.n0(bundle);
        this.x0 = bundle == null ? e2().c1() : bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
    }
}
