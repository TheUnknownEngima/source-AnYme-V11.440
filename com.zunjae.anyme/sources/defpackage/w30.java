package defpackage;

import android.text.Layout;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: w30  reason: default package */
public final class w30 extends h20 {
    public final long t;
    public final long u;

    /* renamed from: w30$b */
    public static class b {
        private long a;
        private long b;
        private CharSequence c;
        private int d;
        private float e;
        private int f;
        private int g;
        private float h;
        private int i;
        private float j;

        public b() {
            g();
        }

        private static float b(float f2, int i2) {
            int i3 = (f2 > -3.4028235E38f ? 1 : (f2 == -3.4028235E38f ? 0 : -1));
            if (i3 == 0 || i2 != 0 || (f2 >= Utils.FLOAT_EPSILON && f2 <= 1.0f)) {
                return i3 != 0 ? f2 : i2 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static Layout.Alignment c(int i2) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            StringBuilder sb = new StringBuilder(34);
                            sb.append("Unknown textAlignment: ");
                            sb.append(i2);
                            b50.h("WebvttCueBuilder", sb.toString());
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i2, float f2) {
            if (i2 == 0) {
                return 1.0f - f2;
            }
            if (i2 == 1) {
                return f2 <= 0.5f ? f2 * 2.0f : (1.0f - f2) * 2.0f;
            }
            if (i2 == 2) {
                return f2;
            }
            throw new IllegalStateException(String.valueOf(i2));
        }

        private static float e(int i2) {
            return i2 != 4 ? i2 != 5 ? 0.5f : 1.0f : Utils.FLOAT_EPSILON;
        }

        private static int f(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 3) {
                return 2;
            }
            if (i2 != 4) {
                return i2 != 5 ? 1 : 2;
            }
            return 0;
        }

        public w30 a() {
            this.e = b(this.e, this.f);
            if (this.h == -3.4028235E38f) {
                this.h = e(this.d);
            }
            if (this.i == Integer.MIN_VALUE) {
                this.i = f(this.d);
            }
            this.j = Math.min(this.j, d(this.i, this.h));
            long j2 = this.a;
            long j3 = this.b;
            CharSequence charSequence = this.c;
            q40.e(charSequence);
            return new w30(j2, j3, charSequence, c(this.d), this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public void g() {
            this.a = 0;
            this.b = 0;
            this.c = null;
            this.d = 2;
            this.e = -3.4028235E38f;
            this.f = 1;
            this.g = 0;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = 1.0f;
        }

        public b h(long j2) {
            this.b = j2;
            return this;
        }

        public b i(float f2) {
            this.e = f2;
            return this;
        }

        public b j(int i2) {
            this.g = i2;
            return this;
        }

        public b k(int i2) {
            this.f = i2;
            return this;
        }

        public b l(float f2) {
            this.h = f2;
            return this;
        }

        public b m(int i2) {
            this.i = i2;
            return this;
        }

        public b n(long j2) {
            this.a = j2;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public b p(int i2) {
            this.d = i2;
            return this;
        }

        public b q(float f2) {
            this.j = f2;
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private w30(long j, long j2, CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.t = j;
        this.u = j2;
    }

    public boolean a() {
        return this.h == -3.4028235E38f && this.k == 0.5f;
    }
}
