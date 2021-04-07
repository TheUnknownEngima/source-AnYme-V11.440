package com.zunjae.anyme.features.recommendations;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import java.util.Arrays;
import java.util.List;

@SuppressLint({"DefaultLocale"})
public final class b extends RecyclerView.g<a> {
    private List<vx1> c;
    private final Activity d;

    public static final class a extends RecyclerView.c0 {
        private final TextView A;
        private final TextView B;
        private final ImageView x;
        private final TextView y;
        private final CardView z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            v62.e(view, "itemView");
            ImageView imageView = (ImageView) view.findViewById(C0275R$id.seriesImage);
            v62.c(imageView);
            this.x = imageView;
            TextView textView = (TextView) view.findViewById(C0275R$id.seriesTitle);
            v62.c(textView);
            this.y = textView;
            CardView cardView = (CardView) view.findViewById(C0275R$id.cardViewContainer);
            v62.c(cardView);
            this.z = cardView;
            TextView textView2 = (TextView) view.findViewById(C0275R$id.seriesScore);
            v62.c(textView2);
            this.A = textView2;
            TextView textView3 = (TextView) view.findViewById(C0275R$id.seriesDescription);
            v62.c(textView3);
            this.B = textView3;
        }

        public final CardView M() {
            return this.z;
        }

        public final TextView N() {
            return this.B;
        }

        public final ImageView O() {
            return this.x;
        }

        public final TextView P() {
            return this.A;
        }

        public final TextView Q() {
            return this.y;
        }
    }

    /* renamed from: com.zunjae.anyme.features.recommendations.b$b  reason: collision with other inner class name */
    static final class C0208b implements View.OnClickListener {
        final /* synthetic */ b e;
        final /* synthetic */ vx1 f;

        C0208b(b bVar, vx1 vx1) {
            this.e = bVar;
            this.f = vx1;
        }

        public final void onClick(View view) {
            this.e.H().startActivity(AnimeInfoActivity.M.b(this.e.H(), this.f.a()));
        }
    }

    public b(Activity activity) {
        v62.e(activity, "context");
        this.d = activity;
    }

    public final Activity H() {
        return this.d;
    }

    /* renamed from: I */
    public void w(a aVar, int i) {
        v62.e(aVar, "holder");
        List<vx1> list = this.c;
        v62.c(list);
        vx1 vx1 = list.get(i);
        aVar.Q().setText(vx1.e());
        com.zunjae.anyme.a.a(this.d).t(vx1.c()).K0(aVar.O());
        TextView P = aVar.P();
        h72 h72 = h72.a;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{vx1.d()}, 1));
        v62.d(format, "java.lang.String.format(format, *args)");
        P.setText(format);
        TextView N = aVar.N();
        N.setText(vx1.b() + "Eps");
        aVar.M().setOnClickListener(new C0208b(this, vx1));
    }

    /* renamed from: J */
    public a y(ViewGroup viewGroup, int i) {
        v62.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0278R$layout.cardview_kanon_search_results, viewGroup, false);
        v62.d(inflate, "view");
        return new a(inflate);
    }

    public final void K(List<vx1> list) {
        this.c = list;
        l();
    }

    public int g() {
        List<vx1> list = this.c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
