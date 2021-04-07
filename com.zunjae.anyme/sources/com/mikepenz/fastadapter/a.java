package com.mikepenz.fastadapter;

import com.mikepenz.fastadapter.l;
import javax.annotation.Nullable;

public abstract class a<Item extends l> implements c<Item> {
    protected b<Item> a;
    protected int b = -1;

    public void f(int i) {
        this.b = i;
    }

    public int getOrder() {
        return this.b;
    }

    public b<Item> l() {
        return this.a;
    }

    public void m(@Nullable Iterable<Item> iterable) {
        if (iterable != null && this.a != null) {
            for (Item v0 : iterable) {
                this.a.v0(v0);
            }
        }
    }

    public a<Item> n(b<Item> bVar) {
        this.a = bVar;
        return this;
    }
}
