package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

/* renamed from: ar1  reason: default package */
public final class ar1 extends RecyclerView.c0 {
    private final ImageView x;
    private final TextView y;
    private final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ar1(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(2131296693);
        v62.d(findViewById, "itemView.findViewById(R.id.image)");
        this.x = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0275R$id.name);
        v62.d(findViewById2, "itemView.findViewById(R.id.name)");
        this.y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0275R$id.status);
        v62.d(findViewById3, "itemView.findViewById(R.id.status)");
        this.z = (TextView) findViewById3;
    }

    public final ImageView M() {
        return this.x;
    }

    public final TextView N() {
        return this.y;
    }

    public final TextView O() {
        return this.z;
    }
}
