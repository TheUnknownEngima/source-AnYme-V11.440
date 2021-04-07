package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import defpackage.gi;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: si  reason: default package */
public class si implements k<InputStream, Bitmap> {
    private final gi a;
    private final of b;

    /* renamed from: si$a */
    static class a implements gi.b {
        private final qi a;
        private final dm b;

        a(qi qiVar, dm dmVar) {
            this.a = qiVar;
            this.b = dmVar;
        }

        public void a(rf rfVar, Bitmap bitmap) {
            IOException a2 = this.b.a();
            if (a2 != null) {
                if (bitmap != null) {
                    rfVar.c(bitmap);
                }
                throw a2;
            }
        }

        public void b() {
            this.a.b();
        }
    }

    public si(gi giVar, of ofVar) {
        this.a = giVar;
        this.b = ofVar;
    }

    /* renamed from: c */
    public Cif<Bitmap> b(InputStream inputStream, int i, int i2, i iVar) {
        qi qiVar;
        boolean z;
        if (inputStream instanceof qi) {
            qiVar = (qi) inputStream;
            z = false;
        } else {
            qiVar = new qi(inputStream, this.b);
            z = true;
        }
        dm b2 = dm.b(qiVar);
        try {
            return this.a.g(new hm(b2), i, i2, iVar, new a(qiVar, b2));
        } finally {
            b2.h();
            if (z) {
                qiVar.h();
            }
        }
    }

    /* renamed from: d */
    public boolean a(InputStream inputStream, i iVar) {
        return this.a.p(inputStream);
    }
}
