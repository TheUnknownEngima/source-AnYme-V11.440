package defpackage;

import java.util.Set;

/* renamed from: fo  reason: default package */
final class fo implements an {
    private final Set<vm> a;
    private final eo b;
    private final io c;

    fo(Set<vm> set, eo eoVar, io ioVar) {
        this.a = set;
        this.b = eoVar;
        this.c = ioVar;
    }

    public <T> zm<T> a(String str, Class<T> cls, ym<T, byte[]> ymVar) {
        return b(str, cls, vm.b("proto"), ymVar);
    }

    public <T> zm<T> b(String str, Class<T> cls, vm vmVar, ym<T, byte[]> ymVar) {
        if (this.a.contains(vmVar)) {
            return new ho(this.b, str, vmVar, ymVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{vmVar, this.a}));
    }
}
