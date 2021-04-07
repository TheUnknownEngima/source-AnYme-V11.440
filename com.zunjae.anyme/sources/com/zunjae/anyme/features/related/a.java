package com.zunjae.anyme.features.related;

import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ AnimeRelatedShowsAdapter e;
    public final /* synthetic */ az1 f;

    public /* synthetic */ a(AnimeRelatedShowsAdapter animeRelatedShowsAdapter, az1 az1) {
        this.e = animeRelatedShowsAdapter;
        this.f = az1;
    }

    public final void onClick(View view) {
        this.e.H(this.f, view);
    }
}
