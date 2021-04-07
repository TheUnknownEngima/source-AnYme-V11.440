package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.google.android.gms.cast.framework.media.internal.a;

final class c implements a {
    private final /* synthetic */ ExpandedControllerActivity a;

    c(ExpandedControllerActivity expandedControllerActivity) {
        this.a = expandedControllerActivity;
    }

    @TargetApi(23)
    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.a.Z != null) {
                this.a.Z.setVisibility(8);
            }
            if (this.a.Y != null) {
                this.a.Y.setVisibility(0);
                this.a.Y.setImageBitmap(bitmap);
            }
        }
    }
}
