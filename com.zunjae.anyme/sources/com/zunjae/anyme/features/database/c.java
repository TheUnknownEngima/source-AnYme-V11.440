package com.zunjae.anyme.features.database;

import androidx.lifecycle.LiveData;
import com.zunjae.anyme.features.anime.character.d;
import java.util.List;

public abstract class c {
    public abstract void a();

    public abstract void b(long j);

    public abstract List<d> c(long j);

    public abstract LiveData<List<d>> d(long j);

    public abstract void e(List<d> list);

    public void f(List<d> list, long j) {
        v62.e(list, "characters");
        for (d j2 : list) {
            j2.j(j);
        }
        a();
        e(list);
    }
}
