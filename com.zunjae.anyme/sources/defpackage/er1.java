package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

/* renamed from: er1  reason: default package */
public final class er1 extends RecyclerView.c0 {
    private final TextView A;
    private final TextView B;
    private final TextView x;
    private final CardView y;
    private final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public er1(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(C0275R$id.streamingSiteName);
        v62.d(findViewById, "itemView.findViewById(R.id.streamingSiteName)");
        this.x = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0275R$id.cardViewContainer);
        v62.d(findViewById2, "itemView.findViewById(R.id.cardViewContainer)");
        this.y = (CardView) findViewById2;
        View findViewById3 = view.findViewById(C0275R$id.note);
        v62.d(findViewById3, "itemView.findViewById(R.id.note)");
        this.z = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0275R$id.percentageUsage);
        v62.d(findViewById4, "itemView.findViewById(R.id.percentageUsage)");
        this.A = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C0275R$id.streamingSiteTags);
        v62.d(findViewById5, "itemView.findViewById(R.id.streamingSiteTags)");
        this.B = (TextView) findViewById5;
    }

    public final CardView M() {
        return this.y;
    }

    public final TextView N() {
        return this.z;
    }

    public final TextView O() {
        return this.A;
    }

    public final TextView P() {
        return this.x;
    }

    public final TextView Q() {
        return this.B;
    }
}
