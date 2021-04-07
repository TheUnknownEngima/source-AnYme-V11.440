package com.zunjae.anyme.features.vydia;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

public final class f extends RecyclerView.c0 {
    private final ImageView x;
    private final TextView y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(C0275R$id.coverImage);
        v62.d(findViewById, "itemView.findViewById(R.id.coverImage)");
        this.x = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0275R$id.characterName);
        v62.d(findViewById2, "itemView.findViewById(R.id.characterName)");
        this.y = (TextView) findViewById2;
    }

    public final TextView M() {
        return this.y;
    }

    public final ImageView N() {
        return this.x;
    }
}
