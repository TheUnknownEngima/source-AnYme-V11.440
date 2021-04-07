package com.ferfalk.simplesearchview;

import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ SimpleSearchView e;

    public /* synthetic */ d(SimpleSearchView simpleSearchView) {
        this.e = simpleSearchView;
    }

    public final void onClick(View view) {
        this.e.q(view);
    }
}
