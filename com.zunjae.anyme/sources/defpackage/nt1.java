package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.zunjae.anyme.C0275R$id;

/* renamed from: nt1  reason: default package */
public final class nt1 extends RecyclerView.c0 {
    private final ImageView x;
    private final TextView y;
    private final IconicsTextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nt1(View view) {
        super(view);
        v62.e(view, "view");
        View findViewById = view.findViewById(C0275R$id.animeCoverImage);
        v62.d(findViewById, "view.findViewById(R.id.animeCoverImage)");
        this.x = (ImageView) findViewById;
        View findViewById2 = view.findViewById(2131297204);
        v62.d(findViewById2, "view.findViewById(R.id.title)");
        this.y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0275R$id.score);
        v62.d(findViewById3, "view.findViewById(R.id.score)");
        this.z = (IconicsTextView) findViewById3;
    }

    public final ImageView M() {
        return this.x;
    }

    public final IconicsTextView N() {
        return this.z;
    }

    public final TextView O() {
        return this.y;
    }
}
