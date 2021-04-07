package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.materialdrawer.R$id;
import com.mikepenz.materialdrawer.R$layout;
import java.util.List;

/* renamed from: zn1  reason: default package */
public class zn1 extends qn1<zn1, a> implements ho1<zn1> {
    protected kn1 l;
    protected jn1 m;

    /* renamed from: zn1$a */
    public static class a extends RecyclerView.c0 {
        /* access modifiers changed from: private */
        public ImageView x;

        public a(View view) {
            super(view);
            this.x = (ImageView) view.findViewById(R$id.material_drawer_icon);
        }
    }

    public zn1(bo1 bo1) {
        this.l = bo1.m;
        this.c = bo1.c;
        E(false);
    }

    /* renamed from: H */
    public void q(a aVar, List list) {
        super.q(aVar, list);
        if (this.m != null) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) aVar.e.getLayoutParams();
            layoutParams.height = this.m.a(aVar.e.getContext());
            aVar.e.setLayoutParams(layoutParams);
        }
        aVar.e.setId(hashCode());
        aVar.e.setEnabled(isEnabled());
        ro1.d(getIcon(), aVar.x);
        A(this, aVar.e);
    }

    /* renamed from: I */
    public a y(View view) {
        return new a(view);
    }

    public ln1 a() {
        return null;
    }

    public int d() {
        return R$id.material_drawer_item_mini_profile;
    }

    public kn1 getIcon() {
        return this.l;
    }

    public int h() {
        return R$layout.material_drawer_item_mini_profile;
    }

    public ln1 r() {
        return null;
    }
}
