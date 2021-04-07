package defpackage;

import android.content.Context;
import com.mikepenz.materialdrawer.R$attr;
import com.mikepenz.materialdrawer.R$color;
import com.mikepenz.materialdrawer.R$id;
import com.mikepenz.materialdrawer.R$layout;

/* renamed from: do1  reason: default package */
public class do1 extends pn1<do1> {
    /* access modifiers changed from: protected */
    public int H(Context context) {
        int i;
        int i2;
        in1 in1;
        if (isEnabled()) {
            in1 = T();
            i2 = R$attr.material_drawer_secondary_text;
            i = R$color.material_drawer_secondary_text;
        } else {
            in1 = J();
            i2 = R$attr.material_drawer_hint_text;
            i = R$color.material_drawer_hint_text;
        }
        return po1.g(in1, context, i2, i);
    }

    public int d() {
        return R$id.material_drawer_item_secondary;
    }

    public int h() {
        return R$layout.material_drawer_item_secondary;
    }
}
