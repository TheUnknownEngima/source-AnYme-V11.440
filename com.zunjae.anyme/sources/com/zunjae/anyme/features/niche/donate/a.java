package com.zunjae.anyme.features.niche.donate;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

public final class a extends RecyclerView.c0 {
    private final Button A;
    private final ImageView x;
    private final TextView y;
    private final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(2131296693);
        v62.d(findViewById, "itemView.findViewById(R.id.image)");
        this.x = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0275R$id.name);
        v62.d(findViewById2, "itemView.findViewById(R.id.name)");
        this.y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0275R$id.description);
        v62.d(findViewById3, "itemView.findViewById(R.id.description)");
        this.z = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0275R$id.donateButton);
        v62.d(findViewById4, "itemView.findViewById(R.id.donateButton)");
        this.A = (Button) findViewById4;
    }

    public final TextView M() {
        return this.z;
    }

    public final Button N() {
        return this.A;
    }

    public final ImageView O() {
        return this.x;
    }

    public final TextView P() {
        return this.y;
    }
}
