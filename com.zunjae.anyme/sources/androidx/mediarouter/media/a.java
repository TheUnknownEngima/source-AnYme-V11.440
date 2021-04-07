package androidx.mediarouter.media;

import android.os.Bundle;
import android.os.SystemClock;

public final class a {
    final Bundle a;

    a(Bundle bundle) {
        this.a = bundle;
    }

    public static a a(Bundle bundle) {
        if (bundle != null) {
            return new a(bundle);
        }
        return null;
    }

    private static String g(int i) {
        switch (i) {
            case 0:
                return "pending";
            case 1:
                return "playing";
            case 2:
                return "paused";
            case 3:
                return "buffering";
            case 4:
                return "finished";
            case 5:
                return "canceled";
            case 6:
                return "invalidated";
            case 7:
                return "error";
            default:
                return Integer.toString(i);
        }
    }

    public long b() {
        return this.a.getLong("contentDuration", -1);
    }

    public long c() {
        return this.a.getLong("contentPosition", -1);
    }

    public Bundle d() {
        return this.a.getBundle("extras");
    }

    public int e() {
        return this.a.getInt("playbackState", 7);
    }

    public long f() {
        return this.a.getLong("timestamp");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaItemStatus{ ");
        sb.append("timestamp=");
        v3.b(SystemClock.elapsedRealtime() - f(), sb);
        sb.append(" ms ago");
        sb.append(", playbackState=");
        sb.append(g(e()));
        sb.append(", contentPosition=");
        sb.append(c());
        sb.append(", contentDuration=");
        sb.append(b());
        sb.append(", extras=");
        sb.append(d());
        sb.append(" }");
        return sb.toString();
    }
}
