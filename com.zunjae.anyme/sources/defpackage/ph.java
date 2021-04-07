package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.ah;
import defpackage.wd;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: ph  reason: default package */
public final class ph<DataT> implements ah<Uri, DataT> {
    private final Context a;
    private final ah<File, DataT> b;
    private final ah<Uri, DataT> c;
    private final Class<DataT> d;

    /* renamed from: ph$a */
    private static abstract class a<DataT> implements bh<Uri, DataT> {
        private final Context a;
        private final Class<DataT> b;

        a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        public final ah<Uri, DataT> b(eh ehVar) {
            return new ph(this.a, ehVar.d(File.class, this.b), ehVar.d(Uri.class, this.b), this.b);
        }
    }

    /* renamed from: ph$b */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: ph$c */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: ph$d */
    private static final class d<DataT> implements wd<DataT> {
        private static final String[] o = {"_data"};
        private final Context e;
        private final ah<File, DataT> f;
        private final ah<Uri, DataT> g;
        private final Uri h;
        private final int i;
        private final int j;
        private final i k;
        private final Class<DataT> l;
        private volatile boolean m;
        private volatile wd<DataT> n;

        d(Context context, ah<File, DataT> ahVar, ah<Uri, DataT> ahVar2, Uri uri, int i2, int i3, i iVar, Class<DataT> cls) {
            this.e = context.getApplicationContext();
            this.f = ahVar;
            this.g = ahVar2;
            this.h = uri;
            this.i = i2;
            this.j = i3;
            this.k = iVar;
            this.l = cls;
        }

        private ah.a<DataT> c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f.b(h(this.h), this.i, this.j, this.k);
            }
            return this.g.b(g() ? MediaStore.setRequireOriginal(this.h) : this.h, this.i, this.j, this.k);
        }

        private wd<DataT> f() {
            ah.a c = c();
            if (c != null) {
                return c.c;
            }
            return null;
        }

        private boolean g() {
            return this.e.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                cursor = this.e.getContentResolver().query(uri, o, (String) null, (String[]) null, (String) null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    return new File(string);
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }

        public Class<DataT> a() {
            return this.l;
        }

        public void b() {
            wd<DataT> wdVar = this.n;
            if (wdVar != null) {
                wdVar.b();
            }
        }

        public void cancel() {
            this.m = true;
            wd<DataT> wdVar = this.n;
            if (wdVar != null) {
                wdVar.cancel();
            }
        }

        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        public void e(g gVar, wd.a<? super DataT> aVar) {
            try {
                wd<DataT> f2 = f();
                if (f2 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.h));
                    return;
                }
                this.n = f2;
                if (this.m) {
                    cancel();
                } else {
                    f2.e(gVar, aVar);
                }
            } catch (FileNotFoundException e2) {
                aVar.c(e2);
            }
        }
    }

    ph(Context context, ah<File, DataT> ahVar, ah<Uri, DataT> ahVar2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = ahVar;
        this.c = ahVar2;
        this.d = cls;
    }

    /* renamed from: c */
    public ah.a<DataT> b(Uri uri, int i, int i2, i iVar) {
        return new ah.a<>(new zl(uri), new d(this.a, this.b, this.c, uri, i, i2, iVar, this.d));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && je.b(uri);
    }
}
