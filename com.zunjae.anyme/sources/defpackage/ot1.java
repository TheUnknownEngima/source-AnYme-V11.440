package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.zunjae.anyme.C0275R$id;

/* renamed from: ot1  reason: default package */
public final class ot1 extends RecyclerView.c0 {
    private final TextView A;
    private final ImageView x;
    private final TextView y;
    private final IconicsTextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ot1(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(C0275R$id.animeCoverImage);
        v62.d(findViewById, "itemView.findViewById(R.id.animeCoverImage)");
        this.x = (ImageView) findViewById;
        View findViewById2 = view.findViewById(2131297204);
        v62.d(findViewById2, "itemView.findViewById(R.id.title)");
        this.y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0275R$id.score);
        v62.d(findViewById3, "itemView.findViewById(R.id.score)");
        this.z = (IconicsTextView) findViewById3;
        View findViewById4 = view.findViewById(C0275R$id.onscreenText);
        v62.d(findViewById4, "itemView.findViewById(R.id.onscreenText)");
        this.A = (TextView) findViewById4;
    }

    public final ImageView M() {
        return this.x;
    }

    public final TextView N() {
        return this.A;
    }

    public final IconicsTextView O() {
        return this.z;
    }

    public final TextView P() {
        return this.y;
    }
}
