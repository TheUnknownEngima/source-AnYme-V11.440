package defpackage;

import com.google.android.exoplayer2.m0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: z30  reason: default package */
public final class z30 {
    private static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(i50 i50) {
        String m;
        while (true) {
            String m2 = i50.m();
            if (m2 == null) {
                return null;
            }
            if (a.matcher(m2).matches()) {
                do {
                    m = i50.m();
                    if (m == null) {
                        break;
                    }
                } while (m.isEmpty());
            } else {
                Matcher matcher = x30.b.matcher(m2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(i50 i50) {
        String m = i50.m();
        return m != null && m.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] A0 = v50.A0(str, "\\.");
        long j = 0;
        for (String parseLong : v50.z0(A0[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (A0.length == 2) {
            j2 += Long.parseLong(A0[1]);
        }
        return j2 * 1000;
    }

    public static void e(i50 i50) {
        int c = i50.c();
        if (!b(i50)) {
            i50.M(c);
            String valueOf = String.valueOf(i50.m());
            throw new m0(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "));
        }
    }
}
