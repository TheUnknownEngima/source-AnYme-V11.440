package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.d;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AutoValue
public abstract class g {

    public static class a {
        private kq a;
        private Map<xm, b> b = new HashMap();

        public a a(xm xmVar, b bVar) {
            this.b.put(xmVar, bVar);
            return this;
        }

        public g b() {
            if (this.a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.b.keySet().size() >= xm.values().length) {
                Map<xm, b> map = this.b;
                this.b = new HashMap();
                return g.d(this.a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }

        public a c(kq kqVar) {
            this.a = kqVar;
            return this;
        }
    }

    @AutoValue
    public static abstract class b {

        @AutoValue.Builder
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j);

            public abstract a c(Set<c> set);

            public abstract a d(long j);
        }

        public static a a() {
            d.b bVar = new d.b();
            bVar.c(Collections.emptySet());
            return bVar;
        }

        /* access modifiers changed from: package-private */
        public abstract long b();

        /* access modifiers changed from: package-private */
        public abstract Set<c> c();

        /* access modifiers changed from: package-private */
        public abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i, long j) {
        int i2 = i - 1;
        return (long) (Math.pow(3.0d, (double) i2) * ((double) j) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j > 1 ? j : 2) * ((long) i2)))));
    }

    public static a b() {
        return new a();
    }

    static g d(kq kqVar, Map<xm, b> map) {
        return new c(kqVar, map);
    }

    public static g f(kq kqVar) {
        a b2 = b();
        xm xmVar = xm.DEFAULT;
        b.a a2 = b.a();
        a2.b(30000);
        a2.d(86400000);
        b2.a(xmVar, a2.a());
        xm xmVar2 = xm.HIGHEST;
        b.a a3 = b.a();
        a3.b(1000);
        a3.d(86400000);
        b2.a(xmVar2, a3.a());
        xm xmVar3 = xm.VERY_LOW;
        b.a a4 = b.a();
        a4.b(86400000);
        a4.d(86400000);
        a4.c(i(c.NETWORK_UNMETERED, c.DEVICE_IDLE));
        b2.a(xmVar3, a4.a());
        b2.c(kqVar);
        return b2.b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, xm xmVar, long j, int i) {
        builder.setMinimumLatency(g(xmVar, j, i));
        j(builder, h().get(xmVar).c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    public abstract kq e();

    public long g(xm xmVar, long j, int i) {
        long a2 = j - e().a();
        b bVar = h().get(xmVar);
        return Math.min(Math.max(a(i, bVar.b()), a2), bVar.d());
    }

    /* access modifiers changed from: package-private */
    public abstract Map<xm, b> h();
}
