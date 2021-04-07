package defpackage;

import com.mikepenz.fastadapter.j;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: mm1  reason: default package */
public class mm1<Identifiable extends j> extends lm1<Identifiable> {
    private final AtomicLong b = new AtomicLong(-2);

    public long c(Identifiable identifiable) {
        return this.b.decrementAndGet();
    }
}
