package com.zunjae.anyme.features.discover.fast_search;

import android.annotation.SuppressLint;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.k;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import java.util.ArrayList;
import java.util.List;
import mehdi.sakout.fancybuttons.FancyButton;

@SuppressLint({"SetTextI18n"})
public final class b extends RecyclerView.g<a> {
    /* access modifiers changed from: private */
    public final ArrayList<Integer> c;
    /* access modifiers changed from: private */
    public final ArrayList<Integer> d;
    private boolean e;
    private ArrayList<a> f;
    private int g;
    /* access modifiers changed from: private */
    public final AbstractActivity h;
    private List<a> i;
    private final List<Integer> j;
    private boolean k;
    private final List<Integer> l;
    /* access modifiers changed from: private */
    public final k m;

    public static final class a extends RecyclerView.c0 {
        private final TextView A;
        private final FancyButton B;
        private final FancyButton C;
        private final TextView D;
        private final TextView x;
        private final ImageView y;
        private final TextView z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            v62.e(view, "view");
            TextView textView = (TextView) view.findViewById(C0275R$id.animeTitle);
            v62.c(textView);
            this.x = textView;
            ImageView imageView = (ImageView) view.findViewById(C0275R$id.animeImage);
            v62.c(imageView);
            this.y = imageView;
            TextView textView2 = (TextView) view.findViewById(C0275R$id.animeSynopsis);
            v62.c(textView2);
            this.z = textView2;
            TextView textView3 = (TextView) view.findViewById(C0275R$id.animeStatus);
            v62.c(textView3);
            this.A = textView3;
            FancyButton fancyButton = (FancyButton) view.findViewById(C0275R$id.addToPtwButton);
            v62.c(fancyButton);
            this.B = fancyButton;
            FancyButton fancyButton2 = (FancyButton) view.findViewById(C0275R$id.moreInfoButton);
            v62.c(fancyButton2);
            this.C = fancyButton2;
            TextView textView4 = (TextView) view.findViewById(C0275R$id.nsfwWarningMessage);
            v62.c(textView4);
            this.D = textView4;
        }

        public final FancyButton M() {
            return this.B;
        }

        public final ImageView N() {
            return this.y;
        }

        public final TextView O() {
            return this.x;
        }

        public final TextView P() {
            return this.A;
        }

        public final TextView Q() {
            return this.z;
        }

        public final FancyButton R() {
            return this.C;
        }

        public final TextView S() {
            return this.D;
        }
    }

    /* renamed from: com.zunjae.anyme.features.discover.fast_search.b$b  reason: collision with other inner class name */
    static final class C0187b implements View.OnClickListener {
        final /* synthetic */ b e;
        final /* synthetic */ a f;

        C0187b(b bVar, a aVar) {
            this.e = bVar;
            this.f = aVar;
        }

        public final void onClick(View view) {
            com.zunjae.anyme.features.anime.info_screen.d.q0.a(this.f.f(), this.f.d()).W1(this.e.m, "CoverImage");
        }
    }

    static final class c implements View.OnClickListener {
        final /* synthetic */ b e;
        final /* synthetic */ a f;

        c(b bVar, a aVar) {
            this.e = bVar;
            this.f = aVar;
        }

        public final void onClick(View view) {
            rw1.a(this.f.S());
            this.e.c.add(Integer.valueOf(this.f.j()));
        }
    }

    static final class d implements View.OnClickListener {
        final /* synthetic */ b e;
        final /* synthetic */ a f;
        final /* synthetic */ a g;

        public static final class a implements com.zunjae.anyme.abstracts.e {
            final /* synthetic */ d a;

            a(d dVar) {
                this.a = dVar;
            }

            public void a(kv1 kv1) {
                v62.e(kv1, "httpResult");
                AbstractActivity H = this.a.e.h;
                Toast makeText = Toast.makeText(H, "Successfully added " + this.a.f.f() + " to your profile", 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                rw1.a(this.a.g.M());
                this.a.e.d.add(Integer.valueOf(this.a.f.c()));
            }
        }

        d(b bVar, a aVar, a aVar2) {
            this.e = bVar;
            this.f = aVar;
            this.g = aVar2;
        }

        public final void onClick(View view) {
            this.e.h.i0(sy1.r.a((long) this.f.c(), this.f.f(), this.f.d()), com.zunjae.anyme.abstracts.d.ADD, new a(this));
        }
    }

    static final class e implements View.OnClickListener {
        final /* synthetic */ b e;
        final /* synthetic */ a f;

        e(b bVar, a aVar) {
            this.e = bVar;
            this.f = aVar;
        }

        public final void onClick(View view) {
            this.e.h.startActivity(AnimeInfoActivity.M.b(this.e.h, new xy1((long) this.f.c(), this.f.f(), this.f.d())));
        }
    }

    static final class f implements View.OnClickListener {
        final /* synthetic */ b e;
        final /* synthetic */ a f;

        f(b bVar, a aVar) {
            this.e = bVar;
            this.f = aVar;
        }

        public final void onClick(View view) {
            yv1.a.b(this.e.h, this.f.f());
            Toast makeText = Toast.makeText(this.e.h, "Title copied to your clipboard", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }
    }

    public b(AbstractActivity abstractActivity, List<a> list, List<Integer> list2, boolean z, List<Integer> list3, k kVar) {
        v62.e(abstractActivity, "activity");
        v62.e(list, "originalDataSet");
        v62.e(list2, "alreadyAddedAnime");
        v62.e(list3, "nsfwAnime");
        v62.e(kVar, "fragmentManager");
        this.h = abstractActivity;
        this.i = list;
        this.j = list2;
        this.k = z;
        this.l = list3;
        this.m = kVar;
        this.c = new ArrayList<>();
        this.d = new ArrayList<>();
        this.e = true;
        this.f = new ArrayList<>();
        this.e = qv1.a.x(this.h);
        P();
    }

    private final boolean L(a aVar) {
        if (this.j.contains(Integer.valueOf(aVar.c()))) {
            return true;
        }
        return this.d.contains(Integer.valueOf(aVar.c()));
    }

    private final void P() {
        this.f.clear();
        for (a next : this.i) {
            if (this.e && this.l.contains(Integer.valueOf(next.c()))) {
                this.g++;
            } else if (!this.k || !L(next)) {
                this.f.add(next);
            }
        }
        l();
    }

    public final int M() {
        return this.g;
    }

    /* renamed from: N */
    public void w(a aVar, int i2) {
        String str;
        TextView textView;
        v62.e(aVar, "holder");
        a aVar2 = this.f.get(aVar.j());
        v62.d(aVar2, "visibleDataSet[holder.adapterPosition]");
        a aVar3 = aVar2;
        com.zunjae.anyme.a.d(this.h).t(aVar3.d()).K0(aVar.N());
        rw1.i(aVar.N());
        aVar.N().setOnClickListener(new C0187b(this, aVar3));
        aVar.O().setText(aVar3.f());
        if (aVar3.a() != null) {
            aVar.Q().setText(Html.fromHtml(aVar3.a()));
            rw1.i(aVar.Q());
        } else {
            rw1.a(aVar.Q());
        }
        if (aVar3.b() != null) {
            textView = aVar.P();
            str = aVar3.e() + " | " + aVar3.b();
        } else {
            textView = aVar.P();
            str = aVar3.e();
        }
        textView.setText(str);
        if (this.l.contains(Integer.valueOf(aVar3.c()))) {
            rw1.i(aVar.S());
        } else {
            rw1.a(aVar.S());
        }
        if (this.c.contains(Integer.valueOf(aVar.j()))) {
            rw1.a(aVar.S());
        }
        if (L(aVar3)) {
            rw1.a(aVar.M());
        } else {
            rw1.i(aVar.M());
        }
        aVar.S().setOnClickListener(new c(this, aVar));
        aVar.M().setOnClickListener(new d(this, aVar3, aVar));
        aVar.R().setOnClickListener(new e(this, aVar3));
        aVar.O().setOnClickListener(new f(this, aVar3));
    }

    /* renamed from: O */
    public a y(ViewGroup viewGroup, int i2) {
        v62.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0278R$layout.cardview_better_mal_search_results, viewGroup, false);
        v62.d(inflate, "view");
        return new a(inflate);
    }

    public final void Q(boolean z) {
        this.k = z;
        P();
    }

    public int g() {
        return this.f.size();
    }
}
