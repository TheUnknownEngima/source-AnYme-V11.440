package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.mikepenz.materialdrawer.R$id;
import com.mikepenz.materialdrawer.R$layout;
import com.mikepenz.materialdrawer.c;
import defpackage.mn1;
import java.util.List;

/* renamed from: xn1  reason: default package */
public class xn1 extends sn1<xn1, b> {
    /* access modifiers changed from: private */
    public c.a B;
    protected in1 C;
    protected int D = 0;
    protected int E = 180;
    private c.a F = new a();

    /* renamed from: xn1$a */
    class a implements c.a {
        a() {
        }

        public boolean a(View view, int i, go1 go1) {
            int i2;
            t4 t4Var;
            if ((go1 instanceof qn1) && go1.isEnabled()) {
                qn1 qn1 = (qn1) go1;
                if (qn1.i() != null) {
                    if (qn1.g()) {
                        t4Var = o4.c(view.findViewById(R$id.material_drawer_arrow));
                        i2 = xn1.this.E;
                    } else {
                        t4Var = o4.c(view.findViewById(R$id.material_drawer_arrow));
                        i2 = xn1.this.D;
                    }
                    t4Var.d((float) i2);
                    t4Var.k();
                }
            }
            return xn1.this.B != null && xn1.this.B.a(view, i, go1);
        }
    }

    /* renamed from: xn1$b */
    public static class b extends un1 {
        public ImageView B;

        public b(View view) {
            super(view);
            ImageView imageView = (ImageView) view.findViewById(R$id.material_drawer_arrow);
            this.B = imageView;
            tm1 tm1 = new tm1(view.getContext(), mn1.a.mdf_expand_more);
            tm1.E(16);
            tm1.w(2);
            tm1.h(-16777216);
            imageView.setImageDrawable(tm1);
        }
    }

    public /* bridge */ /* synthetic */ Object C(c.a aVar) {
        l0(aVar);
        return this;
    }

    public int d() {
        return R$id.material_drawer_item_expandable;
    }

    public int h() {
        return R$layout.material_drawer_item_expandable;
    }

    /* renamed from: j0 */
    public void q(b bVar, List list) {
        ImageView imageView;
        int i;
        super.q(bVar, list);
        Context context = bVar.e.getContext();
        d0(bVar);
        if (bVar.B.getDrawable() instanceof tm1) {
            tm1 tm1 = (tm1) bVar.B.getDrawable();
            in1 in1 = this.C;
            tm1.h(in1 != null ? in1.e(context) : K(context));
        }
        bVar.B.clearAnimation();
        if (!g()) {
            imageView = bVar.B;
            i = this.D;
        } else {
            imageView = bVar.B;
            i = this.E;
        }
        imageView.setRotation((float) i);
        A(this, bVar.e);
    }

    /* renamed from: k0 */
    public b y(View view) {
        return new b(view);
    }

    public xn1 l0(c.a aVar) {
        this.B = aVar;
        return this;
    }

    public c.a w() {
        return this.F;
    }
}
