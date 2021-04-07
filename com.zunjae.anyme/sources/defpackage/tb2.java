package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: tb2  reason: default package */
public final class tb2 {
    private final Set<eb2> a = new LinkedHashSet();

    public synchronized void a(eb2 eb2) {
        this.a.remove(eb2);
    }

    public synchronized void b(eb2 eb2) {
        this.a.add(eb2);
    }

    public synchronized boolean c(eb2 eb2) {
        return this.a.contains(eb2);
    }
}
