package com.zunjae.anyme.features.niche.bulk_delete;

import android.view.View;
import com.zunjae.anyme.features.niche.bulk_delete.AnimeBulkDeleteAdapter;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ AnimeBulkDeleteAdapter e;
    public final /* synthetic */ AnimeBulkDeleteAdapter.ViewHolder f;
    public final /* synthetic */ sy1 g;

    public /* synthetic */ a(AnimeBulkDeleteAdapter animeBulkDeleteAdapter, AnimeBulkDeleteAdapter.ViewHolder viewHolder, sy1 sy1) {
        this.e = animeBulkDeleteAdapter;
        this.f = viewHolder;
        this.g = sy1;
    }

    public final void onClick(View view) {
        this.e.L(this.f, this.g, view);
    }
}
