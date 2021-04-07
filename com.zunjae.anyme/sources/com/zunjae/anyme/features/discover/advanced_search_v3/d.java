package com.zunjae.anyme.features.discover.advanced_search_v3;

import java.util.ArrayList;
import java.util.List;

public enum d {
    TV("TV", e32.b(1)),
    Movies("Movies", e32.b(2)),
    Special("Specials", f32.h(3, 4, 5));
    
    public static final a Companion = null;
    private final List<Integer> id;
    private final String title;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final List<Integer> a() {
            d[] values = d.values();
            ArrayList arrayList = new ArrayList();
            for (d id : values) {
                boolean unused = k32.q(arrayList, id.getId());
            }
            return arrayList;
        }
    }

    static {
        Companion = new a((r62) null);
    }

    private d(String str, List<Integer> list) {
        this.title = str;
        this.id = list;
    }

    public final List<Integer> getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }
}
