package defpackage;

import com.bumptech.glide.load.g;
import defpackage.lm;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: kg  reason: default package */
public class kg {
    private final gm<g, String> a = new gm<>(1000);
    private final r3<b> b = lm.d(10, new a(this));

    /* renamed from: kg$a */
    class a implements lm.d<b> {
        a(kg kgVar) {
        }

        /* renamed from: b */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: kg$b */
    private static final class b implements lm.f {
        final MessageDigest e;
        private final nm f = nm.a();

        b(MessageDigest messageDigest) {
            this.e = messageDigest;
        }

        public nm h() {
            return this.f;
        }
    }

    private String a(g gVar) {
        b b2 = this.b.b();
        jm.d(b2);
        b bVar = b2;
        try {
            gVar.a(bVar.e);
            return km.t(bVar.e.digest());
        } finally {
            this.b.c(bVar);
        }
    }

    public String b(g gVar) {
        String g;
        synchronized (this.a) {
            g = this.a.g(gVar);
        }
        if (g == null) {
            g = a(gVar);
        }
        synchronized (this.a) {
            this.a.k(gVar, g);
        }
        return g;
    }
}
