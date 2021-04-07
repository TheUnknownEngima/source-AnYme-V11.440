package com.zunjae.anyme.features.anime.shows_list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.mikepenz.iconics.view.IconicsTextView;
import com.zunjae.anyme.C0275R$id;

public class ClassicAdapter_ViewBinding implements Unbinder {
    public ClassicAdapter_ViewBinding(ClassicAdapter classicAdapter, View view) {
        classicAdapter.animeCoverImage = (ImageView) w8.c(view, C0275R$id.animeCardViewCoverImage, "field 'animeCoverImage'", ImageView.class);
        classicAdapter.animeName = (TextView) w8.c(view, C0275R$id.animeCardViewName, "field 'animeName'", TextView.class);
        classicAdapter.userProgress = (TextView) w8.c(view, C0275R$id.animeCardViewProgress, "field 'userProgress'", TextView.class);
        classicAdapter.userScore = (IconicsTextView) w8.c(view, C0275R$id.animeCardViewScore, "field 'userScore'", IconicsTextView.class);
        classicAdapter.animeStatus = (IconicsTextView) w8.c(view, C0275R$id.animeCardViewStatus, "field 'animeStatus'", IconicsTextView.class);
        classicAdapter.container = (ViewGroup) w8.c(view, C0275R$id.cardViewContainer, "field 'container'", ViewGroup.class);
    }
}
