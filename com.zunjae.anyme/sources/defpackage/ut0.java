package defpackage;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: ut0  reason: default package */
public final class ut0 {
    private final Map<String, Map<String, String>> a;

    ut0(Map<String, Map<String, String>> map) {
        this.a = map;
    }

    @Nullable
    public final String a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        Map map;
        if (uri == null || (map = this.a.get(uri.toString())) == null) {
            return null;
        }
        if (str2 != null) {
            String valueOf = String.valueOf(str2);
            String valueOf2 = String.valueOf(str3);
            str3 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return (String) map.get(str3);
    }
}
