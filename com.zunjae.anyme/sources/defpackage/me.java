package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: me  reason: default package */
class me {
    private static final ie f = new ie();
    private final ie a;
    private final le b;
    private final of c;
    private final ContentResolver d;
    private final List<ImageHeaderParser> e;

    me(List<ImageHeaderParser> list, ie ieVar, le leVar, of ofVar, ContentResolver contentResolver) {
        this.a = ieVar;
        this.b = leVar;
        this.c = ofVar;
        this.d = contentResolver;
        this.e = list;
    }

    me(List<ImageHeaderParser> list, le leVar, of ofVar, ContentResolver contentResolver) {
        this(list, f, leVar, ofVar, contentResolver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x002c A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String b(android.net.Uri r5) {
        /*
            r4 = this;
            r0 = 0
            le r1 = r4.b     // Catch:{ SecurityException -> 0x0022, all -> 0x0020 }
            android.database.Cursor r1 = r1.a(r5)     // Catch:{ SecurityException -> 0x0022, all -> 0x0020 }
            if (r1 == 0) goto L_0x001a
            boolean r2 = r1.moveToFirst()     // Catch:{ SecurityException -> 0x0023 }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r5 = r1.getString(r2)     // Catch:{ SecurityException -> 0x0023 }
            if (r1 == 0) goto L_0x0019
            r1.close()
        L_0x0019:
            return r5
        L_0x001a:
            if (r1 == 0) goto L_0x001f
            r1.close()
        L_0x001f:
            return r0
        L_0x0020:
            r5 = move-exception
            goto L_0x0044
        L_0x0022:
            r1 = r0
        L_0x0023:
            java.lang.String r2 = "ThumbStreamOpener"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x003c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r2.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = "Failed to query for thumbnail for Uri: "
            r2.append(r3)     // Catch:{ all -> 0x0042 }
            r2.append(r5)     // Catch:{ all -> 0x0042 }
            r2.toString()     // Catch:{ all -> 0x0042 }
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.close()
        L_0x0041:
            return r0
        L_0x0042:
            r5 = move-exception
            r0 = r1
        L_0x0044:
            if (r0 == 0) goto L_0x0049
            r0.close()
        L_0x0049:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me.b(android.net.Uri):java.lang.String");
    }

    private boolean c(File file) {
        return this.a.a(file) && 0 < this.a.c(file);
    }

    /* access modifiers changed from: package-private */
    public int a(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.d.openInputStream(uri);
            int b2 = f.b(this.e, openInputStream, this.c);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return b2;
        } catch (IOException | NullPointerException unused2) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                "Failed to open uri: " + uri;
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public InputStream d(Uri uri) {
        String b2 = b(uri);
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        File b3 = this.a.b(b2);
        if (!c(b3)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b3);
        try {
            return this.d.openInputStream(fromFile);
        } catch (NullPointerException e2) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e2));
        }
    }
}
