package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.util.Arrays;
import java.util.List;

@Keep
public class AbtRegistrar implements h {
    static /* synthetic */ a lambda$getComponents$0(e eVar) {
        return new a((Context) eVar.a(Context.class), (eb1) eVar.a(eb1.class));
    }

    public List<d<?>> getComponents() {
        d.b<a> a = d.a(a.class);
        a.b(n.f(Context.class));
        a.b(n.e(eb1.class));
        a.f(b.b());
        return Arrays.asList(new d[]{a.d(), oi1.a("fire-abt", "19.1.0")});
    }
}
