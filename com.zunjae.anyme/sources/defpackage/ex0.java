package defpackage;

import defpackage.cx0;
import defpackage.ex0;

/* renamed from: ex0  reason: default package */
public abstract class ex0<MessageType extends cx0<MessageType, BuilderType>, BuilderType extends ex0<MessageType, BuilderType>> implements e01 {
    public final /* synthetic */ e01 B0(f01 f01) {
        if (j().getClass().isInstance(f01)) {
            n((cx0) f01);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public final /* synthetic */ e01 E(byte[] bArr, fy0 fy0) {
        p(bArr, 0, bArr.length, fy0);
        return this;
    }

    public final /* synthetic */ e01 J(byte[] bArr) {
        o(bArr, 0, bArr.length);
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract BuilderType n(MessageType messagetype);

    public abstract BuilderType o(byte[] bArr, int i, int i2);

    public abstract BuilderType p(byte[] bArr, int i, int i2, fy0 fy0);
}
