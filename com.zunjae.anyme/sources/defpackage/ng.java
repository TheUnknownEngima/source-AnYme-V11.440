package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.i;
import defpackage.ah;
import java.io.InputStream;

/* renamed from: ng  reason: default package */
public class ng<Data> implements ah<Uri, Data> {
    private static final int c = 22;
    private final AssetManager a;
    private final a<Data> b;

    /* renamed from: ng$a */
    public interface a<Data> {
        wd<Data> a(AssetManager assetManager, String str);
    }

    /* renamed from: ng$b */
    public static class b implements bh<Uri, ParcelFileDescriptor>, a<ParcelFileDescriptor> {
        private final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        public wd<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new ae(assetManager, str);
        }

        public ah<Uri, ParcelFileDescriptor> b(eh ehVar) {
            return new ng(this.a, this);
        }
    }

    /* renamed from: ng$c */
    public static class c implements bh<Uri, InputStream>, a<InputStream> {
        private final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        public wd<InputStream> a(AssetManager assetManager, String str) {
            return new ge(assetManager, str);
        }

        public ah<Uri, InputStream> b(eh ehVar) {
            return new ng(this.a, this);
        }
    }

    public ng(AssetManager assetManager, a<Data> aVar) {
        this.a = assetManager;
        this.b = aVar;
    }

    /* renamed from: c */
    public ah.a<Data> b(Uri uri, int i, int i2, i iVar) {
        return new ah.a<>(new zl(uri), this.b.a(this.a, uri.toString().substring(c)));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
