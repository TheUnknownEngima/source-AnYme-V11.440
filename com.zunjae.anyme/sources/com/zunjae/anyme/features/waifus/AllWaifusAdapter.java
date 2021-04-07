package com.zunjae.anyme.features.waifus;

import android.annotation.SuppressLint;
import android.app.Activity;
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
import com.mikepenz.iconics.view.IconicsTextView;
import com.zunjae.anyme.C0274R$drawable;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.waifus.l;
import com.zunjae.zasync.b;
import java.util.ArrayList;

public class AllWaifusAdapter extends RecyclerView.g<ViewHolder> {
    /* access modifiers changed from: private */
    public final AbstractActivity c;
    private ArrayList<j> d;
    private final int e;
    /* access modifiers changed from: private */
    public final qu1 f;

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
        @BindView
        IconicsTextView waifuStars;

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
            viewHolder.waifuStars = (IconicsTextView) w8.c(view, C0275R$id.waifuStars, "field 'waifuStars'", IconicsTextView.class);
        }
    }

    private class a extends b<kv1> {
        private final j e;

        a(Activity activity, j jVar, int i) {
            super(activity);
            this.e = jVar;
        }

        /* renamed from: m */
        public kv1 f() {
            return AllWaifusAdapter.this.f.t().d(this.e.i());
        }

        /* access modifiers changed from: protected */
        @SuppressLint({"DefaultLocale"})
        /* renamed from: n */
        public void j(kv1 kv1) {
            Toast toast;
            super.j(kv1);
            if (kv1 == null) {
                Toast.makeText(AllWaifusAdapter.this.c, "Could not connect to Kanon", 1).show();
                return;
            }
            if (kv1.d()) {
                toast = Toast.makeText(AllWaifusAdapter.this.c, String.format("(%d) Could not delete %s, reason: %s", new Object[]{Integer.valueOf(kv1.b()), this.e.j(), kv1.a()}), 1);
            } else {
                AllWaifusAdapter.this.f.j(this.e);
                toast = Toast.makeText(AllWaifusAdapter.this.c, String.format("Removed %s from your favorites", new Object[]{this.e.j()}), 0);
            }
            toast.show();
        }
    }

    public AllWaifusAdapter(AbstractActivity abstractActivity, ArrayList<j> arrayList, int i, qu1 qu1) {
        this.c = abstractActivity;
        this.d = arrayList;
        this.e = i;
        this.f = qu1;
    }

    public boolean J() {
        return g() > 0;
    }

    public /* synthetic */ void K(j jVar, int i) {
        new a(this.c, jVar, i).g();
    }

    public /* synthetic */ void L(j jVar, l.a aVar, View view) {
        l.a.b(this.c, jVar.j(), jVar.g(), jVar.d(), this.e, aVar);
    }

    public /* synthetic */ void M(j jVar, View view) {
        l.a.a(this.c, jVar.j());
    }

    public /* synthetic */ void N(j jVar, int i, View view) {
        new a(this.c, jVar, i).g();
    }

    /* renamed from: O */
    public void w(ViewHolder viewHolder, int i) {
        j jVar = this.d.get(i);
        com.zunjae.anyme.a.d(this.c).t(jVar.f()).n(C0274R$drawable.transparent_to_black).K0(viewHolder.characterImage);
        viewHolder.gradientOverlay.setVisibility(0);
        viewHolder.favoriteButton.setVisibility(0);
        viewHolder.favoriteButton.setFavorite(true);
        viewHolder.characterName.setText(jVar.j());
        if (jVar.h() > 0) {
            IconicsTextView iconicsTextView = viewHolder.waifuStars;
            iconicsTextView.setText("{faw-star} " + jVar.h());
            viewHolder.waifuStars.setVisibility(0);
            viewHolder.gradientOverlay.setVisibility(8);
        } else {
            viewHolder.waifuStars.setVisibility(8);
            viewHolder.gradientOverlay.setVisibility(0);
        }
        int i2 = this.e;
        if (i2 == 2 || i2 == 3) {
            viewHolder.favoriteButton.setVisibility(8);
        } else {
            viewHolder.favoriteButton.setVisibility(0);
        }
        viewHolder.cardViewContainer.setOnClickListener(new d(this, jVar, new b(this, jVar, i)));
        viewHolder.characterName.setOnClickListener(new a(this, jVar));
        viewHolder.favoriteButton.setOnClickListener(new c(this, jVar, i));
    }

    /* renamed from: P */
    public ViewHolder y(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0278R$layout.cardview_all_waifus_top, viewGroup, false));
    }

    public void Q() {
        j.o(this.d, xu1.i.v());
        l();
    }

    public void R(ArrayList<j> arrayList) {
        this.d = arrayList;
        l();
    }

    public int g() {
        return this.d.size();
    }

    public long h(int i) {
        return (long) this.d.get(i).i();
    }

    public int i(int i) {
        return this.e;
    }
}
