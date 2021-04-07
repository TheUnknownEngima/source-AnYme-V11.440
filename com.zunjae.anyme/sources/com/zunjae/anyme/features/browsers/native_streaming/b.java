package com.zunjae.anyme.features.browsers.native_streaming;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

public final class b extends RecyclerView.c0 {
    private final TextView x;
    private final TextView y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(C0275R$id.seriesTitle);
        v62.d(findViewById, "itemView.findViewById(R.id.seriesTitle)");
        this.x = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0275R$id.bottomInformation);
        v62.d(findViewById2, "itemView.findViewById(R.id.bottomInformation)");
        this.y = (TextView) findViewById2;
    }

    public final TextView M() {
        return this.y;
    }

    public final TextView N() {
        return this.x;
    }
}
