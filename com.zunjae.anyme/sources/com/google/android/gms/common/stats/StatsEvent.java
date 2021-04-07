package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;

public abstract class StatsEvent extends m80 implements ReflectedParcelable {
    public abstract long i();

    public abstract int j();

    public abstract long k();

    public abstract String l();

    public String toString() {
        long k = k();
        int j = j();
        long i = i();
        String l = l();
        StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 53);
        sb.append(k);
        sb.append("\t");
        sb.append(j);
        sb.append("\t");
        sb.append(i);
        sb.append(l);
        return sb.toString();
    }
}
