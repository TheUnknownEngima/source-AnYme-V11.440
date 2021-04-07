package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: ew1  reason: default package */
public final class ew1 {
    public static final a a = new a((r62) null);

    /* renamed from: ew1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final boolean a(Context context) {
            v62.e(context, "context");
            return !b(context);
        }

        public final boolean b(Context context) {
            v62.e(context, "context");
            Resources resources = context.getResources();
            v62.d(resources, "context.resources");
            return resources.getConfiguration().orientation == 1;
        }
    }
}
