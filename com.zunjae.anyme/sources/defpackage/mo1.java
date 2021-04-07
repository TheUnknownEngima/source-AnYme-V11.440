package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

/* renamed from: mo1  reason: default package */
public class mo1 {
    private static mo1 c;
    private b a;
    private boolean b = false;

    /* renamed from: mo1$a */
    static class a extends lo1 {
        a() {
        }
    }

    /* renamed from: mo1$b */
    public interface b {
        void a(ImageView imageView, Uri uri, Drawable drawable, String str);

        Drawable b(Context context, String str);

        void c(ImageView imageView);
    }

    /* renamed from: mo1$c */
    public enum c {
        PROFILE,
        PROFILE_DRAWER_ITEM,
        ACCOUNT_HEADER
    }

    private mo1(b bVar) {
        this.a = bVar;
    }

    public static mo1 c() {
        if (c == null) {
            c = new mo1(new a());
        }
        return c;
    }

    public static mo1 d(b bVar) {
        mo1 mo1 = new mo1(bVar);
        c = mo1;
        return mo1;
    }

    public void a(ImageView imageView) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.c(imageView);
        }
    }

    public b b() {
        return this.a;
    }

    public boolean e(ImageView imageView, Uri uri, String str) {
        if (!this.b && !"http".equals(uri.getScheme()) && !"https".equals(uri.getScheme())) {
            return false;
        }
        b bVar = this.a;
        if (bVar == null) {
            return true;
        }
        this.a.a(imageView, uri, bVar.b(imageView.getContext(), str), str);
        return true;
    }
}
