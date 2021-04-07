package com.zunjae.anyme;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.c;
import com.bumptech.glide.j;

public class d extends j {
    public d(c cVar, ek ekVar, jk jkVar, Context context) {
        super(cVar, ekVar, jkVar, context);
    }

    /* access modifiers changed from: protected */
    public void A(cl clVar) {
        if (!(clVar instanceof b)) {
            clVar = new b().b(clVar);
        }
        super.A(clVar);
    }

    /* renamed from: E */
    public <ResourceType> c<ResourceType> a(Class<ResourceType> cls) {
        return new c<>(this.e, this, cls, this.f);
    }

    /* renamed from: F */
    public c<Bitmap> b() {
        return (c) super.b();
    }

    /* renamed from: G */
    public c<Drawable> k() {
        return (c) super.k();
    }

    public c<Drawable> H(Uri uri) {
        return (c) super.r(uri);
    }

    public c<Drawable> I(Integer num) {
        return (c) super.s(num);
    }

    /* renamed from: J */
    public c<Drawable> t(String str) {
        return (c) super.t(str);
    }
}
