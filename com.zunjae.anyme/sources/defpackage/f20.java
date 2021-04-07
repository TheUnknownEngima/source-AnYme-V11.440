package defpackage;

import android.net.Uri;

/* renamed from: f20  reason: default package */
public final class f20 {
    public static Uri a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return (lastPathSegment == null || !v50.G0(lastPathSegment).matches("manifest(\\(.+\\))?")) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }
}
