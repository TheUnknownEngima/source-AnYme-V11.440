package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.zunjae.anyme.AppGlideModule;
import java.util.Collections;
import java.util.Set;

final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final AppGlideModule a = new AppGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        boolean isLoggable = Log.isLoggable("Glide", 3);
    }

    public void a(Context context, c cVar, h hVar) {
        this.a.a(context, cVar, hVar);
    }

    public void b(Context context, d dVar) {
        this.a.b(context, dVar);
    }

    public boolean c() {
        return this.a.c();
    }

    public Set<Class<?>> d() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public a e() {
        return new a();
    }
}
