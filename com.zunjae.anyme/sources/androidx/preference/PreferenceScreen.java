package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.j;

public final class PreferenceScreen extends PreferenceGroup {
    private boolean c0 = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, i2.a(context, R$attr.preferenceScreenStyle, 16842891));
    }

    /* access modifiers changed from: protected */
    public boolean c1() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void d0() {
        j.b e;
        if (w() == null && t() == null && b1() != 0 && (e = I().e()) != null) {
            e.e(this);
        }
    }

    public boolean k1() {
        return this.c0;
    }
}
