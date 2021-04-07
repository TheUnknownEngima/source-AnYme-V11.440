package defpackage;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

/* renamed from: br  reason: default package */
public final class br {
    public static final br f = new b().a();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    private AudioAttributes e;

    /* renamed from: br$b */
    public static final class b {
        private int a = 0;
        private int b = 0;
        private int c = 1;
        private int d = 1;

        public br a() {
            return new br(this.a, this.b, this.c, this.d);
        }
    }

    private br(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @TargetApi(21)
    public AudioAttributes a() {
        if (this.e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            if (v50.a >= 29) {
                usage.setAllowedCapturePolicy(this.d);
            }
            this.e = usage.build();
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || br.class != obj.getClass()) {
            return false;
        }
        br brVar = (br) obj;
        return this.a == brVar.a && this.b == brVar.b && this.c == brVar.c && this.d == brVar.d;
    }

    public int hashCode() {
        return ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}
