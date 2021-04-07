package com.zunjae.anyme.features.anime.character;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.github.ivbaranov.mfb.MaterialFavoriteButton;
import com.zunjae.anyme.C0274R$drawable;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.kanon.KanonExplanation;
import com.zunjae.anyme.features.waifus.j;
import com.zunjae.anyme.features.waifus.l;
import com.zunjae.zasync.b;
import java.util.ArrayList;
import java.util.List;

public class AnimeCharactersAdapter extends RecyclerView.g<ViewHolder> {
    /* access modifiers changed from: private */
    public final AbstractActivity c;
    private final qu1 d;
    /* access modifiers changed from: private */
    public List<d> e;
    private final int f;
    private final int g;
    public boolean h = false;

    public static class ViewHolder extends RecyclerView.c0 {
        @BindView
        CardView cardViewContainer;
        @BindView
        ImageView characterImage;
        @BindView
        TextView characterName;
        @BindView
        MaterialFavoriteButton favoriteButton;
        @BindView
        View gradientOverlay;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            viewHolder.characterImage = (ImageView) w8.c(view, C0275R$id.characterImage, "field 'characterImage'", ImageView.class);
            viewHolder.characterName = (TextView) w8.c(view, C0275R$id.characterName, "field 'characterName'", TextView.class);
            viewHolder.cardViewContainer = (CardView) w8.c(view, C0275R$id.cardViewContainer, "field 'cardViewContainer'", CardView.class);
            viewHolder.favoriteButton = (MaterialFavoriteButton) w8.c(view, C0275R$id.favoriteButton, "field 'favoriteButton'", MaterialFavoriteButton.class);
            viewHolder.gradientOverlay = w8.b(view, C0275R$id.gradientOverlay, "field 'gradientOverlay'");
        }
    }

    private class a extends b<kv1> {
        private final j e;
        private final int f;
        private final d g;
        private final int h;
        private qu1 i;

        a(Activity activity, j jVar, int i2, d dVar, int i3, qu1 qu1) {
            super(activity);
            this.e = jVar;
            this.f = i2;
            this.g = dVar;
            this.h = i3;
            this.i = qu1;
        }

        /* renamed from: m */
        public kv1 f() {
            int i2 = this.f;
            if (i2 == 0) {
                return this.i.t().f(this.e);
            }
            if (i2 == 1) {
                return this.i.t().d(this.e.i());
            }
            throw new IllegalArgumentException("No action found for id = " + this.f);
        }

        /* access modifiers changed from: protected */
        @SuppressLint({"DefaultLocale"})
        /* renamed from: n */
        public void j(kv1 kv1) {
            String str;
            super.j(kv1);
            if (kv1 == null) {
                Toast.makeText(AnimeCharactersAdapter.this.c, "Could not connect to Kanon", 1).show();
            } else if (kv1.d()) {
                Toast.makeText(AnimeCharactersAdapter.this.c, String.format("(%d) Could not add %s, reason: %s", new Object[]{Integer.valueOf(kv1.b()), this.e.j(), kv1.a()}), 1).show();
            } else {
                if (this.f == 0) {
                    this.i.O(this.e);
                    str = "Added %s to your list";
                } else {
                    this.i.j(this.e);
                    str = "Removed %s from your list";
                }
                Toast.makeText(AnimeCharactersAdapter.this.c, String.format(str, new Object[]{this.e.j()}), 0).show();
                AnimeCharactersAdapter.this.e.set(this.h, this.g);
                AnimeCharactersAdapter.this.m(this.h);
            }
        }
    }

    public AnimeCharactersAdapter(AbstractActivity abstractActivity, int i, qu1 qu1, int i2) {
        this.c = abstractActivity;
        this.f = i;
        this.d = qu1;
        this.g = i2;
    }

    public ArrayList<Integer> J() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (d next : this.e) {
            if (next.h()) {
                arrayList.add(Integer.valueOf(next.c()));
            }
        }
        return arrayList;
    }

    public /* synthetic */ void K(d dVar, View view) {
        l.a.b(this.c, dVar.g(), dVar.d(), this.f, this.g, (l.a) null);
    }

    public /* synthetic */ void L(d dVar, View view) {
        l.a.a(this.c, dVar.g());
    }

    public /* synthetic */ void M(d dVar, ViewHolder viewHolder, int i, View view) {
        int i2;
        if (xx1.a.b()) {
            this.c.startActivity(new Intent(this.c, KanonExplanation.class));
        } else if (dVar.c() == -1) {
            Toast.makeText(this.c, "Could not add this waifu to your favorites (it has an unknown ID)", 1).show();
        } else {
            j jVar = new j(dVar.c(), this.f, dVar.g(), dVar.b());
            viewHolder.favoriteButton.k();
            if (viewHolder.favoriteButton.i()) {
                dVar.i(true);
                i2 = 0;
            } else {
                dVar.i(false);
                i2 = 1;
            }
            new a(this.c, jVar, i2, dVar, i, this.d).g();
        }
    }

    /* renamed from: N */
    public void w(ViewHolder viewHolder, int i) {
        d dVar = this.e.get(i);
        viewHolder.characterName.setText(Html.fromHtml(dVar.g()));
        com.zunjae.anyme.a.d(this.c).t(dVar.b()).n(C0274R$drawable.transparent_to_black).K0(viewHolder.characterImage);
        if (this.h) {
            viewHolder.gradientOverlay.setVisibility(0);
            viewHolder.favoriteButton.setVisibility(0);
            viewHolder.favoriteButton.setFavorite(dVar.h());
        } else {
            viewHolder.gradientOverlay.setVisibility(8);
            viewHolder.favoriteButton.setVisibility(8);
        }
        viewHolder.cardViewContainer.setOnClickListener(new b(this, dVar));
        viewHolder.characterName.setOnClickListener(new c(this, dVar));
        viewHolder.favoriteButton.setOnClickListener(new a(this, dVar, viewHolder, i));
    }

    /* renamed from: O */
    public ViewHolder y(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater;
        int i2;
        if (i == 0) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i2 = C0278R$layout.cardview_anime_character;
        } else if (i == 1) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i2 = C0278R$layout.cardview_anime_character_vertical;
        } else {
            throw new IllegalStateException("incorrect viewtype");
        }
        return new ViewHolder(layoutInflater.inflate(i2, viewGroup, false));
    }

    public void P(List<d> list) {
        this.e = list;
        this.h = true;
        l();
    }

    public int g() {
        List<d> list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int i(int i) {
        return this.g;
    }
}
