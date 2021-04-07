package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.materialdrawer.R$attr;
import com.mikepenz.materialdrawer.R$color;
import com.mikepenz.materialdrawer.R$dimen;
import com.mikepenz.materialdrawer.R$id;
import com.mikepenz.materialdrawer.R$layout;
import java.util.List;

/* renamed from: vn1  reason: default package */
public class vn1 extends qn1<vn1, c> {
    private jn1 l;
    private View m;
    private b n = b.TOP;
    private boolean o = true;

    /* renamed from: vn1$b */
    public enum b {
        TOP,
        BOTTOM,
        NONE
    }

    /* renamed from: vn1$c */
    public static class c extends RecyclerView.c0 {
        /* access modifiers changed from: private */
        public View x;

        private c(View view) {
            super(view);
            this.x = view;
        }
    }

    /* renamed from: H */
    public void q(c cVar, List list) {
        super.q(cVar, list);
        Context context = cVar.e.getContext();
        cVar.e.setId(hashCode());
        cVar.x.setEnabled(false);
        if (this.m.getParent() != null) {
            ((ViewGroup) this.m.getParent()).removeView(this.m);
        }
        int i = -2;
        if (this.l != null) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) cVar.x.getLayoutParams();
            int a2 = this.l.a(context);
            layoutParams.height = a2;
            cVar.x.setLayoutParams(layoutParams);
            i = a2;
        }
        ((ViewGroup) cVar.x).removeAllViews();
        boolean z = this.o;
        View view = new View(context);
        view.setMinimumHeight(z ? 1 : 0);
        view.setBackgroundColor(to1.m(context, R$attr.material_drawer_divider, R$color.material_drawer_divider));
        float f = z ? 1.0f : 0.0f;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) to1.a(f, context));
        if (this.l != null) {
            i -= (int) to1.a(f, context);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, i);
        b bVar = this.n;
        if (bVar == b.TOP) {
            ((ViewGroup) cVar.x).addView(this.m, layoutParams3);
            layoutParams2.bottomMargin = context.getResources().getDimensionPixelSize(R$dimen.material_drawer_padding);
            ((ViewGroup) cVar.x).addView(view, layoutParams2);
        } else {
            if (bVar == b.BOTTOM) {
                layoutParams2.topMargin = context.getResources().getDimensionPixelSize(R$dimen.material_drawer_padding);
                ((ViewGroup) cVar.x).addView(view, layoutParams2);
            }
            ((ViewGroup) cVar.x).addView(this.m, layoutParams3);
        }
        A(this, cVar.e);
    }

    /* renamed from: I */
    public c y(View view) {
        return new c(view);
    }

    public vn1 J(boolean z) {
        this.o = z;
        return this;
    }

    public vn1 K(jn1 jn1) {
        this.l = jn1;
        return this;
    }

    public vn1 L(View view) {
        this.m = view;
        return this;
    }

    public vn1 M(b bVar) {
        this.n = bVar;
        return this;
    }

    public int d() {
        return R$id.material_drawer_item_container;
    }

    public int h() {
        return R$layout.material_drawer_item_container;
    }
}
