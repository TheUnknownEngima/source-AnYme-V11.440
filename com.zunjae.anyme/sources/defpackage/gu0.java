package defpackage;

/* renamed from: gu0  reason: default package */
final class gu0 extends zt0<Double> {
    gu0(iu0 iu0, String str, Double d, boolean z) {
        super(iu0, str, d, true, (eu0) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final Double e(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String n = super.n();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid double value for ");
        sb.append(n);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}
