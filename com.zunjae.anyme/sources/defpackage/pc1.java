package defpackage;

/* renamed from: pc1  reason: default package */
public enum pc1 {
    NONE,
    JAVA_ONLY,
    ALL;
    
    static final int REPORT_UPLOAD_VARIANT_DATATRANSPORT = 2;
    static final int REPORT_UPLOAD_VARIANT_LEGACY = 1;

    static pc1 getState(jg1 jg1) {
        boolean z = true;
        boolean z2 = jg1.g == 2;
        if (jg1.h != 2) {
            z = false;
        }
        return getState(z2, z);
    }

    static pc1 getState(boolean z, boolean z2) {
        return !z ? NONE : !z2 ? JAVA_ONLY : ALL;
    }
}
