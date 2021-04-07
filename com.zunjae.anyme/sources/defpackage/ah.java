package defpackage;

import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import java.util.Collections;
import java.util.List;

/* renamed from: ah  reason: default package */
public interface ah<Model, Data> {

    /* renamed from: ah$a */
    public static class a<Data> {
        public final g a;
        public final List<g> b;
        public final wd<Data> c;

        public a(g gVar, List<g> list, wd<Data> wdVar) {
            jm.d(gVar);
            this.a = gVar;
            jm.d(list);
            this.b = list;
            jm.d(wdVar);
            this.c = wdVar;
        }

        public a(g gVar, wd<Data> wdVar) {
            this(gVar, Collections.emptyList(), wdVar);
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i, int i2, i iVar);
}
