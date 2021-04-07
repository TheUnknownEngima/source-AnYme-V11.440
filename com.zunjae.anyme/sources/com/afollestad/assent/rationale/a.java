package com.afollestad.assent.rationale;

import com.afollestad.assent.internal.e;

public final class a {
    private z52<? super Boolean, u22> a;

    public a(z52<? super Boolean, u22> z52) {
        this.a = z52;
    }

    public final void a(boolean z) {
        if (this.a == null) {
            e.b(this, "Confirm callback invoked more than once, ignored after first invocation.", new Object[0]);
        }
        z52<? super Boolean, u22> z52 = this.a;
        if (z52 != null) {
            u22 r = z52.r(Boolean.valueOf(z));
        }
        this.a = null;
    }
}
