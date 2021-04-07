package defpackage;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: vi  reason: default package */
public class vi<T> implements k<T, Bitmap> {
    public static final h<Long> d = h.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());
    public static final h<Integer> e = h.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());
    private static final e f = new e();
    private final f<T> a;
    private final rf b;
    private final e c;

    /* renamed from: vi$a */
    class a implements h.b<Long> {
        private final ByteBuffer a = ByteBuffer.allocate(8);

        a() {
        }

        /* renamed from: b */
        public void a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: vi$b */
    class b implements h.b<Integer> {
        private final ByteBuffer a = ByteBuffer.allocate(4);

        b() {
        }

        /* renamed from: b */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.a) {
                    this.a.position(0);
                    messageDigest.update(this.a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: vi$c */
    private static final class c implements f<AssetFileDescriptor> {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: vi$d */
    static final class d implements f<ByteBuffer> {

        /* renamed from: vi$d$a */
        class a extends MediaDataSource {
            final /* synthetic */ ByteBuffer e;

            a(d dVar, ByteBuffer byteBuffer) {
                this.e = byteBuffer;
            }

            public void close() {
            }

            public long getSize() {
                return (long) this.e.limit();
            }

            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= ((long) this.e.limit())) {
                    return -1;
                }
                this.e.position((int) j);
                int min = Math.min(i2, this.e.remaining());
                this.e.get(bArr, i, min);
                return min;
            }
        }

        d() {
        }

        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(this, byteBuffer));
        }
    }

    /* renamed from: vi$e */
    static class e {
        e() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: vi$f */
    interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: vi$g */
    static final class g implements f<ParcelFileDescriptor> {
        g() {
        }

        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    vi(rf rfVar, f<T> fVar) {
        this(rfVar, fVar, f);
    }

    vi(rf rfVar, f<T> fVar, e eVar) {
        this.b = rfVar;
        this.a = fVar;
        this.c = eVar;
    }

    public static k<AssetFileDescriptor, Bitmap> c(rf rfVar) {
        return new vi(rfVar, new c((a) null));
    }

    public static k<ByteBuffer, Bitmap> d(rf rfVar) {
        return new vi(rfVar, new d());
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, fi fiVar) {
        Bitmap g2 = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || fiVar == fi.d) ? null : g(mediaMetadataRetriever, j, i, i2, i3, fiVar);
        return g2 == null ? f(mediaMetadataRetriever, j, i) : g2;
    }

    private static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @TargetApi(27)
    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, fi fiVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b2 = fiVar.b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b2), Math.round(b2 * ((float) parseInt2)));
        } catch (Throwable unused) {
            boolean isLoggable = Log.isLoggable("VideoDecoder", 3);
            return null;
        }
    }

    public static k<ParcelFileDescriptor, Bitmap> h(rf rfVar) {
        return new vi(rfVar, new g());
    }

    public boolean a(T t, i iVar) {
        return true;
    }

    public Cif<Bitmap> b(T t, int i, int i2, i iVar) {
        long longValue = ((Long) iVar.c(d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) iVar.c(e);
            if (num == null) {
                num = 2;
            }
            fi fiVar = (fi) iVar.c(fi.f);
            if (fiVar == null) {
                fiVar = fi.e;
            }
            fi fiVar2 = fiVar;
            MediaMetadataRetriever a2 = this.c.a();
            try {
                this.a.a(a2, t);
                Bitmap e2 = e(a2, longValue, num.intValue(), i, i2, fiVar2);
                a2.release();
                return yh.f(e2, this.b);
            } catch (RuntimeException e3) {
                throw new IOException(e3);
            } catch (Throwable th) {
                a2.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }
}
