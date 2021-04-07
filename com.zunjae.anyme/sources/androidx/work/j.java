package androidx.work;

import android.os.Build;
import androidx.work.o;
import java.util.concurrent.TimeUnit;

public final class j extends o {

    public static final class a extends o.a<a, j> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.c.d = OverwritingInputMerger.class.getName();
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ o.a d() {
            g();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public j c() {
            if (!this.a || Build.VERSION.SDK_INT < 23 || !this.c.j.h()) {
                return new j(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* access modifiers changed from: package-private */
        public a g() {
            return this;
        }

        public a h(long j, TimeUnit timeUnit) {
            this.c.g = timeUnit.toMillis(j);
            return this;
        }
    }

    j(a aVar) {
        super(aVar.b, aVar.c, aVar.d);
    }
}
