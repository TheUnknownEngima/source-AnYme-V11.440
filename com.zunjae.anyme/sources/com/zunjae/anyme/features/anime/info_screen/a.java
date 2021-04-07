package com.zunjae.anyme.features.anime.info_screen;

import java.util.List;

public abstract class a {

    /* renamed from: com.zunjae.anyme.features.anime.info_screen.a$a  reason: collision with other inner class name */
    public static final class C0162a extends a {
        private final Exception a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0162a(Exception exc) {
            super((r62) null);
            v62.e(exc, "exception");
            this.a = exc;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C0162a) && v62.a(this.a, ((C0162a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Exception exc = this.a;
            if (exc != null) {
                return exc.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Error(exception=" + this.a + ")";
        }
    }

    public static final class b extends a {
        public static final b a = new b();

        private b() {
            super((r62) null);
        }
    }

    public static final class c extends a {
        private final List<b> a;
        private final lx1 b;
        private final boolean c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(List<b> list, lx1 lx1, boolean z) {
            super((r62) null);
            v62.e(list, "data");
            v62.e(lx1, "info");
            this.a = list;
            this.b = lx1;
            this.c = z;
        }

        public final List<b> a() {
            return this.a;
        }

        public final lx1 b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return v62.a(this.a, cVar.a) && v62.a(this.b, cVar.b) && this.c == cVar.c;
        }

        public int hashCode() {
            List<b> list = this.a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            lx1 lx1 = this.b;
            if (lx1 != null) {
                i = lx1.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public String toString() {
            return "Success(data=" + this.a + ", info=" + this.b + ", cached=" + this.c + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(r62 r62) {
        this();
    }
}
