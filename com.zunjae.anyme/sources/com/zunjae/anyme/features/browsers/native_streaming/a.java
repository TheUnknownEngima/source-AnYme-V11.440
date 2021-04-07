package com.zunjae.anyme.features.browsers.native_streaming;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

public final class a extends RecyclerView.c0 {
    private final TextView x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(C0275R$id.episodeNumber);
        v62.d(findViewById, "itemView.findViewById(R.id.episodeNumber)");
        this.x = (TextView) findViewById;
    }

    public final TextView M() {
        return this.x;
    }
}
