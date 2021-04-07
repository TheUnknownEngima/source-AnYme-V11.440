package defpackage;

/* renamed from: du0  reason: default package */
final class du0 extends zt0<Boolean> {
    du0(iu0 iu0, String str, Boolean bool, boolean z) {
        super(iu0, str, bool, true, (eu0) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object e(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (gt0.c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (gt0.d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String n = super.n();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(n);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}
