package com.zunjae.anyme.features.discord;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.C0275R$id;

public class AnimeDiscordSuggestionAdapter$ViewHolder_ViewBinding implements Unbinder {
    public AnimeDiscordSuggestionAdapter$ViewHolder_ViewBinding(AnimeDiscordSuggestionAdapter$ViewHolder animeDiscordSuggestionAdapter$ViewHolder, View view) {
        animeDiscordSuggestionAdapter$ViewHolder.animeCoverImage = (ImageView) w8.c(view, C0275R$id.animeCoverImage, "field 'animeCoverImage'", ImageView.class);
        animeDiscordSuggestionAdapter$ViewHolder.title = (TextView) w8.c(view, 2131297204, "field 'title'", TextView.class);
        animeDiscordSuggestionAdapter$ViewHolder.viewGroup = (ViewGroup) w8.c(view, C0275R$id.cardViewContainer, "field 'viewGroup'", ViewGroup.class);
        animeDiscordSuggestionAdapter$ViewHolder.userStatus = (TextView) w8.c(view, C0275R$id.userStatus, "field 'userStatus'", TextView.class);
    }
}
