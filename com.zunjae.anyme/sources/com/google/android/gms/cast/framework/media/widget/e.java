package com.google.android.gms.cast.framework.media.widget;

import android.view.View;

final class e implements View.OnClickListener {
    private final /* synthetic */ ExpandedControllerActivity e;

    e(ExpandedControllerActivity expandedControllerActivity) {
        this.e = expandedControllerActivity;
    }

    public final void onClick(View view) {
        if (this.e.b0.isClickable()) {
            this.e.K().K();
        }
    }
}
