package com.zunjae.anyme.features.waifus;

import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ AllWaifusAdapter e;
    public final /* synthetic */ j f;
    public final /* synthetic */ int g;

    public /* synthetic */ c(AllWaifusAdapter allWaifusAdapter, j jVar, int i) {
        this.e = allWaifusAdapter;
        this.f = jVar;
        this.g = i;
    }

    public final void onClick(View view) {
        this.e.N(this.f, this.g, view);
    }
}
