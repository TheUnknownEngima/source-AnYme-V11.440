package defpackage;

import android.util.Log;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.i;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: pg  reason: default package */
public class pg implements d<ByteBuffer> {
    /* renamed from: c */
    public boolean a(ByteBuffer byteBuffer, File file, i iVar) {
        try {
            am.e(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            boolean isLoggable = Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
