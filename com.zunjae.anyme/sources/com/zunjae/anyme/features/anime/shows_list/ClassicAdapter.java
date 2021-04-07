package com.zunjae.anyme.features.anime.shows_list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.mikepenz.iconics.view.IconicsTextView;

public class ClassicAdapter extends a {
    @BindView
    public ImageView animeCoverImage;
    @BindView
    public TextView animeName;
    @BindView
    public IconicsTextView animeStatus;
    @BindView
    public ViewGroup container;
    @BindView
    public TextView userProgress;
    @BindView
    public IconicsTextView userScore;

    public ClassicAdapter(View view) {
        super(view);
        ButterKnife.a(this, view);
    }

    public ViewGroup M() {
        return this.container;
    }

    public ImageView N() {
        return this.animeCoverImage;
    }

    public IconicsTextView O() {
        return this.userScore;
    }

    public IconicsTextView P() {
        return this.animeStatus;
    }

    public TextView Q() {
        return this.animeName;
    }

    public TextView R() {
        return this.userProgress;
    }
}
