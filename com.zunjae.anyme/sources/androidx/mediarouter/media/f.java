package androidx.mediarouter.media;

import android.os.Messenger;

abstract class f {
    public static boolean a(Messenger messenger) {
        if (messenger == null) {
            return false;
        }
        try {
            return messenger.getBinder() != null;
        } catch (NullPointerException unused) {
            return false;
        }
    }
}
