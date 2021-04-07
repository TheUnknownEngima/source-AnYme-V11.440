package com.zunjae.anyme.features.anime.character;

import android.view.View;
import com.zunjae.anyme.features.anime.character.AnimeCharactersAdapter;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ AnimeCharactersAdapter e;
    public final /* synthetic */ d f;
    public final /* synthetic */ AnimeCharactersAdapter.ViewHolder g;
    public final /* synthetic */ int h;

    public /* synthetic */ a(AnimeCharactersAdapter animeCharactersAdapter, d dVar, AnimeCharactersAdapter.ViewHolder viewHolder, int i) {
        this.e = animeCharactersAdapter;
        this.f = dVar;
        this.g = viewHolder;
        this.h = i;
    }

    public final void onClick(View view) {
        this.e.M(this.f, this.g, this.h, view);
    }
}
