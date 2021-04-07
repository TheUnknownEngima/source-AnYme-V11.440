package com.google.firebase.crashlytics.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import java.util.List;

@Keep
public final class FirebaseCrashlyticsKtxRegistrar implements h {
    public List<d<?>> getComponents() {
        return e32.b(oi1.a("fire-cls-ktx", "17.2.1"));
    }
}
