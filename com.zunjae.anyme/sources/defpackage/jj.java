package defpackage;

import android.util.Log;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.l;
import java.io.File;
import java.io.IOException;

/* renamed from: jj  reason: default package */
public class jj implements l<ij> {
    public c b(i iVar) {
        return c.SOURCE;
    }

    /* renamed from: c */
    public boolean a(Cif<ij> ifVar, File file, i iVar) {
        try {
            am.e(ifVar.get().c(), file);
            return true;
        } catch (IOException unused) {
            boolean isLoggable = Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }
}
