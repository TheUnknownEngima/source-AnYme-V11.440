package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.i;
import defpackage.ah;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: jh  reason: default package */
public class jh<Data> implements ah<Uri, Data> {
    private static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));
    private final c<Data> a;

    /* renamed from: jh$a */
    public static final class a implements bh<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        private final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public wd<AssetFileDescriptor> a(Uri uri) {
            return new td(this.a, uri);
        }

        public ah<Uri, AssetFileDescriptor> b(eh ehVar) {
            return new jh(this);
        }
    }

    /* renamed from: jh$b */
    public static class b implements bh<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        private final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public wd<ParcelFileDescriptor> a(Uri uri) {
            return new be(this.a, uri);
        }

        public ah<Uri, ParcelFileDescriptor> b(eh ehVar) {
            return new jh(this);
        }
    }

    /* renamed from: jh$c */
    public interface c<Data> {
        wd<Data> a(Uri uri);
    }

    /* renamed from: jh$d */
    public static class d implements bh<Uri, InputStream>, c<InputStream> {
        private final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public wd<InputStream> a(Uri uri) {
            return new he(this.a, uri);
        }

        public ah<Uri, InputStream> b(eh ehVar) {
            return new jh(this);
        }
    }

    public jh(c<Data> cVar) {
        this.a = cVar;
    }

    /* renamed from: c */
    public ah.a<Data> b(Uri uri, int i, int i2, i iVar) {
        return new ah.a<>(new zl(uri), this.a.a(uri));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
