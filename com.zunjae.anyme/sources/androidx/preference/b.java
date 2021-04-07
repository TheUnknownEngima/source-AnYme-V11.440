package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

final class b extends Preference {
    private long T;

    b(Context context, List<Preference> list, long j) {
        super(context);
        V0();
        W0(list);
        this.T = j + 1000000;
    }

    private void V0() {
        H0(R$layout.expand_button);
        E0(R$drawable.ic_arrow_down_24dp);
        O0(R$string.expand_button_title);
        L0(999);
    }

    private void W0(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = null;
        for (Preference next : list) {
            CharSequence M = next.M();
            boolean z = next instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(M)) {
                arrayList.add((PreferenceGroup) next);
            }
            if (arrayList.contains(next.B())) {
                if (z) {
                    arrayList.add((PreferenceGroup) next);
                }
            } else if (!TextUtils.isEmpty(M)) {
                if (charSequence == null) {
                    charSequence = M;
                } else {
                    charSequence = q().getString(R$string.summary_collapsed_preference_list, new Object[]{charSequence, M});
                }
            }
        }
        M0(charSequence);
    }

    public void c0(l lVar) {
        super.c0(lVar);
        lVar.P(false);
    }

    /* access modifiers changed from: package-private */
    public long v() {
        return this.T;
    }
}
