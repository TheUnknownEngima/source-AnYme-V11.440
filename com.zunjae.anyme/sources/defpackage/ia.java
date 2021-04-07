package defpackage;

/* renamed from: ia  reason: default package */
public final class ia implements ha<vb> {
    /* renamed from: b */
    public ka a(vb vbVar) {
        try {
            int a = vbVar.a();
            return a != -1007 ? a != -1004 ? new ma(vbVar) : new ja(vbVar.getMessage()) : new la(vbVar.getMessage());
        } catch (Exception e) {
            return new na(e);
        }
    }
}
