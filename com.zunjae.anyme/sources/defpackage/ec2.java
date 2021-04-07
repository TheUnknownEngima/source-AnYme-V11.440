package defpackage;

import javax.annotation.Nullable;

/* renamed from: ec2  reason: default package */
public final class ec2 extends db2 {
    @Nullable
    private final String f;
    private final long g;
    private final pd2 h;

    public ec2(@Nullable String str, long j, pd2 pd2) {
        this.f = str;
        this.g = j;
        this.h = pd2;
    }

    public long h() {
        return this.g;
    }

    public va2 i() {
        String str = this.f;
        if (str != null) {
            return va2.d(str);
        }
        return null;
    }

    public pd2 m() {
        return this.h;
    }
}
