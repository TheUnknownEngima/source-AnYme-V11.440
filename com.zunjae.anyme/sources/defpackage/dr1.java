package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

/* renamed from: dr1  reason: default package */
public final class dr1 extends RecyclerView.c0 {
    private final TextView A;
    private final ImageView x;
    private final TextView y;
    private final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dr1(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(C0275R$id.newsArticleImage);
        v62.d(findViewById, "itemView.findViewById(R.id.newsArticleImage)");
        this.x = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0275R$id.newsArticleTitle);
        v62.d(findViewById2, "itemView.findViewById(R.id.newsArticleTitle)");
        this.y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0275R$id.newsArticleDate);
        v62.d(findViewById3, "itemView.findViewById(R.id.newsArticleDate)");
        this.z = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0275R$id.newsArticleNumberOfComments);
        v62.d(findViewById4, "itemView.findViewById(R.…sArticleNumberOfComments)");
        this.A = (TextView) findViewById4;
    }

    public final TextView M() {
        return this.z;
    }

    public final ImageView N() {
        return this.x;
    }

    public final TextView O() {
        return this.A;
    }

    public final TextView P() {
        return this.y;
    }
}
