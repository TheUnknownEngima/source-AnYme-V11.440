package defpackage;

import com.bumptech.glide.load.i;
import defpackage.ve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: gf  reason: default package */
public class gf<Data, ResourceType, Transcode> {
    private final r3<List<Throwable>> a;
    private final List<? extends ve<Data, ResourceType, Transcode>> b;
    private final String c;

    public gf(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<ve<Data, ResourceType, Transcode>> list, r3<List<Throwable>> r3Var) {
        this.a = r3Var;
        jm.c(list);
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private Cif<Transcode> b(xd<Data> xdVar, i iVar, int i, int i2, ve.a<ResourceType> aVar, List<Throwable> list) {
        List<Throwable> list2 = list;
        int size = this.b.size();
        Cif<Transcode> ifVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                ifVar = ((ve) this.b.get(i3)).a(xdVar, i, i2, iVar, aVar);
            } catch (df e) {
                list2.add(e);
            }
            if (ifVar != null) {
                break;
            }
        }
        if (ifVar != null) {
            return ifVar;
        }
        throw new df(this.c, (List<Throwable>) new ArrayList(list2));
    }

    public Cif<Transcode> a(xd<Data> xdVar, i iVar, int i, int i2, ve.a<ResourceType> aVar) {
        List<Throwable> b2 = this.a.b();
        jm.d(b2);
        List list = b2;
        try {
            return b(xdVar, iVar, i, i2, aVar, list);
        } finally {
            this.a.c(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
