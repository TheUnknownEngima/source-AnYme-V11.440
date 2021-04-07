package defpackage;

import android.annotation.TargetApi;
import android.hardware.display.VirtualDisplay;
import com.google.android.gms.common.api.a;

@Deprecated
/* renamed from: db0  reason: default package */
public final class db0 {
    /* access modifiers changed from: private */
    public static final u60 b = new u60("CastRemoteDisplayApiImpl");
    private VirtualDisplay a;

    public db0(a aVar) {
        new eb0(this);
    }

    /* access modifiers changed from: private */
    @TargetApi(19)
    public final void c() {
        VirtualDisplay virtualDisplay = this.a;
        if (virtualDisplay != null) {
            if (virtualDisplay.getDisplay() != null) {
                u60 u60 = b;
                int displayId = this.a.getDisplay().getDisplayId();
                StringBuilder sb = new StringBuilder(38);
                sb.append("releasing virtual display: ");
                sb.append(displayId);
                u60.a(sb.toString(), new Object[0]);
            }
            this.a.release();
            this.a = null;
        }
    }
}
