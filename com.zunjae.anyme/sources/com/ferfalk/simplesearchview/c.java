package com.ferfalk.simplesearchview;

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: lambda */
public final /* synthetic */ class c implements TextView.OnEditorActionListener {
    public final /* synthetic */ SimpleSearchView a;

    public /* synthetic */ c(SimpleSearchView simpleSearchView) {
        this.a = simpleSearchView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return this.a.s(textView, i, keyEvent);
    }
}
