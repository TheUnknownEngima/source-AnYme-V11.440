package defpackage;

/* renamed from: tt  reason: default package */
public interface tt {

    /* renamed from: tt$a */
    public static final class a {
        public final ut a;
        public final ut b;

        public a(ut utVar) {
            this(utVar, utVar);
        }

        public a(ut utVar, ut utVar2) {
            q40.e(utVar);
            this.a = utVar;
            q40.e(utVar2);
            this.b = utVar2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str;
            String valueOf = String.valueOf(this.a);
            if (this.a.equals(this.b)) {
                str = "";
            } else {
                String valueOf2 = String.valueOf(this.b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 2);
                sb.append(", ");
                sb.append(valueOf2);
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(str).length());
            sb2.append("[");
            sb2.append(valueOf);
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* renamed from: tt$b */
    public static class b implements tt {
        private final long a;
        private final a b;

        public b(long j) {
            this(j, 0);
        }

        public b(long j, long j2) {
            this.a = j;
            this.b = new a(j2 == 0 ? ut.c : new ut(0, j2));
        }

        public boolean e() {
            return false;
        }

        public a i(long j) {
            return this.b;
        }

        public long j() {
            return this.a;
        }
    }

    boolean e();

    a i(long j);

    long j();
}
