package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: sk0  reason: default package */
public class sk0 {
    private static volatile sk0 a;
    private static final sk0 b = new sk0(true);

    sk0() {
        new HashMap();
    }

    private sk0(boolean z) {
        Collections.emptyMap();
    }

    public static sk0 a() {
        sk0 sk0 = a;
        if (sk0 == null) {
            synchronized (sk0.class) {
                sk0 = a;
                if (sk0 == null) {
                    sk0 = b;
                    a = sk0;
                }
            }
        }
        return sk0;
    }
}
