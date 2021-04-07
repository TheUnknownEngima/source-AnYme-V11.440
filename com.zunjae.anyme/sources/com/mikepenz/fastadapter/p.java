package com.mikepenz.fastadapter;

import com.mikepenz.fastadapter.g;
import com.mikepenz.fastadapter.l;

public interface p<T, S extends l & g> {
    S getParent();

    T o(S s);
}
