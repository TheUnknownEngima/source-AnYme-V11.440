package com.zunjae.anyme.features.database;

import androidx.lifecycle.LiveData;
import com.zunjae.anyme.features.waifus.j;
import java.util.List;

public abstract class e {
    public abstract void a();

    public abstract void b(j jVar);

    public abstract LiveData<List<j>> c();

    public abstract void d(List<yy1> list);

    public abstract void e(List<j> list);

    public abstract void f(j jVar);

    public void g(List<j> list) {
        v62.e(list, "waifus");
        a();
        e(list);
    }
}
