package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: te1  reason: default package */
final class te1 {
    private static final Pattern a = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    static se1 a(String str) {
        Matcher matcher = a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            long longValue = Long.valueOf(matcher.group(1), 16).longValue();
            return new se1(longValue, Long.valueOf(matcher.group(2), 16).longValue() - longValue, matcher.group(3), matcher.group(4));
        } catch (Exception unused) {
            jb1 f = jb1.f();
            f.b("Could not parse map entry: " + str);
            return null;
        }
    }
}
