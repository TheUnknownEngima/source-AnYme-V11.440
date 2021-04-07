package defpackage;

import defpackage.sj0;
import defpackage.uj0;
import java.io.IOException;

/* renamed from: sj0  reason: default package */
public abstract class sj0<MessageType extends sj0<MessageType, BuilderType>, BuilderType extends uj0<MessageType, BuilderType>> implements pm0 {
    protected int zzbmy = 0;

    public final byte[] a() {
        try {
            byte[] bArr = new byte[e()];
            nk0 f = nk0.f(bArr);
            d(f);
            f.n0();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final bk0 g() {
        try {
            ik0 h = bk0.h(e());
            d(h.b());
            return h.a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    public void h(int i) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        throw new UnsupportedOperationException();
    }
}
