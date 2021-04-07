package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: ji  reason: default package */
public final class ji implements ImageHeaderParser {
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public ImageHeaderParser.ImageType b(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public int c(InputStream inputStream, of ofVar) {
        int d = new s5(inputStream).d("Orientation", 1);
        if (d == 0) {
            return -1;
        }
        return d;
    }
}
