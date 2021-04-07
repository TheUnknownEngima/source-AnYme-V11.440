package com.zunjae.anyme.features.discover.seasonal;

import android.view.View;
import com.zunjae.anyme.features.discover.seasonal.AnimeSeasonalAdapter;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ AnimeSeasonalAdapter e;
    public final /* synthetic */ sx1 f;
    public final /* synthetic */ AnimeSeasonalAdapter.ViewHolder g;

    public /* synthetic */ b(AnimeSeasonalAdapter animeSeasonalAdapter, sx1 sx1, AnimeSeasonalAdapter.ViewHolder viewHolder) {
        this.e = animeSeasonalAdapter;
        this.f = sx1;
        this.g = viewHolder;
    }

    public final void onClick(View view) {
        this.e.J(this.f, this.g, view);
    }
}
