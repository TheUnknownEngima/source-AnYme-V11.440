package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.i;
import defpackage.ah;
import java.io.InputStream;

/* renamed from: fh  reason: default package */
public class fh<Data> implements ah<Integer, Data> {
    private final ah<Uri, Data> a;
    private final Resources b;

    /* renamed from: fh$a */
    public static final class a implements bh<Integer, AssetFileDescriptor> {
        private final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        public ah<Integer, AssetFileDescriptor> b(eh ehVar) {
            return new fh(this.a, ehVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: fh$b */
    public static class b implements bh<Integer, ParcelFileDescriptor> {
        private final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        public ah<Integer, ParcelFileDescriptor> b(eh ehVar) {
            return new fh(this.a, ehVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: fh$c */
    public static class c implements bh<Integer, InputStream> {
        private final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        public ah<Integer, InputStream> b(eh ehVar) {
            return new fh(this.a, ehVar.d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: fh$d */
    public static class d implements bh<Integer, Uri> {
        private final Resources a;

        public d(Resources resources) {
            this.a = resources;
        }

        public ah<Integer, Uri> b(eh ehVar) {
            return new fh(this.a, ih.c());
        }
    }

    public fh(Resources resources, ah<Uri, Data> ahVar) {
        this.b = resources;
        this.a = ahVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.b.getResourcePackageName(num.intValue()) + '/' + this.b.getResourceTypeName(num.intValue()) + '/' + this.b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            "Received invalid resource id: " + num;
            return null;
        }
    }

    /* renamed from: c */
    public ah.a<Data> b(Integer num, int i, int i2, i iVar) {
        Uri d2 = d(num);
        if (d2 == null) {
            return null;
        }
        return this.a.b(d2, i, i2, iVar);
    }

    /* renamed from: e */
    public boolean a(Integer num) {
        return true;
    }
}
