package com.zunjae.anyme.features.bookmarks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.g<C0168a> {
    private List<sy1> c;
    private List<sy1> d;
    private ArrayList<Integer> e;
    private final Context f;
    private final ArrayList<Integer> g;

    /* renamed from: com.zunjae.anyme.features.bookmarks.a$a  reason: collision with other inner class name */
    public static final class C0168a extends RecyclerView.c0 {
        private final CardView A;
        private final ImageView x;
        private final TextView y;
        private final FrameLayout z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0168a(View view) {
            super(view);
            v62.e(view, "itemView");
            ImageView imageView = (ImageView) view.findViewById(C0275R$id.seriesImage);
            v62.c(imageView);
            this.x = imageView;
            TextView textView = (TextView) view.findViewById(C0275R$id.seriesTitle);
            v62.c(textView);
            this.y = textView;
            FrameLayout frameLayout = (FrameLayout) view.findViewById(C0275R$id.addedOverlay);
            v62.c(frameLayout);
            this.z = frameLayout;
            CardView cardView = (CardView) view.findViewById(C0275R$id.cardViewContainer);
            v62.c(cardView);
            this.A = cardView;
        }

        public final FrameLayout M() {
            return this.z;
        }

        public final CardView N() {
            return this.A;
        }

        public final ImageView O() {
            return this.x;
        }

        public final TextView P() {
            return this.y;
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ a e;
        final /* synthetic */ sy1 f;
        final /* synthetic */ C0168a g;

        b(a aVar, sy1 sy1, C0168a aVar2) {
            this.e = aVar;
            this.f = sy1;
            this.g = aVar2;
        }

        public final void onClick(View view) {
            if (this.e.J().contains(Integer.valueOf(this.f.i()))) {
                this.e.J().remove(Integer.valueOf(this.f.i()));
                rw1.a(this.g.M());
                return;
            }
            rw1.i(this.g.M());
            this.e.J().add(Integer.valueOf(this.f.i()));
        }
    }

    public a(Context context, ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        v62.e(context, "context");
        v62.e(arrayList, "originalListAlreadyAdded");
        this.f = context;
        this.g = arrayList;
        this.e = arrayList2 == null ? new ArrayList<>(this.g) : arrayList2;
    }

    public final j H() {
        return new j(n32.N(this.e, this.g), n32.N(this.g, this.e));
    }

    public final void I(String str) {
        ArrayList arrayList;
        v62.e(str, "query");
        List<sy1> list = this.c;
        if (list != null) {
            arrayList = new ArrayList();
            for (T next : list) {
                if (((sy1) next).i0(str)) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        this.d = arrayList;
        l();
    }

    public final ArrayList<Integer> J() {
        return this.e;
    }

    /* renamed from: K */
    public void w(C0168a aVar, int i) {
        v62.e(aVar, "holder");
        List<sy1> list = this.d;
        v62.c(list);
        sy1 sy1 = list.get(i);
        if (this.e.contains(Integer.valueOf(sy1.i()))) {
            rw1.i(aVar.M());
        } else {
            rw1.a(aVar.M());
        }
        aVar.P().setText(sy1.y());
        com.zunjae.anyme.a.b(this.f).t(sy1.w()).K0(aVar.O());
        aVar.N().setOnClickListener(new b(this, sy1, aVar));
    }

    /* renamed from: L */
    public C0168a y(ViewGroup viewGroup, int i) {
        v62.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0278R$layout.cardview_anime_add_shows, viewGroup, false);
        v62.d(inflate, "view");
        return new C0168a(inflate);
    }

    public final void M(List<sy1> list) {
        v62.e(list, "animes");
        this.c = list;
        this.d = n32.d0(list);
        l();
    }

    public int g() {
        List<sy1> list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
