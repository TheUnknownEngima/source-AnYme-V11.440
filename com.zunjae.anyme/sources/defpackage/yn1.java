package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.materialdrawer.R$dimen;
import com.mikepenz.materialdrawer.R$id;
import com.mikepenz.materialdrawer.R$layout;
import java.util.List;

/* renamed from: yn1  reason: default package */
public class yn1 extends tn1<yn1, a> {
    private hn1 A = new hn1();
    private boolean B = false;
    protected jn1 C;
    private ln1 z;

    /* renamed from: yn1$a */
    public static class a extends RecyclerView.c0 {
        /* access modifiers changed from: private */
        public View x;
        /* access modifiers changed from: private */
        public ImageView y;
        /* access modifiers changed from: private */
        public TextView z;

        public a(View view) {
            super(view);
            this.x = view;
            this.y = (ImageView) view.findViewById(R$id.material_drawer_icon);
            this.z = (TextView) view.findViewById(R$id.material_drawer_badge);
        }
    }

    public yn1() {
    }

    public yn1(ao1 ao1) {
        this.a = ao1.a;
        this.b = ao1.b;
        this.z = ao1.B;
        this.A = ao1.C;
        this.c = ao1.c;
        this.e = ao1.e;
        this.d = ao1.d;
        this.l = ao1.l;
        this.m = ao1.m;
        this.o = ao1.o;
        this.p = ao1.p;
        this.t = ao1.t;
        this.u = ao1.u;
        this.v = ao1.v;
    }

    public yn1(do1 do1) {
        this.a = do1.a;
        this.b = do1.b;
        this.z = do1.B;
        this.A = do1.C;
        this.c = do1.c;
        this.e = do1.e;
        this.d = do1.d;
        this.l = do1.l;
        this.m = do1.m;
        this.o = do1.o;
        this.p = do1.p;
        this.t = do1.t;
        this.u = do1.u;
        this.v = do1.v;
    }

    public int d() {
        return R$id.material_drawer_item_mini;
    }

    /* renamed from: d0 */
    public void q(a aVar, List list) {
        super.q(aVar, list);
        Context context = aVar.e.getContext();
        if (this.C != null) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) aVar.e.getLayoutParams();
            layoutParams.height = this.C.a(context);
            aVar.e.setLayoutParams(layoutParams);
        }
        aVar.e.setId(hashCode());
        aVar.e.setEnabled(isEnabled());
        aVar.e.setSelected(f());
        aVar.e.setTag(this);
        int K = K(context);
        int P = P(context);
        if (this.B) {
            no1.h(context, aVar.x, M(context), z());
        }
        if (so1.d(this.z, aVar.z)) {
            this.A.e(aVar.z);
        }
        ro1.a(kn1.l(getIcon(), context, K, W(), 1), K, kn1.l(O(), context, P, W(), 1), P, W(), aVar.y);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.material_drawer_padding);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R$dimen.material_mini_drawer_item_padding);
        aVar.e.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        A(this, aVar.e);
    }

    /* renamed from: e0 */
    public a y(View view) {
        return new a(view);
    }

    public yn1 f0(boolean z2) {
        this.B = z2;
        return this;
    }

    public int h() {
        return R$layout.material_drawer_item_mini;
    }
}
