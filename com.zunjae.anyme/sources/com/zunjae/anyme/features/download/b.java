package com.zunjae.anyme.features.download;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

public final class b extends RecyclerView.c0 {
    private final TextView A;
    private final ProgressBar B;
    private final Button C;
    private final ImageView x;
    private final TextView y;
    private final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(C0275R$id.animeImage);
        v62.d(findViewById, "itemView.findViewById(R.id.animeImage)");
        this.x = (ImageView) findViewById;
        View findViewById2 = view.findViewById(2131297204);
        v62.d(findViewById2, "itemView.findViewById(R.id.title)");
        this.y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0275R$id.status);
        v62.d(findViewById3, "itemView.findViewById(R.id.status)");
        this.z = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0275R$id.downloadPercentage);
        v62.d(findViewById4, "itemView.findViewById(R.id.downloadPercentage)");
        this.A = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C0275R$id.downloadProgress);
        v62.d(findViewById5, "itemView.findViewById(R.id.downloadProgress)");
        this.B = (ProgressBar) findViewById5;
        View findViewById6 = view.findViewById(C0275R$id.cancelButton);
        v62.d(findViewById6, "itemView.findViewById(R.id.cancelButton)");
        this.C = (Button) findViewById6;
    }

    public final ImageView M() {
        return this.x;
    }

    public final Button N() {
        return this.C;
    }

    public final TextView O() {
        return this.A;
    }

    public final ProgressBar P() {
        return this.B;
    }

    public final TextView Q() {
        return this.z;
    }

    public final TextView R() {
        return this.y;
    }
}
