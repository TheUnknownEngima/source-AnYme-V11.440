package com.zunjae.anyme.features.waifus;

import android.view.View;
import com.zunjae.anyme.features.waifus.l;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ AllWaifusAdapter e;
    public final /* synthetic */ j f;
    public final /* synthetic */ l.a g;

    public /* synthetic */ d(AllWaifusAdapter allWaifusAdapter, j jVar, l.a aVar) {
        this.e = allWaifusAdapter;
        this.f = jVar;
        this.g = aVar;
    }

    public final void onClick(View view) {
        this.e.L(this.f, this.g, view);
    }
}
