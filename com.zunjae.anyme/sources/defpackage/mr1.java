package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

/* renamed from: mr1  reason: default package */
public final class mr1 extends RecyclerView.c0 {
    private final TextView x;
    private final TextView y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mr1(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(C0275R$id.songTitle);
        v62.d(findViewById, "itemView.findViewById(R.id.songTitle)");
        this.x = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0275R$id.songType);
        v62.d(findViewById2, "itemView.findViewById(R.id.songType)");
        this.y = (TextView) findViewById2;
    }

    public final TextView M() {
        return this.x;
    }

    public final TextView N() {
        return this.y;
    }
}
