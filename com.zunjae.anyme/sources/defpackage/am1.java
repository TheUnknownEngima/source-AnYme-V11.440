package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.b;
import com.mikepenz.fastadapter.l;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: am1  reason: default package */
public abstract class am1<Item extends l> implements yl1<Item> {
    @Nullable
    public View a(RecyclerView.c0 c0Var) {
        return null;
    }

    @Nullable
    public List<View> b(RecyclerView.c0 c0Var) {
        return null;
    }

    public abstract boolean c(View view, int i, b<Item> bVar, Item item);
}
