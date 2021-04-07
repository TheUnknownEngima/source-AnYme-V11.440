package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;

public final class c {
    d a;

    public c(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.a = new e(remoteUserInfo);
    }

    public c(String str, int i, int i2) {
        this.a = Build.VERSION.SDK_INT >= 28 ? new e(str, i, i2) : new f(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.a.equals(((c) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
