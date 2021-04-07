package defpackage;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

/* renamed from: nx1  reason: default package */
public final class nx1 {
    public static final a c = new a((r62) null);
    private final int a;
    private final String b;

    /* renamed from: nx1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final ArrayList<nx1> a() {
            ArrayList<nx1> arrayList = new ArrayList<>();
            int i = Calendar.getInstance().get(1);
            List<String> c = e32.c(f32.h("Spring", "Summer", "Fall", "Winter"));
            int i2 = i - 30;
            if (i2 <= i) {
                while (true) {
                    for (String nx1 : c) {
                        arrayList.add(new nx1(i2, nx1));
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            m32.s(arrayList);
            return arrayList;
        }
    }

    public nx1(int i, String str) {
        v62.e(str, "season");
        this.a = i;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!v62.a(nx1.class, obj.getClass()))) {
            return false;
        }
        nx1 nx1 = (nx1) obj;
        if (this.a == nx1.a) {
            String str = this.b;
            if (str != null) {
                String lowerCase = str.toLowerCase();
                v62.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                String str2 = nx1.b;
                if (str2 != null) {
                    String lowerCase2 = str2.toLowerCase();
                    v62.d(lowerCase2, "(this as java.lang.String).toLowerCase()");
                    if (v62.a(lowerCase, lowerCase2)) {
                        return true;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        if (this.a <= 0) {
            return this.b;
        }
        return this.b + ' ' + this.a;
    }
}
