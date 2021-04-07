package defpackage;

import android.media.MediaFormat;
import com.google.android.exoplayer2.video.i;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: xx  reason: default package */
public final class xx {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, i iVar) {
        if (iVar != null) {
            d(mediaFormat, "color-transfer", iVar.g);
            d(mediaFormat, "color-standard", iVar.e);
            d(mediaFormat, "color-range", iVar.f);
            a(mediaFormat, "hdr-static-info", iVar.h);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(list.get(i)));
        }
    }
}
