package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.util.Collections;
import java.util.List;

@Keep
public class TransportRegistrar implements h {
    public List<d<?>> getComponents() {
        d.b<an> a = d.a(an.class);
        a.b(n.f(Context.class));
        a.f(a.b());
        return Collections.singletonList(a.d());
    }
}
