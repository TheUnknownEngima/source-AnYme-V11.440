package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: qa2  reason: default package */
public final class qa2 extends bb2 {
    private static final va2 c = va2.c("application/x-www-form-urlencoded");
    private final List<String> a;
    private final List<String> b;

    /* renamed from: qa2$a */
    public static final class a {
        private final List<String> a;
        private final List<String> b;
        private final Charset c;

        public a() {
            this((Charset) null);
        }

        public a(Charset charset) {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = charset;
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.a.add(ta2.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.c));
                this.b.add(ta2.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public a b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.a.add(ta2.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.c));
                this.b.add(ta2.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public qa2 c() {
            return new qa2(this.a, this.b);
        }
    }

    qa2(List<String> list, List<String> list2) {
        this.a = ib2.t(list);
        this.b = ib2.t(list2);
    }

    private long i(@Nullable od2 od2, boolean z) {
        nd2 nd2 = z ? new nd2() : od2.d();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                nd2.F0(38);
            }
            nd2.P0(this.a.get(i));
            nd2.F0(61);
            nd2.P0(this.b.get(i));
        }
        if (!z) {
            return 0;
        }
        long k0 = nd2.k0();
        nd2.b();
        return k0;
    }

    public long a() {
        return i((od2) null, true);
    }

    public va2 b() {
        return c;
    }

    public void h(od2 od2) {
        i(od2, false);
    }
}
