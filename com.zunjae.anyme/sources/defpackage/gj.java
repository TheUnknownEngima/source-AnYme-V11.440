package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import defpackage.od;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* renamed from: gj  reason: default package */
public class gj implements k<ByteBuffer, ij> {
    private static final a f = new a();
    private static final b g = new b();
    private final Context a;
    private final List<ImageHeaderParser> b;
    private final b c;
    private final a d;
    private final hj e;

    /* renamed from: gj$a */
    static class a {
        a() {
        }

        /* access modifiers changed from: package-private */
        public od a(od.a aVar, qd qdVar, ByteBuffer byteBuffer, int i) {
            return new sd(aVar, qdVar, byteBuffer, i);
        }
    }

    /* renamed from: gj$b */
    static class b {
        private final Queue<rd> a = km.f(0);

        b() {
        }

        /* access modifiers changed from: package-private */
        public synchronized rd a(ByteBuffer byteBuffer) {
            rd poll;
            poll = this.a.poll();
            if (poll == null) {
                poll = new rd();
            }
            poll.p(byteBuffer);
            return poll;
        }

        /* access modifiers changed from: package-private */
        public synchronized void b(rd rdVar) {
            rdVar.a();
            this.a.offer(rdVar);
        }
    }

    public gj(Context context, List<ImageHeaderParser> list, rf rfVar, of ofVar) {
        this(context, list, rfVar, ofVar, g, f);
    }

    gj(Context context, List<ImageHeaderParser> list, rf rfVar, of ofVar, b bVar, a aVar) {
        this.a = context.getApplicationContext();
        this.b = list;
        this.d = aVar;
        this.e = new hj(rfVar, ofVar);
        this.c = bVar;
    }

    private kj c(ByteBuffer byteBuffer, int i, int i2, rd rdVar, i iVar) {
        long b2 = fm.b();
        try {
            qd c2 = rdVar.c();
            if (c2.b() > 0) {
                if (c2.c() == 0) {
                    Bitmap.Config config = iVar.c(oj.a) == com.bumptech.glide.load.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    od a2 = this.d.a(this.e, c2, byteBuffer, e(c2, i, i2));
                    a2.e(config);
                    a2.b();
                    Bitmap a3 = a2.a();
                    if (a3 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            "Decoded GIF from stream in " + fm.a(b2);
                        }
                        return null;
                    }
                    kj kjVar = new kj(new ij(this.a, a2, th.c(), i, i2, a3));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        "Decoded GIF from stream in " + fm.a(b2);
                    }
                    return kjVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                "Decoded GIF from stream in " + fm.a(b2);
            }
        }
    }

    private static int e(qd qdVar, int i, int i2) {
        int min = Math.min(qdVar.a() / i2, qdVar.d() / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + qdVar.d() + "x" + qdVar.a() + "]";
        }
        return max;
    }

    /* renamed from: d */
    public kj b(ByteBuffer byteBuffer, int i, int i2, i iVar) {
        rd a2 = this.c.a(byteBuffer);
        try {
            return c(byteBuffer, i, i2, a2, iVar);
        } finally {
            this.c.b(a2);
        }
    }

    /* renamed from: f */
    public boolean a(ByteBuffer byteBuffer, i iVar) {
        return !((Boolean) iVar.c(oj.b)).booleanValue() && f.f(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }
}
