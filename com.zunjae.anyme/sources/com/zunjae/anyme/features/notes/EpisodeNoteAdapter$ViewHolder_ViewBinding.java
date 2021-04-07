package com.zunjae.anyme.features.notes;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import com.zunjae.anyme.C0275R$id;

public class EpisodeNoteAdapter$ViewHolder_ViewBinding implements Unbinder {
    public EpisodeNoteAdapter$ViewHolder_ViewBinding(EpisodeNoteAdapter$ViewHolder episodeNoteAdapter$ViewHolder, View view) {
        episodeNoteAdapter$ViewHolder.episodeNumber = (TextView) w8.c(view, C0275R$id.episodeNumber, "field 'episodeNumber'", TextView.class);
        episodeNoteAdapter$ViewHolder.episodeNote = (TextView) w8.c(view, C0275R$id.episodeNote, "field 'episodeNote'", TextView.class);
        episodeNoteAdapter$ViewHolder.episodeNoteCreated = (TextView) w8.c(view, C0275R$id.episodeNoteCreated, "field 'episodeNoteCreated'", TextView.class);
        episodeNoteAdapter$ViewHolder.cardViewContainer = (CardView) w8.c(view, C0275R$id.cardViewContainer, "field 'cardViewContainer'", CardView.class);
    }
}
