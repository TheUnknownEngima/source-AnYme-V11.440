package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import java.util.List;
import mehdi.sakout.fancybuttons.FancyButton;

/* renamed from: ju1  reason: default package */
public final class ju1 extends RecyclerView.g<a> {
    private List<? extends xq1> c;
    /* access modifiers changed from: private */
    public final ku1 d;

    /* renamed from: ju1$a */
    public static final class a extends RecyclerView.c0 {
        private final FancyButton x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            v62.e(view, "view");
            FancyButton fancyButton = (FancyButton) view.findViewById(C0275R$id.chipItem);
            v62.c(fancyButton);
            this.x = fancyButton;
        }

        public final FancyButton M() {
            return this.x;
        }
    }

    /* renamed from: ju1$b */
    static final class b implements View.OnClickListener {
        final /* synthetic */ ju1 e;
        final /* synthetic */ xq1 f;

        b(ju1 ju1, xq1 xq1) {
            this.e = ju1;
            this.f = xq1;
        }

        public final void onClick(View view) {
            this.e.d.a(this.f);
        }
    }

    public ju1(ku1 ku1) {
        v62.e(ku1, "chipListener");
        this.d = ku1;
    }

    /* renamed from: I */
    public void w(a aVar, int i) {
        v62.e(aVar, "holder");
        List<? extends xq1> list = this.c;
        v62.c(list);
        xq1 xq1 = (xq1) list.get(i);
        aVar.M().setText(xq1.a());
        aVar.M().setOnClickListener(new b(this, xq1));
    }

    /* renamed from: J */
    public a y(ViewGroup viewGroup, int i) {
        v62.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0278R$layout.cardview_chips, viewGroup, false);
        v62.d(inflate, "view");
        return new a(inflate);
    }

    public final void K(List<? extends xq1> list) {
        this.c = list;
        l();
    }

    public int g() {
        List<? extends xq1> list = this.c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
