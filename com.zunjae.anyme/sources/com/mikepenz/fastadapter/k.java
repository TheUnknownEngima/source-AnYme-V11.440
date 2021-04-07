package com.mikepenz.fastadapter;

import javax.annotation.Nullable;

public interface k<Element, Item> {
    public static final k<l, l> a = new a();

    static class a implements k<l, l> {
        a() {
        }

        public /* bridge */ /* synthetic */ Object a(Object obj) {
            l lVar = (l) obj;
            b(lVar);
            return lVar;
        }

        public l b(l lVar) {
            return lVar;
        }
    }

    @Nullable
    Item a(Element element);
}
