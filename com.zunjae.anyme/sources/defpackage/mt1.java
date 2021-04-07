package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

/* renamed from: mt1  reason: default package */
public final class mt1 extends RecyclerView.c0 {
    private final TextView x;
    private final TextView y;
    private final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mt1(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(C0275R$id.username);
        v62.d(findViewById, "itemView.findViewById(R.id.username)");
        this.x = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0275R$id.userscore);
        v62.d(findViewById2, "itemView.findViewById(R.id.userscore)");
        this.y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0275R$id.userReview);
        v62.d(findViewById3, "itemView.findViewById(R.id.userReview)");
        this.z = (TextView) findViewById3;
    }

    public final TextView M() {
        return this.z;
    }

    public final TextView N() {
        return this.y;
    }

    public final TextView O() {
        return this.x;
    }
}
