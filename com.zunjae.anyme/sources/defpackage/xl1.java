package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.l;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: xl1  reason: default package */
public abstract class xl1<Item extends l> implements yl1<Item> {
    @Nullable
    public View a(RecyclerView.c0 c0Var) {
        return null;
    }

    @Nullable
    public List<View> b(RecyclerView.c0 c0Var) {
        return null;
    }

    public abstract void c(View view, RecyclerView.c0 c0Var);
}
