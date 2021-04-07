package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.f;
import java.io.InputStream;
import java.util.List;

/* renamed from: mi  reason: default package */
interface mi {

    /* renamed from: mi$a */
    public static final class a implements mi {
        private final de a;
        private final of b;
        private final List<ImageHeaderParser> c;

        a(InputStream inputStream, List<ImageHeaderParser> list, of ofVar) {
            jm.d(ofVar);
            this.b = ofVar;
            jm.d(list);
            this.c = list;
            this.a = new de(inputStream, ofVar);
        }

        public int a() {
            return f.b(this.c, this.a.a(), this.b);
        }

        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.a.a(), (Rect) null, options);
        }

        public void c() {
            this.a.c();
        }

        public ImageHeaderParser.ImageType d() {
            return f.e(this.c, this.a.a(), this.b);
        }
    }

    /* renamed from: mi$b */
    public static final class b implements mi {
        private final of a;
        private final List<ImageHeaderParser> b;
        private final fe c;

        b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, of ofVar) {
            jm.d(ofVar);
            this.a = ofVar;
            jm.d(list);
            this.b = list;
            this.c = new fe(parcelFileDescriptor);
        }

        public int a() {
            return f.a(this.b, this.c, this.a);
        }

        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), (Rect) null, options);
        }

        public void c() {
        }

        public ImageHeaderParser.ImageType d() {
            return f.d(this.b, this.c, this.a);
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();
}
