package androidx.mediarouter.media;

import android.os.Bundle;
import android.os.SystemClock;

public final class m {
    final Bundle a;

    m(Bundle bundle) {
        this.a = bundle;
    }

    public static m a(Bundle bundle) {
        if (bundle != null) {
            return new m(bundle);
        }
        return null;
    }

    private static String f(int i) {
        return i != 0 ? i != 1 ? i != 2 ? Integer.toString(i) : "invalidated" : "ended" : "active";
    }

    public Bundle b() {
        return this.a.getBundle("extras");
    }

    public int c() {
        return this.a.getInt("sessionState", 2);
    }

    public long d() {
        return this.a.getLong("timestamp");
    }

    public boolean e() {
        return this.a.getBoolean("queuePaused");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaSessionStatus{ ");
        sb.append("timestamp=");
        v3.b(SystemClock.elapsedRealtime() - d(), sb);
        sb.append(" ms ago");
        sb.append(", sessionState=");
        sb.append(f(c()));
        sb.append(", queuePaused=");
        sb.append(e());
        sb.append(", extras=");
        sb.append(b());
        sb.append(" }");
        return sb.toString();
    }
}
