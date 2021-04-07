package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;

/* renamed from: nr1  reason: default package */
public final class nr1 extends RecyclerView.c0 {
    private final ImageView x;
    private final TextView y;
    private final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nr1(View view) {
        super(view);
        v62.e(view, "itemView");
        View findViewById = view.findViewById(C0275R$id.videoThumbnail);
        v62.d(findViewById, "itemView.findViewById(R.id.videoThumbnail)");
        this.x = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0275R$id.videoName);
        v62.d(findViewById2, "itemView.findViewById(R.id.videoName)");
        this.y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0275R$id.videoURL);
        v62.d(findViewById3, "itemView.findViewById(R.id.videoURL)");
        this.z = (TextView) findViewById3;
    }

    public final TextView M() {
        return this.y;
    }

    public final ImageView N() {
        return this.x;
    }

    public final TextView O() {
        return this.z;
    }
}
