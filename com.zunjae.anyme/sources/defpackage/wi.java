package defpackage;

import defpackage.xd;
import java.nio.ByteBuffer;

/* renamed from: wi  reason: default package */
public class wi implements xd<ByteBuffer> {
    private final ByteBuffer a;

    /* renamed from: wi$a */
    public static class a implements xd.a<ByteBuffer> {
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        /* renamed from: c */
        public xd<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new wi(byteBuffer);
        }
    }

    public wi(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public void b() {
    }

    /* renamed from: c */
    public ByteBuffer a() {
        this.a.position(0);
        return this.a;
    }
}
