package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.materialdrawer.R$attr;
import com.mikepenz.materialdrawer.R$color;
import com.mikepenz.materialdrawer.R$id;
import com.mikepenz.materialdrawer.R$layout;
import java.util.List;

/* renamed from: wn1  reason: default package */
public class wn1 extends qn1<wn1, b> {

    /* renamed from: wn1$b */
    public static class b extends RecyclerView.c0 {
        /* access modifiers changed from: private */
        public View x;
        /* access modifiers changed from: private */
        public View y;

        private b(View view) {
            super(view);
            this.x = view;
            this.y = view.findViewById(R$id.material_drawer_divider);
        }
    }

    /* renamed from: H */
    public void q(b bVar, List list) {
        super.q(bVar, list);
        Context context = bVar.e.getContext();
        bVar.e.setId(hashCode());
        bVar.x.setClickable(false);
        bVar.x.setEnabled(false);
        bVar.x.setMinimumHeight(1);
        o4.s0(bVar.x, 2);
        bVar.y.setBackgroundColor(to1.m(context, R$attr.material_drawer_divider, R$color.material_drawer_divider));
        A(this, bVar.e);
    }

    /* renamed from: I */
    public b y(View view) {
        return new b(view);
    }

    public int d() {
        return R$id.material_drawer_item_divider;
    }

    public int h() {
        return R$layout.material_drawer_item_divider;
    }
}
