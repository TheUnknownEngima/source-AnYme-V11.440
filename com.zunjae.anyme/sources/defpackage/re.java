package defpackage;

import com.bumptech.glide.load.d;
import com.bumptech.glide.load.i;
import defpackage.bg;
import java.io.File;

/* renamed from: re  reason: default package */
class re<DataType> implements bg.b {
    private final d<DataType> a;
    private final DataType b;
    private final i c;

    re(d<DataType> dVar, DataType datatype, i iVar) {
        this.a = dVar;
        this.b = datatype;
        this.c = iVar;
    }

    public boolean a(File file) {
        return this.a.a(this.b, file, this.c);
    }
}
