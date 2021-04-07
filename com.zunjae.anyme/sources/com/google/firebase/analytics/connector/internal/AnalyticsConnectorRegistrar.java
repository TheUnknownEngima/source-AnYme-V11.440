package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.util.Arrays;
import java.util.List;

@Keep
public class AnalyticsConnectorRegistrar implements h {
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<d<?>> getComponents() {
        d.b<eb1> a = d.a(eb1.class);
        a.b(n.f(c.class));
        a.b(n.f(Context.class));
        a.b(n.f(rh1.class));
        a.f(a.a);
        a.e();
        return Arrays.asList(new d[]{a.d(), oi1.a("fire-analytics", "17.5.0")});
    }
}
