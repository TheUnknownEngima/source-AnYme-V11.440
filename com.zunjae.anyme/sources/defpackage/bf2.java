package defpackage;

import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import org.jsoup.nodes.f;

/* renamed from: bf2  reason: default package */
public interface bf2 {

    /* renamed from: bf2$a */
    public interface a<T extends a> {
        T A(URL url);

        T a(String str, String str2);

        T i(c cVar);

        boolean k(String str);

        URL m();

        c method();

        T n(String str, String str2);

        Map<String, String> q();

        String t(String str);

        Map<String, String> u();
    }

    /* renamed from: bf2$b */
    public interface b {
        boolean a();

        InputStream f();

        String key();

        String value();
    }

    /* renamed from: bf2$c */
    public enum c {
        GET(false),
        POST(true),
        PUT(true),
        DELETE(false),
        PATCH(true),
        HEAD(false),
        OPTIONS(false),
        TRACE(false);
        
        private final boolean hasBody;

        private c(boolean z) {
            this.hasBody = z;
        }

        public final boolean hasBody() {
            return this.hasBody;
        }
    }

    /* renamed from: bf2$d */
    public interface d extends a<d> {
        d b(boolean z);

        int c();

        d d(int i);

        d e(boolean z);

        d f(boolean z);

        boolean g();

        String h();

        boolean j();

        boolean l();

        Proxy o();

        Collection<b> p();

        boolean r();

        String w();

        int x();

        d y(qf2 qf2);

        qf2 z();
    }

    /* renamed from: bf2$e */
    public interface e extends a<e> {
        f s();

        int v();
    }

    bf2 a(String str, String str2);

    bf2 b(boolean z);

    bf2 c(String str);

    bf2 d(int i);

    bf2 e(boolean z);

    bf2 f(boolean z);

    bf2 g(String str);

    f get();

    e h();
}
