package com.google.firebase.crashlytics;

import com.google.firebase.components.e;
import com.google.firebase.components.g;

final /* synthetic */ class b implements g {
    private final CrashlyticsRegistrar a;

    private b(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.a = crashlyticsRegistrar;
    }

    public static g b(CrashlyticsRegistrar crashlyticsRegistrar) {
        return new b(crashlyticsRegistrar);
    }

    public Object a(e eVar) {
        return this.a.b(eVar);
    }
}
