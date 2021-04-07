package defpackage;

import defpackage.ok1;

/* renamed from: xi1  reason: default package */
public abstract class xi1<MessageType extends ok1> implements xk1<MessageType> {
    static {
        mj1.b();
    }

    private MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.b()) {
            return messagetype;
        }
        yj1 a = d(messagetype).a();
        a.i(messagetype);
        throw a;
    }

    private kl1 d(MessageType messagetype) {
        return messagetype instanceof wi1 ? ((wi1) messagetype).l() : new kl1(messagetype);
    }

    /* renamed from: e */
    public MessageType a(ej1 ej1, mj1 mj1) {
        MessageType f = f(ej1, mj1);
        c(f);
        return f;
    }

    public MessageType f(ej1 ej1, mj1 mj1) {
        MessageType messagetype;
        try {
            fj1 o = ej1.o();
            messagetype = (ok1) b(o, mj1);
            o.a(0);
            return messagetype;
        } catch (yj1 e) {
            e.i(messagetype);
            throw e;
        } catch (yj1 e2) {
            throw e2;
        }
    }
}
