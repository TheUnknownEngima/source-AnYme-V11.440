package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.c0;
import com.mikepenz.fastadapter.g;
import com.mikepenz.fastadapter.l;
import com.mikepenz.fastadapter.p;

/* renamed from: go1  reason: default package */
public interface go1<T, VH extends RecyclerView.c0> extends l<T, VH>, g<T, go1>, p<go1, go1> {
    boolean b();

    T e(boolean z);

    boolean f();

    int h();

    boolean isEnabled();

    View t(Context context, ViewGroup viewGroup);
}
