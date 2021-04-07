package com.bumptech.glide;

import com.bumptech.glide.k;

public abstract class k<CHILD extends k<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    private vl<? super TranscodeType> e = tl.c();

    private CHILD d() {
        return this;
    }

    /* renamed from: b */
    public final CHILD clone() {
        try {
            return (k) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final vl<? super TranscodeType> c() {
        return this.e;
    }

    public final CHILD e(vl<? super TranscodeType> vlVar) {
        jm.d(vlVar);
        this.e = vlVar;
        d();
        return this;
    }
}
