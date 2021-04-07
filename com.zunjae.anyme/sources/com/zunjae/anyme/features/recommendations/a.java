package com.zunjae.anyme.features.recommendations;

import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ AnimeRecommendationsAdapter e;
    public final /* synthetic */ ux1 f;

    public /* synthetic */ a(AnimeRecommendationsAdapter animeRecommendationsAdapter, ux1 ux1) {
        this.e = animeRecommendationsAdapter;
        this.f = ux1;
    }

    public final void onClick(View view) {
        this.e.H(this.f, view);
    }
}
