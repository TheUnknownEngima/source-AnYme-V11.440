package com.zunjae.anyme.features.discover.seasonal;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.a;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.abstracts.d;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import java.util.ArrayList;
import java.util.List;
import mehdi.sakout.fancybuttons.FancyButton;

public class AnimeSeasonalAdapter extends RecyclerView.g<ViewHolder> {
    private final AbstractActivity c;
    private List<sx1> d;
    private List<Long> e;
    private final ArrayList<Integer> f = new ArrayList<>();
    private ArrayList<sx1> g = new ArrayList<>();

    public static class ViewHolder extends RecyclerView.c0 {
        @BindView
        FancyButton addButton;
        @BindView
        TextView animeGenres;
        @BindView
        ImageView animeImage;
        @BindView
        TextView animeStatus;
        @BindView
        FancyButton moreInfoButton;
        @BindView
        TextView synopsis;
        @BindView
        TextView title;
        @BindView
        View transparentToWhite;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            viewHolder.synopsis = (TextView) w8.c(view, C0275R$id.synopsis, "field 'synopsis'", TextView.class);
            viewHolder.title = (TextView) w8.c(view, 2131297204, "field 'title'", TextView.class);
            viewHolder.addButton = (FancyButton) w8.c(view, C0275R$id.addToPtwButton, "field 'addButton'", FancyButton.class);
            viewHolder.moreInfoButton = (FancyButton) w8.c(view, C0275R$id.moreInfoButton, "field 'moreInfoButton'", FancyButton.class);
            viewHolder.transparentToWhite = w8.b(view, C0275R$id.transparentToWhiteView, "field 'transparentToWhite'");
            viewHolder.animeImage = (ImageView) w8.c(view, C0275R$id.animeImage, "field 'animeImage'", ImageView.class);
            viewHolder.animeGenres = (TextView) w8.c(view, C0275R$id.animeGenres, "field 'animeGenres'", TextView.class);
            viewHolder.animeStatus = (TextView) w8.c(view, C0275R$id.animeStatus, "field 'animeStatus'", TextView.class);
        }
    }

    public AnimeSeasonalAdapter(AbstractActivity abstractActivity, ArrayList<ny1> arrayList) {
        this.c = abstractActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        H(arrayList);
    }

    private boolean R(sx1 sx1) {
        if (this.e.contains(Long.valueOf((long) sx1.c()))) {
            return true;
        }
        return this.f.contains(Integer.valueOf(sx1.c()));
    }

    public void H(List<ny1> list) {
        this.g.clear();
        for (sx1 next : this.d) {
            if (list == null || next.i(list)) {
                this.g.add(next);
            }
        }
        l();
    }

    public /* synthetic */ void I(sx1 sx1, ViewHolder viewHolder, kv1 kv1) {
        Toast.makeText(this.c, String.format("Successfully added %s to your profile", new Object[]{sx1.g()}), 0).show();
        viewHolder.addButton.setVisibility(8);
        this.f.add(Integer.valueOf(sx1.c()));
    }

    public /* synthetic */ void J(sx1 sx1, ViewHolder viewHolder, View view) {
        this.c.i0(sy1.r.a((long) sx1.c(), sx1.g(), sx1.b()), d.ADD, new e(this, sx1, viewHolder));
    }

    public /* synthetic */ void K(sx1 sx1, View view) {
        f.e eVar = new f.e(this.c);
        eVar.E("Synopsis");
        eVar.i(sx1.f());
        eVar.B("ok");
        eVar.D();
    }

    public /* synthetic */ void L(sx1 sx1, View view) {
        xy1 xy1 = new xy1((long) sx1.c(), sx1.g(), sx1.b());
        AbstractActivity abstractActivity = this.c;
        abstractActivity.startActivity(AnimeInfoActivity.M.b(abstractActivity, xy1));
    }

    public /* synthetic */ void M(sx1 sx1, View view) {
        yv1.a.b(this.c, sx1.g());
        Toast.makeText(this.c, "Title copied to your clipboard", 0).show();
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: N */
    public void w(ViewHolder viewHolder, int i) {
        TextView textView;
        FancyButton fancyButton;
        sx1 sx1 = this.g.get(i);
        a.d(this.c).t(sx1.b()).K0(viewHolder.animeImage);
        viewHolder.title.setText(he2.a(sx1.g()));
        String a = he2.a(sx1.f());
        int i2 = 0;
        if (a == null || a.length() <= 150) {
            textView = viewHolder.synopsis;
        } else {
            textView = viewHolder.synopsis;
            a = ie2.l(a, 0, 150).concat(" [...]");
        }
        textView.setText(a);
        viewHolder.animeStatus.setText(String.format("%s (%.2f)", new Object[]{sx1.h(), Double.valueOf(sx1.e())}));
        String f2 = ie2.f(sx1.a(), ", ");
        if (f2.length() > 2) {
            f2 = f2.substring(0, f2.length() - 2);
        }
        viewHolder.animeGenres.setText(f2);
        if (R(sx1)) {
            fancyButton = viewHolder.addButton;
            i2 = 8;
        } else {
            fancyButton = viewHolder.addButton;
        }
        fancyButton.setVisibility(i2);
        viewHolder.addButton.setOnClickListener(new b(this, sx1, viewHolder));
        viewHolder.synopsis.setOnClickListener(new c(this, sx1));
        viewHolder.moreInfoButton.setOnClickListener(new a(this, sx1));
        viewHolder.title.setOnClickListener(new d(this, sx1));
    }

    /* renamed from: O */
    public ViewHolder y(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0278R$layout.cardview_anime_seasonal, viewGroup, false));
    }

    public void P(List<sx1> list, List<Long> list2, List<ny1> list3) {
        this.d = list;
        this.e = list2;
        this.g = new ArrayList<>(list);
        H(list3);
        l();
    }

    public void Q(List<ny1> list) {
        H(list);
        l();
    }

    public int g() {
        return this.g.size();
    }
}
