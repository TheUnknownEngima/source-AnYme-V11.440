package defpackage;

import java.io.IOException;

/* renamed from: ol0  reason: default package */
public class ol0 extends IOException {
    public ol0(String str) {
        super(str);
    }

    static nl0 a() {
        return new nl0("Protocol message tag had invalid wire type.");
    }
}
