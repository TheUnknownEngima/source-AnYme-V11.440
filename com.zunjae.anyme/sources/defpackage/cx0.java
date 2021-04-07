package defpackage;

import defpackage.cx0;
import defpackage.ex0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: cx0  reason: default package */
public abstract class cx0<MessageType extends cx0<MessageType, BuilderType>, BuilderType extends ex0<MessageType, BuilderType>> implements f01 {
    protected int zza = 0;

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        uy0.d(iterable);
        if (iterable instanceof lz0) {
            List<?> b = ((lz0) iterable).b();
            lz0 lz0 = (lz0) list;
            int size = list.size();
            for (Object next : b) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(lz0.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = lz0.size() - 1; size2 >= size; size2--) {
                        lz0.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof lx0) {
                    lz0.W((lx0) next);
                } else {
                    lz0.add((String) next);
                }
            }
        } else if (iterable instanceof r01) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }

    public final lx0 b() {
        try {
            sx0 o = lx0.o(d());
            e(o.b());
            return o.a();
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

    public final byte[] h() {
        try {
            byte[] bArr = new byte[d()];
            cy0 f = cy0.f(bArr);
            e(f);
            f.N();
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

    /* access modifiers changed from: package-private */
    public int i() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public void l(int i) {
        throw new UnsupportedOperationException();
    }
}
