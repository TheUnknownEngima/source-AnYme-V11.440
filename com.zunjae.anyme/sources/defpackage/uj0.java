package defpackage;

import defpackage.sj0;
import defpackage.uj0;

/* renamed from: uj0  reason: default package */
public abstract class uj0<MessageType extends sj0<MessageType, BuilderType>, BuilderType extends uj0<MessageType, BuilderType>> implements om0 {
    public final /* synthetic */ om0 M(pm0 pm0) {
        if (f().getClass().isInstance(pm0)) {
            j((sj0) pm0);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    public abstract BuilderType j(MessageType messagetype);
}
