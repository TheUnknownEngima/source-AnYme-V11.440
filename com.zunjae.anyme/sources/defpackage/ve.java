package defpackage;

import android.util.Log;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ve  reason: default package */
public class ve<DataType, ResourceType, Transcode> {
    private final Class<DataType> a;
    private final List<? extends k<DataType, ResourceType>> b;
    private final uj<ResourceType, Transcode> c;
    private final r3<List<Throwable>> d;
    private final String e;

    /* renamed from: ve$a */
    interface a<ResourceType> {
        Cif<ResourceType> a(Cif<ResourceType> ifVar);
    }

    public ve(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends k<DataType, ResourceType>> list, uj<ResourceType, Transcode> ujVar, r3<List<Throwable>> r3Var) {
        this.a = cls;
        this.b = list;
        this.c = ujVar;
        this.d = r3Var;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private Cif<ResourceType> b(xd<DataType> xdVar, int i, int i2, i iVar) {
        List<Throwable> b2 = this.d.b();
        jm.d(b2);
        List list = b2;
        try {
            return c(xdVar, i, i2, iVar, list);
        } finally {
            this.d.c(list);
        }
    }

    private Cif<ResourceType> c(xd<DataType> xdVar, int i, int i2, i iVar, List<Throwable> list) {
        int size = this.b.size();
        Cif<ResourceType> ifVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) this.b.get(i3);
            try {
                if (kVar.a(xdVar.a(), iVar)) {
                    ifVar = kVar.b(xdVar.a(), i, i2, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    "Failed to decode data for " + kVar;
                }
                list.add(e2);
            }
            if (ifVar != null) {
                break;
            }
        }
        if (ifVar != null) {
            return ifVar;
        }
        throw new df(this.e, (List<Throwable>) new ArrayList(list));
    }

    public Cif<Transcode> a(xd<DataType> xdVar, int i, int i2, i iVar, a<ResourceType> aVar) {
        return this.c.a(aVar.a(b(xdVar, i, i2, iVar)), iVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
