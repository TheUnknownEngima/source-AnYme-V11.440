package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.source.hls.i;
import com.google.android.exoplayer2.upstream.t;
import defpackage.g00;
import java.io.IOException;

/* renamed from: c20  reason: default package */
public interface c20 {

    /* renamed from: c20$a */
    public interface a {
        c20 a(i iVar, t tVar, b20 b20);
    }

    /* renamed from: c20$b */
    public interface b {
        void f();

        boolean i(Uri uri, long j);
    }

    /* renamed from: c20$c */
    public static final class c extends IOException {
        public c(Uri uri) {
        }
    }

    /* renamed from: c20$d */
    public static final class d extends IOException {
        public d(Uri uri) {
        }
    }

    /* renamed from: c20$e */
    public interface e {
        void c(y10 y10);
    }

    boolean a(Uri uri);

    void b(b bVar);

    void c(Uri uri);

    long d();

    boolean e();

    x10 f();

    void g(Uri uri, g00.a aVar, e eVar);

    void h();

    void i(Uri uri);

    void j(b bVar);

    y10 k(Uri uri, boolean z);

    void stop();
}
