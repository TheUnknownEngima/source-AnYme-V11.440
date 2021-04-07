package com.zunjae.anyme.features.waifus;

import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ AllWaifusAdapter e;
    public final /* synthetic */ j f;

    public /* synthetic */ a(AllWaifusAdapter allWaifusAdapter, j jVar) {
        this.e = allWaifusAdapter;
        this.f = jVar;
    }

    public final void onClick(View view) {
        this.e.M(this.f, view);
    }
}
