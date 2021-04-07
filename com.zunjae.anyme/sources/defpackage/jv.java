package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: jv  reason: default package */
public final class jv {

    /* renamed from: jv$a */
    private static class a {
        /* access modifiers changed from: private */
        public final UUID a;

        public a(UUID uuid, int i, byte[] bArr) {
            this.a = uuid;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, (UUID[]) null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    private static a c(byte[] bArr) {
        i50 i50 = new i50(bArr);
        if (i50.d() < 32) {
            return null;
        }
        i50.M(0);
        if (i50.k() != i50.a() + 4 || i50.k() != 1886614376) {
            return null;
        }
        int c = bv.c(i50.k());
        if (c > 1) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unsupported pssh version: ");
            sb.append(c);
            b50.h("PsshAtomUtil", sb.toString());
            return null;
        }
        UUID uuid = new UUID(i50.s(), i50.s());
        if (c == 1) {
            i50.N(i50.D() * 16);
        }
        int D = i50.D();
        if (D != i50.a()) {
            return null;
        }
        byte[] bArr2 = new byte[D];
        i50.h(bArr2, 0, D);
        return new a(uuid, c, bArr2);
    }

    public static UUID d(byte[] bArr) {
        a c = c(bArr);
        if (c == null) {
            return null;
        }
        return c.a;
    }
}
