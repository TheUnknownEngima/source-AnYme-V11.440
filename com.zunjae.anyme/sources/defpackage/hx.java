package defpackage;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* renamed from: hx  reason: default package */
public interface hx {

    /* renamed from: hx$a */
    public static final class a {
        public final String a;
        public final byte[] b;

        public a(String str, int i, byte[] bArr) {
            this.a = str;
            this.b = bArr;
        }
    }

    /* renamed from: hx$b */
    public static final class b {
        public final int a;
        public final String b;
        public final List<a> c;
        public final byte[] d;

        public b(int i, String str, List<a> list, byte[] bArr) {
            this.a = i;
            this.b = str;
            this.c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.d = bArr;
        }
    }

    /* renamed from: hx$c */
    public interface c {
        hx a(int i, b bVar);

        SparseArray<hx> b();
    }

    /* renamed from: hx$d */
    public static final class d {
        private final String a;
        private final int b;
        private final int c;
        private int d;
        private String e;

        public d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(12);
                sb.append(i);
                sb.append("/");
                str = sb.toString();
            } else {
                str = "";
            }
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
        }

        private void d() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i = this.d;
            int i2 = i == Integer.MIN_VALUE ? this.b : i + this.c;
            this.d = i2;
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
            sb.append(str);
            sb.append(i2);
            this.e = sb.toString();
        }

        public String b() {
            d();
            return this.e;
        }

        public int c() {
            d();
            return this.d;
        }
    }

    void a(s50 s50, jt jtVar, d dVar);

    void b(i50 i50, int i);

    void c();
}
