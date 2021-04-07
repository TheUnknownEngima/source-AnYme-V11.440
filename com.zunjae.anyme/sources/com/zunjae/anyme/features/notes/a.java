package com.zunjae.anyme.features.notes;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

public final class a extends RecyclerView.c0 {
    private final ImageButton A;
    private final TextView x;
    private final TextView y;
    private final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(C0275R$id.episodeNumber);
        v62.d(findViewById, "itemView.findViewById(R.id.episodeNumber)");
        this.x = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0275R$id.episodeNote);
        v62.d(findViewById2, "itemView.findViewById(R.id.episodeNote)");
        this.y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0275R$id.episodeNoteCreated);
        v62.d(findViewById3, "itemView.findViewById(R.id.episodeNoteCreated)");
        this.z = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0275R$id.overflowIcon);
        v62.d(findViewById4, "itemView.findViewById(R.id.overflowIcon)");
        this.A = (ImageButton) findViewById4;
    }

    public final TextView M() {
        return this.y;
    }

    public final TextView N() {
        return this.z;
    }

    public final TextView O() {
        return this.x;
    }

    public final ImageButton P() {
        return this.A;
    }
}
