package com.zunjae.anyme.features.anime.shows_list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import com.mikepenz.iconics.view.IconicsTextView;
import com.zunjae.anyme.C0275R$id;

public class OptimizedAdapter_ViewBinding implements Unbinder {
    public OptimizedAdapter_ViewBinding(OptimizedAdapter optimizedAdapter, View view) {
        optimizedAdapter.animeCoverImage = (ImageView) w8.c(view, C0275R$id.animeCoverImage, "field 'animeCoverImage'", ImageView.class);
        optimizedAdapter.animeName = (TextView) w8.c(view, C0275R$id.animeTitle, "field 'animeName'", TextView.class);
        optimizedAdapter.userScore = (IconicsTextView) w8.c(view, C0275R$id.userScore, "field 'userScore'", IconicsTextView.class);
        optimizedAdapter.container = (ViewGroup) w8.c(view, C0275R$id.cardViewContainer, "field 'container'", ViewGroup.class);
        optimizedAdapter.userProgress = (IconicsTextView) w8.c(view, C0275R$id.userProgress, "field 'userProgress'", IconicsTextView.class);
        optimizedAdapter.releaseDate = (TextView) w8.c(view, C0275R$id.animeReleaseDate, "field 'releaseDate'", TextView.class);
        optimizedAdapter.progressBar = (ProgressBar) w8.c(view, C0275R$id.userProgressBar, "field 'progressBar'", ProgressBar.class);
        optimizedAdapter.overflowIcon = (ImageButton) w8.c(view, C0275R$id.overflowIcon, "field 'overflowIcon'", ImageButton.class);
        optimizedAdapter.airingText = (IconicsTextView) w8.c(view, C0275R$id.animeAiring, "field 'airingText'", IconicsTextView.class);
    }
}
