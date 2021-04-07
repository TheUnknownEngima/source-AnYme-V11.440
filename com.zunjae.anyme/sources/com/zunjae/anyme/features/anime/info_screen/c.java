package com.zunjae.anyme.features.anime.info_screen;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

public final class c extends RecyclerView.c0 {
    private final TextView x;
    private final TextView y;
    private final View z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(C0275R$id.content_text);
        v62.d(findViewById, "itemView.findViewById(R.id.content_text)");
        this.x = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0275R$id.content_title);
        v62.d(findViewById2, "itemView.findViewById(R.id.content_title)");
        this.y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0275R$id.lineSeparator);
        v62.d(findViewById3, "itemView.findViewById(R.id.lineSeparator)");
        this.z = findViewById3;
    }

    public final TextView M() {
        return this.x;
    }

    public final View N() {
        return this.z;
    }

    public final TextView O() {
        return this.y;
    }
}
