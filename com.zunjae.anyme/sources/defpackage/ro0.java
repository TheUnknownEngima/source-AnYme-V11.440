package defpackage;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: ro0  reason: default package */
public enum ro0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(Utils.FLOAT_EPSILON)),
    DOUBLE(Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(bk0.f),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzbsl;

    private ro0(Object obj) {
        this.zzbsl = obj;
    }
}
