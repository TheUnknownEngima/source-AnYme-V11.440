package com.google.android.gms.cast.framework.media;

import android.graphics.Bitmap;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.cast.framework.media.internal.a;

final class j0 implements a {
    private final /* synthetic */ MediaNotificationService.a a;
    private final /* synthetic */ MediaNotificationService b;

    j0(MediaNotificationService mediaNotificationService, MediaNotificationService.a aVar) {
        this.b = mediaNotificationService;
        this.a = aVar;
    }

    public final void a(Bitmap bitmap) {
        MediaNotificationService.a aVar = this.a;
        aVar.b = bitmap;
        MediaNotificationService.a unused = this.b.p = aVar;
        this.b.h();
    }
}
