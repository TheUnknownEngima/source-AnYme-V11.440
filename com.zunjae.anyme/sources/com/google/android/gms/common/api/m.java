package com.google.android.gms.common.api;

import com.google.android.gms.common.d;

public final class m extends UnsupportedOperationException {
    private final d e;

    public m(d dVar) {
        this.e = dVar;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
