package com.mikepenz.fastadapter;

import com.mikepenz.fastadapter.l;
import java.util.List;
import javax.annotation.Nullable;

public interface m<Model, Item extends l> extends c<Item> {

    public interface a<Item extends l> {
        boolean a(Item item, @Nullable CharSequence charSequence);
    }

    m<Model, Item> c(int i, List<Item> list);

    m<Model, Item> clear();

    m<Model, Item> d(List<Model> list);

    m<Model, Item> e(Model... modelArr);

    m<Model, Item> g(int i, int i2);

    m<Model, Item> set(int i, Model model);
}
