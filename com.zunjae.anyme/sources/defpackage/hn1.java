package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.mikepenz.materialdrawer.R$drawable;

/* renamed from: hn1  reason: default package */
public class hn1 {
    private int a = R$drawable.material_drawer_badge;
    private Drawable b;
    private in1 c;
    private in1 d;
    private in1 e;
    private ColorStateList f;
    private jn1 g;
    private jn1 h = jn1.c(2);
    private jn1 i = jn1.c(3);
    private jn1 j = jn1.c(20);

    public in1 a() {
        return this.c;
    }

    public in1 b() {
        return this.d;
    }

    public jn1 c() {
        return this.g;
    }

    public int d() {
        return this.a;
    }

    public void e(TextView textView) {
        f(textView, (ColorStateList) null);
    }

    public void f(TextView textView, ColorStateList colorStateList) {
        Context context = textView.getContext();
        Drawable drawable = this.b;
        if (drawable == null) {
            drawable = new ko1(this).a(context);
        }
        o4.l0(textView, drawable);
        in1 in1 = this.e;
        if (in1 != null) {
            po1.c(in1, textView, (ColorStateList) null);
        } else {
            ColorStateList colorStateList2 = this.f;
            if (colorStateList2 != null) {
                textView.setTextColor(colorStateList2);
            } else if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
        int a2 = this.i.a(context);
        int a3 = this.h.a(context);
        textView.setPadding(a2, a3, a2, a3);
        textView.setMinWidth(this.j.a(context));
    }
}
