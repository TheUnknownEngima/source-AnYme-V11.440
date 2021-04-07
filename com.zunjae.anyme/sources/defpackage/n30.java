package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

/* renamed from: n30  reason: default package */
final class n30 {
    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, o30 o30) {
        Object obj;
        if (o30.h() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(o30.h()), i, i2, 33);
        }
        if (o30.m()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (o30.n()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (o30.k()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(o30.c()), i, i2, 33);
        }
        if (o30.j()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(o30.b()), i, i2, 33);
        }
        if (o30.d() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(o30.d()), i, i2, 33);
        }
        if (o30.i() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(o30.i()), i, i2, 33);
        }
        int f = o30.f();
        if (f == 1) {
            obj = new AbsoluteSizeSpan((int) o30.e(), true);
        } else if (f == 2) {
            obj = new RelativeSizeSpan(o30.e());
        } else if (f == 3) {
            obj = new RelativeSizeSpan(o30.e() / 100.0f);
        } else {
            return;
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != 10) {
            spannableStringBuilder.append(10);
        }
    }

    public static o30 d(o30 o30, String[] strArr, Map<String, o30> map) {
        if (o30 == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (o30 == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (o30 == null && strArr.length > 1) {
            o30 o302 = new o30();
            int length = strArr.length;
            while (i < length) {
                o302.a(map.get(strArr[i]));
                i++;
            }
            return o302;
        } else if (o30 == null || strArr == null || strArr.length != 1) {
            if (!(o30 == null || strArr == null || strArr.length <= 1)) {
                int length2 = strArr.length;
                while (i < length2) {
                    o30.a(map.get(strArr[i]));
                    i++;
                }
            }
            return o30;
        } else {
            o30.a(map.get(strArr[0]));
            return o30;
        }
    }
}
