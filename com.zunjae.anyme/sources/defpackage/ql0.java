package defpackage;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: ql0  reason: default package */
public enum ql0 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(Utils.FLOAT_EPSILON)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(bk0.class, bk0.class, bk0.f),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> zzbsj;
    private final Class<?> zzbsk;
    private final Object zzbsl;

    private ql0(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzbsj = cls;
        this.zzbsk = cls2;
        this.zzbsl = obj;
    }

    public final Class<?> zzke() {
        return this.zzbsk;
    }
}
