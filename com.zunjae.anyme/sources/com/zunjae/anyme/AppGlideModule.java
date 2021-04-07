package com.zunjae.anyme;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.d;

public final class AppGlideModule extends nk {
    public void b(Context context, d dVar) {
        v62.e(context, "context");
        v62.e(dVar, "builder");
        super.b(context, dVar);
        dVar.c(new gg(context, "AnYmeImageCache", 262144000));
        dVar.b(Drawable.class, aj.n());
    }
}
