package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.core.widget.i;

/* renamed from: xm1  reason: default package */
public class xm1 {
    public tm1 a;
    public tm1 b;
    public tm1 c;
    public tm1 d;

    public void a(TextView textView) {
        Drawable[] a2 = i.a(textView);
        Drawable drawable = this.a;
        if (drawable == null) {
            drawable = a2[0];
        }
        Drawable drawable2 = this.b;
        if (drawable2 == null) {
            drawable2 = a2[1];
        }
        Drawable drawable3 = this.c;
        if (drawable3 == null) {
            drawable3 = a2[2];
        }
        Drawable drawable4 = this.d;
        if (drawable4 == null) {
            drawable4 = a2[3];
        }
        i.m(textView, drawable, drawable2, drawable3, drawable4);
    }
}
