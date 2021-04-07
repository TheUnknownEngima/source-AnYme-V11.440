package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

public class o extends p {
    public o(List<d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
    }
}
