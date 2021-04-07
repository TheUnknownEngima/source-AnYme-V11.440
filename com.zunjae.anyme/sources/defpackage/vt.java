package defpackage;

import com.google.android.exoplayer2.f0;
import java.util.Arrays;

/* renamed from: vt  reason: default package */
public interface vt {

    /* renamed from: vt$a */
    public static final class a {
        public final int a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.b, aVar.b);
        }

        public int hashCode() {
            return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
        }
    }

    int a(it itVar, int i, boolean z);

    void b(i50 i50, int i);

    void c(long j, int i, int i2, int i3, a aVar);

    void d(f0 f0Var);
}
