package com.ferfalk.simplesearchview;

import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnFocusChangeListener {
    public final /* synthetic */ SimpleSearchView e;

    public /* synthetic */ a(SimpleSearchView simpleSearchView) {
        this.e = simpleSearchView;
    }

    public final void onFocusChange(View view, boolean z) {
        this.e.t(view, z);
    }
}
