package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

/* renamed from: vu1  reason: default package */
public final class vu1 extends RecyclerView.c0 {
    private final TextView x;
    private final TextView y;
    private final ImageButton z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vu1(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(2131297204);
        v62.d(findViewById, "itemView.findViewById(R.id.title)");
        this.x = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0275R$id.reason);
        v62.d(findViewById2, "itemView.findViewById(R.id.reason)");
        this.y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0275R$id.overflowIcon);
        v62.d(findViewById3, "itemView.findViewById(R.id.overflowIcon)");
        this.z = (ImageButton) findViewById3;
        View findViewById4 = view.findViewById(C0275R$id.cardViewContainer);
        v62.d(findViewById4, "itemView.findViewById(R.id.cardViewContainer)");
        CardView cardView = (CardView) findViewById4;
    }

    public final ImageButton M() {
        return this.z;
    }

    public final TextView N() {
        return this.y;
    }

    public final TextView O() {
        return this.x;
    }
}
