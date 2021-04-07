package com.mikepenz.fastadapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.c0;
import java.util.List;

public interface l<T, VH extends RecyclerView.c0> extends j<T> {
    boolean b();

    int d();

    T e(boolean z);

    boolean f();

    boolean isEnabled();

    void j(VH vh);

    boolean k(VH vh);

    void l(VH vh);

    void q(VH vh, List<Object> list);

    VH s(ViewGroup viewGroup);

    void u(VH vh);
}
