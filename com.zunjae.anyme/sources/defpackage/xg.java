package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.ah;
import defpackage.wd;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: xg  reason: default package */
public final class xg implements ah<Uri, File> {
    private final Context a;

    /* renamed from: xg$a */
    public static final class a implements bh<Uri, File> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        public ah<Uri, File> b(eh ehVar) {
            return new xg(this.a);
        }
    }

    /* renamed from: xg$b */
    private static class b implements wd<File> {
        private static final String[] g = {"_data"};
        private final Context e;
        private final Uri f;

        b(Context context, Uri uri) {
            this.e = context;
            this.f = uri;
        }

        public Class<File> a() {
            return File.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        public void e(g gVar, wd.a<? super File> aVar) {
            Cursor query = this.e.getContentResolver().query(this.f, g, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f));
                return;
            }
            aVar.f(new File(str));
        }
    }

    public xg(Context context) {
        this.a = context;
    }

    /* renamed from: c */
    public ah.a<File> b(Uri uri, int i, int i2, i iVar) {
        return new ah.a<>(new zl(uri), new b(this.a, uri));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return je.b(uri);
    }
}
