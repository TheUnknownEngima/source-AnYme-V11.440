package defpackage;

import android.util.Pair;
import java.util.Map;

/* renamed from: zs  reason: default package */
public final class zs {
    private static long a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair<Long, Long> b(ps<?> psVar) {
        Map<String, String> d = psVar.d();
        if (d == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(d, "LicenseDurationRemaining")), Long.valueOf(a(d, "PlaybackDurationRemaining")));
    }
}
