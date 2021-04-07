package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.zunjae.anyme.abstracts.AbstractActivity;
import java.util.HashMap;

/* renamed from: qs1  reason: default package */
public abstract class qs1 extends Fragment {
    private AbstractActivity a0;
    private HashMap b0;

    public void J1() {
        HashMap hashMap = this.b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    public final AbstractActivity K1() {
        return this.a0;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        this.a0 = (AbstractActivity) n();
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
