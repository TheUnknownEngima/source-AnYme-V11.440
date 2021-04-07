package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList;
import com.zunjae.anyme.features.kanon.generic_anime_list.c;
import defpackage.ny1;
import java.util.ArrayList;
import mehdi.sakout.fancybuttons.FancyButton;

/* renamed from: dt1  reason: default package */
public final class dt1 extends RecyclerView.g<a> {
    private final ArrayList<ny1> c;
    /* access modifiers changed from: private */
    public final Context d;

    /* renamed from: dt1$a */
    public static final class a extends RecyclerView.c0 {
        private final FancyButton x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            v62.e(view, "view");
            FancyButton fancyButton = (FancyButton) view.findViewById(C0275R$id.genreButton);
            v62.c(fancyButton);
            this.x = fancyButton;
        }

        public final FancyButton M() {
            return this.x;
        }
    }

    /* renamed from: dt1$b */
    static final class b implements View.OnClickListener {
        final /* synthetic */ dt1 e;
        final /* synthetic */ ny1 f;

        b(dt1 dt1, ny1 ny1) {
            this.e = dt1;
            this.f = ny1;
        }

        public final void onClick(View view) {
            this.e.d.startActivity(GenericItemList.d.b(GenericItemList.M, this.e.d, c.Genre, this.f.a(), this.f.b(), (String) null, 16, (Object) null));
        }
    }

    public dt1(Context context) {
        v62.e(context, "context");
        this.d = context;
        this.c = ny1.a.b(ny1.c, qv1.a.z(context), false, 2, (Object) null);
    }

    /* renamed from: I */
    public void w(a aVar, int i) {
        v62.e(aVar, "holder");
        ny1 ny1 = this.c.get(i);
        v62.d(ny1, "genres[position]");
        ny1 ny12 = ny1;
        aVar.M().setText(ny12.b());
        aVar.M().setOnClickListener(new b(this, ny12));
    }

    /* renamed from: J */
    public a y(ViewGroup viewGroup, int i) {
        v62.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0278R$layout.basic_anime_genre, viewGroup, false);
        v62.d(inflate, "view");
        return new a(inflate);
    }

    public int g() {
        return this.c.size();
    }
}
