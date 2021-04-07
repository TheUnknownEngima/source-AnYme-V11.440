package defpackage;

import android.content.Context;
import defpackage.eg;
import java.io.File;

/* renamed from: gg  reason: default package */
public final class gg extends eg {

    /* renamed from: gg$a */
    class a implements eg.a {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        public File a() {
            File cacheDir = this.a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.b != null ? new File(cacheDir, this.b) : cacheDir;
        }
    }

    public gg(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public gg(Context context, String str, long j) {
        super(new a(context, str), j);
    }
}
