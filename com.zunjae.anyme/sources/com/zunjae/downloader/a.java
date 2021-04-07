package com.zunjae.downloader;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class a {
    private static final String a = "com.dv.adm";
    private static final String b = "com.dv.adm.pay";
    public static final a c = new a();

    private a() {
    }

    public final String a(Context context) {
        v62.e(context, "context");
        return com.zunjae.zapplib.a.a(context, b, a);
    }

    public final boolean b(Context context) {
        v62.e(context, "context");
        return com.zunjae.zapplib.a.b(context, a, b);
    }

    public final void c(Context context) {
        v62.e(context, "context");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + a));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + a));
            intent2.setFlags(268435456);
            context.startActivity(intent2);
        }
    }
}
