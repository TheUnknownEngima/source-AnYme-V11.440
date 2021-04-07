package com.zunjae.anyme.features.anime.pickers;

import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ NumberPickerAdapter e;
    public final /* synthetic */ Integer f;

    public /* synthetic */ c(NumberPickerAdapter numberPickerAdapter, Integer num) {
        this.e = numberPickerAdapter;
        this.f = num;
    }

    public final void onClick(View view) {
        this.e.H(this.f, view);
    }
}
