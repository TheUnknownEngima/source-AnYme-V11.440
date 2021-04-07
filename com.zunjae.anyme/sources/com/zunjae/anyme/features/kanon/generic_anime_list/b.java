package com.zunjae.anyme.features.kanon.generic_anime_list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

public final class b extends RecyclerView.c0 {
    private final TextView A;
    private final View B;
    private final TextView C;
    private final ImageView x;
    private final TextView y;
    private final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(C0275R$id.seriesImage);
        v62.d(findViewById, "itemView.findViewById(R.id.seriesImage)");
        this.x = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0275R$id.seriesTitle);
        v62.d(findViewById2, "itemView.findViewById(R.id.seriesTitle)");
        this.y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0275R$id.genericBottomInfo);
        v62.d(findViewById3, "itemView.findViewById(R.id.genericBottomInfo)");
        this.z = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0275R$id.footer);
        v62.d(findViewById4, "itemView.findViewById(R.id.footer)");
        this.A = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C0275R$id.alreadyAddedOverlay);
        v62.d(findViewById5, "itemView.findViewById(R.id.alreadyAddedOverlay)");
        this.B = findViewById5;
        View findViewById6 = view.findViewById(C0275R$id.genericTopInfo);
        v62.d(findViewById6, "itemView.findViewById(R.id.genericTopInfo)");
        this.C = (TextView) findViewById6;
    }

    public final View M() {
        return this.B;
    }

    public final TextView N() {
        return this.A;
    }

    public final TextView O() {
        return this.z;
    }

    public final TextView P() {
        return this.C;
    }

    public final ImageView Q() {
        return this.x;
    }

    public final TextView R() {
        return this.y;
    }
}
