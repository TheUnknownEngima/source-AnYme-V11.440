package com.zunjae.anyme.features.anime.shows_list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.mikepenz.iconics.view.IconicsTextView;

public class OptimizedAdapter extends a {
    @BindView
    public IconicsTextView airingText;
    @BindView
    public ImageView animeCoverImage;
    @BindView
    public TextView animeName;
    @BindView
    public ViewGroup container;
    @BindView
    public ImageButton overflowIcon;
    @BindView
    public ProgressBar progressBar;
    @BindView
    public TextView releaseDate;
    @BindView
    public IconicsTextView userProgress;
    @BindView
    public IconicsTextView userScore;

    public OptimizedAdapter(View view) {
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
        return this.airingText;
    }

    public TextView Q() {
        return this.animeName;
    }
}
