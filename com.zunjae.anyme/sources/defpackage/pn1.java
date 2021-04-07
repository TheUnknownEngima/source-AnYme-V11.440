package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.mikepenz.materialdrawer.R$id;
import com.mikepenz.materialdrawer.R$layout;
import defpackage.pn1;
import java.util.List;

/* renamed from: pn1  reason: default package */
public abstract class pn1<Item extends pn1> extends sn1<Item, a> implements Object<Item> {
    protected ln1 B;
    protected hn1 C = new hn1();

    /* renamed from: pn1$a */
    public static class a extends un1 {
        /* access modifiers changed from: private */
        public View B;
        /* access modifiers changed from: private */
        public TextView C;

        public a(View view) {
            super(view);
            this.B = view.findViewById(R$id.material_drawer_badge_container);
            this.C = (TextView) view.findViewById(R$id.material_drawer_badge);
        }
    }

    public int d() {
        return R$id.material_drawer_item_primary;
    }

    public int h() {
        return R$layout.material_drawer_item_primary;
    }

    /* renamed from: i0 */
    public void q(a aVar, List list) {
        View view;
        int i;
        super.q(aVar, list);
        Context context = aVar.e.getContext();
        d0(aVar);
        if (so1.d(this.B, aVar.C)) {
            this.C.f(aVar.C, U(H(context), R(context)));
            view = aVar.B;
            i = 0;
        } else {
            view = aVar.B;
            i = 8;
        }
        view.setVisibility(i);
        if (V() != null) {
            aVar.C.setTypeface(V());
        }
        A(this, aVar.e);
    }

    /* renamed from: j0 */
    public a y(View view) {
        return new a(view);
    }

    public Item k0(ln1 ln1) {
        this.B = ln1;
        return this;
    }

    public /* bridge */ /* synthetic */ Object p(ln1 ln1) {
        k0(ln1);
        return this;
    }
}
