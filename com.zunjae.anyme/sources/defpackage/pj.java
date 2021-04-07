package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: pj  reason: default package */
public class pj implements k<InputStream, ij> {
    private final List<ImageHeaderParser> a;
    private final k<ByteBuffer, ij> b;
    private final of c;

    public pj(List<ImageHeaderParser> list, k<ByteBuffer, ij> kVar, of ofVar) {
        this.a = list;
        this.b = kVar;
        this.c = ofVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            boolean isLoggable = Log.isLoggable("StreamGifDecoder", 5);
            return null;
        }
    }

    /* renamed from: c */
    public Cif<ij> b(InputStream inputStream, int i, int i2, i iVar) {
        byte[] e = e(inputStream);
        if (e == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(e), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(InputStream inputStream, i iVar) {
        return !((Boolean) iVar.c(oj.b)).booleanValue() && f.e(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF;
    }
}
