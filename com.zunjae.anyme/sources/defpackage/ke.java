package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.g;
import defpackage.wd;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ke  reason: default package */
public class ke implements wd<InputStream> {
    private final Uri e;
    private final me f;
    private InputStream g;

    /* renamed from: ke$a */
    static class a implements le {
        private static final String[] b = {"_data"};
        private final ContentResolver a;

        a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: ke$b */
    static class b implements le {
        private static final String[] b = {"_data"};
        private final ContentResolver a;

        b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    ke(Uri uri, me meVar) {
        this.e = uri;
        this.f = meVar;
    }

    private static ke c(Context context, Uri uri, le leVar) {
        return new ke(uri, new me(c.d(context).k().g(), leVar, c.d(context).f(), context.getContentResolver()));
    }

    public static ke f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static ke g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() {
        InputStream d = this.f.d(this.e);
        int a2 = d != null ? this.f.a(this.e) : -1;
        return a2 != -1 ? new zd(d, a2) : d;
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    public void e(g gVar, wd.a<? super InputStream> aVar) {
        try {
            InputStream h = h();
            this.g = h;
            aVar.f(h);
        } catch (FileNotFoundException e2) {
            boolean isLoggable = Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.c(e2);
        }
    }
}
