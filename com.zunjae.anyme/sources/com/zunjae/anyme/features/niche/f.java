package com.zunjae.anyme.features.niche;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

public final class f extends RecyclerView.c0 {
    private final TextView x;
    private final TextView y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(2131297204);
        v62.d(findViewById, "itemView.findViewById(R.id.title)");
        this.x = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0275R$id.reason);
        v62.d(findViewById2, "itemView.findViewById(R.id.reason)");
        this.y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0275R$id.cardViewContainer);
        v62.d(findViewById3, "itemView.findViewById(R.id.cardViewContainer)");
        CardView cardView = (CardView) findViewById3;
    }

    public final TextView M() {
        return this.y;
    }

    public final TextView N() {
        return this.x;
    }
}
