package defpackage;

import com.google.android.gms.cast.d;
import com.google.android.gms.cast.e;
import com.google.android.gms.common.api.Status;

/* renamed from: c80  reason: default package */
public final class c80 implements e.a {
    private final Status e;
    private final d f;
    private final String g;
    private final String h;
    private final boolean i;

    public c80(Status status) {
        this(status, (d) null, (String) null, (String) null, false);
    }

    public c80(Status status, d dVar, String str, String str2, boolean z) {
        this.e = status;
        this.f = dVar;
        this.g = str;
        this.h = str2;
        this.i = z;
    }

    public final boolean a() {
        return this.i;
    }

    public final String c() {
        return this.g;
    }

    public final d d() {
        return this.f;
    }

    public final Status g() {
        return this.e;
    }

    public final String h() {
        return this.h;
    }
}
