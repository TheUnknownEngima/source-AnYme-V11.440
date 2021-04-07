package androidx.preference;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class l extends RecyclerView.c0 {
    private final SparseArray<View> x;
    private boolean y;
    private boolean z;

    l(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.x = sparseArray;
        sparseArray.put(16908310, view.findViewById(16908310));
        this.x.put(16908304, view.findViewById(16908304));
        this.x.put(16908294, view.findViewById(16908294));
        SparseArray<View> sparseArray2 = this.x;
        int i = R$id.icon_frame;
        sparseArray2.put(i, view.findViewById(i));
        this.x.put(16908350, view.findViewById(16908350));
    }

    public View M(int i) {
        View view = this.x.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.e.findViewById(i);
        if (findViewById != null) {
            this.x.put(i, findViewById);
        }
        return findViewById;
    }

    public boolean N() {
        return this.y;
    }

    public boolean O() {
        return this.z;
    }

    public void P(boolean z2) {
        this.y = z2;
    }

    public void Q(boolean z2) {
        this.z = z2;
    }
}
