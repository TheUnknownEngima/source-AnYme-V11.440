package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import java.util.List;

@Keep
public final class FirebaseCommonKtxRegistrar implements h {
    public List<d<?>> getComponents() {
        return e32.b(oi1.a("fire-core-ktx", "19.3.1"));
    }
}
