package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.view.Surface;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;

@TargetApi(19)
public class h extends e<a.d.c> {
    private static final a.C0087a<gb0, a.d.c> k;
    private static final com.google.android.gms.common.api.a<a.d.c> l;
    /* access modifiers changed from: private */
    public final u60 i = new u60("CastRemoteDisplay");
    private VirtualDisplay j;

    static class a extends jb0 {
        private a() {
        }

        /* synthetic */ a(y1 y1Var) {
            this();
        }

        public void r() {
            throw new UnsupportedOperationException();
        }

        public void t1(int i, int i2, Surface surface) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        y1 y1Var = new y1();
        k = y1Var;
        l = new com.google.android.gms.common.api.a<>("CastRemoteDisplay.API", y1Var, g70.d);
    }

    h(Context context) {
        super(context, l, null, e.a.c);
    }

    /* access modifiers changed from: private */
    @TargetApi(19)
    public final void A() {
        VirtualDisplay virtualDisplay = this.j;
        if (virtualDisplay != null) {
            if (virtualDisplay.getDisplay() != null) {
                u60 u60 = this.i;
                int displayId = this.j.getDisplay().getDisplayId();
                StringBuilder sb = new StringBuilder(38);
                sb.append("releasing virtual display: ");
                sb.append(displayId);
                u60.a(sb.toString(), new Object[0]);
            }
            this.j.release();
            this.j = null;
        }
    }

    public e81<Void> x() {
        return p(new a2(this));
    }
}
