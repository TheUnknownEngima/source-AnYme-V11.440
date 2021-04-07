package com.google.android.gms.cast.framework;

import android.os.RemoteException;

public final class w {
    private static final u60 b = new u60("DiscoveryManager");
    private final c0 a;

    w(c0 c0Var) {
        this.a = c0Var;
    }

    public final w80 a() {
        try {
            return this.a.I();
        } catch (RemoteException e) {
            b.b(e, "Unable to call %s on %s.", "getWrappedThis", c0.class.getSimpleName());
            return null;
        }
    }
}
