package io.github.inflationx.calligraphy3;

import android.view.View;
import io.github.inflationx.viewpump.c;
import io.github.inflationx.viewpump.d;

public class CalligraphyInterceptor implements d {
    private final Calligraphy calligraphy;

    public CalligraphyInterceptor(CalligraphyConfig calligraphyConfig) {
        this.calligraphy = new Calligraphy(calligraphyConfig);
    }

    public c intercept(d.a aVar) {
        c j = aVar.j(aVar.i());
        View onViewCreated = this.calligraphy.onViewCreated(j.e(), j.b(), j.a());
        c.a d = j.d();
        d.b(onViewCreated);
        return d.a();
    }
}
