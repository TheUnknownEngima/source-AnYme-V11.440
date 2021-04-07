package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: u82  reason: default package */
public final class u82 implements Serializable {
    private final Pattern e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u82(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            defpackage.v62.e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "Pattern.compile(pattern)"
            defpackage.v62.d(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u82.<init>(java.lang.String):void");
    }

    public u82(Pattern pattern) {
        v62.e(pattern, "nativePattern");
        this.e = pattern;
    }

    public static /* synthetic */ s82 b(u82 u82, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return u82.a(charSequence, i);
    }

    public final s82 a(CharSequence charSequence, int i) {
        v62.e(charSequence, "input");
        Matcher matcher = this.e.matcher(charSequence);
        v62.d(matcher, "nativePattern.matcher(input)");
        return v82.b(matcher, i, charSequence);
    }

    public final boolean c(CharSequence charSequence) {
        v62.e(charSequence, "input");
        return this.e.matcher(charSequence).matches();
    }

    public final String d(CharSequence charSequence, String str) {
        v62.e(charSequence, "input");
        v62.e(str, "replacement");
        String replaceAll = this.e.matcher(charSequence).replaceAll(str);
        v62.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final List<String> e(CharSequence charSequence, int i) {
        v62.e(charSequence, "input");
        int i2 = 0;
        if (i >= 0) {
            Matcher matcher = this.e.matcher(charSequence);
            if (!matcher.find() || i == 1) {
                return e32.b(charSequence.toString());
            }
            int i3 = 10;
            if (i > 0) {
                i3 = w72.e(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            int i4 = i - 1;
            do {
                arrayList.add(charSequence.subSequence(i2, matcher.start()).toString());
                i2 = matcher.end();
                if ((i4 >= 0 && arrayList.size() == i4) || !matcher.find()) {
                    arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                }
                arrayList.add(charSequence.subSequence(i2, matcher.start()).toString());
                i2 = matcher.end();
                break;
            } while (!matcher.find());
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    public String toString() {
        String pattern = this.e.toString();
        v62.d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
