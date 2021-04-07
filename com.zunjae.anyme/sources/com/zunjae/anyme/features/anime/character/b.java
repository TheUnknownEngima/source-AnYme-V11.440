package com.zunjae.anyme.features.anime.character;

import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ AnimeCharactersAdapter e;
    public final /* synthetic */ d f;

    public /* synthetic */ b(AnimeCharactersAdapter animeCharactersAdapter, d dVar) {
        this.e = animeCharactersAdapter;
        this.f = dVar;
    }

    public final void onClick(View view) {
        this.e.K(this.f, view);
    }
}
