package com.zunjae.anyme.features.browsers.native_streaming;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

public final class i extends RecyclerView.c0 {
    private final TextView A;
    private final ImageView x;
    private final TextView y;
    private final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(C0275R$id.seriesImage);
        v62.d(findViewById, "itemView.findViewById(R.id.seriesImage)");
        this.x = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0275R$id.seriesTitle);
        v62.d(findViewById2, "itemView.findViewById(R.id.seriesTitle)");
        this.y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0275R$id.showScore);
        v62.d(findViewById3, "itemView.findViewById(R.id.showScore)");
        this.z = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0275R$id.bottomInformation);
        v62.d(findViewById4, "itemView.findViewById(R.id.bottomInformation)");
        this.A = (TextView) findViewById4;
    }

    public final TextView M() {
        return this.A;
    }

    public final ImageView N() {
        return this.x;
    }

    public final TextView O() {
        return this.z;
    }

    public final TextView P() {
        return this.y;
    }
}
