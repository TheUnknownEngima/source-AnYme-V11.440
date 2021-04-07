package defpackage;

import defpackage.ej1;
import defpackage.ok1;
import defpackage.wi1;
import defpackage.wi1.a;
import java.io.IOException;

/* renamed from: wi1  reason: default package */
public abstract class wi1<MessageType extends wi1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements ok1 {
    protected int e = 0;

    /* renamed from: wi1$a */
    public static abstract class a<MessageType extends wi1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements ok1.a {
        protected static kl1 q(ok1 ok1) {
            return new kl1(ok1);
        }

        public /* bridge */ /* synthetic */ ok1.a d0(ok1 ok1) {
            p(ok1);
            return this;
        }

        /* access modifiers changed from: protected */
        public abstract BuilderType o(MessageType messagetype);

        public BuilderType p(ok1 ok1) {
            if (c().getClass().isInstance(ok1)) {
                o((wi1) ok1);
                return this;
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String k(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public ej1 f() {
        try {
            ej1.g n = ej1.n(g());
            e(n.b());
            return n.a();
        } catch (IOException e2) {
            throw new RuntimeException(k("ByteString"), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public int h() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int i(el1 el1) {
        int h = h();
        if (h != -1) {
            return h;
        }
        int i = el1.i(this);
        m(i);
        return i;
    }

    /* access modifiers changed from: package-private */
    public kl1 l() {
        return new kl1(this);
    }

    /* access modifiers changed from: package-private */
    public void m(int i) {
        throw new UnsupportedOperationException();
    }
}
