package defpackage;

/* renamed from: eu0  reason: default package */
final class eu0 extends zt0<Long> {
    eu0(iu0 iu0, String str, Long l, boolean z) {
        super(iu0, str, l, true, (eu0) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final Long e(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String n = super.n();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 25 + String.valueOf(valueOf).length());
        sb.append("Invalid long value for ");
        sb.append(n);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}
