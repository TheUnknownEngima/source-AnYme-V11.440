package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bv  reason: default package */
abstract class bv {
    public final int a;

    /* renamed from: bv$a */
    static final class a extends bv {
        public final long b;
        public final List<b> c = new ArrayList();
        public final List<a> d = new ArrayList();

        public a(int i, long j) {
            super(i);
            this.b = j;
        }

        public void d(a aVar) {
            this.d.add(aVar);
        }

        public void e(b bVar) {
            this.c.add(bVar);
        }

        public a f(int i) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.d.get(i2);
                if (aVar.a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public b g(int i) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = this.c.get(i2);
                if (bVar.a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            String a = bv.a(this.a);
            String arrays = Arrays.toString(this.c.toArray());
            String arrays2 = Arrays.toString(this.d.toArray());
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
            sb.append(a);
            sb.append(" leaves: ");
            sb.append(arrays);
            sb.append(" containers: ");
            sb.append(arrays2);
            return sb.toString();
        }
    }

    /* renamed from: bv$b */
    static final class b extends bv {
        public final i50 b;

        public b(int i, i50 i50) {
            super(i);
            this.b = i50;
        }
    }

    public bv(int i) {
        this.a = i;
    }

    public static String a(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public static int b(int i) {
        return i & 16777215;
    }

    public static int c(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return a(this.a);
    }
}
