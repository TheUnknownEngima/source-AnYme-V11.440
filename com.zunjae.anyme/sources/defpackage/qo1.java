package defpackage;

import android.content.Context;

/* renamed from: qo1  reason: default package */
public class qo1 {
    private int a = Integer.MIN_VALUE;
    private int b = Integer.MIN_VALUE;
    private int c = Integer.MIN_VALUE;

    public int a(Context context) {
        int i = this.a;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return (int) to1.a((float) i2, context);
        }
        if (this.c != Integer.MIN_VALUE) {
            return context.getResources().getDimensionPixelSize(this.c);
        }
        return 0;
    }

    public void b(int i) {
        this.b = i;
    }
}
