package defpackage;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: h21  reason: default package */
public enum h21 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(Utils.FLOAT_EPSILON)),
    DOUBLE(Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(lx0.f),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzj;

    private h21(Object obj) {
        this.zzj = obj;
    }
}
