package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.gn;

@AutoValue
/* renamed from: mn  reason: default package */
public abstract class mn {

    @AutoValue.Builder
    /* renamed from: mn$a */
    public static abstract class a {
        public abstract a a(cn cnVar);

        public abstract a b(b bVar);

        public abstract mn c();
    }

    /* renamed from: mn$b */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        static {
            UNKNOWN = new b("UNKNOWN", 0, 0);
            ANDROID_FIREBASE = new b("ANDROID_FIREBASE", 1, 23);
        }

        private b(int i) {
        }
    }

    public static a a() {
        return new gn.b();
    }

    public abstract cn b();

    public abstract b c();
}
