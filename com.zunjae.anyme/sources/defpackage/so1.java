package defpackage;

import android.widget.TextView;

/* renamed from: so1  reason: default package */
public class so1 {
    private CharSequence a;
    private int b = -1;

    public so1(CharSequence charSequence) {
        this.a = charSequence;
    }

    public static void b(so1 so1, TextView textView) {
        if (so1 != null && textView != null) {
            so1.a(textView);
        }
    }

    public static boolean d(so1 so1, TextView textView) {
        if (so1 != null && textView != null) {
            return so1.c(textView);
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
        return false;
    }

    public void a(TextView textView) {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            int i = this.b;
            if (i != -1) {
                textView.setText(i);
                return;
            }
            charSequence = "";
        }
        textView.setText(charSequence);
    }

    public boolean c(TextView textView) {
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            int i = this.b;
            if (i != -1) {
                textView.setText(i);
            } else {
                textView.setVisibility(8);
                return false;
            }
        }
        textView.setVisibility(0);
        return true;
    }

    public String toString() {
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            return charSequence.toString();
        }
        if (this.b == -1) {
            return "";
        }
        return "StringRes:" + this.b;
    }
}
